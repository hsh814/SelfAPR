[REPLACE]^private float y;^56^^^^^^^[REPLACE] private double y;^ [CLASS] YInterval  
[REPLACE]^private float yLow;^59^^^^^^^[REPLACE] private double yLow;^ [CLASS] YInterval  
[REPLACE]^this.y =  yLow;^72^^^^^71^75^[REPLACE] this.y = y;^[METHOD] <init> [TYPE] YInterval(double,double,double) [PARAMETER] double y double yLow double yHigh [CLASS] YInterval   [TYPE]  double y  yHigh  yLow  [TYPE]  boolean false  true 
[REPLACE]^this.yLow =  yHigh;^73^^^^^71^75^[REPLACE] this.yLow = yLow;^[METHOD] <init> [TYPE] YInterval(double,double,double) [PARAMETER] double y double yLow double yHigh [CLASS] YInterval   [TYPE]  double y  yHigh  yLow  [TYPE]  boolean false  true 
[REPLACE]^this.yHigh =  null;^74^^^^^71^75^[REPLACE] this.yHigh = yHigh;^[METHOD] <init> [TYPE] YInterval(double,double,double) [PARAMETER] double y double yLow double yHigh [CLASS] YInterval   [TYPE]  double y  yHigh  yLow  [TYPE]  boolean false  true 
[REPLACE]^return this.yLow;^83^^^^^82^84^[REPLACE] return this.y;^[METHOD] getY [TYPE] double [PARAMETER] [CLASS] YInterval   [TYPE]  double y  yHigh  yLow  [TYPE]  boolean false  true 
[REPLACE]^return this.y;^92^^^^^91^93^[REPLACE] return this.yLow;^[METHOD] getYLow [TYPE] double [PARAMETER] [CLASS] YInterval   [TYPE]  double y  yHigh  yLow  [TYPE]  boolean false  true 
[REPLACE]^return this.y;^101^^^^^100^102^[REPLACE] return this.yHigh;^[METHOD] getYHigh [TYPE] double [PARAMETER] [CLASS] YInterval   [TYPE]  double y  yHigh  yLow  [TYPE]  boolean false  true 
[REPLACE]^if  ( obj  !=  this )  {^112^^^^^111^129^[REPLACE] if  ( obj == this )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YInterval   [TYPE]  Object obj  [TYPE]  YInterval that  [TYPE]  boolean false  true  [TYPE]  double y  yHigh  yLow 
[REPLACE]^return false;^113^^^^^111^129^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YInterval   [TYPE]  Object obj  [TYPE]  YInterval that  [TYPE]  boolean false  true  [TYPE]  double y  yHigh  yLow 
[REPLACE]^if  ( ! ! ( obj instanceof YInterval )  )  {^115^^^^^111^129^[REPLACE] if  ( ! ( obj instanceof YInterval )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YInterval   [TYPE]  Object obj  [TYPE]  YInterval that  [TYPE]  boolean false  true  [TYPE]  double y  yHigh  yLow 
[REPLACE]^return true;^116^^^^^111^129^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YInterval   [TYPE]  Object obj  [TYPE]  YInterval that  [TYPE]  boolean false  true  [TYPE]  double y  yHigh  yLow 
[REPLACE]^if  ( this.y  ==  that.y )  {^119^^^^^111^129^[REPLACE] if  ( this.y != that.y )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YInterval   [TYPE]  Object obj  [TYPE]  YInterval that  [TYPE]  boolean false  true  [TYPE]  double y  yHigh  yLow 
[REPLACE]^return true;^120^^^^^111^129^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YInterval   [TYPE]  Object obj  [TYPE]  YInterval that  [TYPE]  boolean false  true  [TYPE]  double y  yHigh  yLow 
[REPLACE]^if  ( this.yLow  ==  that.yLow )  {^122^^^^^111^129^[REPLACE] if  ( this.yLow != that.yLow )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YInterval   [TYPE]  Object obj  [TYPE]  YInterval that  [TYPE]  boolean false  true  [TYPE]  double y  yHigh  yLow 
[REPLACE]^return true;^123^^^^^111^129^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YInterval   [TYPE]  Object obj  [TYPE]  YInterval that  [TYPE]  boolean false  true  [TYPE]  double y  yHigh  yLow 
[REPLACE]^if  ( this.yHigh  ==  that.yHigh )  {^125^^^^^111^129^[REPLACE] if  ( this.yHigh != that.yHigh )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YInterval   [TYPE]  Object obj  [TYPE]  YInterval that  [TYPE]  boolean false  true  [TYPE]  double y  yHigh  yLow 
[REPLACE]^return true;^126^^^^^111^129^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YInterval   [TYPE]  Object obj  [TYPE]  YInterval that  [TYPE]  boolean false  true  [TYPE]  double y  yHigh  yLow 
[REPLACE]^return false;^128^^^^^111^129^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] YInterval   [TYPE]  Object obj  [TYPE]  YInterval that  [TYPE]  boolean false  true  [TYPE]  double y  yHigh  yLow 