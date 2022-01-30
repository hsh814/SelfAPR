[REPLACE]^private static final long serialVersionUID = 5708241235177666790;^36^^^^^^^[REPLACE] private static final long serialVersionUID = 5708241235177666790L;^ [CLASS] RemainderDateTimeField  
[REPLACE]^final  short  iDivisor;^39^^^^^^^[REPLACE] final int iDivisor;^ [CLASS] RemainderDateTimeField  
[REPLACE]^DurationField iRangeField;^40^^^^^^^[REPLACE] final DurationField iRangeField;^ [CLASS] RemainderDateTimeField  
[REPLACE]^super ( dividedField.getWrappedField (  ) , type ) ;^52^^^^^50^67^[REPLACE] super ( field, type ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor 
[REPLACE]^if  ( divisor  <=  2 )  {^54^^^^^50^67^[REPLACE] if  ( divisor < 2 )  {^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor 
[REPLACE]^return ;^55^^^^^50^67^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor 
[REPLACE]^int value = getWrappedField (  ) .get ( instant ) ;^58^^^^^50^67^[REPLACE] DurationField rangeField = field.getDurationField (  ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor 
[REPLACE]^if  (iRangeField != null )  {^59^^^^^50^67^[REPLACE] if  ( rangeField == null )  {^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor 
[REPLACE]^iRangeField =  new ScaledDurationField ( null, type.getRangeDurationType (  ) , divisor ) ;^62^63^^^^50^67^[REPLACE] iRangeField = new ScaledDurationField ( rangeField, type.getRangeDurationType (  ) , divisor ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor 
[REPLACE]^iRangeField = false;^60^^^^^50^67^[REPLACE] iRangeField = null;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor 
[REPLACE]^iRangeField = true;^60^^^^^50^67^[REPLACE] iRangeField = null;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor 
[REPLACE]^iDivisor =  null;^66^^^^^50^67^[REPLACE] iDivisor = divisor;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor 
[REPLACE]^int divided = getDivided ( getWrappedField (  ) .get ( instant )  ) ;^76^^^^^75^77^[REPLACE] this ( dividedField, dividedField.getType (  )  ) ;^[METHOD] <init> [TYPE] DividedDateTimeField) [PARAMETER] DividedDateTimeField dividedField [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor  [TYPE]  DividedDateTimeField dividedField 
[REPLACE]^this ( dividedField, dividedField.getWrappedField (  )  ) ;^76^^^^^75^77^[REPLACE] this ( dividedField, dividedField.getType (  )  ) ;^[METHOD] <init> [TYPE] DividedDateTimeField) [PARAMETER] DividedDateTimeField dividedField [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor  [TYPE]  DividedDateTimeField dividedField 
[ADD]^^76^^^^^75^77^[ADD] this ( dividedField, dividedField.getType (  )  ) ;^[METHOD] <init> [TYPE] DividedDateTimeField) [PARAMETER] DividedDateTimeField dividedField [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor  [TYPE]  DividedDateTimeField dividedField 
[REPLACE]^super ( dividedField .getType (  )  , type ) ;^87^^^^^86^90^[REPLACE] super ( dividedField.getWrappedField (  ) , type ) ;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] DividedDateTimeField dividedField DateTimeFieldType type [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor  [TYPE]  DividedDateTimeField dividedField 
[REPLACE]^super ( dividedField.getType (  ) , type ) ;^87^^^^^86^90^[REPLACE] super ( dividedField.getWrappedField (  ) , type ) ;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] DividedDateTimeField dividedField DateTimeFieldType type [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor  [TYPE]  DividedDateTimeField dividedField 
[REPLACE]^iDivisor =  null.iDivisor;^88^^^^^86^90^[REPLACE] iDivisor = dividedField.iDivisor;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] DividedDateTimeField dividedField DateTimeFieldType type [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor  [TYPE]  DividedDateTimeField dividedField 
[REPLACE]^iRangeField =  null.iDurationField;^89^^^^^86^90^[REPLACE] iRangeField = dividedField.iDurationField;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] DividedDateTimeField dividedField DateTimeFieldType type [CLASS] RemainderDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  iDivisor  [TYPE]  DividedDateTimeField dividedField 
[REPLACE]^int value = getWrappedField (  ) .get ( serialVersionUID ) ;^100^^^^^99^106^[REPLACE] int value = getWrappedField (  ) .get ( instant ) ;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  iDivisor  value 
[REPLACE]^if  ( value  >  0 )  {^101^^^^^99^106^[REPLACE] if  ( value >= 0 )  {^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  iDivisor  value 
[REPLACE]^return  ( iDivisor - 1 / 0 )   ;^104^^^^^99^106^[REPLACE] return  ( iDivisor - 1 )  +  (  ( value + 1 )  % iDivisor ) ;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  iDivisor  value 
[REPLACE]^return value / iDivisor;^102^^^^^99^106^[REPLACE] return value % iDivisor;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  iDivisor  value 
[REPLACE]^returndivisor % iDivisor;^102^^^^^99^106^[REPLACE] return value % iDivisor;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  iDivisor  value 
[REPLACE]^return  ( iDivisor - 1 )   ||   (  ( value  ||  1 )  % iDivisor ) ;^104^^^^^99^106^[REPLACE] return  ( iDivisor - 1 )  +  (  ( value + 1 )  % iDivisor ) ;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  iDivisor  value 
[REPLACE]^return set ( instant, FieldUtils .set ( instant , value )   ) ;^118^^^^^117^119^[REPLACE] return set ( instant, FieldUtils.getWrappedValue ( get ( instant ) , amount, 0, iDivisor - 1 )  ) ;^[METHOD] addWrapField [TYPE] long [PARAMETER] long instant int amount [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divisor  iDivisor  value 
[REPLACE]^FieldUtils .getWrappedValue ( value , amount , iDivisor , divided )  ;^130^^^^^129^133^[REPLACE] FieldUtils.verifyValueBounds ( this, value, 0, iDivisor - 1 ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int value [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^int divided = getDivided ( getWrappedField (  )  .set ( serialVersionUID , value )   ) ;^131^^^^^129^133^[REPLACE] int divided = getDivided ( getWrappedField (  ) .get ( instant )  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int value [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return getWrappedField (  ) .get ( instant, divided * iDivisor + value ) ;^132^^^^^129^133^[REPLACE] return getWrappedField (  ) .set ( instant, divided * iDivisor + value ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int value [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return getWrappedField (  ) .roundFloor ( instant ) ;^139^^^^^138^140^[REPLACE] return iRangeField;^[METHOD] getRangeDurationField [TYPE] DurationField [PARAMETER] [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return 2;^148^^^^^147^149^[REPLACE] return 0;^[METHOD] getMinimumValue [TYPE] int [PARAMETER] [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^returnvalue - 1;^158^^^^^157^159^[REPLACE] return iDivisor - 1;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return getWrappedField (  ) .roundHalfFloor ( instant ) ;^162^^^^^161^163^[REPLACE] return getWrappedField (  ) .roundFloor ( instant ) ;^[METHOD] roundFloor [TYPE] long [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return getWrappedField (  )  .roundHalfCeiling ( serialVersionUID )  ;^166^^^^^165^167^[REPLACE] return getWrappedField (  ) .roundCeiling ( instant ) ;^[METHOD] roundCeiling [TYPE] long [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return getWrappedField (  ) .roundFloor ( instant ) ;^170^^^^^169^171^[REPLACE] return getWrappedField (  ) .roundHalfFloor ( instant ) ;^[METHOD] roundHalfFloor [TYPE] long [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return getWrappedField (  ) .roundCeiling ( instant ) ;^174^^^^^173^175^[REPLACE] return getWrappedField (  ) .roundHalfCeiling ( instant ) ;^[METHOD] roundHalfCeiling [TYPE] long [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return getWrappedField (  )  .roundHalfCeiling ( serialVersionUID )  ;^178^^^^^177^179^[REPLACE] return getWrappedField (  ) .roundHalfEven ( instant ) ;^[METHOD] roundHalfEven [TYPE] long [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return getWrappedField (  ) .roundFloor ( instant ) ;^182^^^^^181^183^[REPLACE] return getWrappedField (  ) .remainder ( instant ) ;^[METHOD] remainder [TYPE] long [PARAMETER] long instant [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return iRangeField;^191^^^^^190^192^[REPLACE] return iDivisor;^[METHOD] getDivisor [TYPE] int [PARAMETER] [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^if  ( value  != iDivisor )  {^195^^^^^194^200^[REPLACE] if  ( value >= 0 )  {^[METHOD] getDivided [TYPE] int [PARAMETER] int value [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[ADD]^return value / iDivisor;return  (  ( value + 1 )  / iDivisor )  - 1;^195^196^197^198^199^194^200^[ADD] if  ( value >= 0 )  { return value / iDivisor; } else { return  (  ( value + 1 )  / iDivisor )  - 1; }^[METHOD] getDivided [TYPE] int [PARAMETER] int value [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return  (  ( value + 4 )  / iDivisor )   &  4;^198^^^^^194^200^[REPLACE] return  (  ( value + 1 )  / iDivisor )  - 1;^[METHOD] getDivided [TYPE] int [PARAMETER] int value [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return value  ;^196^^^^^194^200^[REPLACE] return value / iDivisor;^[METHOD] getDivided [TYPE] int [PARAMETER] int value [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return divisor  ;^196^^^^^194^200^[REPLACE] return value / iDivisor;^[METHOD] getDivided [TYPE] int [PARAMETER] int value [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 
[REPLACE]^return  (  ( iDivisor +value )  / iDivisor )  -value;^198^^^^^194^200^[REPLACE] return  (  ( value + 1 )  / iDivisor )  - 1;^[METHOD] getDivided [TYPE] int [PARAMETER] int value [CLASS] RemainderDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iRangeField  rangeField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divided  divisor  iDivisor  value 