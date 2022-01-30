[REPLACE]^private JSDocInfo docInfo  = null ;^85^^^^^^^[REPLACE] private JSDocInfo docInfo = null;^ [CLASS] ObjectType  
[REPLACE]^private boolean unknown  = null ;^86^^^^^^^[REPLACE] private boolean unknown = true;^ [CLASS] ObjectType  
[REPLACE]^return hasProperty ( propertyName ) ;^89^^^^^88^90^[REPLACE] super ( registry ) ;^[METHOD] <init> [TYPE] JSTypeRegistry) [PARAMETER] JSTypeRegistry registry [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^return false;^97^^^^^96^98^[REPLACE] return null;^[METHOD] getParameterType [TYPE] JSType [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^return false;^105^^^^^104^106^[REPLACE] return null;^[METHOD] getIndexType [TYPE] JSType [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^if  ( docInfo == null )  {^112^^^^^111^119^[REPLACE] if  ( docInfo != null )  {^[METHOD] getJSDocInfo [TYPE] JSDocInfo [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^} else if  ( getImplicitPrototype (  )  == null )  {^114^^^^^111^119^[REPLACE] } else if  ( getImplicitPrototype (  )  != null )  {^[METHOD] getJSDocInfo [TYPE] JSDocInfo [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  [TYPE]  boolean false  true  unknown  visited 
[ADD]^}   return super.getJSDocInfo (  ) ;^114^115^116^117^118^111^119^[ADD] else if  ( getImplicitPrototype (  )  != null )  { return getImplicitPrototype (  ) .getJSDocInfo (  ) ; } else { return super.getJSDocInfo (  ) ; }^[METHOD] getJSDocInfo [TYPE] JSDocInfo [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^return new HashSet<String> (  ) ;^117^^^^^111^119^[REPLACE] return super.getJSDocInfo (  ) ;^[METHOD] getJSDocInfo [TYPE] JSDocInfo [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^return getImplicitPrototype (  )  .setJSDocInfo ( docInfo )  ;^115^^^^^111^119^[REPLACE] return getImplicitPrototype (  ) .getJSDocInfo (  ) ;^[METHOD] getJSDocInfo [TYPE] JSDocInfo [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^return hasProperty ( propertyName )  ? getPropertyType ( propertyName )  : null;^115^^^^^111^119^[REPLACE] return getImplicitPrototype (  ) .getJSDocInfo (  ) ;^[METHOD] getJSDocInfo [TYPE] JSDocInfo [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^return FALSE;^113^^^^^111^119^[REPLACE] return docInfo;^[METHOD] getJSDocInfo [TYPE] JSDocInfo [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^return super .setJSDocInfo ( docInfo )  ;^117^^^^^111^119^[REPLACE] return super.getJSDocInfo (  ) ;^[METHOD] getJSDocInfo [TYPE] JSDocInfo [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^docInfo =  null;^126^^^^^125^127^[REPLACE] docInfo = info;^[METHOD] setJSDocInfo [TYPE] void [PARAMETER] JSDocInfo info [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^this.visited = false;^141^^^^^139^159^[REPLACE] this.visited = true;^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[ADD]^ObjectType p = getImplicitPrototype (  ) ;^141^142^^^^139^159^[ADD] this.visited = true; ObjectType p = getImplicitPrototype (  ) ;^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^ObjectType implicitProto = getImplicitPrototype (  ) ;^142^^^^^139^159^[REPLACE] ObjectType p = getImplicitPrototype (  ) ;^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^while  ( p == null )  {^143^^^^^139^159^[REPLACE] while  ( p != null )  {^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[ADD]^^143^144^145^^^139^159^[ADD] while  ( p != null )  { if  ( p.visited )  { return true;^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^if  ( hasProperty ( propertyName )  )  {^144^^^^^139^159^[REPLACE] if  ( p.visited )  {^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[ADD]^return true;p.visited = true;^144^145^146^147^148^139^159^[ADD] if  ( p.visited )  { return true; } else { p.visited = true; }^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^p.visited = false;^147^^^^^139^159^[REPLACE] p.visited = true;^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^return false;^145^^^^^139^159^[REPLACE] return true;^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^p =  null.getImnulllicitPrototynulle (  ) ;^149^^^^^139^159^[REPLACE] p = p.getImplicitPrototype (  ) ;^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^p  = null ;^153^^^^^139^159^[REPLACE] p = this;^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^p.visited = true;^155^^^^^139^159^[REPLACE] p.visited = false;^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^p =  null.getImnulllicitPrototynulle (  ) ;^156^^^^^139^159^[REPLACE] p = p.getImplicitPrototype (  ) ;^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^return true;^158^^^^^139^159^[REPLACE] return false;^[METHOD] detectImplicitPrototypeCycle [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType p  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^return true;^175^^^^^174^176^[REPLACE] return false;^[METHOD] hasReferenceName [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  true  unknown  visited 
[REPLACE]^TernaryValue result = super .getLeastSupertype ( that )  ;^181^^^^^179^192^[REPLACE] TernaryValue result = super.testForEquality ( that ) ;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] ObjectType   [TYPE]  boolean false  true  unknown  visited  [TYPE]  JSType that  [TYPE]  TernaryValue result  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^if  ( result == null )  {^182^^^^^179^192^[REPLACE] if  ( result != null )  {^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] ObjectType   [TYPE]  boolean false  true  unknown  visited  [TYPE]  JSType that  [TYPE]  TernaryValue result  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^return FALSE;^183^^^^^179^192^[REPLACE] return result;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] ObjectType   [TYPE]  boolean false  true  unknown  visited  [TYPE]  JSType that  [TYPE]  TernaryValue result  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^if  ( that.getLeastSupertype ( getNativeType ( JSTypeNative.OBJECT_NUMBER_STRING_BOOLEAN )  )  )  {^186^187^^^^179^192^[REPLACE] if  ( that.isSubtype ( getNativeType ( JSTypeNative.OBJECT_NUMBER_STRING_BOOLEAN )  )  )  {^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] ObjectType   [TYPE]  boolean false  true  unknown  visited  [TYPE]  JSType that  [TYPE]  TernaryValue result  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^return false;^190^^^^^179^192^[REPLACE] return FALSE;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] ObjectType   [TYPE]  boolean false  true  unknown  visited  [TYPE]  JSType that  [TYPE]  TernaryValue result  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^return unknown;^188^^^^^179^192^[REPLACE] return UNKNOWN;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] ObjectType   [TYPE]  boolean false  true  unknown  visited  [TYPE]  JSType that  [TYPE]  TernaryValue result  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^getPropertyType ( propertyName )  : null;^219^^^^^215^222^[REPLACE] registry.registerPropertyOnType ( propertyName, this ) ;^[METHOD] defineDeclaredProperty [TYPE] boolean [PARAMETER] String propertyName JSType type boolean inExterns [CLASS] ObjectType   [TYPE]  boolean false  inExterns  true  unknown  visited  [TYPE]  String propertyName  [TYPE]  JSType type  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^return defineProperty ( propertyName, type, true, inExterns ) ;^221^^^^^215^222^[REPLACE] return defineProperty ( propertyName, type, false, inExterns ) ;^[METHOD] defineDeclaredProperty [TYPE] boolean [PARAMETER] String propertyName JSType type boolean inExterns [CLASS] ObjectType   [TYPE]  boolean false  inExterns  true  unknown  visited  [TYPE]  String propertyName  [TYPE]  JSType type  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^getPropertyType ( propertyName )  : null;^237^^^^^233^246^[REPLACE] registry.registerPropertyOnType ( propertyName, this ) ;^[METHOD] defineInferredProperty [TYPE] boolean [PARAMETER] String propertyName JSType type boolean inExterns [CLASS] ObjectType   [TYPE]  boolean false  inExterns  true  unknown  visited  [TYPE]  String propertyName  [TYPE]  JSType originalType  type  [TYPE]  JSDocInfo docInfo  info 
[REMOVE]^getPropertyType ( propertyName )  : null;^237^^^^^233^246^[REMOVE] ^[METHOD] defineInferredProperty [TYPE] boolean [PARAMETER] String propertyName JSType type boolean inExterns [CLASS] ObjectType   [TYPE]  boolean false  inExterns  true  unknown  visited  [TYPE]  String propertyName  [TYPE]  JSType originalType  type  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^if  ( that.isSubtype ( getNativeType ( JSTypeNative.OBJECT_NUMBER_STRING_BOOLEAN )  )  )  {^239^^^^^233^246^[REPLACE] if  ( hasProperty ( propertyName )  )  {^[METHOD] defineInferredProperty [TYPE] boolean [PARAMETER] String propertyName JSType type boolean inExterns [CLASS] ObjectType   [TYPE]  boolean false  inExterns  true  unknown  visited  [TYPE]  String propertyName  [TYPE]  JSType originalType  type  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^type  =  type ;^241^242^^^^233^246^[REPLACE] type = originalType == null ? type : originalType.getLeastSupertype ( type ) ;^[METHOD] defineInferredProperty [TYPE] boolean [PARAMETER] String propertyName JSType type boolean inExterns [CLASS] ObjectType   [TYPE]  boolean false  inExterns  true  unknown  visited  [TYPE]  String propertyName  [TYPE]  JSType originalType  type  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^for  ( ObjectType current = this;^240^^^^^233^246^[REPLACE] JSType originalType = getPropertyType ( propertyName ) ;^[METHOD] defineInferredProperty [TYPE] boolean [PARAMETER] String propertyName JSType type boolean inExterns [CLASS] ObjectType   [TYPE]  boolean false  inExterns  true  unknown  visited  [TYPE]  String propertyName  [TYPE]  JSType originalType  type  [TYPE]  JSDocInfo docInfo  info 
[ADD]^^240^^^^^233^246^[ADD] JSType originalType = getPropertyType ( propertyName ) ;^[METHOD] defineInferredProperty [TYPE] boolean [PARAMETER] String propertyName JSType type boolean inExterns [CLASS] ObjectType   [TYPE]  boolean false  inExterns  true  unknown  visited  [TYPE]  String propertyName  [TYPE]  JSType originalType  type  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^return defineProperty ( propertyName, type, false, inExterns ) ;^245^^^^^233^246^[REPLACE] return defineProperty ( propertyName, type, true, inExterns ) ;^[METHOD] defineInferredProperty [TYPE] boolean [PARAMETER] String propertyName JSType type boolean inExterns [CLASS] ObjectType   [TYPE]  boolean false  inExterns  true  unknown  visited  [TYPE]  String propertyName  [TYPE]  JSType originalType  type  [TYPE]  JSDocInfo docInfo  info 
[REPLACE]^return true;^271^^^^^270^272^[REPLACE] return null;^[METHOD] getOwnPropertyJSDocInfo [TYPE] JSDocInfo [PARAMETER] String propertyName [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited  [TYPE]  String propertyName 
[REPLACE]^return hasProperty ( propertyName )  ? getPropertyType ( propertyName )  : this;^291^292^^^^290^293^[REPLACE] return hasProperty ( propertyName )  ? getPropertyType ( propertyName )  : null;^[METHOD] findPropertyType [TYPE] JSType [PARAMETER] String propertyName [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited  [TYPE]  String propertyName 
[REPLACE]^return hasProperty ( propertyName )  ? getPropertyType ( propertyName )  : null;^316^^^^^315^317^[REPLACE] return hasProperty ( propertyName ) ;^[METHOD] hasOwnProperty [TYPE] boolean [PARAMETER] String propertyName [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited  [TYPE]  String propertyName 
[REPLACE]^return FALSE;^321^^^^^320^322^[REPLACE] return new HashSet<String> (  ) ;^[METHOD] getOwnPropertyNames [TYPE] Set [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^return hasOwnProperty ( name )  ;^338^^^^^337^339^[REPLACE] return hasOwnProperty ( name )  && isPropertyTypeDeclared ( name ) ;^[METHOD] hasOwnDeclaredProperty [TYPE] boolean [PARAMETER] String name [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited  [TYPE]  String name 
[REPLACE]^return true;^343^^^^^342^344^[REPLACE] return false;^[METHOD] isPropertyInExterns [TYPE] boolean [PARAMETER] String propertyName [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited  [TYPE]  String propertyName 
[REPLACE]^ObjectType implicitProto = getImplicitPrototype (  ) ;^356^^^^^355^359^[REPLACE] Set<String> props = Sets.newHashSet (  ) ;^[METHOD] getPropertyNames [TYPE] Set [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited  [TYPE]  Set props 
[REPLACE]^collectPropertyNames ( null ) ;^357^^^^^355^359^[REPLACE] collectPropertyNames ( props ) ;^[METHOD] getPropertyNames [TYPE] Set [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited  [TYPE]  Set props 
[REPLACE]^return null;^358^^^^^355^359^[REPLACE] return props;^[METHOD] getPropertyNames [TYPE] Set [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited  [TYPE]  Set props 
[REPLACE]^return true.caseObjectType ( this ) ;^368^^^^^367^369^[REPLACE] return visitor.caseObjectType ( this ) ;^[METHOD] visit [TYPE] <T> [PARAMETER] Visitor<T> visitor [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  Visitor visitor  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^if  ( hasProperty ( propertyName )  )  {^385^^^^^381^390^[REPLACE] if  ( current.equals ( prototype )  )  {^[METHOD] isImplicitPrototype [TYPE] boolean [PARAMETER] ObjectType prototype [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType current  prototype  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[ADD]^^385^386^387^^^381^390^[ADD] if  ( current.equals ( prototype )  )  { return true; }^[METHOD] isImplicitPrototype [TYPE] boolean [PARAMETER] ObjectType prototype [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType current  prototype  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^return false;^386^^^^^381^390^[REPLACE] return true;^[METHOD] isImplicitPrototype [TYPE] boolean [PARAMETER] ObjectType prototype [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType current  prototype  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^for  ( ObjectTypeprototype = this;^382^^^^^381^390^[REPLACE] for  ( ObjectType current = this;^[METHOD] isImplicitPrototype [TYPE] boolean [PARAMETER] ObjectType prototype [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType current  prototype  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[ADD]^^382^383^384^385^386^381^390^[ADD] for  ( ObjectType current = this; current != null; current = current.getImplicitPrototype (  )  )  { if  ( current.equals ( prototype )  )  { return true;^[METHOD] isImplicitPrototype [TYPE] boolean [PARAMETER] ObjectType prototype [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType current  prototype  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^current =  prototype.getImplicitPrototype (  )  )  {^384^^^^^381^390^[REPLACE] current = current.getImplicitPrototype (  )  )  {^[METHOD] isImplicitPrototype [TYPE] boolean [PARAMETER] ObjectType prototype [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType current  prototype  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^ObjectType implicitProto = getImplicitPrototype (  ) ;^382^^^^^381^390^[REPLACE] for  ( ObjectType current = this;^[METHOD] isImplicitPrototype [TYPE] boolean [PARAMETER] ObjectType prototype [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType current  prototype  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^return FALSE;^389^^^^^381^390^[REPLACE] return false;^[METHOD] isImplicitPrototype [TYPE] boolean [PARAMETER] ObjectType prototype [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType current  prototype  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^return FALSE;^394^^^^^393^395^[REPLACE] return BooleanLiteralSet.TRUE;^[METHOD] getPossibleToBooleanOutcomes [TYPE] BooleanLiteralSet [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^if  ( hasProperty ( propertyName )  )  {^405^^^^^402^415^[REPLACE] if  ( unknown )  {^[METHOD] isUnknownType [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType implicitProto  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^if  ( implicitProto != null ) {^407^408^^^^402^415^[REPLACE] if  ( implicitProto == null || implicitProto.isNativeObjectType (  )  )  {^[METHOD] isUnknownType [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType implicitProto  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[ADD]^^407^408^409^410^411^402^415^[ADD] if  ( implicitProto == null || implicitProto.isNativeObjectType (  )  )  { unknown = false; } else { unknown = implicitProto.isUnknownType (  ) ;^[METHOD] isUnknownType [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType implicitProto  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^unknown =  null.isUnknownType (  ) ;^411^^^^^402^415^[REPLACE] unknown = implicitProto.isUnknownType (  ) ;^[METHOD] isUnknownType [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType implicitProto  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[ADD]^^411^^^^^402^415^[ADD] unknown = implicitProto.isUnknownType (  ) ;^[METHOD] isUnknownType [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType implicitProto  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^unknown = true;^409^^^^^402^415^[REPLACE] unknown = false;^[METHOD] isUnknownType [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType implicitProto  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[ADD]^^409^^^^^402^415^[ADD] unknown = false;^[METHOD] isUnknownType [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType implicitProto  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^Set<String> props = Sets.newHashSet (  ) ;^406^^^^^402^415^[REPLACE] ObjectType implicitProto = getImplicitPrototype (  ) ;^[METHOD] isUnknownType [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType implicitProto  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^if  (  implicitProto.isNativeObjectType (  )  )  {^407^408^^^^402^415^[REPLACE] if  ( implicitProto == null || implicitProto.isNativeObjectType (  )  )  {^[METHOD] isUnknownType [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType implicitProto  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^return UNKNOWN;^414^^^^^402^415^[REPLACE] return unknown;^[METHOD] isUnknownType [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  ObjectType implicitProto  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^return false;^419^^^^^418^420^[REPLACE] return true;^[METHOD] isObject [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^return unknown;^428^^^^^427^429^[REPLACE] return !unknown;^[METHOD] hasCachedValues [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^return true;^433^^^^^432^434^[REPLACE] return false;^[METHOD] isNativeObjectType [TYPE] boolean [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 
[REPLACE]^return type == true ? true : type .isSubtype (  )  ;^440^^^^^439^441^[REPLACE] return type == null ? null : type.toObjectType (  ) ;^[METHOD] cast [TYPE] ObjectType [PARAMETER] JSType type [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited  [TYPE]  JSType type 
[REPLACE]^return FALSE;^448^^^^^447^449^[REPLACE] return ImmutableSet.of (  ) ;^[METHOD] getCtorImplementedInterfaces [TYPE] Iterable [PARAMETER] [CLASS] ObjectType   [TYPE]  JSDocInfo docInfo  info  [TYPE]  boolean false  inExterns  inferred  true  unknown  visited 