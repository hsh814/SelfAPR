[REPLACE]^protected  ObjectNavigatorFactory factory;^31^^^^^^^[REPLACE] protected final ObjectNavigatorFactory factory;^ [CLASS] JsonDeserializationVisitor  
[REPLACE]^protected  ObjectConstructor objectConstructor;^32^^^^^^^[REPLACE] protected final ObjectConstructor objectConstructor;^ [CLASS] JsonDeserializationVisitor  
[REPLACE]^protected  Type targetType;^36^^^^^^^[REPLACE] protected final Type targetType;^ [CLASS] JsonDeserializationVisitor  
[REPLACE]^private boolean constructed;^38^^^^^^^[REPLACE] protected boolean constructed;^ [CLASS] JsonDeserializationVisitor  
[REPLACE]^json   ;^44^^^^^40^52^[REPLACE] Preconditions.checkNotNull ( json ) ;^[METHOD] <init> [TYPE] JsonDeserializationContext) [PARAMETER] JsonElement json Type targetType ObjectNavigatorFactory factory ObjectConstructor objectConstructor JsonDeserializer<?>> deserializers JsonDeserializationContext context [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^this.targetType =  null;^45^^^^^40^52^[REPLACE] this.targetType = targetType;^[METHOD] <init> [TYPE] JsonDeserializationContext) [PARAMETER] JsonElement json Type targetType ObjectNavigatorFactory factory ObjectConstructor objectConstructor JsonDeserializer<?>> deserializers JsonDeserializationContext context [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^this.factory =  null;^46^^^^^40^52^[REPLACE] this.factory = factory;^[METHOD] <init> [TYPE] JsonDeserializationContext) [PARAMETER] JsonElement json Type targetType ObjectNavigatorFactory factory ObjectConstructor objectConstructor JsonDeserializer<?>> deserializers JsonDeserializationContext context [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[ADD]^^46^^^^^40^52^[ADD] this.factory = factory;^[METHOD] <init> [TYPE] JsonDeserializationContext) [PARAMETER] JsonElement json Type targetType ObjectNavigatorFactory factory ObjectConstructor objectConstructor JsonDeserializer<?>> deserializers JsonDeserializationContext context [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^this.objectConstructor =  null;^47^^^^^40^52^[REPLACE] this.objectConstructor = objectConstructor;^[METHOD] <init> [TYPE] JsonDeserializationContext) [PARAMETER] JsonElement json Type targetType ObjectNavigatorFactory factory ObjectConstructor objectConstructor JsonDeserializer<?>> deserializers JsonDeserializationContext context [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^this.deserializers =  true;^48^^^^^40^52^[REPLACE] this.deserializers = deserializers;^[METHOD] <init> [TYPE] JsonDeserializationContext) [PARAMETER] JsonElement json Type targetType ObjectNavigatorFactory factory ObjectConstructor objectConstructor JsonDeserializer<?>> deserializers JsonDeserializationContext context [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^this.json =  null;^49^^^^^40^52^[REPLACE] this.json = json;^[METHOD] <init> [TYPE] JsonDeserializationContext) [PARAMETER] JsonElement json Type targetType ObjectNavigatorFactory factory ObjectConstructor objectConstructor JsonDeserializer<?>> deserializers JsonDeserializationContext context [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^this.context =  null;^50^^^^^40^52^[REPLACE] this.context = context;^[METHOD] <init> [TYPE] JsonDeserializationContext) [PARAMETER] JsonElement json Type targetType ObjectNavigatorFactory factory ObjectConstructor objectConstructor JsonDeserializer<?>> deserializers JsonDeserializationContext context [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^this.constructed = true;^51^^^^^40^52^[REPLACE] this.constructed = false;^[METHOD] <init> [TYPE] JsonDeserializationContext) [PARAMETER] JsonElement json Type targetType ObjectNavigatorFactory factory ObjectConstructor objectConstructor JsonDeserializer<?>> deserializers JsonDeserializationContext context [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^if  ( constructed )  {^55^^^^^54^60^[REPLACE] if  ( !constructed )  {^[METHOD] getTarget [TYPE] T [PARAMETER] [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^target ;^56^^^^^54^60^[REPLACE] target = constructTarget (  ) ;^[METHOD] getTarget [TYPE] T [PARAMETER] [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[ADD]^^56^57^^^^54^60^[ADD] target = constructTarget (  ) ; constructed = true;^[METHOD] getTarget [TYPE] T [PARAMETER] [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^constructed = false;^57^^^^^54^60^[REPLACE] constructed = true;^[METHOD] getTarget [TYPE] T [PARAMETER] [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^target  = null ;^56^^^^^54^60^[REPLACE] target = constructTarget (  ) ;^[METHOD] getTarget [TYPE] T [PARAMETER] [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[ADD]^^57^^^^^54^60^[ADD] constructed = true;^[METHOD] getTarget [TYPE] T [PARAMETER] [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^return childVisitor.getTarget (  ) ;^59^^^^^54^60^[REPLACE] return target;^[METHOD] getTarget [TYPE] T [PARAMETER] [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^JsonDeserializationVisitor<?> childVisitor = new JsonObjectDeserializationVisitor<Object> ( jsonChild, childType,^72^^^^^71^80^[REPLACE] Pair<JsonDeserializer<?>, ObjectTypePair> pair = objTypePair.getMatchingHandler ( deserializers ) ;^[METHOD] visitUsingCustomHandler [TYPE] boolean [PARAMETER] ObjectTypePair objTypePair [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectTypePair objTypePair  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  Object value  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^if  ( pair != null )  {^73^^^^^71^80^[REPLACE] if  ( pair == null )  {^[METHOD] visitUsingCustomHandler [TYPE] boolean [PARAMETER] ObjectTypePair objTypePair [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectTypePair objTypePair  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  Object value  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^return true;^74^^^^^71^80^[REPLACE] return false;^[METHOD] visitUsingCustomHandler [TYPE] boolean [PARAMETER] ObjectTypePair objTypePair [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectTypePair objTypePair  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  Object value  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^Object value = invokeCustomDeserializer ( json, true ) ;^76^^^^^71^80^[REPLACE] Object value = invokeCustomDeserializer ( json, pair ) ;^[METHOD] visitUsingCustomHandler [TYPE] boolean [PARAMETER] ObjectTypePair objTypePair [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectTypePair objTypePair  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  Object value  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[ADD]^^76^^^^^71^80^[ADD] Object value = invokeCustomDeserializer ( json, pair ) ;^[METHOD] visitUsingCustomHandler [TYPE] boolean [PARAMETER] ObjectTypePair objTypePair [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectTypePair objTypePair  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  Object value  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^target =   ( T )  value;^77^^^^^71^80^[REPLACE] target =  ( T )  value;^[METHOD] visitUsingCustomHandler [TYPE] boolean [PARAMETER] ObjectTypePair objTypePair [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectTypePair objTypePair  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  Object value  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[ADD]^^77^^^^^71^80^[ADD] target =  ( T )  value;^[METHOD] visitUsingCustomHandler [TYPE] boolean [PARAMETER] ObjectTypePair objTypePair [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectTypePair objTypePair  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  Object value  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^constructed = false;^78^^^^^71^80^[REPLACE] constructed = true;^[METHOD] visitUsingCustomHandler [TYPE] boolean [PARAMETER] ObjectTypePair objTypePair [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectTypePair objTypePair  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  Object value  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^return false;^79^^^^^71^80^[REPLACE] return true;^[METHOD] visitUsingCustomHandler [TYPE] boolean [PARAMETER] ObjectTypePair objTypePair [CLASS] JsonDeserializationVisitor   [TYPE]  Type targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement json  [TYPE]  ObjectTypePair objTypePair  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  Object value  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^if  ( element != null ) {^84^^^^^82^89^[REPLACE] if  ( element == null || element.isJsonNull (  )  )  {^[METHOD] invokeCustomDeserializer [TYPE] Object [PARAMETER] JsonElement element ObjectTypePair> pair [CLASS] JsonDeserializationVisitor   [TYPE]  Type objType  targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement element  json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^return this;^85^^^^^82^89^[REPLACE] return null;^[METHOD] invokeCustomDeserializer [TYPE] Object [PARAMETER] JsonElement element ObjectTypePair> pair [CLASS] JsonDeserializationVisitor   [TYPE]  Type objType  targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement element  json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^return false;^85^^^^^82^89^[REPLACE] return null;^[METHOD] invokeCustomDeserializer [TYPE] Object [PARAMETER] JsonElement element ObjectTypePair> pair [CLASS] JsonDeserializationVisitor   [TYPE]  Type objType  targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement element  json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^Type objType = null.second.type;^87^^^^^82^89^[REPLACE] Type objType = pair.second.type;^[METHOD] invokeCustomDeserializer [TYPE] Object [PARAMETER] JsonElement element ObjectTypePair> pair [CLASS] JsonDeserializationVisitor   [TYPE]  Type objType  targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement element  json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^return  ( pair.first ) .deserialize ( json, objType, context ) ;^88^^^^^82^89^[REPLACE] return  ( pair.first ) .deserialize ( element, objType, context ) ;^[METHOD] invokeCustomDeserializer [TYPE] Object [PARAMETER] JsonElement element ObjectTypePair> pair [CLASS] JsonDeserializationVisitor   [TYPE]  Type objType  targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement element  json  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory  [TYPE]  Pair pair 
[REPLACE]^JsonDeserializationVisitor<?> childVisitor = new JsonObjectDeserializationVisitor<Object> ( json, childType, factory, objectConstructor, deserializers, context ) ;^92^93^94^^^91^96^[REPLACE] JsonDeserializationVisitor<?> childVisitor = new JsonObjectDeserializationVisitor<Object> ( jsonChild, childType, factory, objectConstructor, deserializers, context ) ;^[METHOD] visitChildAsObject [TYPE] Object [PARAMETER] Type childType JsonElement jsonChild [CLASS] JsonDeserializationVisitor   [TYPE]  Type childType  objType  targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  JsonDeserializationVisitor childVisitor  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement element  json  jsonChild  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^return visitChild ( childType, null ) ;^95^^^^^91^96^[REPLACE] return visitChild ( childType, childVisitor ) ;^[METHOD] visitChildAsObject [TYPE] Object [PARAMETER] Type childType JsonElement jsonChild [CLASS] JsonDeserializationVisitor   [TYPE]  Type childType  objType  targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  JsonDeserializationVisitor childVisitor  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement element  json  jsonChild  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^JsonDeserializationVisitor<?> childVisitor = new JsonArrayDeserializationVisitor<Object> ( jsonChild.getAsJsonArray (  ) , targetType, factory, objectConstructor, deserializers, context ) ;^99^100^101^^^98^103^[REPLACE] JsonDeserializationVisitor<?> childVisitor = new JsonArrayDeserializationVisitor<Object> ( jsonChild.getAsJsonArray (  ) , childType, factory, objectConstructor, deserializers, context ) ;^[METHOD] visitChildAsArray [TYPE] Object [PARAMETER] Type childType JsonArray jsonChild [CLASS] JsonDeserializationVisitor   [TYPE]  JsonArray jsonChild  [TYPE]  Type childType  objType  targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  JsonDeserializationVisitor childVisitor  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement element  json  jsonChild  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^return visitChild ( targetType, childVisitor ) ;^102^^^^^98^103^[REPLACE] return visitChild ( childType, childVisitor ) ;^[METHOD] visitChildAsArray [TYPE] Object [PARAMETER] Type childType JsonArray jsonChild [CLASS] JsonDeserializationVisitor   [TYPE]  JsonArray jsonChild  [TYPE]  Type childType  objType  targetType  [TYPE]  JsonDeserializationContext context  [TYPE]  JsonDeserializationVisitor childVisitor  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  JsonElement element  json  jsonChild  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^ObjectNavigator on = factory.create ( new ObjectTypePair ( false, type, false )  ) ;^106^^^^^105^111^[REPLACE] ObjectNavigator on = factory.create ( new ObjectTypePair ( null, type, false )  ) ;^[METHOD] visitChild [TYPE] Object [PARAMETER] Type type JsonDeserializationVisitor<?> childVisitor [CLASS] JsonDeserializationVisitor   [TYPE]  Type childType  objType  targetType  type  [TYPE]  JsonDeserializationContext context  [TYPE]  JsonDeserializationVisitor childVisitor  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  ObjectNavigator on  [TYPE]  JsonElement element  json  jsonChild  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^on.accept ( false ) ;^107^^^^^105^111^[REPLACE] on.accept ( childVisitor ) ;^[METHOD] visitChild [TYPE] Object [PARAMETER] Type type JsonDeserializationVisitor<?> childVisitor [CLASS] JsonDeserializationVisitor   [TYPE]  Type childType  objType  targetType  type  [TYPE]  JsonDeserializationContext context  [TYPE]  JsonDeserializationVisitor childVisitor  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  ObjectNavigator on  [TYPE]  JsonElement element  json  jsonChild  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 
[REPLACE]^return childVisitor .constructTarget (  )  ;^110^^^^^105^111^[REPLACE] return childVisitor.getTarget (  ) ;^[METHOD] visitChild [TYPE] Object [PARAMETER] Type type JsonDeserializationVisitor<?> childVisitor [CLASS] JsonDeserializationVisitor   [TYPE]  Type childType  objType  targetType  type  [TYPE]  JsonDeserializationContext context  [TYPE]  JsonDeserializationVisitor childVisitor  [TYPE]  boolean constructed  false  true  [TYPE]  T target  [TYPE]  ObjectNavigator on  [TYPE]  JsonElement element  json  jsonChild  [TYPE]  ObjectConstructor objectConstructor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory factory 