[REPLACE]^public final static JavaTypeDeserializer instance  = null ;^70^^^^^^^[REPLACE] public final static JavaTypeDeserializer instance = new JavaTypeDeserializer (  ) ;^ [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer  
[REPLACE]^public final static JsonLocationInstantiator instance ;^102^^^^^^^[REPLACE] public final static JsonLocationInstantiator instance = new JsonLocationInstantiator (  ) ;^ [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer  
[REPLACE]^public final static TokenBufferDeserializer instance ;^155^^^^^^^[REPLACE] public final static TokenBufferDeserializer instance = new TokenBufferDeserializer (  ) ;^ [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer  
[REPLACE]^if  ( JavaType.class.isAssignableFrom ( rawType )  )  { return JavaTypeDeserializer.instance;^72^^^^^^^[REPLACE] public JavaTypeDeserializer (  )  { super ( JavaType.class ) ; }^[METHOD] <init> [TYPE] JacksonDeserializers$JavaTypeDeserializer() [PARAMETER] [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^public JavaTypeDeserializer (  )  { super ( JavaType.class ) ; }^157^^^^^^^[REPLACE] public TokenBufferDeserializer (  )  { super ( TokenBuffer.class ) ; }^[METHOD] <init> [TYPE] JacksonDeserializers$TokenBufferDeserializer() [PARAMETER] [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^return TokenBufferDeserializer.instance;^32^^^^^29^36^[REPLACE] return  new StdDeserializer[] {^[METHOD] all [TYPE] StdDeserializer[] [PARAMETER] [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^if  ( rawType  !=  TokenBuffer.class )  {^40^^^^^38^47^[REPLACE] if  ( rawType == TokenBuffer.class )  {^[METHOD] find [TYPE] JsonDeserializer [PARAMETER] Class<?> rawType [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  Class rawType  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[ADD]^^40^41^42^^^38^47^[ADD] if  ( rawType == TokenBuffer.class )  { return TokenBufferDeserializer.instance; }^[METHOD] find [TYPE] JsonDeserializer [PARAMETER] Class<?> rawType [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  Class rawType  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^return JsonLocationInstantiator.instance;^41^^^^^38^47^[REPLACE] return TokenBufferDeserializer.instance;^[METHOD] find [TYPE] JsonDeserializer [PARAMETER] Class<?> rawType [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  Class rawType  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^if  ( JavaType.class.isAssignableFrom ( true )  )  {^43^^^^^38^47^[REPLACE] if  ( JavaType.class.isAssignableFrom ( rawType )  )  {^[METHOD] find [TYPE] JsonDeserializer [PARAMETER] Class<?> rawType [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  Class rawType  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REMOVE]^if  ( curr ==  ( VALUE_EMBEDDED_OBJECT )  )  {     return  (  ( JavaType )   ( jp.getEmbeddedObject (  )  )  ) ; }^43^^^^^38^47^[REMOVE] ^[METHOD] find [TYPE] JsonDeserializer [PARAMETER] Class<?> rawType [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  Class rawType  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^return TokenBufferDeserializer.instance;^44^^^^^38^47^[REPLACE] return JavaTypeDeserializer.instance;^[METHOD] find [TYPE] JsonDeserializer [PARAMETER] Class<?> rawType [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  Class rawType  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^return true;^46^^^^^38^47^[REPLACE] return null;^[METHOD] find [TYPE] JsonDeserializer [PARAMETER] Class<?> rawType [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  Class rawType  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^if  ( beanDesc.getBeanClass (  )   !=  JsonLocation.class )  {^52^^^^^49^56^[REPLACE] if  ( beanDesc.getBeanClass (  )  == JsonLocation.class )  {^[METHOD] findValueInstantiator [TYPE] ValueInstantiator [PARAMETER] DeserializationConfig config BeanDescription beanDesc [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  DeserializationConfig config  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance  [TYPE]  BeanDescription beanDesc 
[ADD]^return JsonLocationInstantiator.instance;^52^53^54^^^49^56^[ADD] if  ( beanDesc.getBeanClass (  )  == JsonLocation.class )  { return JsonLocationInstantiator.instance; }^[METHOD] findValueInstantiator [TYPE] ValueInstantiator [PARAMETER] DeserializationConfig config BeanDescription beanDesc [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  DeserializationConfig config  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance  [TYPE]  BeanDescription beanDesc 
[REPLACE]^return TokenBufferDeserializer.instance;^53^^^^^49^56^[REPLACE] return JsonLocationInstantiator.instance;^[METHOD] findValueInstantiator [TYPE] ValueInstantiator [PARAMETER] DeserializationConfig config BeanDescription beanDesc [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  DeserializationConfig config  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance  [TYPE]  BeanDescription beanDesc 
[REPLACE]^return this;^55^^^^^49^56^[REPLACE] return null;^[METHOD] findValueInstantiator [TYPE] ValueInstantiator [PARAMETER] DeserializationConfig config BeanDescription beanDesc [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  DeserializationConfig config  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance  [TYPE]  BeanDescription beanDesc 
[REPLACE]^JsonToken curr = jp .getCodec (  )  ;^78^^^^^75^92^[REPLACE] JsonToken curr = jp.getCurrentToken (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^if  ( curr  ||  JsonToken.VALUE_STRING )  {^80^^^^^75^92^[REPLACE] if  ( curr == JsonToken.VALUE_STRING )  {^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[ADD]^^80^81^82^83^84^75^92^[ADD] if  ( curr == JsonToken.VALUE_STRING )  { String str = jp.getText (  ) .trim (  ) ; if  ( str.length (  )  == 0 )  { return getEmptyValue (  ) ; }^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^if  ( str.length (  )  - 3 == 0 )  {^82^^^^^75^92^[REPLACE] if  ( str.length (  )  == 0 )  {^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^return tb;^83^^^^^75^92^[REPLACE] return getEmptyValue (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^return ctxt .mappingException (  )  .constructFromCanonical ( str ) ;^85^^^^^75^92^[REPLACE] return ctxt.getTypeFactory (  ) .constructFromCanonical ( str ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^String str = jp.getText (  )  .constructFromCanonical ( str )  ;^81^^^^^75^92^[REPLACE] String str = jp.getText (  ) .trim (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^if  ( str.length (  )  *  0.5  == 0 )  {^82^^^^^75^92^[REPLACE] if  ( str.length (  )  == 0 )  {^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[ADD]^^82^83^84^^^75^92^[ADD] if  ( str.length (  )  == 0 )  { return getEmptyValue (  ) ; }^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^return ctxt.mappingException (  ) .constructFromCanonical ( str ) ;^85^^^^^75^92^[REPLACE] return ctxt.getTypeFactory (  ) .constructFromCanonical ( str ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^String str = jp.getCodec (  ) .trim (  ) ;^81^^^^^75^92^[REPLACE] String str = jp.getText (  ) .trim (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^if  ( curr  ||  JsonToken.VALUE_EMBEDDED_OBJECT )  {^88^^^^^75^92^[REPLACE] if  ( curr == JsonToken.VALUE_EMBEDDED_OBJECT )  {^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^return  ( JavaType )  jp.getCodec (  ) ;^89^^^^^75^92^[REPLACE] return  ( JavaType )  jp.getEmbeddedObject (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^return  ( JavaType )  jp .getCodec (  )  ;^89^^^^^75^92^[REPLACE] return  ( JavaType )  jp.getEmbeddedObject (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^return ;^91^^^^^75^92^[REPLACE] throw ctxt.mappingException  (" ")  ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^throw ctxt .getTypeFactory (  )   ;^91^^^^^75^92^[REPLACE] throw ctxt.mappingException  (" ")  ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^return JsonLocation.class .isAssignableFrom ( this )  ;^106^^^^^105^107^[REPLACE] return JsonLocation.class.getName (  ) ;^[METHOD] getValueTypeDesc [TYPE] String [PARAMETER] [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^public boolean canCreateFromObjectWith (  )  { return false; }^110^^^^^^^[REPLACE] public boolean canCreateFromObjectWith (  )  { return true; }^[METHOD] canCreateFromObjectWith [TYPE] boolean [PARAMETER] [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^JavaType longType = config.constructType ( Long.TYPE ) ;^114^^^^^113^123^[REPLACE] JavaType intType = config.constructType ( Integer.TYPE ) ;^[METHOD] getFromObjectArguments [TYPE] CreatorProperty[] [PARAMETER] DeserializationConfig config [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  DeserializationConfig config  [TYPE]  JavaType intType  longType  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^JavaType intType = config.constructType ( Integer.TYPE ) ;^115^^^^^113^123^[REPLACE] JavaType longType = config.constructType ( Long.TYPE ) ;^[METHOD] getFromObjectArguments [TYPE] CreatorProperty[] [PARAMETER] DeserializationConfig config [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  DeserializationConfig config  [TYPE]  JavaType intType  longType  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[ADD]^^115^^^^^113^123^[ADD] JavaType longType = config.constructType ( Long.TYPE ) ;^[METHOD] getFromObjectArguments [TYPE] CreatorProperty[] [PARAMETER] DeserializationConfig config [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  DeserializationConfig config  [TYPE]  JavaType intType  longType  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^return new CreatorProperty ( name, type, null, null, null, null, index, null, true ) ;^116^^^^^113^123^[REPLACE] return  new CreatorProperty[] {^[METHOD] getFromObjectArguments [TYPE] CreatorProperty[] [PARAMETER] DeserializationConfig config [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  DeserializationConfig config  [TYPE]  JavaType intType  longType  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^return new CreatorProperty ( name, type, true, true, true, true, index, true, true ) ;^126^127^^^^125^128^[REPLACE] return new CreatorProperty ( name, type, null, null, null, null, index, null, true ) ;^[METHOD] creatorProp [TYPE] CreatorProperty [PARAMETER] String name JavaType type int index [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  JavaType type  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String name  [TYPE]  JsonLocationInstantiator instance  [TYPE]  int index 
[REPLACE]^return new JsonLocation ( args[4], _long ( args[1] ) , _long ( args[2] ) , _int ( args[3] ) , _int ( args[4] )  ) ;^132^133^^^^131^134^[REPLACE] return new JsonLocation ( args[0], _long ( args[1] ) , _long ( args[2] ) , _int ( args[3] ) , _int ( args[4] )  ) ;^[METHOD] createFromObjectWith [TYPE] Object [PARAMETER] DeserializationContext ctxt Object[] args [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance  [TYPE]  Object[] args 
[REPLACE]^return   0L ;^137^^^^^136^138^[REPLACE] return  ( o == null )  ? 0L :  (  ( Number )  o ) .longValue (  ) ;^[METHOD] _long [TYPE] long [PARAMETER] Object o [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  Object o  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^return  ( o == null )  ? 0L :  (  ( Number )  o ) .longValue (  ) ;^140^^^^^139^141^[REPLACE] return  ( o == null )  ? 0 :  (  ( Number )  o ) .intValue (  ) ;^[METHOD] _int [TYPE] int [PARAMETER] Object o [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  Object o  [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^TokenBuffer tb = new TokenBuffer ( jp .getCurrentToken (  )   ) ;^163^^^^^160^167^[REPLACE] TokenBuffer tb = new TokenBuffer ( jp.getCodec (  )  ) ;^[METHOD] deserialize [TYPE] TokenBuffer [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  TokenBuffer tb  [TYPE]  DeserializationContext ctxt  [TYPE]  JavaTypeDeserializer instance  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[ADD]^^163^^^^^160^167^[ADD] TokenBuffer tb = new TokenBuffer ( jp.getCodec (  )  ) ;^[METHOD] deserialize [TYPE] TokenBuffer [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  TokenBuffer tb  [TYPE]  DeserializationContext ctxt  [TYPE]  JavaTypeDeserializer instance  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^JavaType intType = config.constructType ( Integer.TYPE ) ;^165^^^^^160^167^[REPLACE] tb.copyCurrentStructure ( jp ) ;^[METHOD] deserialize [TYPE] TokenBuffer [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  TokenBuffer tb  [TYPE]  DeserializationContext ctxt  [TYPE]  JavaTypeDeserializer instance  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^return null;^166^^^^^160^167^[REPLACE] return tb;^[METHOD] deserialize [TYPE] TokenBuffer [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JacksonDeserializers JavaTypeDeserializer JsonLocationInstantiator TokenBufferDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  TokenBuffer tb  [TYPE]  DeserializationContext ctxt  [TYPE]  JavaTypeDeserializer instance  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^public  static JavaTypeDeserializer instance = new JavaTypeDeserializer (  ) ;^70^^^^^^^[REPLACE] public final static JavaTypeDeserializer instance = new JavaTypeDeserializer (  ) ;^[METHOD] deserialize [TYPE] TokenBuffer [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  TokenBuffer tb  [TYPE]  DeserializationContext ctxt  [TYPE]  JavaTypeDeserializer instance  [TYPE]  JsonLocationInstantiator instance  [TYPE]  JsonParser jp 
[REPLACE]^String str = jp.getText (  ) .trim (  ) ;^72^^^^^^^[REPLACE] public JavaTypeDeserializer (  )  { super ( JavaType.class ) ; }^[METHOD] <init> [TYPE] JacksonDeserializers$JavaTypeDeserializer() [PARAMETER] [CLASS] JavaTypeDeserializer   [TYPE]  JavaTypeDeserializer instance  [TYPE]  boolean false  true 
[REPLACE]^JsonToken curr = jp .getText (  )  ;^78^^^^^75^92^[REPLACE] JsonToken curr = jp.getCurrentToken (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^if  ( curr  ||  JsonToken.VALUE_STRING )  {^80^^^^^75^92^[REPLACE] if  ( curr == JsonToken.VALUE_STRING )  {^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^if  ( str.size (  )  == 0  )  {^82^^^^^75^92^[REPLACE] if  ( str.length (  )  == 0 )  {^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^return ctxt.getTypeFactory (  ) .constructFromCanonical ( str ) ;^83^^^^^75^92^[REPLACE] return getEmptyValue (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^return ctxt.mappingException (  ) .constructFromCanonical ( str ) ;^85^^^^^75^92^[REPLACE] return ctxt.getTypeFactory (  ) .constructFromCanonical ( str ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^String str = jp.getCurrentToken (  ) .trim (  ) ;^81^^^^^75^92^[REPLACE] String str = jp.getText (  ) .trim (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^if  ( str.length (  )  *  2 == 0  )  {^82^^^^^75^92^[REPLACE] if  ( str.length (  )  == 0 )  {^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^return ctxt.getTypeFactory (  )  .trim (  )  ;^85^^^^^75^92^[REPLACE] return ctxt.getTypeFactory (  ) .constructFromCanonical ( str ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[ADD]^^81^^^^^75^92^[ADD] String str = jp.getText (  ) .trim (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^if  ( curr  !=  JsonToken.VALUE_EMBEDDED_OBJECT )  {^88^^^^^75^92^[REPLACE] if  ( curr == JsonToken.VALUE_EMBEDDED_OBJECT )  {^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[ADD]^return  ( JavaType )  jp.getEmbeddedObject (  ) ;^88^89^90^^^75^92^[ADD] if  ( curr == JsonToken.VALUE_EMBEDDED_OBJECT )  { return  ( JavaType )  jp.getEmbeddedObject (  ) ; }^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^return  ( JavaType )  jp .getCurrentToken (  )  ;^89^^^^^75^92^[REPLACE] return  ( JavaType )  jp.getEmbeddedObject (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^return  ( JavaType )  jp.getCurrentToken (  ) ;^89^^^^^75^92^[REPLACE] return  ( JavaType )  jp.getEmbeddedObject (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^return ;^91^^^^^75^92^[REPLACE] throw ctxt.mappingException  (" ")  ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^throw ctxt .getTypeFactory (  )   ;^91^^^^^75^92^[REPLACE] throw ctxt.mappingException  (" ")  ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JavaTypeDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^public final  JsonLocationInstantiator instance = new JsonLocationInstantiator (  ) ;^102^^^^^^^[REPLACE] public final static JsonLocationInstantiator instance = new JsonLocationInstantiator (  ) ;^[METHOD] deserialize [TYPE] JavaType [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] JsonLocationInstantiator   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken curr  [TYPE]  JavaTypeDeserializer instance  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  JsonParser jp 
[REPLACE]^return  ( o == null )  ? 0 :  (  ( Number )  o ) .intValue (  ) ;^106^^^^^105^107^[REPLACE] return JsonLocation.class.getName (  ) ;^[METHOD] getValueTypeDesc [TYPE] String [PARAMETER] [CLASS] JsonLocationInstantiator   [TYPE]  JsonLocationInstantiator instance  [TYPE]  boolean false  true 
[REPLACE]^public boolean canCreateFromObjectWith (  )  { return false; }^110^^^^^^^[REPLACE] public boolean canCreateFromObjectWith (  )  { return true; }^[METHOD] canCreateFromObjectWith [TYPE] boolean [PARAMETER] [CLASS] JsonLocationInstantiator   [TYPE]  JsonLocationInstantiator instance  [TYPE]  boolean false  true 
[REPLACE]^JavaType longType = config.constructType ( Long.TYPE ) ;^114^^^^^113^123^[REPLACE] JavaType intType = config.constructType ( Integer.TYPE ) ;^[METHOD] getFromObjectArguments [TYPE] CreatorProperty[] [PARAMETER] DeserializationConfig config [CLASS] JsonLocationInstantiator   [TYPE]  DeserializationConfig config  [TYPE]  JavaType intType  longType  [TYPE]  boolean false  true  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^JavaType intType = config.constructType ( Integer.TYPE ) ;^115^^^^^113^123^[REPLACE] JavaType longType = config.constructType ( Long.TYPE ) ;^[METHOD] getFromObjectArguments [TYPE] CreatorProperty[] [PARAMETER] DeserializationConfig config [CLASS] JsonLocationInstantiator   [TYPE]  DeserializationConfig config  [TYPE]  JavaType intType  longType  [TYPE]  boolean false  true  [TYPE]  JsonLocationInstantiator instance 
[ADD]^^115^^^^^113^123^[ADD] JavaType longType = config.constructType ( Long.TYPE ) ;^[METHOD] getFromObjectArguments [TYPE] CreatorProperty[] [PARAMETER] DeserializationConfig config [CLASS] JsonLocationInstantiator   [TYPE]  DeserializationConfig config  [TYPE]  JavaType intType  longType  [TYPE]  boolean false  true  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^return new CreatorProperty ( name, type, null, null, null, null, index, null, true ) ;^116^^^^^113^123^[REPLACE] return  new CreatorProperty[] {^[METHOD] getFromObjectArguments [TYPE] CreatorProperty[] [PARAMETER] DeserializationConfig config [CLASS] JsonLocationInstantiator   [TYPE]  DeserializationConfig config  [TYPE]  JavaType intType  longType  [TYPE]  boolean false  true  [TYPE]  JsonLocationInstantiator instance 
[REPLACE]^return new CreatorProperty ( name, type, true, true, true, true, index, true, true ) ;^126^127^^^^125^128^[REPLACE] return new CreatorProperty ( name, type, null, null, null, null, index, null, true ) ;^[METHOD] creatorProp [TYPE] CreatorProperty [PARAMETER] String name JavaType type int index [CLASS] JsonLocationInstantiator   [TYPE]  JavaType type  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  JsonLocationInstantiator instance  [TYPE]  int index 
[REPLACE]^return new JsonLocation ( args[1], _long ( args[1] ) , _long ( args[2] ) , _int ( args[3] ) , _int ( args[4] )  ) ;^132^133^^^^131^134^[REPLACE] return new JsonLocation ( args[0], _long ( args[1] ) , _long ( args[2] ) , _int ( args[3] ) , _int ( args[4] )  ) ;^[METHOD] createFromObjectWith [TYPE] Object [PARAMETER] DeserializationContext ctxt Object[] args [CLASS] JsonLocationInstantiator   [TYPE]  DeserializationContext ctxt  [TYPE]  boolean false  true  [TYPE]  JsonLocationInstantiator instance  [TYPE]  Object[] args 
[REPLACE]^return  ( o == null )  ? 0L :  (  ( Number )  o ) .intValue (  ) ;^137^^^^^136^138^[REPLACE] return  ( o == null )  ? 0L :  (  ( Number )  o ) .longValue (  ) ;^[METHOD] _long [TYPE] long [PARAMETER] Object o [CLASS] JsonLocationInstantiator   [TYPE]  JsonLocationInstantiator instance  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^return  ( o == null )  ? 0L :  (  ( Number )  o ) .longValue (  ) ;^140^^^^^139^141^[REPLACE] return  ( o == null )  ? 0 :  (  ( Number )  o ) .intValue (  ) ;^[METHOD] _int [TYPE] int [PARAMETER] Object o [CLASS] JsonLocationInstantiator   [TYPE]  JsonLocationInstantiator instance  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^private final static TokenBufferDeserializer instance = new TokenBufferDeserializer (  ) ;^155^^^^^^^[REPLACE] public final static TokenBufferDeserializer instance = new TokenBufferDeserializer (  ) ;^[METHOD] _int [TYPE] int [PARAMETER] Object o [CLASS] TokenBufferDeserializer   [TYPE]  JsonLocationInstantiator instance  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^tb.copyCurrentStructure ( jp ) ;^157^^^^^^^[REPLACE] public TokenBufferDeserializer (  )  { super ( TokenBuffer.class ) ; }^[METHOD] <init> [TYPE] JacksonDeserializers$TokenBufferDeserializer() [PARAMETER] [CLASS] TokenBufferDeserializer   [TYPE]  TokenBufferDeserializer instance  [TYPE]  boolean false  true 
[REPLACE]^TokenBuffer tb = new TokenBuffer ( jp.getCodec (  )  ) ;^165^^^^^160^167^[REPLACE] tb.copyCurrentStructure ( jp ) ;^[METHOD] deserialize [TYPE] TokenBuffer [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] TokenBufferDeserializer   [TYPE]  TokenBuffer tb  [TYPE]  DeserializationContext ctxt  [TYPE]  boolean false  true  [TYPE]  TokenBufferDeserializer instance  [TYPE]  JsonParser jp 