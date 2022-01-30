[REPLACE]^private static final long serialVersionUID ;^58^^^^^^^[REPLACE] private static final long serialVersionUID = 3480862537505941742L;^ [CLASS] SimpleHistogramBin  
[REPLACE]^private float lowerBound;^61^^^^^^^[REPLACE] private double lowerBound;^ [CLASS] SimpleHistogramBin  
[REPLACE]^private  long  itemCount;^79^^^^^^^[REPLACE] private int itemCount;^ [CLASS] SimpleHistogramBin  
[REPLACE]^this ( lowerBound, upperBound, false, true ) ;^88^^^^^87^89^[REPLACE] this ( lowerBound, upperBound, true, true ) ;^[METHOD] <init> [TYPE] SimpleHistogramBin(double,double) [PARAMETER] double lowerBound double upperBound [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[REPLACE]^if  ( lowerBound  ==  upperBound )  {^102^^^^^99^110^[REPLACE] if  ( lowerBound >= upperBound )  {^[METHOD] <init> [TYPE] SimpleHistogramBin(double,double,boolean,boolean) [PARAMETER] double lowerBound double upperBound boolean includeLowerBound boolean includeUpperBound [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[REPLACE]^return ;^103^^^^^99^110^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] SimpleHistogramBin(double,double,boolean,boolean) [PARAMETER] double lowerBound double upperBound boolean includeLowerBound boolean includeUpperBound [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[REPLACE]^this.upperBound = upperBound; ;^105^^^^^99^110^[REPLACE] this.lowerBound = lowerBound;^[METHOD] <init> [TYPE] SimpleHistogramBin(double,double,boolean,boolean) [PARAMETER] double lowerBound double upperBound boolean includeLowerBound boolean includeUpperBound [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[REPLACE]^this.lowerBound = lowerBound; ;^106^^^^^99^110^[REPLACE] this.upperBound = upperBound;^[METHOD] <init> [TYPE] SimpleHistogramBin(double,double,boolean,boolean) [PARAMETER] double lowerBound double upperBound boolean includeLowerBound boolean includeUpperBound [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[REPLACE]^this.includeUpperBound = includeUpperBound; ;^107^^^^^99^110^[REPLACE] this.includeLowerBound = includeLowerBound;^[METHOD] <init> [TYPE] SimpleHistogramBin(double,double,boolean,boolean) [PARAMETER] double lowerBound double upperBound boolean includeLowerBound boolean includeUpperBound [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[REPLACE]^this.includeLowerBound = includeLowerBound; ;^108^^^^^99^110^[REPLACE] this.includeUpperBound = includeUpperBound;^[METHOD] <init> [TYPE] SimpleHistogramBin(double,double,boolean,boolean) [PARAMETER] double lowerBound double upperBound boolean includeLowerBound boolean includeUpperBound [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[REPLACE]^this.itemCount = 0L;^109^^^^^99^110^[REPLACE] this.itemCount = 0;^[METHOD] <init> [TYPE] SimpleHistogramBin(double,double,boolean,boolean) [PARAMETER] double lowerBound double upperBound boolean includeLowerBound boolean includeUpperBound [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[ADD]^^109^^^^^99^110^[ADD] this.itemCount = 0;^[METHOD] <init> [TYPE] SimpleHistogramBin(double,double,boolean,boolean) [PARAMETER] double lowerBound double upperBound boolean includeLowerBound boolean includeUpperBound [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[REPLACE]^return this.upperBound;^118^^^^^117^119^[REPLACE] return this.lowerBound;^[METHOD] getLowerBound [TYPE] double [PARAMETER] [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[REPLACE]^return this.lowerBound;^127^^^^^126^128^[REPLACE] return this.upperBound;^[METHOD] getUpperBound [TYPE] double [PARAMETER] [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[REPLACE]^return this.includeLowerBound && bin.includeUpperBound;^136^^^^^135^137^[REPLACE] return this.itemCount;^[METHOD] getItemCount [TYPE] int [PARAMETER] [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int itemCount 
[REPLACE]^this.itemCount = 0; ;^145^^^^^144^146^[REPLACE] this.itemCount = count;^[METHOD] setItemCount [TYPE] void [PARAMETER] int count [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  (   value    )  {^157^^^^^156^173^[REPLACE] if  ( Double.isNaN ( value )  )  {^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return true;^158^^^^^156^173^[REPLACE] return false;^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( value  >  this.lowerBound )  {^160^^^^^156^173^[REPLACE] if  ( value < this.lowerBound )  {^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return true;^161^^^^^156^173^[REPLACE] return false;^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( value  >=  this.upperBound )  {^163^^^^^156^173^[REPLACE] if  ( value > this.upperBound )  {^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return true;^164^^^^^156^173^[REPLACE] return false;^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( upperBound  &&  value )  {^166^^^^^156^173^[REPLACE] if  ( value == this.lowerBound )  {^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return this.includeUpperBound;^167^^^^^156^173^[REPLACE] return this.includeLowerBound;^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( value  !=  this.upperBound )  {^169^^^^^156^173^[REPLACE] if  ( value == this.upperBound )  {^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REMOVE]^if  ( value >  ( this.upperBound )  )  {     return false; }^169^^^^^156^173^[REMOVE] ^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return this.includeLowerBound;^170^^^^^156^173^[REPLACE] return this.includeUpperBound;^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return false;^172^^^^^156^173^[REPLACE] return true;^[METHOD] accepts [TYPE] boolean [PARAMETER] double value [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( this.upperBound  >  bin.lowerBound )  {^184^^^^^183^197^[REPLACE] if  ( this.upperBound < bin.lowerBound )  {^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return true;^185^^^^^183^197^[REPLACE] return false;^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( this.lowerBound  <  bin.upperBound )  {^187^^^^^183^197^[REPLACE] if  ( this.lowerBound > bin.upperBound )  {^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return true;^188^^^^^183^197^[REPLACE] return false;^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( value  !=  value )  {^190^^^^^183^197^[REPLACE] if  ( this.upperBound == bin.lowerBound )  {^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return   bin.includeLowerBound;^191^^^^^183^197^[REPLACE] return this.includeUpperBound && bin.includeLowerBound;^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return this.includeUpperBound || bin.includeLowerBound;^191^^^^^183^197^[REPLACE] return this.includeUpperBound && bin.includeLowerBound;^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( this.lowerBound  &&  bin.upperBound )  {^193^^^^^183^197^[REPLACE] if  ( this.lowerBound == bin.upperBound )  {^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[ADD]^^193^194^195^^^183^197^[ADD] if  ( this.lowerBound == bin.upperBound )  { return this.includeLowerBound && bin.includeUpperBound; }^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^returntrue ;^194^^^^^183^197^[REPLACE] return this.includeLowerBound && bin.includeUpperBound;^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return   bin.includeUpperBound;^194^^^^^183^197^[REPLACE] return this.includeLowerBound && bin.includeUpperBound;^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return false;^196^^^^^183^197^[REPLACE] return true;^[METHOD] overlapsWith [TYPE] boolean [PARAMETER] SimpleHistogramBin bin [CLASS] SimpleHistogramBin   [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( ! ! ( obj instanceof SimpleHistogramBin )  )  {^209^^^^^208^227^[REPLACE] if  ( ! ( obj instanceof SimpleHistogramBin )  )  {^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return 4;^210^^^^^208^227^[REPLACE] return 0;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^SimpleHistogramBin that =  ( SimpleHistogramBin )  obj;^212^^^^^208^227^[REPLACE] SimpleHistogramBin bin =  ( SimpleHistogramBin )  obj;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( this.lowerBound  >=  bin.lowerBound )  {^213^^^^^208^227^[REPLACE] if  ( this.lowerBound < bin.lowerBound )  {^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REMOVE]^if  ( isNaN ( value )  )  {     return false; }^213^^^^^208^227^[REMOVE] ^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return -2;^214^^^^^208^227^[REPLACE] return -1;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return -1L;^214^^^^^208^227^[REPLACE] return -1;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( this.lowerBound  ==  bin.lowerBound )  {^216^^^^^208^227^[REPLACE] if  ( this.lowerBound > bin.lowerBound )  {^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return 3;^217^^^^^208^227^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return 0;^217^^^^^208^227^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( value  <=  value )  {^220^^^^^208^227^[REPLACE] if  ( this.upperBound < bin.upperBound )  {^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return -3;^221^^^^^208^227^[REPLACE] return -1;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return -2;^221^^^^^208^227^[REPLACE] return -1;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( this.upperBound  <  bin.upperBound )  {^223^^^^^208^227^[REPLACE] if  ( this.upperBound > bin.upperBound )  {^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[ADD]^^223^224^225^^^208^227^[ADD] if  ( this.upperBound > bin.upperBound )  { return 1; }^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return 0;^224^^^^^208^227^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return 4;^224^^^^^208^227^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return 0 - 4;^226^^^^^208^227^[REPLACE] return 0;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin bin  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( ! ! ( obj instanceof SimpleHistogramBin )  )  {^237^^^^^236^257^[REPLACE] if  ( ! ( obj instanceof SimpleHistogramBin )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return true;^238^^^^^236^257^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^SimpleHistogramBin bin =  ( SimpleHistogramBin )  obj;^240^^^^^236^257^[REPLACE] SimpleHistogramBin that =  ( SimpleHistogramBin )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( this.lowerBound  ==  that.lowerBound )  {^241^^^^^236^257^[REPLACE] if  ( this.lowerBound != that.lowerBound )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return true;^242^^^^^236^257^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( this.upperBound  ==  that.upperBound )  {^244^^^^^236^257^[REPLACE] if  ( this.upperBound != that.upperBound )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return true;^245^^^^^236^257^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( this.includeLowerBound  ==  that.includeLowerBound )  {^247^^^^^236^257^[REPLACE] if  ( this.includeLowerBound != that.includeLowerBound )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return true;^248^^^^^236^257^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  ( this.includeUpperBound  ==  that.includeUpperBound )  {^250^^^^^236^257^[REPLACE] if  ( this.includeUpperBound != that.includeUpperBound )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return true;^251^^^^^236^257^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^if  (itemCount  ==  that.itemCount )  {^253^^^^^236^257^[REPLACE] if  ( this.itemCount != that.itemCount )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return true;^254^^^^^236^257^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return false;^256^^^^^236^257^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] SimpleHistogramBin   [TYPE]  Object obj  [TYPE]  SimpleHistogramBin that  [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 
[REPLACE]^return super .clone (  )  ;^267^^^^^266^268^[REPLACE] return super.clone (  ) ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] SimpleHistogramBin   [TYPE]  boolean false  includeLowerBound  includeUpperBound  true  [TYPE]  double lowerBound  upperBound  value  [TYPE]  long serialVersionUID  [TYPE]  int count  itemCount 