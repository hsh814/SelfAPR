[REPLACE]^static final NullConverter INSTANCE  = null ;^39^^^^^^^[REPLACE] static final NullConverter INSTANCE = new NullConverter (  ) ;^ [CLASS] NullConverter  
[REPLACE]^writableInterval.setChronology ( chrono ) ;^45^^^^^44^46^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] NullConverter() [PARAMETER] [CLASS] NullConverter   [TYPE]  NullConverter INSTANCE  [TYPE]  boolean false  true 
[ADD]^^45^^^^^44^46^[ADD] super (  ) ;^[METHOD] <init> [TYPE] NullConverter() [PARAMETER] [CLASS] NullConverter   [TYPE]  NullConverter INSTANCE  [TYPE]  boolean false  true 
[REPLACE]^return 0;^56^^^^^55^57^[REPLACE] return 0L;^[METHOD] getDurationMillis [TYPE] long [PARAMETER] Object object [CLASS] NullConverter   [TYPE]  NullConverter INSTANCE  [TYPE]  Object object  [TYPE]  boolean false  true 
[REPLACE]^duration.setPeriod (  ( Period )  this ) ;^69^^^^^68^70^[REPLACE] duration.setPeriod (  ( Period )  null ) ;^[METHOD] setInto [TYPE] void [PARAMETER] ReadWritablePeriod duration Object object Chronology chrono [CLASS] NullConverter   [TYPE]  Object object  [TYPE]  Chronology chrono  [TYPE]  boolean false  true  [TYPE]  NullConverter INSTANCE  [TYPE]  ReadWritablePeriod duration 
[REPLACE]^writableInterval.setInterval ( now, now ) ;^83^^^^^82^86^[REPLACE] writableInterval.setChronology ( chrono ) ;^[METHOD] setInto [TYPE] void [PARAMETER] ReadWritableInterval writableInterval Object object Chronology chrono [CLASS] NullConverter   [TYPE]  Object object  [TYPE]  ReadWritableInterval writableInterval  [TYPE]  Chronology chrono  [TYPE]  boolean false  true  [TYPE]  NullConverter INSTANCE  [TYPE]  long now 
[ADD]^^84^^^^^82^86^[ADD] long now = DateTimeUtils.currentTimeMillis (  ) ;^[METHOD] setInto [TYPE] void [PARAMETER] ReadWritableInterval writableInterval Object object Chronology chrono [CLASS] NullConverter   [TYPE]  Object object  [TYPE]  ReadWritableInterval writableInterval  [TYPE]  Chronology chrono  [TYPE]  boolean false  true  [TYPE]  NullConverter INSTANCE  [TYPE]  long now 
[REPLACE]^writableInterval.setChronology ( chrono ) ;^85^^^^^82^86^[REPLACE] writableInterval.setInterval ( now, now ) ;^[METHOD] setInto [TYPE] void [PARAMETER] ReadWritableInterval writableInterval Object object Chronology chrono [CLASS] NullConverter   [TYPE]  Object object  [TYPE]  ReadWritableInterval writableInterval  [TYPE]  Chronology chrono  [TYPE]  boolean false  true  [TYPE]  NullConverter INSTANCE  [TYPE]  long now 
[REPLACE]^return true;^95^^^^^94^96^[REPLACE] return null;^[METHOD] getSupportedType [TYPE] Class [PARAMETER] [CLASS] NullConverter   [TYPE]  NullConverter INSTANCE  [TYPE]  boolean false  true 