[buglab_swap_variables]^super ( minDaysInFirstWeek, param, base ) ;^59^^^^^58^60^super ( base, param, minDaysInFirstWeek ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] <init> [RETURN_TYPE] Object,int)   Chronology base Object param int minDaysInFirstWeek [VARIABLES] Object  param  Chronology  base  boolean  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MONTH_LENGTH  minDaysInFirstWeek  
[buglab_swap_variables]^super (  param, minDaysInFirstWeek ) ;^59^^^^^58^60^super ( base, param, minDaysInFirstWeek ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] <init> [RETURN_TYPE] Object,int)   Chronology base Object param int minDaysInFirstWeek [VARIABLES] Object  param  Chronology  base  boolean  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MONTH_LENGTH  minDaysInFirstWeek  
[buglab_swap_variables]^super ( base, minDaysInFirstWeek, param ) ;^59^^^^^58^60^super ( base, param, minDaysInFirstWeek ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] <init> [RETURN_TYPE] Object,int)   Chronology base Object param int minDaysInFirstWeek [VARIABLES] Object  param  Chronology  base  boolean  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MONTH_LENGTH  minDaysInFirstWeek  
[buglab_swap_variables]^super ( base,  minDaysInFirstWeek ) ;^59^^^^^58^60^super ( base, param, minDaysInFirstWeek ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] <init> [RETURN_TYPE] Object,int)   Chronology base Object param int minDaysInFirstWeek [VARIABLES] Object  param  Chronology  base  boolean  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MONTH_LENGTH  minDaysInFirstWeek  
[buglab_swap_variables]^super ( base, param ) ;^59^^^^^58^60^super ( base, param, minDaysInFirstWeek ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] <init> [RETURN_TYPE] Object,int)   Chronology base Object param int minDaysInFirstWeek [VARIABLES] Object  param  Chronology  base  boolean  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MONTH_LENGTH  minDaysInFirstWeek  
[buglab_swap_variables]^int dayOfYear = getDayOfYear ( thisYear, instant ) ;^66^^^^^63^80^int dayOfYear = getDayOfYear ( instant, thisYear ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] setYear [RETURN_TYPE] long   long instant int year [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  serialVersionUID  int  MONTH_LENGTH  dayOfYear  millisOfDay  minDaysInFirstWeek  thisYear  year  boolean  
[buglab_swap_variables]^int dayOfYear = getDayOfYear (  thisYear ) ;^66^^^^^63^80^int dayOfYear = getDayOfYear ( instant, thisYear ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] setYear [RETURN_TYPE] long   long instant int year [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  serialVersionUID  int  MONTH_LENGTH  dayOfYear  millisOfDay  minDaysInFirstWeek  thisYear  year  boolean  
[buglab_swap_variables]^int dayOfYear = getDayOfYear ( instant ) ;^66^^^^^63^80^int dayOfYear = getDayOfYear ( instant, thisYear ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] setYear [RETURN_TYPE] long   long instant int year [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  serialVersionUID  int  MONTH_LENGTH  dayOfYear  millisOfDay  minDaysInFirstWeek  thisYear  year  boolean  
[buglab_swap_variables]^instant = getYearMonthDayMillis ( dayOfYear, 1, year ) ;^77^^^^^63^80^instant = getYearMonthDayMillis ( year, 1, dayOfYear ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] setYear [RETURN_TYPE] long   long instant int year [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  serialVersionUID  int  MONTH_LENGTH  dayOfYear  millisOfDay  minDaysInFirstWeek  thisYear  year  boolean  
[buglab_swap_variables]^instant = getYearMonthDayMillis (  1, dayOfYear ) ;^77^^^^^63^80^instant = getYearMonthDayMillis ( year, 1, dayOfYear ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] setYear [RETURN_TYPE] long   long instant int year [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  serialVersionUID  int  MONTH_LENGTH  dayOfYear  millisOfDay  minDaysInFirstWeek  thisYear  year  boolean  
[buglab_swap_variables]^instant = getYearMonthDayMillis ( year, 1 ) ;^77^^^^^63^80^instant = getYearMonthDayMillis ( year, 1, dayOfYear ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] setYear [RETURN_TYPE] long   long instant int year [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  serialVersionUID  int  MONTH_LENGTH  dayOfYear  millisOfDay  minDaysInFirstWeek  thisYear  year  boolean  
[buglab_swap_variables]^long minuendRem = minuendYear - getYearMillis ( minuendInstant ) ;^89^^^^^83^97^long minuendRem = minuendInstant - getYearMillis ( minuendYear ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] getYearDifference [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  subtrahendYear  thisYear  year  boolean  
[buglab_swap_variables]^long subtrahendRem = subtrahendYear - getYearMillis ( subtrahendInstant ) ;^90^^^^^83^97^long subtrahendRem = subtrahendInstant - getYearMillis ( subtrahendYear ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] getYearDifference [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  subtrahendYear  thisYear  year  boolean  
[buglab_swap_variables]^int difference = subtrahendYear - minuendYear;^92^^^^^83^97^int difference = minuendYear - subtrahendYear;^[CLASS] BasicFixedMonthChronology  [METHOD] getYearDifference [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  subtrahendYear  thisYear  year  boolean  
[buglab_swap_variables]^if  ( subtrahendRem < minuendRem )  {^93^^^^^83^97^if  ( minuendRem < subtrahendRem )  {^[CLASS] BasicFixedMonthChronology  [METHOD] getYearDifference [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  subtrahendYear  thisYear  year  boolean  
[buglab_swap_variables]^return  (  ( MILLIS_PER_MONTH - 1 )  * month ) ;^101^^^^^100^102^return  (  ( month - 1 )  * MILLIS_PER_MONTH ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] getTotalMillisByYearMonth [RETURN_TYPE] long   int year int month [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  month  subtrahendYear  thisYear  year  boolean  
[buglab_swap_variables]^return  ( getDayOfYear ( MONTH_LENGTH )  - 1 )  % millis + 1;^107^^^^^105^108^return  ( getDayOfYear ( millis )  - 1 )  % MONTH_LENGTH + 1;^[CLASS] BasicFixedMonthChronology  [METHOD] getDayOfMonth [RETURN_TYPE] int   long millis [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  month  subtrahendYear  thisYear  year  boolean  
[buglab_swap_variables]^return  ( year != 13 )  ? MONTH_LENGTH :  ( isLeapYear ( month )  ? 6 : 5 ) ;^117^^^^^116^118^return  ( month != 13 )  ? MONTH_LENGTH :  ( isLeapYear ( year )  ? 6 : 5 ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] getDaysInYearMonth [RETURN_TYPE] int   int year int month [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  month  subtrahendYear  thisYear  year  boolean  
[buglab_swap_variables]^return  ( month != 13 )  ? year :  ( isLeapYear ( MONTH_LENGTH )  ? 6 : 5 ) ;^117^^^^^116^118^return  ( month != 13 )  ? MONTH_LENGTH :  ( isLeapYear ( year )  ? 6 : 5 ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] getDaysInYearMonth [RETURN_TYPE] int   int year int month [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  month  subtrahendYear  thisYear  year  boolean  
[buglab_swap_variables]^return  ( MONTH_LENGTH != 13 ? month : 6 ) ;^127^^^^^126^128^return  ( month != 13 ? MONTH_LENGTH : 6 ) ;^[CLASS] BasicFixedMonthChronology  [METHOD] getDaysInMonthMax [RETURN_TYPE] int   int month [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  month  subtrahendYear  thisYear  year  boolean  
[buglab_swap_variables]^return  ( getDayOfYear ( MONTH_LENGTH )  - 1 )  / millis + 1;^132^^^^^131^133^return  ( getDayOfYear ( millis )  - 1 )  / MONTH_LENGTH + 1;^[CLASS] BasicFixedMonthChronology  [METHOD] getMonthOfYear [RETURN_TYPE] int   long millis [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  month  subtrahendYear  thisYear  year  boolean  
[buglab_swap_variables]^long monthZeroBased =  ( year - getYearMillis ( millis )  )  / MILLIS_PER_MONTH;^137^^^^^136^139^long monthZeroBased =  ( millis - getYearMillis ( year )  )  / MILLIS_PER_MONTH;^[CLASS] BasicFixedMonthChronology  [METHOD] getMonthOfYear [RETURN_TYPE] int   long millis int year [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  millis  minuendInstant  minuendRem  monthZeroBased  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  month  subtrahendYear  thisYear  year  boolean  
[buglab_swap_variables]^long monthZeroBased =  ( millis - getYearMillis ( MILLIS_PER_MONTH )  )  / year;^137^^^^^136^139^long monthZeroBased =  ( millis - getYearMillis ( year )  )  / MILLIS_PER_MONTH;^[CLASS] BasicFixedMonthChronology  [METHOD] getMonthOfYear [RETURN_TYPE] int   long millis int year [VARIABLES] long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  instant  millis  minuendInstant  minuendRem  monthZeroBased  serialVersionUID  subtrahendInstant  subtrahendRem  int  MONTH_LENGTH  dayOfYear  difference  millisOfDay  minDaysInFirstWeek  minuendYear  month  subtrahendYear  thisYear  year  boolean  