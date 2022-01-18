[REPLACE]^private static final long serialVersionUID ;^34^^^^^^^[REPLACE] private static final long serialVersionUID = -1587436826395135328L;^ [CLASS] BasicWeekOfWeekyearDateTimeField  
[REPLACE]^private  BasicChronology iChronology;^36^^^^^^^[REPLACE] private final BasicChronology iChronology;^ [CLASS] BasicWeekOfWeekyearDateTimeField  
[REPLACE]^super ( DateTimeFieldType.weekyear (  ) , weeks ) ;^42^^^^^41^44^[REPLACE] super ( DateTimeFieldType.weekOfWeekyear (  ) , weeks ) ;^[METHOD] <init> [TYPE] DurationField) [PARAMETER] BasicChronology chronology DurationField weeks [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField weeks  [TYPE]  long serialVersionUID  [TYPE]  BasicChronology chronology  iChronology 
[REMOVE]^int weekyear = partial.get ( DateTimeFieldType.weekyear (  )  ) ;^42^^^^^41^44^[REMOVE] ^[METHOD] <init> [TYPE] DurationField) [PARAMETER] BasicChronology chronology DurationField weeks [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField weeks  [TYPE]  long serialVersionUID  [TYPE]  BasicChronology chronology  iChronology 
[REPLACE]^iChronology =  null;^43^^^^^41^44^[REPLACE] iChronology = chronology;^[METHOD] <init> [TYPE] DurationField) [PARAMETER] BasicChronology chronology DurationField weeks [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField weeks  [TYPE]  long serialVersionUID  [TYPE]  BasicChronology chronology  iChronology 
[ADD]^^43^^^^^41^44^[ADD] iChronology = chronology;^[METHOD] <init> [TYPE] DurationField) [PARAMETER] BasicChronology chronology DurationField weeks [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  DurationField weeks  [TYPE]  long serialVersionUID  [TYPE]  BasicChronology chronology  iChronology 
[REPLACE]^return iChronology.getWeekyear ( instant ) ;^54^^^^^53^55^[REPLACE] return iChronology.getWeekOfWeekyear ( instant ) ;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return iChronology.weekOfWeekyear (  ) ;^58^^^^^57^59^[REPLACE] return iChronology.weekyears (  ) ;^[METHOD] getRangeDurationField [TYPE] DurationField [PARAMETER] [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return super.roundCeiling ( instant + 3 * DateTimeConstants.MILLIS_PER_DAY ) - 3 * DateTimeConstants.MILLIS_PER_DAY;^65^66^^^^64^67^[REPLACE] return super.roundFloor ( instant + 3 * DateTimeConstants.MILLIS_PER_DAY ) - 3 * DateTimeConstants.MILLIS_PER_DAY;^[METHOD] roundFloor [TYPE] long [PARAMETER] long instant [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return super.roundCeiling ( instant + 5 * DateTimeConstants.MILLIS_PER_DAY )  ;^70^71^^^^69^72^[REPLACE] return super.roundCeiling ( instant + 3 * DateTimeConstants.MILLIS_PER_DAY ) - 3 * DateTimeConstants.MILLIS_PER_DAY;^[METHOD] roundCeiling [TYPE] long [PARAMETER] long instant [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return super.roundFloor ( instant + 3 * DateTimeConstants.MILLIS_PER_DAY ) ;^75^^^^^74^76^[REPLACE] return super.remainder ( instant + 3 * DateTimeConstants.MILLIS_PER_DAY ) ;^[METHOD] remainder [TYPE] long [PARAMETER] long instant [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return 1 / 3;^79^^^^^78^80^[REPLACE] return 1;^[METHOD] getMinimumValue [TYPE] int [PARAMETER] [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return 35;^83^^^^^82^84^[REPLACE] return 53;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^int weekyear = iChronology.getWeekyear ( serialVersionUID ) ;^87^^^^^86^89^[REPLACE] int weekyear = iChronology.getWeekyear ( instant ) ;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] long instant [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int weekyear 
[ADD]^^87^88^^^^86^89^[ADD] int weekyear = iChronology.getWeekyear ( instant ) ; return iChronology.getWeeksInYear ( weekyear ) ;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] long instant [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int weekyear 
[REPLACE]^return iChronology.getWeekOfWeekyear ( instant ) ;^88^^^^^86^89^[REPLACE] return iChronology.getWeeksInYear ( weekyear ) ;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] long instant [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int weekyear 
[REPLACE]^if  ( partial.isSupported ( DateTimeFieldType.weekOfWeekyear (  )  )  )  {^92^^^^^91^97^[REPLACE] if  ( partial.isSupported ( DateTimeFieldType.weekyear (  )  )  )  {^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int weekyear 
[REMOVE]^if  (  ( partial.getFieldType ( i )  )  ==  ( weekyear (  )  )  )  {     int weekyear = values[i];     return iChronology.getWeeksInYear ( weekyear ) ; }^92^^^^^91^97^[REMOVE] ^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int weekyear 
[REPLACE]^return iChronology.getWeekyear ( weekyear ) ;^94^^^^^91^97^[REPLACE] return iChronology.getWeeksInYear ( weekyear ) ;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int weekyear 
[REPLACE]^int weekyear = partial.getFieldType ( DateTimeFieldType.weekyear (  )  ) ;^93^^^^^91^97^[REPLACE] int weekyear = partial.get ( DateTimeFieldType.weekyear (  )  ) ;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int weekyear 
[REPLACE]^int weekyear = partial.get ( DateTimeFieldType .weekOfWeekyear (  )   ) ;^93^^^^^91^97^[REPLACE] int weekyear = partial.get ( DateTimeFieldType.weekyear (  )  ) ;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int weekyear 
[REPLACE]^return 53L;^96^^^^^91^97^[REPLACE] return 53;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int weekyear 
[REPLACE]^int.get = partial.size (  ) ;^100^^^^^99^108^[REPLACE] int size = partial.size (  ) ;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial int[] values [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  int[] values  [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int i  size  weekyear 
[REPLACE]^if  ( partial.getFieldType ( i )   ||  DateTimeFieldType.weekyear (  )  )  {^102^^^^^99^108^[REPLACE] if  ( partial.getFieldType ( i )  == DateTimeFieldType.weekyear (  )  )  {^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial int[] values [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  int[] values  [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int i  size  weekyear 
[REPLACE]^return iChronology.getWeekyear ( weekyear ) ;^104^^^^^99^108^[REPLACE] return iChronology.getWeeksInYear ( weekyear ) ;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial int[] values [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  int[] values  [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int i  size  weekyear 
[REPLACE]^int weekyear = iChronology.getWeekyear ( instant ) ;^103^^^^^99^108^[REPLACE] int weekyear = values[i];^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial int[] values [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  int[] values  [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int i  size  weekyear 
[REPLACE]^for (int i = 0 ; i  >  size; i++) {^101^^^^^99^108^[REPLACE] for  ( int i = 0; i < size; i++ )  {^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial int[] values [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  int[] values  [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int i  size  weekyear 
[ADD]^^101^102^103^104^105^99^108^[ADD] for  ( int i = 0; i < size; i++ )  { if  ( partial.getFieldType ( i )  == DateTimeFieldType.weekyear (  )  )  { int weekyear = values[i]; return iChronology.getWeeksInYear ( weekyear ) ; }^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial int[] values [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  int[] values  [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int i  size  weekyear 
[REPLACE]^if  ( partial.getFieldType ( i )   ||  DateTimeFieldType .weekOfWeekyear (  )   )  {^102^^^^^99^108^[REPLACE] if  ( partial.getFieldType ( i )  == DateTimeFieldType.weekyear (  )  )  {^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial int[] values [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  int[] values  [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int i  size  weekyear 
[ADD]^int weekyear = values[i];return iChronology.getWeeksInYear ( weekyear ) ;^102^103^104^105^^99^108^[ADD] if  ( partial.getFieldType ( i )  == DateTimeFieldType.weekyear (  )  )  { int weekyear = values[i]; return iChronology.getWeeksInYear ( weekyear ) ; }^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial int[] values [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  int[] values  [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int i  size  weekyear 
[REPLACE]^return iChronology .getWeekyear ( instant )  ;^104^^^^^99^108^[REPLACE] return iChronology.getWeeksInYear ( weekyear ) ;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial int[] values [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  int[] values  [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int i  size  weekyear 
[REPLACE]^for  ( int i = 0 ; i < size; i++ )  {^101^^^^^99^108^[REPLACE] for  ( int i = 0; i < size; i++ )  {^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial int[] values [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  int[] values  [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int i  size  weekyear 
[REPLACE]^return 4;^107^^^^^99^108^[REPLACE] return 53;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] ReadablePartial partial int[] values [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  int[] values  [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int i  size  weekyear 
[REPLACE]^return value  !=  52 ? getMaximumValue ( instant )  : 52;;^111^^^^^110^112^[REPLACE] return value > 52 ? getMaximumValue ( instant )  : 52;^[METHOD] getMaximumValueForSet [TYPE] int [PARAMETER] long instant int value [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int value 
[REPLACE]^return iChronology .weekyear (  )  ;^118^^^^^117^119^[REPLACE] return iChronology.weekOfWeekyear (  ) ;^[METHOD] readResolve [TYPE] Object [PARAMETER] [CLASS] BasicWeekOfWeekyearDateTimeField   [TYPE]  long instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 