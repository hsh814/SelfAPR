[REPLACE]^private static final long serialVersionUID = 1;^52^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] UnknownType  
[REPLACE]^return getReferenceName (  ) ;^58^^^^^57^60^[REPLACE] super ( registry ) ;^[METHOD] <init> [TYPE] JSTypeRegistry,boolean) [PARAMETER] JSTypeRegistry registry boolean isChecked [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  isChecked  true 
[REPLACE]^this.isChecked =  true;^59^^^^^57^60^[REPLACE] this.isChecked = isChecked;^[METHOD] <init> [TYPE] JSTypeRegistry,boolean) [PARAMETER] JSTypeRegistry registry boolean isChecked [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  isChecked  true 
[REPLACE]^return false;^64^^^^^63^65^[REPLACE] return true;^[METHOD] isUnknownType [TYPE] boolean [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true 
[REPLACE]^return getReferenceName (  ) ;^69^^^^^68^70^[REPLACE] return isChecked;^[METHOD] isCheckedUnknownType [TYPE] boolean [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true 
[REPLACE]^return false;^74^^^^^73^75^[REPLACE] return true;^[METHOD] canAssignTo [TYPE] boolean [PARAMETER] JSType that [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true  [TYPE]  JSType that 
[REPLACE]^return false;^79^^^^^78^80^[REPLACE] return true;^[METHOD] canBeCalled [TYPE] boolean [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true 
[REPLACE]^return false;^84^^^^^83^85^[REPLACE] return true;^[METHOD] matchesNumberContext [TYPE] boolean [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true 
[REPLACE]^return false;^89^^^^^88^90^[REPLACE] return true;^[METHOD] matchesObjectContext [TYPE] boolean [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true 
[REPLACE]^return false;^94^^^^^93^95^[REPLACE] return true;^[METHOD] matchesStringContext [TYPE] boolean [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true 
[REPLACE]^return getReferenceName (  ) ;^99^^^^^98^100^[REPLACE] return UNKNOWN;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true  [TYPE]  JSType that 
[REPLACE]^return false;^104^^^^^103^105^[REPLACE] return true;^[METHOD] isNullable [TYPE] boolean [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true 
[REPLACE]^return false;^109^^^^^108^110^[REPLACE] return true;^[METHOD] isSubtype [TYPE] boolean [PARAMETER] JSType that [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true  [TYPE]  JSType that 
[REPLACE]^return null;^114^^^^^113^115^[REPLACE] return this;^[METHOD] getLeastSupertype [TYPE] JSType [PARAMETER] JSType that [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true  [TYPE]  JSType that 
[REPLACE]^return null;^119^^^^^118^120^[REPLACE] return this;^[METHOD] getGreatestSubtype [TYPE] JSType [PARAMETER] JSType that [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true  [TYPE]  JSType that 
[REPLACE]^return 0.caseUnknownType (  ) ;^124^^^^^123^125^[REPLACE] return visitor.caseUnknownType (  ) ;^[METHOD] visit [TYPE] <T> [PARAMETER] Visitor<T> visitor [CLASS] UnknownType   [TYPE]  Visitor visitor  [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true 
[REPLACE]^return Integer.MAX_VALUE;^129^^^^^128^130^[REPLACE] return getReferenceName (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  isChecked  true 
[REPLACE]^return false;^136^^^^^133^137^[REPLACE] return true;^[METHOD] defineProperty [TYPE] boolean [PARAMETER] String propertyName JSType type boolean inferred boolean inExterns [CLASS] UnknownType   [TYPE]  boolean false  inExterns  inferred  isChecked  true  [TYPE]  String propertyName  [TYPE]  JSType type  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^141^^^^^140^142^[REPLACE] return null;^[METHOD] getImplicitPrototype [TYPE] ObjectType [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  inExterns  inferred  isChecked  true 
[REPLACE]^return getReferenceName (  ) ;^146^^^^^145^147^[REPLACE] return Integer.MAX_VALUE;^[METHOD] getPropertiesCount [TYPE] int [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  inExterns  inferred  isChecked  true 
[REPLACE]^return null;^155^^^^^154^156^[REPLACE] return this;^[METHOD] getPropertyType [TYPE] JSType [PARAMETER] String propertyName [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  inExterns  inferred  isChecked  true  [TYPE]  String propertyName 
[REPLACE]^return false;^160^^^^^159^161^[REPLACE] return true;^[METHOD] hasProperty [TYPE] boolean [PARAMETER] String propertyName [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  inExterns  inferred  isChecked  true  [TYPE]  String propertyName 
[REPLACE]^return false;^165^^^^^164^166^[REPLACE] return null;^[METHOD] getConstructor [TYPE] FunctionType [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  inExterns  inferred  isChecked  true 
[REPLACE]^return getReferenceName (  ) ;^170^^^^^169^171^[REPLACE] return isChecked ? "??" : "?";^[METHOD] getReferenceName [TYPE] String [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  inExterns  inferred  isChecked  true 
[REPLACE]^return true;^175^^^^^174^176^[REPLACE] return false;^[METHOD] isPropertyTypeDeclared [TYPE] boolean [PARAMETER] String propertyName [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  inExterns  inferred  isChecked  true  [TYPE]  String propertyName 
[REPLACE]^return true;^180^^^^^179^181^[REPLACE] return false;^[METHOD] isPropertyTypeInferred [TYPE] boolean [PARAMETER] String propertyName [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  inExterns  inferred  isChecked  true  [TYPE]  String propertyName 
[REPLACE]^return getReferenceName (  ) ;^185^^^^^184^186^[REPLACE] return BooleanLiteralSet.BOTH;^[METHOD] getPossibleToBooleanOutcomes [TYPE] BooleanLiteralSet [PARAMETER] [CLASS] UnknownType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  inExterns  inferred  isChecked  true 