[REPLACE]^static final DateConverter INSTANCE ;^35^^^^^^^[REPLACE] static final DateConverter INSTANCE = new DateConverter (  ) ;^ [CLASS] DateConverter  
[REPLACE]^return date.getTime (  ) ;^41^^^^^40^42^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] DateConverter() [PARAMETER] [CLASS] DateConverter   [TYPE]  DateConverter INSTANCE  [TYPE]  boolean false  true 
[REPLACE]^return Date.class;^56^^^^^54^57^[REPLACE] return date.getTime (  ) ;^[METHOD] getInstantMillis [TYPE] long [PARAMETER] Object object Chronology chrono [CLASS] DateConverter   [TYPE]  Object object  [TYPE]  DateConverter INSTANCE  [TYPE]  Chronology chrono  [TYPE]  boolean false  true  [TYPE]  Date date 
[REPLACE]^return date.getTime (  ) ;^66^^^^^65^67^[REPLACE] return Date.class;^[METHOD] getSupportedType [TYPE] Class [PARAMETER] [CLASS] DateConverter   [TYPE]  DateConverter INSTANCE  [TYPE]  boolean false  true 