[P1_Replace_Type]^private static final  short  serialVersionUID = 1L;^15^^^^^10^20^private static final long serialVersionUID = 1L;^[CLASS] ClassDeserializer   [VARIABLES] 
[P8_Replace_Mix]^private static final  short  serialVersionUID = 1;^15^^^^^10^20^private static final long serialVersionUID = 1L;^[CLASS] ClassDeserializer   [VARIABLES] 
[P7_Replace_Invocation]^JsonToken curr = jp .getText (  )  ;^25^^^^^22^36^JsonToken curr = jp.getCurrentToken (  ) ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P14_Delete_Statement]^^25^^^^^22^36^JsonToken curr = jp.getCurrentToken (  ) ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P2_Replace_Operator]^if  ( curr >= JsonToken.VALUE_STRING )  {^27^^^^^22^36^if  ( curr == JsonToken.VALUE_STRING )  {^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P5_Replace_Variable]^if  ( curr == instance )  {^27^^^^^22^36^if  ( curr == JsonToken.VALUE_STRING )  {^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P5_Replace_Variable]^return className.findClass ( ctxt ) ;^30^^^^^22^36^return ctxt.findClass ( className ) ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P14_Delete_Statement]^^30^^^^^22^36^return ctxt.findClass ( className ) ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P1_Replace_Type]^char className = jp.getText (  ) .trim (  ) ;^28^^^^^22^36^String className = jp.getText (  ) .trim (  ) ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P8_Replace_Mix]^throw ctxt.mappingException  (" ")  ; ;^32^^^^^22^36^throw ctxt.instantiationException  (" ")  ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P11_Insert_Donor_Statement]^throw ctxt.mappingException  (" ")  ;throw ctxt.instantiationException  (" ")  ;^32^^^^^22^36^throw ctxt.instantiationException  (" ")  ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P8_Replace_Mix]^String className = jp .getCurrentToken (  )  .trim (  ) ;^28^^^^^22^36^String className = jp.getText (  ) .trim (  ) ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P14_Delete_Statement]^^28^^^^^22^36^String className = jp.getText (  ) .trim (  ) ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P8_Replace_Mix]^return ctxt .mappingException ( curr )  ;^30^^^^^22^36^return ctxt.findClass ( className ) ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P8_Replace_Mix]^throw ctxt .mappingException ( curr )   ;^32^^^^^22^36^throw ctxt.instantiationException  (" ")  ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P14_Delete_Statement]^^32^^^^^22^36^throw ctxt.instantiationException  (" ")  ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P14_Delete_Statement]^^35^^^^^22^36^throw ctxt.mappingException  (" ")  ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  
[P11_Insert_Donor_Statement]^throw ctxt.instantiationException  (" ")  ;throw ctxt.mappingException  (" ")  ;^35^^^^^22^36^throw ctxt.mappingException  (" ")  ;^[CLASS] ClassDeserializer  [METHOD] deserialize [RETURN_TYPE] Class   JsonParser jp DeserializationContext ctxt [VARIABLES] boolean  DeserializationContext  ctxt  JsonToken  curr  String  className  long  serialVersionUID  ClassDeserializer  instance  Exception  e  JsonParser  jp  