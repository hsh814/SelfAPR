[buglab_swap_variables]^super ( param, base, minDaysInFirstWeek ) ;^162^^^^^161^163^super ( base, param, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] <init> [RETURN_TYPE] Object,int)   Chronology base Object param int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  Object  param  Chronology  base  Map  cCache  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  
[buglab_swap_variables]^super (  param, minDaysInFirstWeek ) ;^162^^^^^161^163^super ( base, param, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] <init> [RETURN_TYPE] Object,int)   Chronology base Object param int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  Object  param  Chronology  base  Map  cCache  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  
[buglab_swap_variables]^super ( base,  minDaysInFirstWeek ) ;^162^^^^^161^163^super ( base, param, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] <init> [RETURN_TYPE] Object,int)   Chronology base Object param int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  Object  param  Chronology  base  Map  cCache  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  
[buglab_swap_variables]^super ( minDaysInFirstWeek, param, base ) ;^162^^^^^161^163^super ( base, param, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] <init> [RETURN_TYPE] Object,int)   Chronology base Object param int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  Object  param  Chronology  base  Map  cCache  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  
[buglab_swap_variables]^super ( base, param ) ;^162^^^^^161^163^super ( base, param, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] <init> [RETURN_TYPE] Object,int)   Chronology base Object param int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  Object  param  Chronology  base  Map  cCache  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  
[buglab_swap_variables]^cCache.put ( chronos, zone ) ;^133^^^^^124^153^cCache.put ( zone, chronos ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^cCache.put (  chronos ) ;^133^^^^^124^153^cCache.put ( zone, chronos ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^cCache.put ( zone ) ;^133^^^^^124^153^cCache.put ( zone, chronos ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance ( minDaysInFirstWeek, zone ) , null, chrono ) ;^146^147^^^^142^148^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance (  zone ) , null, minDaysInFirstWeek ) ;^146^147^^^^142^148^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, minDaysInFirstWeek ) , null, zone ) ;^146^147^^^^142^148^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono ) , null, minDaysInFirstWeek ) ;^146^147^^^^142^148^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null ) ;^146^147^^^^142^148^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^( ZonedChronology.getInstance ( zone, chrono ) , null, minDaysInFirstWeek ) ;^147^^^^^142^148^( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^( ZonedChronology.getInstance (  zone ) , null, minDaysInFirstWeek ) ;^147^^^^^142^148^( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^( ZonedChronology.getInstance ( chrono ) , null, minDaysInFirstWeek ) ;^147^^^^^142^148^( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance ( minDaysInFirstWeek, zone ) , null, chrono ) ;^146^147^^^^124^153^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance (  zone ) , null, minDaysInFirstWeek ) ;^146^147^^^^124^153^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, minDaysInFirstWeek ) , null, zone ) ;^146^147^^^^124^153^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono ) , null, minDaysInFirstWeek ) ;^146^147^^^^124^153^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null ) ;^146^147^^^^124^153^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance ( zone, chrono ) , null, minDaysInFirstWeek ) ;^146^147^^^^124^153^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^( ZonedChronology.getInstance ( zone, chrono ) , null, minDaysInFirstWeek ) ;^147^^^^^124^153^( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^( ZonedChronology.getInstance (  zone ) , null, minDaysInFirstWeek ) ;^147^^^^^124^153^( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^( ZonedChronology.getInstance ( chrono ) , null, minDaysInFirstWeek ) ;^147^^^^^124^153^( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^chrono = new JulianChronology ( ZonedChronology.getInstance ( zone, chrono ) , null, minDaysInFirstWeek ) ;^146^147^^^^142^148^chrono = new JulianChronology ( ZonedChronology.getInstance ( chrono, zone ) , null, minDaysInFirstWeek ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^JulianChronology[] chronos = zone.get ( cCache ) ;^130^^^^^124^153^JulianChronology[] chronos = cCache.get ( zone ) ;^[CLASS] JulianChronology  [METHOD] getInstance [RETURN_TYPE] JulianChronology   DateTimeZone zone int minDaysInFirstWeek [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  ArrayIndexOutOfBoundsException  e  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDaysInFirstWeek  year  DateTimeZone  zone  JulianChronology[]  chronos  
[buglab_swap_variables]^return minDays == null ? getInstance ( DateTimeZone.UTC, base )  : getInstance ( base.getZone (  ) , minDays ) ;^172^173^174^^^168^175^return base == null ? getInstance ( DateTimeZone.UTC, minDays )  : getInstance ( base.getZone (  ) , minDays ) ;^[CLASS] JulianChronology  [METHOD] readResolve [RETURN_TYPE] Object   [VARIABLES] Chronology  base  boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDays  minDaysInFirstWeek  year  
[buglab_swap_variables]^return base == null ? getInstance ( DateTimeZone.UTC )  : getInstance ( base.getZone (  ) , minDays ) ;^172^173^174^^^168^175^return base == null ? getInstance ( DateTimeZone.UTC, minDays )  : getInstance ( base.getZone (  ) , minDays ) ;^[CLASS] JulianChronology  [METHOD] readResolve [RETURN_TYPE] Object   [VARIABLES] Chronology  base  boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDays  minDaysInFirstWeek  year  
[buglab_swap_variables]^getInstance ( minDays.getZone (  ) , base ) ;^174^^^^^168^175^getInstance ( base.getZone (  ) , minDays ) ;^[CLASS] JulianChronology  [METHOD] readResolve [RETURN_TYPE] Object   [VARIABLES] Chronology  base  boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDays  minDaysInFirstWeek  year  
[buglab_swap_variables]^getInstance ( base.getZone (  )  ) ;^174^^^^^168^175^getInstance ( base.getZone (  ) , minDays ) ;^[CLASS] JulianChronology  [METHOD] readResolve [RETURN_TYPE] Object   [VARIABLES] Chronology  base  boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  serialVersionUID  int  MAX_YEAR  MIN_YEAR  minDays  minDaysInFirstWeek  year  
[buglab_swap_variables]^long millis =  ( leapYears * 365L + relativeYear )  *  ( long ) DateTimeConstants.MILLIS_PER_DAY;^233^^^^^214^238^long millis =  ( relativeYear * 365L + leapYears )  *  ( long ) DateTimeConstants.MILLIS_PER_DAY;^[CLASS] JulianChronology  [METHOD] calculateFirstDayOfYearMillis [RETURN_TYPE] long   int year [VARIABLES] boolean  JulianChronology  INSTANCE_UTC  chrono  Map  cCache  long  MILLIS_PER_MONTH  MILLIS_PER_YEAR  millis  serialVersionUID  int  MAX_YEAR  MIN_YEAR  dayOfMonth  leapYears  minDays  minDaysInFirstWeek  monthOfYear  relativeYear  year  