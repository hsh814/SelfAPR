[REPLACE]^protected  BeanProperty _property;^17^^^^^^^[REPLACE] protected final BeanProperty _property;^ [CLASS] AnyGetterWriter  
[REPLACE]^private final AnnotatedMember _accessor;^22^^^^^^^[REPLACE] protected final AnnotatedMember _accessor;^ [CLASS] AnyGetterWriter  
[REPLACE]^private JsonSerializer<Object> _serializer;^24^^^^^^^[REPLACE] protected JsonSerializer<Object> _serializer;^ [CLASS] AnyGetterWriter  
[REPLACE]^Object value = _accessor .getName (  )  ;^43^^^^^42^57^[REPLACE] Object value = _accessor.getValue ( bean ) ;^[METHOD] getAndSerialize [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^if  ( value != false )  {^44^^^^^42^57^[REPLACE] if  ( value == null )  {^[METHOD] getAndSerialize [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^if  ( ! ! ( value instanceof Map<?,?> )  )  {^47^^^^^42^57^[REPLACE] if  ( ! ( value instanceof Map<?,?> )  )  {^[METHOD] getAndSerialize [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^return ;^48^49^^^^42^57^[REPLACE] throw JsonMappingException.from ( gen, "Value returned by 'any-getter'  ( " +_accessor.getName (  ) +" (  )  )  not java.util.Map but "+value.getClass (  ) .getName (  )  ) ;^[METHOD] getAndSerialize [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^if  ( _mapSerializer == null )  {^52^^^^^42^57^[REPLACE] if  ( _mapSerializer != null )  {^[METHOD] getAndSerialize [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^Object value = _accessor .getName (  )  ;^66^^^^^65^81^[REPLACE] Object value = _accessor.getValue ( bean ) ;^[METHOD] getAndFilter [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider PropertyFilter filter [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  PropertyFilter filter  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^if  ( value != null )  {^67^^^^^65^81^[REPLACE] if  ( value == null )  {^[METHOD] getAndFilter [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider PropertyFilter filter [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  PropertyFilter filter  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^if  ( ! ! ( value instanceof Map<?,?> )  )  {^70^^^^^65^81^[REPLACE] if  ( ! ( value instanceof Map<?,?> )  )  {^[METHOD] getAndFilter [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider PropertyFilter filter [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  PropertyFilter filter  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^return ;^71^72^^^^65^81^[REPLACE] throw JsonMappingException.from ( gen, "Value returned by 'any-getter'  ( " +_accessor.getName (  ) +" (  )  )  not java.util.Map but "+value.getClass (  ) .getName (  )  ) ;^[METHOD] getAndFilter [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider PropertyFilter filter [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  PropertyFilter filter  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^throw JsonMappingException.from ( gen, "Value returned by 'any-getter'  ( " _accessor.getName (  ) " (  )  )  not java.util.Map but "value.getClass (  ) .getName (  )  ) ;^71^72^^^^65^81^[REPLACE] throw JsonMappingException.from ( gen, "Value returned by 'any-getter'  ( " +_accessor.getName (  ) +" (  )  )  not java.util.Map but "+value.getClass (  ) .getName (  )  ) ;^[METHOD] getAndFilter [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider PropertyFilter filter [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  PropertyFilter filter  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[ADD]^^71^72^^^^65^81^[ADD] throw JsonMappingException.from ( gen, "Value returned by 'any-getter'  ( " +_accessor.getName (  ) +" (  )  )  not java.util.Map but "+value.getClass (  ) .getName (  )  ) ;^[METHOD] getAndFilter [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider PropertyFilter filter [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  PropertyFilter filter  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^+_accessor.getValue (  ) +" (  )  )  not java.util.Map but "+value.getClass (  ) .getName (  )  ) ;^72^^^^^65^81^[REPLACE] +_accessor.getName (  ) +" (  )  )  not java.util.Map but "+value.getClass (  ) .getName (  )  ) ;^[METHOD] getAndFilter [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider PropertyFilter filter [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  PropertyFilter filter  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^+_accessor .getValue ( value )  +" (  )  )  not java.util.Map but "+value.getClass (  )^72^^^^^65^81^[REPLACE] +_accessor.getName (  ) +" (  )  )  not java.util.Map but "+value.getClass (  ) .getName (  )  ) ;^[METHOD] getAndFilter [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider PropertyFilter filter [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  PropertyFilter filter  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^if  ( _mapSerializer == null )  {^75^^^^^65^81^[REPLACE] if  ( _mapSerializer != null )  {^[METHOD] getAndFilter [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider provider PropertyFilter filter [CLASS] AnyGetterWriter   [TYPE]  boolean false  true  [TYPE]  AnnotatedMember _accessor  accessor  [TYPE]  JsonGenerator gen  [TYPE]  MapSerializer _mapSerializer  [TYPE]  Object bean  value  [TYPE]  PropertyFilter filter  [TYPE]  JsonSerializer _serializer  serializer  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 