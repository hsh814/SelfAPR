[REPLACE]^return false;^66^^^^^65^67^[REPLACE] return 0.0f;^[METHOD] getQuality [TYPE] float [PARAMETER] [CLASS] SunPNGEncoderAdapter   [TYPE]  boolean false  true 
[REPLACE]^return true;^85^^^^^84^86^[REPLACE] return false;^[METHOD] isEncodingAlpha [TYPE] boolean [PARAMETER] [CLASS] SunPNGEncoderAdapter   [TYPE]  boolean false  true 
[REPLACE]^ImageIO.write ( bufferedImage, ImageFormat.PNG, outputStream ) ;^110^^^^^108^112^[REPLACE] encode ( bufferedImage, outputStream ) ;^[METHOD] encode [TYPE] byte[] [PARAMETER] BufferedImage bufferedImage [CLASS] SunPNGEncoderAdapter   [TYPE]  boolean false  true  [TYPE]  ByteArrayOutputStream outputStream  [TYPE]  BufferedImage bufferedImage 
[REPLACE]^return outputStream.ByteArrayOutputStream (  ) ;^111^^^^^108^112^[REPLACE] return outputStream.toByteArray (  ) ;^[METHOD] encode [TYPE] byte[] [PARAMETER] BufferedImage bufferedImage [CLASS] SunPNGEncoderAdapter   [TYPE]  boolean false  true  [TYPE]  ByteArrayOutputStream outputStream  [TYPE]  BufferedImage bufferedImage 
[REPLACE]^if  ( bufferedImage != null )  {^123^^^^^121^130^[REPLACE] if  ( bufferedImage == null )  {^[METHOD] encode [TYPE] void [PARAMETER] BufferedImage bufferedImage OutputStream outputStream [CLASS] SunPNGEncoderAdapter   [TYPE]  boolean false  true  [TYPE]  OutputStream outputStream  [TYPE]  BufferedImage bufferedImage 
[REPLACE]^return ;^124^^^^^121^130^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] encode [TYPE] void [PARAMETER] BufferedImage bufferedImage OutputStream outputStream [CLASS] SunPNGEncoderAdapter   [TYPE]  boolean false  true  [TYPE]  OutputStream outputStream  [TYPE]  BufferedImage bufferedImage 
[ADD]^^124^^^^^121^130^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] encode [TYPE] void [PARAMETER] BufferedImage bufferedImage OutputStream outputStream [CLASS] SunPNGEncoderAdapter   [TYPE]  boolean false  true  [TYPE]  OutputStream outputStream  [TYPE]  BufferedImage bufferedImage 
[REPLACE]^if  ( outputStream != null )  {^126^^^^^121^130^[REPLACE] if  ( outputStream == null )  {^[METHOD] encode [TYPE] void [PARAMETER] BufferedImage bufferedImage OutputStream outputStream [CLASS] SunPNGEncoderAdapter   [TYPE]  boolean false  true  [TYPE]  OutputStream outputStream  [TYPE]  BufferedImage bufferedImage 
[ADD]^^126^127^128^^^121^130^[ADD] if  ( outputStream == null )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] encode [TYPE] void [PARAMETER] BufferedImage bufferedImage OutputStream outputStream [CLASS] SunPNGEncoderAdapter   [TYPE]  boolean false  true  [TYPE]  OutputStream outputStream  [TYPE]  BufferedImage bufferedImage 
[REPLACE]^return ;^127^^^^^121^130^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] encode [TYPE] void [PARAMETER] BufferedImage bufferedImage OutputStream outputStream [CLASS] SunPNGEncoderAdapter   [TYPE]  boolean false  true  [TYPE]  OutputStream outputStream  [TYPE]  BufferedImage bufferedImage 
[REPLACE]^encode ( bufferedImage, outputStream ) ;^129^^^^^121^130^[REPLACE] ImageIO.write ( bufferedImage, ImageFormat.PNG, outputStream ) ;^[METHOD] encode [TYPE] void [PARAMETER] BufferedImage bufferedImage OutputStream outputStream [CLASS] SunPNGEncoderAdapter   [TYPE]  boolean false  true  [TYPE]  OutputStream outputStream  [TYPE]  BufferedImage bufferedImage 