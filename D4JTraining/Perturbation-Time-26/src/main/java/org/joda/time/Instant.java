[REPLACE]^private static  long serialVersionUID = 3299096530934209741L;^60^^^^^^^[REPLACE] private static final long serialVersionUID = 3299096530934209741L;^ [CLASS] Instant  
[REPLACE]^private final  short  iMillis;^63^^^^^^^[REPLACE] private final long iMillis;^ [CLASS] Instant  
[REPLACE]^return toDateTime (  ) ;^95^^^^^94^97^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] Instant() [PARAMETER] [CLASS] Instant   [TYPE]  long iMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^iMillis  =  iMillis ;^96^^^^^94^97^[REPLACE] iMillis = DateTimeUtils.currentTimeMillis (  ) ;^[METHOD] <init> [TYPE] Instant() [PARAMETER] [CLASS] Instant   [TYPE]  long iMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return toDateTime (  ) ;^105^^^^^104^107^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] Instant(long) [PARAMETER] long instant [CLASS] Instant   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^iMillis =  serialVersionUID;^106^^^^^104^107^[REPLACE] iMillis = instant;^[METHOD] <init> [TYPE] Instant(long) [PARAMETER] long instant [CLASS] Instant   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return toDateTime (  ) ;^119^^^^^118^122^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] Object) [PARAMETER] Object instant [CLASS] Instant   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID 
[ADD]^^119^^^^^118^122^[ADD] super (  ) ;^[METHOD] <init> [TYPE] Object) [PARAMETER] Object instant [CLASS] Instant   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID 
[REPLACE]^long instant = getChronology (  ) .add ( getMillis (  ) , durationToAdd, scalar ) ;^120^^^^^118^122^[REPLACE] InstantConverter converter = ConverterManager.getInstance (  ) .getInstantConverter ( instant ) ;^[METHOD] <init> [TYPE] Object) [PARAMETER] Object instant [CLASS] Instant   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID 
[REPLACE]^iMillis =  null.getInstantMillis ( instant, ISOChronology.getInstanceUTC (  )  ) ;^121^^^^^118^122^[REPLACE] iMillis = converter.getInstantMillis ( instant, ISOChronology.getInstanceUTC (  )  ) ;^[METHOD] <init> [TYPE] Object) [PARAMETER] Object instant [CLASS] Instant   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID 
[ADD]^^121^^^^^118^122^[ADD] iMillis = converter.getInstantMillis ( instant, ISOChronology.getInstanceUTC (  )  ) ;^[METHOD] <init> [TYPE] Object) [PARAMETER] Object instant [CLASS] Instant   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID 
[REPLACE]^return withDurationAdded ( duration, 1 ) ;^76^^^^^75^77^[REPLACE] return parse ( str, ISODateTimeFormat.dateTimeParser (  )  ) ;^[METHOD] parse [TYPE] Instant [PARAMETER] String str [CLASS] Instant   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  String str  [TYPE]  boolean false  true 
[REPLACE]^return formatter.parseDateTime ( str )  .getInstantConverter ( null )  ;^87^^^^^86^88^[REPLACE] return formatter.parseDateTime ( str ) .toInstant (  ) ;^[METHOD] parse [TYPE] Instant [PARAMETER] String str DateTimeFormatter formatter [CLASS] Instant   [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  DateTimeFormatter formatter  [TYPE]  long iMillis  instant  serialVersionUID 
[REPLACE]^return null;^131^^^^^130^132^[REPLACE] return this;^[METHOD] toInstant [TYPE] Instant [PARAMETER] [CLASS] Instant   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return new Instant ( newMillis )  ) ;^144^^^^^143^145^[REPLACE] return  ( newMillis == iMillis ? this : new Instant ( newMillis )  ) ;^[METHOD] withMillis [TYPE] Instant [PARAMETER] long newMillis [CLASS] Instant   [TYPE]  long iMillis  instant  newMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( durationToAdd == 0 ) {^158^^^^^157^163^[REPLACE] if  ( durationToAdd == 0 || scalar == 0 )  {^[METHOD] withDurationAdded [TYPE] Instant [PARAMETER] long durationToAdd int scalar [CLASS] Instant   [TYPE]  long durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  int scalar  [TYPE]  boolean false  true 
[REPLACE]^return null;^159^^^^^157^163^[REPLACE] return this;^[METHOD] withDurationAdded [TYPE] Instant [PARAMETER] long durationToAdd int scalar [CLASS] Instant   [TYPE]  long durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  int scalar  [TYPE]  boolean false  true 
[REPLACE]^InstantConverter converter = ConverterManager.getInstance (  ) .getInstantConverter ( instant ) ;^161^^^^^157^163^[REPLACE] long instant = getChronology (  ) .add ( getMillis (  ) , durationToAdd, scalar ) ;^[METHOD] withDurationAdded [TYPE] Instant [PARAMETER] long durationToAdd int scalar [CLASS] Instant   [TYPE]  long durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  int scalar  [TYPE]  boolean false  true 
[REPLACE]^return withMillis ( serialVersionUID ) ;^162^^^^^157^163^[REPLACE] return withMillis ( instant ) ;^[METHOD] withDurationAdded [TYPE] Instant [PARAMETER] long durationToAdd int scalar [CLASS] Instant   [TYPE]  long durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  int scalar  [TYPE]  boolean false  true 
[REPLACE]^if  ( durationToAdd != null || scalar == 0 )  {^176^^^^^175^180^[REPLACE] if  ( durationToAdd == null || scalar == 0 )  {^[METHOD] withDurationAdded [TYPE] Instant [PARAMETER] ReadableDuration durationToAdd int scalar [CLASS] Instant   [TYPE]  boolean false  true  [TYPE]  ReadableDuration durationToAdd  [TYPE]  long durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  int scalar 
[ADD]^^176^177^178^^^175^180^[ADD] if  ( durationToAdd == null || scalar == 0 )  { return this; }^[METHOD] withDurationAdded [TYPE] Instant [PARAMETER] ReadableDuration durationToAdd int scalar [CLASS] Instant   [TYPE]  boolean false  true  [TYPE]  ReadableDuration durationToAdd  [TYPE]  long durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  int scalar 
[REPLACE]^return null;^177^^^^^175^180^[REPLACE] return this;^[METHOD] withDurationAdded [TYPE] Instant [PARAMETER] ReadableDuration durationToAdd int scalar [CLASS] Instant   [TYPE]  boolean false  true  [TYPE]  ReadableDuration durationToAdd  [TYPE]  long durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  int scalar 
[REPLACE]^return parse ( str, ISODateTimeFormat.dateTimeParser (  )  ) ;^179^^^^^175^180^[REPLACE] return withDurationAdded ( durationToAdd.getMillis (  ) , scalar ) ;^[METHOD] withDurationAdded [TYPE] Instant [PARAMETER] ReadableDuration durationToAdd int scalar [CLASS] Instant   [TYPE]  boolean false  true  [TYPE]  ReadableDuration durationToAdd  [TYPE]  long durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  int scalar 
[REPLACE]^return withDurationAdded ( duration, 0 ) ;^193^^^^^192^194^[REPLACE] return withDurationAdded ( duration, 1 ) ;^[METHOD] plus [TYPE] Instant [PARAMETER] long duration [CLASS] Instant   [TYPE]  long duration  durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return withDurationAdded ( duration, 0 ) ;^206^^^^^205^207^[REPLACE] return withDurationAdded ( duration, 1 ) ;^[METHOD] plus [TYPE] Instant [PARAMETER] ReadableDuration duration [CLASS] Instant   [TYPE]  ReadableDuration duration  [TYPE]  long duration  durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return withDurationAdded ( serialVersionUID, -3 ) ;^220^^^^^219^221^[REPLACE] return withDurationAdded ( duration, -1 ) ;^[METHOD] minus [TYPE] Instant [PARAMETER] long duration [CLASS] Instant   [TYPE]  long duration  durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return withDurationAdded ( duration, 1 ) ;^233^^^^^232^234^[REPLACE] return withDurationAdded ( duration, -1 ) ;^[METHOD] minus [TYPE] Instant [PARAMETER] ReadableDuration duration [CLASS] Instant   [TYPE]  ReadableDuration duration  [TYPE]  long duration  durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return withMillis ( instant ) ;^243^^^^^242^244^[REPLACE] return iMillis;^[METHOD] getMillis [TYPE] long [PARAMETER] [CLASS] Instant   [TYPE]  long duration  durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return ISOChronology.getInstance (  ) ;^255^^^^^254^256^[REPLACE] return ISOChronology.getInstanceUTC (  ) ;^[METHOD] getChronology [TYPE] Chronology [PARAMETER] [CLASS] Instant   [TYPE]  long duration  durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return new MutableDateTime ( getMillis (  ) , ISOChronology.getInstance (  )  ) ;^275^^^^^274^276^[REPLACE] return new DateTime ( getMillis (  ) , ISOChronology.getInstance (  )  ) ;^[METHOD] toDateTime [TYPE] DateTime [PARAMETER] [CLASS] Instant   [TYPE]  long duration  durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return parse ( str, ISODateTimeFormat.dateTimeParser (  )  ) ;^301^^^^^300^302^[REPLACE] return toDateTime (  ) ;^[METHOD] toDateTimeISO [TYPE] DateTime [PARAMETER] [CLASS] Instant   [TYPE]  long duration  durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return new DateTime ( getMillis (  ) , ISOChronology.getInstance (  )  ) ;^320^^^^^319^321^[REPLACE] return new MutableDateTime ( getMillis (  ) , ISOChronology.getInstance (  )  ) ;^[METHOD] toMutableDateTime [TYPE] MutableDateTime [PARAMETER] [CLASS] Instant   [TYPE]  long duration  durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return parse ( str, ISODateTimeFormat.dateTimeParser (  )  ) ;^346^^^^^345^347^[REPLACE] return toMutableDateTime (  ) ;^[METHOD] toMutableDateTimeISO [TYPE] MutableDateTime [PARAMETER] [CLASS] Instant   [TYPE]  long duration  durationToAdd  iMillis  instant  newMillis  serialVersionUID  [TYPE]  boolean false  true 