[P8_Replace_Mix]^private static  int[] SQL_TYPES = new int[] { Types.VARCHAR };^33^^^^^28^38^private static final int[] SQL_TYPES = new int[] { Types.VARCHAR };^[CLASS] AbstractStringBasedJodaType   [VARIABLES] 
[P1_Replace_Type]^char s =  ( char )  Hibernate.STRING.nullSafeGet ( resultSet, strings[0] ) ;^40^^^^^39^46^String s =  ( String )  Hibernate.STRING.nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P5_Replace_Variable]^String s =  ( String )  Hibernate.STRING.nullSafeGet (  strings[0] ) ;^40^^^^^39^46^String s =  ( String )  Hibernate.STRING.nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P5_Replace_Variable]^String s =  ( String )  Hibernate.STRING.nullSafeGet ( resultSet[0] ) ;^40^^^^^39^46^String s =  ( String )  Hibernate.STRING.nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P5_Replace_Variable]^String s =  ( String )  Hibernate.STRING.nullSafeGet ( strings, resultSet[0] ) ;^40^^^^^39^46^String s =  ( String )  Hibernate.STRING.nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P7_Replace_Invocation]^String s =  ( String )  Hibernate.STRING.nullSafeSet ( resultSet, strings[0] ) ;^40^^^^^39^46^String s =  ( String )  Hibernate.STRING.nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P3_Replace_Literal]^String s =  ( String )  Hibernate.STRING.nullSafeGet ( resultSet, strings[-3] ) ;^40^^^^^39^46^String s =  ( String )  Hibernate.STRING.nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P14_Delete_Statement]^^40^^^^^39^46^String s =  ( String )  Hibernate.STRING.nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P2_Replace_Operator]^if  ( s != null )  {^41^^^^^39^46^if  ( s == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P8_Replace_Mix]^if  ( s == false )  {^41^^^^^39^46^if  ( s == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P9_Replace_Statement]^if  ( x == y )  {^41^^^^^39^46^if  ( s == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P9_Replace_Statement]^if  ( value == null )  {^41^^^^^39^46^if  ( s == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P15_Unwrap_Block]^return null;^41^42^43^^^39^46^if  ( s == null )  { return null; }^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P16_Remove_Block]^^41^42^43^^^39^46^if  ( s == null )  { return null; }^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P13_Insert_Block]^if  ( x == y )  {     return true; }^41^^^^^39^46^[Delete]^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P13_Insert_Block]^if  (  ( x == null )  ||  ( y == null )  )  {     return false; }^41^^^^^39^46^[Delete]^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P8_Replace_Mix]^return false;^42^^^^^39^46^return null;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P8_Replace_Mix]^return this;^42^^^^^39^46^return null;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P7_Replace_Invocation]^return toNonNullString ( s ) ;^45^^^^^39^46^return fromNonNullString ( s ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P14_Delete_Statement]^^45^^^^^39^46^return fromNonNullString ( s ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  String  s  boolean  
[P2_Replace_Operator]^if  ( value != null )  {^51^^^^^50^56^if  ( value == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P8_Replace_Mix]^if  ( value == this )  {^51^^^^^50^56^if  ( value == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P9_Replace_Statement]^if  ( s == null )  {^51^^^^^50^56^if  ( value == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P15_Unwrap_Block]^Hibernate.STRING.nullSafeSet(preparedStatement, null, index);^51^52^53^54^55^50^56^if  ( value == null )  { Hibernate.STRING.nullSafeSet ( preparedStatement, null, index ) ; } else { Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ; }^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P16_Remove_Block]^^51^52^53^54^55^50^56^if  ( value == null )  { Hibernate.STRING.nullSafeSet ( preparedStatement, null, index ) ; } else { Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ; }^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P5_Replace_Variable]^Hibernate.STRING.nullSafeSet (  toNonNullString ( value ) , index ) ;^54^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P5_Replace_Variable]^Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value )  ) ;^54^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P5_Replace_Variable]^Hibernate.STRING.nullSafeSet ( index, toNonNullString ( value ) , preparedStatement ) ;^54^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P5_Replace_Variable]^Hibernate.STRING.nullSafeSet ( value, toNonNullString ( preparedStatement ) , index ) ;^54^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P7_Replace_Invocation]^Hibernate.STRING.nullSafeSet ( preparedStatement, hashCode ( value ) , index ) ;^54^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P14_Delete_Statement]^^54^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P11_Insert_Donor_Statement]^Hibernate.STRING.nullSafeSet ( preparedStatement, null, index ) ;Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ;^54^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P5_Replace_Variable]^Hibernate.STRING.nullSafeSet (  null, index ) ;^52^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P5_Replace_Variable]^Hibernate.STRING.nullSafeSet ( preparedStatement, null ) ;^52^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P5_Replace_Variable]^Hibernate.STRING.nullSafeSet ( index, null, preparedStatement ) ;^52^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P14_Delete_Statement]^^52^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P11_Insert_Donor_Statement]^Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ;Hibernate.STRING.nullSafeSet ( preparedStatement, null, index ) ;^52^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P5_Replace_Variable]^Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( index ) , value ) ;^54^^^^^50^56^Hibernate.STRING.nullSafeSet ( preparedStatement, toNonNullString ( value ) , index ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  int  index  
[P2_Replace_Operator]^if  ( x <= y )  {^61^^^^^60^68^if  ( x == y )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P5_Replace_Variable]^if  ( y == x )  {^61^^^^^60^68^if  ( x == y )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P9_Replace_Statement]^if  ( s == null )  {^61^^^^^60^68^if  ( x == y )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P15_Unwrap_Block]^return true;^61^62^63^^^60^68^if  ( x == y )  { return true; }^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P16_Remove_Block]^^61^62^63^^^60^68^if  ( x == y )  { return true; }^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P13_Insert_Block]^if  (  ( x == null )  ||  ( y == null )  )  {     return false; }^61^^^^^60^68^[Delete]^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P13_Insert_Block]^if  ( s == null )  {     return null; }^61^^^^^60^68^[Delete]^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P3_Replace_Literal]^return false;^62^^^^^60^68^return true;^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P2_Replace_Operator]^if  ( x == null && y == null )  {^64^^^^^60^68^if  ( x == null || y == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P2_Replace_Operator]^if  ( x != null || y == null )  {^64^^^^^60^68^if  ( x == null || y == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P2_Replace_Operator]^if  ( x == null || y != null )  {^64^^^^^60^68^if  ( x == null || y == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P5_Replace_Variable]^if  ( y == null || x == null )  {^64^^^^^60^68^if  ( x == null || y == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P6_Replace_Expression]^if  ( x == null ) {^64^^^^^60^68^if  ( x == null || y == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P6_Replace_Expression]^if  (  y == null )  {^64^^^^^60^68^if  ( x == null || y == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P8_Replace_Mix]^if  ( x == false ) {^64^^^^^60^68^if  ( x == null || y == null )  {^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P15_Unwrap_Block]^return false;^64^65^66^^^60^68^if  ( x == null || y == null )  { return false; }^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P16_Remove_Block]^^64^65^66^^^60^68^if  ( x == null || y == null )  { return false; }^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P13_Insert_Block]^if  ( x == y )  {     return true; }^64^^^^^60^68^[Delete]^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P13_Insert_Block]^if  ( s == null )  {     return null; }^64^^^^^60^68^[Delete]^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P3_Replace_Literal]^return true;^65^^^^^60^68^return false;^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P5_Replace_Variable]^return y.equals ( x ) ;^67^^^^^60^68^return x.equals ( y ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P14_Delete_Statement]^^67^^^^^60^68^return x.equals ( y ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  
[P7_Replace_Invocation]^return object.equals (  ) ;^71^^^^^70^72^return object.hashCode (  ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] hashCode [RETURN_TYPE] int   Object object [VARIABLES] int[]  SQL_TYPES  Object  object  boolean  
[P7_Replace_Invocation]^return object .disassemble ( object )  ;^71^^^^^70^72^return object.hashCode (  ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] hashCode [RETURN_TYPE] int   Object object [VARIABLES] int[]  SQL_TYPES  Object  object  boolean  
[P14_Delete_Statement]^^71^^^^^70^72^return object.hashCode (  ) ;^[CLASS] AbstractStringBasedJodaType  [METHOD] hashCode [RETURN_TYPE] int   Object object [VARIABLES] int[]  SQL_TYPES  Object  object  boolean  
[P3_Replace_Literal]^return true;^79^^^^^78^80^return false;^[CLASS] AbstractStringBasedJodaType  [METHOD] isMutable [RETURN_TYPE] boolean   [VARIABLES] int[]  SQL_TYPES  boolean  
[P5_Replace_Variable]^return target;^91^^^^^90^92^return original;^[CLASS] AbstractStringBasedJodaType  [METHOD] replace [RETURN_TYPE] Object   Object original Object target Object owner [VARIABLES] int[]  SQL_TYPES  Object  original  owner  target  boolean  
