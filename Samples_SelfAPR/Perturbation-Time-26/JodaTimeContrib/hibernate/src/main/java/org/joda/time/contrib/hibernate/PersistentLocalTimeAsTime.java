[P8_Replace_Mix]^public static  PersistentLocalTimeAsTime INSTANCE = new PersistentLocalTimeAsTime (  ) ;^40^^^^^35^45^public static final PersistentLocalTimeAsTime INSTANCE = new PersistentLocalTimeAsTime (  ) ;^[CLASS] PersistentLocalTimeAsTime   [VARIABLES] 
[P8_Replace_Mix]^private  final int[] SQL_TYPES = new int[] { Types.TIME, };^42^^^^^37^47^private static final int[] SQL_TYPES = new int[] { Types.TIME, };^[CLASS] PersistentLocalTimeAsTime   [VARIABLES] 
[P2_Replace_Operator]^if  ( x <= y )  {^53^^^^^52^62^if  ( x == y )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P5_Replace_Variable]^if  ( y == x )  {^53^^^^^52^62^if  ( x == y )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P15_Unwrap_Block]^return true;^53^54^55^^^52^62^if  ( x == y )  { return true; }^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P16_Remove_Block]^^53^54^55^^^52^62^if  ( x == y )  { return true; }^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P13_Insert_Block]^if  (  ( x == null )  ||  ( y == null )  )  {     return false; }^53^^^^^52^62^[Delete]^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P13_Insert_Block]^if  ( timestamp == null )  {     return null; }^53^^^^^52^62^[Delete]^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P3_Replace_Literal]^return false;^54^^^^^52^62^return true;^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P2_Replace_Operator]^if  ( x == null && y == null )  {^56^^^^^52^62^if  ( x == null || y == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P2_Replace_Operator]^if  ( x != null || y == null )  {^56^^^^^52^62^if  ( x == null || y == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P2_Replace_Operator]^if  ( x == null || y != null )  {^56^^^^^52^62^if  ( x == null || y == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P5_Replace_Variable]^if  ( y == null || x == null )  {^56^^^^^52^62^if  ( x == null || y == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P6_Replace_Expression]^if  ( x == null ) {^56^^^^^52^62^if  ( x == null || y == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P6_Replace_Expression]^if  (  y == null )  {^56^^^^^52^62^if  ( x == null || y == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P8_Replace_Mix]^if  ( x == false || y == false )  {^56^^^^^52^62^if  ( x == null || y == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P15_Unwrap_Block]^return false;^56^57^58^^^52^62^if  ( x == null || y == null )  { return false; }^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P16_Remove_Block]^^56^57^58^^^52^62^if  ( x == null || y == null )  { return false; }^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P13_Insert_Block]^if  ( x == y )  {     return true; }^56^^^^^52^62^[Delete]^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P13_Insert_Block]^if  ( timestamp == null )  {     return null; }^56^^^^^52^62^[Delete]^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P3_Replace_Literal]^return true;^57^^^^^52^62^return false;^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P11_Insert_Donor_Statement]^LocalTime lt =  (  ( LocalTime )  value ) ;LocalTime dtx =  ( LocalTime )  x;^59^^^^^52^62^LocalTime dtx =  ( LocalTime )  x;^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P11_Insert_Donor_Statement]^LocalTime dty =  ( LocalTime )  y;LocalTime dtx =  ( LocalTime )  x;^59^^^^^52^62^LocalTime dtx =  ( LocalTime )  x;^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P11_Insert_Donor_Statement]^LocalTime dtx =  ( LocalTime )  x;LocalTime dty =  ( LocalTime )  y;^60^^^^^52^62^LocalTime dty =  ( LocalTime )  y;^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P11_Insert_Donor_Statement]^LocalTime lt =  (  ( LocalTime )  value ) ;LocalTime dty =  ( LocalTime )  y;^60^^^^^52^62^LocalTime dty =  ( LocalTime )  y;^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P5_Replace_Variable]^return dty.equals ( dtx ) ;^61^^^^^52^62^return dtx.equals ( dty ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P8_Replace_Mix]^return dtx .equals ( dty )  ;^61^^^^^52^62^return dtx.equals ( dty ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P7_Replace_Invocation]^return dtx .equals ( dtx )  ;^61^^^^^52^62^return dtx.equals ( dty ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P14_Delete_Statement]^^61^^^^^52^62^return dtx.equals ( dty ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[P8_Replace_Mix]^return object .disassemble ( object )  ;^65^^^^^64^66^return object.hashCode (  ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] hashCode [RETURN_TYPE] int   Object object [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  boolean  
[P14_Delete_Statement]^^65^^^^^64^66^return object.hashCode (  ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] hashCode [RETURN_TYPE] int   Object object [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  boolean  
[P3_Replace_Literal]^return nullSafeGet ( resultSet, strings[4] ) ;^69^^^^^68^71^return nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  String[]  strings  boolean  
[P5_Replace_Variable]^return nullSafeGet (  strings[0] ) ;^69^^^^^68^71^return nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  String[]  strings  boolean  
[P5_Replace_Variable]^return nullSafeGet ( resultSet[0] ) ;^69^^^^^68^71^return nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  String[]  strings  boolean  
[P5_Replace_Variable]^return nullSafeGet ( strings, resultSet[0] ) ;^69^^^^^68^71^return nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  String[]  strings  boolean  
[P3_Replace_Literal]^return nullSafeGet ( resultSet, strings[9] ) ;^69^^^^^68^71^return nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  String[]  strings  boolean  
[P14_Delete_Statement]^^69^^^^^68^71^return nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  String[]  strings  boolean  
[P5_Replace_Variable]^Object timestamp = Hibernate.TIME.nullSafeGet (  string ) ;^74^^^^^73^80^Object timestamp = Hibernate.TIME.nullSafeGet ( resultSet, string ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P5_Replace_Variable]^Object timestamp = Hibernate.TIME.nullSafeGet ( resultSet ) ;^74^^^^^73^80^Object timestamp = Hibernate.TIME.nullSafeGet ( resultSet, string ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P5_Replace_Variable]^Object timestamp = Hibernate.TIME.nullSafeGet ( string, resultSet ) ;^74^^^^^73^80^Object timestamp = Hibernate.TIME.nullSafeGet ( resultSet, string ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P14_Delete_Statement]^^74^^^^^73^80^Object timestamp = Hibernate.TIME.nullSafeGet ( resultSet, string ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P11_Insert_Donor_Statement]^return nullSafeGet ( resultSet, strings[0] ) ;Object timestamp = Hibernate.TIME.nullSafeGet ( resultSet, string ) ;^74^^^^^73^80^Object timestamp = Hibernate.TIME.nullSafeGet ( resultSet, string ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P2_Replace_Operator]^if  ( timestamp != null )  {^75^^^^^73^80^if  ( timestamp == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P8_Replace_Mix]^if  ( timestamp == this )  {^75^^^^^73^80^if  ( timestamp == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P9_Replace_Statement]^if  ( value == null )  {^75^^^^^73^80^if  ( timestamp == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P15_Unwrap_Block]^return null;^75^76^77^^^73^80^if  ( timestamp == null )  { return null; }^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P16_Remove_Block]^^75^76^77^^^73^80^if  ( timestamp == null )  { return null; }^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P13_Insert_Block]^if  ( x == y )  {     return true; }^75^^^^^73^80^[Delete]^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P13_Insert_Block]^if  (  ( x == null )  ||  ( y == null )  )  {     return false; }^75^^^^^73^80^[Delete]^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P8_Replace_Mix]^return this;^76^^^^^73^80^return null;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P8_Replace_Mix]^return true;^76^^^^^73^80^return null;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P5_Replace_Variable]^return new LocalTime ( timestamp, DateTimeZone.INSTANCE ) ;^79^^^^^73^80^return new LocalTime ( timestamp, DateTimeZone.UTC ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P5_Replace_Variable]^return new LocalTime (  DateTimeZone.UTC ) ;^79^^^^^73^80^return new LocalTime ( timestamp, DateTimeZone.UTC ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[P2_Replace_Operator]^if  ( value != null )  {^83^^^^^82^90^if  ( value == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P8_Replace_Mix]^if  ( value == this )  {^83^^^^^82^90^if  ( value == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P9_Replace_Statement]^if  ( timestamp == null )  {^83^^^^^82^90^if  ( value == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P7_Replace_Invocation]^Time time = new Time ( lt.LocalTime (  )  ) ;^87^^^^^82^90^Time time = new Time ( lt.getMillisOfDay (  )  ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P11_Insert_Donor_Statement]^LocalTime dtx =  ( LocalTime )  x;LocalTime lt =  (  ( LocalTime )  value ) ;^86^^^^^82^90^LocalTime lt =  (  ( LocalTime )  value ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P11_Insert_Donor_Statement]^LocalTime dty =  ( LocalTime )  y;LocalTime lt =  (  ( LocalTime )  value ) ;^86^^^^^82^90^LocalTime lt =  (  ( LocalTime )  value ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P7_Replace_Invocation]^Time time = new Time ( lt .equals ( value , value )   ) ;^87^^^^^82^90^Time time = new Time ( lt.getMillisOfDay (  )  ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P14_Delete_Statement]^^87^^^^^82^90^Time time = new Time ( lt.getMillisOfDay (  )  ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P5_Replace_Variable]^Hibernate.TIME.nullSafeSet (  time, index ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P5_Replace_Variable]^Hibernate.TIME.nullSafeSet ( preparedStatement,  index ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P5_Replace_Variable]^Hibernate.TIME.nullSafeSet ( preparedStatement, time ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P5_Replace_Variable]^Hibernate.TIME.nullSafeSet ( index, time, preparedStatement ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P5_Replace_Variable]^Hibernate.TIME.nullSafeSet ( preparedStatement, index, time ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P14_Delete_Statement]^^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P11_Insert_Donor_Statement]^Hibernate.TIME.nullSafeSet ( preparedStatement, null, index ) ;Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P5_Replace_Variable]^Hibernate.TIME.nullSafeSet (  null, index ) ;^84^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P5_Replace_Variable]^Hibernate.TIME.nullSafeSet ( preparedStatement, null ) ;^84^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P5_Replace_Variable]^Hibernate.TIME.nullSafeSet ( index, null, preparedStatement ) ;^84^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P14_Delete_Statement]^^84^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P11_Insert_Donor_Statement]^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;Hibernate.TIME.nullSafeSet ( preparedStatement, null, index ) ;^84^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P14_Delete_Statement]^^87^88^^^^82^90^Time time = new Time ( lt.getMillisOfDay (  )  ) ; Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P5_Replace_Variable]^Hibernate.TIME.nullSafeSet ( time, preparedStatement, index ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[P3_Replace_Literal]^return true;^97^^^^^96^98^return false;^[CLASS] PersistentLocalTimeAsTime  [METHOD] isMutable [RETURN_TYPE] boolean   [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  boolean  
[P5_Replace_Variable]^return target;^109^^^^^108^110^return original;^[CLASS] PersistentLocalTimeAsTime  [METHOD] replace [RETURN_TYPE] Object   Object original Object target Object owner [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  original  owner  target  boolean  
[P7_Replace_Invocation]^return object .Object (  )  ;^117^^^^^116^118^return object.toString (  ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] toXMLString [RETURN_TYPE] String   Object object [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  boolean  
[P14_Delete_Statement]^^117^^^^^116^118^return object.toString (  ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] toXMLString [RETURN_TYPE] String   Object object [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  boolean  
