[buglab_swap_variables]^g2.setRenderingHint ( RenderingHints. RenderingHints.VALUE_ANTIALIAS_ON ) ;^121^122^^^^106^136^g2.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^double xx = insets.left.left;^125^^^^^110^140^double xx = insets.left;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^double xx = insets;^125^^^^^110^140^double xx = insets.left;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^double yy = insets.top.top;^126^^^^^111^141^double yy = insets.top;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^double yy = insets;^126^^^^^111^141^double yy = insets.top;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^double ww = insets.left.getWidth (  )  - size - insets.right;^127^^^^^112^142^double ww = size.getWidth (  )  - insets.left - insets.right;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^double ww = size.getWidth (  )  - insets.right.left - insets;^127^^^^^112^142^double ww = size.getWidth (  )  - insets.left - insets.right;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^double ww = size.getWidth (  )  - insets.right - insets.left;^127^^^^^112^142^double ww = size.getWidth (  )  - insets.left - insets.right;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^double hh = insets.top.getHeight (  )  - size - insets.bottom;^128^^^^^113^143^double hh = size.getHeight (  )  - insets.top - insets.bottom;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^double hh = size.getHeight (  )  - insets.top.top - insets.bottom;^128^^^^^113^143^double hh = size.getHeight (  )  - insets.top - insets.bottom;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^double hh = size.getHeight (  )  - insets.bottom - insets.top;^128^^^^^113^143^double hh = size.getHeight (  )  - insets.top - insets.bottom;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Point2D one =  new Point2D.Double ( yy + 6, xx + hh / 2 ) ;^130^^^^^115^145^Point2D one =  new Point2D.Double ( xx + 6, yy + hh / 2 ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Point2D one =  new Point2D.Double ( xx + 6 + hh / 2 ) ;^130^^^^^115^145^Point2D one =  new Point2D.Double ( xx + 6, yy + hh / 2 ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Point2D one =  new Point2D.Double ( hh + 6, yy + xx / 2 ) ;^130^^^^^115^145^Point2D one =  new Point2D.Double ( xx + 6, yy + hh / 2 ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Point2D one =  new Point2D.Double ( xx + 6, hh + yy / 2 ) ;^130^^^^^115^145^Point2D one =  new Point2D.Double ( xx + 6, yy + hh / 2 ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Point2D two =  new Point2D.Double ( ww + xx - 6, yy + hh / 2 ) ;^131^^^^^116^146^Point2D two =  new Point2D.Double ( xx + ww - 6, yy + hh / 2 ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Point2D two =  new Point2D.Double ( xx + yy - 6, ww + hh / 2 ) ;^131^^^^^116^146^Point2D two =  new Point2D.Double ( xx + ww - 6, yy + hh / 2 ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Point2D two =  new Point2D.Double ( xx + ww - 6, hh + yy / 2 ) ;^131^^^^^116^146^Point2D two =  new Point2D.Double ( xx + ww - 6, yy + hh / 2 ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Point2D two =  new Point2D.Double ( xx + ww - 6 + hh / 2 ) ;^131^^^^^116^146^Point2D two =  new Point2D.Double ( xx + ww - 6, yy + hh / 2 ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Point2D two =  new Point2D.Double ( xx + hh - 6, yy + ww / 2 ) ;^131^^^^^116^146^Point2D two =  new Point2D.Double ( xx + ww - 6, yy + hh / 2 ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Point2D two =  new Point2D.Double ( yy + ww - 6, xx + hh / 2 ) ;^131^^^^^116^146^Point2D two =  new Point2D.Double ( xx + ww - 6, yy + hh / 2 ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Line2D line = new Line2D.Double ( two, one ) ;^142^^^^^127^157^Line2D line = new Line2D.Double ( one, two ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Line2D line = new Line2D.Double (  two ) ;^142^^^^^127^157^Line2D line = new Line2D.Double ( one, two ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^Line2D line = new Line2D.Double ( one ) ;^142^^^^^127^157^Line2D line = new Line2D.Double ( one, two ) ;^[CLASS] StrokeSample  [METHOD] paintComponent [RETURN_TYPE] void   Graphics g [VARIABLES] Graphics  g  Stroke  stroke  Insets  insets  boolean  Point2D  one  two  double  hh  ww  xx  yy  Dimension  preferredSize  size  Line2D  line  Ellipse2D  circle1  circle2  Graphics2D  g2  
[buglab_swap_variables]^if  ( in valuestanceof StrokeSample )  {^167^^^^^165^172^if  ( value instanceof StrokeSample )  {^[CLASS] StrokeSample  [METHOD] getListCellRendererComponent [RETURN_TYPE] Component   JList list Object value int index boolean isSelected boolean cellHasFocus [VARIABLES] Stroke  stroke  boolean  cellHasFocus  isSelected  Object  value  Dimension  preferredSize  size  StrokeSample  in  JList  list  int  index  