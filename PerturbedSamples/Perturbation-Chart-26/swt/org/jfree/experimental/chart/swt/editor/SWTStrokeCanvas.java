[REPLACE]^this.setData (  stroke  ) ;^68^^^^^67^69^[REPLACE] this ( parent, style ) ;^[METHOD] <init> [TYPE] Image) [PARAMETER] Composite parent int style Image image [CLASS] SWTStrokeCanvas 1   [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Image image  [TYPE]  int style 
[REPLACE]^super ( parent, y ) ;^78^^^^^77^99^[REPLACE] super ( parent, style ) ;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[REPLACE]^if  ( stroke == null )  {^82^^^^^77^99^[REPLACE] if  ( stroke != null )  {^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[ADD]^int x, y;Rectangle rect = getClientArea (  ) ;x =  ( rect.width - 100 )  / 2;y =  ( rect.height - 16 )  / 2;^82^83^84^85^86^77^99^[ADD] if  ( stroke != null )  { int x, y; Rectangle rect = getClientArea (  ) ; x =  ( rect.width - 100 )  / 2; y =  ( rect.height - 16 )  / 2;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[REPLACE]^y =  ( rect.height - 16 )  / 2; ;^85^^^^^77^99^[REPLACE] x =  ( rect.width - 100 )  / 2;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[ADD]^^85^^^^^77^99^[ADD] x =  ( rect.width - 100 )  / 2;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[REPLACE]^x =  ( rect.width - 100 )  / 2; ;^86^^^^^77^99^[REPLACE] y =  ( rect.height - 16 )  / 2;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[REPLACE]^BasicStroke stroke =  ( BasicStroke )  getStroke (  ) ;^83^^^^^77^99^[REPLACE] int x, y;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[ADD]^^83^^^^^77^99^[ADD] int x, y;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[REPLACE]^BasicStroke stroke =  ( BasicStroke )  getStroke (  ) ;^84^^^^^77^99^[REPLACE] Rectangle rect = getClientArea (  ) ;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[REPLACE]^Transform swtTransform = new Transform ( e.gc.setBackground (  )  ) ;^87^^^^^77^99^[REPLACE] Transform swtTransform = new Transform ( e.gc.getDevice (  )  ) ;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[REPLACE]^x =  ( rect.width - 100 )   ;^85^^^^^77^99^[REPLACE] x =  ( rect.width - 100 )  / 2;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[REPLACE]^y =  ( rect.height - 15 )   ;^86^^^^^77^99^[REPLACE] y =  ( rect.height - 16 )  / 2;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[ADD]^^86^87^^^^77^99^[ADD] y =  ( rect.height - 16 )  / 2; Transform swtTransform = new Transform ( e.gc.getDevice (  )  ) ;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[REPLACE]^Transform swtTransform = new Transform ( e.gc.getDevice (  )  ) ;^81^^^^^77^99^[REPLACE] BasicStroke stroke =  ( BasicStroke )  getStroke (  ) ;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[ADD]^^87^88^89^90^91^77^99^[ADD] Transform swtTransform = new Transform ( e.gc.getDevice (  )  ) ; e.gc.getTransform ( swtTransform ) ; swtTransform.translate ( x, y ) ; e.gc.setTransform ( swtTransform ) ; swtTransform.dispose (  ) ;^[METHOD] <init> [TYPE] Composite,int) [PARAMETER] Composite parent int style [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Composite parent  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int style  x  y 
[REPLACE]^Transform swtTransform = new Transform ( e.gc.getDevice (  )  ) ;^81^^^^^80^97^[REPLACE] BasicStroke stroke =  ( BasicStroke )  getStroke (  ) ;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[ADD]^^81^^^^^80^97^[ADD] BasicStroke stroke =  ( BasicStroke )  getStroke (  ) ;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^if  ( stroke == null )  {^82^^^^^80^97^[REPLACE] if  ( stroke != null )  {^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[ADD]^int x, y;Rectangle rect = getClientArea (  ) ;x =  ( rect.width - 100 )  / 2;y =  ( rect.height - 16 )  / 2;^82^83^84^85^86^80^97^[ADD] if  ( stroke != null )  { int x, y; Rectangle rect = getClientArea (  ) ; x =  ( rect.width - 100 )  / 2; y =  ( rect.height - 16 )  / 2;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^x =  ( rect.width - 43 )   ;^85^^^^^80^97^[REPLACE] x =  ( rect.width - 100 )  / 2;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^y =  ( rect.height - 16 )   ;^86^^^^^80^97^[REPLACE] y =  ( rect.height - 16 )  / 2;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^BasicStroke stroke =  ( BasicStroke )  getStroke (  ) ;^83^^^^^80^97^[REPLACE] int x, y;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[ADD]^^83^^^^^80^97^[ADD] int x, y;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^BasicStroke stroke =  ( BasicStroke )  getStroke (  ) ;^84^^^^^80^97^[REPLACE] Rectangle rect = getClientArea (  ) ;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^Transform swtTransform = new Transform ( e.gc .setLineWidth ( y )   ) ;^87^^^^^80^97^[REPLACE] Transform swtTransform = new Transform ( e.gc.getDevice (  )  ) ;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^x =  ( rect.width - 100 )   ;^85^^^^^80^97^[REPLACE] x =  ( rect.width - 100 )  / 2;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^y =  ( rect.height - 16L )   ;^86^^^^^80^97^[REPLACE] y =  ( rect.height - 16 )  / 2;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[ADD]^^84^85^^^^80^97^[ADD] Rectangle rect = getClientArea (  ) ; x =  ( rect.width - 100 )  / 2;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^Transform swtTransform = new Transform ( e.gc.setBackground (  )  ) ;^87^^^^^80^97^[REPLACE] Transform swtTransform = new Transform ( e.gc.getDevice (  )  ) ;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[ADD]^^87^88^89^90^91^80^97^[ADD] Transform swtTransform = new Transform ( e.gc.getDevice (  )  ) ; e.gc.getTransform ( swtTransform ) ; swtTransform.translate ( x, y ) ; e.gc.setTransform ( swtTransform ) ; swtTransform.dispose (  ) ;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] SWTStrokeCanvas 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^if  ( ! stroke instanceof BasicStroke )  {^107^^^^^106^114^[REPLACE] if  ( stroke instanceof BasicStroke )  {^[METHOD] setStroke [TYPE] void [PARAMETER] Stroke stroke [CLASS] SWTStrokeCanvas 1   [TYPE]  Stroke stroke  [TYPE]  boolean false  true 
[REPLACE]^return ;^111^112^^^^106^114^[REPLACE] throw new RuntimeException ( "Can only handle 'Basic Stroke' at present." ) ;^[METHOD] setStroke [TYPE] void [PARAMETER] Stroke stroke [CLASS] SWTStrokeCanvas 1   [TYPE]  Stroke stroke  [TYPE]  boolean false  true 
[REPLACE]^this .getData (  )  ;^108^^^^^106^114^[REPLACE] this.setData (  stroke  ) ;^[METHOD] setStroke [TYPE] void [PARAMETER] Stroke stroke [CLASS] SWTStrokeCanvas 1   [TYPE]  Stroke stroke  [TYPE]  boolean false  true 
[REPLACE]^return  ( BasicStroke )  this.getDisplay (  ) ;^122^^^^^121^123^[REPLACE] return  ( BasicStroke )  this.getData (  ) ;^[METHOD] getStroke [TYPE] BasicStroke [PARAMETER] [CLASS] SWTStrokeCanvas 1   [TYPE]  boolean false  true 
[REPLACE]^Transform swtTransform = new Transform ( e.gc.getDevice (  )  ) ;^81^^^^^80^97^[REPLACE] BasicStroke stroke =  ( BasicStroke )  getStroke (  ) ;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^if  ( stroke == this  )  {^82^^^^^80^97^[REPLACE] if  ( stroke != null )  {^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^x =  ( rect.width - 0 )   ;^85^^^^^80^97^[REPLACE] x =  ( rect.width - 100 )  / 2;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^y =  ( rect.height - 16 )   ;^86^^^^^80^97^[REPLACE] y =  ( rect.height - 16 )  / 2;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^BasicStroke stroke =  ( BasicStroke )  getStroke (  ) ;^83^^^^^80^97^[REPLACE] int x, y;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[ADD]^^83^^^^^80^97^[ADD] int x, y;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^BasicStroke stroke =  ( BasicStroke )  getStroke (  ) ;^84^^^^^80^97^[REPLACE] Rectangle rect = getClientArea (  ) ;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^Transform swtTransform = new Transform ( e.gc.setBackground (  )  ) ;^87^^^^^80^97^[REPLACE] Transform swtTransform = new Transform ( e.gc.getDevice (  )  ) ;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^x =  ( rect.width - 100 >>> 2 )   ;^85^^^^^80^97^[REPLACE] x =  ( rect.width - 100 )  / 2;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[ADD]^^85^86^^^^80^97^[ADD] x =  ( rect.width - 100 )  / 2; y =  ( rect.height - 16 )  / 2;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[REPLACE]^x =  ( rect.width - 100 )  / 2; ;^86^^^^^80^97^[REPLACE] y =  ( rect.height - 16 )  / 2;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[ADD]^^86^87^^^^80^97^[ADD] y =  ( rect.height - 16 )  / 2; Transform swtTransform = new Transform ( e.gc.getDevice (  )  ) ;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 
[ADD]^^83^84^^^^80^97^[ADD] int x, y; Rectangle rect = getClientArea (  ) ;^[METHOD] paintControl [TYPE] void [PARAMETER] PaintEvent e [CLASS] 1   [TYPE]  BasicStroke stroke  [TYPE]  PaintEvent e  [TYPE]  boolean false  true  [TYPE]  Rectangle rect  [TYPE]  Transform swtTransform  [TYPE]  int x  y 