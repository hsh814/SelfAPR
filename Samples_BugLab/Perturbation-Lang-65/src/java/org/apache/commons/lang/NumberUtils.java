[buglab_swap_variables]^mant = expPos.substring ( 0, val ) ;^175^^^^^162^180^mant = val.substring ( 0, expPos ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^mant = val.substring ( 0 ) ;^175^^^^^162^180^mant = val.substring ( 0, expPos ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^dec = decPos.substring ( val + 1 ) ;^170^^^^^164^171^dec = val.substring ( decPos + 1 ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^if  ( decPos < expPos )  {^165^^^^^150^180^if  ( expPos < decPos )  {^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^dec = decPos.substring ( val + 1, expPos ) ;^168^^^^^153^183^dec = val.substring ( decPos + 1, expPos ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^dec = val.substring ( expPos + 1, decPos ) ;^168^^^^^153^183^dec = val.substring ( decPos + 1, expPos ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^dec = val.substring ( decPos + 1 ) ;^168^^^^^153^183^dec = val.substring ( decPos + 1, expPos ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^dec = expPos.substring ( decPos + 1, val ) ;^168^^^^^153^183^dec = val.substring ( decPos + 1, expPos ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^dec = decPos.substring ( val + 1 ) ;^170^^^^^155^185^dec = val.substring ( decPos + 1 ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^mant = decPos.substring ( 0, val ) ;^172^^^^^157^187^mant = val.substring ( 0, decPos ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^mant = val.substring ( 0 ) ;^172^^^^^157^187^mant = val.substring ( 0, decPos ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^mant = expPos.substring ( 0, val ) ;^175^^^^^160^190^mant = val.substring ( 0, expPos ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^mant = val.substring ( 0 ) ;^175^^^^^160^190^mant = val.substring ( 0, expPos ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^if  ( val > -1 && expPos < expPos.length (  )  - 1 )  {^243^^^^^228^258^if  ( expPos > -1 && expPos < val.length (  )  - 1 )  {^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^exp = expPos.substring ( val + 1, val.length (  )  ) ;^244^^^^^229^259^exp = val.substring ( expPos + 1, val.length (  )  ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^exp = val.substring ( expPos + 1.length (  )  ) ;^244^^^^^229^259^exp = val.substring ( expPos + 1, val.length (  )  ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^if  ( exp == null && dec == null )  {^248^^^^^233^263^if  ( dec == null && exp == null )  {^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^if  ( expec == null && d == null )  {^248^^^^^233^263^if  ( dec == null && exp == null )  {^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^boolean allZeros = isAllZeros ( exp )  && isAllZeros ( mant ) ;^264^^^^^249^279^boolean allZeros = isAllZeros ( mant )  && isAllZeros ( exp ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^if  ( val > -1 && expPos < expPos.length (  )  - 1 )  {^182^^^^^167^197^if  ( expPos > -1 && expPos < val.length (  )  - 1 )  {^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^exp = expPos.substring ( val + 1, val.length (  )  - 1 ) ;^183^^^^^168^198^exp = val.substring ( expPos + 1, val.length (  )  - 1 ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^exp = val.substring ( expPos + 1.length (  )  - 1 ) ;^183^^^^^168^198^exp = val.substring ( expPos + 1, val.length (  )  - 1 ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^if  ( exp == null && dec == null && isDigits ( numeric.substring ( 1 )  ) &&  ( numeric.charAt ( 0 )  == '-' || Character.isDigit ( numeric.charAt ( 0 )  )  )  )  {^193^194^195^196^^178^208^if  ( dec == null && exp == null && isDigits ( numeric.substring ( 1 )  ) &&  ( numeric.charAt ( 0 )  == '-' || Character.isDigit ( numeric.charAt ( 0 )  )  )  )  {^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^if  ( numeric == null && exp == null && isDigits ( dec.substring ( 1 )  ) &&  ( numeric.charAt ( 0 )  == '-' || Character.isDigit ( numeric.charAt ( 0 )  )  )  )  {^193^194^195^196^^178^208^if  ( dec == null && exp == null && isDigits ( numeric.substring ( 1 )  ) &&  ( numeric.charAt ( 0 )  == '-' || Character.isDigit ( numeric.charAt ( 0 )  )  )  )  {^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^boolean allZeros = isAllZeros ( exp )  && isAllZeros ( mant ) ;^189^^^^^174^204^boolean allZeros = isAllZeros ( mant )  && isAllZeros ( exp ) ;^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^if  ( dec == null && numeric == null && isDigits ( exp.substring ( 1 )  ) &&  ( numeric.charAt ( 0 )  == '-' || Character.isDigit ( numeric.charAt ( 0 )  )  )  )  {^193^194^195^196^^178^208^if  ( dec == null && exp == null && isDigits ( numeric.substring ( 1 )  ) &&  ( numeric.charAt ( 0 )  == '-' || Character.isDigit ( numeric.charAt ( 0 )  )  )  )  {^[CLASS] NumberUtils  [METHOD] createNumber [RETURN_TYPE] Number   String val [VARIABLES] Float  f  boolean  allZeros  char  lastChar  NumberFormatException  e  nfe  String  dec  exp  mant  numeric  val  Double  d  int  decPos  expPos  
[buglab_swap_variables]^if  ( i.charAt ( s )  != '0' )  {^302^^^^^297^307^if  ( s.charAt ( i )  != '0' )  {^[CLASS] NumberUtils  [METHOD] isAllZeros [RETURN_TYPE] boolean   String s [VARIABLES] boolean  String  s  int  i  
[buglab_swap_variables]^for  ( snt i = i.length (  )  - 1; i >= 0; i-- )  {^301^^^^^297^307^for  ( int i = s.length (  )  - 1; i >= 0; i-- )  {^[CLASS] NumberUtils  [METHOD] isAllZeros [RETURN_TYPE] boolean   String s [VARIABLES] boolean  String  s  int  i  
[buglab_swap_variables]^if  ( a < b )  {^392^^^^^391^399^if  ( b < a )  {^[CLASS] NumberUtils  [METHOD] minimum [RETURN_TYPE] long   long a long b long c [VARIABLES] boolean  long  a  b  c  
[buglab_swap_variables]^if  ( a < c )  {^395^^^^^391^399^if  ( c < a )  {^[CLASS] NumberUtils  [METHOD] minimum [RETURN_TYPE] long   long a long b long c [VARIABLES] boolean  long  a  b  c  
[buglab_swap_variables]^if  ( a < b )  {^410^^^^^409^417^if  ( b < a )  {^[CLASS] NumberUtils  [METHOD] minimum [RETURN_TYPE] int   int a int b int c [VARIABLES] boolean  int  a  b  c  
[buglab_swap_variables]^if  ( a < c )  {^413^^^^^409^417^if  ( c < a )  {^[CLASS] NumberUtils  [METHOD] minimum [RETURN_TYPE] int   int a int b int c [VARIABLES] boolean  int  a  b  c  
[buglab_swap_variables]^if  ( a > b )  {^428^^^^^427^435^if  ( b > a )  {^[CLASS] NumberUtils  [METHOD] maximum [RETURN_TYPE] long   long a long b long c [VARIABLES] boolean  long  a  b  c  
[buglab_swap_variables]^if  ( a > c )  {^431^^^^^427^435^if  ( c > a )  {^[CLASS] NumberUtils  [METHOD] maximum [RETURN_TYPE] long   long a long b long c [VARIABLES] boolean  long  a  b  c  
[buglab_swap_variables]^if  ( a > b )  {^446^^^^^445^453^if  ( b > a )  {^[CLASS] NumberUtils  [METHOD] maximum [RETURN_TYPE] int   int a int b int c [VARIABLES] boolean  int  a  b  c  
[buglab_swap_variables]^if  ( a > c )  {^449^^^^^445^453^if  ( c > a )  {^[CLASS] NumberUtils  [METHOD] maximum [RETURN_TYPE] int   int a int b int c [VARIABLES] boolean  int  a  b  c  
[buglab_swap_variables]^if  ( rhs < lhs )  {^492^^^^^491^518^if  ( lhs < rhs )  {^[CLASS] NumberUtils  [METHOD] compare [RETURN_TYPE] int   double lhs double rhs [VARIABLES] boolean  double  lhs  rhs  long  lhsBits  rhsBits  
[buglab_swap_variables]^if  ( rhs > lhs )  {^495^^^^^491^518^if  ( lhs > rhs )  {^[CLASS] NumberUtils  [METHOD] compare [RETURN_TYPE] int   double lhs double rhs [VARIABLES] boolean  double  lhs  rhs  long  lhsBits  rhsBits  
[buglab_swap_variables]^if  ( rhsBits == lhsBits )  {^504^^^^^491^518^if  ( lhsBits == rhsBits )  {^[CLASS] NumberUtils  [METHOD] compare [RETURN_TYPE] int   double lhs double rhs [VARIABLES] boolean  double  lhs  rhs  long  lhsBits  rhsBits  
[buglab_swap_variables]^if  ( rhsBits < lhsBits )  {^513^^^^^491^518^if  ( lhsBits < rhsBits )  {^[CLASS] NumberUtils  [METHOD] compare [RETURN_TYPE] int   double lhs double rhs [VARIABLES] boolean  double  lhs  rhs  long  lhsBits  rhsBits  
[buglab_swap_variables]^if  ( rhs < lhs )  {^553^^^^^552^579^if  ( lhs < rhs )  {^[CLASS] NumberUtils  [METHOD] compare [RETURN_TYPE] int   float lhs float rhs [VARIABLES] boolean  float  lhs  rhs  int  lhsBits  rhsBits  
[buglab_swap_variables]^if  ( rhs > lhs )  {^556^^^^^552^579^if  ( lhs > rhs )  {^[CLASS] NumberUtils  [METHOD] compare [RETURN_TYPE] int   float lhs float rhs [VARIABLES] boolean  float  lhs  rhs  int  lhsBits  rhsBits  
[buglab_swap_variables]^if  ( rhsBits == lhsBits )  {^565^^^^^552^579^if  ( lhsBits == rhsBits )  {^[CLASS] NumberUtils  [METHOD] compare [RETURN_TYPE] int   float lhs float rhs [VARIABLES] boolean  float  lhs  rhs  int  lhsBits  rhsBits  
[buglab_swap_variables]^if  ( rhsBits < lhsBits )  {^574^^^^^552^579^if  ( lhsBits < rhsBits )  {^[CLASS] NumberUtils  [METHOD] compare [RETURN_TYPE] int   float lhs float rhs [VARIABLES] boolean  float  lhs  rhs  int  lhsBits  rhsBits  
[buglab_swap_variables]^if  ( !Character.isDigit ( i.charAt ( str )  )  )  {^598^^^^^593^603^if  ( !Character.isDigit ( str.charAt ( i )  )  )  {^[CLASS] NumberUtils  [METHOD] isDigits [RETURN_TYPE] boolean   String str [VARIABLES] boolean  String  str  int  i  
[buglab_swap_variables]^for  ( strnt i = 0; i < i.length (  ) ; i++ )  {^597^^^^^593^603^for  ( int i = 0; i < str.length (  ) ; i++ )  {^[CLASS] NumberUtils  [METHOD] isDigits [RETURN_TYPE] boolean   String str [VARIABLES] boolean  String  str  int  i  
[buglab_swap_variables]^int sz = chars.length.length;^623^^^^^608^638^int sz = chars.length;^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^int sz = chars;^623^^^^^608^638^int sz = chars.length;^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^if  ( start > sz + 1 )  {^630^^^^^615^645^if  ( sz > start + 1 )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^if  ( sz == i )  {^633^^^^^618^648^if  ( i == sz )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^for  ( ; chars.length < i; i++ )  {^637^^^^^622^652^for  ( ; i < chars.length; i++ )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^for  ( ; chars < i.length; i++ )  {^637^^^^^622^652^for  ( ; i < chars.length; i++ )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^for  ( ; i < chars.length.length; i++ )  {^637^^^^^622^652^for  ( ; i < chars.length; i++ )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^while  ( sz < i ||  ( i < sz + 1 && allowSigns && !foundDigit )  )  {^652^^^^^637^667^while  ( i < sz ||  ( i < sz + 1 && allowSigns && !foundDigit )  )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^while  ( allowSigns < sz ||  ( i < sz + 1 && i && !foundDigit )  )  {^652^^^^^637^667^while  ( i < sz ||  ( i < sz + 1 && allowSigns && !foundDigit )  )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^} else charsf  ( i[i] == 'e' || chars[i] == 'E' )  {^663^^^^^648^678^} else if  ( chars[i] == 'e' || chars[i] == 'E' )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^if  ( hasExp || hasDecPoint )  {^658^^^^^643^673^if  ( hasDecPoint || hasExp )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^} else charsf  ( i[i] == '.' )  {^657^^^^^642^672^} else if  ( chars[i] == '.' )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^} else charsf  ( i[i] == '+' || chars[i] == '-' )  {^674^^^^^659^689^} else if  ( chars[i] == '+' || chars[i] == '-' )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^if  ( chars < i.length )  {^685^^^^^670^700^if  ( i < chars.length )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  
[buglab_swap_variables]^if  ( chars.length < i )  {^685^^^^^670^700^if  ( i < chars.length )  {^[CLASS] NumberUtils  [METHOD] isNumber [RETURN_TYPE] boolean   String str [VARIABLES] boolean  allowSigns  foundDigit  hasDecPoint  hasExp  String  str  int  i  start  sz  char[]  chars  