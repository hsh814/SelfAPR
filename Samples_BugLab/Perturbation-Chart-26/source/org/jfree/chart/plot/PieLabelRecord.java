[buglab_swap_variables]^return this.labelHeight - this.allocatedY / 2.0;^130^^^^^129^131^return this.allocatedY - this.labelHeight / 2.0;^[CLASS] PieLabelRecord  [METHOD] getLowerY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[buglab_swap_variables]^return this.labelHeight + this.allocatedY / 2.0;^139^^^^^138^140^return this.allocatedY + this.labelHeight / 2.0;^[CLASS] PieLabelRecord  [METHOD] getUpperY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[buglab_swap_variables]^if  ( plr < this.baseY.baseY )  {^226^^^^^222^234^if  ( this.baseY < plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[buglab_swap_variables]^if  ( plr.baseY < this.baseY )  {^226^^^^^222^234^if  ( this.baseY < plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[buglab_swap_variables]^else if  ( plr > this.baseY.baseY )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[buglab_swap_variables]^else if  ( plr.baseY > this.baseY )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[buglab_swap_variables]^else if  ( this.baseY > plr.baseY.baseY )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[buglab_swap_variables]^return this.key + ", " + this.baseY.toString (  ) ;^242^^^^^241^243^return this.baseY + ", " + this.key.toString (  ) ;^[CLASS] PieLabelRecord  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  