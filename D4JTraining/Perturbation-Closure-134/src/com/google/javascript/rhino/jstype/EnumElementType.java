[REPLACE]^private static final long serialVersionUID = 1;^53^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] EnumElementType  
[REPLACE]^private  JSType primitiveType;^61^^^^^^^[REPLACE] private final JSType primitiveType;^ [CLASS] EnumElementType  
[REPLACE]^if  ( thatObj != null && thatObj.isNominalType (  )  )  { return getReferenceName (  ) .equals ( thatObj.getReferenceName (  )  ) ;^70^^^^^68^74^[REPLACE] super ( registry ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] JSTypeRegistry registry JSType elementType String name [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSTypeRegistry registry  [TYPE]  JSType elementType  primitiveType  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^this.primitiveType =  primitiveType;^71^^^^^68^74^[REPLACE] this.primitiveType = elementType;^[METHOD] <init> [TYPE] String) [PARAMETER] JSTypeRegistry registry JSType elementType String name [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSTypeRegistry registry  [TYPE]  JSType elementType  primitiveType  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^this.primitiveObjectType =  primitiveType.toObjectType (  ) ;^72^^^^^68^74^[REPLACE] this.primitiveObjectType = elementType.toObjectType (  ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] JSTypeRegistry registry JSType elementType String name [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSTypeRegistry registry  [TYPE]  JSType elementType  primitiveType  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^this.name =  null;^73^^^^^68^74^[REPLACE] this.name = name;^[METHOD] <init> [TYPE] String) [PARAMETER] JSTypeRegistry registry JSType elementType String name [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSTypeRegistry registry  [TYPE]  JSType elementType  primitiveType  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^78^^^^^77^79^[REPLACE] return true;^[METHOD] isEnumElementType [TYPE] boolean [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSType elementType  primitiveType  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType.matchesStringContext (  ) ;^83^^^^^82^84^[REPLACE] return primitiveType.matchesNumberContext (  ) ;^[METHOD] matchesNumberContext [TYPE] boolean [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSType elementType  primitiveType  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType.matchesNumberContext (  ) ;^88^^^^^87^89^[REPLACE] return primitiveType.matchesStringContext (  ) ;^[METHOD] matchesStringContext [TYPE] boolean [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSType elementType  primitiveType  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType .matchesNumberContext (  )  ;^93^^^^^92^94^[REPLACE] return primitiveType.matchesObjectContext (  ) ;^[METHOD] matchesObjectContext [TYPE] boolean [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSType elementType  primitiveType  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType.isNullable (  ) ;^98^^^^^97^99^[REPLACE] return primitiveType.canBeCalled (  ) ;^[METHOD] canBeCalled [TYPE] boolean [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSType elementType  primitiveType  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType .toObjectType (  )  ;^103^^^^^102^104^[REPLACE] return primitiveType.isObject (  ) ;^[METHOD] isObject [TYPE] boolean [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSType elementType  primitiveType  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType.isSubtype ( that ) ;^108^^^^^107^109^[REPLACE] return primitiveType.testForEquality ( that ) ;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType.canBeCalled (  ) ;^118^^^^^117^119^[REPLACE] return primitiveType.isNullable (  ) ;^[METHOD] isNullable [TYPE] boolean [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType.isObject (  ) ;^123^^^^^122^124^[REPLACE] return hasReferenceName (  ) ;^[METHOD] isNominalType [TYPE] boolean [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( this  &&  that )  {^128^^^^^127^137^[REPLACE] if  ( this == that )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^}  else {^130^^^^^127^137^[REPLACE] } else if  ( that instanceof JSType && this.isNominalType (  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^}   ObjectType thatObj = ObjectType.cast (  ( JSType )  that ) ;return getReferenceName (  ) .equals ( thatObj.getReferenceName (  )  ) ;^130^131^132^133^134^127^137^[ADD] else if  ( that instanceof JSType && this.isNominalType (  )  )  { ObjectType thatObj = ObjectType.cast (  ( JSType )  that ) ; if  ( thatObj != null && thatObj.isNominalType (  )  )  { return getReferenceName (  ) .equals ( thatObj.getReferenceName (  )  ) ; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  (  thatObj.isNominalType (  )  )  {^132^^^^^127^137^[REPLACE] if  ( thatObj != null && thatObj.isNominalType (  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return.getPropertiesCount (  ) .equals ( thatObj.getReferenceName (  )  ) ;^133^^^^^127^137^[REPLACE] return getReferenceName (  ) .equals ( thatObj.getReferenceName (  )  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return.hasReferenceName (  ) .equals ( thatObj.getReferenceName (  )  ) ;^133^^^^^127^137^[REPLACE] return getReferenceName (  ) .equals ( thatObj.getReferenceName (  )  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^ObjectType thatObj = ObjectType .hasProperty ( name )  ;^131^^^^^127^137^[REPLACE] ObjectType thatObj = ObjectType.cast (  ( JSType )  that ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( thatObj == this && thatObj.isNominalType (  )  )  {^132^^^^^127^137^[REPLACE] if  ( thatObj != null && thatObj.isNominalType (  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^return getReferenceName (  ) .equals ( thatObj.getReferenceName (  )  ) ;^132^133^134^^^127^137^[ADD] if  ( thatObj != null && thatObj.isNominalType (  )  )  { return getReferenceName (  ) .equals ( thatObj.getReferenceName (  )  ) ; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return getReferenceName (  ) .equals ( thatObj .hasReferenceName (  )   ) ;^133^^^^^127^137^[REPLACE] return getReferenceName (  ) .equals ( thatObj.getReferenceName (  )  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return getReferenceName (  ) .equals ( primitiveObjectType.getReferenceName (  )  ) ;^133^^^^^127^137^[REPLACE] return getReferenceName (  ) .equals ( thatObj.getReferenceName (  )  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^ObjectType thatObj = ObjectType.isNominalType (  ( JSType )  that ) ;^131^^^^^127^137^[REPLACE] ObjectType thatObj = ObjectType.cast (  ( JSType )  that ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^129^^^^^127^137^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( thatObj == null && thatObj.isNominalType (  )  )  {^132^^^^^127^137^[REPLACE] if  ( thatObj != null && thatObj.isNominalType (  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return.hasReferenceName (  ) .equals ( primitiveObjectType.getReferenceName (  )  ) ;^133^^^^^127^137^[REPLACE] return getReferenceName (  ) .equals ( thatObj.getReferenceName (  )  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^136^^^^^127^137^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  Object that  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( JSType.isSubtype ( this, that )  )  {^145^^^^^144^150^[REPLACE] if  ( hasReferenceName (  )  )  {^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^145^146^147^148^149^144^150^[ADD] if  ( hasReferenceName (  )  )  { return getReferenceName (  ) .hashCode (  ) ; } else { return super.hashCode (  ) ; }^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return super .hashCode (  )  ;^148^^^^^144^150^[REPLACE] return super.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return getReferenceName (  ) .equals (  ) ;^146^^^^^144^150^[REPLACE] return getReferenceName (  ) .hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType.isObject (  ) ;^148^^^^^144^150^[REPLACE] return super.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return getReferenceName (  )   |  ".;^154^^^^^153^155^[REPLACE] return getReferenceName (  )  + ".<" + primitiveType + ">";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType;^159^^^^^158^160^[REPLACE] return name;^[METHOD] getReferenceName [TYPE] String [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^164^^^^^163^165^[REPLACE] return true;^[METHOD] hasReferenceName [TYPE] boolean [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( JSType.isSubtype ( this, primitiveType )  )  {^169^^^^^168^174^[REPLACE] if  ( JSType.isSubtype ( this, that )  )  {^[METHOD] isSubtype [TYPE] boolean [PARAMETER] JSType that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^return true;return primitiveType.isSubtype ( that ) ;^169^170^171^172^173^168^174^[ADD] if  ( JSType.isSubtype ( this, that )  )  { return true; } else { return primitiveType.isSubtype ( that ) ; }^[METHOD] isSubtype [TYPE] boolean [PARAMETER] JSType that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType.findPropertyType ( that ) ;^172^^^^^168^174^[REPLACE] return primitiveType.isSubtype ( that ) ;^[METHOD] isSubtype [TYPE] boolean [PARAMETER] JSType that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^170^^^^^168^174^[REPLACE] return true;^[METHOD] isSubtype [TYPE] boolean [PARAMETER] JSType that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType .isSubtype ( null , elementType )  ;^172^^^^^168^174^[REPLACE] return primitiveType.isSubtype ( that ) ;^[METHOD] isSubtype [TYPE] boolean [PARAMETER] JSType that [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return null.caseEnumElementType ( this ) ;^178^^^^^177^179^[REPLACE] return visitor.caseEnumElementType ( this ) ;^[METHOD] visit [TYPE] <T> [PARAMETER] Visitor<T> visitor [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  Visitor visitor  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^185^^^^^182^186^[REPLACE] return true;^[METHOD] defineProperty [TYPE] boolean [PARAMETER] String propertyName JSType type boolean inferred boolean inExterns [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  boolean false  inExterns  inferred  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveObjectType == null ? false : primitiveObjectType.isPropertyTypeInferred ( propertyName ) ;^190^191^^^^189^192^[REPLACE] return primitiveObjectType == null ? false : primitiveObjectType.isPropertyTypeDeclared ( propertyName ) ;^[METHOD] isPropertyTypeDeclared [TYPE] boolean [PARAMETER] String propertyName [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveObjectType == true ? false : primitiveObjectType .isPropertyTypeDeclared ( propertyName )  ;^196^197^^^^195^198^[REPLACE] return primitiveObjectType == null ? false : primitiveObjectType.isPropertyTypeInferred ( propertyName ) ;^[METHOD] isPropertyTypeInferred [TYPE] boolean [PARAMETER] String propertyName [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return this;^202^^^^^201^203^[REPLACE] return null;^[METHOD] getImplicitPrototype [TYPE] ObjectType [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveObjectType == null ? 0 : primitiveObjectType.getReferenceName (  ) ;^207^208^^^^206^209^[REPLACE] return primitiveObjectType == null ? 0 : primitiveObjectType.getPropertiesCount (  ) ;^[METHOD] getPropertiesCount [TYPE] int [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( thatObj == null )  {^213^^^^^212^216^[REPLACE] if  ( primitiveObjectType != null )  {^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] String> props [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  Set props  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^primitiveObjectType.collectPropertyNames ( null ) ;^214^^^^^212^216^[REPLACE] primitiveObjectType.collectPropertyNames ( props ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] String> props [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  Set props  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^214^^^^^212^216^[ADD] primitiveObjectType.collectPropertyNames ( props ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] String> props [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  Set props  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType.isSubtype ( name ) ;^220^^^^^219^221^[REPLACE] return primitiveType.findPropertyType ( propertyName ) ;^[METHOD] findPropertyType [TYPE] JSType [PARAMETER] String propertyName [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveObjectType == this ? getNativeType ( JSTypeNative.UNKNOWN_TYPE )  : primitiveObjectType.hasProperty ( propertyName ) ;^225^226^227^^^224^228^[REPLACE] return primitiveObjectType == null ? getNativeType ( JSTypeNative.UNKNOWN_TYPE )  : primitiveObjectType.getPropertyType ( propertyName ) ;^[METHOD] getPropertyType [TYPE] JSType [PARAMETER] String propertyName [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveObjectType == null ? false : primitiveObjectType.getPropertyType ( propertyName ) ;^232^233^234^^^231^235^[REPLACE] return primitiveObjectType == null ? false : primitiveObjectType.hasProperty ( propertyName ) ;^[METHOD] hasProperty [TYPE] boolean [PARAMETER] String propertyName [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveObjectType == null ? null : primitiveObjectType.getPropertiesCount (  ) ;^239^240^^^^238^241^[REPLACE] return primitiveObjectType == null ? null : primitiveObjectType.getConstructor (  ) ;^[METHOD] getConstructor [TYPE] FunctionType [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType.isObject (  ) ;^245^^^^^244^246^[REPLACE] return primitiveType.autoboxesTo (  ) ;^[METHOD] autoboxesTo [TYPE] JSType [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return primitiveType.isObject (  ) ;^252^^^^^251^253^[REPLACE] return primitiveType;^[METHOD] getPrimitiveType [TYPE] JSType [PARAMETER] [CLASS] EnumElementType   [TYPE]  ObjectType primitiveObjectType  thatObj  [TYPE]  JSType elementType  primitiveType  that  type  [TYPE]  String name  propertyName  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 