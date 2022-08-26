[P3_Replace_Literal]^return true;^85^^^^^84^86^return false;^[CLASS] SunPNGEncoderAdapter  [METHOD] isEncodingAlpha [RETURN_TYPE] boolean   [VARIABLES] boolean  
[P5_Replace_Variable]^encode (  outputStream ) ;^110^^^^^108^112^encode ( bufferedImage, outputStream ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] boolean  ByteArrayOutputStream  outputStream  BufferedImage  bufferedImage  
[P5_Replace_Variable]^encode ( bufferedImage ) ;^110^^^^^108^112^encode ( bufferedImage, outputStream ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] boolean  ByteArrayOutputStream  outputStream  BufferedImage  bufferedImage  
[P5_Replace_Variable]^encode ( outputStream, bufferedImage ) ;^110^^^^^108^112^encode ( bufferedImage, outputStream ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] boolean  ByteArrayOutputStream  outputStream  BufferedImage  bufferedImage  
[P14_Delete_Statement]^^110^^^^^108^112^encode ( bufferedImage, outputStream ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] boolean  ByteArrayOutputStream  outputStream  BufferedImage  bufferedImage  
[P11_Insert_Donor_Statement]^ImageIO.write ( bufferedImage, ImageFormat.PNG, outputStream ) ;encode ( bufferedImage, outputStream ) ;^110^^^^^108^112^encode ( bufferedImage, outputStream ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] boolean  ByteArrayOutputStream  outputStream  BufferedImage  bufferedImage  
[P8_Replace_Mix]^return outputStream .ByteArrayOutputStream (  )  ;^111^^^^^108^112^return outputStream.toByteArray (  ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] boolean  ByteArrayOutputStream  outputStream  BufferedImage  bufferedImage  
[P14_Delete_Statement]^^111^^^^^108^112^return outputStream.toByteArray (  ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] boolean  ByteArrayOutputStream  outputStream  BufferedImage  bufferedImage  
[P2_Replace_Operator]^if  ( bufferedImage != null )  {^123^^^^^121^130^if  ( bufferedImage == null )  {^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P8_Replace_Mix]^if  ( bufferedImage == true )  {^123^^^^^121^130^if  ( bufferedImage == null )  {^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P9_Replace_Statement]^if  ( outputStream == null )  {^123^^^^^121^130^if  ( bufferedImage == null )  {^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("Null 'image' argument.");^123^124^125^^^121^130^if  ( bufferedImage == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P16_Remove_Block]^^123^124^125^^^121^130^if  ( bufferedImage == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P13_Insert_Block]^if  ( outputStream == null )  {     throw new IllegalArgumentException ( "Null 'outputStream' argument." ) ; }^123^^^^^121^130^[Delete]^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P4_Replace_Constructor]^throw throw  new IllegalArgumentException ( "Null 'outputStream' argument." )   ;^124^^^^^121^130^throw new IllegalArgumentException  (" ")  ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P13_Insert_Block]^if  ( bufferedImage == null )  {     throw new IllegalArgumentException ( "Null 'image' argument." ) ; }^124^^^^^121^130^[Delete]^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P13_Insert_Block]^if  ( outputStream == null )  {     throw new IllegalArgumentException ( "Null 'outputStream' argument." ) ; }^124^^^^^121^130^[Delete]^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P2_Replace_Operator]^if  ( outputStream != null )  {^126^^^^^121^130^if  ( outputStream == null )  {^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P8_Replace_Mix]^if  ( outputStream == true )  {^126^^^^^121^130^if  ( outputStream == null )  {^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P9_Replace_Statement]^if  ( bufferedImage == null )  {^126^^^^^121^130^if  ( outputStream == null )  {^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("Null 'outputStream' argument.");^126^127^128^^^121^130^if  ( outputStream == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P16_Remove_Block]^^126^127^128^^^121^130^if  ( outputStream == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P13_Insert_Block]^if  ( bufferedImage == null )  {     throw new IllegalArgumentException ( "Null 'image' argument." ) ; }^126^^^^^121^130^[Delete]^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P4_Replace_Constructor]^throw throw  new IllegalArgumentException ( "Null 'image' argument." )   ;^127^^^^^121^130^throw new IllegalArgumentException  (" ")  ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P13_Insert_Block]^if  ( outputStream == null )  {     throw new IllegalArgumentException ( "Null 'outputStream' argument." ) ; }^127^^^^^121^130^[Delete]^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P8_Replace_Mix]^return 0;^127^^^^^121^130^throw new IllegalArgumentException  (" ")  ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P13_Insert_Block]^if  ( bufferedImage == null )  {     throw new IllegalArgumentException ( "Null 'image' argument." ) ; }^127^^^^^121^130^[Delete]^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P5_Replace_Variable]^ImageIO.write (  ImageFormat.PNG, outputStream ) ;^129^^^^^121^130^ImageIO.write ( bufferedImage, ImageFormat.PNG, outputStream ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P5_Replace_Variable]^ImageIO.write ( bufferedImage, ImageFormat.PNG ) ;^129^^^^^121^130^ImageIO.write ( bufferedImage, ImageFormat.PNG, outputStream ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P5_Replace_Variable]^ImageIO.write ( outputStream, ImageFormat.PNG, bufferedImage ) ;^129^^^^^121^130^ImageIO.write ( bufferedImage, ImageFormat.PNG, outputStream ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P14_Delete_Statement]^^129^^^^^121^130^ImageIO.write ( bufferedImage, ImageFormat.PNG, outputStream ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  
[P11_Insert_Donor_Statement]^encode ( bufferedImage, outputStream ) ;ImageIO.write ( bufferedImage, ImageFormat.PNG, outputStream ) ;^129^^^^^121^130^ImageIO.write ( bufferedImage, ImageFormat.PNG, outputStream ) ;^[CLASS] SunPNGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  BufferedImage  bufferedImage  