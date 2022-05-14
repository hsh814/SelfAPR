[P14_Delete_Statement]^^42^^^^^41^43^super (  ) ;^[CLASS] ReadableDurationConverter  [METHOD] <init> [RETURN_TYPE] ReadableDurationConverter()   [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  
[P14_Delete_Statement]^^56^^^^^55^57^return  (  ( ReadableDuration )  object ) .getMillis (  ) ;^[CLASS] ReadableDurationConverter  [METHOD] getDurationMillis [RETURN_TYPE] long   Object object [VARIABLES] ReadableDurationConverter  INSTANCE  Object  object  boolean  
[P8_Replace_Mix]^chrono =  DateTimeUtils.getChronology ( null ) ;^73^^^^^71^79^chrono = DateTimeUtils.getChronology ( chrono ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P14_Delete_Statement]^^73^74^^^^71^79^chrono = DateTimeUtils.getChronology ( chrono ) ; long duration = dur.getMillis (  ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P1_Replace_Type]^int  duration = dur.getMillis (  ) ;^74^^^^^71^79^long duration = dur.getMillis (  ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P14_Delete_Statement]^^74^75^^^^71^79^long duration = dur.getMillis (  ) ; int[] values = chrono.get ( writablePeriod, duration ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P5_Replace_Variable]^int[] values = chrono.get (  duration ) ;^75^^^^^71^79^int[] values = chrono.get ( writablePeriod, duration ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P5_Replace_Variable]^int[] values = chrono.get ( writablePeriod ) ;^75^^^^^71^79^int[] values = chrono.get ( writablePeriod, duration ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P5_Replace_Variable]^int[] values = duration.get ( writablePeriod, chrono ) ;^75^^^^^71^79^int[] values = chrono.get ( writablePeriod, duration ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P5_Replace_Variable]^int[] values = writablePeriod.get ( chrono, duration ) ;^75^^^^^71^79^int[] values = chrono.get ( writablePeriod, duration ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P5_Replace_Variable]^int[] values = chrono.get ( duration, writablePeriod ) ;^75^^^^^71^79^int[] values = chrono.get ( writablePeriod, duration ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P14_Delete_Statement]^^75^^^^^71^79^int[] values = chrono.get ( writablePeriod, duration ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P1_Replace_Type]^for  (  short  i = 0; i < values.length; i++ )  {^76^^^^^71^79^for  ( int i = 0; i < values.length; i++ )  {^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P2_Replace_Operator]^for  ( int i = 0; i <= values.length; i++ )  {^76^^^^^71^79^for  ( int i = 0; i < values.length; i++ )  {^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P3_Replace_Literal]^for  ( int i = i; i < values.length; i++ )  {^76^^^^^71^79^for  ( int i = 0; i < values.length; i++ )  {^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P5_Replace_Variable]^for  ( values.lengthnt i = 0; i < i; i++ )  {^76^^^^^71^79^for  ( int i = 0; i < values.length; i++ )  {^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P5_Replace_Variable]^for  ( int i = 0; i < values.length.length; i++ )  {^76^^^^^71^79^for  ( int i = 0; i < values.length; i++ )  {^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P5_Replace_Variable]^writablePeriod.setValue (  values[i] ) ;^77^^^^^71^79^writablePeriod.setValue ( i, values[i] ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P5_Replace_Variable]^writablePeriod.setValue ( i[i] ) ;^77^^^^^71^79^writablePeriod.setValue ( i, values[i] ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P5_Replace_Variable]^writablePeriod.setValue ( values, i[i] ) ;^77^^^^^71^79^writablePeriod.setValue ( i, values[i] ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P14_Delete_Statement]^^77^^^^^71^79^writablePeriod.setValue ( i, values[i] ) ;^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P1_Replace_Type]^for  (  long  i = 0; i < values.length; i++ )  {^76^^^^^71^79^for  ( int i = 0; i < values.length; i++ )  {^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
[P3_Replace_Literal]^for  ( int i = -2; i < values.length; i++ )  {^76^^^^^71^79^for  ( int i = 0; i < values.length; i++ )  {^[CLASS] ReadableDurationConverter  [METHOD] setInto [RETURN_TYPE] void   ReadWritablePeriod writablePeriod Object object Chronology chrono [VARIABLES] ReadableDurationConverter  INSTANCE  boolean  ReadWritablePeriod  writablePeriod  Object  object  int[]  values  Chronology  chrono  ReadableDuration  dur  long  duration  int  i  
