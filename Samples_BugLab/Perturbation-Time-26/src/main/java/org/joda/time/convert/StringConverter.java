[buglab_swap_variables]^return chrono.withChronology ( p ) .parseMillis ( str ) ;^65^^^^^62^66^return p.withChronology ( chrono ) .parseMillis ( str ) ;^[CLASS] StringConverter  [METHOD] getInstantMillis [RETURN_TYPE] long   Object object Chronology chrono [VARIABLES] Object  object  Chronology  chrono  String  str  boolean  StringConverter  INSTANCE  DateTimeFormatter  p  
[buglab_swap_variables]^return p.withChronology ( str ) .parseMillis ( chrono ) ;^65^^^^^62^66^return p.withChronology ( chrono ) .parseMillis ( str ) ;^[CLASS] StringConverter  [METHOD] getInstantMillis [RETURN_TYPE] long   Object object Chronology chrono [VARIABLES] Object  object  Chronology  chrono  String  str  boolean  StringConverter  INSTANCE  DateTimeFormatter  p  
[buglab_swap_variables]^return str.withChronology ( chrono ) .parseMillis ( p ) ;^65^^^^^62^66^return p.withChronology ( chrono ) .parseMillis ( str ) ;^[CLASS] StringConverter  [METHOD] getInstantMillis [RETURN_TYPE] long   Object object Chronology chrono [VARIABLES] Object  object  Chronology  chrono  String  str  boolean  StringConverter  INSTANCE  DateTimeFormatter  p  
[buglab_swap_variables]^chrono = parser.withZone ( chrono.getZone (  )  ) ;^85^^^^^83^89^chrono = chrono.withZone ( parser.getZone (  )  ) ;^[CLASS] StringConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono DateTimeFormatter parser [VARIABLES] ReadablePartial  fieldSource  boolean  Object  object  Chronology  chrono  StringConverter  INSTANCE  DateTimeFormatter  parser  long  millis  
[buglab_swap_variables]^long millis = chrono.withChronology ( parser ) .parseMillis (  ( String )  object ) ;^87^^^^^83^89^long millis = parser.withChronology ( chrono ) .parseMillis (  ( String )  object ) ;^[CLASS] StringConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono DateTimeFormatter parser [VARIABLES] ReadablePartial  fieldSource  boolean  Object  object  Chronology  chrono  StringConverter  INSTANCE  DateTimeFormatter  parser  long  millis  
[buglab_swap_variables]^return fieldSource.get ( chrono, millis ) ;^88^^^^^83^89^return chrono.get ( fieldSource, millis ) ;^[CLASS] StringConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono DateTimeFormatter parser [VARIABLES] ReadablePartial  fieldSource  boolean  Object  object  Chronology  chrono  StringConverter  INSTANCE  DateTimeFormatter  parser  long  millis  
[buglab_swap_variables]^return chrono.get (  millis ) ;^88^^^^^83^89^return chrono.get ( fieldSource, millis ) ;^[CLASS] StringConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono DateTimeFormatter parser [VARIABLES] ReadablePartial  fieldSource  boolean  Object  object  Chronology  chrono  StringConverter  INSTANCE  DateTimeFormatter  parser  long  millis  
[buglab_swap_variables]^return chrono.get ( millis, fieldSource ) ;^88^^^^^83^89^return chrono.get ( fieldSource, millis ) ;^[CLASS] StringConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono DateTimeFormatter parser [VARIABLES] ReadablePartial  fieldSource  boolean  Object  object  Chronology  chrono  StringConverter  INSTANCE  DateTimeFormatter  parser  long  millis  
[buglab_swap_variables]^return chrono.get ( fieldSource ) ;^88^^^^^83^89^return chrono.get ( fieldSource, millis ) ;^[CLASS] StringConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono DateTimeFormatter parser [VARIABLES] ReadablePartial  fieldSource  boolean  Object  object  Chronology  chrono  StringConverter  INSTANCE  DateTimeFormatter  parser  long  millis  
[buglab_swap_variables]^return millis.get ( fieldSource, chrono ) ;^88^^^^^83^89^return chrono.get ( fieldSource, millis ) ;^[CLASS] StringConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono DateTimeFormatter parser [VARIABLES] ReadablePartial  fieldSource  boolean  Object  object  Chronology  chrono  StringConverter  INSTANCE  DateTimeFormatter  parser  long  millis  
[buglab_swap_variables]^if  ( str >= 4 && ( len.charAt ( 0 )  == 'P' || str.charAt ( 0 )  == 'p' )  && ( str.charAt ( 1 )  == 'T' || str.charAt ( 1 )  == 't' )  && ( str.charAt ( len - 1 )  == 'S' || str.charAt ( len - 1 )  == 's' )  )  {^105^106^107^108^^90^120^if  ( len >= 4 && ( str.charAt ( 0 )  == 'P' || str.charAt ( 0 )  == 'p' )  && ( str.charAt ( 1 )  == 'T' || str.charAt ( 1 )  == 't' )  && ( str.charAt ( len - 1 )  == 'S' || str.charAt ( len - 1 )  == 's' )  )  {^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^( len.charAt ( str - 1 )  == 'S' || str.charAt ( len - 1 )  == 's' )  )  {^108^^^^^93^123^( str.charAt ( len - 1 )  == 'S' || str.charAt ( len - 1 )  == 's' )  )  {^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^str = len.substring ( 2, str - 1 ) ;^113^^^^^98^128^str = str.substring ( 2, len - 1 ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^str = str.substring ( 2 - 1 ) ;^113^^^^^98^128^str = str.substring ( 2, len - 1 ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^} else dotf  ( i > 0 && str.charAt ( i )  == '.' && i == -1 )  {^119^^^^^104^134^} else if  ( i > 0 && str.charAt ( i )  == '.' && dot == -1 )  {^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^} else strf  ( i > 0 && i.charAt ( i )  == '.' && dot == -1 )  {^119^^^^^104^134^} else if  ( i > 0 && str.charAt ( i )  == '.' && dot == -1 )  {^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^} else if  ( i > 0 && dot.charAt ( i )  == '.' && str == -1 )  {^119^^^^^104^134^} else if  ( i > 0 && str.charAt ( i )  == '.' && dot == -1 )  {^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^if  (  ( i.charAt ( str )  >= '0' && str.charAt ( i )  <= '9' )  || ( i == 0 && str.charAt ( 0 )  == '-' )  )  {^116^117^^^^101^131^if  (  ( str.charAt ( i )  >= '0' && str.charAt ( i )  <= '9' )  || ( i == 0 && str.charAt ( 0 )  == '-' )  )  {^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^seconds = Long.parseLong ( dot.substring ( 0, str )  ) ;^128^^^^^113^143^seconds = Long.parseLong ( str.substring ( 0, dot )  ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^seconds = Long.parseLong ( str.substring ( 0 )  ) ;^128^^^^^113^143^seconds = Long.parseLong ( str.substring ( 0, dot )  ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^str = dot.substring ( str + 1 ) ;^129^^^^^114^144^str = str.substring ( dot + 1 ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^return FieldUtils.safeAdd ( FieldUtils.safeMultiply ( millis, 1000 ) , seconds ) ;^140^^^^^137^141^return FieldUtils.safeAdd ( FieldUtils.safeMultiply ( seconds, 1000 ) , millis ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^return FieldUtils.safeAdd ( FieldUtils.safeMultiply (  1000 ) , millis ) ;^140^^^^^137^141^return FieldUtils.safeAdd ( FieldUtils.safeMultiply ( seconds, 1000 ) , millis ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^return FieldUtils.safeAdd ( FieldUtils.safeMultiply ( seconds, 1000 )  ) ;^140^^^^^137^141^return FieldUtils.safeAdd ( FieldUtils.safeMultiply ( seconds, 1000 ) , millis ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^return FieldUtils.safeAdd ( FieldUtils.safeMultiply (  1000 ) , -millis ) ;^138^^^^^123^153^return FieldUtils.safeAdd ( FieldUtils.safeMultiply ( seconds, 1000 ) , -millis ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^return FieldUtils.safeAdd ( FieldUtils.safeMultiply ( millis, 1000 ) , seconds ) ;^140^^^^^125^155^return FieldUtils.safeAdd ( FieldUtils.safeMultiply ( seconds, 1000 ) , millis ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^return FieldUtils.safeAdd ( FieldUtils.safeMultiply (  1000 ) , millis ) ;^140^^^^^125^155^return FieldUtils.safeAdd ( FieldUtils.safeMultiply ( seconds, 1000 ) , millis ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^return FieldUtils.safeAdd ( FieldUtils.safeMultiply ( seconds, 1000 )  ) ;^140^^^^^125^155^return FieldUtils.safeAdd ( FieldUtils.safeMultiply ( seconds, 1000 ) , millis ) ;^[CLASS] StringConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] Object  object  String  original  str  boolean  StringConverter  INSTANCE  int  dot  i  len  long  millis  seconds  
[buglab_swap_variables]^int pos = str.parseInto ( period, parser, 0 ) ;^159^^^^^155^167^int pos = parser.parseInto ( period, str, 0 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod period Object object Chronology chrono [VARIABLES] boolean  PeriodFormatter  parser  ReadWritablePeriod  period  Object  object  Chronology  chrono  String  str  StringConverter  INSTANCE  int  pos  
[buglab_swap_variables]^int pos = period.parseInto ( parser, str, 0 ) ;^159^^^^^155^167^int pos = parser.parseInto ( period, str, 0 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod period Object object Chronology chrono [VARIABLES] boolean  PeriodFormatter  parser  ReadWritablePeriod  period  Object  object  Chronology  chrono  String  str  StringConverter  INSTANCE  int  pos  
[buglab_swap_variables]^int pos = parser.parseInto (  str, 0 ) ;^159^^^^^155^167^int pos = parser.parseInto ( period, str, 0 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod period Object object Chronology chrono [VARIABLES] boolean  PeriodFormatter  parser  ReadWritablePeriod  period  Object  object  Chronology  chrono  String  str  StringConverter  INSTANCE  int  pos  
[buglab_swap_variables]^int pos = parser.parseInto ( period,  0 ) ;^159^^^^^155^167^int pos = parser.parseInto ( period, str, 0 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod period Object object Chronology chrono [VARIABLES] boolean  PeriodFormatter  parser  ReadWritablePeriod  period  Object  object  Chronology  chrono  String  str  StringConverter  INSTANCE  int  pos  
[buglab_swap_variables]^int pos = parser.parseInto ( str, period, 0 ) ;^159^^^^^155^167^int pos = parser.parseInto ( period, str, 0 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod period Object object Chronology chrono [VARIABLES] boolean  PeriodFormatter  parser  ReadWritablePeriod  period  Object  object  Chronology  chrono  String  str  StringConverter  INSTANCE  int  pos  
[buglab_swap_variables]^if  ( str < pos.length (  )  )  {^160^^^^^155^167^if  ( pos < str.length (  )  )  {^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod period Object object Chronology chrono [VARIABLES] boolean  PeriodFormatter  parser  ReadWritablePeriod  period  Object  object  Chronology  chrono  String  str  StringConverter  INSTANCE  int  pos  
[buglab_swap_variables]^parser.withParseType ( str.getPeriodType (  )  ) .parseMutablePeriod ( period ) ;^163^^^^^155^167^parser.withParseType ( period.getPeriodType (  )  ) .parseMutablePeriod ( str ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod period Object object Chronology chrono [VARIABLES] boolean  PeriodFormatter  parser  ReadWritablePeriod  period  Object  object  Chronology  chrono  String  str  StringConverter  INSTANCE  int  pos  
[buglab_swap_variables]^String leftStr = separator.substring ( 0, str ) ;^185^^^^^170^200^String leftStr = str.substring ( 0, separator ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^String leftStr = str.substring ( 0 ) ;^185^^^^^170^200^String leftStr = str.substring ( 0, separator ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^String rightStr = separator.substring ( str + 1 ) ;^189^^^^^174^204^String rightStr = str.substring ( separator + 1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^dateTimeParser = chrono.withChronology ( dateTimeParser ) ;^195^^^^^180^210^dateTimeParser = dateTimeParser.withChronology ( chrono ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^DateTime start = leftStr.parseDateTime ( dateTimeParser ) ;^206^^^^^203^209^DateTime start = dateTimeParser.parseDateTime ( leftStr ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^period = leftStr.withParseType ( getPeriodType ( periodParser )  ) .parsePeriod ( leftStr ) ;^204^^^^^189^219^period = periodParser.withParseType ( getPeriodType ( leftStr )  ) .parsePeriod ( leftStr ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^DateTime start = leftStr.parseDateTime ( dateTimeParser ) ;^206^^^^^191^221^DateTime start = dateTimeParser.parseDateTime ( leftStr ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^startInstant = endInstant.add ( period, chrono, -1 ) ;^226^^^^^213^228^startInstant = chrono.add ( period, endInstant, -1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^startInstant = period.add ( chrono, endInstant, -1 ) ;^226^^^^^213^228^startInstant = chrono.add ( period, endInstant, -1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^startInstant = chrono.add (  endInstant, -1 ) ;^226^^^^^213^228^startInstant = chrono.add ( period, endInstant, -1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^startInstant = chrono.add ( endInstant, period, -1 ) ;^226^^^^^213^228^startInstant = chrono.add ( period, endInstant, -1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^startInstant = chrono.add ( period,  -1 ) ;^226^^^^^213^228^startInstant = chrono.add ( period, endInstant, -1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^parsedChrono =  ( end != null ? parsedChrono : parsedChrono.getChronology (  )  ) ;^223^^^^^213^228^parsedChrono =  ( parsedChrono != null ? parsedChrono : end.getChronology (  )  ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^chrono =  ( parsedChrono != null ? chrono : chrono ) ;^224^^^^^213^228^chrono =  ( chrono != null ? chrono : parsedChrono ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^DateTime end = rightStr.parseDateTime ( dateTimeParser ) ;^221^^^^^213^228^DateTime end = dateTimeParser.parseDateTime ( rightStr ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^period = rightStr.withParseType ( getPeriodType ( periodParser )  ) .parsePeriod ( rightStr ) ;^217^^^^^202^232^period = periodParser.withParseType ( getPeriodType ( rightStr )  ) .parsePeriod ( rightStr ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^chrono =  ( parsedChrono != null ? chrono : chrono ) ;^218^^^^^203^233^chrono =  ( chrono != null ? chrono : parsedChrono ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^endInstant = startInstant.add ( period, chrono, 1 ) ;^219^^^^^204^234^endInstant = chrono.add ( period, startInstant, 1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^endInstant = chrono.add ( startInstant, period, 1 ) ;^219^^^^^204^234^endInstant = chrono.add ( period, startInstant, 1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^endInstant = chrono.add (  startInstant, 1 ) ;^219^^^^^204^234^endInstant = chrono.add ( period, startInstant, 1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^endInstant = chrono.add ( period,  1 ) ;^219^^^^^204^234^endInstant = chrono.add ( period, startInstant, 1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^endInstant = period.add ( chrono, startInstant, 1 ) ;^219^^^^^204^234^endInstant = chrono.add ( period, startInstant, 1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^startInstant = period.add ( chrono, endInstant, -1 ) ;^226^^^^^211^241^startInstant = chrono.add ( period, endInstant, -1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^startInstant = chrono.add ( endInstant, period, -1 ) ;^226^^^^^211^241^startInstant = chrono.add ( period, endInstant, -1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^startInstant = chrono.add (  endInstant, -1 ) ;^226^^^^^211^241^startInstant = chrono.add ( period, endInstant, -1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^startInstant = endInstant.add ( period, chrono, -1 ) ;^226^^^^^211^241^startInstant = chrono.add ( period, endInstant, -1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^startInstant = chrono.add ( period,  -1 ) ;^226^^^^^211^241^startInstant = chrono.add ( period, endInstant, -1 ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^parsedChrono =  ( end != null ? parsedChrono : parsedChrono.getChronology (  )  ) ;^223^^^^^208^238^parsedChrono =  ( parsedChrono != null ? parsedChrono : end.getChronology (  )  ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^chrono =  ( parsedChrono != null ? chrono : chrono ) ;^224^^^^^209^239^chrono =  ( chrono != null ? chrono : parsedChrono ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^DateTime end = rightStr.parseDateTime ( dateTimeParser ) ;^221^^^^^206^236^DateTime end = dateTimeParser.parseDateTime ( rightStr ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^writableInterval.setInterval ( endInstant, startInstant ) ;^230^^^^^215^245^writableInterval.setInterval ( startInstant, endInstant ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^writableInterval.setInterval (  endInstant ) ;^230^^^^^215^245^writableInterval.setInterval ( startInstant, endInstant ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  
[buglab_swap_variables]^writableInterval.setInterval ( startInstant ) ;^230^^^^^215^245^writableInterval.setInterval ( startInstant, endInstant ) ;^[CLASS] StringConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritableInterval writableInterval Object object Chronology chrono [VARIABLES] PeriodFormatter  periodParser  Period  period  String  leftStr  rightStr  str  StringConverter  INSTANCE  int  separator  long  endInstant  startInstant  DateTime  end  start  boolean  char  c  Object  object  ReadWritableInterval  writableInterval  Chronology  chrono  parsedChrono  DateTimeFormatter  dateTimeParser  