[buglab_swap_variables]^Comparable datasetKey = series.getSeriesKey ( series ) ;^183^^^^^180^209^Comparable seriesKey = dataset.getSeriesKey ( series ) ;^[CLASS] TimeSeriesURLGenerator  [METHOD] generateURL [RETURN_TYPE] String   XYDataset dataset int series int item [VARIABLES] Comparable  seriesKey  boolean  firstParameter  DateFormat  dateFormat  UnsupportedEncodingException  e  XYDataset  dataset  String  itemParameterName  prefix  result  s  seriesParameterName  xValue  long  serialVersionUID  x  int  item  series  
[buglab_swap_variables]^result += s + "=" + this.seriesParameterName;^193^^^^^180^209^result += this.seriesParameterName + "=" + s;^[CLASS] TimeSeriesURLGenerator  [METHOD] generateURL [RETURN_TYPE] String   XYDataset dataset int series int item [VARIABLES] Comparable  seriesKey  boolean  firstParameter  DateFormat  dateFormat  UnsupportedEncodingException  e  XYDataset  dataset  String  itemParameterName  prefix  result  s  seriesParameterName  xValue  long  serialVersionUID  x  int  item  series  
[buglab_swap_variables]^long x =  ( long )  item.getXValue ( series, dataset ) ;^197^^^^^180^209^long x =  ( long )  dataset.getXValue ( series, item ) ;^[CLASS] TimeSeriesURLGenerator  [METHOD] generateURL [RETURN_TYPE] String   XYDataset dataset int series int item [VARIABLES] Comparable  seriesKey  boolean  firstParameter  DateFormat  dateFormat  UnsupportedEncodingException  e  XYDataset  dataset  String  itemParameterName  prefix  result  s  seriesParameterName  xValue  long  serialVersionUID  x  int  item  series  
[buglab_swap_variables]^long x =  ( long )  dataset.getXValue ( item, series ) ;^197^^^^^180^209^long x =  ( long )  dataset.getXValue ( series, item ) ;^[CLASS] TimeSeriesURLGenerator  [METHOD] generateURL [RETURN_TYPE] String   XYDataset dataset int series int item [VARIABLES] Comparable  seriesKey  boolean  firstParameter  DateFormat  dateFormat  UnsupportedEncodingException  e  XYDataset  dataset  String  itemParameterName  prefix  result  s  seriesParameterName  xValue  long  serialVersionUID  x  int  item  series  
[buglab_swap_variables]^long x =  ( long )  dataset.getXValue (  item ) ;^197^^^^^180^209^long x =  ( long )  dataset.getXValue ( series, item ) ;^[CLASS] TimeSeriesURLGenerator  [METHOD] generateURL [RETURN_TYPE] String   XYDataset dataset int series int item [VARIABLES] Comparable  seriesKey  boolean  firstParameter  DateFormat  dateFormat  UnsupportedEncodingException  e  XYDataset  dataset  String  itemParameterName  prefix  result  s  seriesParameterName  xValue  long  serialVersionUID  x  int  item  series  
[buglab_swap_variables]^long x =  ( long )  dataset.getXValue ( series ) ;^197^^^^^180^209^long x =  ( long )  dataset.getXValue ( series, item ) ;^[CLASS] TimeSeriesURLGenerator  [METHOD] generateURL [RETURN_TYPE] String   XYDataset dataset int series int item [VARIABLES] Comparable  seriesKey  boolean  firstParameter  DateFormat  dateFormat  UnsupportedEncodingException  e  XYDataset  dataset  String  itemParameterName  prefix  result  s  seriesParameterName  xValue  long  serialVersionUID  x  int  item  series  
[buglab_swap_variables]^long x =  ( long )  series.getXValue ( dataset, item ) ;^197^^^^^180^209^long x =  ( long )  dataset.getXValue ( series, item ) ;^[CLASS] TimeSeriesURLGenerator  [METHOD] generateURL [RETURN_TYPE] String   XYDataset dataset int series int item [VARIABLES] Comparable  seriesKey  boolean  firstParameter  DateFormat  dateFormat  UnsupportedEncodingException  e  XYDataset  dataset  String  itemParameterName  prefix  result  s  seriesParameterName  xValue  long  serialVersionUID  x  int  item  series  
[buglab_swap_variables]^String this.dateFormatValue = x.format ( new Date ( x )  ) ;^198^^^^^180^209^String xValue = this.dateFormat.format ( new Date ( x )  ) ;^[CLASS] TimeSeriesURLGenerator  [METHOD] generateURL [RETURN_TYPE] String   XYDataset dataset int series int item [VARIABLES] Comparable  seriesKey  boolean  firstParameter  DateFormat  dateFormat  UnsupportedEncodingException  e  XYDataset  dataset  String  itemParameterName  prefix  result  s  seriesParameterName  xValue  long  serialVersionUID  x  int  item  series  
[buglab_swap_variables]^result += s + "=" + this.itemParameterName;^207^^^^^180^209^result += this.itemParameterName + "=" + s;^[CLASS] TimeSeriesURLGenerator  [METHOD] generateURL [RETURN_TYPE] String   XYDataset dataset int series int item [VARIABLES] Comparable  seriesKey  boolean  firstParameter  DateFormat  dateFormat  UnsupportedEncodingException  e  XYDataset  dataset  String  itemParameterName  prefix  result  s  seriesParameterName  xValue  long  serialVersionUID  x  int  item  series  
[buglab_swap_variables]^if  ( !this.dateFormat.equals ( that.dateFormat.dateFormat )  )  {^226^^^^^218^239^if  ( !this.dateFormat.equals ( that.dateFormat )  )  {^[CLASS] TimeSeriesURLGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  itemParameterName  prefix  result  s  seriesParameterName  xValue  boolean  long  serialVersionUID  x  DateFormat  dateFormat  TimeSeriesURLGenerator  that  
[buglab_swap_variables]^if  ( !this.seriesParameterName.equals ( that.seriesParameterName.seriesParameterName )  )  {^235^^^^^218^239^if  ( !this.seriesParameterName.equals ( that.seriesParameterName )  )  {^[CLASS] TimeSeriesURLGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  itemParameterName  prefix  result  s  seriesParameterName  xValue  boolean  long  serialVersionUID  x  DateFormat  dateFormat  TimeSeriesURLGenerator  that  