[REPLACE]^public AtomicBooleanSerializer (  )  { super ( AtomicBoolean.class, true ) ; }^69^^^^^^^[REPLACE] public AtomicBooleanSerializer (  )  { super ( AtomicBoolean.class, false ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$AtomicBooleanSerializer() [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true 
[ADD]^^69^70^71^^^^^[ADD] public AtomicBooleanSerializer (  )  { super ( AtomicBoolean.class, false ) ; }  @Override^[METHOD] <init> [TYPE] StdJdkSerializers$AtomicBooleanSerializer() [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true 
[REPLACE]^public AtomicIntegerSerializer (  )  { super ( AtomicInteger.class, true ) ; }^95^^^^^^^[REPLACE] public AtomicIntegerSerializer (  )  { super ( AtomicInteger.class, false ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$AtomicIntegerSerializer() [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true 
[REPLACE]^public AtomicLongSerializer (  )  { super ( AtomicLong.class, true ) ; }^124^^^^^^^[REPLACE] public AtomicLongSerializer (  )  { super ( AtomicLong.class, false ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$AtomicLongSerializer() [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true 
[REPLACE]^public AtomicReferenceSerializer (  )  { super ( AtomicReference.class, true ) ; }^153^^^^^^^[REPLACE] public AtomicReferenceSerializer (  )  { super ( AtomicReference.class, false ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$AtomicReferenceSerializer() [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true 
[REPLACE]^public AtomicReferenceSerializer (  )  { super ( AtomicReference.class, false ) ; }^189^^^^^^^[REPLACE] public FileSerializer (  )  { super ( File.class ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$FileSerializer() [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true 
[REPLACE]^public ClassSerializer (  )  { super ( Class.class, true ) ; }^219^^^^^^^[REPLACE] public ClassSerializer (  )  { super ( Class.class, false ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$ClassSerializer() [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true 
[REPLACE]^JsonIntegerFormatVisitor v2 = visitor.expectIntegerFormat ( typeHint ) ;^28^^^^^27^58^[REPLACE] HashMap<Class<?>,Object> sers = new HashMap<Class<?>,Object> (  ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^HashMap<Class<?>,Object> sers = new HashMap<Class<?>,Object> (  ) ;^31^^^^^27^58^[REPLACE] final ToStringSerializer sls = ToStringSerializer.instance;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers.put ( java.net.URI.class, sls ) ;^33^^^^^27^58^[REPLACE] sers.put ( java.net.URL.class, sls ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers.put ( java.net.URL.class, sls ) ;^34^^^^^27^58^[REPLACE] sers.put ( java.net.URI.class, sls ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers.put ( java.net.URL.class, sls ) ;^36^^^^^27^58^[REPLACE] sers.put ( Currency.class, sls ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REMOVE]^public AtomicReferenceSerializer (  )  { super ( AtomicReference.class, false ) ; }^36^^^^^27^58^[REMOVE] ^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers.put ( java.net.URL.class, sls ) ;^37^^^^^27^58^[REPLACE] sers.put ( UUID.class, sls ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers .entrySet (  )  ;^38^^^^^27^58^[REPLACE] sers.put ( java.util.regex.Pattern.class, sls ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers .entrySet (  )  ;^39^^^^^27^58^[REPLACE] sers.put ( Locale.class, sls ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers.put ( java.net.URL.class, sls ) ;^42^^^^^27^58^[REPLACE] sers.put ( Locale.class, sls ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers .entrySet (  )  ;^45^^^^^27^58^[REPLACE] sers.put ( AtomicReference.class, AtomicReferenceSerializer.class ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers .entrySet (  )  ;^46^^^^^27^58^[REPLACE] sers.put ( AtomicBoolean.class, AtomicBooleanSerializer.class ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers .entrySet (  )  ;^47^^^^^27^58^[REPLACE] sers.put ( AtomicInteger.class, AtomicIntegerSerializer.class ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers.put ( java.net.URL.class, sls ) ;^48^^^^^27^58^[REPLACE] sers.put ( AtomicLong.class, AtomicLongSerializer.class ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers.put ( java.net.URL.class, sls ) ;^51^^^^^27^58^[REPLACE] sers.put ( File.class, FileSerializer.class ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REMOVE]^sers.put ( java.net.URL.class, sls ) ;^51^^^^^27^58^[REMOVE] ^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers.put ( java.net.URL.class, sls ) ;^52^^^^^27^58^[REPLACE] sers.put ( Class.class, ClassSerializer.class ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^sers.put ( java.net.URL.class, sls ) ;^55^^^^^27^58^[REPLACE] sers.put ( Void.TYPE, NullSerializer.class ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^return false.HashMap (  ) ;^57^^^^^27^58^[REPLACE] return sers.entrySet (  ) ;^[METHOD] all [TYPE] Collection [PARAMETER] [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  HashMap sers  [TYPE]  ToStringSerializer sls 
[REPLACE]^provider.defaultSerializeValue ( value.get (  ) , jgen ) ;^75^^^^^72^76^[REPLACE] jgen.writeBoolean ( value.get (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] AtomicBoolean value JsonGenerator jgen SerializerProvider provider [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  AtomicBoolean value  [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  SerializerProvider provider 
[REPLACE]^return createSchemaNode ( "string", true ) ;^81^^^^^79^82^[REPLACE] return createSchemaNode ( "boolean", true ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  Type typeHint  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^visitor.expectAnyFormat ( typeHint ) ;^88^^^^^85^89^[REPLACE] visitor.expectBooleanFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[ADD]^^88^^^^^85^89^[ADD] visitor.expectBooleanFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[REPLACE]^provider.defaultSerializeValue ( value.get (  ) , jgen ) ;^101^^^^^98^102^[REPLACE] jgen.writeNumber ( value.get (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] AtomicInteger value JsonGenerator jgen SerializerProvider provider [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  AtomicInteger value  [TYPE]  JsonGenerator jgen  [TYPE]  SerializerProvider provider 
[REPLACE]^return createSchemaNode ( "string", true ) ;^107^^^^^105^108^[REPLACE] return createSchemaNode ( "integer", true ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  Type typeHint  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^JsonIntegerFormatVisitor v2 = visitor.expectAnyFormat ( typeHint ) ;^114^^^^^111^118^[REPLACE] JsonIntegerFormatVisitor v2 = visitor.expectIntegerFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[REPLACE]^if  ( v2 == true )  {^115^^^^^111^118^[REPLACE] if  ( v2 != null )  {^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[REPLACE]^v2.numberType ( JsonParser.NumberType.LONG ) ;^116^^^^^111^118^[REPLACE] v2.numberType ( JsonParser.NumberType.INT ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[REPLACE]^provider.defaultSerializeValue ( value.get (  ) , jgen ) ;^130^^^^^127^131^[REPLACE] jgen.writeNumber ( value.get (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] AtomicLong value JsonGenerator jgen SerializerProvider provider [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  AtomicLong value  [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  SerializerProvider provider 
[REPLACE]^return createSchemaNode ( "string", true ) ;^136^^^^^134^137^[REPLACE] return createSchemaNode ( "integer", true ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  Type typeHint  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^JsonIntegerFormatVisitor v2 = visitor.expectAnyFormat ( typeHint ) ;^143^^^^^140^147^[REPLACE] JsonIntegerFormatVisitor v2 = visitor.expectIntegerFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[REPLACE]^if  ( v2 == null )  {^144^^^^^140^147^[REPLACE] if  ( v2 != null )  {^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[ADD]^^144^145^146^^^140^147^[ADD] if  ( v2 != null )  { v2.numberType ( JsonParser.NumberType.LONG ) ; }^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[REPLACE]^v2.numberType ( JsonParser.NumberType.INT ) ;^145^^^^^140^147^[REPLACE] v2.numberType ( JsonParser.NumberType.LONG ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[REPLACE]^provider.defaultSerializeValue ( null.get (  ) , jgen ) ;^159^^^^^156^160^[REPLACE] provider.defaultSerializeValue ( value.get (  ) , jgen ) ;^[METHOD] serialize [TYPE] void [PARAMETER] AtomicReference<?> value JsonGenerator jgen SerializerProvider provider [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  AtomicReference value  [TYPE]  SerializerProvider provider 
[REPLACE]^return createSchemaNode ( "string", true ) ;^165^^^^^163^166^[REPLACE] return createSchemaNode ( "any", true ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  Type typeHint  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^visitor.expectStringFormat ( typeHint ) ;^172^^^^^169^173^[REPLACE] visitor.expectAnyFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[REPLACE]^jgen.writeNumber ( value.get (  )  ) ;^195^^^^^192^196^[REPLACE] jgen.writeString ( value.getAbsolutePath (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] File value JsonGenerator jgen SerializerProvider provider [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  SerializerProvider provider  [TYPE]  File value 
[REPLACE]^return createSchemaNode ( "boolean", true ) ;^201^^^^^199^202^[REPLACE] return createSchemaNode ( "string", true ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  Type typeHint  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^visitor.expectAnyFormat ( typeHint ) ;^208^^^^^205^209^[REPLACE] visitor.expectStringFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[REPLACE]^jgen.writeNumber ( value.getName (  )  ) ;^225^^^^^222^226^[REPLACE] jgen.writeString ( value.getName (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Class<?> value JsonGenerator jgen SerializerProvider provider [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  Class value  [TYPE]  SerializerProvider provider 
[REPLACE]^jgen.writeString ( this.getName (  )  ) ;^225^^^^^222^226^[REPLACE] jgen.writeString ( value.getName (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Class<?> value JsonGenerator jgen SerializerProvider provider [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  Class value  [TYPE]  SerializerProvider provider 
[REPLACE]^return createSchemaNode ( "boolean", true ) ;^231^^^^^229^232^[REPLACE] return createSchemaNode ( "string", true ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  Type typeHint  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^visitor .expectAnyFormat ( typeHint )  ;^238^^^^^235^239^[REPLACE] visitor.expectStringFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdJdkSerializers AtomicBooleanSerializer AtomicIntegerSerializer AtomicLongSerializer AtomicReferenceSerializer FileSerializer ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[REPLACE]^public AtomicBooleanSerializer (  )  { super ( AtomicBoolean.class, true ) ; }^69^^^^^^^[REPLACE] public AtomicBooleanSerializer (  )  { super ( AtomicBoolean.class, false ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$AtomicBooleanSerializer() [PARAMETER] [CLASS] AtomicBooleanSerializer   [TYPE]  boolean false  true 
[REPLACE]^return createSchemaNode ( "boolean", true ) ;^75^^^^^72^76^[REPLACE] jgen.writeBoolean ( value.get (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] AtomicBoolean value JsonGenerator jgen SerializerProvider provider [CLASS] AtomicBooleanSerializer   [TYPE]  AtomicBoolean value  [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  SerializerProvider provider 
[REPLACE]^return createSchemaNode ( "boolean", true ) ;^88^^^^^85^89^[REPLACE] visitor.expectBooleanFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] AtomicBooleanSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[REPLACE]^public AtomicIntegerSerializer (  )  { super ( AtomicInteger.class, true ) ; }^95^^^^^^^[REPLACE] public AtomicIntegerSerializer (  )  { super ( AtomicInteger.class, false ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$AtomicIntegerSerializer() [PARAMETER] [CLASS] AtomicIntegerSerializer   [TYPE]  boolean false  true 
[REPLACE]^public AtomicIntegerSerializer (  )  { super ( AtomicInteger.class, false ) ; }^101^^^^^98^102^[REPLACE] jgen.writeNumber ( value.get (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] AtomicInteger value JsonGenerator jgen SerializerProvider provider [CLASS] AtomicIntegerSerializer   [TYPE]  boolean false  true  [TYPE]  AtomicInteger value  [TYPE]  JsonGenerator jgen  [TYPE]  SerializerProvider provider 
[ADD]^^101^^^^^98^102^[ADD] jgen.writeNumber ( value.get (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] AtomicInteger value JsonGenerator jgen SerializerProvider provider [CLASS] AtomicIntegerSerializer   [TYPE]  boolean false  true  [TYPE]  AtomicInteger value  [TYPE]  JsonGenerator jgen  [TYPE]  SerializerProvider provider 
[ADD]^^114^^^^^111^118^[ADD] JsonIntegerFormatVisitor v2 = visitor.expectIntegerFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] AtomicIntegerSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[REPLACE]^if  ( v2 == true )  {^115^^^^^111^118^[REPLACE] if  ( v2 != null )  {^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] AtomicIntegerSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[REPLACE]^jgen.writeNumber ( value.get (  )  ) ;^116^^^^^111^118^[REPLACE] v2.numberType ( JsonParser.NumberType.INT ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] AtomicIntegerSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[REPLACE]^public AtomicLongSerializer (  )  { super ( AtomicLong.class, true ) ; }^124^^^^^^^[REPLACE] public AtomicLongSerializer (  )  { super ( AtomicLong.class, false ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$AtomicLongSerializer() [PARAMETER] [CLASS] AtomicLongSerializer   [TYPE]  boolean false  true 
[REPLACE]^public AtomicLongSerializer (  )  { super ( AtomicLong.class, false ) ; }^130^^^^^127^131^[REPLACE] jgen.writeNumber ( value.get (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] AtomicLong value JsonGenerator jgen SerializerProvider provider [CLASS] AtomicLongSerializer   [TYPE]  AtomicLong value  [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  SerializerProvider provider 
[REPLACE]^if  ( v2 == false )  {^144^^^^^140^147^[REPLACE] if  ( v2 != null )  {^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] AtomicLongSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[REPLACE]^public AtomicLongSerializer (  )  { super ( AtomicLong.class, false ) ; }^145^^^^^140^147^[REPLACE] v2.numberType ( JsonParser.NumberType.LONG ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] AtomicLongSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  JsonIntegerFormatVisitor v2 
[REPLACE]^public AtomicReferenceSerializer (  )  { super ( AtomicReference.class, true ) ; }^153^^^^^^^[REPLACE] public AtomicReferenceSerializer (  )  { super ( AtomicReference.class, false ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$AtomicReferenceSerializer() [PARAMETER] [CLASS] AtomicReferenceSerializer   [TYPE]  boolean false  true 
[REPLACE]^provider.defaultSerializeValue ( null.get (  ) , jgen ) ;^159^^^^^156^160^[REPLACE] provider.defaultSerializeValue ( value.get (  ) , jgen ) ;^[METHOD] serialize [TYPE] void [PARAMETER] AtomicReference<?> value JsonGenerator jgen SerializerProvider provider [CLASS] AtomicReferenceSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  AtomicReference value  [TYPE]  SerializerProvider provider 
[REPLACE]^provider.defaultSerializeValue ( value.get (  ) , jgen ) ;^172^^^^^169^173^[REPLACE] visitor.expectAnyFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] AtomicReferenceSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[REPLACE]^return createSchemaNode ( "string", true ) ;^189^^^^^^^[REPLACE] public FileSerializer (  )  { super ( File.class ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$FileSerializer() [PARAMETER] [CLASS] FileSerializer   [TYPE]  boolean false  true 
[REPLACE]^return createSchemaNode ( "string", true ) ;^195^^^^^192^196^[REPLACE] jgen.writeString ( value.getAbsolutePath (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] File value JsonGenerator jgen SerializerProvider provider [CLASS] FileSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  SerializerProvider provider  [TYPE]  File value 
[REPLACE]^return createSchemaNode ( "string", true ) ;^208^^^^^205^209^[REPLACE] visitor.expectStringFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] FileSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[REPLACE]^public ClassSerializer (  )  { super ( Class.class, true ) ; }^219^^^^^^^[REPLACE] public ClassSerializer (  )  { super ( Class.class, false ) ; }^[METHOD] <init> [TYPE] StdJdkSerializers$ClassSerializer() [PARAMETER] [CLASS] ClassSerializer   [TYPE]  boolean false  true 
[REPLACE]^return createSchemaNode ( "string", true ) ;^225^^^^^222^226^[REPLACE] jgen.writeString ( value.getName (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Class<?> value JsonGenerator jgen SerializerProvider provider [CLASS] ClassSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  Class value  [TYPE]  SerializerProvider provider 
[REPLACE]^jgen.writeString ( null.getName (  )  ) ;^225^^^^^222^226^[REPLACE] jgen.writeString ( value.getName (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Class<?> value JsonGenerator jgen SerializerProvider provider [CLASS] ClassSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  Class value  [TYPE]  SerializerProvider provider 
[ADD]^^225^^^^^222^226^[ADD] jgen.writeString ( value.getName (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Class<?> value JsonGenerator jgen SerializerProvider provider [CLASS] ClassSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  Class value  [TYPE]  SerializerProvider provider 
[REPLACE]^return createSchemaNode ( "string", true ) ;^238^^^^^235^239^[REPLACE] visitor.expectStringFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] ClassSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 