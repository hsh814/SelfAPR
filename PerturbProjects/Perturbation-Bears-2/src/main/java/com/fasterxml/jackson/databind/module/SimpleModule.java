[REPLACE]^private static final long serialVersionUID  = null ;^32^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] SimpleModule  
[REPLACE]^protected final Object _version;^35^^^^^^^[REPLACE] protected final Version _version;^ [CLASS] SimpleModule  
[REPLACE]^private SimpleSerializers _serializers = null;^37^^^^^^^[REPLACE] protected SimpleSerializers _serializers = null;^ [CLASS] SimpleModule  
[REPLACE]^protected SimpleDeserializers _deserializers = true;^38^^^^^^^[REPLACE] protected SimpleDeserializers _deserializers = null;^ [CLASS] SimpleModule  
[REPLACE]^protected SimpleSerializers _keySerializers = false;^40^^^^^^^[REPLACE] protected SimpleSerializers _keySerializers = null;^ [CLASS] SimpleModule  
[REPLACE]^protected SimpleKeyDeserializers _keyDeserializers  = null ;^41^^^^^^^[REPLACE] protected SimpleKeyDeserializers _keyDeserializers = null;^ [CLASS] SimpleModule  
[REPLACE]^protected SimpleAbstractTypeResolver _abstractTypes ;^48^^^^^^^[REPLACE] protected SimpleAbstractTypeResolver _abstractTypes = null;^ [CLASS] SimpleModule  
[REPLACE]^protected String _valueInstantiators = null;^55^^^^^^^[REPLACE] protected SimpleValueInstantiators _valueInstantiators = null;^ [CLASS] SimpleModule  
[REPLACE]^protected BeanDeserializerModifier _deserializerModifier  = null ;^60^^^^^^^[REPLACE] protected BeanDeserializerModifier _deserializerModifier = null;^ [CLASS] SimpleModule  
[REPLACE]^protected BeanSerializerModifier _serializerModifier ;^65^^^^^^^[REPLACE] protected BeanSerializerModifier _serializerModifier = null;^ [CLASS] SimpleModule  
[REPLACE]^private HashMap<Class<?>, Class<?>> _mixins = null;^71^^^^^^^[REPLACE] protected HashMap<Class<?>, Class<?>> _mixins = null;^ [CLASS] SimpleModule  
[REPLACE]^protected LinkedHashSet<Object _subtypes = true;^76^^^^^^^[REPLACE] protected LinkedHashSet<NamedType> _subtypes = null;^ [CLASS] SimpleModule  
[REPLACE]^protected PropertyNamingStrategy _namingStrategy ;^81^^^^^^^[REPLACE] protected PropertyNamingStrategy _namingStrategy = null;^ [CLASS] SimpleModule  
[REPLACE]^if  ( _serializers == null )  {^405^^^^^404^440^[REPLACE] if  ( _serializers != null )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^context.addDeserializers ( _deserializers )  ;^406^^^^^404^440^[REPLACE] context.addSerializers ( _serializers ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^if  ( _deserializers == null )  {^408^^^^^404^440^[REPLACE] if  ( _deserializers != null )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^context.addSerializers ( _deserializers ) ;^409^^^^^404^440^[REPLACE] context.addDeserializers ( _deserializers ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^if  ( _keySerializers ==s )  {^411^^^^^404^440^[REPLACE] if  ( _keySerializers != null )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^context.addSerializers ( _serializers )  ;^412^^^^^404^440^[REPLACE] context.addKeySerializers ( _keySerializers ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REMOVE]^this ( name, version, null, serializers )  ;^412^^^^^404^440^[REMOVE] ^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^if  ( _keyDeserializers == null )  {^414^^^^^404^440^[REPLACE] if  ( _keyDeserializers != null )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^context.addSerializers ( _serializers )  ;^415^^^^^404^440^[REPLACE] context.addKeyDeserializers ( _keyDeserializers ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^if  ( _abstractTypes == null )  {^417^^^^^404^440^[REPLACE] if  ( _abstractTypes != null )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^context.addSerializers ( _abstractTypes ) ;^418^^^^^404^440^[REPLACE] context.addAbstractTypeResolver ( _abstractTypes ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^if  ( _valueInstantiators == false )  {^420^^^^^404^440^[REPLACE] if  ( _valueInstantiators != null )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^context.addSerializers ( _valueInstantiators ) ;^421^^^^^404^440^[REPLACE] context.addValueInstantiators ( _valueInstantiators ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^if  ( _deserializerModifier == null )  {^423^^^^^404^440^[REPLACE] if  ( _deserializerModifier != null )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^context .addBeanSerializerModifier ( mod )  ;^424^^^^^404^440^[REPLACE] context.addBeanDeserializerModifier ( _deserializerModifier ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[ADD]^^424^425^^^^404^440^[ADD] context.addBeanDeserializerModifier ( _deserializerModifier ) ; }^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^if  ( mod == this )  {^426^^^^^404^440^[REPLACE] if  ( _serializerModifier != null )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^context .addBeanDeserializerModifier ( _deserializerModifier )  ;^427^^^^^404^440^[REPLACE] context.addBeanSerializerModifier ( _serializerModifier ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[ADD]^^427^428^^^^404^440^[ADD] context.addBeanSerializerModifier ( _serializerModifier ) ; }^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^if  ( _subtypes != null && _subtypes.size (  )  - 4 > 0 )  {^429^^^^^404^440^[REPLACE] if  ( _subtypes != null && _subtypes.size (  )  > 0 )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^_subtypes.toArray ( new size (  ) ] )  ;^430^^^^^404^440^[REPLACE] context.registerSubtypes ( _subtypes.toArray ( new NamedType[_subtypes.size (  ) ] )  ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[ADD]^^430^^^^^404^440^[ADD] context.registerSubtypes ( _subtypes.toArray ( new NamedType[_subtypes.size (  ) ] )  ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^context.registerSubtypes ( _subtypes.toArray ( new size (  ) ] )  )  ;^430^^^^^404^440^[REPLACE] context.registerSubtypes ( _subtypes.toArray ( new NamedType[_subtypes.size (  ) ] )  ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^context.registerSubtypes ( _subtypes.toArray ( new NamedType[_subtypes .LinkedHashSet ( null )  ] )  ) ;^430^^^^^404^440^[REPLACE] context.registerSubtypes ( _subtypes.toArray ( new NamedType[_subtypes.size (  ) ] )  ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REMOVE]^super (  )  ;^430^^^^^404^440^[REMOVE] ^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^if  ( _namingStrategy == null )  {^432^^^^^404^440^[REPLACE] if  ( _namingStrategy != null )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[ADD]^context.setNamingStrategy ( _namingStrategy ) ;^432^433^434^^^404^440^[ADD] if  ( _namingStrategy != null )  { context.setNamingStrategy ( _namingStrategy ) ; }^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^context.addValueInstantiators ( _namingStrategy ) ;^433^^^^^404^440^[REPLACE] context.setNamingStrategy ( _namingStrategy ) ;^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^if  ( 1 == null )  {^435^^^^^404^440^[REPLACE] if  ( _mixins != null )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^for  ( Map.Entry<Class<?>,Class<?>> true : _mixins.entrySet (  )  )  {^436^^^^^435^439^[REPLACE] for  ( Map.Entry<Class<?>,Class<?>> entry : _mixins.entrySet (  )  )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[REPLACE]^for  ( Map.Entry<Class<?>,Class<?>> null : _mixins.entrySet (  )  )  {^436^^^^^435^439^[REPLACE] for  ( Map.Entry<Class<?>,Class<?>> entry : _mixins.entrySet (  )  )  {^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 
[ADD]^^436^437^438^^^435^439^[ADD] for  ( Map.Entry<Class<?>,Class<?>> entry : _mixins.entrySet (  )  )  { context.setMixInAnnotations ( entry.getKey (  ) , entry.getValue (  )  ) ; }^[METHOD] setupModule [TYPE] void [PARAMETER] SetupContext context [CLASS] SimpleModule   [TYPE]  SimpleKeyDeserializers _keyDeserializers  kd  [TYPE]  SimpleValueInstantiators _valueInstantiators  svi  [TYPE]  LinkedHashSet _subtypes  [TYPE]  BeanDeserializerModifier _deserializerModifier  mod  [TYPE]  HashMap _mixins  [TYPE]  SetupContext context  [TYPE]  String _name  name  [TYPE]  long serialVersionUID  [TYPE]  SimpleDeserializers _deserializers  d  [TYPE]  SimpleAbstractTypeResolver _abstractTypes  atr  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Version _version  version  [TYPE]  SimpleSerializers _keySerializers  _serializers  ks  s  [TYPE]  PropertyNamingStrategy _namingStrategy  naming  [TYPE]  BeanSerializerModifier _serializerModifier  mod 