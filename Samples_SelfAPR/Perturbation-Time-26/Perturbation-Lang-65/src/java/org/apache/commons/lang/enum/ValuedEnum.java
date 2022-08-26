[P1_Replace_Type]^private static final  short  serialVersionUID = -7129650521543789085L;^107^^^^^102^112^private static final long serialVersionUID = -7129650521543789085L;^[CLASS] ValuedEnum   [VARIABLES] 
[P8_Replace_Mix]^private static final long serialVersionUID = -7129650521543789085;^107^^^^^102^112^private static final long serialVersionUID = -7129650521543789085L;^[CLASS] ValuedEnum   [VARIABLES] 
[P1_Replace_Type]^private final  long  iValue;^112^^^^^107^117^private final int iValue;^[CLASS] ValuedEnum   [VARIABLES] 
[P8_Replace_Mix]^private   short  iValue;^112^^^^^107^117^private final int iValue;^[CLASS] ValuedEnum   [VARIABLES] 
[P14_Delete_Statement]^^121^122^^^^120^123^super ( name ) ; iValue = value;^[CLASS] ValuedEnum  [METHOD] <init> [RETURN_TYPE] String,int)   String name int value [VARIABLES] String  name  boolean  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^iValue =  null;^122^^^^^120^123^iValue = value;^[CLASS] ValuedEnum  [METHOD] <init> [RETURN_TYPE] String,int)   String name int value [VARIABLES] String  name  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^if  ( enumClass != null )  {^138^^^^^137^149^if  ( enumClass == null )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] Iterator  it  Class  enumClass  List  list  boolean  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^if  ( enumClass == this )  {^138^^^^^137^149^if  ( enumClass == null )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] Iterator  it  Class  enumClass  List  list  boolean  long  serialVersionUID  int  iValue  value  
[P9_Replace_Statement]^if  ( iToString == null )  {^138^^^^^137^149^if  ( enumClass == null )  {^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] Iterator  it  Class  enumClass  List  list  boolean  long  serialVersionUID  int  iValue  value  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("The Enum Class must not be null");^138^139^140^^^137^149^if  ( enumClass == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] Iterator  it  Class  enumClass  List  list  boolean  long  serialVersionUID  int  iValue  value  
[P16_Remove_Block]^^138^139^140^^^137^149^if  ( enumClass == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] Iterator  it  Class  enumClass  List  list  boolean  long  serialVersionUID  int  iValue  value  
[P13_Insert_Block]^if  ( enumClass == null )  {     throw new IllegalArgumentException ( "The Enum Class must not be null" ) ; }^139^^^^^137^149^[Delete]^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] Iterator  it  Class  enumClass  List  list  boolean  long  serialVersionUID  int  iValue  value  
[P1_Replace_Type]^ArrayList  list = Enum.getEnum ArrayList  ( enumClass ) ;^141^^^^^137^149^List list = Enum.getEnumList ( enumClass ) ;^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] Iterator  it  Class  enumClass  List  list  boolean  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^141^^^^^137^149^List list = Enum.getEnumList ( enumClass ) ;^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] Iterator  it  Class  enumClass  List  list  boolean  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^142^143^144^145^146^137^149^for  ( Iterator it = list.iterator (  ) ; it.hasNext (  ) ; )  { ValuedEnum enum =  ( ValuedEnum )  it.next (  ) ; if  ( enum.getValue (  )  == value )  { return enum; }^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] Iterator  it  Class  enumClass  List  list  boolean  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^ValuedEnum enum =   ( ValuedEnum )  null.next (  ) ;^143^^^^^137^149^ValuedEnum enum =  ( ValuedEnum )  it.next (  ) ;^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] Iterator  it  Class  enumClass  List  list  boolean  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^143^^^^^137^149^ValuedEnum enum =  ( ValuedEnum )  it.next (  ) ;^[CLASS] ValuedEnum  [METHOD] getEnum [RETURN_TYPE] Enum   Class enumClass int value [VARIABLES] Iterator  it  Class  enumClass  List  list  boolean  long  serialVersionUID  int  iValue  value  
[P5_Replace_Variable]^return value;^157^^^^^156^158^return iValue;^[CLASS] ValuedEnum  [METHOD] getValue [RETURN_TYPE] int   [VARIABLES] long  serialVersionUID  int  iValue  value  boolean  
[P2_Replace_Operator]^return iValue  <   (  ( ValuedEnum )  other ) .iValue;^174^^^^^173^175^return iValue -  (  ( ValuedEnum )  other ) .iValue;^[CLASS] ValuedEnum  [METHOD] compareTo [RETURN_TYPE] int   Object other [VARIABLES] Object  other  boolean  long  serialVersionUID  int  iValue  value  
[P5_Replace_Variable]^return value -  (  ( ValuedEnum )  other ) .iValue;^174^^^^^173^175^return iValue -  (  ( ValuedEnum )  other ) .iValue;^[CLASS] ValuedEnum  [METHOD] compareTo [RETURN_TYPE] int   Object other [VARIABLES] Object  other  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^if  ( iToString != null )  {^185^^^^^184^190^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P6_Replace_Expression]^if  ( (((shortName + "[") + getName()) + "=") + getValue() + "]" )  {^185^^^^^184^190^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P6_Replace_Expression]^if  (  (  ( shortName + "[" )  +  ( getName (  )  )  )  + "=" + getValue (  ) )  {^185^^^^^184^190^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P6_Replace_Expression]^if  (  ( shortName + "[" )  +  ( getName (  )  )  + "=" )  {^185^^^^^184^190^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P6_Replace_Expression]^if  ( shortName + "[" + getName (  ) )  {^185^^^^^184^190^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P6_Replace_Expression]^if  ( shortName + "[" )  {^185^^^^^184^190^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^if  ( iToString == true )  {^185^^^^^184^190^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P9_Replace_Statement]^if  ( enumClass == null )  {^185^^^^^184^190^if  ( iToString == null )  {^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P15_Unwrap_Block]^java.lang.String shortName = org.apache.commons.lang.ClassUtils.getShortClassName(getEnumClass()); iToString = ((((shortName + "[") + (getName())) + "=") + (getValue())) + "]";^185^186^187^188^^184^190^if  ( iToString == null )  { String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ; iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]"; }^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P16_Remove_Block]^^185^186^187^188^^184^190^if  ( iToString == null )  { String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ; iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]"; }^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName + "[" + getName (  >>  )  + "=" + getValue (  )  + "]";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName + "[" + getName (   instanceof   )  + "=" + getValue (  )  + "]";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName  &&  "["  &&  getName (  )  + "=" + getValue (  )  + "]";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName  ||  "[" + getName (  )  + "=" + getValue (  )  + "]";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P3_Replace_Literal]^iToString = shortName + "" + getName (  )  + "=" + getValue (  )  + "]";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P3_Replace_Literal]^iToString = shortName + "[" + getName (  )  + "" + getValue (  )  + "]";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P3_Replace_Literal]^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P7_Replace_Invocation]^iToString = shortName + "[" + getEnumClass (  )  + "=" + getValue (  )  + "]";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P8_Replace_Mix]^iToString =  null + "[" + getName (  )  + "^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P1_Replace_Type]^char shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ;^186^^^^^184^190^String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ;^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P7_Replace_Invocation]^String shortName = ClassUtils.getShortClassName ( getName (  )  ) ;^186^^^^^184^190^String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ;^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^186^^^^^184^190^String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ;^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName + "[" + getName (  &&  )  + "=" + getValue (  )  + "]";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName + "[" + getName (  <  )  + "=" + getValue (  )  + "]";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName  &  "["  &  getName (  )  + "=" + getValue (  )  + "]";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P2_Replace_Operator]^iToString = shortName  >>  "[" + getName (  )  + "=" + getValue (  )  + "]";^187^^^^^184^190^iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  
[P14_Delete_Statement]^^186^187^^^^184^190^String shortName = ClassUtils.getShortClassName ( getEnumClass (  )  ) ; iToString = shortName + "[" + getName (  )  + "=" + getValue (  )  + "]";^[CLASS] ValuedEnum  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  shortName  boolean  long  serialVersionUID  int  iValue  value  