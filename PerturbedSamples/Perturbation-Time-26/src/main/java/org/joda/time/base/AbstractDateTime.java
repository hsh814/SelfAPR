[REPLACE]^return toString (  ) ;^51^^^^^50^52^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] AbstractDateTime() [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^if  ( type != null )  {^66^^^^^65^70^[REPLACE] if  ( type == null )  {^[METHOD] get [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[ADD]^^66^67^68^^^65^70^[ADD] if  ( type == null )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] get [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[REPLACE]^return ;^67^^^^^65^70^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] get [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[ADD]^^67^^^^^65^70^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] get [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[REPLACE]^return type.withLocaleField ( getChronology (  )  ) .get ( getMillis (  )  ) ;^69^^^^^65^70^[REPLACE] return type.getField ( getChronology (  )  ) .get ( getMillis (  )  ) ;^[METHOD] get [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^79^^^^^78^80^[REPLACE] return getChronology (  ) .era (  ) .get ( getMillis (  )  ) ;^[METHOD] getEra [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^88^^^^^87^89^[REPLACE] return getChronology (  ) .centuryOfEra (  ) .get ( getMillis (  )  ) ;^[METHOD] getCenturyOfEra [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .yearOfEra (  )  .toString ( this )  ;^97^^^^^96^98^[REPLACE] return getChronology (  ) .yearOfEra (  ) .get ( getMillis (  )  ) ;^[METHOD] getYearOfEra [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  )  .yearOfEra (  )  .get ( getMillis (  )  ) ;^106^^^^^105^107^[REPLACE] return getChronology (  ) .yearOfCentury (  ) .get ( getMillis (  )  ) ;^[METHOD] getYearOfCentury [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return.withLocaleChronology (  ) .year (  ) .get ( getMillis (  )  ) ;^115^^^^^114^116^[REPLACE] return getChronology (  ) .year (  ) .get ( getMillis (  )  ) ;^[METHOD] getYear [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^124^^^^^123^125^[REPLACE] return getChronology (  ) .weekyear (  ) .get ( getMillis (  )  ) ;^[METHOD] getWeekyear [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return.withLocaleChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^133^^^^^132^134^[REPLACE] return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^[METHOD] getMonthOfYear [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^142^^^^^141^143^[REPLACE] return getChronology (  ) .weekOfWeekyear (  ) .get ( getMillis (  )  ) ;^[METHOD] getWeekOfWeekyear [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^151^^^^^150^152^[REPLACE] return getChronology (  ) .dayOfYear (  ) .get ( getMillis (  )  ) ;^[METHOD] getDayOfYear [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^162^^^^^161^163^[REPLACE] return getChronology (  ) .dayOfMonth (  ) .get ( getMillis (  )  ) ;^[METHOD] getDayOfMonth [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^173^^^^^172^174^[REPLACE] return getChronology (  ) .dayOfWeek (  ) .get ( getMillis (  )  ) ;^[METHOD] getDayOfWeek [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^183^^^^^182^184^[REPLACE] return getChronology (  ) .hourOfDay (  ) .get ( getMillis (  )  ) ;^[METHOD] getHourOfDay [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^192^^^^^191^193^[REPLACE] return getChronology (  ) .minuteOfDay (  ) .get ( getMillis (  )  ) ;^[METHOD] getMinuteOfDay [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^201^^^^^200^202^[REPLACE] return getChronology (  ) .minuteOfHour (  ) .get ( getMillis (  )  ) ;^[METHOD] getMinuteOfHour [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^210^^^^^209^211^[REPLACE] return getChronology (  ) .secondOfDay (  ) .get ( getMillis (  )  ) ;^[METHOD] getSecondOfDay [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^219^^^^^218^220^[REPLACE] return getChronology (  ) .secondOfMinute (  ) .get ( getMillis (  )  ) ;^[METHOD] getSecondOfMinute [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return getChronology (  ) .monthOfYear (  ) .get ( getMillis (  )  ) ;^228^^^^^227^229^[REPLACE] return getChronology (  ) .millisOfDay (  ) .get ( getMillis (  )  ) ;^[METHOD] getMillisOfDay [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^return.withLocaleChronology (  ) .millisOfSecond (  ) .get ( getMillis (  )  ) ;^237^^^^^236^238^[REPLACE] return getChronology (  ) .millisOfSecond (  ) .get ( getMillis (  )  ) ;^[METHOD] getMillisOfSecond [TYPE] int [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true 
[REPLACE]^if  ( locale != null )  {^259^^^^^258^266^[REPLACE] if  ( locale == null )  {^[METHOD] toCalendar [TYPE] Calendar [PARAMETER] Locale locale [CLASS] AbstractDateTime   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Calendar cal  [TYPE]  DateTimeZone zone 
[REPLACE]^locale  =  locale ;^260^^^^^258^266^[REPLACE] locale = Locale.getDefault (  ) ;^[METHOD] toCalendar [TYPE] Calendar [PARAMETER] Locale locale [CLASS] AbstractDateTime   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Calendar cal  [TYPE]  DateTimeZone zone 
[REPLACE]^GregorianCalendar cal = new GregorianCalendar ( zone.toTimeZone (  )  ) ;^262^^^^^258^266^[REPLACE] DateTimeZone zone = getZone (  ) ;^[METHOD] toCalendar [TYPE] Calendar [PARAMETER] Locale locale [CLASS] AbstractDateTime   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Calendar cal  [TYPE]  DateTimeZone zone 
[ADD]^^262^^^^^258^266^[ADD] DateTimeZone zone = getZone (  ) ;^[METHOD] toCalendar [TYPE] Calendar [PARAMETER] Locale locale [CLASS] AbstractDateTime   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Calendar cal  [TYPE]  DateTimeZone zone 
[REPLACE]^GregorianCalendar cal = new GregorianCalendar ( zone.toTimeZone (  )  ) ;^263^^^^^258^266^[REPLACE] Calendar cal = Calendar.getInstance ( zone.toTimeZone (  ) , locale ) ;^[METHOD] toCalendar [TYPE] Calendar [PARAMETER] Locale locale [CLASS] AbstractDateTime   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Calendar cal  [TYPE]  DateTimeZone zone 
[REPLACE]^return toString (  ) ;^264^^^^^258^266^[REPLACE] cal.setTime ( toDate (  )  ) ;^[METHOD] toCalendar [TYPE] Calendar [PARAMETER] Locale locale [CLASS] AbstractDateTime   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Calendar cal  [TYPE]  DateTimeZone zone 
[REPLACE]^return toString (  ) ;^265^^^^^258^266^[REPLACE] return cal;^[METHOD] toCalendar [TYPE] Calendar [PARAMETER] Locale locale [CLASS] AbstractDateTime   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Calendar cal  [TYPE]  DateTimeZone zone 
[REPLACE]^GregorianCalendar cal = new GregorianCalendar ( zone.toTimeZone (  )  ) ;^283^^^^^282^287^[REPLACE] DateTimeZone zone = getZone (  ) ;^[METHOD] toGregorianCalendar [TYPE] GregorianCalendar [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  GregorianCalendar cal  [TYPE]  DateTimeZone zone 
[REPLACE]^Calendar cal = Calendar.getInstance ( zone.toTimeZone (  ) , locale ) ;^284^^^^^282^287^[REPLACE] GregorianCalendar cal = new GregorianCalendar ( zone.toTimeZone (  )  ) ;^[METHOD] toGregorianCalendar [TYPE] GregorianCalendar [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  GregorianCalendar cal  [TYPE]  DateTimeZone zone 
[REPLACE]^return toString (  ) ;^285^^^^^282^287^[REPLACE] cal.setTime ( toDate (  )  ) ;^[METHOD] toGregorianCalendar [TYPE] GregorianCalendar [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  GregorianCalendar cal  [TYPE]  DateTimeZone zone 
[ADD]^^285^^^^^282^287^[ADD] cal.setTime ( toDate (  )  ) ;^[METHOD] toGregorianCalendar [TYPE] GregorianCalendar [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  GregorianCalendar cal  [TYPE]  DateTimeZone zone 
[REPLACE]^return toString (  ) ;^286^^^^^282^287^[REPLACE] return cal;^[METHOD] toGregorianCalendar [TYPE] GregorianCalendar [PARAMETER] [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  GregorianCalendar cal  [TYPE]  DateTimeZone zone 
[REPLACE]^if  ( pattern != null )  {^297^^^^^296^301^[REPLACE] if  ( pattern == null )  {^[METHOD] toString [TYPE] String [PARAMETER] String pattern [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  String pattern 
[ADD]^return toString (  ) ;^297^298^299^^^296^301^[ADD] if  ( pattern == null )  { return toString (  ) ; }^[METHOD] toString [TYPE] String [PARAMETER] String pattern [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  String pattern 
[REPLACE]^return cal;^298^^^^^296^301^[REPLACE] return toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] String pattern [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  String pattern 
[REPLACE]^return DateTimeFormat.forPattern ( pattern ) .withLocale ( this ) ;^300^^^^^296^301^[REPLACE] return DateTimeFormat.forPattern ( pattern ) .print ( this ) ;^[METHOD] toString [TYPE] String [PARAMETER] String pattern [CLASS] AbstractDateTime   [TYPE]  boolean false  true  [TYPE]  String pattern 
[REPLACE]^if  ( pattern != null )  {^311^^^^^310^315^[REPLACE] if  ( pattern == null )  {^[METHOD] toString [TYPE] String [PARAMETER] String pattern Locale locale [CLASS] AbstractDateTime   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  String pattern 
[ADD]^return toString (  ) ;^311^312^313^^^310^315^[ADD] if  ( pattern == null )  { return toString (  ) ; }^[METHOD] toString [TYPE] String [PARAMETER] String pattern Locale locale [CLASS] AbstractDateTime   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  String pattern 
[REPLACE]^return cal;^312^^^^^310^315^[REPLACE] return toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] String pattern Locale locale [CLASS] AbstractDateTime   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  String pattern 
[REPLACE]^return DateTimeFormat.forPattern ( pattern ) .withLocale ( locale ) .withLocale ( this ) ;^314^^^^^310^315^[REPLACE] return DateTimeFormat.forPattern ( pattern ) .withLocale ( locale ) .print ( this ) ;^[METHOD] toString [TYPE] String [PARAMETER] String pattern Locale locale [CLASS] AbstractDateTime   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  String pattern 