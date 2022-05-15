[buglab_swap_variables]^return serialize ( typeOfSrc, src, true ) ;^49^^^^^48^50^return serialize ( src, typeOfSrc, true ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc [VARIABLES] MemoryRefStack  ancestors  Object  src  Type  typeOfSrc  boolean  serializeNulls  ParameterizedTypeHandlerMap  serializers  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^return serialize (  typeOfSrc, true ) ;^49^^^^^48^50^return serialize ( src, typeOfSrc, true ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc [VARIABLES] MemoryRefStack  ancestors  Object  src  Type  typeOfSrc  boolean  serializeNulls  ParameterizedTypeHandlerMap  serializers  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^return serialize ( src,  true ) ;^49^^^^^48^50^return serialize ( src, typeOfSrc, true ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc [VARIABLES] MemoryRefStack  ancestors  Object  src  Type  typeOfSrc  boolean  serializeNulls  ParameterizedTypeHandlerMap  serializers  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^ObjectNavigator on = factory.create ( new ObjectTypePair ( typeOfSrc, src, preserveType )  ) ;^53^^^^^52^58^ObjectNavigator on = factory.create ( new ObjectTypePair ( src, typeOfSrc, preserveType )  ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^ObjectNavigator on = factory.create ( new ObjectTypePair (  typeOfSrc, preserveType )  ) ;^53^^^^^52^58^ObjectNavigator on = factory.create ( new ObjectTypePair ( src, typeOfSrc, preserveType )  ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^ObjectNavigator on = factory.create ( new ObjectTypePair ( src,  preserveType )  ) ;^53^^^^^52^58^ObjectNavigator on = factory.create ( new ObjectTypePair ( src, typeOfSrc, preserveType )  ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^ObjectNavigator on = factory.create ( new ObjectTypePair ( preserveType, typeOfSrc, src )  ) ;^53^^^^^52^58^ObjectNavigator on = factory.create ( new ObjectTypePair ( src, typeOfSrc, preserveType )  ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^ObjectNavigator on = factory.create ( new ObjectTypePair ( src, typeOfSrc )  ) ;^53^^^^^52^58^ObjectNavigator on = factory.create ( new ObjectTypePair ( src, typeOfSrc, preserveType )  ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^ObjectNavigator on = typeOfSrc.create ( new ObjectTypePair ( src, factory, preserveType )  ) ;^53^^^^^52^58^ObjectNavigator on = factory.create ( new ObjectTypePair ( src, typeOfSrc, preserveType )  ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^ObjectNavigator on = factory.create ( new ObjectTypePair ( src, preserveType, typeOfSrc )  ) ;^53^^^^^52^58^ObjectNavigator on = factory.create ( new ObjectTypePair ( src, typeOfSrc, preserveType )  ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^ObjectNavigator on = src.create ( new ObjectTypePair ( factory, typeOfSrc, preserveType )  ) ;^53^^^^^52^58^ObjectNavigator on = factory.create ( new ObjectTypePair ( src, typeOfSrc, preserveType )  ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^ObjectNavigator on = preserveType.create ( new ObjectTypePair ( src, typeOfSrc, factory )  ) ;^53^^^^^52^58^ObjectNavigator on = factory.create ( new ObjectTypePair ( src, typeOfSrc, preserveType )  ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^new JsonSerializationVisitor ( ancestors, serializeNulls, serializers, this, factory ) ;^55^^^^^52^58^new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^new JsonSerializationVisitor (  serializeNulls, serializers, this, ancestors ) ;^55^^^^^52^58^new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^new JsonSerializationVisitor ( serializeNulls, factory, serializers, this, ancestors ) ;^55^^^^^52^58^new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^new JsonSerializationVisitor ( factory,  serializers, this, ancestors ) ;^55^^^^^52^58^new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^new JsonSerializationVisitor ( factory, serializers, serializeNulls, this, ancestors ) ;^55^^^^^52^58^new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^new JsonSerializationVisitor ( factory, serializeNulls,  this, ancestors ) ;^55^^^^^52^58^new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^new JsonSerializationVisitor ( factory, serializeNulls, ancestors, this, serializers ) ;^55^^^^^52^58^new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^new JsonSerializationVisitor ( factory, serializeNulls, serializers, this ) ;^55^^^^^52^58^new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( serializers, serializeNulls, factory, this, ancestors ) ;^54^55^^^^52^58^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^JsonSerializationVisitor visitor = new JsonSerializationVisitor (  serializeNulls, serializers, this, ancestors ) ;^54^55^^^^52^58^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( factory, serializers, serializeNulls, this, ancestors ) ;^54^55^^^^52^58^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( factory,  serializers, this, ancestors ) ;^54^55^^^^52^58^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( factory, serializeNulls,  this, ancestors ) ;^54^55^^^^52^58^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( ancestors, serializeNulls, serializers, this, factory ) ;^54^55^^^^52^58^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  
[buglab_swap_variables]^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( factory, serializeNulls, serializers, this ) ;^54^55^^^^52^58^JsonSerializationVisitor visitor = new JsonSerializationVisitor ( factory, serializeNulls, serializers, this, ancestors ) ;^[CLASS] JsonSerializationContextDefault  [METHOD] serialize [RETURN_TYPE] JsonElement   Object src Type typeOfSrc boolean preserveType [VARIABLES] Type  typeOfSrc  boolean  preserveType  serializeNulls  ObjectNavigator  on  MemoryRefStack  ancestors  Object  src  ParameterizedTypeHandlerMap  serializers  JsonSerializationVisitor  visitor  ObjectNavigatorFactory  factory  