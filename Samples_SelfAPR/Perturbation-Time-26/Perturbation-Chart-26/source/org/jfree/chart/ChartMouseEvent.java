[P1_Replace_Type]^private static final  int  serialVersionUID = -682393837314562149L;^65^^^^^60^70^private static final long serialVersionUID = -682393837314562149L;^[CLASS] ChartMouseEvent   [VARIABLES] 
[P8_Replace_Mix]^private  final long serialVersionUID = -682393837314562149;^65^^^^^60^70^private static final long serialVersionUID = -682393837314562149L;^[CLASS] ChartMouseEvent   [VARIABLES] 
[P14_Delete_Statement]^^87^^^^^85^91^super ( chart ) ;^[CLASS] ChartMouseEvent  [METHOD] <init> [RETURN_TYPE] ChartEntity)   JFreeChart chart MouseEvent trigger ChartEntity entity [VARIABLES] MouseEvent  trigger  ChartEntity  entity  boolean  long  serialVersionUID  JFreeChart  chart  
[P8_Replace_Mix]^this.chart =  null;^88^^^^^85^91^this.chart = chart;^[CLASS] ChartMouseEvent  [METHOD] <init> [RETURN_TYPE] ChartEntity)   JFreeChart chart MouseEvent trigger ChartEntity entity [VARIABLES] MouseEvent  trigger  ChartEntity  entity  boolean  long  serialVersionUID  JFreeChart  chart  
[P11_Insert_Donor_Statement]^this.entity = entity;this.chart = chart;^88^^^^^85^91^this.chart = chart;^[CLASS] ChartMouseEvent  [METHOD] <init> [RETURN_TYPE] ChartEntity)   JFreeChart chart MouseEvent trigger ChartEntity entity [VARIABLES] MouseEvent  trigger  ChartEntity  entity  boolean  long  serialVersionUID  JFreeChart  chart  
[P8_Replace_Mix]^this.trigger =  null;^89^^^^^85^91^this.trigger = trigger;^[CLASS] ChartMouseEvent  [METHOD] <init> [RETURN_TYPE] ChartEntity)   JFreeChart chart MouseEvent trigger ChartEntity entity [VARIABLES] MouseEvent  trigger  ChartEntity  entity  boolean  long  serialVersionUID  JFreeChart  chart  
[P8_Replace_Mix]^this.entity =  null;^90^^^^^85^91^this.entity = entity;^[CLASS] ChartMouseEvent  [METHOD] <init> [RETURN_TYPE] ChartEntity)   JFreeChart chart MouseEvent trigger ChartEntity entity [VARIABLES] MouseEvent  trigger  ChartEntity  entity  boolean  long  serialVersionUID  JFreeChart  chart  
[P11_Insert_Donor_Statement]^this.chart = chart;this.entity = entity;^90^^^^^85^91^this.entity = entity;^[CLASS] ChartMouseEvent  [METHOD] <init> [RETURN_TYPE] ChartEntity)   JFreeChart chart MouseEvent trigger ChartEntity entity [VARIABLES] MouseEvent  trigger  ChartEntity  entity  boolean  long  serialVersionUID  JFreeChart  chart  
[P5_Replace_Variable]^return chart;^99^^^^^98^100^return this.chart;^[CLASS] ChartMouseEvent  [METHOD] getChart [RETURN_TYPE] JFreeChart   [VARIABLES] MouseEvent  trigger  ChartEntity  entity  boolean  long  serialVersionUID  JFreeChart  chart  
[P5_Replace_Variable]^return trigger;^108^^^^^107^109^return this.trigger;^[CLASS] ChartMouseEvent  [METHOD] getTrigger [RETURN_TYPE] MouseEvent   [VARIABLES] MouseEvent  trigger  ChartEntity  entity  boolean  long  serialVersionUID  JFreeChart  chart  
[P8_Replace_Mix]^return entity;^117^^^^^116^118^return this.entity;^[CLASS] ChartMouseEvent  [METHOD] getEntity [RETURN_TYPE] ChartEntity   [VARIABLES] MouseEvent  trigger  ChartEntity  entity  boolean  long  serialVersionUID  JFreeChart  chart  