[P1_Replace_Type]^private static final  short  serialVersionUID = -7129650521543789085L;^106^^^^^101^111^private static final long serialVersionUID = -7129650521543789085L;^[CLASS] ValuedEnum   [VARIABLES] 
[P8_Replace_Mix]^private static final long serialVersionUID = -7129650521543789085;^106^^^^^101^111^private static final long serialVersionUID = -7129650521543789085L;^[CLASS] ValuedEnum   [VARIABLES] 
[P1_Replace_Type]^private final  short  iValue;^111^^^^^106^116^private final int iValue;^[CLASS] ValuedEnum   [VARIABLES] 
[P14_Delete_Statement]^^120^121^^^^119^122^super ( name ) ; iValue = value;^[CLASS] ValuedEnum  [METHOD] <init> [RETURN_TYPE] String,int)   String name int value [VARIABLES] String  name  boolean  long  serialVersionUID  int  iValue  value  
[P5_Replace_Variable]^iValue = iValue;^121^^^^^119^122^iValue = value;^[CLASS] ValuedEnum  [METHOD] <init> [RETURN_TYPE] String,int)   String name int value [VARIABLES] String  name  boolean  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^iValue =  null;^121^^^^^119^122^iValue = value;^[CLASS] ValuedEnum  [METHOD] <init> [RETURN_TYPE] String,int)   String name int value [VARIABLES] String  name  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^if  ( enumClass != null )  {^137^^^^^136^148^if  ( enumClass == null )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^if  ( enumClass == false )  {^137^^^^^136^148^if  ( enumClass == null )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P9_Replace_Statement]^if  ( iToString == null )  {^137^^^^^136^148^if  ( enumClass == null )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("The Enum Class must not be null");^137^138^139^^^136^148^if  ( enumClass == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P16_Remove_Block]^^137^138^139^^^136^148^if  ( enumClass == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P13_Insert_Block]^if  ( enumClass == null )  {     throw new IllegalArgumentException ( "The Enum Class must not be null" ) ; }^138^^^^^136^148^[Delete]^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P1_Replace_Type]^Set  list = Enum.getEnum Set  ( enumClass ) ;^140^^^^^136^148^List list = Enum.getEnumList ( enumClass ) ;^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^140^^^^^136^148^List list = Enum.getEnumList ( enumClass ) ;^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^if  ( enumeration.getValue (  )  > value )  {^143^^^^^136^148^if  ( enumeration.getValue (  )  == value )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P5_Replace_Variable]^if  ( enumeration.getValue (  )  == iValue )  {^143^^^^^136^148^if  ( enumeration.getValue (  )  == value )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P5_Replace_Variable]^if  ( value.getValue (  )  == enumeration )  {^143^^^^^136^148^if  ( enumeration.getValue (  )  == value )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P7_Replace_Invocation]^if  ( enumeration.compareTo (  )  == value )  {^143^^^^^136^148^if  ( enumeration.getValue (  )  == value )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P15_Unwrap_Block]^return enumeration;^143^144^145^^^136^148^if  ( enumeration.getValue (  )  == value )  { return enumeration; }^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P16_Remove_Block]^^143^144^145^^^136^148^if  ( enumeration.getValue (  )  == value )  { return enumeration; }^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P5_Replace_Variable]^for  ( Iterator list = it.iterator (  ) ; it.hasNext (  ) ; )  {^141^^^^^136^148^for  ( Iterator it = list.iterator (  ) ; it.hasNext (  ) ; )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P7_Replace_Invocation]^for  ( Iterator it = list.iterator (  ) ; it .next (  )  ; )  {^141^^^^^136^148^for  ( Iterator it = list.iterator (  ) ; it.hasNext (  ) ; )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^if  ( enumeration.getValue (  )  < value )  {^143^^^^^136^148^if  ( enumeration.getValue (  )  == value )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P7_Replace_Invocation]^if  ( enumeration .getEnum ( enumClass , value )   == value )  {^143^^^^^136^148^if  ( enumeration.getValue (  )  == value )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^if  ( enumeration.compareTo (  )  == iValue )  {^143^^^^^136^148^if  ( enumeration.getValue (  )  == value )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^ValuedEnum enumeration =  ( ValuedEnum )  it .hasNext (  )  ;^142^^^^^136^148^ValuedEnum enumeration =  ( ValuedEnum )  it.next (  ) ;^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^142^^^^^136^148^ValuedEnum enumeration =  ( ValuedEnum )  it.next (  ) ;^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^141^142^143^144^145^136^148^for  ( Iterator it = list.iterator (  ) ; it.hasNext (  ) ; )  { ValuedEnum enumeration =  ( ValuedEnum )  it.next (  ) ; if  ( enumeration.getValue (  )  == value )  { return enumeration; }^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^return true;^147^^^^^136^148^return null;^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] boolean  Iterator  it  ValuedEnum  enumeration  Class  enumClass  List  list  long  serialVersionUID  int  iValue  value  
[P5_Replace_Variable]^return value;^156^^^^^155^157^return iValue;^[CLASS] ValuedEnum  [METHOD] getValue [RETURN_TYPE] int   [VARIABLES] long  serialVersionUID  int  iValue  value  boolean  
[P2_Replace_Operator]^return iValue  <<   (  ( ValuedEnum )  other ) .iValue;^173^^^^^172^174^return iValue -  (  ( ValuedEnum )  other ) .iValue;^[CLASS] ValuedEnum  [METHOD] compareTo [RETURN_TYPE] int   Object other [VARIABLES] Object  other  boolean  long  serialVersionUID  int  iValue  value  
[P5_Replace_Variable]^return value -  (  ( ValuedEnum )  other ) .iValue;^173^^^^^172^174^return iValue -  (  ( ValuedEnum )  other ) .iValue;^[CLASS] ValuedEnum  [METHOD] compareTo [RETURN_TYPE] int   Object other [VARIABLES] Object  other  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^if  ( iToString != null )  {^184^^^^^183^189^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P6_Replace_Expression]^if  ( (((shortName + "[") + getName()) + "=") + getValue() + "]" )  {^184^^^^^183^189^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P6_Replace_Expression]^if  (  (  ( shortName + "[" )  +  ( getName (  )  )  )  + "=" + getValue (  ) )  {^184^^^^^183^189^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P6_Replace_Expression]^if  (  ( shortName + "[" )  +  ( getName (  )  )  + "=" )  {^184^^^^^183^189^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P6_Replace_Expression]^if  ( shortName + "[" + getName (  ) )  {^184^^^^^183^189^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P6_Replace_Expression]^if  ( shortName + "[" )  {^184^^^^^183^189^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^if  ( iToString == true )  {^184^^^^^183^189^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P9_Replace_Statement]^if  ( enumClass == null )  {^184^^^^^183^189^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P15_Unwrap_Block]^java.lang.String shortName = org.apache.commons.lang.ClassUtils.getShortClassName(getEnumClass()); iToString = ((((shortName + "[") + (getName())) + "=") + (getValue())) + "]";^184^185^186^187^^183^189^if  ( iToString == null )  { String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ; iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]"; }^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P16_Remove_Block]^^184^185^186^187^^183^189^if  ( iToString == null )  { String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ; iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]"; }^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName + "[" + getName (  &  )  + "=" + getValue (  )  + "]";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName + "[" + getName (  <<  )  + "=" + getValue (  )  + "]";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName  <  "["  <  getName (  )  + "=" + getValue (  )  + "]";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName  <=  "[" + getName (  )  + "=" + getValue (  )  + "]";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P3_Replace_Literal]^iToString = shortName + "[" + getName (  )  + "" + getValue (  )  + "]";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P3_Replace_Literal]^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P7_Replace_Invocation]^iToString = shortName + "[" + getEnumClass (  )  + "=" + getValue (  )  + "]";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^iToString =  null + "[" + getName (  )  + "^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P1_Replace_Type]^char shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ;^185^^^^^183^189^String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ;^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P7_Replace_Invocation]^String shortName = ClassUtils.getShortClassName ( getName (  )  ) ;^185^^^^^183^189^String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ;^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^185^^^^^183^189^String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ;^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^185^186^^^^183^189^String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ; iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName + "[" + getName (  <  )  + "=" + getValue (  )  + "]";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName + "[" + getName (  ||  )  + "=" + getValue (  )  + "]";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName + "[" + getName (  ^  )  + "=" + getValue (  )  + "]";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName  |  "[" + getName (  )  + "=" + getValue (  )  + "]";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P3_Replace_Literal]^iToString = shortName + "" + getName (  )  + "=" + getValue (  )  + "]";^186^^^^^183^189^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
