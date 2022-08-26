[P1_Replace_Type]^private static final char OPTIONAL_ARG_PREFIX = "opt_";^34^^^^^29^39^private static final String OPTIONAL_ARG_PREFIX = "opt_";^[CLASS] GoogleCodingConvention   [VARIABLES] 
[P3_Replace_Literal]^private static final String OPTIONAL_ARG_PREFIX = "pt_";^34^^^^^29^39^private static final String OPTIONAL_ARG_PREFIX = "opt_";^[CLASS] GoogleCodingConvention   [VARIABLES] 
[P8_Replace_Mix]^private  final char OPTIONAL_ARG_PREFIX = "opt_";^34^^^^^29^39^private static final String OPTIONAL_ARG_PREFIX = "opt_";^[CLASS] GoogleCodingConvention   [VARIABLES] 
[P1_Replace_Type]^private static final char VAR_ARGS_NAME = "var_args";^36^^^^^31^41^private static final String VAR_ARGS_NAME = "var_args";^[CLASS] GoogleCodingConvention   [VARIABLES] 
[P3_Replace_Literal]^private static final String VAR_ARGS_NAME = "var_argsr_a";^36^^^^^31^41^private static final String VAR_ARGS_NAME = "var_args";^[CLASS] GoogleCodingConvention   [VARIABLES] 
[P3_Replace_Literal]^private static final Pattern ENUM_KEY_PATTERN = Pattern.compile ( "[A-Z0-9][A-ZA-Z0-9][A-Z0-9_]*" ) ;^38^39^^^^38^39^private static final Pattern ENUM_KEY_PATTERN = Pattern.compile ( "[A-Z0-9][A-Z0-9_]*" ) ;^[CLASS] GoogleCodingConvention   [VARIABLES] 
[P7_Replace_Invocation]^private static final Pattern ENUM_KEY_PATTERN = Pattern.matcher ( "[A-Z0-9][A-Z0-9_]*" ) ;^38^39^^^^38^39^private static final Pattern ENUM_KEY_PATTERN = Pattern.compile ( "[A-Z0-9][A-Z0-9_]*" ) ;^[CLASS] GoogleCodingConvention   [VARIABLES] 
[P8_Replace_Mix]^private static final Pattern ENUM_KEY_PATTERN  = null ;^38^39^^^^38^39^private static final Pattern ENUM_KEY_PATTERN = Pattern.compile ( "[A-Z0-9][A-Z0-9_]*" ) ;^[CLASS] GoogleCodingConvention   [VARIABLES] 
[P2_Replace_Operator]^if  ( name.length (  )  < 1 )  {^61^^^^^60^81^if  ( name.length (  )  <= 1 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( name.length (  )  <= pos )  {^61^^^^^60^81^if  ( name.length (  )  <= 1 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( name.length() + 7  <= 1 )  {^61^^^^^60^81^if  ( name.length (  )  <= 1 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P5_Replace_Variable]^if  ( VAR_ARGS_NAME.length (  )  <= 1 )  {^61^^^^^60^81^if  ( name.length (  )  <= 1 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P7_Replace_Invocation]^if  ( name.charAt (  )  <= 1 )  {^61^^^^^60^81^if  ( name.length (  )  <= 1 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P8_Replace_Mix]^if  ( name.length (  )  <= 0  )  {^61^^^^^60^81^if  ( name.length (  )  <= 1 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P9_Replace_Statement]^if  ( name.length (  )  == 0 )  {^61^^^^^60^81^if  ( name.length (  )  <= 1 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P15_Unwrap_Block]^return false;^61^62^63^^^60^81^if  ( name.length (  )  <= 1 )  { return false; }^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P16_Remove_Block]^^61^62^63^^^60^81^if  ( name.length (  )  <= 1 )  { return false; }^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P13_Insert_Block]^if  (  ( name.length (  )  )  == 0 )  {     return false; }^61^^^^^60^81^[Delete]^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^return true;^62^^^^^60^81^return false;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( name.length() - 6  <= 1 )  {^61^^^^^60^81^if  ( name.length (  )  <= 1 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P7_Replace_Invocation]^if  ( name .endsWith ( VAR_ARGS_NAME )   <= 1 )  {^61^^^^^60^81^if  ( name.length (  )  <= 1 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P8_Replace_Mix]^if  ( VAR_ARGS_NAME.charAt (  )  <= 1 )  {^61^^^^^60^81^if  ( name.length (  )  <= 1 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P1_Replace_Type]^short  pos = name.lastIndexOf ( '$' ) ;^67^^^^^60^81^int pos = name.lastIndexOf ( '$' ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P5_Replace_Variable]^int pos = VAR_ARGS_NAME.lastIndexOf ( '$' ) ;^67^^^^^60^81^int pos = name.lastIndexOf ( '$' ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P14_Delete_Statement]^^67^^^^^60^81^int pos = name.lastIndexOf ( '$' ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P2_Replace_Operator]^if  ( pos > 0 )  {^68^^^^^60^81^if  ( pos >= 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( pos >= -4 )  {^68^^^^^60^81^if  ( pos >= 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( pos >= pos )  {^68^^^^^60^81^if  ( pos >= 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P6_Replace_Expression]^if  ( pos + 1 )  {^68^^^^^60^81^if  ( pos >= 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P6_Replace_Expression]^if  ( name.length() == 0 )  {^68^^^^^60^81^if  ( pos >= 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P8_Replace_Mix]^if  ( pos >= 0 / 2 )  {^68^^^^^60^81^if  ( pos >= 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P15_Unwrap_Block]^name = name.substring((pos + 1)); if ((name.length()) == 0) {    return false;};^68^69^70^71^72^60^81^if  ( pos >= 0 )  { name = name.substring ( pos + 1 ) ; if  ( name.length (  )  == 0 )  { return false; }^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P16_Remove_Block]^^68^69^70^71^72^60^81^if  ( pos >= 0 )  { name = name.substring ( pos + 1 ) ; if  ( name.length (  )  == 0 )  { return false; }^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P2_Replace_Operator]^if  ( name.length (  )  >= 0 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( name.length (  )  == 3 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( name.length() + 1  == 0 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P5_Replace_Variable]^if  ( VAR_ARGS_NAME.length (  )  == 0 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P7_Replace_Invocation]^if  ( name.charAt (  )  == 0 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P8_Replace_Mix]^if  ( name.length (  )  == 0  )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P9_Replace_Statement]^if  ( name.length (  )  <= 1 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P15_Unwrap_Block]^return false;^70^71^72^^^60^81^if  ( name.length (  )  == 0 )  { return false; }^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P16_Remove_Block]^^70^71^72^^^60^81^if  ( name.length (  )  == 0 )  { return false; }^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P13_Insert_Block]^if  (  ( name.length (  )  )  <= 1 )  {     return false; }^70^^^^^60^81^[Delete]^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^return true;^71^^^^^60^81^return false;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P2_Replace_Operator]^name = name.substring ( pos  &&  1 ) ;^69^^^^^60^81^name = name.substring ( pos + 1 ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^name = name.substring ( pos  ) ;^69^^^^^60^81^name = name.substring ( pos + 1 ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P5_Replace_Variable]^name = VAR_ARGS_NAME.substring ( pos + 1 ) ;^69^^^^^60^81^name = name.substring ( pos + 1 ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P5_Replace_Variable]^name = pos.substring ( name + 1 ) ;^69^^^^^60^81^name = name.substring ( pos + 1 ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P8_Replace_Mix]^name = name.substring ( pos + 3 ) ;^69^^^^^60^81^name = name.substring ( pos + 1 ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P2_Replace_Operator]^name = name.substring ( pos  <<  1 ) ;^69^^^^^60^81^name = name.substring ( pos + 1 ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P14_Delete_Statement]^^69^^^^^60^81^name = name.substring ( pos + 1 ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( name.length() + 3  == 0 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P8_Replace_Mix]^if  ( name .endsWith ( OPTIONAL_ARG_PREFIX )   == 0 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P2_Replace_Operator]^if  ( name.length (  )  <= 0 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( name.length (  )  == pos )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( name.length() - 2  == 0 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P7_Replace_Invocation]^if  ( name .endsWith ( VAR_ARGS_NAME )   == 0 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^name = name.substring ( pos + pos ) ;^69^^^^^60^81^name = name.substring ( pos + 1 ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P8_Replace_Mix]^name = name.substring ( pos + 1L ) ;^69^^^^^60^81^name = name.substring ( pos + 1 ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P2_Replace_Operator]^name = name.substring ( pos  ==  1 ) ;^69^^^^^60^81^name = name.substring ( pos + 1 ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( name.length() - 6  == 0 )  {^70^^^^^60^81^if  ( name.length (  )  == 0 )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( !Character.isUpperCase ( name.charAt ( -4 )  )  )  {^75^^^^^60^81^if  ( !Character.isUpperCase ( name.charAt ( 0 )  )  )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P5_Replace_Variable]^if  ( !Character.isUpperCase ( VAR_ARGS_NAME.charAt ( 0 )  )  )  {^75^^^^^60^81^if  ( !Character.isUpperCase ( name.charAt ( 0 )  )  )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P7_Replace_Invocation]^if  ( !Character.isUpperCase ( name .startsWith ( name )   )  )  {^75^^^^^60^81^if  ( !Character.isUpperCase ( name.charAt ( 0 )  )  )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P8_Replace_Mix]^if  ( !Character.isUpperCase ( VAR_ARGS_NAME.charAt ( 0L )  )  )  {^75^^^^^60^81^if  ( !Character.isUpperCase ( name.charAt ( 0 )  )  )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P15_Unwrap_Block]^return false;^75^76^77^^^60^81^if  ( !Character.isUpperCase ( name.charAt ( 0 )  )  )  { return false; }^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P16_Remove_Block]^^75^76^77^^^60^81^if  ( !Character.isUpperCase ( name.charAt ( 0 )  )  )  { return false; }^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^return true;^76^^^^^60^81^return false;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( !Character.isUpperCase ( name.charAt ( -1 )  )  )  {^75^^^^^60^81^if  ( !Character.isUpperCase ( name.charAt ( 0 )  )  )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P13_Insert_Block]^if  ( ! ( isUpperCase ( name.charAt ( 0 )  )  )  )  {     return false; }^75^^^^^60^81^[Delete]^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P3_Replace_Literal]^if  ( !Character.isUpperCase ( name.charAt (  )  )  )  {^75^^^^^60^81^if  ( !Character.isUpperCase ( name.charAt ( 0 )  )  )  {^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P5_Replace_Variable]^return VAR_ARGS_NAME.toUpperCase (  ) .equals ( name ) ;^80^^^^^60^81^return name.toUpperCase (  ) .equals ( name ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P7_Replace_Invocation]^return name.substring (  ) .equals ( name ) ;^80^^^^^60^81^return name.toUpperCase (  ) .equals ( name ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P7_Replace_Invocation]^return name .substring ( pos )  .equals ( name ) ;^80^^^^^60^81^return name.toUpperCase (  ) .equals ( name ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P14_Delete_Statement]^^80^^^^^60^81^return name.toUpperCase (  ) .equals ( name ) ;^[CLASS] GoogleCodingConvention  [METHOD] isConstant [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  name  boolean  int  pos  
[P5_Replace_Variable]^return ENUM_KEY_PATTERN.matcher ( name ) .matches (  ) ;^98^^^^^97^99^return ENUM_KEY_PATTERN.matcher ( key ) .matches (  ) ;^[CLASS] GoogleCodingConvention  [METHOD] isValidEnumKey [RETURN_TYPE] boolean   String key [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  
[P5_Replace_Variable]^return key.matcher ( ENUM_KEY_PATTERN ) .matches (  ) ;^98^^^^^97^99^return ENUM_KEY_PATTERN.matcher ( key ) .matches (  ) ;^[CLASS] GoogleCodingConvention  [METHOD] isValidEnumKey [RETURN_TYPE] boolean   String key [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  
[P14_Delete_Statement]^^98^^^^^97^99^return ENUM_KEY_PATTERN.matcher ( key ) .matches (  ) ;^[CLASS] GoogleCodingConvention  [METHOD] isValidEnumKey [RETURN_TYPE] boolean   String key [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  
[P5_Replace_Variable]^return parameter.getString (  ) .startsWith ( name ) ;^109^^^^^108^110^return parameter.getString (  ) .startsWith ( OPTIONAL_ARG_PREFIX ) ;^[CLASS] GoogleCodingConvention  [METHOD] isOptionalParameter [RETURN_TYPE] boolean   Node parameter [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  Node  parameter  
[P5_Replace_Variable]^return OPTIONAL_ARG_PREFIX.getString (  ) .startsWith ( parameter ) ;^109^^^^^108^110^return parameter.getString (  ) .startsWith ( OPTIONAL_ARG_PREFIX ) ;^[CLASS] GoogleCodingConvention  [METHOD] isOptionalParameter [RETURN_TYPE] boolean   Node parameter [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  Node  parameter  
[P14_Delete_Statement]^^109^^^^^108^110^return parameter.getString (  ) .startsWith ( OPTIONAL_ARG_PREFIX ) ;^[CLASS] GoogleCodingConvention  [METHOD] isOptionalParameter [RETURN_TYPE] boolean   Node parameter [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  Node  parameter  
[P5_Replace_Variable]^return name.equals ( parameter.getString (  )  ) ;^114^^^^^113^115^return VAR_ARGS_NAME.equals ( parameter.getString (  )  ) ;^[CLASS] GoogleCodingConvention  [METHOD] isVarArgsParameter [RETURN_TYPE] boolean   Node parameter [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  Node  parameter  
[P5_Replace_Variable]^return parameter.equals ( VAR_ARGS_NAME.getString (  )  ) ;^114^^^^^113^115^return VAR_ARGS_NAME.equals ( parameter.getString (  )  ) ;^[CLASS] GoogleCodingConvention  [METHOD] isVarArgsParameter [RETURN_TYPE] boolean   Node parameter [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  Node  parameter  
[P7_Replace_Invocation]^return VAR_ARGS_NAME.endsWith ( parameter.getString (  )  ) ;^114^^^^^113^115^return VAR_ARGS_NAME.equals ( parameter.getString (  )  ) ;^[CLASS] GoogleCodingConvention  [METHOD] isVarArgsParameter [RETURN_TYPE] boolean   Node parameter [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  Node  parameter  
[P7_Replace_Invocation]^return VAR_ARGS_NAME .toUpperCase (  )  ;^114^^^^^113^115^return VAR_ARGS_NAME.equals ( parameter.getString (  )  ) ;^[CLASS] GoogleCodingConvention  [METHOD] isVarArgsParameter [RETURN_TYPE] boolean   Node parameter [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  Node  parameter  
[P8_Replace_Mix]^return name.endsWith ( parameter.getString (  )  ) ;^114^^^^^113^115^return VAR_ARGS_NAME.equals ( parameter.getString (  )  ) ;^[CLASS] GoogleCodingConvention  [METHOD] isVarArgsParameter [RETURN_TYPE] boolean   Node parameter [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  Node  parameter  
[P14_Delete_Statement]^^114^^^^^113^115^return VAR_ARGS_NAME.equals ( parameter.getString (  )  ) ;^[CLASS] GoogleCodingConvention  [METHOD] isVarArgsParameter [RETURN_TYPE] boolean   Node parameter [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  Node  parameter  
[P2_Replace_Operator]^return !local || name.startsWith ( "_" ) ;^125^^^^^124^126^return !local && name.startsWith ( "_" ) ;^[CLASS] GoogleCodingConvention  [METHOD] isExported [RETURN_TYPE] boolean   String name boolean local [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  local  
[P5_Replace_Variable]^return !local && key.startsWith ( "_" ) ;^125^^^^^124^126^return !local && name.startsWith ( "_" ) ;^[CLASS] GoogleCodingConvention  [METHOD] isExported [RETURN_TYPE] boolean   String name boolean local [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  local  
[P8_Replace_Mix]^return local ;^125^^^^^124^126^return !local && name.startsWith ( "_" ) ;^[CLASS] GoogleCodingConvention  [METHOD] isExported [RETURN_TYPE] boolean   String name boolean local [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  local  
[P3_Replace_Literal]^return !local && name.startsWith ( "" ) ;^125^^^^^124^126^return !local && name.startsWith ( "_" ) ;^[CLASS] GoogleCodingConvention  [METHOD] isExported [RETURN_TYPE] boolean   String name boolean local [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  local  
[P14_Delete_Statement]^^125^^^^^124^126^return !local && name.startsWith ( "_" ) ;^[CLASS] GoogleCodingConvention  [METHOD] isExported [RETURN_TYPE] boolean   String name boolean local [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  local  
[P2_Replace_Operator]^return name.endsWith ( "_" )  || !isExported ( name ) ;^136^^^^^135^137^return name.endsWith ( "_" )  && !isExported ( name ) ;^[CLASS] GoogleCodingConvention  [METHOD] isPrivate [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  
[P3_Replace_Literal]^return name.endsWith ( "" )  && !isExported ( name ) ;^136^^^^^135^137^return name.endsWith ( "_" )  && !isExported ( name ) ;^[CLASS] GoogleCodingConvention  [METHOD] isPrivate [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  
[P5_Replace_Variable]^return key.endsWith ( "_" )  && !isExported ( name ) ;^136^^^^^135^137^return name.endsWith ( "_" )  && !isExported ( name ) ;^[CLASS] GoogleCodingConvention  [METHOD] isPrivate [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  
[P7_Replace_Invocation]^return name.endsWith ( "_" )  && !isPrivate ( name ) ;^136^^^^^135^137^return name.endsWith ( "_" )  && !isExported ( name ) ;^[CLASS] GoogleCodingConvention  [METHOD] isPrivate [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  
[P14_Delete_Statement]^^136^^^^^135^137^return name.endsWith ( "_" )  && !isExported ( name ) ;^[CLASS] GoogleCodingConvention  [METHOD] isPrivate [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  
[P8_Replace_Mix]^return key.endsWith ( "_" )  && !isPrivate ( name ) ;^136^^^^^135^137^return name.endsWith ( "_" )  && !isExported ( name ) ;^[CLASS] GoogleCodingConvention  [METHOD] isPrivate [RETURN_TYPE] boolean   String name [VARIABLES] Pattern  ENUM_KEY_PATTERN  String  OPTIONAL_ARG_PREFIX  VAR_ARGS_NAME  key  name  boolean  