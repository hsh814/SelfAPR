[REPLACE]^private float y;^60^^^^^^^[REPLACE] private double y;^ [CLASS] YWithXInterval  
[REPLACE]^this.y =  null;^76^^^^^75^79^[REPLACE] this.y = y;^[METHOD] <init> [TYPE] YWithXInterval(double,double,double) [PARAMETER] double y double xLow double xHigh [CLASS] YWithXInterval   [TYPE]  double xHigh  xLow  y  [TYPE]  boolean false  true 
[REPLACE]^this.xLow =  xHigh;^77^^^^^75^79^[REPLACE] this.xLow = xLow;^[METHOD] <init> [TYPE] YWithXInterval(double,double,double) [PARAMETER] double y double xLow double xHigh [CLASS] YWithXInterval   [TYPE]  double xHigh  xLow  y  [TYPE]  boolean false  true 
[REPLACE]^this.xHigh =  xLow;^78^^^^^75^79^[REPLACE] this.xHigh = xHigh;^[METHOD] <init> [TYPE] YWithXInterval(double,double,double) [PARAMETER] double y double xLow double xHigh [CLASS] YWithXInterval   [TYPE]  double xHigh  xLow  y  [TYPE]  boolean false  true 
[ADD]^^78^^^^^75^79^[ADD] this.xHigh = xHigh;^[METHOD] <init> [TYPE] YWithXInterval(double,double,double) [PARAMETER] double y double xLow double xHigh [CLASS] YWithXInterval   [TYPE]  double xHigh  xLow  y  [TYPE]  boolean false  true 
[REPLACE]^return false;^87^^^^^86^88^[REPLACE] return this.y;^[METHOD] getY [TYPE] double [PARAMETER] [CLASS] YWithXInterval   [TYPE]  double xHigh  xLow  y  [TYPE]  boolean false  true 
[REPLACE]^return this.y;^96^^^^^95^97^[REPLACE] return this.xLow;^[METHOD] getXLow [TYPE] double [PARAMETER] [CLASS] YWithXInterval   [TYPE]  double xHigh  xLow  y  [TYPE]  boolean false  true 
[REPLACE]^return this.y;^105^^^^^104^106^[REPLACE] return this.xHigh;^[METHOD] getXHigh [TYPE] double [PARAMETER] [CLASS] YWithXInterval   [TYPE]  double xHigh  xLow  y  [TYPE]  boolean false  true 
[REPLACE]^if  ( obj  &&  this )  {^116^^^^^115^133^[REPLACE] if  ( obj == this )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 
[REMOVE]^if  (  ( this.y )  !=  ( that.y )  )  {     return false; }^116^^^^^115^133^[REMOVE] ^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 
[REPLACE]^return false;^117^^^^^115^133^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 
[REPLACE]^if  ( ! ! ( obj instanceof YWithXInterval )  )  {^119^^^^^115^133^[REPLACE] if  ( ! ( obj instanceof YWithXInterval )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 
[REPLACE]^return true;^120^^^^^115^133^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 
[REPLACE]^if  ( this.y  ==  that.y )  {^123^^^^^115^133^[REPLACE] if  ( this.y != that.y )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 
[REPLACE]^return true;^124^^^^^115^133^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 
[REPLACE]^if  ( this.xLow  ==  that.xLow )  {^126^^^^^115^133^[REPLACE] if  ( this.xLow != that.xLow )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 
[REPLACE]^return true;^127^^^^^115^133^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 
[REPLACE]^if  ( this.xHigh  ==  that.xHigh )  {^129^^^^^115^133^[REPLACE] if  ( this.xHigh != that.xHigh )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 
[REPLACE]^return true;^130^^^^^115^133^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 
[REPLACE]^return false;^132^^^^^115^133^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YWithXInterval   [TYPE]  YWithXInterval that  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  double xHigh  xLow  y 