# SelfAPR: Self-supervised Program Repair with Test Execution Diagnostics

```bibtex
@inproceedings{selfAPR2022,
 title = {SelfAPR: Self-supervised Program Repair with Test Execution Diagnostics},
 author = {Ye, He and Martinez, Matias and Luo, Xiapu and Zhang, Tao and Monperrus, Martin},
 year = {2022},
 booktitle = {37th IEEE/ACM International Conference on Automated Software Engineering},
 articleno = {92},
 numpages = {13},
 publisher = {Association for Computing Machinery},
 doi = {10.1145/3551349.3556926}
}
```


## Folder Structure
 ```bash
├── perturbation_model: the source code of java implemented perturbation model
│ 
├── Samples_BugLab: the generated perturbation-based samples with four BugLab repair actions
│ 
├── Samples_SelfAPR: the generated perturbation-based samples with 16 SelfAPR repair actions
│   
├── Dataset
│   ├── SelfAPR.csv.tar.gz : the dataset used to train SelfAPR model
│   ├── SelfAPR_ALL.csv.tar.gz : all generated training samples
│   ├── SelfAPR_FE.csv.tar.gz  : functional error training samples
│   ├── SelfAPR_CE.csv.tar.gz : compilation error training samples
│   ├── test.csv : the testing set from Defects4j bug dataset
│ 
├── result 
│   ├──defects4j-patches.txt : the correctly generated patches by SelfAPR trained model.
│   ├──patch_execution_result.csv : the execution results for patches generated for test set.
│   ├──valid_patches.csv : the patches classified as plausible or identical to the human-written patches.
└──  

```






## Prerequisites:
 ```
Install Defects4J from https://github.com/rjust/defects4j 
export PATH=$PATH:"path2defects4j"/framework/bin
 ```

 ```
JDK 1.8 for Defects4J
export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
 ```
 
For python, install the prerequisities with:

   pip3 install -r requirements.txt
 
## Building the Java code

##### Check the source code and build the package as below.

 ```
cd perturbation_model
mvn package assembly:single
```
Please check perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar under perturbation_model/target folder.
Simplely check it with the different options:
```
java -jar perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar path Options=SelfAPR|BugLab|test

With option SelfAPR: we perturb with all 16 rules in SelfAPR (Then the perturbation-based samples are executed).
With option BugLab: we perturb with all 16 rules in BugLab (No execution will be conducted).
With option test: we extract context information for testing samples.

```

##### We also uploaded a jar package on Zenodo. Download the jar file and execute it as below.
```
https://doi.org/10.5281/zenodo.6582348
java -jar ./perturbation_model/target/perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar Your/JAVA/FILE/PATH Options=SelfAPR|BugLab|test-'buggyLineNo'
```

### Run SimAPR experiment
```
python3 0_localize_fault.py Chart_1
python3 1_bug_representation.py Chart_1
python3 2_test.py Chart_1
python3 3_evaluate_patch.py Chart_1
```
`model_SelfAPR` is required by 2_test.py.
You can download the trained model from [here](https://zenodo.org/records/7030141).
Download `SelfAPR.tar.gz` and run
```
tar -xzvf SelfAPR.tar.gz
cp -r SelfAPR/model_SelfAPR ./model_SelfAPR
rm -r SelfAPR
```


##  Code perturbation scripts

#### Checkout the buggy projects, apply the human written patches on them and make sure NO failling tests. Start the perturbation with this script:
```
python3  1_perturb_projects.py
```
#### Iterate each file of the considered projects, generate perturbed project-specific trianings samples and execute them against test cases:
```
python3  2_execute_perturbation.py
```
#### Prepare a set of evaluation bugs from Defects4J:

```
python3 3_prepare_test_data.py
```

#### We are ready to train the perturbed samples with transformer:Pytorch==1.7.1 and transformers>=4.10.0
```
pip install transformers
pip install sentencepiece
python3 4_train.py
```

#### To test the trained model:
```
python3 5_test.py
```

#### To evaluat the test results:
```
python3 6_evaluate_patch.py
```

## Fault Localization with Gzoltar and Flacoco: faultlocalization 


#### We compute all the suspicous buggy lines with two fault localization with Gzoltar and Flacoco. At inference phase, for a given suspicious statement found by fault localization tools, SelfAPR represents it with a sequences of tokens. Those tokens are given to the trained SelfAPR model. SelfAPR is configured by the inference beam size n, it outputs  the n best patches for that suspicious statement.



## All perturbed rules generated by SelfAPR

|	Perturb Actions	| Explanation |
|	---	|---	|
|	P1 Replace type	|modify declaring type ... |
|	P2 Replace operator	| modify operator ==, !=, etc|
|	P3 replace literal	| modify literal, "STRING", true, false |
|	P4 replace constructor	| modify constructor |
|	P5 replace variable	| modify arguments/swap argumens |
|	P6 replace condition expression	| reduce/expand boolean expression|
|	P7 replace invocation	| modify invocation |
|	P8 compound statement	| compound of rules|
|	P9 replace with similarity	| replace by transplanting a similar donor statement|
|	P10 move statement	| move a later statement before the target statement |
|	P11 transplatant statement	| transplanting a donor statement |
|	P12 transplatant condition	|  wrap target statement with an existing conditional block|
|	P13 transplatant a block	| insert an existing block (if, loop, etc)|
|	P14 remove a statement	| delete statement |
|	P15 unwrap a statement	| unwrap block |
|	P16 remove a block	| remove block |









