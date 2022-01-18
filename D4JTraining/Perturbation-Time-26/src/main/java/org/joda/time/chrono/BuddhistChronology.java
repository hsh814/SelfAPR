[REPLACE]^private static final long serialVersionUID  = null ;^56^^^^^^^[REPLACE] private static final long serialVersionUID = -3474595157769370126L;^ [CLASS] BuddhistChronology  
[REPLACE]^public static   long  BE = DateTimeConstants.CE;^62^^^^^^^[REPLACE] public static final int BE = DateTimeConstants.CE;^ [CLASS] BuddhistChronology  
[REPLACE]^private static final DateTimeField ERA_FIELD ;^65^^^^^^^[REPLACE] private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField ( "BE" ) ;^ [CLASS] BuddhistChronology  
[REPLACE]^private static final int BUDDHIST_OFFSET = 240;^68^^^^^^^[REPLACE] private static final int BUDDHIST_OFFSET = 543;^ [CLASS] BuddhistChronology  
[REPLACE]^private static  Map<DateTimeZone, BuddhistChronology> cCache = new HashMap<DateTimeZone, BuddhistChronology> (  ) ;^71^^^^^^^[REPLACE] private static final Map<DateTimeZone, BuddhistChronology> cCache = new HashMap<DateTimeZone, BuddhistChronology> (  ) ;^ [CLASS] BuddhistChronology  
[REPLACE]^private static  BuddhistChronology INSTANCE_UTC = getInstance ( DateTimeZone.UTC ) ;^74^^^^^^^[REPLACE] private static final BuddhistChronology INSTANCE_UTC = getInstance ( DateTimeZone.UTC ) ;^ [CLASS] BuddhistChronology  
[REPLACE]^cCache.put ( zone, chrono ) ;^128^^^^^127^129^[REPLACE] super ( base, param ) ;^[METHOD] <init> [TYPE] Object) [PARAMETER] Chronology base Object param [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  [TYPE]  Object param  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Chronology base  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^return getInstance ( DateTimeZone.getDefault (  )  ) ;^84^^^^^83^85^[REPLACE] return INSTANCE_UTC;^[METHOD] getInstanceUTC [TYPE] BuddhistChronology [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  DateTimeField ERA_FIELD  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^return getInstance ( DateTimeZone.getID (  )  ) ;^93^^^^^92^94^[REPLACE] return getInstance ( DateTimeZone.getDefault (  )  ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  DateTimeField ERA_FIELD  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^if  ( zone != null )  {^104^^^^^103^117^[REPLACE] if  ( zone == null )  {^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^zone  = null ;^105^^^^^103^117^[REPLACE] zone = DateTimeZone.getDefault (  ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[ADD]^^105^^^^^103^117^[ADD] zone = DateTimeZone.getDefault (  ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^zone ;^105^^^^^103^117^[REPLACE] zone = DateTimeZone.getDefault (  ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^BuddhistChronology chrono = cCache .put ( zone , chrono )  ;^107^^^^^103^117^[REPLACE] BuddhistChronology chrono = cCache.get ( zone ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^if  ( chrono != false )  {^108^^^^^103^117^[REPLACE] if  ( chrono == null )  {^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^chrono =  new BuddhistChronology ( getInstance ( chrono, lowerLimit, null ) , "" )  , false ) ;^110^^^^^103^117^[REPLACE] chrono = new BuddhistChronology ( GJChronology.getInstance ( zone, null ) , null ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^chrono = new BuddhistChronology ( LimitChronology.getInstance ( chrono, lowerLimit, true ) , "" ) ;^113^^^^^103^117^[REPLACE] chrono = new BuddhistChronology ( LimitChronology.getInstance ( chrono, lowerLimit, null ) , "" ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^DateTime lowerLimit = new DateTime ( 1L, 1L, 1L, 0, 0, 0, 0, chrono ) ;^112^^^^^103^117^[REPLACE] DateTime lowerLimit = new DateTime ( 1, 1, 1, 0, 0, 0, 0, chrono ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^chrono = new BuddhistChronology ( GJChronology.getInstance ( zone, false ) , false ) ;^110^^^^^103^117^[REPLACE] chrono = new BuddhistChronology ( GJChronology.getInstance ( zone, null ) , null ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[ADD]^^110^^^^^103^117^[ADD] chrono = new BuddhistChronology ( GJChronology.getInstance ( zone, null ) , null ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^chrono =  new BuddhistChronology ( getInstance ( zone, null ) , null )  , "" ) ;^113^^^^^103^117^[REPLACE] chrono = new BuddhistChronology ( LimitChronology.getInstance ( chrono, lowerLimit, null ) , "" ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^DateTime lowerLimit = new DateTime ( 4, 4, 4, 0, 0, 0, 0, chrono ) ;^112^^^^^103^117^[REPLACE] DateTime lowerLimit = new DateTime ( 1, 1, 1, 0, 0, 0, 0, chrono ) ;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^return INSTANCE_UTC;^116^^^^^103^117^[REPLACE] return chrono;^[METHOD] getInstance [TYPE] BuddhistChronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone  [TYPE]  DateTime lowerLimit 
[REPLACE]^DateTimeZone zone = getZone (  ) ;^135^^^^^134^137^[REPLACE] Chronology base = getBase (  ) ;^[METHOD] readResolve [TYPE] Object [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Chronology base  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^return getInstance ( base.getZone (  )  ) ;^136^^^^^134^137^[REPLACE] return base == null ? getInstanceUTC (  )  : getInstance ( base.getZone (  )  ) ;^[METHOD] readResolve [TYPE] Object [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Chronology base  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^return getInstance ( DateTimeZone.getDefault (  )  ) ;^147^^^^^146^148^[REPLACE] return INSTANCE_UTC;^[METHOD] withUTC [TYPE] Chronology [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  DateTimeField ERA_FIELD  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^if  ( zone != null )  {^157^^^^^156^164^[REPLACE] if  ( zone == null )  {^[METHOD] withZone [TYPE] Chronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[REPLACE]^zone  = null ;^158^^^^^156^164^[REPLACE] zone = DateTimeZone.getDefault (  ) ;^[METHOD] withZone [TYPE] Chronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[REPLACE]^if  ( zone  !=  getZone (  )  )  {^160^^^^^156^164^[REPLACE] if  ( zone == getZone (  )  )  {^[METHOD] withZone [TYPE] Chronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[REPLACE]^return null;^161^^^^^156^164^[REPLACE] return this;^[METHOD] withZone [TYPE] Chronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[REPLACE]^return getInstance ( DateTimeZone.getDefault (  )  ) ;^163^^^^^156^164^[REPLACE] return getInstance ( zone ) ;^[METHOD] withZone [TYPE] Chronology [PARAMETER] DateTimeZone zone [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[REPLACE]^return super .equals ( obj )  ;^174^^^^^173^175^[REPLACE] return super.equals ( obj ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  Object obj  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^return "Buddhist".hashCode (  )  * 11  &  getZone (  ) .hashCode (  ) ;^184^^^^^183^185^[REPLACE] return "Buddhist".hashCode (  )  * 11 + getZone (  ) .hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  DateTimeField ERA_FIELD  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^DateTimeZone zone = getZone (  ) ;^195^^^^^194^201^[REPLACE] String str = "BuddhistChronology";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[REPLACE]^Chronology base = getBase (  ) ;^196^^^^^194^201^[REPLACE] DateTimeZone zone = getZone (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[REPLACE]^if  ( zone == null )  {^197^^^^^194^201^[REPLACE] if  ( zone != null )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[ADD]^^197^198^199^^^194^201^[ADD] if  ( zone != null )  { str = str + '[' + zone.getID (  )  + ']'; }^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[REPLACE]^str = str  &  '['  &  zone.getID (  )   &  ']';^198^^^^^194^201^[REPLACE] str = str + '[' + zone.getID (  )  + ']';^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[REPLACE]^str = str  >=  '['  >=  zone.getID (  )   >=  ']';^198^^^^^194^201^[REPLACE] str = str + '[' + zone.getID (  )  + ']';^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[REPLACE]^return getInstance ( zone ) ;^200^^^^^194^201^[REPLACE] return str;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] BuddhistChronology   [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET  [TYPE]  DateTimeZone zone 
[REPLACE]^if  ( getParam (  )  != this  )  {^204^^^^^203^236^[REPLACE] if  ( getParam (  )  == null )  {^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[ADD]^^204^205^206^207^208^203^236^[ADD] if  ( getParam (  )  == null )  {  DateTimeField field = fields.year; fields.year = new OffsetDateTimeField ( new SkipUndoDateTimeField ( this, field ) , BUDDHIST_OFFSET ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^fields.year =  new OffsetDateTimeField ( new SkipUndoDateTimeField ( this, ERA_FIELD ) , BUDDHIST_OFFSET ) ;^207^208^^^^203^236^[REPLACE] fields.year = new OffsetDateTimeField ( new SkipUndoDateTimeField ( this, field ) , BUDDHIST_OFFSET ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^field = fields.weekyear; ;^211^^^^^203^236^[REPLACE] field = fields.yearOfEra;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[ADD]^^211^^^^^203^236^[ADD] field = fields.yearOfEra;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^fields.yearOfEra =  new DelegatedDateTimeField ( null.year, DateTimeFieldType.yearOfEra (  )  ) ;^212^213^^^^203^236^[REPLACE] fields.yearOfEra = new DelegatedDateTimeField ( fields.year, DateTimeFieldType.yearOfEra (  )  ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^field = fields.yearOfEra; ;^216^^^^^203^236^[REPLACE] field = fields.weekyear;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^fields.weekyear =  new OffsetDateTimeField ( new SkipUndoDateTimeField ( this, ERA_FIELD ) , BUDDHIST_OFFSET ) ;^217^218^^^^203^236^[REPLACE] fields.weekyear = new OffsetDateTimeField ( new SkipUndoDateTimeField ( this, field ) , BUDDHIST_OFFSET ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^field = new OffsetDateTimeField ( fields.yearOfEra, 2 ) ;^220^^^^^203^236^[REPLACE] field = new OffsetDateTimeField ( fields.yearOfEra, 99 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[ADD]^^220^^^^^203^236^[ADD] field = new OffsetDateTimeField ( fields.yearOfEra, 99 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^fields.centuryOfEra = new DividedDateTimeField ( field, DateTimeFieldType.centuryOfEra (  ) , 1 ) ;^221^222^^^^203^236^[REPLACE] fields.centuryOfEra = new DividedDateTimeField ( field, DateTimeFieldType.centuryOfEra (  ) , 100 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^field =  new RemainderDateTimeField ( ( DividedDateTimeField )  null.centuryOfEra ) ;^224^225^^^^203^236^[REPLACE] field = new RemainderDateTimeField ( ( DividedDateTimeField )  fields.centuryOfEra ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^fields.yearOfCentury = new OffsetDateTimeField ( field, DateTimeFieldType.yearOfCentury (  ) , 1 / 4 ) ;^226^227^^^^203^236^[REPLACE] fields.yearOfCentury = new OffsetDateTimeField ( field, DateTimeFieldType.yearOfCentury (  ) , 1 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^field = new RemainderDateTimeField ( fields.weekyear, DateTimeFieldType.weekyearOfCentury (  ) , 100 >>> 2 ) ;^229^230^^^^203^236^[REPLACE] field = new RemainderDateTimeField ( fields.weekyear, DateTimeFieldType.weekyearOfCentury (  ) , 100 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[ADD]^^229^230^^^^203^236^[ADD] field = new RemainderDateTimeField ( fields.weekyear, DateTimeFieldType.weekyearOfCentury (  ) , 100 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^fields.weekyearOfCentury = new OffsetDateTimeField ( field, DateTimeFieldType.weekyearOfCentury (  ) , 0 ) ;^231^232^^^^203^236^[REPLACE] fields.weekyearOfCentury = new OffsetDateTimeField ( field, DateTimeFieldType.weekyearOfCentury (  ) , 1 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^fields.era  =  fields.era ;^234^^^^^203^236^[REPLACE] fields.era = ERA_FIELD;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^String str = "BuddhistChronology";^206^^^^^203^236^[REPLACE] DateTimeField field = fields.year;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^fields.year =  new OffsetDateTimeField ( new SkipUndoDateTimeField ( this, null ) , BUDDHIST_OFFSET ) ;^207^208^^^^203^236^[REPLACE] fields.year = new OffsetDateTimeField ( new SkipUndoDateTimeField ( this, field ) , BUDDHIST_OFFSET ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^fields.weekyear =  new OffsetDateTimeField ( new SkipUndoDateTimeField ( this, null ) , BUDDHIST_OFFSET ) ;^217^218^^^^203^236^[REPLACE] fields.weekyear = new OffsetDateTimeField ( new SkipUndoDateTimeField ( this, field ) , BUDDHIST_OFFSET ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[ADD]^^217^218^^^^203^236^[ADD] fields.weekyear = new OffsetDateTimeField ( new SkipUndoDateTimeField ( this, field ) , BUDDHIST_OFFSET ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^field = new OffsetDateTimeField ( fields.yearOfEra, 99L ) ;^220^^^^^203^236^[REPLACE] field = new OffsetDateTimeField ( fields.yearOfEra, 99 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^fields.centuryOfEra = new DividedDateTimeField ( field, DateTimeFieldType.centuryOfEra (  ) , 4 ) ;^221^222^^^^203^236^[REPLACE] fields.centuryOfEra = new DividedDateTimeField ( field, DateTimeFieldType.centuryOfEra (  ) , 100 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[ADD]^^224^225^^^^203^236^[ADD] field = new RemainderDateTimeField ( ( DividedDateTimeField )  fields.centuryOfEra ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^fields.yearOfCentury = new OffsetDateTimeField ( field, DateTimeFieldType.yearOfCentury (  ) , 1L ) ;^226^227^^^^203^236^[REPLACE] fields.yearOfCentury = new OffsetDateTimeField ( field, DateTimeFieldType.yearOfCentury (  ) , 1 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[REPLACE]^field = new RemainderDateTimeField ( fields.weekyear, DateTimeFieldType.weekyearOfCentury (  ) , 1 ) ;^229^230^^^^203^236^[REPLACE] field = new RemainderDateTimeField ( fields.weekyear, DateTimeFieldType.weekyearOfCentury (  ) , 100 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 
[ADD]^^231^232^^^^203^236^[ADD] fields.weekyearOfCentury = new OffsetDateTimeField ( field, DateTimeFieldType.weekyearOfCentury (  ) , 1 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] BuddhistChronology   [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  BuddhistChronology INSTANCE_UTC  chrono  [TYPE]  DateTimeField ERA_FIELD  field  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int BE  BUDDHIST_OFFSET 