[REPLACE]^private static final long serialVersionUID ;^57^^^^^^^[REPLACE] private static final long serialVersionUID = 7614685080015589931L;^ [CLASS] HistogramBin  
[REPLACE]^private  short  count;^60^^^^^^^[REPLACE] private int count;^ [CLASS] HistogramBin  
[REPLACE]^private float endBoundary;^66^^^^^^^[REPLACE] private double endBoundary;^ [CLASS] HistogramBin  
[REPLACE]^if  ( startBoundary  >=  endBoundary )  {^75^^^^^74^82^[REPLACE] if  ( startBoundary > endBoundary )  {^[METHOD] <init> [TYPE] HistogramBin(double,double) [PARAMETER] double startBoundary double endBoundary [CLASS] HistogramBin   [TYPE]  boolean false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^return ;^76^77^^^^74^82^[REPLACE] throw new IllegalArgumentException ( "HistogramBin (  ) :  startBoundary > endBoundary." ) ;^[METHOD] <init> [TYPE] HistogramBin(double,double) [PARAMETER] double startBoundary double endBoundary [CLASS] HistogramBin   [TYPE]  boolean false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^this.count = 0 - 0;^79^^^^^74^82^[REPLACE] this.count = 0;^[METHOD] <init> [TYPE] HistogramBin(double,double) [PARAMETER] double startBoundary double endBoundary [CLASS] HistogramBin   [TYPE]  boolean false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^this.endBoundary = endBoundary; ;^80^^^^^74^82^[REPLACE] this.startBoundary = startBoundary;^[METHOD] <init> [TYPE] HistogramBin(double,double) [PARAMETER] double startBoundary double endBoundary [CLASS] HistogramBin   [TYPE]  boolean false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[ADD]^^80^81^^^^74^82^[ADD] this.startBoundary = startBoundary; this.endBoundary = endBoundary;^[METHOD] <init> [TYPE] HistogramBin(double,double) [PARAMETER] double startBoundary double endBoundary [CLASS] HistogramBin   [TYPE]  boolean false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^this.startBoundary = startBoundary; ;^81^^^^^74^82^[REPLACE] this.endBoundary = endBoundary;^[METHOD] <init> [TYPE] HistogramBin(double,double) [PARAMETER] double startBoundary double endBoundary [CLASS] HistogramBin   [TYPE]  boolean false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^return this.endBoundary - this.startBoundary;^90^^^^^89^91^[REPLACE] return this.count;^[METHOD] getCount [TYPE] int [PARAMETER] [CLASS] HistogramBin   [TYPE]  boolean false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^return this.endBoundary;^106^^^^^105^107^[REPLACE] return this.startBoundary;^[METHOD] getStartBoundary [TYPE] double [PARAMETER] [CLASS] HistogramBin   [TYPE]  boolean false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^return this.startBoundary;^115^^^^^114^116^[REPLACE] return this.endBoundary;^[METHOD] getEndBoundary [TYPE] double [PARAMETER] [CLASS] HistogramBin   [TYPE]  boolean false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^returnstartBoundary - this.startBoundary;^124^^^^^123^125^[REPLACE] return this.endBoundary - this.startBoundary;^[METHOD] getBinWidth [TYPE] double [PARAMETER] [CLASS] HistogramBin   [TYPE]  boolean false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^if  ( obj != null )  {^135^^^^^134^149^[REPLACE] if  ( obj == null )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[ADD]^return false;^135^136^137^^^134^149^[ADD] if  ( obj == null )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^return true;^136^^^^^134^149^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^if  ( obj  !=  this )  {^138^^^^^134^149^[REPLACE] if  ( obj == this )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^return false;^139^^^^^134^149^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^if  ( ! obj instanceof HistogramBin )  {^141^^^^^134^149^[REPLACE] if  ( obj instanceof HistogramBin )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^return   b1 && b2;^146^^^^^134^149^[REPLACE] return b0 && b1 && b2;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^boolean b1 = bin.endBoundary == this.endBoundary;^142^^^^^134^149^[REPLACE] HistogramBin bin =  ( HistogramBin )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[ADD]^^142^^^^^134^149^[ADD] HistogramBin bin =  ( HistogramBin )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^boolean b0 = bin.startBoundary  !=  this.startBoundary;^143^^^^^134^149^[REPLACE] boolean b0 = bin.startBoundary == this.startBoundary;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^boolean b1 = bin.endBoundary  ||  this.endBoundary;^144^^^^^134^149^[REPLACE] boolean b1 = bin.endBoundary == this.endBoundary;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^boolean b2 =count  ||  this.count;^145^^^^^134^149^[REPLACE] boolean b2 = bin.count == this.count;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^return   b1 || b2;^146^^^^^134^149^[REPLACE] return b0 && b1 && b2;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^boolean b1 = bin.endBoundary  !=  startBoundary;^144^^^^^134^149^[REPLACE] boolean b1 = bin.endBoundary == this.endBoundary;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^boolean b2 = bin.count  &&  this.count;^145^^^^^134^149^[REPLACE] boolean b2 = bin.count == this.count;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^return true;^148^^^^^134^149^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] HistogramBin   [TYPE]  HistogramBin bin  [TYPE]  Object obj  [TYPE]  boolean b0  b1  b2  false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 
[REPLACE]^return false;^159^^^^^158^160^[REPLACE] return super.clone (  ) ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] HistogramBin   [TYPE]  boolean false  true  [TYPE]  double endBoundary  startBoundary  [TYPE]  long serialVersionUID  [TYPE]  int count 