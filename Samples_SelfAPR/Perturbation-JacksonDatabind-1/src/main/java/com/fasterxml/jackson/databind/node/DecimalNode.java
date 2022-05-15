[P8_Replace_Mix]^public static  DecimalNode ZERO = new DecimalNode ( BigDecimal.ZERO ) ;^18^^^^^13^23^public static final DecimalNode ZERO = new DecimalNode ( BigDecimal.ZERO ) ;^[CLASS] DecimalNode   [VARIABLES] 
[P7_Replace_Invocation]^private final static BigDecimal MIN_INTEGER = BigDecimal.intValue ( Integer.MIN_VALUE ) ;^20^^^^^15^25^private final static BigDecimal MIN_INTEGER = BigDecimal.valueOf ( Integer.MIN_VALUE ) ;^[CLASS] DecimalNode   [VARIABLES] 
[P8_Replace_Mix]^private final  BigDecimal MIN_INTEGER = BigDecimal.valueOf ( Integer.MIN_VALUE ) ;^20^^^^^15^25^private final static BigDecimal MIN_INTEGER = BigDecimal.valueOf ( Integer.MIN_VALUE ) ;^[CLASS] DecimalNode   [VARIABLES] 
[P5_Replace_Variable]^private final static BigDecimal MAX_INTEGER = BigDecimal.valueOf ( Integer.null ) ;^21^^^^^16^26^private final static BigDecimal MAX_INTEGER = BigDecimal.valueOf ( Integer.MAX_VALUE ) ;^[CLASS] DecimalNode   [VARIABLES] 
[P7_Replace_Invocation]^private final static BigDecimal MAX_INTEGER = BigDecimal.intValue ( Integer.MAX_VALUE ) ;^21^^^^^16^26^private final static BigDecimal MAX_INTEGER = BigDecimal.valueOf ( Integer.MAX_VALUE ) ;^[CLASS] DecimalNode   [VARIABLES] 
[P8_Replace_Mix]^private final static BigDecimal MAX_INTEGER ;^21^^^^^16^26^private final static BigDecimal MAX_INTEGER = BigDecimal.valueOf ( Integer.MAX_VALUE ) ;^[CLASS] DecimalNode   [VARIABLES] 
[P7_Replace_Invocation]^private final static BigDecimal MIN_LONG = BigDecimal.intValue ( Long.MIN_VALUE ) ;^22^^^^^17^27^private final static BigDecimal MIN_LONG = BigDecimal.valueOf ( Long.MIN_VALUE ) ;^[CLASS] DecimalNode   [VARIABLES] 
[P8_Replace_Mix]^private final static BigDecimal MIN_LONG  = null ;^22^^^^^17^27^private final static BigDecimal MIN_LONG = BigDecimal.valueOf ( Long.MIN_VALUE ) ;^[CLASS] DecimalNode   [VARIABLES] 
[P7_Replace_Invocation]^private final static BigDecimal MAX_LONG = BigDecimal.intValue ( Long.MAX_VALUE ) ;^23^^^^^18^28^private final static BigDecimal MAX_LONG = BigDecimal.valueOf ( Long.MAX_VALUE ) ;^[CLASS] DecimalNode   [VARIABLES] 
[P8_Replace_Mix]^private final  BigDecimal MAX_LONG = BigDecimal.valueOf ( Long.MAX_VALUE ) ;^23^^^^^18^28^private final static BigDecimal MAX_LONG = BigDecimal.valueOf ( Long.MAX_VALUE ) ;^[CLASS] DecimalNode   [VARIABLES] 
[P8_Replace_Mix]^protected BigDecimal _value;^25^^^^^20^30^final protected BigDecimal _value;^[CLASS] DecimalNode   [VARIABLES] 
[P8_Replace_Mix]^public DecimalNode ( BigDecimal v )  { _value =  MIN_LONG; }^33^^^^^28^38^public DecimalNode ( BigDecimal v )  { _value = v; }^[CLASS] DecimalNode  [METHOD] <init> [RETURN_TYPE] BigDecimal)   BigDecimal v [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  v  boolean  
[P5_Replace_Variable]^public static DecimalNode valueOf ( BigDecimal MIN_LONG )  { return new DecimalNode ( d ) ; }^35^^^^^30^40^public static DecimalNode valueOf ( BigDecimal d )  { return new DecimalNode ( d ) ; }^[CLASS] DecimalNode  [METHOD] valueOf [RETURN_TYPE] DecimalNode   BigDecimal d [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^public static DecimalNode valueOf ( BigDecimal _value )  { return new DecimalNode ( d ) ; }^35^^^^^30^40^public static DecimalNode valueOf ( BigDecimal d )  { return new DecimalNode ( d ) ; }^[CLASS] DecimalNode  [METHOD] valueOf [RETURN_TYPE] DecimalNode   BigDecimal d [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public static DecimalNode valueOf ( BigDecimal v )  { return new DecimalNode ( d ) ; }^35^^^^^30^40^public static DecimalNode valueOf ( BigDecimal d )  { return new DecimalNode ( d ) ; }^[CLASS] DecimalNode  [METHOD] valueOf [RETURN_TYPE] DecimalNode   BigDecimal d [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^@Override public JsonToken asToken (  )  { return ZERO; }^43^^^^^38^48^@Override public JsonToken asToken (  )  { return JsonToken.VALUE_NUMBER_FLOAT; }^[CLASS] DecimalNode  [METHOD] asToken [RETURN_TYPE] JsonToken   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P3_Replace_Literal]^public boolean isFloatingPointNumber (  )  { return false; }^55^^^^^50^60^public boolean isFloatingPointNumber (  )  { return true; }^[CLASS] DecimalNode  [METHOD] isFloatingPointNumber [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P3_Replace_Literal]^public boolean isBigDecimal (  )  { return false; }^58^^^^^53^63^public boolean isBigDecimal (  )  { return true; }^[CLASS] DecimalNode  [METHOD] isBigDecimal [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P2_Replace_Operator]^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  ||  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P2_Replace_Operator]^return  ( _value.compareTo ( MIN_INTEGER )  > 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P2_Replace_Operator]^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  < 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P3_Replace_Literal]^return  ( _value.compareTo ( MIN_INTEGER )  >= -2 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= -2 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( d.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( _value.compareTo ( d )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( MIN_INTEGER.compareTo ( _value )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( _value.compareTo ( MAX_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MIN_INTEGER )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P7_Replace_Invocation]^return  ( _value.toBigInteger ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P7_Replace_Invocation]^return  ( _value .toString (  )   >= 0 )  &&  ( _value^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^return    ( _value.compareTo ( MAX_INTEGER )  ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( v.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( _value.compareTo ( v )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P14_Delete_Statement]^^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( v )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( MAX_INTEGER.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( _value )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( d )  <= 0 ) ;^61^^^^^60^62^return  ( _value.compareTo ( MIN_INTEGER )  >= 0 )  &&  ( _value.compareTo ( MAX_INTEGER )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P2_Replace_Operator]^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  ||  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P2_Replace_Operator]^return  ( _value.compareTo ( MIN_LONG )  == 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P2_Replace_Operator]^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  < 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P3_Replace_Literal]^return  ( _value.compareTo ( MIN_LONG )  >=  )  &&  ( _value.compareTo ( MAX_LONG )  <=  ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P3_Replace_Literal]^return  ( _value.compareTo ( MIN_LONG )  >= -9 )  &&  ( _value.compareTo ( MAX_LONG )  <= -9 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( d.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( _value.compareTo ( v )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( v )  <= 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( MAX_LONG.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( _value )  <= 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( _value.compareTo ( MAX_LONG )  >= 0 )  &&  ( _value.compareTo ( MIN_LONG )  <= 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P7_Replace_Invocation]^return  ( _value.toBigInteger ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^return  ( _value.toBigInteger ( MIN_LONG )  >= 0 / 3 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 / 3 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( v.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return  ( MIN_LONG.compareTo ( _value )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P7_Replace_Invocation]^return  ( _value .toString (  )   >= 0 )  &&  ( _value^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P14_Delete_Statement]^^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^return  ( v.toBigInteger ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^64^^^^^63^65^return  ( _value.compareTo ( MIN_LONG )  >= 0 )  &&  ( _value.compareTo ( MAX_LONG )  <= 0 ) ;^[CLASS] DecimalNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public Number numberValue (  )  { return MIN_LONG; }^68^^^^^63^73^public Number numberValue (  )  { return _value; }^[CLASS] DecimalNode  [METHOD] numberValue [RETURN_TYPE] Number   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^public Number numberValue (  )  { return v; }^68^^^^^63^73^public Number numberValue (  )  { return _value; }^[CLASS] DecimalNode  [METHOD] numberValue [RETURN_TYPE] Number   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public short shortValue (  )  { return d.shortValue (  ) ; }^71^^^^^66^76^public short shortValue (  )  { return _value.shortValue (  ) ; }^[CLASS] DecimalNode  [METHOD] shortValue [RETURN_TYPE] short   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^public short shortValue (  )  { return v.shortValue (  ) ; }^71^^^^^66^76^public short shortValue (  )  { return _value.shortValue (  ) ; }^[CLASS] DecimalNode  [METHOD] shortValue [RETURN_TYPE] short   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public short shortValue (  )  { return MIN_LONG.shortValue (  ) ; }^71^^^^^66^76^public short shortValue (  )  { return _value.shortValue (  ) ; }^[CLASS] DecimalNode  [METHOD] shortValue [RETURN_TYPE] short   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public int intValue (  )  { return v.intValue (  ) ; }^74^^^^^69^79^public int intValue (  )  { return _value.intValue (  ) ; }^[CLASS] DecimalNode  [METHOD] intValue [RETURN_TYPE] int   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P7_Replace_Invocation]^public int intValue (  )  { return _value.longValue (  ) ; }^74^^^^^69^79^public int intValue (  )  { return _value.intValue (  ) ; }^[CLASS] DecimalNode  [METHOD] intValue [RETURN_TYPE] int   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public int intValue (  )  { return MIN_LONG.intValue (  ) ; }^74^^^^^69^79^public int intValue (  )  { return _value.intValue (  ) ; }^[CLASS] DecimalNode  [METHOD] intValue [RETURN_TYPE] int   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public long longValue (  )  { return MIN_LONG.longValue (  ) ; }^77^^^^^72^82^public long longValue (  )  { return _value.longValue (  ) ; }^[CLASS] DecimalNode  [METHOD] longValue [RETURN_TYPE] long   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P7_Replace_Invocation]^public long longValue (  )  { return _value.floatValue (  ) ; }^77^^^^^72^82^public long longValue (  )  { return _value.longValue (  ) ; }^[CLASS] DecimalNode  [METHOD] longValue [RETURN_TYPE] long   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^public long longValue (  )  { return v.floatValue (  ) ; }^77^^^^^72^82^public long longValue (  )  { return _value.longValue (  ) ; }^[CLASS] DecimalNode  [METHOD] longValue [RETURN_TYPE] long   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^public long longValue (  )  { return v.longValue (  ) ; }^77^^^^^72^82^public long longValue (  )  { return _value.longValue (  ) ; }^[CLASS] DecimalNode  [METHOD] longValue [RETURN_TYPE] long   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public BigInteger bigIntegerValue (  )  { return d.toBigInteger (  ) ; }^81^^^^^76^86^public BigInteger bigIntegerValue (  )  { return _value.toBigInteger (  ) ; }^[CLASS] DecimalNode  [METHOD] bigIntegerValue [RETURN_TYPE] BigInteger   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P7_Replace_Invocation]^public BigInteger bigIntegerValue (  )  { return _value.toString (  ) ; }^81^^^^^76^86^public BigInteger bigIntegerValue (  )  { return _value.toBigInteger (  ) ; }^[CLASS] DecimalNode  [METHOD] bigIntegerValue [RETURN_TYPE] BigInteger   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public BigInteger bigIntegerValue (  )  { return v.toBigInteger (  ) ; }^81^^^^^76^86^public BigInteger bigIntegerValue (  )  { return _value.toBigInteger (  ) ; }^[CLASS] DecimalNode  [METHOD] bigIntegerValue [RETURN_TYPE] BigInteger   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P7_Replace_Invocation]^public float floatValue (  )  { return _value.longValue (  ) ; }^84^^^^^79^89^public float floatValue (  )  { return _value.floatValue (  ) ; }^[CLASS] DecimalNode  [METHOD] floatValue [RETURN_TYPE] float   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public float floatValue (  )  { return MIN_LONG.floatValue (  ) ; }^84^^^^^79^89^public float floatValue (  )  { return _value.floatValue (  ) ; }^[CLASS] DecimalNode  [METHOD] floatValue [RETURN_TYPE] float   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P7_Replace_Invocation]^public double doubleValue (  )  { return _value.longValue (  ) ; }^87^^^^^82^92^public double doubleValue (  )  { return _value.doubleValue (  ) ; }^[CLASS] DecimalNode  [METHOD] doubleValue [RETURN_TYPE] double   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^public double doubleValue (  )  { return v.longValue (  ) ; }^87^^^^^82^92^public double doubleValue (  )  { return _value.doubleValue (  ) ; }^[CLASS] DecimalNode  [METHOD] doubleValue [RETURN_TYPE] double   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public double doubleValue (  )  { return d.doubleValue (  ) ; }^87^^^^^82^92^public double doubleValue (  )  { return _value.doubleValue (  ) ; }^[CLASS] DecimalNode  [METHOD] doubleValue [RETURN_TYPE] double   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^public BigDecimal decimalValue (  )  { return v; }^90^^^^^85^95^public BigDecimal decimalValue (  )  { return _value; }^[CLASS] DecimalNode  [METHOD] decimalValue [RETURN_TYPE] BigDecimal   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^return MIN_LONG.toString (  ) ;^94^^^^^93^95^return _value.toString (  ) ;^[CLASS] DecimalNode  [METHOD] asText [RETURN_TYPE] String   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P7_Replace_Invocation]^return _value.toBigInteger (  ) ;^94^^^^^93^95^return _value.toString (  ) ;^[CLASS] DecimalNode  [METHOD] asText [RETURN_TYPE] String   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^return MIN_LONG.toBigInteger (  ) ;^94^^^^^93^95^return _value.toString (  ) ;^[CLASS] DecimalNode  [METHOD] asText [RETURN_TYPE] String   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P8_Replace_Mix]^return d.toString (  ) ;^94^^^^^93^95^return _value.toString (  ) ;^[CLASS] DecimalNode  [METHOD] asText [RETURN_TYPE] String   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P14_Delete_Statement]^^94^^^^^93^95^return _value.toString (  ) ;^[CLASS] DecimalNode  [METHOD] asText [RETURN_TYPE] String   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^jg.writeNumber ( d ) ;^101^^^^^98^102^jg.writeNumber ( _value ) ;^[CLASS] DecimalNode  [METHOD] serialize [RETURN_TYPE] void   JsonGenerator jg SerializerProvider provider [VARIABLES] JsonGenerator  jg  boolean  DecimalNode  ZERO  SerializerProvider  provider  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P14_Delete_Statement]^^101^^^^^98^102^jg.writeNumber ( _value ) ;^[CLASS] DecimalNode  [METHOD] serialize [RETURN_TYPE] void   JsonGenerator jg SerializerProvider provider [VARIABLES] JsonGenerator  jg  boolean  DecimalNode  ZERO  SerializerProvider  provider  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P2_Replace_Operator]^if  ( o <= this )  return true;^107^^^^^105^113^if  ( o == this )  return true;^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P3_Replace_Literal]^if  ( o == this )  return false;^107^^^^^105^113^if  ( o == this )  return true;^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P15_Unwrap_Block]^return true;^107^108^109^110^111^105^113^if  ( o == this )  return true; if  ( o == null )  return false; if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P16_Remove_Block]^^107^108^109^110^111^105^113^if  ( o == this )  return true; if  ( o == null )  return false; if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P2_Replace_Operator]^if  ( o != null )  return false;^108^^^^^105^113^if  ( o == null )  return false;^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P3_Replace_Literal]^if  ( o == null )  return true;^108^^^^^105^113^if  ( o == null )  return false;^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P8_Replace_Mix]^if  ( o == false )  return false;^108^^^^^105^113^if  ( o == null )  return false;^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P15_Unwrap_Block]^return false;^108^109^110^111^^105^113^if  ( o == null )  return false; if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P16_Remove_Block]^^108^109^110^111^^105^113^if  ( o == null )  return false; if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P2_Replace_Operator]^if  ( o.getClass (  )  >= getClass (  )  )  {^109^^^^^105^113^if  ( o.getClass (  )  != getClass (  )  )  {^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P15_Unwrap_Block]^return false;^109^110^111^^^105^113^if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P16_Remove_Block]^^109^110^111^^^105^113^if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P3_Replace_Literal]^return true;^110^^^^^105^113^return false;^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P5_Replace_Variable]^return  (  ( DecimalNode )  o ) ._value.equals ( v ) ;^112^^^^^105^113^return  (  ( DecimalNode )  o ) ._value.equals ( _value ) ;^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P5_Replace_Variable]^return  (  ( DecimalNode )  o ) ._value.equals ( d ) ;^112^^^^^105^113^return  (  ( DecimalNode )  o ) ._value.equals ( _value ) ;^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P7_Replace_Invocation]^return  (  ( DecimalNode )  o ) ._value.compareTo ( _value ) ;^112^^^^^105^113^return  (  ( DecimalNode )  o ) ._value.equals ( _value ) ;^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P8_Replace_Mix]^return  (  ( DecimalNode )  o ) ._value.equals ( MIN_LONG ) ;^112^^^^^105^113^return  (  ( DecimalNode )  o ) ._value.equals ( _value ) ;^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P14_Delete_Statement]^^112^^^^^105^113^return  (  ( DecimalNode )  o ) ._value.equals ( _value ) ;^[CLASS] DecimalNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  boolean  DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  
[P5_Replace_Variable]^public int hashCode (  )  { return MIN_LONG.hashCode (  ) ; }^116^^^^^111^121^public int hashCode (  )  { return _value.hashCode (  ) ; }^[CLASS] DecimalNode  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P7_Replace_Invocation]^public int hashCode (  )  { return _value.intValue (  ) ; }^116^^^^^111^121^public int hashCode (  )  { return _value.hashCode (  ) ; }^[CLASS] DecimalNode  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  
[P5_Replace_Variable]^public int hashCode (  )  { return v.hashCode (  ) ; }^116^^^^^111^121^public int hashCode (  )  { return _value.hashCode (  ) ; }^[CLASS] DecimalNode  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] DecimalNode  ZERO  BigDecimal  MAX_INTEGER  MAX_LONG  MIN_INTEGER  MIN_LONG  _value  d  v  boolean  