[ADD]^^23^24^^^^22^47^[ADD] String str; Class<?> cls = value.getClass (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^Class<?> cls = value.toString (  ) ;^24^^^^^22^47^[REPLACE] Class<?> cls = value.getClass (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^if  ( cls  !=  String.class )  {^26^^^^^22^47^[REPLACE] if  ( cls == String.class )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^str =  ( String )  value;^26^27^28^^^22^47^[ADD] if  ( cls == String.class )  { str =  ( String )  value; } else if  ( cls.isEnum (  )  )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  if  ( cls.isEnum (   )  && cls ==  ( class )  )  )  {^28^^^^^22^47^[REPLACE] } else if  ( cls.isEnum (  )  )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^}   Enum<?> en =  ( Enum<?> )  value;^28^29^^31^^22^47^[ADD] else if  ( cls.isEnum (  )  )  {  Enum<?> en =  ( Enum<?> )  value;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  else {^38^^^^^22^47^[REPLACE] } else if  ( value instanceof Date )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  if  ( 0  &&  Class.class )  {^41^^^^^22^47^[REPLACE] } else if  ( cls == Class.class )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^}   str = value.toString (  ) ;^41^42^43^44^45^22^47^[ADD] else if  ( cls == Class.class )  { str =  (  ( Class<?> )  value ) .getName (  ) ; } else { str = value.toString (  ) ; }^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^str = en.toString (  )  ;^44^^^^^41^45^[REPLACE] str = value.toString (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^str =   (  ( Class<?> )  value ) .getName (  ) ;^42^^^^^22^47^[REPLACE] str =  (  ( Class<?> )  value ) .getName (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^str = en.toString (  )  ;^44^^^^^22^47^[REPLACE] str = value.toString (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  if  ( null  &&  Class.class )  {^41^^^^^22^47^[REPLACE] } else if  ( cls == Class.class )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REMOVE]^if  ( value instanceof Date )  {     provider.defaultSerializeDateKey (  (  ( Date )   ( value )  ) , g ) ;     return ; }else     if  ( cls ==  ( class )  )  {         str =  (  ( Class<?> )   ( value )  ) .getName (  ) ;     }else {         str = value.toString (  ) ;     }^41^^^^^22^47^[REMOVE] ^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^^42^^^^^22^47^[ADD] str =  (  ( Class<?> )  value ) .getName (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^str =  1.name (  ) ;^36^^^^^33^37^[REPLACE] str = en.name (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^str = value.toString (  )  ;^34^^^^^22^47^[REPLACE] str = en.toString (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^str =  this.name (  ) ;^36^^^^^22^47^[REPLACE] str = en.name (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^^31^^^^^22^47^[ADD] Enum<?> en =  ( Enum<?> )  value;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^str =  this.name (  ) ;^36^^^^^33^37^[REPLACE] str = en.name (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  if  ( !JsonNode instanceof Date )  {^38^^^^^22^47^[REPLACE] } else if  ( value instanceof Date )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  if  ( cls  &&  Class.class )  {^41^^^^^22^47^[REPLACE] } else if  ( cls == Class.class )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^} else if  ( cls  ||  Class.class )  {^41^^^^^22^47^[REPLACE] } else if  ( cls == Class.class )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^^44^^^^^41^45^[ADD] str = value.toString (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^^36^^^^^22^47^[ADD] str = en.name (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^^27^^^^^22^47^[ADD] str =  ( String )  value;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  else {^28^^^^^22^47^[REPLACE] } else if  ( cls.isEnum (  )  )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REMOVE]^if  ( cls ==  ( class )  )  {     str =  (  ( String )   ( value )  ) ; }else     if  ( cls.isEnum (  )  )  {         Enum<?> en =  (  ( Enum<?> )   ( value )  ) ;         if  ( provider.isEnabled ( SerializationFeature.WRITE_ENUMS_USING_TO_STRING )  )  {             str = en.toString (  ) ;         }else {             str = en.name (  ) ;         }     }else         if  ( value instanceof Date )  {             provider.defaultSerializeDateKey (  (  ( Date )   ( value )  ) , g ) ;             return ;         }else             if  ( cls ==  ( class )  )  {                 str =  (  ( Class<?> )   ( value )  ) .getName (  ) ;             }else {                 str = value.toString (  ) ;             }^28^^^^^22^47^[REMOVE] ^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  if  ( 0  ) {^41^^^^^22^47^[REPLACE] } else if  ( cls == Class.class )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  if  ( cls  ||  Class.class )  {^41^^^^^22^47^[REPLACE] } else if  ( cls == Class.class )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^^36^^^^^33^37^[ADD] str = en.name (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^if  ( provider .defaultSerializeDateKey ( this , g )   )  {^33^^^^^22^47^[REPLACE] if  ( provider.isEnabled ( SerializationFeature.WRITE_ENUMS_USING_TO_STRING )  )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^str =  null.name (  ) ;^36^^^^^33^37^[REPLACE] str = en.name (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  if  ( ! value instanceof Date )  {^38^^^^^22^47^[REPLACE] } else if  ( value instanceof Date )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^}   return;str =  (  ( Class<?> )  value ) .getName (  ) ;^38^39^40^41^42^22^47^[ADD] else if  ( value instanceof Date )  { provider.defaultSerializeDateKey (  ( Date )  value, g ) ; return; } else if  ( cls == Class.class )  { str =  (  ( Class<?> )  value ) .getName (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  else {^41^^^^^22^47^[REPLACE] } else if  ( cls == Class.class )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^}   str =  (  ( Class<?> )  value ) .getName (  ) ;str = value.toString (  ) ;^41^42^43^44^45^22^47^[ADD] else if  ( cls == Class.class )  { str =  (  ( Class<?> )  value ) .getName (  ) ; } else { str = value.toString (  ) ; }^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[ADD]^^44^^^^^22^47^[ADD] str = value.toString (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^}  if  ( false  !=  Class.class )  {^41^^^^^22^47^[REPLACE] } else if  ( cls == Class.class )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 
[REPLACE]^str =   ( String )  value;^27^^^^^22^47^[REPLACE] str =  ( String )  value;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializer   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  Class cls  [TYPE]  String str  [TYPE]  SerializerProvider provider 