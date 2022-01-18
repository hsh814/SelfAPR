[REPLACE]^static final char[] FIRST_CHAR ;^35^36^^^^35^36^[REPLACE] static final char[] FIRST_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ$".toCharArray (  ) ;^ [CLASS] NameGenerator  
[REPLACE]^static final char[] NONFIRST_CHAR ;^39^40^41^^^39^41^[REPLACE] static final char[] NONFIRST_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789$" .toCharArray (  ) ;^ [CLASS] NameGenerator  
[REPLACE]^private  Set<String> reservedNames;^43^^^^^^^[REPLACE] private final Set<String> reservedNames;^ [CLASS] NameGenerator  
[REPLACE]^private final  char  prefix;^44^^^^^^^[REPLACE] private final String prefix;^ [CLASS] NameGenerator  
[REPLACE]^private  long  nameCount;^45^^^^^^^[REPLACE] private int nameCount;^ [CLASS] NameGenerator  
[REPLACE]^private  char[] nonFirstChars;^48^^^^^^^[REPLACE] private final char[] nonFirstChars;^ [CLASS] NameGenerator  
[REPLACE]^this.reservedNames =  this;^62^^^^^60^70^[REPLACE] this.reservedNames = reservedNames;^[METHOD] <init> [TYPE] String,char[]) [PARAMETER] String> reservedNames String prefix Nullable
char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  Set reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^this.prefix =  null;^63^^^^^60^70^[REPLACE] this.prefix = prefix;^[METHOD] <init> [TYPE] String,char[]) [PARAMETER] String> reservedNames String prefix Nullable
char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  Set reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^this.nonFirstChars = reserveCharacters ( NONFIRST_CHAR, reservedCharacters ) ; ;^66^^^^^60^70^[REPLACE] this.firstChars = reserveCharacters ( FIRST_CHAR, reservedCharacters ) ;^[METHOD] <init> [TYPE] String,char[]) [PARAMETER] String> reservedNames String prefix Nullable
char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  Set reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^this.firstChars = reserveCharacters ( FIRST_CHAR, reservedCharacters ) ; ;^67^^^^^60^70^[REPLACE] this.nonFirstChars = reserveCharacters ( NONFIRST_CHAR, reservedCharacters ) ;^[METHOD] <init> [TYPE] String,char[]) [PARAMETER] String> reservedNames String prefix Nullable
char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  Set reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^this.nonFirstChars = reserveCharacters ( NONFIRST_CHAR, reservedCharacters ) ;^69^^^^^60^70^[REPLACE] checkPrefix ( prefix ) ;^[METHOD] <init> [TYPE] String,char[]) [PARAMETER] String> reservedNames String prefix Nullable
char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  Set reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^if  ( reservedCharacters == true || reservedCharacters.length (  )  == 0 )  {^80^^^^^79^88^[REPLACE] if  ( reservedCharacters == null || reservedCharacters.length == 0 )  {^[METHOD] reserveCharacters [TYPE] char[] [PARAMETER] char[] chars char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  char reservedCharacter  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^return chars;^80^81^82^^^79^88^[ADD] if  ( reservedCharacters == null || reservedCharacters.length == 0 )  { return chars; }^[METHOD] reserveCharacters [TYPE] char[] [PARAMETER] char[] chars char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  char reservedCharacter  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^return nonFirstChars;^81^^^^^79^88^[REPLACE] return chars;^[METHOD] reserveCharacters [TYPE] char[] [PARAMETER] char[] chars char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  char reservedCharacter  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^return reservedCharacters;^81^^^^^79^88^[REPLACE] return chars;^[METHOD] reserveCharacters [TYPE] char[] [PARAMETER] char[] chars char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  char reservedCharacter  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^Set<Character> charSet = Sets.newLinkedHashSet ( Chars.asList ( reservedCharacters )  ) ;^83^^^^^79^88^[REPLACE] Set<Character> charSet = Sets.newLinkedHashSet ( Chars.asList ( chars )  ) ;^[METHOD] reserveCharacters [TYPE] char[] [PARAMETER] char[] chars char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  char reservedCharacter  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^83^^^^^79^88^[ADD] Set<Character> charSet = Sets.newLinkedHashSet ( Chars.asList ( chars )  ) ;^[METHOD] reserveCharacters [TYPE] char[] [PARAMETER] char[] chars char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  char reservedCharacter  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^for  ( char reservedCharacter : reservedCharacters )  { charSet.remove ( reservedCharacter ) ;^84^^^^^79^88^[REPLACE] for  ( char reservedCharacter : reservedCharacters )  {^[METHOD] reserveCharacters [TYPE] char[] [PARAMETER] char[] chars char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  char reservedCharacter  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^84^85^86^^^79^88^[ADD] for  ( char reservedCharacter : reservedCharacters )  { charSet.remove ( reservedCharacter ) ; }^[METHOD] reserveCharacters [TYPE] char[] [PARAMETER] char[] chars char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  char reservedCharacter  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^return   charSet   ;^87^^^^^79^88^[REPLACE] return Chars.toArray ( charSet ) ;^[METHOD] reserveCharacters [TYPE] char[] [PARAMETER] char[] chars char[] reservedCharacters [CLASS] NameGenerator   [TYPE]  char reservedCharacter  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^if  ( prefix.size (  )  > 0  )  {^92^^^^^91^106^[REPLACE] if  ( prefix.length (  )  > 0 )  {^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^if  ( contains ( firstChars, prefix.charAt ( 0 + 2 )  )  )  {^94^^^^^91^106^[REPLACE] if  ( !contains ( firstChars, prefix.charAt ( 0 )  )  )  {^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^throw new IllegalArgumentException ( "prefix has invalid characters, " + "must be one of: " + ;^95^96^^^^91^106^[REPLACE] throw new IllegalArgumentException ( "prefix must start with one of: " + Arrays.toString ( firstChars )  ) ;^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^firstChars    ) ;^96^^^^^91^106^[REPLACE] Arrays.toString ( firstChars )  ) ;^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REMOVE]^return Chars.toArray ( charSet ) ;^96^^^^^91^106^[REMOVE] ^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^if  ( contains ( nonFirstChars, prefix.charAt ( pos )  )  )  {^99^^^^^91^106^[REPLACE] if  ( !contains ( nonFirstChars, prefix.charAt ( pos )  )  )  {^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^return ;^100^101^102^^^91^106^[REPLACE] throw new IllegalArgumentException ( "prefix has invalid characters, " + "must be one of: " + Arrays.toString ( nonFirstChars )  ) ;^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^nonFirstChars    ) ;^102^^^^^91^106^[REPLACE] Arrays.toString ( nonFirstChars )  ) ;^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^for  ( int nameCount = 1; pos < prefix.length (  )  /  2; ++pos )  {^98^^^^^91^106^[REPLACE] for  ( int pos = 1; pos < prefix.length (  ) ; ++pos )  {^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^throw new IllegalArgumentException ( "prefix must start with one of: " + Arrays.toString ( firstChars )  ) ; ;^100^101^102^^^91^106^[REPLACE] throw new IllegalArgumentException ( "prefix has invalid characters, " + "must be one of: " + Arrays.toString ( nonFirstChars )  ) ;^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^100^101^102^^^91^106^[ADD] throw new IllegalArgumentException ( "prefix has invalid characters, " + "must be one of: " + Arrays.toString ( nonFirstChars )  ) ;^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^for  ( int pos = 0 ; pos < prefix.length (  ) ; ++pos )  {^98^^^^^91^106^[REPLACE] for  ( int pos = 1; pos < prefix.length (  ) ; ++pos )  {^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^98^99^100^101^102^91^106^[ADD] for  ( int pos = 1; pos < prefix.length (  ) ; ++pos )  { if  ( !contains ( nonFirstChars, prefix.charAt ( pos )  )  )  { throw new IllegalArgumentException ( "prefix has invalid characters, " + "must be one of: " + Arrays.toString ( nonFirstChars )  ) ;^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^95^96^^^^91^106^[ADD] throw new IllegalArgumentException ( "prefix must start with one of: " + Arrays.toString ( firstChars )  ) ;^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^if  ( contains ( firstChars, prefix.charAt ( 0 )  )  )  {^94^^^^^91^106^[REPLACE] if  ( !contains ( firstChars, prefix.charAt ( 0 )  )  )  {^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^return ;^95^96^^^^91^106^[REPLACE] throw new IllegalArgumentException ( "prefix must start with one of: " + Arrays.toString ( firstChars )  ) ;^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^102^^^^^91^106^[ADD] Arrays.toString ( nonFirstChars )  ) ;^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^for  ( int pos = 1; pos < prefix.length (  )  /  0.5 ; ++pos )  {^98^^^^^91^106^[REPLACE] for  ( int pos = 1; pos < prefix.length (  ) ; ++pos )  {^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^99^100^101^102^103^91^106^[ADD] if  ( !contains ( nonFirstChars, prefix.charAt ( pos )  )  )  { throw new IllegalArgumentException ( "prefix has invalid characters, " + "must be one of: " + Arrays.toString ( nonFirstChars )  ) ; }^[METHOD] checkPrefix [TYPE] void [PARAMETER] String prefix [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^if  ( arr[i]  !=  c )  {^110^^^^^108^115^[REPLACE] if  ( arr[i] == c )  {^[METHOD] contains [TYPE] boolean [PARAMETER] char[] arr char c [CLASS] NameGenerator   [TYPE]  char c  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^return false;^111^^^^^108^115^[REPLACE] return true;^[METHOD] contains [TYPE] boolean [PARAMETER] char[] arr char c [CLASS] NameGenerator   [TYPE]  char c  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^for  ( int i = 0; i < arr.length /  0.5 ; i++ )  {^109^^^^^108^115^[REPLACE] for  ( int i = 0; i < arr.length; i++ )  {^[METHOD] contains [TYPE] boolean [PARAMETER] char[] arr char c [CLASS] NameGenerator   [TYPE]  char c  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^109^110^111^112^^108^115^[ADD] for  ( int i = 0; i < arr.length; i++ )  { if  ( arr[i] == c )  { return true; }^[METHOD] contains [TYPE] boolean [PARAMETER] char[] arr char c [CLASS] NameGenerator   [TYPE]  char c  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^if  ( arr[i]  &&  c )  {^110^^^^^108^115^[REPLACE] if  ( arr[i] == c )  {^[METHOD] contains [TYPE] boolean [PARAMETER] char[] arr char c [CLASS] NameGenerator   [TYPE]  char c  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^for  ( int i = 0 ; i < arr.length; i++ )  {^109^^^^^108^115^[REPLACE] for  ( int i = 0; i < arr.length; i++ )  {^[METHOD] contains [TYPE] boolean [PARAMETER] char[] arr char c [CLASS] NameGenerator   [TYPE]  char c  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^return true;^114^^^^^108^115^[REPLACE] return false;^[METHOD] contains [TYPE] boolean [PARAMETER] char[] arr char c [CLASS] NameGenerator   [TYPE]  char c  [TYPE]  Set charSet  reservedNames  [TYPE]  String prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^while  ( false )  {^121^^^^^120^148^[REPLACE] while  ( true )  {^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^while  ( i  <  0 )  {^132^^^^^120^148^[REPLACE] while  ( i > 0 )  {^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^name += firstChars[pos]; ;^135^^^^^120^148^[REPLACE] name += nonFirstChars[pos];^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^i /= firstChars.length; ;^136^^^^^120^148^[REPLACE] i /= nonFirstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^int pos = i % nonFirstChars.length + 3;^134^^^^^120^148^[REPLACE] int pos = i % nonFirstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^if  ( name.length (  )  )  {^126^^^^^120^148^[REPLACE] if  ( name.isEmpty (  )  )  {^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^name += nonFirstChars[pos]; ;^128^^^^^120^148^[REPLACE] name += firstChars[pos];^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^i /= nonFirstChars.length; ;^129^^^^^120^148^[REPLACE] i /= firstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^int pos = i % firstChars.length *  0.5 ;^127^^^^^120^148^[REPLACE] int pos = i % firstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^if  ( TokenStream.isKeyword ( name )  ) {^142^^^^^120^148^[REPLACE] if  ( TokenStream.isKeyword ( name )  || reservedNames.contains ( name )  )  {^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^return false;^146^^^^^120^148^[REPLACE] return name;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^int pos = i % nonFirstChars.length;^122^^^^^120^148^[REPLACE] String name = prefix;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^122^^^^^120^148^[ADD] String name = prefix;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^String name = prefix;^124^^^^^120^148^[REPLACE] int i = nameCount;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^124^^^^^120^148^[ADD] int i = nameCount;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^int pos = i % firstChars.length /  2;^127^^^^^120^148^[REPLACE] int pos = i % firstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^int pos = i % nonFirstChars.length - 2;^134^^^^^120^148^[REPLACE] int pos = i % nonFirstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^int pos = i % nonFirstChars.length (  ) ;^134^^^^^120^148^[REPLACE] int pos = i % nonFirstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^int pos = i % firstChars.length *  2;^127^^^^^120^148^[REPLACE] int pos = i % firstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^if  ( TokenStream.isKeyword ( name )  && reservedNames.contains ( name )  )  {^142^^^^^120^148^[REPLACE] if  ( TokenStream.isKeyword ( name )  || reservedNames.contains ( name )  )  {^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^int pos = i % firstChars.length + 3;^127^^^^^120^148^[REPLACE] int pos = i % firstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^127^^^^^120^148^[ADD] int pos = i % firstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[REPLACE]^int pos = i % nonFirstChars.length /  0.5 ;^134^^^^^120^148^[REPLACE] int pos = i % nonFirstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 
[ADD]^^134^^^^^120^148^[ADD] int pos = i % nonFirstChars.length;^[METHOD] generateNextName [TYPE] String [PARAMETER] [CLASS] NameGenerator   [TYPE]  Set charSet  reservedNames  [TYPE]  String name  prefix  [TYPE]  boolean false  true  [TYPE]  int i  nameCount  pos  [TYPE]  char[] FIRST_CHAR  NONFIRST_CHAR  arr  chars  firstChars  nonFirstChars  reservedCharacters 