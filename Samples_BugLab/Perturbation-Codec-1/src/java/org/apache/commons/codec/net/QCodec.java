[buglab_swap_variables]^byte[] data = QuotedPrintableCodec.encodeQuotedPrintable ( bytes, PRINTABLE_CHARS ) ;^137^^^^^133^146^byte[] data = QuotedPrintableCodec.encodeQuotedPrintable ( PRINTABLE_CHARS, bytes ) ;^[CLASS] QCodec  [METHOD] doEncoding [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  PRINTABLE_CHARS  byte[]  bytes  data  boolean  encodeBlanks  String  charset  byte  BLANK  UNDERSCORE  int  i  
[buglab_swap_variables]^byte[] data = QuotedPrintableCodec.encodeQuotedPrintable ( PRINTABLE_CHARS ) ;^137^^^^^133^146^byte[] data = QuotedPrintableCodec.encodeQuotedPrintable ( PRINTABLE_CHARS, bytes ) ;^[CLASS] QCodec  [METHOD] doEncoding [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  PRINTABLE_CHARS  byte[]  bytes  data  boolean  encodeBlanks  String  charset  byte  BLANK  UNDERSCORE  int  i  
[buglab_swap_variables]^byte[] data = QuotedPrintableCodec.encodeQuotedPrintable (  bytes ) ;^137^^^^^133^146^byte[] data = QuotedPrintableCodec.encodeQuotedPrintable ( PRINTABLE_CHARS, bytes ) ;^[CLASS] QCodec  [METHOD] doEncoding [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  PRINTABLE_CHARS  byte[]  bytes  data  boolean  encodeBlanks  String  charset  byte  BLANK  UNDERSCORE  int  i  
[buglab_swap_variables]^for  ( data.lengthnt i = 0; i < i; i++ )  {^139^^^^^133^146^for  ( int i = 0; i < data.length; i++ )  {^[CLASS] QCodec  [METHOD] doEncoding [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  PRINTABLE_CHARS  byte[]  bytes  data  boolean  encodeBlanks  String  charset  byte  BLANK  UNDERSCORE  int  i  
[buglab_swap_variables]^if  ( BLANK[i] == data )  {^140^^^^^133^146^if  ( data[i] == BLANK )  {^[CLASS] QCodec  [METHOD] doEncoding [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  PRINTABLE_CHARS  byte[]  bytes  data  boolean  encodeBlanks  String  charset  byte  BLANK  UNDERSCORE  int  i  
[buglab_swap_variables]^for  ( datant i = 0; i < i.length; i++ )  {^139^^^^^133^146^for  ( int i = 0; i < data.length; i++ )  {^[CLASS] QCodec  [METHOD] doEncoding [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  PRINTABLE_CHARS  byte[]  bytes  data  boolean  encodeBlanks  String  charset  byte  BLANK  UNDERSCORE  int  i  
[buglab_swap_variables]^for  ( bytes.lengthnt i = 0; i < i; i++ )  {^153^^^^^148^172^for  ( int i = 0; i < bytes.length; i++ )  {^[CLASS] QCodec  [METHOD] doDecoding [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  PRINTABLE_CHARS  byte[]  bytes  tmp  boolean  encodeBlanks  hasUnderscores  String  charset  byte  BLANK  UNDERSCORE  b  int  i  
[buglab_swap_variables]^if  ( UNDERSCORE[i] == bytes )  {^154^^^^^148^172^if  ( bytes[i] == UNDERSCORE )  {^[CLASS] QCodec  [METHOD] doDecoding [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  PRINTABLE_CHARS  byte[]  bytes  tmp  boolean  encodeBlanks  hasUnderscores  String  charset  byte  BLANK  UNDERSCORE  b  int  i  
[buglab_swap_variables]^if  ( UNDERSCORE != b )  {^163^^^^^148^172^if  ( b != UNDERSCORE )  {^[CLASS] QCodec  [METHOD] doDecoding [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  PRINTABLE_CHARS  byte[]  bytes  tmp  boolean  encodeBlanks  hasUnderscores  String  charset  byte  BLANK  UNDERSCORE  b  int  i  
[buglab_swap_variables]^for  ( bytesnt i = 0; i < i.length; i++ )  {^161^^^^^148^172^for  ( int i = 0; i < bytes.length; i++ )  {^[CLASS] QCodec  [METHOD] doDecoding [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  PRINTABLE_CHARS  byte[]  bytes  tmp  boolean  encodeBlanks  hasUnderscores  String  charset  byte  BLANK  UNDERSCORE  b  int  i  
[buglab_swap_variables]^for  ( int i = 0; i < bytes; i++ )  {^161^^^^^148^172^for  ( int i = 0; i < bytes.length; i++ )  {^[CLASS] QCodec  [METHOD] doDecoding [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] BitSet  PRINTABLE_CHARS  byte[]  bytes  tmp  boolean  encodeBlanks  hasUnderscores  String  charset  byte  BLANK  UNDERSCORE  b  int  i  
[buglab_swap_variables]^return encodeText ( charset, pString ) ;^191^^^^^186^195^return encodeText ( pString, charset ) ;^[CLASS] QCodec  [METHOD] encode [RETURN_TYPE] String   String pString String charset [VARIABLES] BitSet  PRINTABLE_CHARS  UnsupportedEncodingException  e  boolean  encodeBlanks  hasUnderscores  String  charset  pString  byte  BLANK  UNDERSCORE  b  
[buglab_swap_variables]^return encodeText (  charset ) ;^191^^^^^186^195^return encodeText ( pString, charset ) ;^[CLASS] QCodec  [METHOD] encode [RETURN_TYPE] String   String pString String charset [VARIABLES] BitSet  PRINTABLE_CHARS  UnsupportedEncodingException  e  boolean  encodeBlanks  hasUnderscores  String  charset  pString  byte  BLANK  UNDERSCORE  b  
[buglab_swap_variables]^return encodeText ( pString ) ;^191^^^^^186^195^return encodeText ( pString, charset ) ;^[CLASS] QCodec  [METHOD] encode [RETURN_TYPE] String   String pString String charset [VARIABLES] BitSet  PRINTABLE_CHARS  UnsupportedEncodingException  e  boolean  encodeBlanks  hasUnderscores  String  charset  pString  byte  BLANK  UNDERSCORE  b  