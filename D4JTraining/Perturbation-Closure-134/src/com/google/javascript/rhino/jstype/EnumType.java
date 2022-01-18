[REPLACE]^private static final long serialVersionUID  = null ;^57^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] EnumType  
[REPLACE]^private  EnumElementType elementsType;^60^^^^^^^[REPLACE] private final EnumElementType elementsType;^ [CLASS] EnumType  
[REPLACE]^private  Set<String> elements = new HashSet<String> (  ) ;^62^^^^^^^[REPLACE] private final Set<String> elements = new HashSet<String> (  ) ;^ [CLASS] EnumType  
[REPLACE]^this.elementsType =  new EnumElementType ( null, elementsType, name ) ;^72^^^^^70^73^[REPLACE] this.elementsType = new EnumElementType ( registry, elementsType, name ) ;^[METHOD] <init> [TYPE] JSType) [PARAMETER] JSTypeRegistry registry String name JSType elementsType [CLASS] EnumType   [TYPE]  JSTypeRegistry registry  [TYPE]  Set elements  [TYPE]  JSType elementsType  [TYPE]  boolean false  true  [TYPE]  String name  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return false;^77^^^^^76^78^[REPLACE] return true;^[METHOD] isEnumType [TYPE] boolean [PARAMETER] [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return   JSTypeNative.OBJECT_TYPE   ;^82^^^^^81^83^[REPLACE] return registry.getNativeObjectType ( JSTypeNative.OBJECT_TYPE ) ;^[METHOD] getImplicitPrototype [TYPE] ObjectType [PARAMETER] [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return   elements   ;^91^^^^^90^92^[REPLACE] return Collections.unmodifiableSet ( elements ) ;^[METHOD] getElements [TYPE] Set [PARAMETER] [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return defineDeclaredProperty ( name, elementsType, false ) ;^95^^^^^94^97^[REPLACE] elements.add ( name ) ;^[METHOD] defineElement [TYPE] boolean [PARAMETER] String name [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return defineDeclaredProperty ( name, elementsType, true ) ;^96^^^^^94^97^[REPLACE] return defineDeclaredProperty ( name, elementsType, false ) ;^[METHOD] defineElement [TYPE] boolean [PARAMETER] String name [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return defineDeclaredProperty ( name, elementsType, false ) ;^103^^^^^102^104^[REPLACE] return elementsType;^[METHOD] getElementsType [TYPE] EnumElementType [PARAMETER] [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^TernaryValue result = super .testForEquality ( that )  ;^108^^^^^107^113^[REPLACE] TernaryValue result = super.testForEquality ( that ) ;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  JSType that  [TYPE]  TernaryValue result  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^if  ( result == true )  {^109^^^^^107^113^[REPLACE] if  ( result != null )  {^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  JSType that  [TYPE]  TernaryValue result  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return getReferenceName (  ) ;^110^^^^^107^113^[REPLACE] return result;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  JSType that  [TYPE]  TernaryValue result  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return defineDeclaredProperty ( name, elementsType, false ) ;^112^^^^^107^113^[REPLACE] return this.equals ( that )  ? TRUE : FALSE;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  JSType that  [TYPE]  TernaryValue result  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return   that.equals ( getNativeType ( JSTypeNative.OBJECT_PROTOTYPE )  )  || JSType.isSubtype ( this, that ) ;^117^118^119^^^116^120^[REPLACE] return that.equals ( getNativeType ( JSTypeNative.OBJECT_TYPE )  )  || that.equals ( getNativeType ( JSTypeNative.OBJECT_PROTOTYPE )  )  || JSType.isSubtype ( this, that ) ;^[METHOD] isSubtype [TYPE] boolean [PARAMETER] JSType that [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  JSType that  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return defineDeclaredProperty ( name, elementsType, false ) ;^124^^^^^123^125^[REPLACE] return getReferenceName (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return null.caseObjectType ( this ) ;^129^^^^^128^130^[REPLACE] return visitor.caseObjectType ( this ) ;^[METHOD] visit [TYPE] <T> [PARAMETER] Visitor<T> visitor [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  boolean false  true  [TYPE]  Visitor visitor  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return false;^134^^^^^133^135^[REPLACE] return null;^[METHOD] getConstructor [TYPE] FunctionType [PARAMETER] [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return true;^139^^^^^138^140^[REPLACE] return false;^[METHOD] matchesNumberContext [TYPE] boolean [PARAMETER] [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return false;^144^^^^^143^145^[REPLACE] return true;^[METHOD] matchesStringContext [TYPE] boolean [PARAMETER] [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 
[REPLACE]^return false;^149^^^^^148^150^[REPLACE] return true;^[METHOD] matchesObjectContext [TYPE] boolean [PARAMETER] [CLASS] EnumType   [TYPE]  Set elements  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  EnumElementType elementsType 