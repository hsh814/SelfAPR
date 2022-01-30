[REPLACE]^private static final long serialVersionUID ;^70^^^^^^^[REPLACE] private static final long serialVersionUID = 4961579220410228283L;^ [CLASS] BlockBorder  
[REPLACE]^public static final BlockBorder NONE ;^73^74^^^^73^74^[REPLACE] public static final BlockBorder NONE = new BlockBorder ( RectangleInsets.ZERO_INSETS, Color.white ) ;^ [CLASS] BlockBorder  
[REPLACE]^double w = area.getWidth (  ) ;^86^^^^^85^87^[REPLACE] this ( Color.black ) ;^[METHOD] <init> [TYPE] BlockBorder() [PARAMETER] [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE 
[REPLACE]^this ( new RectangleInsets ( 3, 3, 3, 3 ) , paint ) ;^95^^^^^94^96^[REPLACE] this ( new RectangleInsets ( 1, 1, 1, 1 ) , paint ) ;^[METHOD] <init> [TYPE] Paint) [PARAMETER] Paint paint [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE 
[REPLACE]^this ( new RectangleInsets ( top, left, top, right ) , Color.black ) ;^107^^^^^106^108^[REPLACE] this ( new RectangleInsets ( top, left, bottom, right ) , Color.black ) ;^[METHOD] <init> [TYPE] BlockBorder(double,double,double,double) [PARAMETER] double top double left double bottom double right [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double bottom  left  right  top  [TYPE]  BlockBorder NONE 
[ADD]^^107^^^^^106^108^[ADD] this ( new RectangleInsets ( top, left, bottom, right ) , Color.black ) ;^[METHOD] <init> [TYPE] BlockBorder(double,double,double,double) [PARAMETER] double top double left double bottom double right [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double bottom  left  right  top  [TYPE]  BlockBorder NONE 
[REPLACE]^this ( new RectangleInsets ( bottom, left, bottom, right ) , paint ) ;^121^^^^^119^122^[REPLACE] this ( new RectangleInsets ( top, left, bottom, right ) , paint ) ;^[METHOD] <init> [TYPE] Paint) [PARAMETER] double top double left double bottom double right Paint paint [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double bottom  left  right  top  [TYPE]  BlockBorder NONE 
[REPLACE]^if  ( insets != true )  {^131^^^^^130^139^[REPLACE] if  ( insets == null )  {^[METHOD] <init> [TYPE] Paint) [PARAMETER] RectangleInsets insets Paint paint [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE 
[REPLACE]^return ;^132^^^^^130^139^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] Paint) [PARAMETER] RectangleInsets insets Paint paint [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE 
[ADD]^^132^^^^^130^139^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] Paint) [PARAMETER] RectangleInsets insets Paint paint [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE 
[REPLACE]^if  ( paint != false )  {^134^^^^^130^139^[REPLACE] if  ( paint == null )  {^[METHOD] <init> [TYPE] Paint) [PARAMETER] RectangleInsets insets Paint paint [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE 
[REPLACE]^return ;^135^^^^^130^139^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] Paint) [PARAMETER] RectangleInsets insets Paint paint [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE 
[REPLACE]^this.insets =  null;^137^^^^^130^139^[REPLACE] this.insets = insets;^[METHOD] <init> [TYPE] Paint) [PARAMETER] RectangleInsets insets Paint paint [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE 
[REPLACE]^this.paint =  null;^138^^^^^130^139^[REPLACE] this.paint = paint;^[METHOD] <init> [TYPE] Paint) [PARAMETER] RectangleInsets insets Paint paint [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE 
[REPLACE]^return false;^147^^^^^146^148^[REPLACE] return this.insets;^[METHOD] getInsets [TYPE] RectangleInsets [PARAMETER] [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE 
[REPLACE]^return this.insets;^156^^^^^155^157^[REPLACE] return this.paint;^[METHOD] getPaint [TYPE] Paint [PARAMETER] [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE 
[REPLACE]^double t = this.insets.calculateTopInset ( rect.getHeight (  )  ) ;^168^^^^^165^194^[REPLACE] double t = this.insets.calculateTopInset ( area.getHeight (  )  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^double b = this.insets.calculateTopInset ( rect.getHeight (  )  ) ;^169^^^^^165^194^[REPLACE] double b = this.insets.calculateBottomInset ( area.getHeight (  )  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^double l = this.insets.calculateLeftInset ( rect.getWidth (  )  ) ;^170^^^^^165^194^[REPLACE] double l = this.insets.calculateLeftInset ( area.getWidth (  )  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^double r = this.insets.calculateRightInset ( rect.getWidth (  )  ) ;^171^^^^^165^194^[REPLACE] double r = this.insets.calculateRightInset ( area.getWidth (  )  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[ADD]^double x = area.getX (  ) ;^171^172^^^^165^194^[ADD] double r = this.insets.calculateRightInset ( area.getWidth (  )  ) ; double x = area.getX (  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^double x = rect.getX (  ) ;^172^^^^^165^194^[REPLACE] double x = area.getX (  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[ADD]^^172^173^^^^165^194^[ADD] double x = area.getX (  ) ; double y = area.getY (  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^double y = area.getX (  ) ;^173^^^^^165^194^[REPLACE] double y = area.getY (  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^double w = rect .getHeight (  )  ;^174^^^^^165^194^[REPLACE] double w = area.getWidth (  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^double h = rect.getWidth (  ) ;^175^^^^^165^194^[REPLACE] double h = area.getHeight (  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^g2.fill ( this.paint ) ;^176^^^^^165^194^[REPLACE] g2.setPaint ( this.paint ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[ADD]^^176^177^^^^165^194^[ADD] g2.setPaint ( this.paint ) ; Rectangle2D rect = new Rectangle2D.Double (  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^double w = area.getWidth (  ) ;^177^^^^^165^194^[REPLACE] Rectangle2D rect = new Rectangle2D.Double (  ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^if  ( t  ==  0.0 )  {^178^^^^^165^194^[REPLACE] if  ( t > 0.0 )  {^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^rect.setRect ( x, y, l, h ) ;^179^^^^^165^194^[REPLACE] rect.setRect ( x, y, w, t ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REMOVE]^stream.defaultWriteObject (  ) ;^179^^^^^165^194^[REMOVE] ^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^g2.fill ( area ) ;^180^^^^^165^194^[REPLACE] g2.fill ( rect ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^if  ( b  >=  0.0 )  {^182^^^^^165^194^[REPLACE] if  ( b > 0.0 )  {^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^rect.setRect ( x, y + h -y, w,y ) ;^183^^^^^165^194^[REPLACE] rect.setRect ( x, y + h - b, w, b ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^g2.setPaint ( rect ) ;^184^^^^^165^194^[REPLACE] g2.fill ( rect ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^if  ( l  <=  0.0 )  {^186^^^^^165^194^[REPLACE] if  ( l > 0.0 )  {^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^rect.setRect ( x, y, w, t ) ;^187^^^^^165^194^[REPLACE] rect.setRect ( x, y, l, h ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[ADD]^g2.fill ( rect ) ;^187^188^^^^165^194^[ADD] rect.setRect ( x, y, l, h ) ; g2.fill ( rect ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^g2.setPaint ( rect ) ;^188^^^^^165^194^[REPLACE] g2.fill ( rect ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^if  ( r  <=  0.0D )  {^190^^^^^165^194^[REPLACE] if  ( r > 0.0 )  {^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REMOVE]^if  ( l > 0.0 )  {     rect.setRect ( x, y, l, h ) ;     g2.fill ( rect ) ; }^190^^^^^165^194^[REMOVE] ^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^rect.setRect ( x + w -x, y,x, h ) ;^191^^^^^165^194^[REPLACE] rect.setRect ( x + w - r, y, r, h ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[ADD]^^191^^^^^165^194^[ADD] rect.setRect ( x + w - r, y, r, h ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^g2.setPaint ( rect ) ;^192^^^^^165^194^[REPLACE] g2.fill ( rect ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[ADD]^^192^^^^^165^194^[ADD] g2.fill ( rect ) ;^[METHOD] draw [TYPE] void [PARAMETER] Graphics2D g2 Rectangle2D area [CLASS] BlockBorder   [TYPE]  boolean false  true  [TYPE]  double b  h  l  r  t  w  x  y  [TYPE]  BlockBorder NONE  [TYPE]  Rectangle2D area  rect  [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  long serialVersionUID  [TYPE]  Graphics2D g2 
[REPLACE]^if  ( obj  ||  this )  {^204^^^^^203^218^[REPLACE] if  ( obj == this )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Object obj  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[ADD]^^204^205^206^^^203^218^[ADD] if  ( obj == this )  { return true; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Object obj  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^return false;^205^^^^^203^218^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Object obj  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^if  ( ! ! ( obj instanceof BlockBorder )  )  {^207^^^^^203^218^[REPLACE] if  ( ! ( obj instanceof BlockBorder )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Object obj  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^return true;^208^^^^^203^218^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Object obj  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^double w = area.getWidth (  ) ;^210^^^^^203^218^[REPLACE] BlockBorder that =  ( BlockBorder )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Object obj  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^if  ( !this.insets.calculateRightInset ( that.insets )  )  {^211^^^^^203^218^[REPLACE] if  ( !this.insets.equals ( that.insets )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Object obj  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^return true;^212^^^^^203^218^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Object obj  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^if  ( !  this.paint, that.paint    )  {^214^^^^^203^218^[REPLACE] if  ( !PaintUtilities.equal ( this.paint, that.paint )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Object obj  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^return true;^215^^^^^203^218^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Object obj  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^return false;^217^^^^^203^218^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Object obj  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^stream.defaultReadObject (  ) ;^228^^^^^227^230^[REPLACE] stream.defaultWriteObject (  ) ;^[METHOD] writeObject [TYPE] void [PARAMETER] ObjectOutputStream stream [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  ObjectOutputStream stream  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^SerialUtilities .readPaint ( null )  ;^229^^^^^227^230^[REPLACE] SerialUtilities.writePaint ( this.paint, stream ) ;^[METHOD] writeObject [TYPE] void [PARAMETER] ObjectOutputStream stream [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  ObjectOutputStream stream  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[ADD]^^229^^^^^227^230^[ADD] SerialUtilities.writePaint ( this.paint, stream ) ;^[METHOD] writeObject [TYPE] void [PARAMETER] ObjectOutputStream stream [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  ObjectOutputStream stream  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that 
[REPLACE]^stream.defaultWriteObject (  ) ;^242^^^^^240^244^[REPLACE] stream.defaultReadObject (  ) ;^[METHOD] readObject [TYPE] void [PARAMETER] ObjectInputStream stream [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that  [TYPE]  ObjectInputStream stream 
[REPLACE]^this.paint =  SerialUtilities.readPaint ( null ) ;^243^^^^^240^244^[REPLACE] this.paint = SerialUtilities.readPaint ( stream ) ;^[METHOD] readObject [TYPE] void [PARAMETER] ObjectInputStream stream [CLASS] BlockBorder   [TYPE]  RectangleInsets insets  [TYPE]  Paint paint  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  BlockBorder NONE  that  [TYPE]  ObjectInputStream stream 