[REPLACE]^private final Converter<Object,?> _converter;^32^^^^^^^[REPLACE] protected final Converter<Object,?> _converter;^ [CLASS] StdDelegatingSerializer  
[REPLACE]^super ( delegateType ) ;^53^^^^^51^57^[REPLACE] super ( Object.class ) ;^[METHOD] <init> [TYPE] Converter) [PARAMETER] Converter<?, ?> converter [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  [TYPE]  JsonSerializer _delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^_converter =   ( Converter<Object,?> ) converter;^54^^^^^51^57^[REPLACE] _converter =  ( Converter<Object,?> ) converter;^[METHOD] <init> [TYPE] Converter) [PARAMETER] Converter<?, ?> converter [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  [TYPE]  JsonSerializer _delegateSerializer  [TYPE]  boolean false  true 
[ADD]^^54^55^^^^51^57^[ADD] _converter =  ( Converter<Object,?> ) converter; _delegateType = null;^[METHOD] <init> [TYPE] Converter) [PARAMETER] Converter<?, ?> converter [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  [TYPE]  JsonSerializer _delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^_delegateType = false;^55^^^^^51^57^[REPLACE] _delegateType = null;^[METHOD] <init> [TYPE] Converter) [PARAMETER] Converter<?, ?> converter [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  [TYPE]  JsonSerializer _delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^_delegateSerializer = true;^56^^^^^51^57^[REPLACE] _delegateSerializer = null;^[METHOD] <init> [TYPE] Converter) [PARAMETER] Converter<?, ?> converter [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  [TYPE]  JsonSerializer _delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^super ( cls, true ) ;^62^^^^^60^66^[REPLACE] super ( cls, false ) ;^[METHOD] <init> [TYPE] Converter) [PARAMETER] Class<T> cls Converter<T, ?> converter [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  [TYPE]  Class cls  [TYPE]  JsonSerializer _delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^_converter =   ( Converter<Object,?> ) converter;^63^^^^^60^66^[REPLACE] _converter =  ( Converter<Object,?> ) converter;^[METHOD] <init> [TYPE] Converter) [PARAMETER] Class<T> cls Converter<T, ?> converter [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  [TYPE]  Class cls  [TYPE]  JsonSerializer _delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^_delegateType = false;^64^^^^^60^66^[REPLACE] _delegateType = null;^[METHOD] <init> [TYPE] Converter) [PARAMETER] Class<T> cls Converter<T, ?> converter [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  [TYPE]  Class cls  [TYPE]  JsonSerializer _delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^_delegateSerializer = this;^65^^^^^60^66^[REPLACE] _delegateSerializer = null;^[METHOD] <init> [TYPE] Converter) [PARAMETER] Class<T> cls Converter<T, ?> converter [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  [TYPE]  Class cls  [TYPE]  JsonSerializer _delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^super ( _delegateType ) ;^72^^^^^69^76^[REPLACE] super ( delegateType ) ;^[METHOD] <init> [TYPE] JsonSerializer) [PARAMETER] Object, ?> converter JavaType delegateType JsonSerializer<?> delegateSerializer [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true 
[ADD]^^72^73^^^^69^76^[ADD] super ( delegateType ) ; _converter = converter;^[METHOD] <init> [TYPE] JsonSerializer) [PARAMETER] Object, ?> converter JavaType delegateType JsonSerializer<?> delegateSerializer [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^_converter =  null;^73^^^^^69^76^[REPLACE] _converter = converter;^[METHOD] <init> [TYPE] JsonSerializer) [PARAMETER] Object, ?> converter JavaType delegateType JsonSerializer<?> delegateSerializer [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^_delegateType =  null;^74^^^^^69^76^[REPLACE] _delegateType = delegateType;^[METHOD] <init> [TYPE] JsonSerializer) [PARAMETER] Object, ?> converter JavaType delegateType JsonSerializer<?> delegateSerializer [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^_delegateSerializer =   ( JsonSerializer<Object> )  delegateSerializer;^75^^^^^69^76^[REPLACE] _delegateSerializer =  ( JsonSerializer<Object> )  delegateSerializer;^[METHOD] <init> [TYPE] JsonSerializer) [PARAMETER] Object, ?> converter JavaType delegateType JsonSerializer<?> delegateSerializer [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true 
[ADD]^^75^^^^^69^76^[ADD] _delegateSerializer =  ( JsonSerializer<Object> )  delegateSerializer;^[METHOD] <init> [TYPE] JsonSerializer) [PARAMETER] Object, ?> converter JavaType delegateType JsonSerializer<?> delegateSerializer [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^if  ( getClass (  )   ==  StdDelegatingSerializer.class )  {^85^^^^^82^89^[REPLACE] if  ( getClass (  )  != StdDelegatingSerializer.class )  {^[METHOD] withDelegate [TYPE] StdDelegatingSerializer [PARAMETER] Object, ?> converter JavaType delegateType JsonSerializer<?> delegateSerializer [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^return ;^86^^^^^82^89^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] withDelegate [TYPE] StdDelegatingSerializer [PARAMETER] Object, ?> converter JavaType delegateType JsonSerializer<?> delegateSerializer [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^if  ( getClass (  )  != StdDelegatingSerializer.class )  { throw new IllegalStateException  (" ")  ;^86^^^^^82^89^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] withDelegate [TYPE] StdDelegatingSerializer [PARAMETER] Object, ?> converter JavaType delegateType JsonSerializer<?> delegateSerializer [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^return new StdDelegatingSerializer ( null, delegateType, delegateSerializer ) ;^88^^^^^82^89^[REPLACE] return new StdDelegatingSerializer ( converter, delegateType, delegateSerializer ) ;^[METHOD] withDelegate [TYPE] StdDelegatingSerializer [PARAMETER] Object, ?> converter JavaType delegateType JsonSerializer<?> delegateSerializer [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true 
[REPLACE]^if  (   ( _delegateSerializer instanceof ResolvableSerializer )  )  {^100^101^^^^98^104^[REPLACE] if  (  ( _delegateSerializer != null ) &&  ( _delegateSerializer instanceof ResolvableSerializer )  )  {^[METHOD] resolve [TYPE] void [PARAMETER] SerializerProvider provider [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^provider.findValueSerializer ( delegateType, property )  ) ;^102^^^^^98^104^[REPLACE] (  ( ResolvableSerializer )  _delegateSerializer ) .resolve ( provider ) ;^[METHOD] resolve [TYPE] void [PARAMETER] SerializerProvider provider [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REMOVE]^_delegateSerializer.acceptJsonFormatVisitor ( visitor, typeHint ) ;^102^^^^^98^104^[REMOVE] ^[METHOD] resolve [TYPE] void [PARAMETER] SerializerProvider provider [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^if  ( _delegateSerializer == null )  {^111^^^^^107^129^[REPLACE] if  ( _delegateSerializer != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^if  ( ! _delegateSerializer instanceof ContextualSerializer )  {^112^^^^^107^129^[REPLACE] if  ( _delegateSerializer instanceof ContextualSerializer )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^if  (true  !=  _delegateSerializer )  {^114^^^^^107^129^[REPLACE] if  ( ser == _delegateSerializer )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[ADD]^return this;^114^115^116^^^107^129^[ADD] if  ( ser == _delegateSerializer )  { return this; }^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^return null;^115^^^^^107^129^[REPLACE] return this;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^return withDelegate ( _converter, _delegateType, true ) ;^117^^^^^107^129^[REPLACE] return withDelegate ( _converter, _delegateType, ser ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^JsonSerializer<?> ser =  (  ( ContextualSerializer ) _delegateSerializer )  .createContextual ( provider , property )  ;^113^^^^^107^129^[REPLACE] JsonSerializer<?> ser =  (  ( ContextualSerializer ) _delegateSerializer ) .createContextual ( provider, property ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[ADD]^^113^^^^^107^129^[ADD] JsonSerializer<?> ser =  (  ( ContextualSerializer ) _delegateSerializer ) .createContextual ( provider, property ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^if  (this  !=  _delegateSerializer )  {^114^^^^^107^129^[REPLACE] if  ( ser == _delegateSerializer )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[ADD]^^114^115^116^^^107^129^[ADD] if  ( ser == _delegateSerializer )  { return this; }^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^return withDelegate ( _converter, _delegateType, null ) ;^117^^^^^107^129^[REPLACE] return withDelegate ( _converter, _delegateType, ser ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^return null;^119^^^^^107^129^[REPLACE] return this;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^if  ( ser  && null )  {^114^^^^^107^129^[REPLACE] if  ( ser == _delegateSerializer )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^if  ( ser  ||  _delegateSerializer )  {^114^^^^^107^129^[REPLACE] if  ( ser == _delegateSerializer )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^Object delegateValue = convertValue ( value ) ;^122^^^^^107^129^[REPLACE] JavaType delegateType = _delegateType;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^if  (_delegateType != null )  {^123^^^^^107^129^[REPLACE] if  ( delegateType == null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^delegateType =  _converter.getOutputType ( null.getTypeFactory (  )  ) ;^124^^^^^107^129^[REPLACE] delegateType = _converter.getOutputType ( provider.getTypeFactory (  )  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^return withDelegate ( _converter, _delegateType, ser ) ;^127^128^^^^107^129^[REPLACE] return withDelegate ( _converter, delegateType, provider.findValueSerializer ( delegateType, property )  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty property [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty property 
[REPLACE]^return withDelegate ( _converter, _delegateType, ser ) ;^138^^^^^137^139^[REPLACE] return _converter;^[METHOD] getConverter [TYPE] Converter [PARAMETER] [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true 
[REPLACE]^return withDelegate ( _converter, _delegateType, ser ) ;^143^^^^^142^144^[REPLACE] return _delegateSerializer;^[METHOD] getDelegatee [TYPE] JsonSerializer [PARAMETER] [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true 
[REPLACE]^Object delegateValue = convertValue ( delegateValue ) ;^156^^^^^153^163^[REPLACE] Object delegateValue = convertValue ( value ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider [CLASS] StdDelegatingSerializer   [TYPE]  JavaType _delegateType  delegateType  [TYPE]  boolean false  true  [TYPE]  Converter _converter  converter  [TYPE]  JsonGenerator jgen  [TYPE]  Object delegateValue  value  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  SerializerProvider provider 
[ADD]^^156^^^^^153^163^[ADD] Object delegateValue = convertValue ( value ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider [CLASS] StdDelegatingSerializer   [TYPE]  JavaType _delegateType  delegateType  [TYPE]  boolean false  true  [TYPE]  Converter _converter  converter  [TYPE]  JsonGenerator jgen  [TYPE]  Object delegateValue  value  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  SerializerProvider provider 
[REPLACE]^if  ( delegateValue != this  )  {^158^^^^^153^163^[REPLACE] if  ( delegateValue == null )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider [CLASS] StdDelegatingSerializer   [TYPE]  JavaType _delegateType  delegateType  [TYPE]  boolean false  true  [TYPE]  Converter _converter  converter  [TYPE]  JsonGenerator jgen  [TYPE]  Object delegateValue  value  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  SerializerProvider provider 
[REPLACE]^return _converter;^160^^^^^153^163^[REPLACE] return;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider [CLASS] StdDelegatingSerializer   [TYPE]  JavaType _delegateType  delegateType  [TYPE]  boolean false  true  [TYPE]  Converter _converter  converter  [TYPE]  JsonGenerator jgen  [TYPE]  Object delegateValue  value  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  SerializerProvider provider 
[REPLACE]^_delegateSerializer .serializeWithType ( delegateValue , jgen , provider , 1 )  ;^162^^^^^153^163^[REPLACE] _delegateSerializer.serialize ( delegateValue, jgen, provider ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider [CLASS] StdDelegatingSerializer   [TYPE]  JavaType _delegateType  delegateType  [TYPE]  boolean false  true  [TYPE]  Converter _converter  converter  [TYPE]  JsonGenerator jgen  [TYPE]  Object delegateValue  value  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  SerializerProvider provider 
[REPLACE]^Object delegateValue = convertValue ( delegateValue ) ;^173^^^^^166^175^[REPLACE] Object delegateValue = convertValue ( value ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] StdDelegatingSerializer   [TYPE]  JavaType _delegateType  delegateType  [TYPE]  boolean false  true  [TYPE]  TypeSerializer typeSer  [TYPE]  Converter _converter  converter  [TYPE]  JsonGenerator jgen  [TYPE]  Object delegateValue  value  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  SerializerProvider provider 
[REPLACE]^_delegateSerializer.acceptJsonFormatVisitor ( visitor, typeHint ) ;^174^^^^^166^175^[REPLACE] _delegateSerializer.serializeWithType ( delegateValue, jgen, provider, typeSer ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] StdDelegatingSerializer   [TYPE]  JavaType _delegateType  delegateType  [TYPE]  boolean false  true  [TYPE]  TypeSerializer typeSer  [TYPE]  Converter _converter  converter  [TYPE]  JsonGenerator jgen  [TYPE]  Object delegateValue  value  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  SerializerProvider provider 
[REPLACE]^Object delegateValue = convertValue ( delegateValue ) ;^180^^^^^178^182^[REPLACE] Object delegateValue = convertValue ( value ) ;^[METHOD] isEmpty [TYPE] boolean [PARAMETER] Object value [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  Object delegateValue  value  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true 
[REPLACE]^return _delegateSerializer.isEmpty ( value ) ;^181^^^^^178^182^[REPLACE] return _delegateSerializer.isEmpty ( delegateValue ) ;^[METHOD] isEmpty [TYPE] boolean [PARAMETER] Object value [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  Object delegateValue  value  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true 
[REPLACE]^if  ( ! null instanceof SchemaAware )  {^194^^^^^191^198^[REPLACE] if  ( _delegateSerializer instanceof SchemaAware )  {^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  Type typeHint  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^return  (  ( SchemaAware )  _delegateSerializer ) .getSchema ( provider, typeHint, isOptional ) ;^195^^^^^191^198^[REPLACE] return  (  ( SchemaAware )  _delegateSerializer ) .getSchema ( provider, typeHint ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  Type typeHint  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^return super .getSchema ( provider , typeHint , true )  ;^197^^^^^191^198^[REPLACE] return super.getSchema ( provider, typeHint ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  Type typeHint  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^if  ( ! _delegateSerializer instanceof SchemaAware )  {^204^^^^^201^208^[REPLACE] if  ( _delegateSerializer instanceof SchemaAware )  {^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint boolean isOptional [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  Type typeHint  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  isOptional  true  [TYPE]  SerializerProvider provider 
[REPLACE]^return  (  ( SchemaAware )  _delegateSerializer ) .getSchema ( provider, typeHint ) ;^205^^^^^201^208^[REPLACE] return  (  ( SchemaAware )  _delegateSerializer ) .getSchema ( provider, typeHint, isOptional ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint boolean isOptional [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  Type typeHint  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  isOptional  true  [TYPE]  SerializerProvider provider 
[REPLACE]^return super .getSchema ( provider , typeHint , true )  ;^207^^^^^201^208^[REPLACE] return super.getSchema ( provider, typeHint ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint boolean isOptional [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  [TYPE]  Type typeHint  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  isOptional  true  [TYPE]  SerializerProvider provider 
[REPLACE]^_delegateSerializer.acceptJsonFormatVisitor ( visitor, delegateType ) ;^217^^^^^211^218^[REPLACE] _delegateSerializer.acceptJsonFormatVisitor ( visitor, typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  typeHint  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[REPLACE]^return withDelegate ( _converter, _delegateType, ser ) ;^238^^^^^237^239^[REPLACE] return _converter.convert ( value ) ;^[METHOD] convertValue [TYPE] Object [PARAMETER] Object value [CLASS] StdDelegatingSerializer   [TYPE]  Converter _converter  converter  [TYPE]  JavaType _delegateType  delegateType  typeHint  [TYPE]  Object value  [TYPE]  JsonSerializer _delegateSerializer  delegateSerializer  ser  [TYPE]  boolean false  true 