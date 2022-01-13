[REPLACE]^private final JsonParser.NumberType _numberType;^53^^^^^^^[REPLACE] protected final JsonParser.NumberType _numberType;^ [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer  
[REPLACE]^private final boolean _isInt;^55^^^^^^^[REPLACE] protected final boolean _isInt;^ [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer  
[REPLACE]^final static ShortSerializer instance ;^112^^^^^^^[REPLACE] final static ShortSerializer instance = new ShortSerializer (  ) ;^ [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer  
[REPLACE]^final static IntLikeSerializer instance ;^164^^^^^^^[REPLACE] final static IntLikeSerializer instance = new IntLikeSerializer (  ) ;^ [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer  
[REPLACE]^static LongSerializer instance = new LongSerializer (  ) ;^179^^^^^^^[REPLACE] final static LongSerializer instance = new LongSerializer (  ) ;^ [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer  
[REPLACE]^final static Object instance = new Object (  ) ;^194^^^^^^^[REPLACE] final static FloatSerializer instance = new FloatSerializer (  ) ;^ [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer  
[REPLACE]^final static DoubleSerializer instance  = null ;^216^^^^^^^[REPLACE] final static DoubleSerializer instance = new DoubleSerializer (  ) ;^ [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer  
[REPLACE]^allDeserializers.put ( Integer.class.getName (  ) , null ) ;^29^^^^^27^43^[REPLACE] allDeserializers.put ( Integer.class.getName (  ) , intS ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[ADD]^^29^30^^^^27^43^[ADD] allDeserializers.put ( Integer.class.getName (  ) , intS ) ; allDeserializers.put ( Integer.TYPE.getName (  ) , intS ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^29^^^^^27^43^[REPLACE] allDeserializers.put ( Integer.class.getName (  ) , intS ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^allDeserializers.put ( getName (  ) , intS )  ;^30^^^^^27^43^[REPLACE] allDeserializers.put ( Integer.TYPE.getName (  ) , intS ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^30^^^^^27^43^[REPLACE] allDeserializers.put ( Integer.TYPE.getName (  ) , intS ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^allDeserializers.put ( getName (  ) , instance )  ;^31^^^^^27^43^[REPLACE] allDeserializers.put ( Long.class.getName (  ) , LongSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^31^^^^^27^43^[REPLACE] allDeserializers.put ( Long.class.getName (  ) , LongSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^allDeserializers.put ( getName (  ) , instance )  ;^32^^^^^27^43^[REPLACE] allDeserializers.put ( Long.TYPE.getName (  ) , LongSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^32^^^^^27^43^[REPLACE] allDeserializers.put ( Long.TYPE.getName (  ) , LongSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^allDeserializers.put ( getName (  ) , instance )  ;^33^^^^^27^43^[REPLACE] allDeserializers.put ( Byte.class.getName (  ) , IntLikeSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^33^^^^^27^43^[REPLACE] allDeserializers.put ( Byte.class.getName (  ) , IntLikeSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^allDeserializers.put ( getName (  ) , instance )  ;^34^^^^^27^43^[REPLACE] allDeserializers.put ( Byte.TYPE.getName (  ) , IntLikeSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^34^^^^^27^43^[REPLACE] allDeserializers.put ( Byte.TYPE.getName (  ) , IntLikeSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^allDeserializers.put ( getName (  ) , instance )  ;^35^^^^^27^43^[REPLACE] allDeserializers.put ( Short.class.getName (  ) , ShortSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^35^^^^^27^43^[REPLACE] allDeserializers.put ( Short.class.getName (  ) , ShortSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^allDeserializers.put ( getName (  ) , instance )  ;^36^^^^^27^43^[REPLACE] allDeserializers.put ( Short.TYPE.getName (  ) , ShortSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^36^^^^^27^43^[REPLACE] allDeserializers.put ( Short.TYPE.getName (  ) , ShortSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REMOVE]^super ( class, INT, "number" )  ;^36^^^^^27^43^[REMOVE] ^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^allDeserializers.put ( getName (  ) , instance )  ;^39^^^^^27^43^[REPLACE] allDeserializers.put ( Float.class.getName (  ) , FloatSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^39^^^^^27^43^[REPLACE] allDeserializers.put ( Float.class.getName (  ) , FloatSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^allDeserializers.put ( getName (  ) , instance )  ;^40^^^^^27^43^[REPLACE] allDeserializers.put ( Float.TYPE.getName (  ) , FloatSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^40^^^^^27^43^[REPLACE] allDeserializers.put ( Float.TYPE.getName (  ) , FloatSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^allDeserializers.put ( getName (  ) , instance )  ;^41^^^^^27^43^[REPLACE] allDeserializers.put ( Double.class.getName (  ) , DoubleSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^41^^^^^27^43^[REPLACE] allDeserializers.put ( Double.class.getName (  ) , DoubleSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^allDeserializers.put ( getName (  ) , instance )  ;^42^^^^^27^43^[REPLACE] allDeserializers.put ( Double.TYPE.getName (  ) , DoubleSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^getName (  )  ;^42^^^^^27^43^[REPLACE] allDeserializers.put ( Double.TYPE.getName (  ) , DoubleSerializer.instance ) ;^[METHOD] addAll [TYPE] void [PARAMETER] JsonSerializer<?>> allDeserializers [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  JsonSerializer intS  [TYPE]  Map allDeserializers  [TYPE]  IntLikeSerializer instance 
[REPLACE]^if  ( property == true )  {^86^^^^^85^101^[REPLACE] if  ( property != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  IntLikeSerializer instance  [TYPE]  BeanProperty property 
[ADD]^^86^87^88^89^90^85^101^[ADD] if  ( property != null )  { AnnotatedMember m = property.getMember (  ) ; if  ( m != null )  { JsonFormat.Value format = prov.getAnnotationIntrospector (  ) .findFormat ( m ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  IntLikeSerializer instance  [TYPE]  BeanProperty property 
[REPLACE]^if  ( m == null )  {^88^^^^^85^101^[REPLACE] if  ( m != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  IntLikeSerializer instance  [TYPE]  BeanProperty property 
[ADD]^^88^89^90^91^^85^101^[ADD] if  ( m != null )  { JsonFormat.Value format = prov.getAnnotationIntrospector (  ) .findFormat ( m ) ; if  ( format != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  IntLikeSerializer instance  [TYPE]  BeanProperty property 
[REPLACE]^if  ( null == null )  {^91^^^^^85^101^[REPLACE] if  ( format != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  IntLikeSerializer instance  [TYPE]  BeanProperty property 
[ADD]^^91^92^93^94^95^85^101^[ADD] if  ( format != null )  { switch  ( format.getShape (  )  )  { case STRING: return ToStringSerializer.instance; default:^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  IntLikeSerializer instance  [TYPE]  BeanProperty property 
[REPLACE]^JsonFormat.Value format = prov.getAnnotationIntrospector (  )  .visitIntFormat ( null , null , null )  ;^89^90^^^^85^101^[REPLACE] JsonFormat.Value format = prov.getAnnotationIntrospector (  ) .findFormat ( m ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  IntLikeSerializer instance  [TYPE]  BeanProperty property 
[ADD]^^87^^^^^85^101^[ADD] AnnotatedMember m = property.getMember (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  IntLikeSerializer instance  [TYPE]  BeanProperty property 
[REPLACE]^if  ( false == null )  {^91^^^^^85^101^[REPLACE] if  ( format != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  IntLikeSerializer instance  [TYPE]  BeanProperty property 
[REPLACE]^if  ( format == null )  {^91^^^^^85^101^[REPLACE] if  ( format != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  IntLikeSerializer instance  [TYPE]  BeanProperty property 
[REPLACE]^return null;^100^^^^^85^101^[REPLACE] return this;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] NumberSerializers Base ShortSerializer IntegerSerializer IntLikeSerializer LongSerializer FloatSerializer DoubleSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  ShortSerializer instance  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  IntLikeSerializer instance  [TYPE]  BeanProperty property 
[REPLACE]^protected  String _schemaType;^54^^^^^^^[REPLACE] protected final String _schemaType;^[METHOD] serializeWithType [TYPE] void [PARAMETER] Object value JsonGenerator gen SerializerProvider provider TypeSerializer typeSer [CLASS] Base   [TYPE]  NumberType _numberType  numberType  [TYPE]  DoubleSerializer instance  [TYPE]  boolean _isInt  false  true  [TYPE]  LongSerializer instance  [TYPE]  FloatSerializer instance  [TYPE]  TypeSerializer typeSer  [TYPE]  ShortSerializer instance  [TYPE]  JsonGenerator gen  [TYPE]  Object value  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider provider  [TYPE]  IntLikeSerializer instance 
[REPLACE]^if  ( property == false )  {^86^^^^^85^101^[REPLACE] if  ( property != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] Base   [TYPE]  NumberType _numberType  numberType  [TYPE]  boolean _isInt  false  true  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  BeanProperty property 
[REPLACE]^if  ( m == null )  {^88^^^^^85^101^[REPLACE] if  ( m != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] Base   [TYPE]  NumberType _numberType  numberType  [TYPE]  boolean _isInt  false  true  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  BeanProperty property 
[REPLACE]^if  ( format == null )  {^91^^^^^85^101^[REPLACE] if  ( format != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] Base   [TYPE]  NumberType _numberType  numberType  [TYPE]  boolean _isInt  false  true  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  BeanProperty property 
[ADD]^^91^92^93^94^95^85^101^[ADD] if  ( format != null )  { switch  ( format.getShape (  )  )  { case STRING: return ToStringSerializer.instance; default:^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] Base   [TYPE]  NumberType _numberType  numberType  [TYPE]  boolean _isInt  false  true  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  BeanProperty property 
[ADD]^^89^90^91^92^93^85^101^[ADD] JsonFormat.Value format = prov.getAnnotationIntrospector (  ) .findFormat ( m ) ; if  ( format != null )  { switch  ( format.getShape (  )  )  { case STRING:^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] Base   [TYPE]  NumberType _numberType  numberType  [TYPE]  boolean _isInt  false  true  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  BeanProperty property 
[REPLACE]^if  ( format == false )  {^91^^^^^85^101^[REPLACE] if  ( format != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] Base   [TYPE]  NumberType _numberType  numberType  [TYPE]  boolean _isInt  false  true  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  BeanProperty property 
[REPLACE]^if  ( m == false )  {^88^^^^^85^101^[REPLACE] if  ( m != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] Base   [TYPE]  NumberType _numberType  numberType  [TYPE]  boolean _isInt  false  true  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  BeanProperty property 
[REPLACE]^return null;^100^^^^^85^101^[REPLACE] return this;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] Base   [TYPE]  NumberType _numberType  numberType  [TYPE]  boolean _isInt  false  true  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  BeanProperty property 
[REPLACE]^final static Object instance = new Object (  ) ;^112^^^^^^^[REPLACE] final static ShortSerializer instance = new ShortSerializer (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider prov BeanProperty property [CLASS] ShortSerializer   [TYPE]  NumberType _numberType  numberType  [TYPE]  boolean _isInt  false  true  [TYPE]  AnnotatedMember m  [TYPE]  Value format  [TYPE]  String _schemaType  schemaType  [TYPE]  SerializerProvider prov  [TYPE]  BeanProperty property 
[REPLACE]^static IntLikeSerializer instance = new IntLikeSerializer (  ) ;^164^^^^^^^[REPLACE] final static IntLikeSerializer instance = new IntLikeSerializer (  ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] Object value JsonGenerator gen SerializerProvider provider TypeSerializer typeSer [CLASS] IntLikeSerializer   [TYPE]  boolean false  true  [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator gen  [TYPE]  Object value  [TYPE]  SerializerProvider provider 
[REPLACE]^final static LongSerializer instance  = null ;^179^^^^^^^[REPLACE] final static LongSerializer instance = new LongSerializer (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator gen SerializerProvider provider [CLASS] LongSerializer   [TYPE]  JsonGenerator gen  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  IntLikeSerializer instance 
[REPLACE]^final static FloatSerializer instance ;^194^^^^^^^[REPLACE] final static FloatSerializer instance = new FloatSerializer (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator gen SerializerProvider provider [CLASS] FloatSerializer   [TYPE]  JsonGenerator gen  [TYPE]  Object value  [TYPE]  LongSerializer instance  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^final static DoubleSerializer instance ;^216^^^^^^^[REPLACE] final static DoubleSerializer instance = new DoubleSerializer (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator gen SerializerProvider provider [CLASS] DoubleSerializer   [TYPE]  JsonGenerator gen  [TYPE]  Object value  [TYPE]  FloatSerializer instance  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 