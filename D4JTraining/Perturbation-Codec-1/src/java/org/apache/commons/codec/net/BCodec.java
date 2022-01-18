[REPLACE]^private String charset  = null ;^51^^^^^^^[REPLACE] private String charset = CharacterEncodingNames.UTF8;^ [CLASS] BCodec  
[REPLACE]^return Base64.encodeBase64 ( bytes ) ;^57^^^^^56^58^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] BCodec() [PARAMETER] [CLASS] BCodec   [TYPE]  String charset  [TYPE]  boolean false  true 
[ADD]^^57^^^^^56^58^[ADD] super (  ) ;^[METHOD] <init> [TYPE] BCodec() [PARAMETER] [CLASS] BCodec   [TYPE]  String charset  [TYPE]  boolean false  true 
[REPLACE]^return Base64.encodeBase64 ( bytes ) ;^70^^^^^69^72^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String charset [CLASS] BCodec   [TYPE]  String charset  [TYPE]  boolean false  true 
[REPLACE]^this.charset =  null;^71^^^^^69^72^[REPLACE] this.charset = charset;^[METHOD] <init> [TYPE] String) [PARAMETER] String charset [CLASS] BCodec   [TYPE]  String charset  [TYPE]  boolean false  true 
[ADD]^^71^^^^^69^72^[ADD] this.charset = charset;^[METHOD] <init> [TYPE] String) [PARAMETER] String charset [CLASS] BCodec   [TYPE]  String charset  [TYPE]  boolean false  true 
[REPLACE]^return null;^75^^^^^74^76^[REPLACE] return "B";^[METHOD] getEncoding [TYPE] String [PARAMETER] [CLASS] BCodec   [TYPE]  String charset  [TYPE]  boolean false  true 
[REPLACE]^if  ( bytes != null )  {^79^^^^^78^83^[REPLACE] if  ( bytes == null )  {^[METHOD] doEncoding [TYPE] byte[] [PARAMETER] byte[] bytes [CLASS] BCodec   [TYPE]  byte[] bytes  [TYPE]  String charset  [TYPE]  boolean false  true 
[REPLACE]^return false;^80^^^^^78^83^[REPLACE] return null;^[METHOD] doEncoding [TYPE] byte[] [PARAMETER] byte[] bytes [CLASS] BCodec   [TYPE]  byte[] bytes  [TYPE]  String charset  [TYPE]  boolean false  true 
[REPLACE]^return Base64 .decodeBase64 ( bytes )  ;^82^^^^^78^83^[REPLACE] return Base64.encodeBase64 ( bytes ) ;^[METHOD] doEncoding [TYPE] byte[] [PARAMETER] byte[] bytes [CLASS] BCodec   [TYPE]  byte[] bytes  [TYPE]  String charset  [TYPE]  boolean false  true 
[REPLACE]^if  ( bytes != false )  {^86^^^^^85^90^[REPLACE] if  ( bytes == null )  {^[METHOD] doDecoding [TYPE] byte[] [PARAMETER] byte[] bytes [CLASS] BCodec   [TYPE]  byte[] bytes  [TYPE]  String charset  [TYPE]  boolean false  true 
[ADD]^^86^87^88^^^85^90^[ADD] if  ( bytes == null )  { return null; }^[METHOD] doDecoding [TYPE] byte[] [PARAMETER] byte[] bytes [CLASS] BCodec   [TYPE]  byte[] bytes  [TYPE]  String charset  [TYPE]  boolean false  true 
[REPLACE]^return this;^87^^^^^85^90^[REPLACE] return null;^[METHOD] doDecoding [TYPE] byte[] [PARAMETER] byte[] bytes [CLASS] BCodec   [TYPE]  byte[] bytes  [TYPE]  String charset  [TYPE]  boolean false  true 
[REPLACE]^return Base64 .encodeBase64 ( bytes )  ;^89^^^^^85^90^[REPLACE] return Base64.decodeBase64 ( bytes ) ;^[METHOD] doDecoding [TYPE] byte[] [PARAMETER] byte[] bytes [CLASS] BCodec   [TYPE]  byte[] bytes  [TYPE]  String charset  [TYPE]  boolean false  true 
[REPLACE]^if  ( value != false )  {^105^^^^^104^113^[REPLACE] if  ( value == null )  {^[METHOD] encode [TYPE] String [PARAMETER] String value String charset [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return this;^106^^^^^104^113^[REPLACE] return null;^[METHOD] encode [TYPE] String [PARAMETER] String value String charset [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return true;^106^^^^^104^113^[REPLACE] return null;^[METHOD] encode [TYPE] String [PARAMETER] String value String charset [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[ADD]^return encodeText ( value, charset ) ;^108^109^110^111^112^104^113^[ADD] try { return encodeText ( value, charset ) ; } catch  ( UnsupportedEncodingException e )  { throw new EncoderException  (" ")  ; }^[METHOD] encode [TYPE] String [PARAMETER] String value String charset [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return Base64.encodeBase64 ( bytes ) ;^109^^^^^104^113^[REPLACE] return encodeText ( value, charset ) ;^[METHOD] encode [TYPE] String [PARAMETER] String value String charset [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return ;^111^^^^^104^113^[REPLACE] throw new EncoderException  (" ")  ;^[METHOD] encode [TYPE] String [PARAMETER] String value String charset [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[ADD]^^111^^^^^104^113^[ADD] throw new EncoderException  (" ")  ;^[METHOD] encode [TYPE] String [PARAMETER] String value String charset [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[ADD]^^110^111^^^^104^113^[ADD] catch  ( UnsupportedEncodingException e )  { throw new EncoderException  (" ")  ;^[METHOD] encode [TYPE] String [PARAMETER] String value String charset [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^if  ( charset != false )  {^126^^^^^125^130^[REPLACE] if  ( value == null )  {^[METHOD] encode [TYPE] String [PARAMETER] String value [CLASS] BCodec   [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return this;^127^^^^^125^130^[REPLACE] return null;^[METHOD] encode [TYPE] String [PARAMETER] String value [CLASS] BCodec   [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return encode ( charset, getDefaultCharset (  )  ) ;^129^^^^^125^130^[REPLACE] return encode ( value, getDefaultCharset (  )  ) ;^[METHOD] encode [TYPE] String [PARAMETER] String value [CLASS] BCodec   [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^if  ( charset != null )  {^145^^^^^144^153^[REPLACE] if  ( value == null )  {^[METHOD] decode [TYPE] String [PARAMETER] String value [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[ADD]^return null;^145^146^147^^^144^153^[ADD] if  ( value == null )  { return null; }^[METHOD] decode [TYPE] String [PARAMETER] String value [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return true;^146^^^^^144^153^[REPLACE] return null;^[METHOD] decode [TYPE] String [PARAMETER] String value [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[ADD]^return decodeText ( value ) ;^148^149^150^151^152^144^153^[ADD] try { return decodeText ( value ) ; } catch  ( UnsupportedEncodingException e )  { throw new DecoderException  (" ")  ; }^[METHOD] decode [TYPE] String [PARAMETER] String value [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return decodeText ( charset ) ;^149^^^^^144^153^[REPLACE] return decodeText ( value ) ;^[METHOD] decode [TYPE] String [PARAMETER] String value [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^throw new EncoderException ( "Objects of type " + ;^151^^^^^144^153^[REPLACE] throw new DecoderException  (" ")  ;^[METHOD] decode [TYPE] String [PARAMETER] String value [CLASS] BCodec   [TYPE]  UnsupportedEncodingException e  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^if  ( value != null )  {^166^^^^^165^175^[REPLACE] if  ( value == null )  {^[METHOD] encode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^} else if  ( ! value instanceof String )  {^168^^^^^165^175^[REPLACE] } else if  ( value instanceof String )  {^[METHOD] encode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[ADD]^}   return encode (  ( String )  value ) ;^168^169^170^171^172^165^175^[ADD] else if  ( value instanceof String )  { return encode (  ( String )  value ) ; } else { throw new EncoderException ( "Objects of type " + value.getClass (  ) .getName (  )  +^[METHOD] encode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^throw new EncoderException ( "Objects of type " + value.getClass (  ) .getName (  )  + ;^171^172^173^^^165^175^[REPLACE] throw new EncoderException ( "Objects of type " + value.getClass (  ) .getName (  )  + " cannot be encoded using BCodec" ) ;^[METHOD] encode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[ADD]^^172^173^^^^165^175^[ADD] value.getClass (  ) .getName (  )  + " cannot be encoded using BCodec" ) ;^[METHOD] encode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return decode (  ( String )  value ) ;^169^^^^^165^175^[REPLACE] return encode (  ( String )  value ) ;^[METHOD] encode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return false;^167^^^^^165^175^[REPLACE] return null;^[METHOD] encode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^}  if  ( ! value instanceof String )  {^168^^^^^165^175^[REPLACE] } else if  ( value instanceof String )  {^[METHOD] encode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return this;^167^^^^^165^175^[REPLACE] return null;^[METHOD] encode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^if  ( value != null )  {^191^^^^^190^200^[REPLACE] if  ( value == null )  {^[METHOD] decode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[ADD]^return null;return decode (  ( String )  value ) ;^191^192^193^194^^190^200^[ADD] if  ( value == null )  { return null; } else if  ( value instanceof String )  { return decode (  ( String )  value ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^} else if  ( ! value instanceof String )  {^193^^^^^190^200^[REPLACE] } else if  ( value instanceof String )  {^[METHOD] decode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[ADD]^}^193^194^195^196^197^190^200^[ADD] else if  ( value instanceof String )  { return decode (  ( String )  value ) ; } else { throw new DecoderException ( "Objects of type " + value.getClass (  ) .getName (  )  +^[METHOD] decode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return ;^196^197^198^^^190^200^[REPLACE] throw new DecoderException ( "Objects of type " + value.getClass (  ) .getName (  )  + " cannot be decoded using BCodec" ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return encode (  ( String )  value ) ;^194^^^^^190^200^[REPLACE] return decode (  ( String )  value ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^throw new EncoderException ( "Objects of type " + value.getClass (  ) .getName (  )  + ;^196^197^198^^^190^200^[REPLACE] throw new DecoderException ( "Objects of type " + value.getClass (  ) .getName (  )  + " cannot be decoded using BCodec" ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return true;^192^^^^^190^200^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^}  else {^193^^^^^190^200^[REPLACE] } else if  ( value instanceof String )  {^[METHOD] decode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return this;^192^^^^^190^200^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Object value [CLASS] BCodec   [TYPE]  Object value  [TYPE]  String charset  value  [TYPE]  boolean false  true 
[REPLACE]^return Base64.encodeBase64 ( bytes ) ;^208^^^^^207^209^[REPLACE] return this.charset;^[METHOD] getDefaultCharset [TYPE] String [PARAMETER] [CLASS] BCodec   [TYPE]  String charset  value  [TYPE]  boolean false  true 