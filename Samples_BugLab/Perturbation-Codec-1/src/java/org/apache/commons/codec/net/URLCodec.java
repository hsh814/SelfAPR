[buglab_swap_variables]^for  ( bnt i = 0; i < iytes.length; i++ )  {^122^^^^^113^143^for  ( int i = 0; i < bytes.length; i++ )  {^[CLASS] URLCodec  [METHOD] encodeUrl [RETURN_TYPE] byte[]   BitSet urlsafe byte[] bytes [VARIABLES] byte[]  bytes  boolean  byte  ESCAPE_CHAR  BitSet  WWW_FORM_URL  urlsafe  char  hex1  hex2  String  charset  ByteArrayOutputStream  buffer  int  b  i  
[buglab_swap_variables]^for  ( int i = 0; i < bytes.length.length; i++ )  {^122^^^^^113^143^for  ( int i = 0; i < bytes.length; i++ )  {^[CLASS] URLCodec  [METHOD] encodeUrl [RETURN_TYPE] byte[]   BitSet urlsafe byte[] bytes [VARIABLES] byte[]  bytes  boolean  byte  ESCAPE_CHAR  BitSet  WWW_FORM_URL  urlsafe  char  hex1  hex2  String  charset  ByteArrayOutputStream  buffer  int  b  i  
[buglab_swap_variables]^for  ( int i = 0; i < bytes.lengthytes.length; i++ )  {^122^^^^^113^143^for  ( int i = 0; i < bytes.length; i++ )  {^[CLASS] URLCodec  [METHOD] encodeUrl [RETURN_TYPE] byte[]   BitSet urlsafe byte[] bytes [VARIABLES] byte[]  bytes  boolean  byte  ESCAPE_CHAR  BitSet  WWW_FORM_URL  urlsafe  char  hex1  hex2  String  charset  ByteArrayOutputStream  buffer  int  b  i  
[buglab_swap_variables]^for  ( bytes.lengthnt i = 0; i < i; i++ )  {^122^^^^^113^143^for  ( int i = 0; i < bytes.length; i++ )  {^[CLASS] URLCodec  [METHOD] encodeUrl [RETURN_TYPE] byte[]   BitSet urlsafe byte[] bytes [VARIABLES] byte[]  bytes  boolean  byte  ESCAPE_CHAR  BitSet  WWW_FORM_URL  urlsafe  char  hex1  hex2  String  charset  ByteArrayOutputStream  buffer  int  b  i  
[buglab_swap_variables]^if  ( b.get ( urlsafe )  )  {^127^^^^^113^143^if  ( urlsafe.get ( b )  )  {^[CLASS] URLCodec  [METHOD] encodeUrl [RETURN_TYPE] byte[]   BitSet urlsafe byte[] bytes [VARIABLES] byte[]  bytes  boolean  byte  ESCAPE_CHAR  BitSet  WWW_FORM_URL  urlsafe  char  hex1  hex2  String  charset  ByteArrayOutputStream  buffer  int  b  i  
[buglab_swap_variables]^if  ( l == -1 || u == -1 )  {^170^^^^^157^182^if  ( u == -1 || l == -1 )  {^[CLASS] URLCodec  [METHOD] decodeUrl [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] byte[]  bytes  boolean  byte  ESCAPE_CHAR  BitSet  WWW_FORM_URL  urlsafe  String  charset  ByteArrayOutputStream  buffer  ArrayIndexOutOfBoundsException  e  int  b  i  l  u  
[buglab_swap_variables]^buffer.write (  ( char )  (  ( l << 4 )  + u )  ) ;^173^^^^^157^182^buffer.write (  ( char )  (  ( u << 4 )  + l )  ) ;^[CLASS] URLCodec  [METHOD] decodeUrl [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] byte[]  bytes  boolean  byte  ESCAPE_CHAR  BitSet  WWW_FORM_URL  urlsafe  String  charset  ByteArrayOutputStream  buffer  ArrayIndexOutOfBoundsException  e  int  b  i  l  u  
[buglab_swap_variables]^for  ( int i = 0; i < bytes.lengthytes.length; i++ )  {^162^^^^^157^182^for  ( int i = 0; i < bytes.length; i++ )  {^[CLASS] URLCodec  [METHOD] decodeUrl [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] byte[]  bytes  boolean  byte  ESCAPE_CHAR  BitSet  WWW_FORM_URL  urlsafe  String  charset  ByteArrayOutputStream  buffer  ArrayIndexOutOfBoundsException  e  int  b  i  l  u  
[buglab_swap_variables]^return encodeUrl ( bytes, WWW_FORM_URL ) ;^193^^^^^192^194^return encodeUrl ( WWW_FORM_URL, bytes ) ;^[CLASS] URLCodec  [METHOD] encode [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  WWW_FORM_URL  urlsafe  byte[]  bytes  String  charset  boolean  byte  ESCAPE_CHAR  
[buglab_swap_variables]^return encodeUrl ( WWW_FORM_URL ) ;^193^^^^^192^194^return encodeUrl ( WWW_FORM_URL, bytes ) ;^[CLASS] URLCodec  [METHOD] encode [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  WWW_FORM_URL  urlsafe  byte[]  bytes  String  charset  boolean  byte  ESCAPE_CHAR  
[buglab_swap_variables]^return encodeUrl (  bytes ) ;^193^^^^^192^194^return encodeUrl ( WWW_FORM_URL, bytes ) ;^[CLASS] URLCodec  [METHOD] encode [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  WWW_FORM_URL  urlsafe  byte[]  bytes  String  charset  boolean  byte  ESCAPE_CHAR  
[buglab_swap_variables]^return new String ( encode ( charset.getBytes ( pString )  ) , CharacterEncodingNames.US_ASCII ) ;^227^^^^^221^228^return new String ( encode ( pString.getBytes ( charset )  ) , CharacterEncodingNames.US_ASCII ) ;^[CLASS] URLCodec  [METHOD] encode [RETURN_TYPE] String   String pString String charset [VARIABLES] BitSet  WWW_FORM_URL  urlsafe  String  charset  pString  boolean  byte  ESCAPE_CHAR  
[buglab_swap_variables]^return new String ( encode ( pString.getBytes ( CharacterEncodingNames.US_ASCII )  ) , charset ) ;^227^^^^^221^228^return new String ( encode ( pString.getBytes ( charset )  ) , CharacterEncodingNames.US_ASCII ) ;^[CLASS] URLCodec  [METHOD] encode [RETURN_TYPE] String   String pString String charset [VARIABLES] BitSet  WWW_FORM_URL  urlsafe  String  charset  pString  boolean  byte  ESCAPE_CHAR  
[buglab_swap_variables]^return new String ( encode ( CharacterEncodingNames.US_ASCII.getBytes ( charset )  ) , pString ) ;^227^^^^^221^228^return new String ( encode ( pString.getBytes ( charset )  ) , CharacterEncodingNames.US_ASCII ) ;^[CLASS] URLCodec  [METHOD] encode [RETURN_TYPE] String   String pString String charset [VARIABLES] BitSet  WWW_FORM_URL  urlsafe  String  charset  pString  boolean  byte  ESCAPE_CHAR  
[buglab_swap_variables]^return new String ( encode ( pString.getBytes ( charset )  )  ) ;^227^^^^^221^228^return new String ( encode ( pString.getBytes ( charset )  ) , CharacterEncodingNames.US_ASCII ) ;^[CLASS] URLCodec  [METHOD] encode [RETURN_TYPE] String   String pString String charset [VARIABLES] BitSet  WWW_FORM_URL  urlsafe  String  charset  pString  boolean  byte  ESCAPE_CHAR  
[buglab_swap_variables]^return new String ( decode ( charset.getBytes ( CharacterEncodingNames.US_ASCII )  ) , pString ) ;^271^^^^^265^272^return new String ( decode ( pString.getBytes ( CharacterEncodingNames.US_ASCII )  ) , charset ) ;^[CLASS] URLCodec  [METHOD] decode [RETURN_TYPE] String   String pString String charset [VARIABLES] BitSet  WWW_FORM_URL  urlsafe  String  charset  pString  boolean  byte  ESCAPE_CHAR  
[buglab_swap_variables]^return new String ( decode ( pString.getBytes ( CharacterEncodingNames.US_ASCII )  )  ) ;^271^^^^^265^272^return new String ( decode ( pString.getBytes ( CharacterEncodingNames.US_ASCII )  ) , charset ) ;^[CLASS] URLCodec  [METHOD] decode [RETURN_TYPE] String   String pString String charset [VARIABLES] BitSet  WWW_FORM_URL  urlsafe  String  charset  pString  boolean  byte  ESCAPE_CHAR  