[REPLACE]^private static final long serialVersionUID  = null ;^52^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] VoidType  
[REPLACE]^return registry.getNativeType ( JSTypeNative.NO_TYPE ) ;^55^^^^^54^56^[REPLACE] super ( registry ) ;^[METHOD] <init> [TYPE] JSTypeRegistry) [PARAMETER] JSTypeRegistry registry [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  true 
[REPLACE]^return   JSTypeNative.NO_TYPE   ;^60^^^^^59^61^[REPLACE] return registry.getNativeType ( JSTypeNative.NO_TYPE ) ;^[METHOD] restrictByNotNullOrUndefined [TYPE] JSType [PARAMETER] [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( UNKNOWN.equals ( super .testForEquality ( that )   )  )  {^65^^^^^64^73^[REPLACE] if  ( UNKNOWN.equals ( super.testForEquality ( that )  )  )  {^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^return "undefined";^66^^^^^64^73^[REPLACE] return UNKNOWN;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^if  (  that.isSubtype ( getNativeType ( JSTypeNative.NULL_TYPE )  )  )  {^68^69^^^^64^73^[REPLACE] if  ( that.isSubtype ( this )  || that.isSubtype ( getNativeType ( JSTypeNative.NULL_TYPE )  )  )  {^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^return true;^70^^^^^64^73^[REPLACE] return TRUE;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^return false;^72^^^^^64^73^[REPLACE] return FALSE;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^return true;^77^^^^^76^78^[REPLACE] return false;^[METHOD] matchesNumberContext [TYPE] boolean [PARAMETER] [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return true;^82^^^^^81^83^[REPLACE] return false;^[METHOD] matchesObjectContext [TYPE] boolean [PARAMETER] [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return false;^87^^^^^86^88^[REPLACE] return true;^[METHOD] matchesStringContext [TYPE] boolean [PARAMETER] [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return TRUE;^92^^^^^91^93^[REPLACE] return true;^[METHOD] isVoidType [TYPE] boolean [PARAMETER] [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return false;^97^^^^^96^98^[REPLACE] return "undefined";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return registry.getNativeType ( JSTypeNative.NO_TYPE ) ;^102^^^^^101^103^[REPLACE] return BooleanLiteralSet.FALSE;^[METHOD] getPossibleToBooleanOutcomes [TYPE] BooleanLiteralSet [PARAMETER] [CLASS] VoidType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return null.caseVoidType (  ) ;^107^^^^^106^108^[REPLACE] return visitor.caseVoidType (  ) ;^[METHOD] visit [TYPE] <T> [PARAMETER] Visitor<T> visitor [CLASS] VoidType   [TYPE]  Visitor visitor  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 