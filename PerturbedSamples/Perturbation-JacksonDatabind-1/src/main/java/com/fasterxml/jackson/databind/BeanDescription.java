[REPLACE]^_type =  null;^44^^^^^42^45^[REPLACE] _type = type;^[METHOD] <init> [TYPE] JavaType) [PARAMETER] JavaType type [CLASS] BeanDescription   [TYPE]  JavaType _type  type  [TYPE]  boolean false  true 
[REPLACE]^public Class<?> getBeanClass (  )  { return _type.getRawClass (  ) ; }^57^^^^^^^[REPLACE] public JavaType getType (  )  { return _type; }^[METHOD] getType [TYPE] JavaType [PARAMETER] [CLASS] BeanDescription   [TYPE]  JavaType _type  type  [TYPE]  boolean false  true 
[REPLACE]^public JavaType getType (  )  { return _type; }^59^^^^^^^[REPLACE] public Class<?> getBeanClass (  )  { return _type.getRawClass (  ) ; }^[METHOD] getBeanClass [TYPE] Class [PARAMETER] [CLASS] BeanDescription   [TYPE]  JavaType _type  type  [TYPE]  boolean false  true 