#!/usr/bin/python3
import sys, os, time, subprocess,fnmatch, shutil, csv,re, datetime
import javalang
import javalang.tree
from typing import Tuple, List, Dict, Set
global_id_to_fl = dict()
global_files = dict()

def syntax_check(java: str) -> bool:
    try:
        tokens = javalang.tokenizer.tokenize(java)
        parser = javalang.parser.Parser(tokens)
        parser.parse()
    except:
        return False
    return True

def get_end_line(node: javalang.tree.Node, lineid: int) -> int:
    line = lineid
    # print(type(node))
    if node is None or isinstance(node, str) or isinstance(node, bool):
        return line
    if isinstance(node, list) or isinstance(node, set):
        for n in node:
            line = get_end_line(n, line)
        return line   
    if hasattr(node, 'position'):
        if node.position is not None:
            if node.position.line > line:
                line = node.position.line
    if hasattr(node, 'children') and node.children is not None:
        for n in node.children:
            line = get_end_line(n, line)
    return line


def get_method_range(target: str, lineid: int) -> dict:
    method_range = dict()
    found_method = False
    tokens = javalang.tokenizer.tokenize(target)
    parser = javalang.parser.Parser(tokens)
    tree = parser.parse()
    for path, node in tree.filter(javalang.tree.MethodDeclaration):
        if node.position is None:
            continue
        start_line = node.position.line
        end_line = get_end_line(node, start_line)
        if (start_line <= lineid + 1) and (end_line >= lineid + 1):
            print("found it!")
            print(f"{node.name} - {start_line}, {end_line}")
            method_range = { "function": node.name, "begin": start_line, "end": end_line }
            found_method = True
            break
    if found_method:
        return method_range
    for path, node in tree.filter(javalang.tree.ConstructorDeclaration):
        if node.position is None:
            continue
        start_line = node.position.line
        end_line = get_end_line(node, start_line)
        if (start_line <= lineid + 1) and (end_line >= lineid + 1):
            print("found it!")
            print(f"{node.name} - {start_line}, {end_line}")
            method_range = { "function": node.name, "begin": start_line, "end": end_line }
            found_method = True
            break
    if found_method:
        return method_range
    return { "function": "0no_function_found", "begin": lineid, "end": lineid }


def executePatch(projectId,bugId,startNo,removedNo,fpath,predit,repodir):
    # first checkout buggy project
    os.system(f'defects4j checkout -p {projectId} -v {bugId}b -w {PATCH_DIR}')
    # keep a copy of the buggy file
    originFile = os.path.join(PATCH_DIR, fpath)
    filename = originFile.split('/')[-1]

    os.system(f"cp {originFile} {repodir}")
    newStr=''
    endNo=int(startNo)+int(removedNo)
    with open(originFile,'r') as of:
        lines=of.readlines()
        for i in range(0,len(lines)):
            l=lines[i]
            if i+1 < int(startNo):
                newStr+=l 
            if i+1 == int(startNo):
                newStr+=predit+'\n'
            if i+1 >= endNo:
                newStr+=l
    with open(originFile,'w') as wof:
        wof.write(newStr)

    exeresult = execute(projectId+bugId,repodir,originFile,repodir+'/'+projectId+bugId)
        
    os.system("mv "+repodir+"/"+filename +"  "+originFile)

    return exeresult


def execute(patchId,repodir,originFile,rootdir):
    compile_error_flag = True

    program_path=repodir+'/'+patchId
    print('****************'+program_path+'******************')
    #get compile result
    cmd = "cd " + program_path + ";"
    cmd += "timeout 90 defects4j compile"
    exectresult='[timeout]'
    symbolVaraible=''
    result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
    print(result)
    
    # evaluate compilable
    if 'Running ant (compile)' in str(result):
        result = str(result).split("Running ant (compile)")[1]
        result=result.split('\n')
        for i in range(0,len(result)):
            if 'error: ' in result[i]:
                firstError=result[i].split('error: ')[1]
                exectresult=firstError.split('[javac]')[0]
                if '\\' in exectresult:
                    exectresult=exectresult.split('\\')[0]
                print('=======First Error========='+firstError)
                # 'cannot  find  symbol      
                if 'symbol' in firstError and 'cannot' in firstError and 'find' in firstError:       
                    if '[javac]' in firstError:
                        lines = firstError.split('[javac]')
                        for l in lines:
                            if 'symbol:'in l and 'variable' in l:
                                symbolVaraible=l.split('variable')[1]
                                if '\\' in symbolVaraible:
                                    symbolVaraible=symbolVaraible.split('\\')[0]
                                break

                exectresult='[CE] '+exectresult+symbolVaraible
                break
            elif 'OK' in result[i]:               
                exectresult='OK'
                compile_error_flag=False

    # evaluate plausible
    if not compile_error_flag:
        #get test result
        cmd = "cd " + program_path + ";"
        cmd += "timeout 120 defects4j test"
        result=''
        result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
        print(result)
        if 'Failing tests: 0' in str(result):
            exectresult='[Plausible]'
        elif 'Failing tests' in str(result):
            result=str(result).split('Failing tests:')[1]
            result=str(result).split('-')
            for i in range(1,len(result)):
                failingtest = result[i]
                if '::' not in failingtest and i+1<len(result):
                    failingtest = result[i+1]
                if '\\' in failingtest:
                    failingtest = failingtest.split('\\')[0]
                failingtest=failingtest.strip()

                if '::' in failingtest:
                    failingTestMethod=failingtest.split('::')[1]
                    faildiag = getFailingTestDiagnostic(failingtest,program_path)
                    exectresult = '[FE] ' + faildiag +' '+failingTestMethod
                else:
                    exectresult = '[FE] '
                break
   
    os.chdir(rootdir)

    return exectresult


