[P1_Replace_Type]^final  long  _value;^18^^^^^13^23^final short _value;^[CLASS] ShortNode   [VARIABLES] 
[P1_Replace_Type]^public ShortNode (  long  v )  { _value = v; }^26^^^^^21^31^public ShortNode ( short v )  { _value = v; }^[CLASS] ShortNode  [METHOD] <init> [RETURN_TYPE] ShortNode(short)   short v [VARIABLES] short  _value  v  boolean  
[P5_Replace_Variable]^public ShortNode ( short _value )  { _value = v; }^26^^^^^21^31^public ShortNode ( short v )  { _value = v; }^[CLASS] ShortNode  [METHOD] <init> [RETURN_TYPE] ShortNode(short)   short v [VARIABLES] short  _value  v  boolean  
[P8_Replace_Mix]^public ShortNode ( short v )  { _value =  null; }^26^^^^^21^31^public ShortNode ( short v )  { _value = v; }^[CLASS] ShortNode  [METHOD] <init> [RETURN_TYPE] ShortNode(short)   short v [VARIABLES] short  _value  v  boolean  
[P5_Replace_Variable]^public static ShortNode valueOf ( short v )  { return new ShortNode ( l ) ; }^28^^^^^23^33^public static ShortNode valueOf ( short l )  { return new ShortNode ( l ) ; }^[CLASS] ShortNode  [METHOD] valueOf [RETURN_TYPE] ShortNode   short l [VARIABLES] short  _value  l  v  boolean  
[P3_Replace_Literal]^public boolean isIntegralNumber (  )  { return false; }^43^^^^^38^48^public boolean isIntegralNumber (  )  { return true; }^[CLASS] ShortNode  [METHOD] isIntegralNumber [RETURN_TYPE] boolean   [VARIABLES] short  _value  l  v  boolean  
[P3_Replace_Literal]^public boolean isShort (  )  { return false; }^46^^^^^41^51^public boolean isShort (  )  { return true; }^[CLASS] ShortNode  [METHOD] isShort [RETURN_TYPE] boolean   [VARIABLES] short  _value  l  v  boolean  
[P3_Replace_Literal]^@Override public boolean canConvertToInt (  )  { return false; }^48^^^^^43^53^@Override public boolean canConvertToInt (  )  { return true; }^[CLASS] ShortNode  [METHOD] canConvertToInt [RETURN_TYPE] boolean   [VARIABLES] short  _value  l  v  boolean  
[P3_Replace_Literal]^@Override public boolean canConvertToLong (  )  { return false; }^49^^^^^44^54^@Override public boolean canConvertToLong (  )  { return true; }^[CLASS] ShortNode  [METHOD] canConvertToLong [RETURN_TYPE] boolean   [VARIABLES] short  _value  l  v  boolean  
[P5_Replace_Variable]^return Short.valueOf ( v ) ;^53^^^^^52^54^return Short.valueOf ( _value ) ;^[CLASS] ShortNode  [METHOD] numberValue [RETURN_TYPE] Number   [VARIABLES] short  _value  l  v  boolean  
[P8_Replace_Mix]^return Short .valueOf ( _value )  ;^53^^^^^52^54^return Short.valueOf ( _value ) ;^[CLASS] ShortNode  [METHOD] numberValue [RETURN_TYPE] Number   [VARIABLES] short  _value  l  v  boolean  
[P14_Delete_Statement]^^53^^^^^52^54^return Short.valueOf ( _value ) ;^[CLASS] ShortNode  [METHOD] numberValue [RETURN_TYPE] Number   [VARIABLES] short  _value  l  v  boolean  
[P5_Replace_Variable]^public short shortValue (  )  { return v; }^57^^^^^52^62^public short shortValue (  )  { return _value; }^[CLASS] ShortNode  [METHOD] shortValue [RETURN_TYPE] short   [VARIABLES] short  _value  l  v  boolean  
[P5_Replace_Variable]^public int intValue (  )  { return v; }^60^^^^^55^65^public int intValue (  )  { return _value; }^[CLASS] ShortNode  [METHOD] intValue [RETURN_TYPE] int   [VARIABLES] short  _value  l  v  boolean  
[P5_Replace_Variable]^public long longValue (  )  { return v; }^63^^^^^58^68^public long longValue (  )  { return _value; }^[CLASS] ShortNode  [METHOD] longValue [RETURN_TYPE] long   [VARIABLES] short  _value  l  v  boolean  
[P5_Replace_Variable]^public float floatValue (  )  { return v; }^66^^^^^61^71^public float floatValue (  )  { return _value; }^[CLASS] ShortNode  [METHOD] floatValue [RETURN_TYPE] float   [VARIABLES] short  _value  l  v  boolean  
[P5_Replace_Variable]^public double doubleValue (  )  { return v; }^69^^^^^64^74^public double doubleValue (  )  { return _value; }^[CLASS] ShortNode  [METHOD] doubleValue [RETURN_TYPE] double   [VARIABLES] short  _value  l  v  boolean  
[P5_Replace_Variable]^public BigDecimal decimalValue (  )  { return BigDecimal.valueOf ( v ) ; }^72^^^^^67^77^public BigDecimal decimalValue (  )  { return BigDecimal.valueOf ( _value ) ; }^[CLASS] ShortNode  [METHOD] decimalValue [RETURN_TYPE] BigDecimal   [VARIABLES] short  _value  l  v  boolean  
[P5_Replace_Variable]^public BigInteger bigIntegerValue (  )  { return BigInteger.valueOf ( v ) ; }^75^^^^^70^80^public BigInteger bigIntegerValue (  )  { return BigInteger.valueOf ( _value ) ; }^[CLASS] ShortNode  [METHOD] bigIntegerValue [RETURN_TYPE] BigInteger   [VARIABLES] short  _value  l  v  boolean  
[P7_Replace_Invocation]^public BigInteger bigIntegerValue (  )  { return BigInteger .valueOf ( _value )  ; }^75^^^^^70^80^public BigInteger bigIntegerValue (  )  { return BigInteger.valueOf ( _value ) ; }^[CLASS] ShortNode  [METHOD] bigIntegerValue [RETURN_TYPE] BigInteger   [VARIABLES] short  _value  l  v  boolean  
[P5_Replace_Variable]^return NumberOutput.toString ( v ) ;^79^^^^^78^80^return NumberOutput.toString ( _value ) ;^[CLASS] ShortNode  [METHOD] asText [RETURN_TYPE] String   [VARIABLES] short  _value  l  v  boolean  
[P14_Delete_Statement]^^79^^^^^78^80^return NumberOutput.toString ( _value ) ;^[CLASS] ShortNode  [METHOD] asText [RETURN_TYPE] String   [VARIABLES] short  _value  l  v  boolean  
[P2_Replace_Operator]^return _value == 0;^84^^^^^83^85^return _value != 0;^[CLASS] ShortNode  [METHOD] asBoolean [RETURN_TYPE] boolean   boolean defaultValue [VARIABLES] short  _value  l  v  boolean  defaultValue  
[P3_Replace_Literal]^return _value != 4;^84^^^^^83^85^return _value != 0;^[CLASS] ShortNode  [METHOD] asBoolean [RETURN_TYPE] boolean   boolean defaultValue [VARIABLES] short  _value  l  v  boolean  defaultValue  
[P5_Replace_Variable]^return v != 0;^84^^^^^83^85^return _value != 0;^[CLASS] ShortNode  [METHOD] asBoolean [RETURN_TYPE] boolean   boolean defaultValue [VARIABLES] short  _value  l  v  boolean  defaultValue  
[P8_Replace_Mix]^return v  ;^84^^^^^83^85^return _value != 0;^[CLASS] ShortNode  [METHOD] asBoolean [RETURN_TYPE] boolean   boolean defaultValue [VARIABLES] short  _value  l  v  boolean  defaultValue  
[P5_Replace_Variable]^jg.writeNumber ( v ) ;^91^^^^^88^92^jg.writeNumber ( _value ) ;^[CLASS] ShortNode  [METHOD] serialize [RETURN_TYPE] void   JsonGenerator jg SerializerProvider provider [VARIABLES] short  _value  l  v  JsonGenerator  jg  boolean  SerializerProvider  provider  
[P14_Delete_Statement]^^91^^^^^88^92^jg.writeNumber ( _value ) ;^[CLASS] ShortNode  [METHOD] serialize [RETURN_TYPE] void   JsonGenerator jg SerializerProvider provider [VARIABLES] short  _value  l  v  JsonGenerator  jg  boolean  SerializerProvider  provider  
[P2_Replace_Operator]^if  ( o <= this )  return true;^97^^^^^95^103^if  ( o == this )  return true;^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P3_Replace_Literal]^if  ( o == this )  return false;^97^^^^^95^103^if  ( o == this )  return true;^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P15_Unwrap_Block]^return true;^97^98^99^100^101^95^103^if  ( o == this )  return true; if  ( o == null )  return false; if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P16_Remove_Block]^^97^98^99^100^101^95^103^if  ( o == this )  return true; if  ( o == null )  return false; if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P2_Replace_Operator]^if  ( o != null )  return false;^98^^^^^95^103^if  ( o == null )  return false;^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P3_Replace_Literal]^if  ( o == null )  return true;^98^^^^^95^103^if  ( o == null )  return false;^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P8_Replace_Mix]^if  ( o == this )  return false;^98^^^^^95^103^if  ( o == null )  return false;^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P15_Unwrap_Block]^return false;^98^99^100^101^^95^103^if  ( o == null )  return false; if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P16_Remove_Block]^^98^99^100^101^^95^103^if  ( o == null )  return false; if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P2_Replace_Operator]^if  ( o.getClass (  )  <= getClass (  )  )  {^99^^^^^95^103^if  ( o.getClass (  )  != getClass (  )  )  {^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P15_Unwrap_Block]^return false;^99^100^101^^^95^103^if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P16_Remove_Block]^^99^100^101^^^95^103^if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P3_Replace_Literal]^return true;^100^^^^^95^103^return false;^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P2_Replace_Operator]^return  (  ( ShortNode )  o ) ._value != _value;^102^^^^^95^103^return  (  ( ShortNode )  o ) ._value == _value;^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P5_Replace_Variable]^return  (  ( ShortNode )  o ) ._value == v;^102^^^^^95^103^return  (  ( ShortNode )  o ) ._value == _value;^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P8_Replace_Mix]^return  (  ( ShortNode )  o ) .v  != v;;^102^^^^^95^103^return  (  ( ShortNode )  o ) ._value == _value;^[CLASS] ShortNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] short  _value  l  v  Object  o  boolean  
[P8_Replace_Mix]^return v;^107^^^^^106^108^return _value;^[CLASS] ShortNode  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] short  _value  l  v  boolean  