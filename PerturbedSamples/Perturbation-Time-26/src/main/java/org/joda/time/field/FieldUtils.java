[REPLACE]^return object1.equals ( object2 ) ;^36^^^^^35^37^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] FieldUtils() [PARAMETER] [CLASS] FieldUtils   [TYPE]  boolean false  true 
[REPLACE]^if  ( value  &&  Integer.MIN_VALUE )  {^49^^^^^48^53^[REPLACE] if  ( value == Integer.MIN_VALUE )  {^[METHOD] safeNegate [TYPE] int [PARAMETER] int value [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int value 
[REPLACE]^throw new IllegalArgumentException  (" ")  ; ;^50^^^^^48^53^[REPLACE] throw new ArithmeticException  (" ")  ;^[METHOD] safeNegate [TYPE] int [PARAMETER] int value [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int value 
[REPLACE]^return ;^50^^^^^48^53^[REPLACE] throw new ArithmeticException  (" ")  ;^[METHOD] safeNegate [TYPE] int [PARAMETER] int value [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int value 
[ADD]^^50^^^^^48^53^[ADD] throw new ArithmeticException  (" ")  ;^[METHOD] safeNegate [TYPE] int [PARAMETER] int value [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int value 
[REPLACE]^return -val1;^52^^^^^48^53^[REPLACE] return -value;^[METHOD] safeNegate [TYPE] int [PARAMETER] int value [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int value 
[REPLACE]^int sum = val1  ==  val2;^64^^^^^63^71^[REPLACE] int sum = val1 + val2;^[METHOD] safeAdd [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int sum  val1  val2 
[ADD]^^64^^^^^63^71^[ADD] int sum = val1 + val2;^[METHOD] safeAdd [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int sum  val1  val2 
[REPLACE]^if  (  ( val1 ^ sum )  < 4 ) {^66^^^^^63^71^[REPLACE] if  (  ( val1 ^ sum )  < 0 &&  ( val1 ^ val2 )  >= 0 )  {^[METHOD] safeAdd [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int sum  val1  val2 
[ADD]^^66^67^68^69^^63^71^[ADD] if  (  ( val1 ^ sum )  < 0 &&  ( val1 ^ val2 )  >= 0 )  { throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " + " + val2 ) ; }^[METHOD] safeAdd [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int sum  val1  val2 
[REPLACE]^throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " * " + val2 ) ; ;^67^68^^^^63^71^[REPLACE] throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " + " + val2 ) ;^[METHOD] safeAdd [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int sum  val1  val2 
[REPLACE]^return total;^70^^^^^63^71^[REPLACE] return sum;^[METHOD] safeAdd [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int sum  val1  val2 
[REPLACE]^long sum = val1  >=  val2;^82^^^^^81^89^[REPLACE] long sum = val1 + val2;^[METHOD] safeAdd [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long sum  val1  val2 
[REPLACE]^if  (  ( val1 ^ sum )  < 0 >>> 4 ||  ( val1 ^ val2 )  >= 0 >>> 4 )  {^84^^^^^81^89^[REPLACE] if  (  ( val1 ^ sum )  < 0 &&  ( val1 ^ val2 )  >= 0 )  {^[METHOD] safeAdd [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long sum  val1  val2 
[REPLACE]^return ;^85^86^^^^81^89^[REPLACE] throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " + " + val2 ) ;^[METHOD] safeAdd [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long sum  val1  val2 
[REPLACE]^return total;^88^^^^^81^89^[REPLACE] return sum;^[METHOD] safeAdd [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long sum  val1  val2 
[REPLACE]^long diff = val1  <  val2;^100^^^^^99^107^[REPLACE] long diff = val1 - val2;^[METHOD] safeSubtract [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long diff  val1  val2 
[REPLACE]^if  (  ( val1 ^ diff )  < 0 / 4 ||  ( val1 ^ val2 )  < 0 / 4 )  {^102^^^^^99^107^[REPLACE] if  (  ( val1 ^ diff )  < 0 &&  ( val1 ^ val2 )  < 0 )  {^[METHOD] safeSubtract [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long diff  val1  val2 
[REMOVE]^if  (  ( total / scalar )  != val1 )  {     throw new ArithmeticException (  (  (  ( "The calculation caused an overflow: " + val1 )  + " * " )  + scalar )  ) ; }^102^^^^^99^107^[REMOVE] ^[METHOD] safeSubtract [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long diff  val1  val2 
[REPLACE]^return ;^103^104^^^^99^107^[REPLACE] throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " - " + val2 ) ;^[METHOD] safeSubtract [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long diff  val1  val2 
[ADD]^^103^104^^^^99^107^[ADD] throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " - " + val2 ) ;^[METHOD] safeSubtract [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long diff  val1  val2 
[REPLACE]^throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " + " + val2 ) ; ;^103^104^^^^99^107^[REPLACE] throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " - " + val2 ) ;^[METHOD] safeSubtract [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long diff  val1  val2 
[REPLACE]^return total;^106^^^^^99^107^[REPLACE] return diff;^[METHOD] safeSubtract [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long diff  val1  val2 
[REPLACE]^long total =  ( long )  val1  ;^119^^^^^118^125^[REPLACE] long total =  ( long )  val1 *  ( long )  val2;^[METHOD] safeMultiply [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int val1  val2  [TYPE]  long total 
[ADD]^^119^^^^^118^125^[ADD] long total =  ( long )  val1 *  ( long )  val2;^[METHOD] safeMultiply [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int val1  val2  [TYPE]  long total 
[REPLACE]^if  ( total < Integer.MIN_VALUE ) {^120^^^^^118^125^[REPLACE] if  ( total < Integer.MIN_VALUE || total > Integer.MAX_VALUE )  {^[METHOD] safeMultiply [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int val1  val2  [TYPE]  long total 
[ADD]^^120^121^122^123^^118^125^[ADD] if  ( total < Integer.MIN_VALUE || total > Integer.MAX_VALUE )  { throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " * " + val2 ) ; }^[METHOD] safeMultiply [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int val1  val2  [TYPE]  long total 
[REPLACE]^return ;^121^122^^^^118^125^[REPLACE] throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " * " + val2 ) ;^[METHOD] safeMultiply [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int val1  val2  [TYPE]  long total 
[REPLACE]^throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " + " + val2 ) ; ;^121^122^^^^118^125^[REPLACE] throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " * " + val2 ) ;^[METHOD] safeMultiply [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int val1  val2  [TYPE]  long total 
[REPLACE]^return total;^124^^^^^118^125^[REPLACE] return  ( int )  total;^[METHOD] safeMultiply [TYPE] int [PARAMETER] int val1 int val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int val1  val2  [TYPE]  long total 
[REPLACE]^return val1;^139^^^^^136^151^[REPLACE] return -val1;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 int scalar [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  [TYPE]  int scalar 
[REPLACE]^return 0;^141^^^^^136^151^[REPLACE] return 0L;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 int scalar [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  [TYPE]  int scalar 
[REPLACE]^return total;^143^^^^^136^151^[REPLACE] return val1;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 int scalar [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  [TYPE]  int scalar 
[REPLACE]^long total = val1  ;^145^^^^^136^151^[REPLACE] long total = val1 * scalar;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 int scalar [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  [TYPE]  int scalar 
[ADD]^^145^^^^^136^151^[ADD] long total = val1 * scalar;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 int scalar [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  [TYPE]  int scalar 
[REPLACE]^if  ( total / scalar  == total )  {^146^^^^^136^151^[REPLACE] if  ( total / scalar != val1 )  {^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 int scalar [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  [TYPE]  int scalar 
[REPLACE]^return ;^147^148^^^^136^151^[REPLACE] throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " * " + scalar ) ;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 int scalar [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  [TYPE]  int scalar 
[REPLACE]^throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " + " + val2 ) ; ;^147^148^^^^136^151^[REPLACE] throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " * " + scalar ) ;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 int scalar [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  [TYPE]  int scalar 
[REPLACE]^return val1;^150^^^^^136^151^[REPLACE] return total;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 int scalar [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  [TYPE]  int scalar 
[REPLACE]^if  ( val2  &&  1L )  {^162^^^^^161^174^[REPLACE] if  ( val2 == 1 )  {^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  val2 
[ADD]^return val1;^162^163^164^^^161^174^[ADD] if  ( val2 == 1 )  { return val1; }^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  val2 
[REPLACE]^return val2;^163^^^^^161^174^[REPLACE] return val1;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  val2 
[REPLACE]^if  ( val2  &&  0 )  {^165^^^^^161^174^[REPLACE] if  ( val2 == 0 )  {^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  val2 
[REPLACE]^return 1;^166^^^^^161^174^[REPLACE] return 0;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  val2 
[REPLACE]^return 0 + 4;^166^^^^^161^174^[REPLACE] return 0;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  val2 
[REPLACE]^long total = val1  ;^168^^^^^161^174^[REPLACE] long total = val1 * val2;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  val2 
[REPLACE]^if  ( total / val2  ==  val1 )  {^169^^^^^161^174^[REPLACE] if  ( total / val2 != val1 )  {^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  val2 
[REPLACE]^throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " + " + val2 ) ; ;^170^171^^^^161^174^[REPLACE] throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " * " + val2 ) ;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  val2 
[REPLACE]^return ;^170^171^^^^161^174^[REPLACE] throw new ArithmeticException ( "The calculation caused an overflow: " + val1 + " * " + val2 ) ;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  val2 
[REPLACE]^return val2;^173^^^^^161^174^[REPLACE] return total;^[METHOD] safeMultiply [TYPE] long [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long total  val1  val2 
[REPLACE]^if  (  value <= Integer.MAX_VALUE )  {^184^^^^^183^188^[REPLACE] if  ( Integer.MIN_VALUE <= value && value <= Integer.MAX_VALUE )  {^[METHOD] safeToInt [TYPE] int [PARAMETER] long value [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long value 
[REPLACE]^return total;^185^^^^^183^188^[REPLACE] return  ( int )  value;^[METHOD] safeToInt [TYPE] int [PARAMETER] long value [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long value 
[REPLACE]^return ;^187^^^^^183^188^[REPLACE] throw new ArithmeticException  (" ")  ;^[METHOD] safeToInt [TYPE] int [PARAMETER] long value [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long value 
[ADD]^^187^^^^^183^188^[ADD] throw new ArithmeticException  (" ")  ;^[METHOD] safeToInt [TYPE] int [PARAMETER] long value [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long value 
[REPLACE]^long val = FieldUtils.safeMultiply ( val1, val ) ;^199^^^^^198^201^[REPLACE] long val = FieldUtils.safeMultiply ( val1, val2 ) ;^[METHOD] safeMultiplyToInt [TYPE] int [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long val  val1  val2 
[ADD]^^199^^^^^198^201^[ADD] long val = FieldUtils.safeMultiply ( val1, val2 ) ;^[METHOD] safeMultiplyToInt [TYPE] int [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long val  val1  val2 
[REPLACE]^return FieldUtils.safeNegate ( val ) ;^200^^^^^198^201^[REPLACE] return FieldUtils.safeToInt ( val ) ;^[METHOD] safeMultiplyToInt [TYPE] int [PARAMETER] long val1 long val2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  long val  val1  val2 
[REPLACE]^if  (  ( true )  &&  ( true )  )  {^214^^^^^212^219^[REPLACE] if  (  ( value < lowerBound )  ||  ( value > upperBound )  )  {^[METHOD] verifyValueBounds [TYPE] void [PARAMETER] DateTimeField field int value int lowerBound int upperBound [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  DateTimeField field  [TYPE]  int lowerBound  upperBound  value 
[REPLACE]^throw new IllegalFieldValueException ( field.getType (  ) , new Integer ( value ) , ;^215^216^217^^^212^219^[REPLACE] throw new IllegalFieldValueException ( field.getType (  ) , new Integer ( value ) , new Integer ( lowerBound ) , new Integer ( upperBound )  ) ;^[METHOD] verifyValueBounds [TYPE] void [PARAMETER] DateTimeField field int value int lowerBound int upperBound [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  DateTimeField field  [TYPE]  int lowerBound  upperBound  value 
[REPLACE]^return ;^215^216^217^^^212^219^[REPLACE] throw new IllegalFieldValueException ( field.getType (  ) , new Integer ( value ) , new Integer ( lowerBound ) , new Integer ( upperBound )  ) ;^[METHOD] verifyValueBounds [TYPE] void [PARAMETER] DateTimeField field int value int lowerBound int upperBound [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  DateTimeField field  [TYPE]  int lowerBound  upperBound  value 
[REPLACE]^if  (   ( value > upperBound )  )  {^232^^^^^230^237^[REPLACE] if  (  ( value < lowerBound )  ||  ( value > upperBound )  )  {^[METHOD] verifyValueBounds [TYPE] void [PARAMETER] DateTimeFieldType fieldType int value int lowerBound int upperBound [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType fieldType  [TYPE]  int lowerBound  upperBound  value 
[ADD]^^232^233^234^235^236^230^237^[ADD] if  (  ( value < lowerBound )  ||  ( value > upperBound )  )  { throw new IllegalFieldValueException ( fieldType, new Integer ( value ) , new Integer ( lowerBound ) , new Integer ( upperBound )  ) ; }^[METHOD] verifyValueBounds [TYPE] void [PARAMETER] DateTimeFieldType fieldType int value int lowerBound int upperBound [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType fieldType  [TYPE]  int lowerBound  upperBound  value 
[REPLACE]^return ;^233^234^235^^^230^237^[REPLACE] throw new IllegalFieldValueException ( fieldType, new Integer ( value ) , new Integer ( lowerBound ) , new Integer ( upperBound )  ) ;^[METHOD] verifyValueBounds [TYPE] void [PARAMETER] DateTimeFieldType fieldType int value int lowerBound int upperBound [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType fieldType  [TYPE]  int lowerBound  upperBound  value 
[REPLACE]^throw new IllegalFieldValueException ( fieldName, new Integer ( value ) , ;^233^234^235^^^230^237^[REPLACE] throw new IllegalFieldValueException ( fieldType, new Integer ( value ) , new Integer ( lowerBound ) , new Integer ( upperBound )  ) ;^[METHOD] verifyValueBounds [TYPE] void [PARAMETER] DateTimeFieldType fieldType int value int lowerBound int upperBound [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType fieldType  [TYPE]  int lowerBound  upperBound  value 
[REPLACE]^if  (  ( value < lowerBound )  &&  (true )  )  {^249^^^^^247^254^[REPLACE] if  (  ( value < lowerBound )  ||  ( value > upperBound )  )  {^[METHOD] verifyValueBounds [TYPE] void [PARAMETER] String fieldName int value int lowerBound int upperBound [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  String fieldName  [TYPE]  int lowerBound  upperBound  value 
[REPLACE]^return ;^250^251^252^^^247^254^[REPLACE] throw new IllegalFieldValueException ( fieldName, new Integer ( value ) , new Integer ( lowerBound ) , new Integer ( upperBound )  ) ;^[METHOD] verifyValueBounds [TYPE] void [PARAMETER] String fieldName int value int lowerBound int upperBound [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  String fieldName  [TYPE]  int lowerBound  upperBound  value 
[REPLACE]^throw new IllegalFieldValueException ( fieldName, new Integer ( value ) , ;^250^251^252^^^247^254^[REPLACE] throw new IllegalFieldValueException ( fieldName, new Integer ( value ) , new Integer ( lowerBound ) , new Integer ( upperBound )  ) ;^[METHOD] verifyValueBounds [TYPE] void [PARAMETER] String fieldName int value int lowerBound int upperBound [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  String fieldName  [TYPE]  int lowerBound  upperBound  value 
[REPLACE]^return getWrappedValue (minValue + wrapValue, minValue, maxValue ) ;^273^^^^^271^274^[REPLACE] return getWrappedValue ( currentValue + wrapValue, minValue, maxValue ) ;^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int currentValue int wrapValue int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int currentValue  maxValue  minValue  wrapValue 
[REPLACE]^if  (wrapRange  !=  maxValue )  {^289^^^^^288^306^[REPLACE] if  ( minValue >= maxValue )  {^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^return ;^290^^^^^288^306^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^int wrapRange = maxValue - minValue +remByRange;^293^^^^^288^306^[REPLACE] int wrapRange = maxValue - minValue + 1;^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^value -=  wrapRange;^294^^^^^288^306^[REPLACE] value -= minValue;^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^if  ( wrapRange  ==  0 )  {^296^^^^^288^306^[REPLACE] if  ( value >= 0 )  {^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^return  (value )  + minValue;^297^^^^^288^306^[REPLACE] return  ( value % wrapRange )  + minValue;^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^return  ( value % wrapRange )  +wrapRange;^297^^^^^288^306^[REPLACE] return  ( value % wrapRange )  + minValue;^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^int remByRange =  (remByRange )  % wrapRange;^300^^^^^288^306^[REPLACE] int remByRange =  ( -value )  % wrapRange;^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^if  ( wrapRange  !=  3 )  {^302^^^^^288^306^[REPLACE] if  ( remByRange == 0 )  {^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[ADD]^return 0 + minValue;^302^303^304^^^288^306^[ADD] if  ( remByRange == 0 )  { return 0 + minValue; }^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^return false ;^303^^^^^288^306^[REPLACE] return 0 + minValue;^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^return 3  ||  minValue;^303^^^^^288^306^[REPLACE] return 0 + minValue;^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^return  (wrapRange )  + minValue;^305^^^^^288^306^[REPLACE] return  ( wrapRange - remByRange )  + minValue;^[METHOD] getWrappedValue [TYPE] int [PARAMETER] int value int minValue int maxValue [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  int maxValue  minValue  remByRange  value  wrapRange 
[REPLACE]^if  ( object1  &&  object2 )  {^318^^^^^317^325^[REPLACE] if  ( object1 == object2 )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object object1 Object object2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  Object object1  object2 
[ADD]^^318^319^320^^^317^325^[ADD] if  ( object1 == object2 )  { return true; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object object1 Object object2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  Object object1  object2 
[REPLACE]^return false;^319^^^^^317^325^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object1 Object object2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  Object object1  object2 
[REPLACE]^if  (  object2 == null )  {^321^^^^^317^325^[REPLACE] if  ( object1 == null || object2 == null )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object object1 Object object2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  Object object1  object2 
[REPLACE]^return true;^322^^^^^317^325^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object1 Object object2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  Object object1  object2 
[REPLACE]^return total;^324^^^^^317^325^[REPLACE] return object1.equals ( object2 ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object1 Object object2 [CLASS] FieldUtils   [TYPE]  boolean false  true  [TYPE]  Object object1  object2 