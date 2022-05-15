[buglab_swap_variables]^adjustDownwards ( height, minY ) ;^81^^^^^73^92^adjustDownwards ( minY, height ) ;^[CLASS] PieLabelDistributor  [METHOD] distributeLabels [RETURN_TYPE] void   double minY double height [VARIABLES] double  height  minGap  minY  boolean  
[buglab_swap_variables]^adjustDownwards (  height ) ;^81^^^^^73^92^adjustDownwards ( minY, height ) ;^[CLASS] PieLabelDistributor  [METHOD] distributeLabels [RETURN_TYPE] void   double minY double height [VARIABLES] double  height  minGap  minY  boolean  
[buglab_swap_variables]^adjustDownwards ( minY ) ;^81^^^^^73^92^adjustDownwards ( minY, height ) ;^[CLASS] PieLabelDistributor  [METHOD] distributeLabels [RETURN_TYPE] void   double minY double height [VARIABLES] double  height  minGap  minY  boolean  
[buglab_swap_variables]^adjustUpwards ( height, minY ) ;^85^^^^^73^92^adjustUpwards ( minY, height ) ;^[CLASS] PieLabelDistributor  [METHOD] distributeLabels [RETURN_TYPE] void   double minY double height [VARIABLES] double  height  minGap  minY  boolean  
[buglab_swap_variables]^adjustUpwards (  height ) ;^85^^^^^73^92^adjustUpwards ( minY, height ) ;^[CLASS] PieLabelDistributor  [METHOD] distributeLabels [RETURN_TYPE] void   double minY double height [VARIABLES] double  height  minGap  minY  boolean  
[buglab_swap_variables]^adjustUpwards ( minY ) ;^85^^^^^73^92^adjustUpwards ( minY, height ) ;^[CLASS] PieLabelDistributor  [METHOD] distributeLabels [RETURN_TYPE] void   double minY double height [VARIABLES] double  height  minGap  minY  boolean  
[buglab_swap_variables]^spreadEvenly ( height, minY ) ;^89^^^^^73^92^spreadEvenly ( minY, height ) ;^[CLASS] PieLabelDistributor  [METHOD] distributeLabels [RETURN_TYPE] void   double minY double height [VARIABLES] double  height  minGap  minY  boolean  
[buglab_swap_variables]^spreadEvenly (  height ) ;^89^^^^^73^92^spreadEvenly ( minY, height ) ;^[CLASS] PieLabelDistributor  [METHOD] distributeLabels [RETURN_TYPE] void   double minY double height [VARIABLES] double  height  minGap  minY  boolean  
[buglab_swap_variables]^spreadEvenly ( minY ) ;^89^^^^^73^92^spreadEvenly ( minY, height ) ;^[CLASS] PieLabelDistributor  [METHOD] distributeLabels [RETURN_TYPE] void   double minY double height [VARIABLES] double  height  minGap  minY  boolean  
[buglab_swap_variables]^if  ( plr > y.getLowerY (  )  )  {^104^^^^^100^110^if  ( y > plr.getLowerY (  )  )  {^[CLASS] PieLabelDistributor  [METHOD] isOverlap [RETURN_TYPE] boolean   [VARIABLES] PieLabelRecord  plr  boolean  double  height  minGap  minY  y  int  i  
[buglab_swap_variables]^while  ( lower > upper )  {^119^^^^^116^138^while  ( upper > lower )  {^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^if  ( upper < lower - 1 )  {^120^^^^^116^138^if  ( lower < upper - 1 )  {^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^if  ( r0.getLowerY (  )  < r1.getUpperY (  )  )  {^123^^^^^116^138^if  ( r1.getLowerY (  )  < r0.getUpperY (  )  )  {^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^double adjust = this.minGap.getUpperY (  )  - r1.getLowerY (  ) + r0;^124^125^^^^116^138^double adjust = r0.getUpperY (  )  - r1.getLowerY (  ) + this.minGap;^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^double adjust = r1.getUpperY (  )  - r0.getLowerY (  ) + this.minGap;^124^125^^^^116^138^double adjust = r0.getUpperY (  )  - r1.getLowerY (  ) + this.minGap;^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^r1.setAllocatedY ( adjust.getAllocatedY (  )  + r1 ) ;^126^^^^^116^138^r1.setAllocatedY ( r1.getAllocatedY (  )  + adjust ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^double adjust = r0.getUpperY (  )  - this.minGap.getLowerY (  ) + r1;^124^125^^^^116^138^double adjust = r0.getUpperY (  )  - r1.getLowerY (  ) + this.minGap;^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^double adjust =  ( r3.getUpperY (  )  - r2.getLowerY (  )  )  + this.minGap;^132^^^^^116^138^double adjust =  ( r2.getUpperY (  )  - r3.getLowerY (  )  )  + this.minGap;^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^double adjust =  ( r2.getUpperY (  )  - this.minGap.getLowerY (  )  )  + r3;^132^^^^^116^138^double adjust =  ( r2.getUpperY (  )  - r3.getLowerY (  )  )  + this.minGap;^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^r3.setAllocatedY ( adjust.getAllocatedY (  )  + r3 ) ;^133^^^^^116^138^r3.setAllocatedY ( r3.getAllocatedY (  )  + adjust ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^double adjust =  ( this.minGap.getUpperY (  )  - r3.getLowerY (  )  )  + r2;^132^^^^^116^138^double adjust =  ( r2.getUpperY (  )  - r3.getLowerY (  )  )  + this.minGap;^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^if  ( r3.getUpperY (  )  > r2.getLowerY (  )  )  {^131^^^^^116^138^if  ( r2.getUpperY (  )  > r3.getLowerY (  )  )  {^[CLASS] PieLabelDistributor  [METHOD] adjustInwards [RETURN_TYPE] void   [VARIABLES] PieLabelRecord  r0  r1  r2  r3  boolean  double  adjust  height  minGap  minY  y  int  lower  upper  
[buglab_swap_variables]^if  ( record0.getLowerY (  )  < record1.getUpperY (  )  )  {^151^^^^^147^157^if  ( record1.getLowerY (  )  < record0.getUpperY (  )  )  {^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + record1 + this.minGap.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( this.minGap + height, record0.getUpperY (  )  + minY + record1.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( height + minY, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( minY +  record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( minY + height, this.minGap.getUpperY (  )  + record0 + record1.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( minY + height.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( minY + height, record1.getUpperY (  )  + this.minGap + record0.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( record1 + height, record0.getUpperY (  )  + this.minGap + minY.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( record0 + height, minY.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( minY + this.minGap, record0.getUpperY (  )  + height + record1.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( minY + record1, record0.getUpperY (  )  + this.minGap + height.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.min ( minY + record0, height.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^152^153^154^^^147^157^record1.setAllocatedY ( Math.min ( minY + height, record0.getUpperY (  )  + this.minGap + record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustDownwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^if  ( record0.getUpperY (  )  > record1.getLowerY (  )  )  {^170^^^^^166^175^if  ( record1.getUpperY (  )  > record0.getLowerY (  )  )  {^[CLASS] PieLabelDistributor  [METHOD] adjustUpwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.max ( minY, record0.getLowerY (  ) - record1 - this.minGap.getLabelHeight (  )  / 2.0 )  ) ;^171^172^^^^166^175^record1.setAllocatedY ( Math.max ( minY, record0.getLowerY (  ) - this.minGap - record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustUpwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.max ( this.minGap, record0.getLowerY (  ) - minY - record1.getLabelHeight (  )  / 2.0 )  ) ;^171^172^^^^166^175^record1.setAllocatedY ( Math.max ( minY, record0.getLowerY (  ) - this.minGap - record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustUpwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.max (  record0.getLowerY (  ) - this.minGap - record1.getLabelHeight (  )  / 2.0 )  ) ;^171^172^^^^166^175^record1.setAllocatedY ( Math.max ( minY, record0.getLowerY (  ) - this.minGap - record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustUpwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.max ( minY, this.minGap.getLowerY (  ) - record0 - record1.getLabelHeight (  )  / 2.0 )  ) ;^171^172^^^^166^175^record1.setAllocatedY ( Math.max ( minY, record0.getLowerY (  ) - this.minGap - record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustUpwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.max ( minY.getLowerY (  ) - this.minGap - record1.getLabelHeight (  )  / 2.0 )  ) ;^171^172^^^^166^175^record1.setAllocatedY ( Math.max ( minY, record0.getLowerY (  ) - this.minGap - record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustUpwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.max ( record1, record0.getLowerY (  ) - this.minGap - minY.getLabelHeight (  )  / 2.0 )  ) ;^171^172^^^^166^175^record1.setAllocatedY ( Math.max ( minY, record0.getLowerY (  ) - this.minGap - record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustUpwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.max ( minY, record1.getLowerY (  ) - this.minGap - record0.getLabelHeight (  )  / 2.0 )  ) ;^171^172^^^^166^175^record1.setAllocatedY ( Math.max ( minY, record0.getLowerY (  ) - this.minGap - record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustUpwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^record1.setAllocatedY ( Math.max ( record0, minY.getLowerY (  ) - this.minGap - record1.getLabelHeight (  )  / 2.0 )  ) ;^171^172^^^^166^175^record1.setAllocatedY ( Math.max ( minY, record0.getLowerY (  ) - this.minGap - record1.getLabelHeight (  )  / 2.0 )  ) ;^[CLASS] PieLabelDistributor  [METHOD] adjustUpwards [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record0  record1  boolean  double  adjust  height  minGap  minY  y  int  i  
[buglab_swap_variables]^double gap = Math.max ( 0, sumOfLabelHeights - height ) ;^190^^^^^184^200^double gap = Math.max ( 0, height - sumOfLabelHeights ) ;^[CLASS] PieLabelDistributor  [METHOD] spreadEvenly [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record  boolean  double  adjust  gap  height  minGap  minY  sumOfLabelHeights  y  int  i  
[buglab_swap_variables]^double gap = Math.max ( 0 - sumOfLabelHeights ) ;^190^^^^^184^200^double gap = Math.max ( 0, height - sumOfLabelHeights ) ;^[CLASS] PieLabelDistributor  [METHOD] spreadEvenly [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record  boolean  double  adjust  gap  height  minGap  minY  sumOfLabelHeights  y  int  i  
[buglab_swap_variables]^y = record + y.getLabelHeight (  )  / 2.0;^196^^^^^184^200^y = y + record.getLabelHeight (  )  / 2.0;^[CLASS] PieLabelDistributor  [METHOD] spreadEvenly [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record  boolean  double  adjust  gap  height  minGap  minY  sumOfLabelHeights  y  int  i  
[buglab_swap_variables]^y = gap + record.getLabelHeight (  )  / 2.0 + y;^198^^^^^184^200^y = y + record.getLabelHeight (  )  / 2.0 + gap;^[CLASS] PieLabelDistributor  [METHOD] spreadEvenly [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record  boolean  double  adjust  gap  height  minGap  minY  sumOfLabelHeights  y  int  i  
[buglab_swap_variables]^y = record + y.getLabelHeight (  )  / 2.0 + gap;^198^^^^^184^200^y = y + record.getLabelHeight (  )  / 2.0 + gap;^[CLASS] PieLabelDistributor  [METHOD] spreadEvenly [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record  boolean  double  adjust  gap  height  minGap  minY  sumOfLabelHeights  y  int  i  
[buglab_swap_variables]^y = y + gap.getLabelHeight (  )  / 2.0 + record;^198^^^^^184^200^y = y + record.getLabelHeight (  )  / 2.0 + gap;^[CLASS] PieLabelDistributor  [METHOD] spreadEvenly [RETURN_TYPE] void   double minY double height [VARIABLES] PieLabelRecord  record  boolean  double  adjust  gap  height  minGap  minY  sumOfLabelHeights  y  int  i  