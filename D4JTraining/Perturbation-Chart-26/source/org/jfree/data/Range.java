[REPLACE]^private static final long serialVersionUID ;^71^^^^^^^[REPLACE] private static final long serialVersionUID = -906333695431863380L;^ [CLASS] Range  
[REPLACE]^private float lower;^74^^^^^^^[REPLACE] private double lower;^ [CLASS] Range  
[REPLACE]^if  ( lower  ==  upper )  {^86^^^^^85^93^[REPLACE] if  ( lower > upper )  {^[METHOD] <init> [TYPE] Range(double,double) [PARAMETER] double lower double upper [CLASS] Range   [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  double lower  upper  [TYPE]  long serialVersionUID 
[REPLACE]^String msg = "Range ( double, double ) : require lower  ( "  ^  lower  ^  " )  <= upper  ( "  ^  upper  ^  " ) .";^87^88^^^^85^93^[REPLACE] String msg = "Range ( double, double ) : require lower  ( " + lower + " )  <= upper  ( " + upper + " ) .";^[METHOD] <init> [TYPE] Range(double,double) [PARAMETER] double lower double upper [CLASS] Range   [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  double lower  upper  [TYPE]  long serialVersionUID 
[REPLACE]^return ;^89^^^^^85^93^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] Range(double,double) [PARAMETER] double lower double upper [CLASS] Range   [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  double lower  upper  [TYPE]  long serialVersionUID 
[REPLACE]^String msg = "Range ( double, double ) : require lower  ( "  !=  lower  !=  " )  <= upper  ( "  !=  upper  !=  " ) .";^87^88^^^^85^93^[REPLACE] String msg = "Range ( double, double ) : require lower  ( " + lower + " )  <= upper  ( " + upper + " ) .";^[METHOD] <init> [TYPE] Range(double,double) [PARAMETER] double lower double upper [CLASS] Range   [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  double lower  upper  [TYPE]  long serialVersionUID 
[ADD]^^89^^^^^85^93^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] Range(double,double) [PARAMETER] double lower double upper [CLASS] Range   [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  double lower  upper  [TYPE]  long serialVersionUID 
[REPLACE]^this.lower =  upper;^91^^^^^85^93^[REPLACE] this.lower = lower;^[METHOD] <init> [TYPE] Range(double,double) [PARAMETER] double lower double upper [CLASS] Range   [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  double lower  upper  [TYPE]  long serialVersionUID 
[REPLACE]^this.upper =  lower;^92^^^^^85^93^[REPLACE] this.upper = upper;^[METHOD] <init> [TYPE] Range(double,double) [PARAMETER] double lower double upper [CLASS] Range   [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  double lower  upper  [TYPE]  long serialVersionUID 
[ADD]^^92^^^^^85^93^[ADD] this.upper = upper;^[METHOD] <init> [TYPE] Range(double,double) [PARAMETER] double lower double upper [CLASS] Range   [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  double lower  upper  [TYPE]  long serialVersionUID 
[REPLACE]^return this.upper;^101^^^^^100^102^[REPLACE] return this.lower;^[METHOD] getLowerBound [TYPE] double [PARAMETER] [CLASS] Range   [TYPE]  double lower  upper  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return this.lower;^110^^^^^109^111^[REPLACE] return this.upper;^[METHOD] getUpperBound [TYPE] double [PARAMETER] [CLASS] Range   [TYPE]  double lower  upper  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return upper - upper;^119^^^^^118^120^[REPLACE] return this.upper - this.lower;^[METHOD] getLength [TYPE] double [PARAMETER] [CLASS] Range   [TYPE]  double lower  upper  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return this.lower / 4.0d  ;^128^^^^^127^129^[REPLACE] return this.lower / 2.0 + this.upper / 2.0;^[METHOD] getCentralValue [TYPE] double [PARAMETER] [CLASS] Range   [TYPE]  double lower  upper  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return true ;^140^^^^^139^141^[REPLACE] return  ( value >= this.lower && value <= this.upper ) ;^[METHOD] contains [TYPE] boolean [PARAMETER] double value [CLASS] Range   [TYPE]  double lower  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  (b1  >  this.lower )  {^153^^^^^152^159^[REPLACE] if  ( b0 <= this.lower )  {^[METHOD] intersects [TYPE] boolean [PARAMETER] double b0 double b1 [CLASS] Range   [TYPE]  double b0  b1  lower  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return  ( b0 < this.upper || b1 ;^157^^^^^152^159^[REPLACE] return  ( b0 < this.upper && b1 >= b0 ) ;^[METHOD] intersects [TYPE] boolean [PARAMETER] double b0 double b1 [CLASS] Range   [TYPE]  double b0  b1  lower  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return  ( b1  !=  this.lower ) ;;^154^^^^^152^159^[REPLACE] return  ( b1 > this.lower ) ;^[METHOD] intersects [TYPE] boolean [PARAMETER] double b0 double b1 [CLASS] Range   [TYPE]  double b0  b1  lower  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return  (b0  ;^154^^^^^152^159^[REPLACE] return  ( b1 > this.lower ) ;^[METHOD] intersects [TYPE] boolean [PARAMETER] double b0 double b1 [CLASS] Range   [TYPE]  double b0  b1  lower  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^double result = result;^170^^^^^169^180^[REPLACE] double result = value;^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( contains (result )  )  {^171^^^^^169^180^[REPLACE] if  ( !contains ( value )  )  {^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^171^172^173^174^^169^180^[ADD] if  ( !contains ( value )  )  { if  ( value > this.upper )  { result = this.upper; }^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( value  <  this.upper )  {^172^^^^^169^180^[REPLACE] if  ( value > this.upper )  {^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^172^173^174^^^169^180^[ADD] if  ( value > this.upper )  { result = this.upper; }^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( value  != result )  {^175^^^^^169^180^[REPLACE] else if  ( value < this.lower )  {^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^result = this.upper; ;^176^^^^^169^180^[REPLACE] result = this.lower;^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^176^^^^^169^180^[ADD] result = this.lower;^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^result = this.lower; ;^173^^^^^169^180^[REPLACE] result = this.upper;^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^173^^^^^169^180^[ADD] result = this.upper;^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  (result  >  this.lower )  {^175^^^^^169^180^[REPLACE] else if  ( value < this.lower )  {^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  (result  !=  this.upper )  {^172^^^^^169^180^[REPLACE] if  ( value > this.upper )  {^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^result = this.upper;^172^173^174^^^169^180^[ADD] if  ( value > this.upper )  { result = this.upper; }^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^else {^175^^^^^169^180^[REPLACE] else if  ( value < this.lower )  {^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  (result  ==  this.lower )  {^175^^^^^169^180^[REPLACE] else if  ( value < this.lower )  {^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return this.upper;^179^^^^^169^180^[REPLACE] return result;^[METHOD] constrain [TYPE] double [PARAMETER] double value [CLASS] Range   [TYPE]  double b0  b1  lower  result  upper  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( range1 != null )  {^199^^^^^198^214^[REPLACE] if  ( range1 == null )  {^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( range2 != this  )  {^203^^^^^198^214^[REPLACE] if  ( range2 == null )  {^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[ADD]^^203^204^205^^^198^214^[ADD] if  ( range2 == null )  { return range1; }^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^return  new Range ( value, value )  ;^211^^^^^198^214^[REPLACE] return new Range ( l, u ) ;^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^double l = Math.min ( range1.getUpperBound (  ) , range2.getLowerBound (  )  ) ;^207^208^^^^198^214^[REPLACE] double l = Math.min ( range1.getLowerBound (  ) , range2.getLowerBound (  )  ) ;^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^double u = Math.max ( range1.getLowerBound (  ) , range2.getUpperBound (  )  ) ;^209^210^^^^198^214^[REPLACE] double u = Math.max ( range1.getUpperBound (  ) , range2.getUpperBound (  )  ) ;^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^return range2;^204^^^^^198^214^[REPLACE] return range1;^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^return range1;^200^^^^^198^214^[REPLACE] return range2;^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( range2 != false )  {^203^^^^^198^214^[REPLACE] if  ( range2 == null )  {^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^double u =   range1.getUpperBound (  )   ) ;^209^210^^^^198^214^[REPLACE] double u = Math.max ( range1.getUpperBound (  ) , range2.getUpperBound (  )  ) ;^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^double l = Math.min ( range1 .getUpperBound (  )  , range2^207^208^^^^198^214^[REPLACE] double l = Math.min ( range1.getLowerBound (  ) , range2.getLowerBound (  )  ) ;^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[ADD]^^207^208^^^^198^214^[ADD] double l = Math.min ( range1.getLowerBound (  ) , range2.getLowerBound (  )  ) ;^[METHOD] combine [TYPE] Range [PARAMETER] Range range1 Range range2 [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range1  range2  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( range != this )  {^228^^^^^227^240^[REPLACE] if  ( range == null )  {^[METHOD] expandToInclude [TYPE] Range [PARAMETER] Range range double value [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^return  new Range ( value, range.getUpperBound (  )  )  ;^229^^^^^227^240^[REPLACE] return new Range ( value, value ) ;^[METHOD] expandToInclude [TYPE] Range [PARAMETER] Range range double value [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^if  (u  <=  range.getLowerBound (  )  )  {^231^^^^^227^240^[REPLACE] if  ( value < range.getLowerBound (  )  )  {^[METHOD] expandToInclude [TYPE] Range [PARAMETER] Range range double value [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( value  == u (  )  )  {^234^^^^^227^240^[REPLACE] else if  ( value > range.getUpperBound (  )  )  {^[METHOD] expandToInclude [TYPE] Range [PARAMETER] Range range double value [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[ADD]^return new Range ( range.getLowerBound (  ) , value ) ;^234^235^236^^^227^240^[ADD] else if  ( value > range.getUpperBound (  )  )  { return new Range ( range.getLowerBound (  ) , value ) ; }^[METHOD] expandToInclude [TYPE] Range [PARAMETER] Range range double value [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^return range2;^238^^^^^227^240^[REPLACE] return range;^[METHOD] expandToInclude [TYPE] Range [PARAMETER] Range range double value [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^return new Range ( range.getUpperBound (  ) , value ) ;^235^^^^^227^240^[REPLACE] return new Range ( range.getLowerBound (  ) , value ) ;^[METHOD] expandToInclude [TYPE] Range [PARAMETER] Range range double value [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^return new Range ( value, range .getLowerBound (  )   ) ;^232^^^^^227^240^[REPLACE] return new Range ( value, range.getUpperBound (  )  ) ;^[METHOD] expandToInclude [TYPE] Range [PARAMETER] Range range double value [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^else {^234^^^^^227^240^[REPLACE] else if  ( value > range.getUpperBound (  )  )  {^[METHOD] expandToInclude [TYPE] Range [PARAMETER] Range range double value [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^return new Range ( range .getUpperBound (  )  , value ) ;^235^^^^^227^240^[REPLACE] return new Range ( range.getLowerBound (  ) , value ) ;^[METHOD] expandToInclude [TYPE] Range [PARAMETER] Range range double value [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  lower  result  u  upper  value  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( range != this )  {^255^^^^^253^263^[REPLACE] if  ( range == null )  {^[METHOD] expand [TYPE] Range [PARAMETER] Range range double lowerMargin double upperMargin [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^return ;^256^^^^^253^263^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] expand [TYPE] Range [PARAMETER] Range range double lowerMargin double upperMargin [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[ADD]^^256^^^^^253^263^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] expand [TYPE] Range [PARAMETER] Range range double lowerMargin double upperMargin [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^double length = range .getLowerBound (  )  ;^258^^^^^253^263^[REPLACE] double length = range.getLength (  ) ;^[METHOD] expand [TYPE] Range [PARAMETER] Range range double lowerMargin double upperMargin [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^double lower = length + 4 * lowerMargin;^259^^^^^253^263^[REPLACE] double lower = length * lowerMargin;^[METHOD] expand [TYPE] Range [PARAMETER] Range range double lowerMargin double upperMargin [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[ADD]^^259^260^^^^253^263^[ADD] double lower = length * lowerMargin; double upper = length * upperMargin;^[METHOD] expand [TYPE] Range [PARAMETER] Range range double lowerMargin double upperMargin [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^double upper = length *  0.5  * upperMargin;^260^^^^^253^263^[REPLACE] double upper = length * upperMargin;^[METHOD] expand [TYPE] Range [PARAMETER] Range range double lowerMargin double upperMargin [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[ADD]^^260^^^^^253^263^[ADD] double upper = length * upperMargin;^[METHOD] expand [TYPE] Range [PARAMETER] Range range double lowerMargin double upperMargin [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^return  new Range (  (  ( base.getLowerBound (  )  )  + delta ) ,  (  ( base.getUpperBound (  )  )  + delta )  )   - lower, range.contains (  )  + upper ) ;^261^262^^^^253^263^[REPLACE] return new Range ( range.getLowerBound (  )  - lower, range.getUpperBound (  )  + upper ) ;^[METHOD] expand [TYPE] Range [PARAMETER] Range range double lowerMargin double upperMargin [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^return shift ( base, delta, true ) ;^274^^^^^273^275^[REPLACE] return shift ( base, delta, false ) ;^[METHOD] shift [TYPE] Range [PARAMETER] Range base double delta [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  Range base  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^else if  ( value > range.getUpperBound (  )  )  {^290^^^^^288^299^[REPLACE] if  ( allowZeroCrossing )  {^[METHOD] shift [TYPE] Range [PARAMETER] Range base double delta boolean allowZeroCrossing [CLASS] Range   [TYPE]  boolean allowZeroCrossing  false  true  [TYPE]  Range base  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^return new Range ( shiftWithNoZeroCrossing ( base.getLowerBound (  ) , delta ) , shiftWithNoZeroCrossing ( base.getLowerBound (  ) , delta )  ) ;^295^296^297^^^288^299^[REPLACE] return new Range ( shiftWithNoZeroCrossing ( base.getLowerBound (  ) , delta ) , shiftWithNoZeroCrossing ( base.getUpperBound (  ) , delta )  ) ;^[METHOD] shift [TYPE] Range [PARAMETER] Range base double delta boolean allowZeroCrossing [CLASS] Range   [TYPE]  boolean allowZeroCrossing  false  true  [TYPE]  Range base  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^return new Range ( base.getLowerBound (  )  + delta, base.contains (  )  + delta ) ;^291^292^^^^288^299^[REPLACE] return new Range ( base.getLowerBound (  )  + delta, base.getUpperBound (  )  + delta ) ;^[METHOD] shift [TYPE] Range [PARAMETER] Range base double delta boolean allowZeroCrossing [CLASS] Range   [TYPE]  boolean allowZeroCrossing  false  true  [TYPE]  Range base  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^return new Range ( base.getLowerBound (  )  + value, base .getLowerBound (  )   + delta ) ;^291^292^^^^288^299^[REPLACE] return new Range ( base.getLowerBound (  )  + delta, base.getUpperBound (  )  + delta ) ;^[METHOD] shift [TYPE] Range [PARAMETER] Range base double delta boolean allowZeroCrossing [CLASS] Range   [TYPE]  boolean allowZeroCrossing  false  true  [TYPE]  Range base  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^return new Range ( shiftWithNoZeroCrossing ( base.getLowerBound (  ) , value ) , shiftWithNoZeroCrossing ( base.getUpperBound (  ) , delta )  ) ;^295^296^297^^^288^299^[REPLACE] return new Range ( shiftWithNoZeroCrossing ( base.getLowerBound (  ) , delta ) , shiftWithNoZeroCrossing ( base.getUpperBound (  ) , delta )  ) ;^[METHOD] shift [TYPE] Range [PARAMETER] Range base double delta boolean allowZeroCrossing [CLASS] Range   [TYPE]  boolean allowZeroCrossing  false  true  [TYPE]  Range base  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( value  ==  0.0D )  {^311^^^^^310^320^[REPLACE] if  ( value > 0.0 )  {^[METHOD] shiftWithNoZeroCrossing [TYPE] double [PARAMETER] double value double delta [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( upperMargin  ==  0.0D )  {^314^^^^^310^320^[REPLACE] else if  ( value < 0.0 )  {^[METHOD] shiftWithNoZeroCrossing [TYPE] double [PARAMETER] double value double delta [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^returnupperMargin + upperMargin;^318^^^^^310^320^[REPLACE] return value + delta;^[METHOD] shiftWithNoZeroCrossing [TYPE] double [PARAMETER] double value double delta [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return   upperMargin + value  ;^315^^^^^310^320^[REPLACE] return Math.min ( value + delta, 0.0 ) ;^[METHOD] shiftWithNoZeroCrossing [TYPE] double [PARAMETER] double value double delta [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return   value  &&  delta  ;^315^^^^^310^320^[REPLACE] return Math.min ( value + delta, 0.0 ) ;^[METHOD] shiftWithNoZeroCrossing [TYPE] double [PARAMETER] double value double delta [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return value +upperMargin;^318^^^^^310^320^[REPLACE] return value + delta;^[METHOD] shiftWithNoZeroCrossing [TYPE] double [PARAMETER] double value double delta [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return   value + delta  ;^312^^^^^310^320^[REPLACE] return Math.max ( value + delta, 0.0 ) ;^[METHOD] shiftWithNoZeroCrossing [TYPE] double [PARAMETER] double value double delta [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^else {^314^^^^^310^320^[REPLACE] else if  ( value < 0.0 )  {^[METHOD] shiftWithNoZeroCrossing [TYPE] double [PARAMETER] double value double delta [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return   value +upperMargin  ;^315^^^^^310^320^[REPLACE] return Math.min ( value + delta, 0.0 ) ;^[METHOD] shiftWithNoZeroCrossing [TYPE] double [PARAMETER] double value double delta [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return   value + delta  ;^315^^^^^310^320^[REPLACE] return Math.min ( value + delta, 0.0 ) ;^[METHOD] shiftWithNoZeroCrossing [TYPE] double [PARAMETER] double value double delta [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return value  !=  delta;;^318^^^^^310^320^[REPLACE] return value + delta;^[METHOD] shiftWithNoZeroCrossing [TYPE] double [PARAMETER] double value double delta [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( ! ! ( obj instanceof Range )  )  {^330^^^^^329^341^[REPLACE] if  ( ! ( obj instanceof Range )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Range   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^331^^^^^329^341^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Range   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^double result = value;^333^^^^^329^341^[REPLACE] Range range =  ( Range )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Range   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^if  (  ( this.lower == range.lower )  )  {^334^^^^^329^341^[REPLACE] if  ( ! ( this.lower == range.lower )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Range   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^335^^^^^329^341^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Range   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^if  (  ( this.upper == range.upper )  )  {^337^^^^^329^341^[REPLACE] if  ( ! ( this.upper == range.upper )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Range   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[ADD]^^337^338^339^^^329^341^[ADD] if  ( ! ( this.upper == range.upper )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Range   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^338^^^^^329^341^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Range   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^340^^^^^329^341^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Range   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  Range range  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID 
[REPLACE]^double result = value;^349^^^^^348^356^[REPLACE] int result;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  temp  [TYPE]  int result 
[REPLACE]^Range range =  ( Range )  obj;^350^^^^^348^356^[REPLACE] long temp;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  temp  [TYPE]  int result 
[REPLACE]^temp = Double.doubleToLongBits ( this.upper ) ; ;^351^^^^^348^356^[REPLACE] temp = Double.doubleToLongBits ( this.lower ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  temp  [TYPE]  int result 
[REPLACE]^result =  ( int )   (serialVersionUID ^  ( temp >>> 32 )  ) ;^352^^^^^348^356^[REPLACE] result =  ( int )   ( temp ^  ( temp >>> 32 )  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  temp  [TYPE]  int result 
[REPLACE]^temp = Double.doubleToLongBits ( this.lower ) ; ;^353^^^^^348^356^[REPLACE] temp = Double.doubleToLongBits ( this.upper ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  temp  [TYPE]  int result 
[REPLACE]^result = 3 * result  &   ( int )   ( temp ^  ( temp >>> 32 )  ) ;^354^^^^^348^356^[REPLACE] result = 29 * result +  ( int )   ( temp ^  ( temp >>> 32 )  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  temp  [TYPE]  int result 
[ADD]^^354^355^^^^348^356^[ADD] result = 29 * result +  ( int )   ( temp ^  ( temp >>> 32 )  ) ; return result;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  temp  [TYPE]  int result 
[REPLACE]^return this.upper;^355^^^^^348^356^[REPLACE] return result;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] Range   [TYPE]  boolean false  true  [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  temp  [TYPE]  int result 
[REPLACE]^return true ;^365^^^^^364^366^[REPLACE] return  ( "Range[" + this.lower + "," + this.upper + "]" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Range   [TYPE]  double b0  b1  delta  l  length  lower  lowerMargin  result  u  upper  upperMargin  value  [TYPE]  long serialVersionUID  temp  [TYPE]  boolean false  true 