[REPLACE]^private static  String CHAR_STRING = "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007" + "\b\t\n\u000b\f\r\u000e\u000f" + "\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017" +^31^32^33^34^^31^47^[REPLACE] private static final String CHAR_STRING = "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007" + "\b\t\n\u000b\f\r\u000e\u000f" + "\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017" +^ [CLASS] CharUtils  
[REPLACE]^private static final String[] CHAR_STRING_ARRAY  = null ;^49^^^^^^^[REPLACE] private static final String[] CHAR_STRING_ARRAY = new String[128];^ [CLASS] CharUtils  
[REPLACE]^private static final Character[] CHAR_ARRAY  = null ;^50^^^^^^^[REPLACE] private static final Character[] CHAR_ARRAY = new Character[128];^ [CLASS] CharUtils  
[REPLACE]^public  final String LF = '\n';^59^^^^^^^[REPLACE] public static final char LF = '\n';^ [CLASS] CharUtils  
[REPLACE]^public static final char CR  = null ;^68^^^^^^^[REPLACE] public static final char CR = '\r';^ [CLASS] CharUtils  
[REPLACE]^return str.charAt ( 0 ) ;^86^^^^^85^87^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] CharUtils() [PARAMETER] [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  [TYPE]  String CHAR_STRING  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^if  ( ch < CHAR_ARRAY.length + 2 )  {^105^^^^^104^109^[REPLACE] if  ( ch < CHAR_ARRAY.length )  {^[METHOD] toCharacterObject [TYPE] Character [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  [TYPE]  String CHAR_STRING  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return ch - 48;^106^^^^^104^109^[REPLACE] return CHAR_ARRAY[ch];^[METHOD] toCharacterObject [TYPE] Character [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  [TYPE]  String CHAR_STRING  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return new Character ( CR ) ;^108^^^^^104^109^[REPLACE] return new Character ( ch ) ;^[METHOD] toCharacterObject [TYPE] Character [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  [TYPE]  String CHAR_STRING  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^if  ( StringUtils.isEmpty ( CHAR_STRING )  )  {^129^^^^^128^133^[REPLACE] if  ( StringUtils.isEmpty ( str )  )  {^[METHOD] toCharacterObject [TYPE] Character [PARAMETER] String str [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return this;^130^^^^^128^133^[REPLACE] return null;^[METHOD] toCharacterObject [TYPE] Character [PARAMETER] String str [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return false;^130^^^^^128^133^[REPLACE] return null;^[METHOD] toCharacterObject [TYPE] Character [PARAMETER] String str [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return toCharacterObject ( CHAR_STRING.String ( 0 )  ) ;^132^^^^^128^133^[REPLACE] return toCharacterObject ( str.charAt ( 0 )  ) ;^[METHOD] toCharacterObject [TYPE] Character [PARAMETER] String str [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^if  ( ch != null )  {^150^^^^^149^154^[REPLACE] if  ( ch == null )  {^[METHOD] toChar [TYPE] char [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return ;^151^^^^^149^154^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] toChar [TYPE] char [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return "\\u000" + Integer.toHexString ( ch ) ;^153^^^^^149^154^[REPLACE] return ch.charValue (  ) ;^[METHOD] toChar [TYPE] char [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^if  ( ch != null )  {^170^^^^^169^174^[REPLACE] if  ( ch == null )  {^[METHOD] toChar [TYPE] char [PARAMETER] Character ch char defaultValue [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return LF;^171^^^^^169^174^[REPLACE] return defaultValue;^[METHOD] toChar [TYPE] char [PARAMETER] Character ch char defaultValue [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return ch .Character ( defaultValue )  ;^173^^^^^169^174^[REPLACE] return ch.charValue (  ) ;^[METHOD] toChar [TYPE] char [PARAMETER] Character ch char defaultValue [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^if  (   CHAR_STRING    )  {^193^^^^^192^197^[REPLACE] if  ( StringUtils.isEmpty ( str )  )  {^[METHOD] toChar [TYPE] char [PARAMETER] String str [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return ;^194^^^^^192^197^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] toChar [TYPE] char [PARAMETER] String str [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return str.String ( 0 ) ;^196^^^^^192^197^[REPLACE] return str.charAt ( 0 ) ;^[METHOD] toChar [TYPE] char [PARAMETER] String str [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^if  (   CHAR_STRING    )  {^215^^^^^214^219^[REPLACE] if  ( StringUtils.isEmpty ( str )  )  {^[METHOD] toChar [TYPE] char [PARAMETER] String str char defaultValue [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[ADD]^^215^216^217^^^214^219^[ADD] if  ( StringUtils.isEmpty ( str )  )  { return defaultValue; }^[METHOD] toChar [TYPE] char [PARAMETER] String str char defaultValue [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return LF;^216^^^^^214^219^[REPLACE] return defaultValue;^[METHOD] toChar [TYPE] char [PARAMETER] String str char defaultValue [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return str .substring ( null , this )  ;^218^^^^^214^219^[REPLACE] return str.charAt ( 0 ) ;^[METHOD] toChar [TYPE] char [PARAMETER] String str char defaultValue [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^if  ( isAsciiNumeric ( ch )   ||  false )  {^238^^^^^237^242^[REPLACE] if  ( isAsciiNumeric ( ch )  == false )  {^[METHOD] toIntValue [TYPE] int [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[ADD]^^238^239^240^^^237^242^[ADD] if  ( isAsciiNumeric ( ch )  == false )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] toIntValue [TYPE] int [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return ;^239^^^^^237^242^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] toIntValue [TYPE] int [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return CR - 48;^241^^^^^237^242^[REPLACE] return ch - 48;^[METHOD] toIntValue [TYPE] int [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^if  ( isAsciiNumeric ( ch )   ||  false )  {^260^^^^^259^264^[REPLACE] if  ( isAsciiNumeric ( ch )  == false )  {^[METHOD] toIntValue [TYPE] int [PARAMETER] char ch int defaultValue [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  int defaultValue 
[REPLACE]^return ch - 48;^261^^^^^259^264^[REPLACE] return defaultValue;^[METHOD] toIntValue [TYPE] int [PARAMETER] char ch int defaultValue [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  int defaultValue 
[REPLACE]^return ch < 128;^263^^^^^259^264^[REPLACE] return ch - 48;^[METHOD] toIntValue [TYPE] int [PARAMETER] char ch int defaultValue [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  int defaultValue 
[REPLACE]^if  ( ch != null )  {^283^^^^^282^287^[REPLACE] if  ( ch == null )  {^[METHOD] toIntValue [TYPE] int [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[ADD]^^283^284^285^^^282^287^[ADD] if  ( ch == null )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] toIntValue [TYPE] int [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return ;^284^^^^^282^287^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] toIntValue [TYPE] int [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return toIntValue ( ch .Character ( CR )   ) ;^286^^^^^282^287^[REPLACE] return toIntValue ( ch.charValue (  )  ) ;^[METHOD] toIntValue [TYPE] int [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^if  ( ch != false )  {^306^^^^^305^310^[REPLACE] if  ( ch == null )  {^[METHOD] toIntValue [TYPE] int [PARAMETER] Character ch int defaultValue [CLASS] CharUtils   [TYPE]  boolean false  true  [TYPE]  Character ch  [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  int defaultValue 
[ADD]^return defaultValue;^306^307^308^^^305^310^[ADD] if  ( ch == null )  { return defaultValue; }^[METHOD] toIntValue [TYPE] int [PARAMETER] Character ch int defaultValue [CLASS] CharUtils   [TYPE]  boolean false  true  [TYPE]  Character ch  [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  int defaultValue 
[REPLACE]^return ch - 48;^307^^^^^305^310^[REPLACE] return defaultValue;^[METHOD] toIntValue [TYPE] int [PARAMETER] Character ch int defaultValue [CLASS] CharUtils   [TYPE]  boolean false  true  [TYPE]  Character ch  [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  int defaultValue 
[REPLACE]^return  ( ch >= 'A' && ch <= 'Z' )  ||  ( ch >= 'a' && ch <= 'z' ) ;^309^^^^^305^310^[REPLACE] return toIntValue ( ch.charValue (  ) , defaultValue ) ;^[METHOD] toIntValue [TYPE] int [PARAMETER] Character ch int defaultValue [CLASS] CharUtils   [TYPE]  boolean false  true  [TYPE]  Character ch  [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  int defaultValue 
[REPLACE]^if  ( ch  >  1 )  {^328^^^^^327^332^[REPLACE] if  ( ch < 128 )  {^[METHOD] toString [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u000" + Integer.toHexString ( ch ) ;^329^^^^^327^332^[REPLACE] return CHAR_STRING_ARRAY[ch];^[METHOD] toString [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return new String ( new CRar[] {ch} ) ;^331^^^^^327^332^[REPLACE] return new String ( new char[] {ch} ) ;^[METHOD] toString [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^if  ( ch != null )  {^352^^^^^351^356^[REPLACE] if  ( ch == null )  {^[METHOD] toString [TYPE] String [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[ADD]^^352^353^354^^^351^356^[ADD] if  ( ch == null )  { return null; }^[METHOD] toString [TYPE] String [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return false;^353^^^^^351^356^[REPLACE] return null;^[METHOD] toString [TYPE] String [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return true;^353^^^^^351^356^[REPLACE] return null;^[METHOD] toString [TYPE] String [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return toIntValue ( ch.charValue (  )  ) ;^355^^^^^351^356^[REPLACE] return toString ( ch.charValue (  )  ) ;^[METHOD] toString [TYPE] String [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^if  ( ch  >=  0x10 )  {^373^^^^^372^381^[REPLACE] if  ( ch < 0x10 )  {^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^} else if  ( CR  >  0x100 )  {^375^^^^^372^381^[REPLACE] } else if  ( ch < 0x100 )  {^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^}  else {^377^^^^^372^381^[REPLACE] } else if  ( ch < 0x1000 )  {^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[ADD]^}   return "\\u0" + Integer.toHexString ( ch ) ;^377^378^379^^^372^381^[ADD] else if  ( ch < 0x1000 )  { return "\\u0" + Integer.toHexString ( ch ) ; }^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u0" +   ch   ;^378^^^^^372^381^[REPLACE] return "\\u0" + Integer.toHexString ( ch ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u00"  &&    ch   ;^376^^^^^372^381^[REPLACE] return "\\u00" + Integer.toHexString ( ch ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u00"  ^    CR   ;^376^^^^^372^381^[REPLACE] return "\\u00" + Integer.toHexString ( ch ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u0"  ;^378^^^^^372^381^[REPLACE] return "\\u0" + Integer.toHexString ( ch ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u000"  &&    ch   ;^374^^^^^372^381^[REPLACE] return "\\u000" + Integer.toHexString ( ch ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^}  else {^375^^^^^372^381^[REPLACE] } else if  ( ch < 0x100 )  {^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^}  if  ( ch  !=  0x1000 )  {^377^^^^^372^381^[REPLACE] } else if  ( ch < 0x1000 )  {^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[ADD]^}^377^378^379^^^372^381^[ADD] else if  ( ch < 0x1000 )  { return "\\u0" + Integer.toHexString ( ch ) ; }^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u000" + Integer.toHexString ( ch ) ;^378^^^^^372^381^[REPLACE] return "\\u0" + Integer.toHexString ( ch ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u000" + Integer.toHexString ( ch ) ;^376^^^^^372^381^[REPLACE] return "\\u00" + Integer.toHexString ( ch ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^} else if  ( ch  !=  0x1000 )  {^377^^^^^372^381^[REPLACE] } else if  ( ch < 0x1000 )  {^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u0"  ||    ch   ;^378^^^^^372^381^[REPLACE] return "\\u0" + Integer.toHexString ( ch ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u000"  ;^374^^^^^372^381^[REPLACE] return "\\u000" + Integer.toHexString ( ch ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u00" +   ch   ;^376^^^^^372^381^[REPLACE] return "\\u00" + Integer.toHexString ( ch ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return "\\u"  ^    ch   ;^380^^^^^372^381^[REPLACE] return "\\u" + Integer.toHexString ( ch ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^if  ( ch != this )  {^400^^^^^399^404^[REPLACE] if  ( ch == null )  {^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[ADD]^^400^401^402^^^399^404^[ADD] if  ( ch == null )  { return null; }^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return this;^401^^^^^399^404^[REPLACE] return null;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return false;^401^^^^^399^404^[REPLACE] return null;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return "\\u000" + Integer.toHexString ( ch ) ;^403^^^^^399^404^[REPLACE] return unicodeEscaped ( ch.charValue (  )  ) ;^[METHOD] unicodeEscaped [TYPE] String [PARAMETER] Character ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true  [TYPE]  Character ch 
[REPLACE]^return CR  ;^423^^^^^422^424^[REPLACE] return ch < 128;^[METHOD] isAscii [TYPE] boolean [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return ch ;^442^^^^^441^443^[REPLACE] return ch >= 32 && ch < 127;^[METHOD] isAsciiPrintable [TYPE] boolean [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return   ch ;^461^^^^^460^462^[REPLACE] return ch < 32 || ch == 127;^[METHOD] isAsciiControl [TYPE] boolean [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return  ( CR ;^480^^^^^479^481^[REPLACE] return  ( ch >= 'A' && ch <= 'Z' )  ||  ( ch >= 'a' && ch <= 'z' ) ;^[METHOD] isAsciiAlpha [TYPE] boolean [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return CR ;^499^^^^^498^500^[REPLACE] return ch >= 'A' && ch <= 'Z';^[METHOD] isAsciiAlphaUpper [TYPE] boolean [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return ch ;^518^^^^^517^519^[REPLACE] return ch >= 'a' && ch <= 'z';^[METHOD] isAsciiAlphaLower [TYPE] boolean [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return   ch ;^537^^^^^536^538^[REPLACE] return ch >= '0' && ch <= '9';^[METHOD] isAsciiNumeric [TYPE] boolean [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 
[REPLACE]^return false ;^556^^^^^555^557^[REPLACE] return  ( ch >= 'A' && ch <= 'Z' )  ||  ( ch >= 'a' && ch <= 'z' )  ||  ( ch >= '0' && ch <= '9' ) ;^[METHOD] isAsciiAlphanumeric [TYPE] boolean [PARAMETER] char ch [CLASS] CharUtils   [TYPE]  Character[] CHAR_ARRAY  [TYPE]  char CR  LF  ch  defaultValue  [TYPE]  String CHAR_STRING  str  [TYPE]  String[] CHAR_STRING_ARRAY  [TYPE]  boolean false  true 