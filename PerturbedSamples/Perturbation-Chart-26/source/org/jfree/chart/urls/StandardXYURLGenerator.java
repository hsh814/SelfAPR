[REPLACE]^private  final long serialVersionUID = -1771624523496595382;^65^^^^^^^[REPLACE] private static final long serialVersionUID = -1771624523496595382L;^ [CLASS] StandardXYURLGenerator  
[REPLACE]^public static final String DEFAULT_PREFIX  = null ;^68^^^^^^^[REPLACE] public static final String DEFAULT_PREFIX = "index.html";^ [CLASS] StandardXYURLGenerator  
[REPLACE]^public  final String DEFAULT_SERIES_PARAMETER = "series";^71^^^^^^^[REPLACE] public static final String DEFAULT_SERIES_PARAMETER = "series";^ [CLASS] StandardXYURLGenerator  
[REPLACE]^public  final String DEFAULT_ITEM_PARAMETER = "item";^74^^^^^^^[REPLACE] public static final String DEFAULT_ITEM_PARAMETER = "item";^ [CLASS] StandardXYURLGenerator  
[REPLACE]^private  boolean  seriesParameterName;^80^^^^^^^[REPLACE] private String seriesParameterName;^ [CLASS] StandardXYURLGenerator  
[REPLACE]^private  short  itemParameterName;^83^^^^^^^[REPLACE] private String itemParameterName;^ [CLASS] StandardXYURLGenerator  
[REPLACE]^this ( prefix, DEFAULT_SERIES_PARAMETER, DEFAULT_ITEM_PARAMETER ) ;^91^^^^^90^92^[REPLACE] this ( DEFAULT_PREFIX, DEFAULT_SERIES_PARAMETER, DEFAULT_ITEM_PARAMETER ) ;^[METHOD] <init> [TYPE] StandardXYURLGenerator() [PARAMETER] [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[REPLACE]^this ( seriesParameterName, DEFAULT_SERIES_PARAMETER, DEFAULT_ITEM_PARAMETER ) ;^102^^^^^101^103^[REPLACE] this ( prefix, DEFAULT_SERIES_PARAMETER, DEFAULT_ITEM_PARAMETER ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[REPLACE]^if  ( prefix != null )  {^117^^^^^114^131^[REPLACE] if  ( prefix == null )  {^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[ADD]^^117^118^119^^^114^131^[ADD] if  ( prefix == null )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[REPLACE]^throw new IllegalArgumentException ( "Null 'itemParameterName' argument." ) ; ;^118^^^^^114^131^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[REPLACE]^if  ( seriesParameterName !=prefix )  {^120^^^^^114^131^[REPLACE] if  ( seriesParameterName == null )  {^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[REPLACE]^return ;^121^122^^^^114^131^[REPLACE] throw new IllegalArgumentException ( "Null 'seriesParameterName' argument." ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[ADD]^^121^122^^^^114^131^[ADD] throw new IllegalArgumentException ( "Null 'seriesParameterName' argument." ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[REPLACE]^if  ( seriesParameterName != this )  {^124^^^^^114^131^[REPLACE] if  ( itemParameterName == null )  {^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[REPLACE]^return ;^125^126^^^^114^131^[REPLACE] throw new IllegalArgumentException ( "Null 'itemParameterName' argument." ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[REPLACE]^this.prefix =  seriesParameterName;^128^^^^^114^131^[REPLACE] this.prefix = prefix;^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[ADD]^^128^^^^^114^131^[ADD] this.prefix = prefix;^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[REPLACE]^this.itemParameterName = itemParameterName; ;^129^^^^^114^131^[REPLACE] this.seriesParameterName = seriesParameterName;^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[REPLACE]^this.seriesParameterName = seriesParameterName; ;^130^^^^^114^131^[REPLACE] this.itemParameterName = itemParameterName;^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String seriesParameterName String itemParameterName [CLASS] StandardXYURLGenerator   [TYPE]  long serialVersionUID  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  [TYPE]  boolean false  true 
[REPLACE]^boolean firstParameter = url.indexOf ( "?" )  == -1;^143^^^^^142^149^[REPLACE] String url = this.prefix;^[METHOD] generateURL [TYPE] String [PARAMETER] XYDataset dataset int series int item [CLASS] StandardXYURLGenerator   [TYPE]  XYDataset dataset  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  firstParameter  true  [TYPE]  long serialVersionUID  [TYPE]  int item  series 
[REPLACE]^boolean firstParameter = seriesParameterName.indexOf ( "?" )   !=  -1;^144^^^^^142^149^[REPLACE] boolean firstParameter = url.indexOf ( "?" )  == -1;^[METHOD] generateURL [TYPE] String [PARAMETER] XYDataset dataset int series int item [CLASS] StandardXYURLGenerator   [TYPE]  XYDataset dataset  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  firstParameter  true  [TYPE]  long serialVersionUID  [TYPE]  int item  series 
[REPLACE]^url +=  true ? "?" : "&amp;";^145^^^^^142^149^[REPLACE] url += firstParameter ? "?" : "&amp;";^[METHOD] generateURL [TYPE] String [PARAMETER] XYDataset dataset int series int item [CLASS] StandardXYURLGenerator   [TYPE]  XYDataset dataset  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  firstParameter  true  [TYPE]  long serialVersionUID  [TYPE]  int item  series 
[REPLACE]^url  ^ = this.seriesParameterName  ^  "="  ^  series  ^  "&amp;"  ^  this.itemParameterName  ^  "="  ^  item;^146^147^^^^142^149^[REPLACE] url += this.seriesParameterName + "=" + series + "&amp;" + this.itemParameterName + "=" + item;^[METHOD] generateURL [TYPE] String [PARAMETER] XYDataset dataset int series int item [CLASS] StandardXYURLGenerator   [TYPE]  XYDataset dataset  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  firstParameter  true  [TYPE]  long serialVersionUID  [TYPE]  int item  series 
[REPLACE]^return seriesParameterName;^148^^^^^142^149^[REPLACE] return url;^[METHOD] generateURL [TYPE] String [PARAMETER] XYDataset dataset int series int item [CLASS] StandardXYURLGenerator   [TYPE]  XYDataset dataset  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  firstParameter  true  [TYPE]  long serialVersionUID  [TYPE]  int item  series 
[REPLACE]^if  ( obj  !=  this )  {^159^^^^^158^178^[REPLACE] if  ( obj == this )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^160^^^^^158^178^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ! ! ( obj instanceof StandardXYURLGenerator )  )  {^162^^^^^158^178^[REPLACE] if  ( ! ( obj instanceof StandardXYURLGenerator )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^162^163^164^^^158^178^[ADD] if  ( ! ( obj instanceof StandardXYURLGenerator )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^163^^^^^158^178^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^String url = this.prefix;^165^^^^^158^178^[REPLACE] StandardXYURLGenerator that =  ( StandardXYURLGenerator )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^165^^^^^158^178^[ADD] StandardXYURLGenerator that =  ( StandardXYURLGenerator )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( !  that.prefix, this.prefix    )  {^166^^^^^158^178^[REPLACE] if  ( !ObjectUtilities.equal ( that.prefix, this.prefix )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^167^^^^^158^178^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( !  that.seriesParameterName, this.seriesParameterName    )  {^169^170^^^^158^178^[REPLACE] if  ( !ObjectUtilities.equal ( that.seriesParameterName, this.seriesParameterName )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^171^^^^^158^178^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( !  that.itemParameterName, this.itemParameterName    )  {^173^174^^^^158^178^[REPLACE] if  ( !ObjectUtilities.equal ( that.itemParameterName, this.itemParameterName )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^173^174^175^176^^158^178^[ADD] if  ( !ObjectUtilities.equal ( that.itemParameterName, this.itemParameterName )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^175^^^^^158^178^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^177^^^^^158^178^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] StandardXYURLGenerator   [TYPE]  Object obj  [TYPE]  StandardXYURLGenerator that  [TYPE]  String DEFAULT_ITEM_PARAMETER  DEFAULT_PREFIX  DEFAULT_SERIES_PARAMETER  itemParameterName  prefix  seriesParameterName  url  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 