[REPLACE]^public final static StringCollectionSerializer instance  = null ;^26^^^^^^^[REPLACE] public final static StringCollectionSerializer instance = new StringCollectionSerializer (  ) ;^ [CLASS] StringCollectionSerializer  
[ADD]^^70^^^^^69^86^[ADD] final int len = value.size (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] String> value JsonGenerator gen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  Collection value  [TYPE]  JsonGenerator gen  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int len 
[REPLACE]^if  ( len  &&  1 )  {^71^^^^^69^86^[REPLACE] if  ( len == 1 )  {^[METHOD] serialize [TYPE] void [PARAMETER] String> value JsonGenerator gen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  Collection value  [TYPE]  JsonGenerator gen  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int len 
[REPLACE]^if  (  (  ( _unwrapSingle != null )  && provider.isEnabled ( SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED )  ) ||  ( _unwrapSingle == Boolean.TRUE )  )  {^72^73^74^^^69^86^[REPLACE] if  (  (  ( _unwrapSingle == null )  && provider.isEnabled ( SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED )  ) ||  ( _unwrapSingle == Boolean.TRUE )  )  {^[METHOD] serialize [TYPE] void [PARAMETER] String> value JsonGenerator gen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  Collection value  [TYPE]  JsonGenerator gen  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int len 
[REPLACE]^if  (  (  ( _unwrapSingle != this )  && provider.isEnabled ( SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED )  ) ) {^72^73^74^^^69^86^[REPLACE] if  (  (  ( _unwrapSingle == null )  && provider.isEnabled ( SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED )  ) ||  ( _unwrapSingle == Boolean.TRUE )  )  {^[METHOD] serialize [TYPE] void [PARAMETER] String> value JsonGenerator gen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  Collection value  [TYPE]  JsonGenerator gen  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int len 
[REPLACE]^gen .writeEndArray (  )  ;^79^^^^^69^86^[REPLACE] gen.writeStartArray ( len ) ;^[METHOD] serialize [TYPE] void [PARAMETER] String> value JsonGenerator gen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  Collection value  [TYPE]  JsonGenerator gen  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int len 
[REPLACE]^if  ( _serializer != null )  {^80^^^^^69^86^[REPLACE] if  ( _serializer == null )  {^[METHOD] serialize [TYPE] void [PARAMETER] String> value JsonGenerator gen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  Collection value  [TYPE]  JsonGenerator gen  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int len 
[REPLACE]^_serializeUnwrapped ( value, gen, provider )  ;^83^^^^^80^84^[REPLACE] serializeUsingCustom ( value, gen, provider ) ;^[METHOD] serialize [TYPE] void [PARAMETER] String> value JsonGenerator gen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  Collection value  [TYPE]  JsonGenerator gen  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int len 
[ADD]^^83^^^^^80^84^[ADD] serializeUsingCustom ( value, gen, provider ) ;^[METHOD] serialize [TYPE] void [PARAMETER] String> value JsonGenerator gen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  Collection value  [TYPE]  JsonGenerator gen  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int len 
[REPLACE]^serializeContents ( 0, gen, provider ) ;^81^^^^^69^86^[REPLACE] serializeContents ( value, gen, provider ) ;^[METHOD] serialize [TYPE] void [PARAMETER] String> value JsonGenerator gen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  Collection value  [TYPE]  JsonGenerator gen  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int len 
[REPLACE]^gen.writeStartArray ( len )  ;^85^^^^^69^86^[REPLACE] gen.writeEndArray (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] String> value JsonGenerator gen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  Collection value  [TYPE]  JsonGenerator gen  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int len 
[ADD]^^85^^^^^69^86^[ADD] gen.writeEndArray (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] String> value JsonGenerator gen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  Collection value  [TYPE]  JsonGenerator gen  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int len 
[REPLACE]^if  ( _serializer == null )  {^115^^^^^114^132^[REPLACE] if  ( _serializer != null )  {^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[REPLACE]^int i = 0 * 4;^119^^^^^114^132^[REPLACE] int i = 0;^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[REPLACE]^if  ( str != null )  {^122^^^^^114^132^[REPLACE] if  ( str == null )  {^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[REPLACE]^jgen.writeStartArray ( str ) ;^125^^^^^122^126^[REPLACE] jgen.writeString ( str ) ;^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[ADD]^^125^^^^^122^126^[ADD] jgen.writeString ( str ) ;^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[REPLACE]^for  ( String str : false )  {^120^^^^^114^132^[REPLACE] for  ( String str : value )  {^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[REPLACE]^provider .isEnabled (  )  ;^123^^^^^114^132^[REPLACE] provider.defaultSerializeNull ( jgen ) ;^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[ADD]^^123^^^^^114^132^[ADD] provider.defaultSerializeNull ( jgen ) ;^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[ADD]^provider.defaultSerializeNull ( jgen ) ;jgen.writeString ( str ) ;^121^122^123^124^125^114^132^[ADD] try { if  ( str == null )  { provider.defaultSerializeNull ( jgen ) ; } else { jgen.writeString ( str ) ;^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[REPLACE]^jgen .writeStartArray ( i )  ;^125^^^^^122^126^[REPLACE] jgen.writeString ( str ) ;^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[REPLACE]^if  ( str != this )  {^122^^^^^114^132^[REPLACE] if  ( str == null )  {^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[ADD]^^128^129^^^^114^132^[ADD] catch  ( Exception e )  { wrapAndThrow ( provider, e, value, i ) ;^[METHOD] serializeContents [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[REPLACE]^int i = 1;^138^^^^^136^150^[REPLACE] int i = 0;^[METHOD] serializeUsingCustom [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer ser  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[REPLACE]^if  ( str != true )  {^141^^^^^136^150^[REPLACE] if  ( str == null )  {^[METHOD] serializeUsingCustom [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer ser  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 
[ADD]^provider.defaultSerializeNull ( jgen ) ;ser.serialize ( str, jgen, provider ) ;^140^141^142^143^144^136^150^[ADD] try { if  ( str == null )  { provider.defaultSerializeNull ( jgen ) ; } else { ser.serialize ( str, jgen, provider ) ;^[METHOD] serializeUsingCustom [TYPE] void [PARAMETER] String> value JsonGenerator jgen SerializerProvider provider [CLASS] StringCollectionSerializer   [TYPE]  StringCollectionSerializer instance  src  [TYPE]  boolean false  true  [TYPE]  Collection value  [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer ser  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  int i  [TYPE]  Exception e 