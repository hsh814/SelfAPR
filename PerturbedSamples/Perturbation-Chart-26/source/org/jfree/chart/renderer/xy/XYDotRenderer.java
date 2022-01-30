[REPLACE]^private static final long serialVersionUID  = null ;^80^^^^^^^[REPLACE] private static final long serialVersionUID = -2764344339073566425L;^ [CLASS] XYDotRenderer  
[REPLACE]^private  long  dotHeight;^86^^^^^^^[REPLACE] private int dotHeight;^ [CLASS] XYDotRenderer  
[REPLACE]^return super.clone (  ) ;^92^^^^^91^95^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] XYDotRenderer() [PARAMETER] [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  [TYPE]  boolean false  true 
[REPLACE]^this.dotWidth = 1 * 2;^93^^^^^91^95^[REPLACE] this.dotWidth = 1;^[METHOD] <init> [TYPE] XYDotRenderer() [PARAMETER] [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  [TYPE]  boolean false  true 
[REPLACE]^this.dotWidth = 1; ;^94^^^^^91^95^[REPLACE] this.dotHeight = 1;^[METHOD] <init> [TYPE] XYDotRenderer() [PARAMETER] [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  [TYPE]  boolean false  true 
[ADD]^^94^^^^^91^95^[ADD] this.dotHeight = 1;^[METHOD] <init> [TYPE] XYDotRenderer() [PARAMETER] [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  [TYPE]  boolean false  true 
[REPLACE]^return this.dotHeight;^106^^^^^105^107^[REPLACE] return this.dotWidth;^[METHOD] getDotWidth [TYPE] int [PARAMETER] [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  [TYPE]  boolean false  true 
[REPLACE]^if  ( w  >= dotWidth )  {^121^^^^^120^126^[REPLACE] if  ( w < 1 )  {^[METHOD] setDotWidth [TYPE] void [PARAMETER] int w [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  w  [TYPE]  boolean false  true 
[REPLACE]^return ;^122^^^^^120^126^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] setDotWidth [TYPE] void [PARAMETER] int w [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  w  [TYPE]  boolean false  true 
[REPLACE]^this.dotWidth = 1; ;^124^^^^^120^126^[REPLACE] this.dotWidth = w;^[METHOD] setDotWidth [TYPE] void [PARAMETER] int w [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  w  [TYPE]  boolean false  true 
[REPLACE]^return false;^137^^^^^136^138^[REPLACE] return this.dotHeight;^[METHOD] getDotHeight [TYPE] int [PARAMETER] [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  w  [TYPE]  boolean false  true 
[REPLACE]^if  ( h  <=  1 )  {^152^^^^^151^157^[REPLACE] if  ( h < 1 )  {^[METHOD] setDotHeight [TYPE] void [PARAMETER] int h [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  h  w  [TYPE]  boolean false  true 
[REPLACE]^return ;^153^^^^^151^157^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] setDotHeight [TYPE] void [PARAMETER] int h [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  h  w  [TYPE]  boolean false  true 
[REPLACE]^this.dotHeight = 1; ;^155^^^^^151^157^[REPLACE] this.dotHeight = h;^[METHOD] setDotHeight [TYPE] void [PARAMETER] int h [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  h  w  [TYPE]  boolean false  true 
[ADD]^^155^^^^^151^157^[ADD] this.dotHeight = h;^[METHOD] setDotHeight [TYPE] void [PARAMETER] int h [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  h  w  [TYPE]  boolean false  true 
[ADD]^^156^157^^^^151^157^[ADD] notifyListeners ( new RendererChangeEvent ( this )  ) ; }^[METHOD] setDotHeight [TYPE] void [PARAMETER] int h [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int dotHeight  dotWidth  h  w  [TYPE]  boolean false  true 
[REPLACE]^double x = dataset .getYValue ( w , dotWidth )  ;^191^^^^^188^220^[REPLACE] double x = dataset.getXValue ( series, item ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[ADD]^^191^^^^^188^220^[ADD] double x = dataset.getXValue ( series, item ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^double y = dataset.getYValue ( series, rangeAxisIndex ) ;^192^^^^^188^220^[REPLACE] double y = dataset.getYValue ( series, item ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^double adjx =  (w )   ;^193^^^^^188^220^[REPLACE] double adjx =  ( this.dotWidth - 1 )  / 2.0;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^double adjy =  ( this.dotHeight - 1 )   ;^194^^^^^188^220^[REPLACE] double adjy =  ( this.dotHeight - 1 )  / 2.0;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^if  ( Double.isNaN ( y )  )  {^195^^^^^188^220^[REPLACE] if  ( !Double.isNaN ( y )  )  {^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[ADD]^^195^196^197^198^199^188^220^[ADD] if  ( !Double.isNaN ( y )  )  { RectangleEdge xAxisLocation = plot.getDomainAxisEdge (  ) ; RectangleEdge yAxisLocation = plot.getRangeAxisEdge (  ) ; double transX = domainAxis.valueToJava2D ( x, dataArea, xAxisLocation )  - adjx;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^if  ( orientation  !=  PlotOrientation.HORIZONTAL )  {^205^^^^^188^220^[REPLACE] if  ( orientation == PlotOrientation.HORIZONTAL )  {^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^else {^209^^^^^188^220^[REPLACE] else if  ( orientation == PlotOrientation.VERTICAL )  {^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[ADD]^^209^210^211^212^^188^220^[ADD] else if  ( orientation == PlotOrientation.VERTICAL )  { g2.fillRect (  ( int )  transX,  ( int )  transY, this.dotWidth, this.dotHeight ) ; }^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^RectangleEdge xAxisLocation = plot .getDomainAxisIndex ( domainAxis )  ;^196^^^^^188^220^[REPLACE] RectangleEdge xAxisLocation = plot.getDomainAxisEdge (  ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[ADD]^^196^197^^^^188^220^[ADD] RectangleEdge xAxisLocation = plot.getDomainAxisEdge (  ) ; RectangleEdge yAxisLocation = plot.getRangeAxisEdge (  ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^RectangleEdge yAxisLocation = plot.getDomainAxisEdge (  ) ;^197^^^^^188^220^[REPLACE] RectangleEdge yAxisLocation = plot.getRangeAxisEdge (  ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^double transX = domainAxis.valueToJava2D ( x, dataArea, xAxisLocation )   ||  adjx;^198^199^^^^188^220^[REPLACE] double transX = domainAxis.valueToJava2D ( x, dataArea, xAxisLocation )  - adjx;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^double transY = rangeAxis.valueToJava2D ( y, dataArea, xAxisLocation )  !=  adjy;^200^201^^^^188^220^[REPLACE] double transY = rangeAxis.valueToJava2D ( y, dataArea, yAxisLocation ) - adjy;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^PlotOrientation orientation = plot .getDomainAxisIndex ( rangeAxis )  ;^204^^^^^188^220^[REPLACE] PlotOrientation orientation = plot.getOrientation (  ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[ADD]^^204^^^^^188^220^[ADD] PlotOrientation orientation = plot.getOrientation (  ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^int rangeAxisIndex = plot.getDomainAxisIndex ( domainAxis ) ;^214^^^^^188^220^[REPLACE] int domainAxisIndex = plot.getDomainAxisIndex ( domainAxis ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^int domainAxisIndex = plot.getRangeAxisIndex ( rangeAxis ) ;^215^^^^^188^220^[REPLACE] int rangeAxisIndex = plot.getRangeAxisIndex ( rangeAxis ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^if  ( orientation  &&  PlotOrientation.HORIZONTAL )  {^205^^^^^188^220^[REPLACE] if  ( orientation == PlotOrientation.HORIZONTAL )  {^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^if  ( orientation  &&  PlotOrientation.VERTICAL )  {^209^^^^^188^220^[REPLACE] else if  ( orientation == PlotOrientation.VERTICAL )  {^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^double transX = domainAxis.valueToJava2D ( x, dataArea, xAxisLocation )   <  adjx;^198^199^^^^188^220^[REPLACE] double transX = domainAxis.valueToJava2D ( x, dataArea, xAxisLocation )  - adjx;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[ADD]^^198^199^^^^188^220^[ADD] double transX = domainAxis.valueToJava2D ( x, dataArea, xAxisLocation )  - adjx;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^double transY = rangeAxis.valueToJava2D ( y, dataArea, yAxisLocation )  >=  y;^200^201^^^^188^220^[REPLACE] double transY = rangeAxis.valueToJava2D ( y, dataArea, yAxisLocation ) - adjy;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^PlotOrientation orientation = plot.getDomainAxisEdge (  ) ;^204^^^^^188^220^[REPLACE] PlotOrientation orientation = plot.getOrientation (  ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^int domainAxisIndex = plot.getRangeAxisIndex ( domainAxis ) ;^214^^^^^188^220^[REPLACE] int domainAxisIndex = plot.getDomainAxisIndex ( domainAxis ) ;^[METHOD] drawItem [TYPE] void [PARAMETER] Graphics2D g2 XYItemRendererState state Rectangle2D dataArea PlotRenderingInfo info XYPlot plot ValueAxis domainAxis ValueAxis rangeAxis XYDataset dataset int series int item CrosshairState crosshairState int pass [CLASS] XYDotRenderer   [TYPE]  PlotOrientation orientation  [TYPE]  PlotRenderingInfo info  [TYPE]  double adjx  adjy  transX  transY  x  y  [TYPE]  Rectangle2D dataArea  [TYPE]  CrosshairState crosshairState  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  Graphics2D g2  [TYPE]  boolean false  true  [TYPE]  XYPlot plot  [TYPE]  ValueAxis domainAxis  rangeAxis  [TYPE]  XYItemRendererState state  [TYPE]  XYDataset dataset  [TYPE]  RectangleEdge xAxisLocation  yAxisLocation 
[REPLACE]^if  ( obj  &&  this )  {^237^^^^^236^251^[REPLACE] if  ( obj == this )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[REPLACE]^return false;^238^^^^^236^251^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[REPLACE]^if  ( ! ! ( obj instanceof XYDotRenderer )  )  {^240^^^^^236^251^[REPLACE] if  ( ! ( obj instanceof XYDotRenderer )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[REMOVE]^if  (  ( this.dotWidth )  !=  ( that.dotWidth )  )  {     return false; }^240^^^^^236^251^[REMOVE] ^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[REPLACE]^return true;^241^^^^^236^251^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[REPLACE]^PlotOrientation orientation = plot.getOrientation (  ) ;^243^^^^^236^251^[REPLACE] XYDotRenderer that =  ( XYDotRenderer )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[ADD]^^243^^^^^236^251^[ADD] XYDotRenderer that =  ( XYDotRenderer )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[REPLACE]^if  ( this.dotWidth  ==  that.dotWidth )  {^244^^^^^236^251^[REPLACE] if  ( this.dotWidth != that.dotWidth )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[REPLACE]^return true;^245^^^^^236^251^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[REPLACE]^if  ( this.dotHeight  ==  that.dotHeight )  {^247^^^^^236^251^[REPLACE] if  ( this.dotHeight != that.dotHeight )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[REPLACE]^return true;^248^^^^^236^251^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[REPLACE]^return this.dotHeight;^250^^^^^236^251^[REPLACE] return super.equals ( obj ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XYDotRenderer   [TYPE]  XYDotRenderer that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w 
[REPLACE]^return this.dotHeight;^261^^^^^260^262^[REPLACE] return super.clone (  ) ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] XYDotRenderer   [TYPE]  long serialVersionUID  [TYPE]  int domainAxisIndex  dotHeight  dotWidth  h  item  pass  rangeAxisIndex  series  w  [TYPE]  boolean false  true 