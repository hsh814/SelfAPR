#!/usr/bin/env python3
import numpy as np
import pandas as pd
import torch,sys
import torch.nn.functional as F
from torch.utils.data import Dataset, DataLoader, RandomSampler, SequentialSampler
import warnings
from torch import cuda
from transformers import T5Tokenizer, T5ForConditionalGeneration
import loader
import torch.autograd as autograd
import csv
import os, gc
import sys, subprocess,fnmatch, shutil, csv,re, datetime, time



def getBugName(bugid):
    print(bugid)
    bugid=str(bugid).replace(' ','')
    buginfo=''
    startNo=''
    removeNo=''
    filepath=''
    with open(TEST_PATH) as testfile:
        lines = testfile.readlines()
        for l in lines:
            bid=l.split('\t')[0]
            bid=bid.replace(' ','')
            if bid == bugid:
                buginfo=l.split('\t')[3]
                buginfo=buginfo.replace('\n','').replace('\t','').replace('\r','')
                startNo=l.split('\t')[4]
                removeNo=l.split('\t')[5]
                infos = l.split('\t')
                if len(infos) > 6:
                    filepath=l.split('\t')[6]
                    filepath=filepath.replace('\n','').replace('\t','').replace('\r','')
                else:
                    filepath=''
                break
    
    
    return buginfo,startNo,removeNo,filepath

        
def test(model, tokenizer, device, loader, model_iter):
    
    return_sequences = 50
    model.eval()
    identicalset=[]
    
    with torch.no_grad():
        for _,data in enumerate(loader, 0):
            if _>-1:
                gc.collect()
                torch.cuda.empty_cache()
                y = data['target_ids'].to(device, dtype = torch.long)
                ids = data['source_ids'].to(device, dtype = torch.long)
                mask = data['source_mask'].to(device, dtype = torch.long)
                bugid = data['bugid'].to(device, dtype = torch.long)
                print("====bugid===",bugid.item())
                local_start_time = time.time()


                generated_ids = model.generate(
                input_ids = ids,
                attention_mask = mask, 
                max_length=64, 
                num_beams=return_sequences,
                repetition_penalty=3.0,
#                 length_penalty=0.5, 
                early_stopping = False,
                num_return_sequences=return_sequences,
                num_beam_groups = 1
                )
                
                filter = set()


                preds = [tokenizer.decode(g, skip_special_tokens=True, clean_up_tokenization_spaces=True) for g in generated_ids]
                target = [tokenizer.decode(t, skip_special_tokens=True, clean_up_tokenization_spaces=True)for t in y]
                target = target[0]
                
                bugname,startNo,removeNo,filepath  = getBugName(bugid.item())
                with open(LOG_FILE, "a") as f:
                    f.write(f"[patch] [bug {bugname}] [line {startNo}] [file {filepath}] [time {time.time() - local_start_time}] [total {time.time() - START_TIME}] [model {model_iter}]\n")

                with open(f'{SAVE_DIR}/raw_results.csv', 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter='\t',escapechar=' ',quoting=csv.QUOTE_NONE)
                   
                    for i in range(0,return_sequences):
                        patch = preds[i]
                        if patch in filter:
                            continue
                        filter.add(patch)
                        filewriter.writerow([bugname, patch])


def getGeneratorDataLoader(filepatch,tokenizer,batchsize):
    df = pd.read_csv(filepatch,encoding='latin-1',delimiter='\t')
    print(df.head(1))
    with open(filepatch, 'r') as f:
        for line in f.readlines():
            tokens = line.split('\t')
            if len(tokens) != 7:
                print(f'Error(len {len(tokens)}): ', tokens)
    
    df = df[['bugid','patch','buggy']]

    params = {
        'batch_size': batchsize,
        'shuffle': False,
        'num_workers': 0
        }

    # dataset=df.sample(frac=1.0, random_state = SEED).reset_index(drop=True)
    target_set = loader.GeneratorDataset(df, tokenizer, MAX_LEN, PATCH_LEN)
    target_loader = DataLoader(target_set, **params)
    return target_loader


def run_test(bug_id: str):
      
    for i in range(0,10):
        gen = T5ForConditionalGeneration.from_pretrained('./model_SelfAPR/SelfAPR'+str(i+1),output_hidden_states=True)       
        gen_tokenizer = T5Tokenizer.from_pretrained('./model_SelfAPR/SelfAPR'+str(i+1),truncation=True)
        gen_tokenizer.add_tokens(['[PATCH]','[BUG]','{', '}','<','^','<=','>=','==','!=','<<','>>','[CE]','[FE]','[CONTEXT]','[BUGGY]','[CLASS]','[METHOD]','[RETURN_TYPE]','[VARIABLES]','[Delete]'])   
        gen = gen.to(device)       
        test_loader=getGeneratorDataLoader(TEST_PATH,gen_tokenizer,1)
        test(gen, gen_tokenizer, device, test_loader, i)
          
        
if __name__ == '__main__':
    warnings.filterwarnings('ignore')
    SEED=42
    LEARNING_RATE = 1e-4
    VALID_BATCH_SIZE = 1
    MAX_LEN = 384
    PATCH_LEN = 76 
    device = 'cuda' if cuda.is_available() else 'cpu'
    BUG_ID = sys.argv[1]
    proj, bid = BUG_ID.split('_')
    
    TEST_PATH = os.path.join('repair_iteration', f"{proj}{bid}", "bugs.csv")
    SAVE_DIR = os.path.join('d4j', BUG_ID)
    os.system('rm -rf ' + SAVE_DIR)
    os.makedirs(SAVE_DIR, exist_ok=True)
    LOG_FILE = os.path.join(SAVE_DIR, 'log.txt')
    START_TIME = time.time()
    run_test(BUG_ID)
    END_TIME = time.time()
    with open(LOG_FILE, 'a') as f:
        f.write(f"[total] [time {END_TIME - START_TIME}]\n")


