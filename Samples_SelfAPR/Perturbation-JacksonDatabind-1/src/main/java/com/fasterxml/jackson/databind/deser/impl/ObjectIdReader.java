[P1_Replace_Type]^private static final  short  serialVersionUID = 1L;^14^^^^^9^19^private static final long serialVersionUID = 1L;^[CLASS] ObjectIdReader   [VARIABLES] 
[P8_Replace_Mix]^private static final  short  serialVersionUID = 1;^14^^^^^9^19^private static final long serialVersionUID = 1L;^[CLASS] ObjectIdReader   [VARIABLES] 
[P8_Replace_Mix]^private final JavaType idType;^16^^^^^11^21^public final JavaType idType;^[CLASS] ObjectIdReader   [VARIABLES] 
[P1_Replace_Type]^public final char propertyName;^18^^^^^13^23^public final String propertyName;^[CLASS] ObjectIdReader   [VARIABLES] 
[P8_Replace_Mix]^public  ObjectIdGenerator<?> generator;^25^^^^^20^30^public final ObjectIdGenerator<?> generator;^[CLASS] ObjectIdReader   [VARIABLES] 
[P8_Replace_Mix]^public  JsonDeserializer<Object> deserializer;^30^^^^^25^35^public final JsonDeserializer<Object> deserializer;^[CLASS] ObjectIdReader   [VARIABLES] 
[P8_Replace_Mix]^public  SettableBeanProperty idProperty;^32^^^^^27^37^public final SettableBeanProperty idProperty;^[CLASS] ObjectIdReader   [VARIABLES] 
[P5_Replace_Variable]^idType = idType;^44^^^^^41^49^idType = t;^[CLASS] ObjectIdReader  [METHOD] <init> [RETURN_TYPE] SettableBeanProperty)   JavaType t String propName ObjectIdGenerator<?> gen JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P8_Replace_Mix]^idType =  null;^44^^^^^41^49^idType = t;^[CLASS] ObjectIdReader  [METHOD] <init> [RETURN_TYPE] SettableBeanProperty)   JavaType t String propName ObjectIdGenerator<?> gen JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^propertyName = propertyName;^45^^^^^41^49^propertyName = propName;^[CLASS] ObjectIdReader  [METHOD] <init> [RETURN_TYPE] SettableBeanProperty)   JavaType t String propName ObjectIdGenerator<?> gen JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P8_Replace_Mix]^propertyName =  null;^45^^^^^41^49^propertyName = propName;^[CLASS] ObjectIdReader  [METHOD] <init> [RETURN_TYPE] SettableBeanProperty)   JavaType t String propName ObjectIdGenerator<?> gen JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P8_Replace_Mix]^generator =  null;^46^^^^^41^49^generator = gen;^[CLASS] ObjectIdReader  [METHOD] <init> [RETURN_TYPE] SettableBeanProperty)   JavaType t String propName ObjectIdGenerator<?> gen JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P8_Replace_Mix]^deserializer =   ( JsonDeserializer<Object> )  deser;^47^^^^^41^49^deserializer =  ( JsonDeserializer<Object> )  deser;^[CLASS] ObjectIdReader  [METHOD] <init> [RETURN_TYPE] SettableBeanProperty)   JavaType t String propName ObjectIdGenerator<?> gen JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^idProperty = idProperty;^48^^^^^41^49^idProperty = idProp;^[CLASS] ObjectIdReader  [METHOD] <init> [RETURN_TYPE] SettableBeanProperty)   JavaType t String propName ObjectIdGenerator<?> gen JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P8_Replace_Mix]^idProperty =  null;^48^^^^^41^49^idProperty = idProp;^[CLASS] ObjectIdReader  [METHOD] <init> [RETURN_TYPE] SettableBeanProperty)   JavaType t String propName ObjectIdGenerator<?> gen JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P4_Replace_Constructor]^return new ObjectIdReader (  propName, generator, deser, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P4_Replace_Constructor]^return new ObjectIdReader ( idType,  generator, deser, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P4_Replace_Constructor]^return new ObjectIdReader ( idType, propName,  deser, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P4_Replace_Constructor]^return new ObjectIdReader ( idType, propName, generator,  idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P4_Replace_Constructor]^return new ObjectIdReader ( idType, propName, generator, deser ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( t, propName, generator, deser, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( idType, propertyName, generator, deser, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( idType, propName, generator, 0, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( idType, propName, generator, deser, idProperty ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( deser, propName, generator, idType, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( idType, deser, generator, propName, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( generator, propName, idType, deser, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( idType, propName, deser, generator, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( idProp, propName, generator, deser, idType ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( idType, generator, propName, deser, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( idType, propName, generator, idProp, deser ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[P5_Replace_Variable]^return new ObjectIdReader ( idType, idProp, generator, deser, propName ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  