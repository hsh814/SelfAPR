[P1_Replace_Type]^private static final  short  serialVersionUID = -3513011772763289092L;^31^^^^^26^36^private static final long serialVersionUID = -3513011772763289092L;^[CLASS] FixedDateTimeZone   [VARIABLES] 
[P8_Replace_Mix]^private static final  int  serialVersionUID = -3513011772763289092;^31^^^^^26^36^private static final long serialVersionUID = -3513011772763289092L;^[CLASS] FixedDateTimeZone   [VARIABLES] 
[P1_Replace_Type]^private final char iNameKey;^33^^^^^28^38^private final String iNameKey;^[CLASS] FixedDateTimeZone   [VARIABLES] 
[P1_Replace_Type]^private final  long  iWallOffset;^34^^^^^29^39^private final int iWallOffset;^[CLASS] FixedDateTimeZone   [VARIABLES] 
[P1_Replace_Type]^private final  long  iStandardOffset;^35^^^^^30^40^private final int iStandardOffset;^[CLASS] FixedDateTimeZone   [VARIABLES] 
[P8_Replace_Mix]^private final  short  iStandardOffset;^35^^^^^30^40^private final int iStandardOffset;^[CLASS] FixedDateTimeZone   [VARIABLES] 
[P5_Replace_Variable]^super ( nameKey ) ;^39^^^^^37^43^super ( id ) ;^[CLASS] FixedDateTimeZone  [METHOD] <init> [RETURN_TYPE] String,int,int)   String id String nameKey int wallOffset int standardOffset [VARIABLES] String  iNameKey  id  nameKey  boolean  long  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P14_Delete_Statement]^^39^^^^^37^43^super ( id ) ;^[CLASS] FixedDateTimeZone  [METHOD] <init> [RETURN_TYPE] String,int,int)   String id String nameKey int wallOffset int standardOffset [VARIABLES] String  iNameKey  id  nameKey  boolean  long  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^iNameKey = id;^40^^^^^37^43^iNameKey = nameKey;^[CLASS] FixedDateTimeZone  [METHOD] <init> [RETURN_TYPE] String,int,int)   String id String nameKey int wallOffset int standardOffset [VARIABLES] String  iNameKey  id  nameKey  boolean  long  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P8_Replace_Mix]^iNameKey =  null;^40^^^^^37^43^iNameKey = nameKey;^[CLASS] FixedDateTimeZone  [METHOD] <init> [RETURN_TYPE] String,int,int)   String id String nameKey int wallOffset int standardOffset [VARIABLES] String  iNameKey  id  nameKey  boolean  long  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^iWallOffset = standardOffset;^41^^^^^37^43^iWallOffset = wallOffset;^[CLASS] FixedDateTimeZone  [METHOD] <init> [RETURN_TYPE] String,int,int)   String id String nameKey int wallOffset int standardOffset [VARIABLES] String  iNameKey  id  nameKey  boolean  long  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P11_Insert_Donor_Statement]^iStandardOffset = standardOffset;iWallOffset = wallOffset;^41^^^^^37^43^iWallOffset = wallOffset;^[CLASS] FixedDateTimeZone  [METHOD] <init> [RETURN_TYPE] String,int,int)   String id String nameKey int wallOffset int standardOffset [VARIABLES] String  iNameKey  id  nameKey  boolean  long  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^iStandardOffset = wallOffset;^42^^^^^37^43^iStandardOffset = standardOffset;^[CLASS] FixedDateTimeZone  [METHOD] <init> [RETURN_TYPE] String,int,int)   String id String nameKey int wallOffset int standardOffset [VARIABLES] String  iNameKey  id  nameKey  boolean  long  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P11_Insert_Donor_Statement]^iWallOffset = wallOffset;iStandardOffset = standardOffset;^42^^^^^37^43^iStandardOffset = standardOffset;^[CLASS] FixedDateTimeZone  [METHOD] <init> [RETURN_TYPE] String,int,int)   String id String nameKey int wallOffset int standardOffset [VARIABLES] String  iNameKey  id  nameKey  boolean  long  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return nameKey;^46^^^^^45^47^return iNameKey;^[CLASS] FixedDateTimeZone  [METHOD] getNameKey [RETURN_TYPE] String   long instant [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return wallOffset;^50^^^^^49^51^return iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] getOffset [RETURN_TYPE] int   long instant [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return wallOffset;^54^^^^^53^55^return iStandardOffset;^[CLASS] FixedDateTimeZone  [METHOD] getStandardOffset [RETURN_TYPE] int   long instant [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return wallOffset;^58^^^^^57^59^return iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] getOffsetFromLocal [RETURN_TYPE] int   long instantLocal [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P3_Replace_Literal]^return false;^62^^^^^61^63^return true;^[CLASS] FixedDateTimeZone  [METHOD] isFixed [RETURN_TYPE] boolean   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return serialVersionUID;^66^^^^^65^67^return instant;^[CLASS] FixedDateTimeZone  [METHOD] nextTransition [RETURN_TYPE] long   long instant [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return serialVersionUID;^70^^^^^69^71^return instant;^[CLASS] FixedDateTimeZone  [METHOD] previousTransition [RETURN_TYPE] long   long instant [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P14_Delete_Statement]^^78^^^^^77^87^throw ExceptionUtils.unsupportedInGwt (  ) ;^[CLASS] FixedDateTimeZone  [METHOD] toTimeZone [RETURN_TYPE] TimeZone   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P2_Replace_Operator]^if  ( this != obj )  {^90^^^^^89^101^if  ( this == obj )  {^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P15_Unwrap_Block]^return true;^90^91^92^^^89^101^if  ( this == obj )  { return true; }^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P16_Remove_Block]^^90^91^92^^^89^101^if  ( this == obj )  { return true; }^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P3_Replace_Literal]^return false;^91^^^^^89^101^return true;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P2_Replace_Operator]^if  ( obj  >  FixedDateTimeZone )  {^93^^^^^89^101^if  ( obj instanceof FixedDateTimeZone )  {^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P6_Replace_Expression]^if  ( getID()) && (iStandardOffset == other.iStandardOffset) && iWallOffset == other.iWallOffset )  {^93^^^^^89^101^if  ( obj instanceof FixedDateTimeZone )  {^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P6_Replace_Expression]^if  ( getID() && iStandardOffset == other.iStandardOffset) )  {^93^^^^^89^101^if  ( obj instanceof FixedDateTimeZone )  {^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P6_Replace_Expression]^if  ( iStandardOffset == other.iStandardOffset )  {^93^^^^^89^101^if  ( obj instanceof FixedDateTimeZone )  {^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P6_Replace_Expression]^if  ( iWallOffset == other.iWallOffset )  {^93^^^^^89^101^if  ( obj instanceof FixedDateTimeZone )  {^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P2_Replace_Operator]^return getID (  ) .equals ( other.getID (  )  )  || iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P2_Replace_Operator]^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset != other.iStandardOffset && iWallOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P2_Replace_Operator]^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset < other.iStandardOffset && iWallOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( other.getID (  )  )  && wallOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == wallOffset && iWallOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && wallOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == wallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( other.iStandardOffset.getID (  )  )  && iStandardOffset == other && iWallOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( other.getID (  )  )  && other.iWallOffset == other.iStandardOffset && iWallOffset == iStandardOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( other.getID (  )  )  && other.iStandardOffset == iStandardOffset && iWallOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && other.iWallOffset == iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iWallOffset && iWallOffset == other.iStandardOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P7_Replace_Invocation]^return getID (  )  .previousTransition ( instantLocal )   && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P7_Replace_Invocation]^return getID (  ) .equals ( other.hashCode (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P7_Replace_Invocation]^getID (  ) .equals ( other.hashCode (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^96^97^98^^^89^101^getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P8_Replace_Mix]^getID (  )  .previousTransition ( instant )   && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^96^97^98^^^89^101^getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P14_Delete_Statement]^^96^97^98^^^89^101^getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == standardOffset && iWallOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( iWallOffset.getID (  )  )  && iStandardOffset == other.iStandardOffset && other == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .equals ( other.getID (  )  )  && iWallOffset == other.iStandardOffset && iStandardOffset == other.iWallOffset;^95^96^97^98^^89^101^return getID (  ) .equals ( other.getID (  )  )  && iStandardOffset == other.iStandardOffset && iWallOffset == other.iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P3_Replace_Literal]^return true;^100^^^^^89^101^return false;^[CLASS] FixedDateTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  FixedDateTimeZone  other  String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P2_Replace_Operator]^return getID (  <<  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P2_Replace_Operator]^return getID (  >  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P2_Replace_Operator]^return getID (  ) .hashCode (  )  + 37 / iStandardOffset + 31 * iWallOffset;^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P2_Replace_Operator]^return + getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P3_Replace_Literal]^return getID (  ) .hashCode (  )  + standardOffset * iStandardOffset + 31 * iWallOffset;^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P3_Replace_Literal]^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + wallOffset * iWallOffset;^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .hashCode (  )  + 37 * wallOffset + 31 * iWallOffset;^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * wallOffset;^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P5_Replace_Variable]^return getID (  ) .hashCode (  )  + 37 * iWallOffset + 31 * iStandardOffset;^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P7_Replace_Invocation]^return getID (  ) .getID (  )  + 37 * iStandardOffset + 31 * iWallOffset;^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P7_Replace_Invocation]^return hashCode (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  
[P14_Delete_Statement]^^104^^^^^103^105^return getID (  ) .hashCode (  )  + 37 * iStandardOffset + 31 * iWallOffset;^[CLASS] FixedDateTimeZone  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  iNameKey  id  nameKey  boolean  long  instant  instantLocal  serialVersionUID  int  iStandardOffset  iWallOffset  standardOffset  wallOffset  