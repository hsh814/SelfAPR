[REPLACE]^private static final long serialVersionUID  = null ;^42^^^^^^^[REPLACE] private static final long serialVersionUID = 5188298269533339922L;^ [CLASS] DescriptiveStatistics  
[REPLACE]^public static final int INFINITE_WINDOW = -1 - 0;^81^^^^^^^[REPLACE] public static final int INFINITE_WINDOW = -1;^ [CLASS] DescriptiveStatistics  
[REPLACE]^return new DescriptiveStatisticsImpl (  ) ;^55^^^^^54^56^[REPLACE] return  ( DescriptiveStatistics ) cls.newInstance (  ) ;^[METHOD] newInstance [TYPE] DescriptiveStatistics [PARAMETER] Class cls [CLASS] DescriptiveStatistics   [TYPE]  Class cls  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW 
[REPLACE]^DescriptiveStatistics factory = true;^63^^^^^62^73^[REPLACE] DescriptiveStatistics factory = null;^[METHOD] newInstance [TYPE] DescriptiveStatistics [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  DescriptiveStatistics factory  [TYPE]  Throwable t  [TYPE]  DiscoverClass dc  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW 
[ADD]^DiscoverClass dc = new DiscoverClass (  ) ;"org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl" ) ;^64^65^66^67^68^62^73^[ADD] try { DiscoverClass dc = new DiscoverClass (  ) ; factory =  ( DescriptiveStatistics )  dc.newInstance ( DescriptiveStatistics.class, "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl" ) ;^[METHOD] newInstance [TYPE] DescriptiveStatistics [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  DescriptiveStatistics factory  [TYPE]  Throwable t  [TYPE]  DiscoverClass dc  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW 
[REPLACE]^factory =   ( DescriptiveStatistics )  null.newInstance ( DescriptiveStatistics.class, "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl" ) ;^66^67^68^^^62^73^[REPLACE] factory =  ( DescriptiveStatistics )  dc.newInstance ( DescriptiveStatistics.class, "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl" ) ;^[METHOD] newInstance [TYPE] DescriptiveStatistics [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  DescriptiveStatistics factory  [TYPE]  Throwable t  [TYPE]  DiscoverClass dc  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW 
[ADD]^^66^67^68^^^62^73^[ADD] factory =  ( DescriptiveStatistics )  dc.newInstance ( DescriptiveStatistics.class, "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl" ) ;^[METHOD] newInstance [TYPE] DescriptiveStatistics [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  DescriptiveStatistics factory  [TYPE]  Throwable t  [TYPE]  DiscoverClass dc  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW 
[REPLACE]^double[] sort = getValues (  ) ;^65^^^^^62^73^[REPLACE] DiscoverClass dc = new DiscoverClass (  ) ;^[METHOD] newInstance [TYPE] DescriptiveStatistics [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  DescriptiveStatistics factory  [TYPE]  Throwable t  [TYPE]  DiscoverClass dc  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW 
[REPLACE]^return  new Variance (  )  ;^70^^^^^62^73^[REPLACE] return new DescriptiveStatisticsImpl (  ) ;^[METHOD] newInstance [TYPE] DescriptiveStatistics [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  DescriptiveStatistics factory  [TYPE]  Throwable t  [TYPE]  DiscoverClass dc  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW 
[REPLACE]^return  ( stdDev ) ;^72^^^^^62^73^[REPLACE] return factory;^[METHOD] newInstance [TYPE] DescriptiveStatistics [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  DescriptiveStatistics factory  [TYPE]  Throwable t  [TYPE]  DiscoverClass dc  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW 
[REPLACE]^return apply (  new Variance (  )   ) ;^95^^^^^94^96^[REPLACE] return apply ( new Mean (  )  ) ;^[METHOD] getMean [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  boolean false  true 
[REPLACE]^return apply (  new Variance (  )   ) ;^105^^^^^104^106^[REPLACE] return apply ( new GeometricMean (  )  ) ;^[METHOD] getGeometricMean [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  boolean false  true 
[REPLACE]^return apply (  new Skewness (  )   ) ;^114^^^^^113^115^[REPLACE] return apply ( new Variance (  )  ) ;^[METHOD] getVariance [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  boolean false  true 
[REPLACE]^double[] sort = getValues (  ) ;^123^^^^^122^132^[REPLACE] double stdDev = Double.NaN;^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[ADD]^^123^^^^^122^132^[ADD] double stdDev = Double.NaN;^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[REPLACE]^if  ( getN (  )   <=  0 )  {^124^^^^^122^132^[REPLACE] if  ( getN (  )  > 0 )  {^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[REPLACE]^if  ( getN (  )   !=  1 )  {^125^^^^^122^132^[REPLACE] if  ( getN (  )  > 1 )  {^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[ADD]^stdDev = Math.sqrt ( getVariance (  )  ) ;stdDev = 0.0;^125^126^127^128^129^122^132^[ADD] if  ( getN (  )  > 1 )  { stdDev = Math.sqrt ( getVariance (  )  ) ; } else { stdDev = 0.0; }^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[REPLACE]^stfev = 0.0D;^128^^^^^122^132^[REPLACE] stdDev = 0.0;^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[ADD]^^128^^^^^122^132^[ADD] stdDev = 0.0;^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[REPLACE]^stdDev  = null ;^126^^^^^122^132^[REPLACE] stdDev = Math.sqrt ( getVariance (  )  ) ;^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[REPLACE]^stdDev  =  stdDev ;^126^^^^^122^132^[REPLACE] stdDev = Math.sqrt ( getVariance (  )  ) ;^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[REPLACE]^stfev = 0.0d;^128^^^^^122^132^[REPLACE] stdDev = 0.0;^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[REPLACE]^if  ( getN (  )   == serialVersionUID )  {^125^^^^^122^132^[REPLACE] if  ( getN (  )  > 1 )  {^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[ADD]^^126^^^^^122^132^[ADD] stdDev = Math.sqrt ( getVariance (  )  ) ;^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[REPLACE]^stdDev ;^126^^^^^122^132^[REPLACE] stdDev = Math.sqrt ( getVariance (  )  ) ;^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[REPLACE]^return new DescriptiveStatisticsImpl (  ) ;^131^^^^^122^132^[REPLACE] return  ( stdDev ) ;^[METHOD] getStandardDeviation [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  double stdDev 
[REPLACE]^return apply (  new Variance (  )   ) ;^141^^^^^140^142^[REPLACE] return apply ( new Skewness (  )  ) ;^[METHOD] getSkewness [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  boolean false  true 
[REPLACE]^return apply ( new Variance (  )  ) ;^151^^^^^150^152^[REPLACE] return apply ( new Kurtosis (  )  ) ;^[METHOD] getKurtosis [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  boolean false  true 
[REPLACE]^return apply (  new Variance (  )   ) ;^159^^^^^158^160^[REPLACE] return apply ( new Max (  )  ) ;^[METHOD] getMax [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  boolean false  true 
[REPLACE]^return apply (  new Variance (  )   ) ;^167^^^^^166^168^[REPLACE] return apply ( new Min (  )  ) ;^[METHOD] getMin [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  boolean false  true 
[REPLACE]^return apply ( new Kurtosis (  )  ) ;^181^^^^^180^182^[REPLACE] return apply ( new Sum (  )  ) ;^[METHOD] getSum [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  boolean false  true 
[REPLACE]^return apply (  new Variance (  )   ) ;^190^^^^^189^191^[REPLACE] return apply ( new SumOfSquares (  )  ) ;^[METHOD] getSumsq [TYPE] double [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  [TYPE]  boolean false  true 
[REPLACE]^StringBuffer outBuffer = new StringBuffer (  ) ;^237^^^^^236^240^[REPLACE] double[] sort = getValues (  ) ;^[METHOD] getSortedValues [TYPE] double[] [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  double[] sort  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  windowSize 
[REPLACE]^return  ( stdDev ) ;^239^^^^^236^240^[REPLACE] return sort;^[METHOD] getSortedValues [TYPE] double[] [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  double[] sort  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  windowSize 
[REPLACE]^return apply (  new Variance (  )   ) ;^267^^^^^266^268^[REPLACE] return apply ( new Percentile ( p )  ) ;^[METHOD] getPercentile [TYPE] double [PARAMETER] double p [CLASS] DescriptiveStatistics   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize  [TYPE]  double p 
[REPLACE]^double[] sort = getValues (  ) ;^278^^^^^277^289^[REPLACE] StringBuffer outBuffer = new StringBuffer (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "min: " + getMin (  )  + "\n" ) ;^279^^^^^277^289^[REPLACE] outBuffer.append ( "DescriptiveStatistics:\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[ADD]^outBuffer.append ( "n: " + getN (  )  + "\n" ) ;^279^280^^^^277^289^[ADD] outBuffer.append ( "DescriptiveStatistics:\n" ) ; outBuffer.append ( "n: " + getN (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "min: " + getMin (  )  + "\n" ) ;^280^^^^^277^289^[REPLACE] outBuffer.append ( "n: " + getN (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "n: " + getN (  )  + "\n" ) ;^281^^^^^277^289^[REPLACE] outBuffer.append ( "min: " + getMin (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "min: " + getMin (  )  + "\n" ) ;^282^^^^^277^289^[REPLACE] outBuffer.append ( "max: " + getMax (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "min: " + getMin (  )  + "\n" ) ;^283^^^^^277^289^[REPLACE] outBuffer.append ( "mean: " + getMean (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REMOVE]^outBuffer.append ( "min: " + getMin (  )  + "\n" ) ;^283^^^^^277^289^[REMOVE] ^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "std dev: "  <=  getStandardDeviation (  )   <=  "\n" ) ;^284^^^^^277^289^[REPLACE] outBuffer.append ( "std dev: " + getStandardDeviation (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "min: " + getMin (  )  + "\n" ) ;^284^^^^^277^289^[REPLACE] outBuffer.append ( "std dev: " + getStandardDeviation (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[ADD]^^284^285^^^^277^289^[ADD] outBuffer.append ( "std dev: " + getStandardDeviation (  )  + "\n" ) ; outBuffer.append ( "median: " + getPercentile ( 50 )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "median: "  ^  getPercentile ( 50 )   ^  "\n" ) ;^285^^^^^277^289^[REPLACE] outBuffer.append ( "median: " + getPercentile ( 50 )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "median: " + getPercentile ( 33 )  + "\n" ) ;^285^^^^^277^289^[REPLACE] outBuffer.append ( "median: " + getPercentile ( 50 )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "skewness: " + getSkewness (  )  +1 ) ;^286^^^^^277^289^[REPLACE] outBuffer.append ( "skewness: " + getSkewness (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[ADD]^^286^^^^^277^289^[ADD] outBuffer.append ( "skewness: " + getSkewness (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "min: " + getMin (  )  + "\n" ) ;^286^^^^^277^289^[REPLACE] outBuffer.append ( "skewness: " + getSkewness (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "kurtosis: "  &  getKurtosis (  )   &  "\n" ) ;^287^^^^^277^289^[REPLACE] outBuffer.append ( "kurtosis: " + getKurtosis (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[ADD]^^287^^^^^277^289^[ADD] outBuffer.append ( "kurtosis: " + getKurtosis (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^outBuffer.append ( "min: " + getMin (  )  + "\n" ) ;^287^^^^^277^289^[REPLACE] outBuffer.append ( "kurtosis: " + getKurtosis (  )  + "\n" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 
[REPLACE]^return outBuffer.StringBuffer (  ) ;^288^^^^^277^289^[REPLACE] return outBuffer.toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DescriptiveStatistics   [TYPE]  StringBuffer outBuffer  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int INFINITE_WINDOW  index  windowSize 