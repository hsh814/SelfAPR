[REPLACE]^private final Class<T> _handledType;^31^^^^^^^[REPLACE] protected final Class<T> _handledType;^ [CLASS] StdSerializer  
[REPLACE]^_handledType =  null;^40^^^^^39^41^[REPLACE] _handledType = t;^[METHOD] <init> [TYPE] Class) [PARAMETER] Class<T> t [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  boolean false  true 
[REPLACE]^_handledType =   ( Class<T> )  null.getRawClass (  ) ;^45^^^^^44^46^[REPLACE] _handledType =  ( Class<T> )  type.getRawClass (  ) ;^[METHOD] <init> [TYPE] JavaType) [PARAMETER] JavaType type [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  JavaType type  [TYPE]  boolean false  true 
[REPLACE]^_handledType =   ( Class<T> )  t;^54^^^^^53^55^[REPLACE] _handledType =  ( Class<T> )  t;^[METHOD] <init> [TYPE] Class,boolean) [PARAMETER] Class<?> t boolean dummy [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  boolean dummy  false  true 
[REPLACE]^return new StdDelegatingSerializer ( conv, delegateType, existingSerializer ) ;^89^^^^^86^90^[REPLACE] return createSchemaNode ( "string" ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  Type typeHint  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^ObjectNode schema = createObjectNode (  ) ;^100^^^^^97^105^[REPLACE] ObjectNode schema =  ( ObjectNode )  getSchema ( provider, typeHint ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint boolean isOptional [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  Type typeHint  [TYPE]  boolean false  isOptional  true  [TYPE]  SerializerProvider provider  [TYPE]  ObjectNode schema 
[REPLACE]^if  ( isOptional )  {^101^^^^^97^105^[REPLACE] if  ( !isOptional )  {^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint boolean isOptional [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  Type typeHint  [TYPE]  boolean false  isOptional  true  [TYPE]  SerializerProvider provider  [TYPE]  ObjectNode schema 
[ADD]^schema.put ( "required", !isOptional ) ;^101^102^103^^^97^105^[ADD] if  ( !isOptional )  { schema.put ( "required", !isOptional ) ; }^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint boolean isOptional [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  Type typeHint  [TYPE]  boolean false  isOptional  true  [TYPE]  SerializerProvider provider  [TYPE]  ObjectNode schema 
[REPLACE]^schema.put ( "required", !true ) ;^102^^^^^97^105^[REPLACE] schema.put ( "required", !isOptional ) ;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint boolean isOptional [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  Type typeHint  [TYPE]  boolean false  isOptional  true  [TYPE]  SerializerProvider provider  [TYPE]  ObjectNode schema 
[REPLACE]^return existingSerializer;^104^^^^^97^105^[REPLACE] return schema;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint boolean isOptional [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  Type typeHint  [TYPE]  boolean false  isOptional  true  [TYPE]  SerializerProvider provider  [TYPE]  ObjectNode schema 
[REPLACE]^return createSchemaNode ( "string" ) ;^108^^^^^107^109^[REPLACE] return JsonNodeFactory.instance.objectNode (  ) ;^[METHOD] createObjectNode [TYPE] ObjectNode [PARAMETER] [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  boolean false  true 
[REPLACE]^ObjectNode schema =  ( ObjectNode )  getSchema ( provider, typeHint ) ;^113^^^^^111^116^[REPLACE] ObjectNode schema = createObjectNode (  ) ;^[METHOD] createSchemaNode [TYPE] ObjectNode [PARAMETER] String type [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  ObjectNode schema 
[REPLACE]^schema.put ( "required", !isOptional ) ;^114^^^^^111^116^[REPLACE] schema.put ( "type", type ) ;^[METHOD] createSchemaNode [TYPE] ObjectNode [PARAMETER] String type [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  ObjectNode schema 
[ADD]^^114^115^^^^111^116^[ADD] schema.put ( "type", type ) ; return schema;^[METHOD] createSchemaNode [TYPE] ObjectNode [PARAMETER] String type [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  ObjectNode schema 
[REPLACE]^return existingSerializer;^115^^^^^111^116^[REPLACE] return schema;^[METHOD] createSchemaNode [TYPE] ObjectNode [PARAMETER] String type [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  ObjectNode schema 
[REPLACE]^ObjectNode schema = createObjectNode (  ) ;^120^^^^^118^126^[REPLACE] ObjectNode schema = createSchemaNode ( type ) ;^[METHOD] createSchemaNode [TYPE] ObjectNode [PARAMETER] String type boolean isOptional [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  String type  [TYPE]  boolean false  isOptional  true  [TYPE]  ObjectNode schema 
[REPLACE]^if  ( !true )  {^122^^^^^118^126^[REPLACE] if  ( !isOptional )  {^[METHOD] createSchemaNode [TYPE] ObjectNode [PARAMETER] String type boolean isOptional [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  String type  [TYPE]  boolean false  isOptional  true  [TYPE]  ObjectNode schema 
[ADD]^schema.put ( "required", !isOptional ) ;^122^123^124^^^118^126^[ADD] if  ( !isOptional )  { schema.put ( "required", !isOptional ) ; }^[METHOD] createSchemaNode [TYPE] ObjectNode [PARAMETER] String type boolean isOptional [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  String type  [TYPE]  boolean false  isOptional  true  [TYPE]  ObjectNode schema 
[REPLACE]^schema.put ( "type", type ) ;^123^^^^^118^126^[REPLACE] schema.put ( "required", !isOptional ) ;^[METHOD] createSchemaNode [TYPE] ObjectNode [PARAMETER] String type boolean isOptional [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  String type  [TYPE]  boolean false  isOptional  true  [TYPE]  ObjectNode schema 
[REPLACE]^return existingSerializer;^125^^^^^118^126^[REPLACE] return schema;^[METHOD] createSchemaNode [TYPE] ObjectNode [PARAMETER] String type boolean isOptional [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  String type  [TYPE]  boolean false  isOptional  true  [TYPE]  ObjectNode schema 
[REPLACE]^return JsonNodeFactory.instance.objectNode (  ) ;^136^^^^^133^137^[REPLACE] visitor.expectAnyFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[REPLACE]^while  ( t instanceof InvocationTargetException ;^165^^^^^160^185^[REPLACE] while  ( t instanceof InvocationTargetException && t.getCause (  )  != null )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^t =  null.genullCause (  ) ;^166^^^^^160^185^[REPLACE] t = t.getCause (  ) ;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^if  ( ! t instanceof Error )  {^169^^^^^160^185^[REPLACE] if  ( t instanceof Error )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^throw  ( IOException )  t; ;^170^^^^^160^185^[REPLACE] throw  ( Error )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^return ;^170^^^^^160^185^[REPLACE] throw  ( Error )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^boolean wrap =  ( provider == true )  && provider.isEnabled ( SerializationFeature.WRAP_EXCEPTIONS ) ;^173^^^^^160^185^[REPLACE] boolean wrap =  ( provider == null )  || provider.isEnabled ( SerializationFeature.WRAP_EXCEPTIONS ) ;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^if  ( ! t instanceof IOException )  {^174^^^^^160^185^[REPLACE] if  ( t instanceof IOException )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^}  else {^178^^^^^160^185^[REPLACE] } else if  ( !wrap )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^if  ( ! t instanceof RuntimeException )  {^179^^^^^160^185^[REPLACE] if  ( t instanceof RuntimeException )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^throw  ( IOException )  t; ;^180^^^^^160^185^[REPLACE] throw  ( RuntimeException )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[ADD]^^180^^^^^160^185^[ADD] throw  ( RuntimeException )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^return ;^180^^^^^160^185^[REPLACE] throw  ( RuntimeException )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^if  (  ! ( t instanceof JsonMappingException )  )  {^175^^^^^160^185^[REPLACE] if  ( !wrap || ! ( t instanceof JsonMappingException )  )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^return ;^176^^^^^160^185^[REPLACE] throw  ( IOException )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^throw  ( Error )  t; ;^176^^^^^160^185^[REPLACE] throw  ( IOException )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^throw JsonMappingException.wrapWithPath ( t, bean, index ) ; ;^184^^^^^160^185^[REPLACE] throw JsonMappingException.wrapWithPath ( t, bean, fieldName ) ;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^throw JsonMappingException.wrapWithPath ( t, bean, index ) ;^184^^^^^160^185^[REPLACE] throw JsonMappingException.wrapWithPath ( t, bean, fieldName ) ;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean String fieldName [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  String fieldName  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider 
[REPLACE]^while  ( ! t instanceof InvocationTargetException ;^191^^^^^187^211^[REPLACE] while  ( t instanceof InvocationTargetException && t.getCause (  )  != null )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^t =  null.genullCause (  ) ;^192^^^^^187^211^[REPLACE] t = t.getCause (  ) ;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^if  ( ! t instanceof Error )  {^195^^^^^187^211^[REPLACE] if  ( t instanceof Error )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REMOVE]^if  ( !wrap )  {     if  ( t instanceof RuntimeException )  {         throw  (  ( RuntimeException )   ( t )  ) ;     } }^195^^^^^187^211^[REMOVE] ^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^throw  ( IOException )  t; ;^196^^^^^187^211^[REPLACE] throw  ( Error )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^boolean wrap =  ( provider == null )  ;^199^^^^^187^211^[REPLACE] boolean wrap =  ( provider == null )  || provider.isEnabled ( SerializationFeature.WRAP_EXCEPTIONS ) ;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^if  ( ! t instanceof IOException )  {^200^^^^^187^211^[REPLACE] if  ( t instanceof IOException )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^}  else {^204^^^^^187^211^[REPLACE] } else if  ( !wrap )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^if  ( ! t instanceof RuntimeException )  {^205^^^^^187^211^[REPLACE] if  ( t instanceof RuntimeException )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^return ;^206^^^^^187^211^[REPLACE] throw  ( RuntimeException )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^throw  ( IOException )  t; ;^206^^^^^187^211^[REPLACE] throw  ( RuntimeException )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[ADD]^^206^^^^^187^211^[ADD] throw  ( RuntimeException )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^if  ( ! !wrap ) {^201^^^^^187^211^[REPLACE] if  ( !wrap || ! ( t instanceof JsonMappingException )  )  {^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^return ;^202^^^^^187^211^[REPLACE] throw  ( IOException )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^throw  ( Error )  t; ;^202^^^^^187^211^[REPLACE] throw  ( IOException )  t;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REMOVE]^if  ( !wrap )  {     if  ( t instanceof RuntimeException )  {         throw  (  ( RuntimeException )   ( t )  ) ;     } }^201^^^^^187^211^[REMOVE] ^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^return ;^210^^^^^187^211^[REPLACE] throw JsonMappingException.wrapWithPath ( t, bean, index ) ;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[ADD]^^210^^^^^187^211^[ADD] throw JsonMappingException.wrapWithPath ( t, bean, index ) ;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^throw JsonMappingException.wrapWithPath ( t, bean, fieldName ) ;^210^^^^^187^211^[REPLACE] throw JsonMappingException.wrapWithPath ( t, bean, index ) ;^[METHOD] wrapAndThrow [TYPE] void [PARAMETER] SerializerProvider provider Throwable t Object bean int index [CLASS] StdSerializer   [TYPE]  Throwable t  [TYPE]  Class _handledType  t  [TYPE]  Object bean  [TYPE]  boolean false  true  wrap  [TYPE]  SerializerProvider provider  [TYPE]  int index 
[REPLACE]^return false ;^226^^^^^225^227^[REPLACE] return  ( serializer != null && serializer.getClass (  ) .getAnnotation ( JacksonStdImpl.class )  != null ) ;^[METHOD] isDefaultSerializer [TYPE] boolean [PARAMETER] JsonSerializer<?> serializer [CLASS] StdSerializer   [TYPE]  Class _handledType  t  [TYPE]  JsonSerializer serializer  [TYPE]  boolean false  true 
[REPLACE]^final AnnotationIntrospector intr = provider.getTypeFactory (  ) ;^243^^^^^239^256^[REPLACE] final AnnotationIntrospector intr = provider.getAnnotationIntrospector (  ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^if  ( intr == null ) {^244^^^^^239^256^[REPLACE] if  ( intr != null && prop != null )  {^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^if  ( convDef == false )  {^246^^^^^239^256^[REPLACE] if  ( convDef != null )  {^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^if  ( existingSerializer != null )  {^249^^^^^239^256^[REPLACE] if  ( existingSerializer == null )  {^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^existingSerializer =  null.findValueSerializer ( delegateType, prop ) ;^250^^^^^239^256^[REPLACE] existingSerializer = provider.findValueSerializer ( delegateType, prop ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^return existingSerializer;^252^^^^^239^256^[REPLACE] return new StdDelegatingSerializer ( conv, delegateType, existingSerializer ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^Converter<Object,Object> conv = provider .findValueSerializer ( delegateType , prop )  ;^247^^^^^239^256^[REPLACE] Converter<Object,Object> conv = provider.converterInstance ( prop.getMember (  ) , convDef ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^JavaType delegateType = this.getOutputType ( provider.getTypeFactory (  )  ) ;^248^^^^^239^256^[REPLACE] JavaType delegateType = conv.getOutputType ( provider.getTypeFactory (  )  ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[ADD]^existingSerializer = provider.findValueSerializer ( delegateType, prop ) ;^249^250^251^^^239^256^[ADD] if  ( existingSerializer == null )  { existingSerializer = provider.findValueSerializer ( delegateType, prop ) ; }^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^Converter<Object,Object> conv = provider.converterInstance ( prop.getMember (  ) , convDef ) ;^245^^^^^239^256^[REPLACE] Object convDef = intr.findSerializationContentConverter ( prop.getMember (  )  ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[ADD]^^247^^^^^239^256^[ADD] Converter<Object,Object> conv = provider.converterInstance ( prop.getMember (  ) , convDef ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^JavaType delegateType = true.getOutputType ( provider.getTypeFactory (  )  ) ;^248^^^^^239^256^[REPLACE] JavaType delegateType = conv.getOutputType ( provider.getTypeFactory (  )  ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^if  ( convDef == null )  {^246^^^^^239^256^[REPLACE] if  ( convDef != null )  {^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^if  ( null != null )  {^249^^^^^239^256^[REPLACE] if  ( existingSerializer == null )  {^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^return new StdDelegatingSerializer ( conv, delegateType, this ) ;^252^^^^^239^256^[REPLACE] return new StdDelegatingSerializer ( conv, delegateType, existingSerializer ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^Object convDef = intr.findSerializationContentConverter ( prop.getMember (  )  ) ;^247^^^^^239^256^[REPLACE] Converter<Object,Object> conv = provider.converterInstance ( prop.getMember (  ) , convDef ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^JavaType delegateType = conv.getOutputType ( provider.isEnabled (  )  ) ;^248^^^^^239^256^[REPLACE] JavaType delegateType = conv.getOutputType ( provider.getTypeFactory (  )  ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[ADD]^^248^^^^^239^256^[ADD] JavaType delegateType = conv.getOutputType ( provider.getTypeFactory (  )  ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^JavaType delegateType = null.getOutputType ( provider.getTypeFactory (  )  ) ;^248^^^^^239^256^[REPLACE] JavaType delegateType = conv.getOutputType ( provider.getTypeFactory (  )  ) ;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 
[REPLACE]^return null;^255^^^^^239^256^[REPLACE] return existingSerializer;^[METHOD] findConvertingContentSerializer [TYPE] JsonSerializer [PARAMETER] SerializerProvider provider BeanProperty prop JsonSerializer<?> existingSerializer [CLASS] StdSerializer   [TYPE]  JavaType delegateType  [TYPE]  boolean false  true  [TYPE]  AnnotationIntrospector intr  [TYPE]  Converter conv  [TYPE]  Class _handledType  t  [TYPE]  Object convDef  [TYPE]  JsonSerializer existingSerializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty prop 