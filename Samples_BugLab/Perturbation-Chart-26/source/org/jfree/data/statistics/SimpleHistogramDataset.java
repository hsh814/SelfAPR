[buglab_swap_variables]^if  ( existingBin.overlapsWith ( bin )  )  {^169^^^^^163^175^if  ( bin.overlapsWith ( existingBin )  )  {^[CLASS] SimpleHistogramDataset  [METHOD] addBin [RETURN_TYPE] void   SimpleHistogramBin bin [VARIABLES] Iterator  iterator  Comparable  key  List  bins  SimpleHistogramBin  bin  existingBin  boolean  adjust  adjustForBinSize  long  serialVersionUID  
[buglab_swap_variables]^if  ( value.accepts ( bin )  )  {^201^^^^^196^212^if  ( bin.accepts ( value )  )  {^[CLASS] SimpleHistogramDataset  [METHOD] addObservation [RETURN_TYPE] void   double value boolean notify [VARIABLES] Comparable  key  boolean  adjust  adjustForBinSize  notify  placed  double  value  Iterator  iterator  List  bins  SimpleHistogramBin  bin  long  serialVersionUID  
[buglab_swap_variables]^for  ( values.lengthnt i = 0; i < i; i++ )  {^220^^^^^219^224^for  ( int i = 0; i < values.length; i++ )  {^[CLASS] SimpleHistogramDataset  [METHOD] addObservations [RETURN_TYPE] void   double[] values [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  double[]  values  long  serialVersionUID  int  i  
[buglab_swap_variables]^for  ( int i = 0; i < values.length.length; i++ )  {^220^^^^^219^224^for  ( int i = 0; i < values.length; i++ )  {^[CLASS] SimpleHistogramDataset  [METHOD] addObservations [RETURN_TYPE] void   double[] values [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  double[]  values  long  serialVersionUID  int  i  
[buglab_swap_variables]^for  ( int i = 0; i < values; i++ )  {^220^^^^^219^224^for  ( int i = 0; i < values.length; i++ )  {^[CLASS] SimpleHistogramDataset  [METHOD] addObservations [RETURN_TYPE] void   double[] values [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  double[]  values  long  serialVersionUID  int  i  
[buglab_swap_variables]^return new Double ( getXValue ( item, series )  ) ;^263^^^^^262^264^return new Double ( getXValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return new Double ( getXValue (  item )  ) ;^263^^^^^262^264^return new Double ( getXValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return new Double ( getXValue ( series )  ) ;^263^^^^^262^264^return new Double ( getXValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^SimpleHistogramBin bin =  ( SimpleHistogramBin )  item.get ( this.bins ) ;^275^^^^^274^277^SimpleHistogramBin bin =  ( SimpleHistogramBin )  this.bins.get ( item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getXValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  key  List  bins  SimpleHistogramBin  bin  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return new Double ( getYValue ( item, series )  ) ;^288^^^^^287^289^return new Double ( getYValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getY [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return new Double ( getYValue (  item )  ) ;^288^^^^^287^289^return new Double ( getYValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getY [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return new Double ( getYValue ( series )  ) ;^288^^^^^287^289^return new Double ( getYValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getY [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^SimpleHistogramBin bin =  ( SimpleHistogramBin )  item.get ( this.bins ) ;^300^^^^^299^308^SimpleHistogramBin bin =  ( SimpleHistogramBin )  this.bins.get ( item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getYValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  key  List  bins  SimpleHistogramBin  bin  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return new Double ( getStartXValue ( item, series )  ) ;^319^^^^^318^320^return new Double ( getStartXValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getStartX [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return new Double ( getStartXValue (  item )  ) ;^319^^^^^318^320^return new Double ( getStartXValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getStartX [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return new Double ( getStartXValue ( series )  ) ;^319^^^^^318^320^return new Double ( getStartXValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getStartX [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^SimpleHistogramBin bin =  ( SimpleHistogramBin )  item.get ( this.bins ) ;^332^^^^^331^334^SimpleHistogramBin bin =  ( SimpleHistogramBin )  this.bins.get ( item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getStartXValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  key  List  bins  SimpleHistogramBin  bin  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return new Double ( getEndXValue ( item, series )  ) ;^345^^^^^344^346^return new Double ( getEndXValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getEndX [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return new Double ( getEndXValue (  item )  ) ;^345^^^^^344^346^return new Double ( getEndXValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getEndX [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return new Double ( getEndXValue ( series )  ) ;^345^^^^^344^346^return new Double ( getEndXValue ( series, item )  ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getEndX [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^SimpleHistogramBin bin =  ( SimpleHistogramBin )  item.get ( this.bins ) ;^358^^^^^357^360^SimpleHistogramBin bin =  ( SimpleHistogramBin )  this.bins.get ( item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getEndXValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  key  List  bins  SimpleHistogramBin  bin  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getY ( item, series ) ;^371^^^^^370^372^return getY ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getY (  item ) ;^371^^^^^370^372^return getY ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getY ( series ) ;^371^^^^^370^372^return getY ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getYValue ( item, series ) ;^384^^^^^383^385^return getYValue ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getStartYValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getYValue (  item ) ;^384^^^^^383^385^return getYValue ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getStartYValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getYValue ( series ) ;^384^^^^^383^385^return getYValue ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getStartYValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getY ( item, series ) ;^396^^^^^395^397^return getY ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getEndY [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getY (  item ) ;^396^^^^^395^397^return getY ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getEndY [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getY ( series ) ;^396^^^^^395^397^return getY ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getEndY [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getYValue ( item, series ) ;^409^^^^^408^410^return getYValue ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getEndYValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getYValue (  item ) ;^409^^^^^408^410^return getYValue ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getEndYValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^return getYValue ( series ) ;^409^^^^^408^410^return getYValue ( series, item ) ;^[CLASS] SimpleHistogramDataset  [METHOD] getEndYValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  key  List  bins  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  int  item  series  
[buglab_swap_variables]^if  ( !this.key.equals ( that.key.key )  )  {^427^^^^^419^437^if  ( !this.key.equals ( that.key )  )  {^[CLASS] SimpleHistogramDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  key  List  bins  Object  obj  SimpleHistogramDataset  that  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  
[buglab_swap_variables]^if  ( !this.key.equals ( that )  )  {^427^^^^^419^437^if  ( !this.key.equals ( that.key )  )  {^[CLASS] SimpleHistogramDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  key  List  bins  Object  obj  SimpleHistogramDataset  that  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  
[buglab_swap_variables]^if  ( this.adjustForBinSize != that.adjustForBinSize.adjustForBinSize )  {^430^^^^^419^437^if  ( this.adjustForBinSize != that.adjustForBinSize )  {^[CLASS] SimpleHistogramDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  key  List  bins  Object  obj  SimpleHistogramDataset  that  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  
[buglab_swap_variables]^if  ( that != this.adjustForBinSize.adjustForBinSize )  {^430^^^^^419^437^if  ( this.adjustForBinSize != that.adjustForBinSize )  {^[CLASS] SimpleHistogramDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  key  List  bins  Object  obj  SimpleHistogramDataset  that  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  
[buglab_swap_variables]^if  ( that.adjustForBinSize != this.adjustForBinSize )  {^430^^^^^419^437^if  ( this.adjustForBinSize != that.adjustForBinSize )  {^[CLASS] SimpleHistogramDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  key  List  bins  Object  obj  SimpleHistogramDataset  that  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  
[buglab_swap_variables]^if  ( !this.bins.equals ( that.bins.bins )  )  {^433^^^^^419^437^if  ( !this.bins.equals ( that.bins )  )  {^[CLASS] SimpleHistogramDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  key  List  bins  Object  obj  SimpleHistogramDataset  that  boolean  adjust  adjustForBinSize  notify  placed  long  serialVersionUID  