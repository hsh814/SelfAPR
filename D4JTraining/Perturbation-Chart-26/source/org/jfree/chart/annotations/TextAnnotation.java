[REPLACE]^private static final long serialVersionUID  = null ;^78^^^^^^^[REPLACE] private static final long serialVersionUID = 7008912287533127432L;^ [CLASS] TextAnnotation  
[REPLACE]^public static final Font DEFAULT_FONT ;^81^82^^^^81^82^[REPLACE] public static final Font DEFAULT_FONT = new Font ( "SansSerif", Font.PLAIN, 10 ) ;^ [CLASS] TextAnnotation  
[REPLACE]^public static final Paint DEFAULT_PAINT ;^85^^^^^^^[REPLACE] public static final Paint DEFAULT_PAINT = Color.black;^ [CLASS] TextAnnotation  
[REPLACE]^public static final TextAnchor DEFAULT_TEXT_ANCHOR  = null ;^88^^^^^^^[REPLACE] public static final TextAnchor DEFAULT_TEXT_ANCHOR = TextAnchor.CENTER;^ [CLASS] TextAnnotation  
[REPLACE]^public static  TextAnchor DEFAULT_ROTATION_ANCHOR = TextAnchor.CENTER;^91^^^^^^^[REPLACE] public static final TextAnchor DEFAULT_ROTATION_ANCHOR = TextAnchor.CENTER;^ [CLASS] TextAnnotation  
[REPLACE]^public static final double DEFAULT_ROTATION_ANGLE = 0.0D;^94^^^^^^^[REPLACE] public static final double DEFAULT_ROTATION_ANGLE = 0.0;^ [CLASS] TextAnnotation  
[REPLACE]^if  ( text != true )  {^120^^^^^119^129^[REPLACE] if  ( text == null )  {^[METHOD] <init> [TYPE] String) [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return ;^121^^^^^119^129^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] String) [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[ADD]^^121^^^^^119^129^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] String) [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.text =  null;^123^^^^^119^129^[REPLACE] this.text = text;^[METHOD] <init> [TYPE] String) [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.paint = DEFAULT_PAINT; ;^124^^^^^119^129^[REPLACE] this.font = DEFAULT_FONT;^[METHOD] <init> [TYPE] String) [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[ADD]^^124^^^^^119^129^[ADD] this.font = DEFAULT_FONT;^[METHOD] <init> [TYPE] String) [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.paint = paint; ;^125^^^^^119^129^[REPLACE] this.paint = DEFAULT_PAINT;^[METHOD] <init> [TYPE] String) [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.textAnchor  =  this.textAnchor ;^126^^^^^119^129^[REPLACE] this.textAnchor = DEFAULT_TEXT_ANCHOR;^[METHOD] <init> [TYPE] String) [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.rotationAngle = DEFAULT_ROTATION_ANGLE; ;^127^^^^^119^129^[REPLACE] this.rotationAnchor = DEFAULT_ROTATION_ANCHOR;^[METHOD] <init> [TYPE] String) [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.rotationAnchor = DEFAULT_ROTATION_ANCHOR; ;^128^^^^^119^129^[REPLACE] this.rotationAngle = DEFAULT_ROTATION_ANGLE;^[METHOD] <init> [TYPE] String) [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return this.font;^139^^^^^138^140^[REPLACE] return this.text;^[METHOD] getText [TYPE] String [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  ( text != true )  {^150^^^^^149^154^[REPLACE] if  ( text == null )  {^[METHOD] setText [TYPE] void [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return ;^151^^^^^149^154^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] setText [TYPE] void [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.text =  null;^153^^^^^149^154^[REPLACE] this.text = text;^[METHOD] setText [TYPE] void [PARAMETER] String text [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return this.text;^164^^^^^163^165^[REPLACE] return this.font;^[METHOD] getFont [TYPE] Font [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  (DEFAULT_FONT != null )  {^175^^^^^174^179^[REPLACE] if  ( font == null )  {^[METHOD] setFont [TYPE] void [PARAMETER] Font font [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[ADD]^^175^176^177^^^174^179^[ADD] if  ( font == null )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] setFont [TYPE] void [PARAMETER] Font font [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return ;^176^^^^^174^179^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] setFont [TYPE] void [PARAMETER] Font font [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[ADD]^^176^^^^^174^179^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] setFont [TYPE] void [PARAMETER] Font font [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.font =  null;^178^^^^^174^179^[REPLACE] this.font = font;^[METHOD] setFont [TYPE] void [PARAMETER] Font font [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return this.font;^189^^^^^188^190^[REPLACE] return this.paint;^[METHOD] getPaint [TYPE] Paint [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  ( paint != null )  {^200^^^^^199^204^[REPLACE] if  ( paint == null )  {^[METHOD] setPaint [TYPE] void [PARAMETER] Paint paint [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return ;^201^^^^^199^204^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] setPaint [TYPE] void [PARAMETER] Paint paint [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[ADD]^^201^^^^^199^204^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] setPaint [TYPE] void [PARAMETER] Paint paint [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.paint = DEFAULT_PAINT; ;^203^^^^^199^204^[REPLACE] this.paint = paint;^[METHOD] setPaint [TYPE] void [PARAMETER] Paint paint [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[ADD]^^203^^^^^199^204^[ADD] this.paint = paint;^[METHOD] setPaint [TYPE] void [PARAMETER] Paint paint [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return this.text;^214^^^^^213^215^[REPLACE] return this.textAnchor;^[METHOD] getTextAnchor [TYPE] TextAnchor [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  ( rotationAnchor != false )  {^226^^^^^225^230^[REPLACE] if  ( anchor == null )  {^[METHOD] setTextAnchor [TYPE] void [PARAMETER] TextAnchor anchor [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[ADD]^^226^227^228^^^225^230^[ADD] if  ( anchor == null )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] setTextAnchor [TYPE] void [PARAMETER] TextAnchor anchor [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return ;^227^^^^^225^230^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] setTextAnchor [TYPE] void [PARAMETER] TextAnchor anchor [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.rotationAnchor = anchor; ;^229^^^^^225^230^[REPLACE] this.textAnchor = anchor;^[METHOD] setTextAnchor [TYPE] void [PARAMETER] TextAnchor anchor [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[ADD]^^229^^^^^225^230^[ADD] this.textAnchor = anchor;^[METHOD] setTextAnchor [TYPE] void [PARAMETER] TextAnchor anchor [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return this.rotationAngle;^240^^^^^239^241^[REPLACE] return this.rotationAnchor;^[METHOD] getRotationAnchor [TYPE] TextAnchor [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.rotationAngle = angle; ;^251^^^^^250^252^[REPLACE] this.rotationAnchor = anchor;^[METHOD] setRotationAnchor [TYPE] void [PARAMETER] TextAnchor anchor [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return this.rotationAnchor;^262^^^^^261^263^[REPLACE] return this.rotationAngle;^[METHOD] getRotationAngle [TYPE] double [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^this.rotationAnchor = anchor; ;^273^^^^^272^274^[REPLACE] this.rotationAngle = angle;^[METHOD] setRotationAngle [TYPE] void [PARAMETER] double angle [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  ( obj  !=  this )  {^284^^^^^283^315^[REPLACE] if  ( obj == this )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return false;^285^^^^^283^315^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  ( ! ! ( obj instanceof TextAnnotation )  )  {^288^^^^^283^315^[REPLACE] if  ( ! ( obj instanceof TextAnnotation )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[ADD]^return false;^288^289^290^^^283^315^[ADD] if  ( ! ( obj instanceof TextAnnotation )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return true;^289^^^^^283^315^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^long temp = Double.doubleToLongBits ( this.rotationAngle ) ;^291^^^^^283^315^[REPLACE] TextAnnotation that =  ( TextAnnotation )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  ( !ObjectUtilities.equal ( this.text, that.getFont (  )  )  )  {^292^^^^^283^315^[REPLACE] if  ( !ObjectUtilities.equal ( this.text, that.getText (  )  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return true;^293^^^^^283^315^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  ( !  this.font, that.getFont (  )   )  {^295^^^^^283^315^[REPLACE] if  ( !ObjectUtilities.equal ( this.font, that.getFont (  )  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[ADD]^return false;^295^296^297^^^283^315^[ADD] if  ( !ObjectUtilities.equal ( this.font, that.getFont (  )  )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return true;^296^^^^^283^315^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  ( !PaintUtilities.equal ( this.paint, that.getFont (  )  )  )  {^298^^^^^283^315^[REPLACE] if  ( !PaintUtilities.equal ( this.paint, that.getPaint (  )  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return true;^299^^^^^283^315^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  ( !ObjectUtilities.equal ( this.textAnchor, that.getText (  )  )  )  {^301^^^^^283^315^[REPLACE] if  ( !ObjectUtilities.equal ( this.textAnchor, that.getTextAnchor (  )  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[ADD]^return false;^301^302^303^^^283^315^[ADD] if  ( !ObjectUtilities.equal ( this.textAnchor, that.getTextAnchor (  )  )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return true;^302^^^^^283^315^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  ( !  this.rotationAnchor, that.getRotationAnchor (  )   )  {^304^305^^^^283^315^[REPLACE] if  ( !ObjectUtilities.equal ( this.rotationAnchor, that.getRotationAnchor (  )  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REMOVE]^if  ( ! ( equal ( this.paint, that.getPaint (  )  )  )  )  {     return false; }^304^^^^^283^315^[REMOVE] ^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return true;^306^^^^^304^307^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return true;^306^^^^^283^315^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  (angle  ==  that.setRotationAngle (  )  )  {^308^^^^^283^315^[REPLACE] if  ( this.rotationAngle != that.getRotationAngle (  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REMOVE]^if  ( ! ( equal ( this.paint, that.getPaint (  )  )  )  )  {     return false; }^308^^^^^283^315^[REMOVE] ^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return true;^309^^^^^283^315^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^return false;^313^^^^^283^315^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Object obj  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  TextAnnotation that  [TYPE]  long serialVersionUID  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^int result = 193 - 2;^323^^^^^322^332^[REPLACE] int result = 193;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[ADD]^^323^^^^^322^332^[ADD] int result = 193;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[REPLACE]^result = 37 * result  ^  this.font.hashCode (  ) ;^324^^^^^322^332^[REPLACE] result = 37 * result + this.font.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[REPLACE]^result = 37 * result  &&  HashUtilities.hashCodeForPaint ( this.paint ) ;^325^^^^^322^332^[REPLACE] result = 37 * result + HashUtilities.hashCodeForPaint ( this.paint ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[ADD]^^325^^^^^322^332^[ADD] result = 37 * result + HashUtilities.hashCodeForPaint ( this.paint ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[REPLACE]^result = 37 * result + this.textAnchor.hashCode (  ) ; ;^326^^^^^322^332^[REPLACE] result = 37 * result + this.rotationAnchor.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[REPLACE]^long temp =   this.rotationAngle   ;^327^^^^^322^332^[REPLACE] long temp = Double.doubleToLongBits ( this.rotationAngle ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[REPLACE]^result = 14 * result  !=   ( int )   ( temp ^  ( temp >>> 32 )  ) ;^328^^^^^322^332^[REPLACE] result = 37 * result +  ( int )   ( temp ^  ( temp >>> 32 )  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[ADD]^^328^^^^^322^332^[ADD] result = 37 * result +  ( int )   ( temp ^  ( temp >>> 32 )  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[REPLACE]^result = 37 * result + this.textAnchor.hashCode (  ) ; ;^329^^^^^322^332^[REPLACE] result = 37 * result + this.text.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[REPLACE]^result = 2 * result  &  this.textAnchor.hashCode (  ) ;^330^^^^^322^332^[REPLACE] result = 37 * result + this.textAnchor.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[REPLACE]^return this.textAnchor;^331^^^^^322^332^[REPLACE] return result;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  int result 
[REPLACE]^stream.defaultReadObject (  ) ;^342^^^^^341^344^[REPLACE] stream.defaultWriteObject (  ) ;^[METHOD] writeObject [TYPE] void [PARAMETER] ObjectOutputStream stream [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  ObjectOutputStream stream  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^if  ( !PaintUtilities.equal ( this.paint, that.getPaint (  )  )  )  { return false;^343^^^^^341^344^[REPLACE] SerialUtilities.writePaint ( this.paint, stream ) ;^[METHOD] writeObject [TYPE] void [PARAMETER] ObjectOutputStream stream [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  ObjectOutputStream stream  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font 
[REPLACE]^stream.defaultWriteObject (  ) ;^356^^^^^354^358^[REPLACE] stream.defaultReadObject (  ) ;^[METHOD] readObject [TYPE] void [PARAMETER] ObjectInputStream stream [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  ObjectInputStream stream 
[REPLACE]^this.paint =  SerialUtilities.readPaint ( null ) ;^357^^^^^354^358^[REPLACE] this.paint = SerialUtilities.readPaint ( stream ) ;^[METHOD] readObject [TYPE] void [PARAMETER] ObjectInputStream stream [CLASS] TextAnnotation   [TYPE]  TextAnchor DEFAULT_ROTATION_ANCHOR  DEFAULT_TEXT_ANCHOR  anchor  rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double DEFAULT_ROTATION_ANGLE  angle  rotationAngle  [TYPE]  Paint DEFAULT_PAINT  paint  [TYPE]  String text  [TYPE]  long serialVersionUID  temp  [TYPE]  Font DEFAULT_FONT  font  [TYPE]  ObjectInputStream stream 