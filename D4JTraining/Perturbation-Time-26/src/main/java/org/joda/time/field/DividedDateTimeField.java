[REPLACE]^private static final long serialVersionUID ;^37^^^^^^^[REPLACE] private static final long serialVersionUID = 8318475124230605365L;^ [CLASS] DividedDateTimeField  
[REPLACE]^int iDivisor;^40^^^^^^^[REPLACE] final int iDivisor;^ [CLASS] DividedDateTimeField  
[REPLACE]^private   short  iMin;^43^^^^^^^[REPLACE] private final int iMin;^ [CLASS] DividedDateTimeField  
[REPLACE]^private final  short  iMax;^44^^^^^^^[REPLACE] private final int iMax;^ [CLASS] DividedDateTimeField  
[REPLACE]^int j = field.getMaximumValue (  ) ;^56^^^^^55^80^[REPLACE] super ( field, type ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^if  ( min  ==  2 )  {^58^^^^^55^80^[REPLACE] if  ( divisor < 2 )  {^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[ADD]^^58^59^60^^^55^80^[ADD] if  ( divisor < 2 )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^return ;^59^^^^^55^80^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^DurationField unitField = field .getMaximumValue (  )  ;^62^^^^^55^80^[REPLACE] DurationField unitField = field.getDurationField (  ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^if  ( iDurationField != true )  {^63^^^^^55^80^[REPLACE] if  ( unitField == null )  {^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[ADD]^iDurationField = null;unitField, type.getDurationType (  ) , divisor ) ;^63^64^65^66^67^55^80^[ADD] if  ( unitField == null )  { iDurationField = null; } else { iDurationField = new ScaledDurationField ( unitField, type.getDurationType (  ) , divisor ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^iDurationField =  new ScaledDurationField ( null, type.getDurationType (  ) , divisor ) ;^66^67^^^^55^80^[REPLACE] iDurationField = new ScaledDurationField ( unitField, type.getDurationType (  ) , divisor ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[ADD]^^66^67^^^^55^80^[ADD] iDurationField = new ScaledDurationField ( unitField, type.getDurationType (  ) , divisor ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^iDurationField = false;^64^^^^^55^80^[REPLACE] iDurationField = null;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[ADD]^^64^^^^^55^80^[ADD] iDurationField = null;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^iDivisor =  min;^70^^^^^55^80^[REPLACE] iDivisor = divisor;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^int i = field.getMaximumValue (  ) ;^72^^^^^55^80^[REPLACE] int i = field.getMinimumValue (  ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[ADD]^int min =  ( i >= 0 )  ? i / divisor :  (  ( i + 1 )  / divisor - 1 ) ;^72^73^^^^55^80^[ADD] int i = field.getMinimumValue (  ) ; int min =  ( i >= 0 )  ? i / divisor :  (  ( i + 1 )  / divisor - 1 ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^int min  =   (  (min + 1 )  / divisor - 1 ) ;^73^^^^^55^80^[REPLACE] int min =  ( i >= 0 )  ? i / divisor :  (  ( i + 1 )  / divisor - 1 ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^int j = field .getMinimumValue (  )  ;^75^^^^^55^80^[REPLACE] int j = field.getMaximumValue (  ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^int max  =  j / divisor ;^76^^^^^55^80^[REPLACE] int max =  ( j >= 0 )  ? j / divisor :  (  ( j + 1 )  / divisor - 1 ) ;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^iMin =  max;^78^^^^^55^80^[REPLACE] iMin = min;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^iMax =  min;^79^^^^^55^80^[REPLACE] iMax = max;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[ADD]^^79^^^^^55^80^[ADD] iMax = max;^[METHOD] <init> [TYPE] DateTimeFieldType,int) [PARAMETER] DateTimeField field DateTimeFieldType type int divisor [CLASS] DividedDateTimeField   [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^super ( field, type ) ;^90^^^^^89^103^[REPLACE] super ( remainderField.getWrappedField (  ) , type ) ;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^int divisor =  iDivisor^91^^^^^89^103^[REPLACE] int divisor = iDivisor = remainderField.iDivisor;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[ADD]^iDurationField = remainderField.iRangeField;^91^92^^^^89^103^[ADD] int divisor = iDivisor = remainderField.iDivisor; iDurationField = remainderField.iRangeField;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^int min =  ( i >= 0 )  ? i / divisor :  (  ( i + 1 )  / divisor - 1 ) ;^91^^^^^89^103^[REPLACE] int divisor = iDivisor = remainderField.iDivisor;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^iDurationField =  null.iRangeField;^92^^^^^89^103^[REPLACE] iDurationField = remainderField.iRangeField;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^DurationField unitField = field.getDurationField (  ) ;^94^^^^^89^103^[REPLACE] DateTimeField field = getWrappedField (  ) ;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^int i = field.getMaximumValue (  ) ;^95^^^^^89^103^[REPLACE] int i = field.getMinimumValue (  ) ;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^int min  =  i / divisor ;^96^^^^^89^103^[REPLACE] int min =  ( i >= 0 )  ? i / divisor :  (  ( i + 1 )  / divisor - 1 ) ;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^int j = field.getMinimumValue (  ) ;^98^^^^^89^103^[REPLACE] int j = field.getMaximumValue (  ) ;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[ADD]^^98^^^^^89^103^[ADD] int j = field.getMaximumValue (  ) ;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^int max  =  j / divisor ;^99^^^^^89^103^[REPLACE] int max =  ( j >= 0 )  ? j / divisor :  (  ( j + 1 )  / divisor - 1 ) ;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^iMin =  max;^101^^^^^89^103^[REPLACE] iMin = min;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^iMax =  min;^102^^^^^89^103^[REPLACE] iMax = max;^[METHOD] <init> [TYPE] DateTimeFieldType) [PARAMETER] RemainderDateTimeField remainderField DateTimeFieldType type [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  RemainderDateTimeField remainderField  [TYPE]  DateTimeFieldType type  [TYPE]  DateTimeField field  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min 
[REPLACE]^int value =.remainderWrappedField (  ) .get ( serialVersionUID ) ;^112^^^^^111^118^[REPLACE] int value = getWrappedField (  ) .get ( instant ) ;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[ADD]^^112^^^^^111^118^[ADD] int value = getWrappedField (  ) .get ( instant ) ;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[REPLACE]^if  ( value  <  2 )  {^113^^^^^111^118^[REPLACE] if  ( value >= 0 )  {^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[REPLACE]^return  (  ( max + 1 )  / iDivisor )   ;^116^^^^^111^118^[REPLACE] return  (  ( value + 1 )  / iDivisor )  - 1;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[REPLACE]^return value  ;^114^^^^^111^118^[REPLACE] return value / iDivisor;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[REPLACE]^returnmax  ;^114^^^^^111^118^[REPLACE] return value / iDivisor;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[REPLACE]^return  (  ( value + 1 )  / iDivisor )   ||  1;^116^^^^^111^118^[REPLACE] return  (  ( value + 1 )  / iDivisor )  - 1;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long instant  serialVersionUID  [TYPE]  int divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[REPLACE]^return getWrappedField (  ) .add ( instant, amount *value ) ;^129^^^^^128^130^[REPLACE] return getWrappedField (  ) .add ( instant, amount * iDivisor ) ;^[METHOD] add [TYPE] long [PARAMETER] long instant int amount [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long instant  serialVersionUID  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[REPLACE]^return getWrappedField (  ) .add ( instant, serialVersionUID  &&  iDivisor ) ;^141^^^^^140^142^[REPLACE] return getWrappedField (  ) .add ( instant, amount * iDivisor ) ;^[METHOD] add [TYPE] long [PARAMETER] long instant long amount [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  serialVersionUID  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[REPLACE]^return set ( instant, FieldUtils.remainderWrappedValue ( get ( instant ) , amount, iMin, iMax )  ) ;^153^^^^^152^154^[REPLACE] return set ( instant, FieldUtils.getWrappedValue ( get ( instant ) , amount, iMin, iMax )  ) ;^[METHOD] addWrapField [TYPE] long [PARAMETER] long instant int amount [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  serialVersionUID  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[REPLACE]^return getWrappedField (  ) .getDifference ( minuendInstant, subtrahendInstant )   ;^157^^^^^156^158^[REPLACE] return getWrappedField (  ) .getDifference ( minuendInstant, subtrahendInstant )  / iDivisor;^[METHOD] getDifference [TYPE] int [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[REPLACE]^return getWrappedField (  ) .getDifferenceAsLong ( minuendInstant, subtrahendInstant )   ;^161^^^^^160^162^[REPLACE] return getWrappedField (  ) .getDifferenceAsLong ( minuendInstant, subtrahendInstant )  / iDivisor;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  value 
[REPLACE]^FieldUtils.verifyValueBounds ( this, remainder, iMin, iMax ) ;^173^^^^^172^176^[REPLACE] FieldUtils.verifyValueBounds ( this, value, iMin, iMax ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int value [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^int remainder = getRemainder ( getWrappedField (  ) .get ( subtrahendInstant )  ) ;^174^^^^^172^176^[REPLACE] int remainder = getRemainder ( getWrappedField (  ) .get ( instant )  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int value [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^return getWrappedField (  )  .get ( subtrahendInstant )  ;^175^^^^^172^176^[REPLACE] return getWrappedField (  ) .set ( instant, value * iDivisor + remainder ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int value [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^return iDivisor;^182^^^^^181^183^[REPLACE] return iDurationField;^[METHOD] getDurationField [TYPE] DurationField [PARAMETER] [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^return iMax;^191^^^^^190^192^[REPLACE] return iMin;^[METHOD] getMinimumValue [TYPE] int [PARAMETER] [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^return iMin;^200^^^^^199^201^[REPLACE] return iMax;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^DurationField unitField = field.getDurationField (  ) ;^204^^^^^203^206^[REPLACE] DateTimeField field = getWrappedField (  ) ;^[METHOD] roundFloor [TYPE] long [PARAMETER] long instant [CLASS] DividedDateTimeField   [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^return field.roundFloor ( field.set ( instant, get ( instant )   ;^205^^^^^203^206^[REPLACE] return field.roundFloor ( field.set ( instant, get ( instant )  * iDivisor )  ) ;^[METHOD] roundFloor [TYPE] long [PARAMETER] long instant [CLASS] DividedDateTimeField   [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^return set ( subtrahendInstant, get ( getWrappedField (  ) .remainder ( instant )  )  ) ;^209^^^^^208^210^[REPLACE] return set ( instant, get ( getWrappedField (  ) .remainder ( instant )  )  ) ;^[METHOD] remainder [TYPE] long [PARAMETER] long instant [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^return iDurationField;^218^^^^^217^219^[REPLACE] return iDivisor;^[METHOD] getDivisor [TYPE] int [PARAMETER] [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^if  (remainder  ==  3 )  {^222^^^^^221^227^[REPLACE] if  ( value >= 0 )  {^[METHOD] getRemainder [TYPE] int [PARAMETER] int value [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^return  ( remainder )  +  (  ( remainder + 1 )  % iDivisor ) ;^225^^^^^221^227^[REPLACE] return  ( iDivisor - 1 )  +  (  ( value + 1 )  % iDivisor ) ;^[METHOD] getRemainder [TYPE] int [PARAMETER] int value [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^return value / iDivisor;^223^^^^^221^227^[REPLACE] return value % iDivisor;^[METHOD] getRemainder [TYPE] int [PARAMETER] int value [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 
[REPLACE]^return  ( iDivisor - 1 )   !=   (  ( remainder  !=  1 )  % iDivisor ) ;;^225^^^^^221^227^[REPLACE] return  ( iDivisor - 1 )  +  (  ( value + 1 )  % iDivisor ) ;^[METHOD] getRemainder [TYPE] int [PARAMETER] int value [CLASS] DividedDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField iDurationField  unitField  [TYPE]  long amount  instant  minuendInstant  serialVersionUID  subtrahendInstant  [TYPE]  int amount  divisor  i  iDivisor  iMax  iMin  j  max  min  remainder  value 