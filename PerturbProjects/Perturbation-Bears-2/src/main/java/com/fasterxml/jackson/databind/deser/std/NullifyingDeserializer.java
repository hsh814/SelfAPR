[REPLACE]^private static final long serialVersionUID = 1;^18^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] NullifyingDeserializer  
[REPLACE]^public final static Object instance = new Object (  ) ;^20^^^^^^^[REPLACE] public final static NullifyingDeserializer instance = new NullifyingDeserializer (  ) ;^ [CLASS] NullifyingDeserializer  
[REPLACE]^if  (  ( t != true )  ||  ( t == JsonToken.END_OBJECT )  )  {^38^^^^^32^47^[REPLACE] if  (  ( t == null )  ||  ( t == JsonToken.END_OBJECT )  )  {^[METHOD] deserialize [TYPE] Object [PARAMETER] JsonParser p DeserializationContext ctxt [CLASS] NullifyingDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken t  [TYPE]  boolean false  true  [TYPE]  NullifyingDeserializer instance  [TYPE]  long serialVersionUID  [TYPE]  JsonParser p 
[ADD]^^38^39^40^^^32^47^[ADD] if  (  ( t == null )  ||  ( t == JsonToken.END_OBJECT )  )  { break; }^[METHOD] deserialize [TYPE] Object [PARAMETER] JsonParser p DeserializationContext ctxt [CLASS] NullifyingDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken t  [TYPE]  boolean false  true  [TYPE]  NullifyingDeserializer instance  [TYPE]  long serialVersionUID  [TYPE]  JsonParser p 
[REPLACE]^JsonToken t = p .hasToken (  )  ;^37^^^^^32^47^[REPLACE] JsonToken t = p.nextToken (  ) ;^[METHOD] deserialize [TYPE] Object [PARAMETER] JsonParser p DeserializationContext ctxt [CLASS] NullifyingDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken t  [TYPE]  boolean false  true  [TYPE]  NullifyingDeserializer instance  [TYPE]  long serialVersionUID  [TYPE]  JsonParser p 
[REPLACE]^return true;^46^^^^^32^47^[REPLACE] return null;^[METHOD] deserialize [TYPE] Object [PARAMETER] JsonParser p DeserializationContext ctxt [CLASS] NullifyingDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  JsonToken t  [TYPE]  boolean false  true  [TYPE]  NullifyingDeserializer instance  [TYPE]  long serialVersionUID  [TYPE]  JsonParser p 