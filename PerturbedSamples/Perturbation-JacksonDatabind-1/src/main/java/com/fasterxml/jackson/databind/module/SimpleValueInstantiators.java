[REPLACE]^private static final long serialVersionUID  = null ;^15^^^^^^^[REPLACE] private static final long serialVersionUID = -8929386427526115130L;^ [CLASS] SimpleValueInstantiators  
[REPLACE]^_classMappings ;^31^^^^^29^32^[REPLACE] _classMappings = new HashMap<ClassKey,ValueInstantiator> (  ) ;^[METHOD] <init> [TYPE] SimpleValueInstantiators() [PARAMETER] [CLASS] SimpleValueInstantiators   [TYPE]  HashMap _classMappings  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^_classMappings .get ( null )  ;^37^^^^^34^39^[REPLACE] _classMappings.put ( new ClassKey ( forType ) , inst ) ;^[METHOD] addValueInstantiator [TYPE] SimpleValueInstantiators [PARAMETER] Class<?> forType ValueInstantiator inst [CLASS] SimpleValueInstantiators   [TYPE]  Class forType  [TYPE]  boolean false  true  [TYPE]  HashMap _classMappings  [TYPE]  long serialVersionUID  [TYPE]  ValueInstantiator inst 
[REMOVE]^ValueInstantiator inst = _classMappings.get ( new ClassKey ( beanDesc.getBeanClass (  )  )  ) ;^37^^^^^34^39^[REMOVE] ^[METHOD] addValueInstantiator [TYPE] SimpleValueInstantiators [PARAMETER] Class<?> forType ValueInstantiator inst [CLASS] SimpleValueInstantiators   [TYPE]  Class forType  [TYPE]  boolean false  true  [TYPE]  HashMap _classMappings  [TYPE]  long serialVersionUID  [TYPE]  ValueInstantiator inst 
[REPLACE]^return null;^38^^^^^34^39^[REPLACE] return this;^[METHOD] addValueInstantiator [TYPE] SimpleValueInstantiators [PARAMETER] Class<?> forType ValueInstantiator inst [CLASS] SimpleValueInstantiators   [TYPE]  Class forType  [TYPE]  boolean false  true  [TYPE]  HashMap _classMappings  [TYPE]  long serialVersionUID  [TYPE]  ValueInstantiator inst 
[REPLACE]^return   defaultInstantiator ;^46^^^^^42^47^[REPLACE] return  ( inst == null )  ? defaultInstantiator : inst;^[METHOD] findValueInstantiator [TYPE] ValueInstantiator [PARAMETER] DeserializationConfig config BeanDescription beanDesc ValueInstantiator defaultInstantiator [CLASS] SimpleValueInstantiators   [TYPE]  DeserializationConfig config  [TYPE]  boolean false  true  [TYPE]  HashMap _classMappings  [TYPE]  long serialVersionUID  [TYPE]  ValueInstantiator defaultInstantiator  inst  [TYPE]  BeanDescription beanDesc 