def getFailingTestDiagnostic(failingtest,program_path):
    testclass = failingtest.split("::")[0]

    cmd = "cd " + program_path + ";"
    cmd += "timeout 120 defects4j monitor.test -t "+failingtest
    result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
    print('====result===='+str(result))
    if 'failed!' in str(result) :
        result = str(result).split('failed!')[1]
        if testclass in str(result):
            result = str(result).split(testclass)[1]
            if '):' in str(result):
                result = str(result).split('):')[1]
                if '\\' in str(result):
                    result = str(result).split('\\')[0]
    else:
        result =''

    return str(result)

def read_fl(file) -> Tuple[dict, dict]:
    id_to_fl = dict()
    files = dict()
    with open(file, 'r') as f:
        lines = f.readlines()
        for line in lines:
            tokens = line.strip().split("\t")
            bid = tokens[0]
            rank = tokens[1]
            file = tokens[2]
            line = tokens[3]
            fl_score = tokens[4]
            id = tokens[5]
            if file not in files:
                with open(os.path.join(PATCH_DIR, file), 'r', encoding='latin-1', errors='ignore') as f:
                    files[file] = f.readlines()
            func = get_method_range(files[file], int(line))
            id_to_fl[id] = (bid, int(rank), file, int(line), float(fl_score), func)
                    
    return id_to_fl, files

if __name__ == '__main__':

    repodir = '/root/SelfAPR'
    BUG_ID = sys.argv[1]
    patchFromPath = f'd4j/{BUG_ID}/raw_results.csv'
    patchToPath = f'd4j/{BUG_ID}/results.csv'
    PATCH_DIR = os.path.join("patch", BUG_ID)
    D4J_DIR = os.path.join("d4j", BUG_ID)
    os.makedirs("patch", exist_ok=True)
    
    global_id_to_fl, global_files = read_fl(os.path.join(D4J_DIR, "fl.csv"))

    with open(patchFromPath,'r') as patchFile:
        patches = patchFile.readlines()
        # len(patches)
        for i in range(1):
            try:
                print(i)
                patch=patches[i]
                print(patch)
                pid=patch.split('\t')[0]
                projectId =pid.split('_')[0]
                bugId =pid.split('_')[1]
                startNo=patch.split('\t')[1]
                removedNo=patch.split('\t')[2]
                path=patch.split('\t')[3]
                predit = patch.split('\t')[4]
                groundtruth = patch.split('\t')[5]

                print(patch)
                print(projectId)
                print(bugId)

                preditNoSpace = predit.replace(' ','').replace('\n','').replace('\r','').replace('[Delete]','')
                groundtruthNoSpace = groundtruth.replace(' ','').replace('\n','').replace('\r','').replace('[PATCH]','').replace('[Delete]','')
                if groundtruthNoSpace in 'nan':
                    groundtruthNoSpace=''
                # if preditNoSpace in groundtruthNoSpace and groundtruthNoSpace in preditNoSpace:
                #     with open(patchToPath,'a') as targetFile:
                #         targetFile.write('Identical\t'+str(i)+'\t'+patch)
                # else:
                exeresult = executePatch(projectId,bugId,startNo,removedNo,path,predit,repodir)
                with open(patchToPath,'a') as targetFile:
                    targetFile.write(exeresult+'\t'+str(i)+'\t'+patch)
            except (IndexError, RuntimeError, TypeError, NameError,FileNotFoundError):
                print(RuntimeError)
                




