[REPLACE]^private  final long serialVersionUID = 1L;^22^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] UnwrappingXmlBeanSerializer  
[REPLACE]^protected  NameTransformer _nameTransformer;^28^^^^^^^[REPLACE] protected final NameTransformer _nameTransformer;^ [CLASS] UnwrappingXmlBeanSerializer  
[REPLACE]^super ( src, objectIdWriter, filterId ) ;^42^^^^^40^44^[REPLACE] super ( src, transformer ) ;^[METHOD] <init> [TYPE] NameTransformer) [PARAMETER] XmlBeanSerializerBase src NameTransformer transformer [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  XmlBeanSerializerBase src 
[REPLACE]^_nameTransformer = src._nameTransformer; ;^43^^^^^40^44^[REPLACE] _nameTransformer = transformer;^[METHOD] <init> [TYPE] NameTransformer) [PARAMETER] XmlBeanSerializerBase src NameTransformer transformer [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  XmlBeanSerializerBase src 
[REPLACE]^super ( src, objectIdWriter, filterId ) ;^48^^^^^46^50^[REPLACE] super ( src, objectIdWriter ) ;^[METHOD] <init> [TYPE] ObjectIdWriter) [PARAMETER] UnwrappingXmlBeanSerializer src ObjectIdWriter objectIdWriter [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  UnwrappingXmlBeanSerializer src  [TYPE]  ObjectIdWriter objectIdWriter  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^_nameTransformer = transformer; ;^49^^^^^46^50^[REPLACE] _nameTransformer = src._nameTransformer;^[METHOD] <init> [TYPE] ObjectIdWriter) [PARAMETER] UnwrappingXmlBeanSerializer src ObjectIdWriter objectIdWriter [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  UnwrappingXmlBeanSerializer src  [TYPE]  ObjectIdWriter objectIdWriter  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^49^50^^^^46^50^[ADD] _nameTransformer = src._nameTransformer; }^[METHOD] <init> [TYPE] ObjectIdWriter) [PARAMETER] UnwrappingXmlBeanSerializer src ObjectIdWriter objectIdWriter [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  UnwrappingXmlBeanSerializer src  [TYPE]  ObjectIdWriter objectIdWriter  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^super ( src, toIgnore ) ;^54^^^^^52^56^[REPLACE] super ( src, objectIdWriter, filterId ) ;^[METHOD] <init> [TYPE] Object) [PARAMETER] UnwrappingXmlBeanSerializer src ObjectIdWriter objectIdWriter Object filterId [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  UnwrappingXmlBeanSerializer src  [TYPE]  Object filterId  [TYPE]  ObjectIdWriter objectIdWriter  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^_nameTransformer = transformer; ;^55^^^^^52^56^[REPLACE] _nameTransformer = src._nameTransformer;^[METHOD] <init> [TYPE] Object) [PARAMETER] UnwrappingXmlBeanSerializer src ObjectIdWriter objectIdWriter Object filterId [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  UnwrappingXmlBeanSerializer src  [TYPE]  Object filterId  [TYPE]  ObjectIdWriter objectIdWriter  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^super ( src, objectIdWriter, filterId ) ;^60^^^^^58^62^[REPLACE] super ( src, toIgnore ) ;^[METHOD] <init> [TYPE] String[]) [PARAMETER] UnwrappingXmlBeanSerializer src String[] toIgnore [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  UnwrappingXmlBeanSerializer src  [TYPE]  String[] toIgnore  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^_nameTransformer = transformer; ;^61^^^^^58^62^[REPLACE] _nameTransformer = src._nameTransformer;^[METHOD] <init> [TYPE] String[]) [PARAMETER] UnwrappingXmlBeanSerializer src String[] toIgnore [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  UnwrappingXmlBeanSerializer src  [TYPE]  String[] toIgnore  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return new UnwrappingXmlBeanSerializer ( this, toIgnore ) ;^74^^^^^71^75^[REPLACE] return new UnwrappingXmlBeanSerializer ( this, transformer ) ;^[METHOD] unwrappingSerializer [TYPE] JsonSerializer [PARAMETER] NameTransformer transformer [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return false;^80^^^^^78^81^[REPLACE] return true;^[METHOD] isUnwrappingSerializer [TYPE] boolean [PARAMETER] [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return  new UnwrappingXmlBeanSerializer ( this, toIgnore )  ;^86^^^^^84^87^[REPLACE] return new UnwrappingXmlBeanSerializer ( this, objectIdWriter ) ;^[METHOD] withObjectIdWriter [TYPE] BeanSerializerBase [PARAMETER] ObjectIdWriter objectIdWriter [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  ObjectIdWriter objectIdWriter  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return  new UnwrappingXmlBeanSerializer ( this, toIgnore )  ;^92^^^^^90^93^[REPLACE] return new UnwrappingXmlBeanSerializer ( this, _objectIdWriter, filterId ) ;^[METHOD] withFilterId [TYPE] BeanSerializerBase [PARAMETER] Object filterId [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  Object filterId  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return  new UnwrappingXmlBeanSerializer ( this, objectIdWriter )  ;^98^^^^^96^99^[REPLACE] return new UnwrappingXmlBeanSerializer ( this, toIgnore ) ;^[METHOD] withIgnorals [TYPE] BeanSerializerBase [PARAMETER] String[] toIgnore [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  String[] toIgnore  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^108^^^^^106^109^[REPLACE] return this;^[METHOD] asArraySerializer [TYPE] BeanSerializerBase [PARAMETER] [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( _objectIdWriter == true )  {^125^^^^^122^134^[REPLACE] if  ( _objectIdWriter != null )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object bean JsonGenerator jgen SerializerProvider provider [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  JsonGenerator jgen  [TYPE]  Object bean  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  long serialVersionUID 
[ADD]^_serializeWithObjectId ( bean, jgen, provider, false ) ;return;^125^126^127^128^^122^134^[ADD] if  ( _objectIdWriter != null )  { _serializeWithObjectId ( bean, jgen, provider, false ) ; return; }^[METHOD] serialize [TYPE] void [PARAMETER] Object bean JsonGenerator jgen SerializerProvider provider [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  JsonGenerator jgen  [TYPE]  Object bean  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^127^^^^^122^134^[REPLACE] return;^[METHOD] serialize [TYPE] void [PARAMETER] Object bean JsonGenerator jgen SerializerProvider provider [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  JsonGenerator jgen  [TYPE]  Object bean  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _propertyFilterId == this )  {^129^^^^^122^134^[REPLACE] if  ( _propertyFilterId != null )  {^[METHOD] serialize [TYPE] void [PARAMETER] Object bean JsonGenerator jgen SerializerProvider provider [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  JsonGenerator jgen  [TYPE]  Object bean  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  long serialVersionUID 
[ADD]^^129^130^131^132^133^122^134^[ADD] if  ( _propertyFilterId != null )  { serializeFieldsFiltered ( bean, jgen, provider ) ; } else { serializeFields ( bean, jgen, provider ) ; }^[METHOD] serialize [TYPE] void [PARAMETER] Object bean JsonGenerator jgen SerializerProvider provider [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  JsonGenerator jgen  [TYPE]  Object bean  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  long serialVersionUID 
[REPLACE]^serializeFieldsFiltered ( bean, jgen, provider ) ;^132^^^^^122^134^[REPLACE] serializeFields ( bean, jgen, provider ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object bean JsonGenerator jgen SerializerProvider provider [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  JsonGenerator jgen  [TYPE]  Object bean  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  long serialVersionUID 
[ADD]^^132^^^^^122^134^[ADD] serializeFields ( bean, jgen, provider ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object bean JsonGenerator jgen SerializerProvider provider [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  JsonGenerator jgen  [TYPE]  Object bean  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  long serialVersionUID 
[REPLACE]^_serializeWithObjectId ( bean, jgen, provider, false ) ;^130^^^^^122^134^[REPLACE] serializeFieldsFiltered ( bean, jgen, provider ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object bean JsonGenerator jgen SerializerProvider provider [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  JsonGenerator jgen  [TYPE]  Object bean  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  long serialVersionUID 
[ADD]^^130^^^^^122^134^[ADD] serializeFieldsFiltered ( bean, jgen, provider ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object bean JsonGenerator jgen SerializerProvider provider [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  JsonGenerator jgen  [TYPE]  Object bean  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  long serialVersionUID 
[REPLACE]^return false ;^145^^^^^143^146^[REPLACE] return "UnwrappingXmlBeanSerializer for " + handledType (  ) .getName (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] UnwrappingXmlBeanSerializer   [TYPE]  NameTransformer _nameTransformer  transformer  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 