[P1_Replace_Type]^private static final  int  serialVersionUID = 6215321387896748945L;^63^^^^^58^68^private static final long serialVersionUID = 6215321387896748945L;^[CLASS] LineNeedle   [VARIABLES] 
[P8_Replace_Mix]^private static  long serialVersionUID = 6215321387896748945;^63^^^^^58^68^private static final long serialVersionUID = 6215321387896748945L;^[CLASS] LineNeedle   [VARIABLES] 
[P1_Replace_Type]^float x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ;^78^^^^^73^91^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P2_Replace_Operator]^double x = plotArea.getMinX (  >  )  +  ( plotArea.getWidth (  )  / 2 ) ;^78^^^^^73^91^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P2_Replace_Operator]^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  * 2 ) ;^78^^^^^73^91^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P3_Replace_Literal]^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  /  ) ;^78^^^^^73^91^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P7_Replace_Invocation]^double x = plotArea .getMinY (  )   +  ( plotArea.getWidth (  )  / 2 ) ;^78^^^^^73^91^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P14_Delete_Statement]^^78^^^^^73^91^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P11_Insert_Donor_Statement]^shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ;^78^^^^^73^91^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P7_Replace_Invocation]^double x = plotArea.getMinX (  )  +  ( plotArea .getMinX (  )   / 2 ) ;^78^^^^^73^91^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P14_Delete_Statement]^^78^79^^^^73^91^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ; shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^shape.setLine ( angle, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^79^^^^^73^91^shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^shape.setLine (  plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^79^^^^^73^91^shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^shape.setLine ( x.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^79^^^^^73^91^shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^shape.setLine ( plotArea, x.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^79^^^^^73^91^shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P7_Replace_Invocation]^shape.setLine ( x, plotArea .getMinX (  )  , x, plotArea.getMaxY (  )  ) ;^79^^^^^73^91^shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P7_Replace_Invocation]^shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea .getMinY (  )   ) ;^79^^^^^73^91^shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P14_Delete_Statement]^^79^^^^^73^91^shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P11_Insert_Donor_Statement]^double x = plotArea.getMinX (  )  +  ( plotArea.getWidth (  )  / 2 ) ;shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^79^^^^^73^91^shape.setLine ( x, plotArea.getMinY (  ) , x, plotArea.getMaxY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P2_Replace_Operator]^if  (  ( rotate != null )  ||  ( angle != 0 )  )  {^83^^^^^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P2_Replace_Operator]^if  (  ( rotate == null )  &&  ( angle != 0 )  )  {^83^^^^^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P2_Replace_Operator]^if  (  ( rotate != null )  &&  ( angle == 0 )  )  {^83^^^^^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P3_Replace_Literal]^if  (  ( rotate != null )  &&  ( angle != 8 )  )  {^83^^^^^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^if  (  ( rotate != null )  &&  ( x != 0 )  )  {^83^^^^^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^if  (  ( angle != null )  &&  ( rotate != 0 )  )  {^83^^^^^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P6_Replace_Expression]^if  (  ( rotate != null )  ) {^83^^^^^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P6_Replace_Expression]^if  (   ( angle != 0 )  )  {^83^^^^^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P6_Replace_Expression]^if  ( rotate != null )  {^83^^^^^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P6_Replace_Expression]^if  ( angle != 0 )  {^83^^^^^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P15_Unwrap_Block]^getTransform().setToRotation(angle, rotate.getX(), rotate.getY()); s = getTransform().createTransformedShape(s);^83^84^85^86^87^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {  getTransform (  ) .setToRotation ( angle, rotate.getX (  ) , rotate.getY (  )  ) ; s = getTransform (  ) .createTransformedShape ( s ) ; }^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P16_Remove_Block]^^83^84^85^86^87^73^91^if  (  ( rotate != null )  &&  ( angle != 0 )  )  {  getTransform (  ) .setToRotation ( angle, rotate.getX (  ) , rotate.getY (  )  ) ; s = getTransform (  ) .createTransformedShape ( s ) ; }^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P7_Replace_Invocation]^s = getTransform (  )  .getTransform (  )  ;^86^^^^^73^91^s = getTransform (  ) .createTransformedShape ( s ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P8_Replace_Mix]^s =  getTrannullform (  ) .createTrannullformedShape ( null ) ;^86^^^^^73^91^s = getTransform (  ) .createTransformedShape ( s ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^getTransform (  ) .setToRotation ( x, rotate.getX (  ) , rotate.getY (  )  ) ;^85^^^^^73^91^getTransform (  ) .setToRotation ( angle, rotate.getX (  ) , rotate.getY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^getTransform (  ) .setToRotation (  rotate.getX (  ) , rotate.getY (  )  ) ;^85^^^^^73^91^getTransform (  ) .setToRotation ( angle, rotate.getX (  ) , rotate.getY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^getTransform (  ) .setToRotation ( angle.getX (  ) , rotate.getY (  )  ) ;^85^^^^^73^91^getTransform (  ) .setToRotation ( angle, rotate.getX (  ) , rotate.getY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^getTransform (  ) .setToRotation ( rotate, angle.getX (  ) , rotate.getY (  )  ) ;^85^^^^^73^91^getTransform (  ) .setToRotation ( angle, rotate.getX (  ) , rotate.getY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P7_Replace_Invocation]^getTransform (  )  .getTransform (  )   ) ;^85^^^^^73^91^getTransform (  ) .setToRotation ( angle, rotate.getX (  ) , rotate.getY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P7_Replace_Invocation]^getTransform (  ) .setToRotation ( angle, rotate.getX (  ) , rotate .getX (  )   ) ;^85^^^^^73^91^getTransform (  ) .setToRotation ( angle, rotate.getX (  ) , rotate.getY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P14_Delete_Statement]^^85^86^87^^^73^91^getTransform (  ) .setToRotation ( angle, rotate.getX (  ) , rotate.getY (  )  ) ; s = getTransform (  ) .createTransformedShape ( s ) ; }^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P7_Replace_Invocation]^getTransform (  ) .setToRotation ( angle, rotate .getY (  )  , rotate.getY (  )  ) ;^85^^^^^73^91^getTransform (  ) .setToRotation ( angle, rotate.getX (  ) , rotate.getY (  )  ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P14_Delete_Statement]^^86^87^^^^73^91^s = getTransform (  ) .createTransformedShape ( s ) ; }^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^defaultDisplay (  s ) ;^89^^^^^73^91^defaultDisplay ( g2, s ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^defaultDisplay ( g2 ) ;^89^^^^^73^91^defaultDisplay ( g2, s ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P5_Replace_Variable]^defaultDisplay ( s, g2 ) ;^89^^^^^73^91^defaultDisplay ( g2, s ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P14_Delete_Statement]^^89^^^^^73^91^defaultDisplay ( g2, s ) ;^[CLASS] LineNeedle  [METHOD] drawNeedle [RETURN_TYPE] void   Graphics2D g2 Rectangle2D plotArea Point2D rotate double angle [VARIABLES] Shape  s  boolean  Point2D  rotate  double  angle  x  Rectangle2D  plotArea  Line2D  shape  long  serialVersionUID  Graphics2D  g2  
[P2_Replace_Operator]^if  ( obj <= this )  {^101^^^^^100^111^if  ( obj == this )  {^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P15_Unwrap_Block]^return true;^101^102^103^^^100^111^if  ( obj == this )  { return true; }^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P16_Remove_Block]^^101^102^103^^^100^111^if  ( obj == this )  { return true; }^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P13_Insert_Block]^if  ( ! ( super.equals ( obj )  )  )  {     return false; }^101^^^^^100^111^[Delete]^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P3_Replace_Literal]^return false;^102^^^^^100^111^return true;^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P2_Replace_Operator]^if  ( ! ( obj  !=  LineNeedle )  )  {^104^^^^^100^111^if  ( ! ( obj instanceof LineNeedle )  )  {^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P15_Unwrap_Block]^return false;^104^105^106^^^100^111^if  ( ! ( obj instanceof LineNeedle )  )  { return false; }^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P16_Remove_Block]^^104^105^106^^^100^111^if  ( ! ( obj instanceof LineNeedle )  )  { return false; }^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P3_Replace_Literal]^return true;^105^^^^^100^111^return false;^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P8_Replace_Mix]^if  ( super.equals ( obj )  )  {^107^^^^^100^111^if  ( !super.equals ( obj )  )  {^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P15_Unwrap_Block]^return false;^107^108^109^^^100^111^if  ( !super.equals ( obj )  )  { return false; }^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P16_Remove_Block]^^107^108^109^^^100^111^if  ( !super.equals ( obj )  )  { return false; }^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P13_Insert_Block]^if  ( obj ==  ( this )  )  {     return true; }^107^^^^^100^111^[Delete]^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P3_Replace_Literal]^return true;^108^^^^^100^111^return false;^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P3_Replace_Literal]^return false;^110^^^^^100^111^return true;^[CLASS] LineNeedle  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  serialVersionUID  Object  obj  boolean  
[P7_Replace_Invocation]^return super.equals (  ) ;^122^^^^^121^123^return super.clone (  ) ;^[CLASS] LineNeedle  [METHOD] clone [RETURN_TYPE] Object   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return super .clone (  )  ;^122^^^^^121^123^return super.clone (  ) ;^[CLASS] LineNeedle  [METHOD] clone [RETURN_TYPE] Object   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^122^^^^^121^123^return super.clone (  ) ;^[CLASS] LineNeedle  [METHOD] clone [RETURN_TYPE] Object   [VARIABLES] long  serialVersionUID  boolean  
