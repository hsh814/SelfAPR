[buglab_swap_variables]^labels[i] =  (  ( LabelNode )  i.get ( this.labels )  ) .getLabel (  ) ;^101^^^^^98^104^labels[i] =  (  ( LabelNode )  this.labels.get ( i )  ) .getLabel (  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] LabelNode  dflt  List  labels  Label[]  labels  boolean  int  i  max  min  MethodVisitor  mv  
[buglab_swap_variables]^mv.visitTableSwitchInsn ( min, max, dflt.getLabel (  )  ) ;^103^^^^^98^104^mv.visitTableSwitchInsn ( min, max, dflt.getLabel (  ) , labels ) ;^[CLASS] TableSwitchInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] LabelNode  dflt  List  labels  Label[]  labels  boolean  int  i  max  min  MethodVisitor  mv  
[buglab_swap_variables]^mv.visitTableSwitchInsn ( dflt, max, min.getLabel (  ) , labels ) ;^103^^^^^98^104^mv.visitTableSwitchInsn ( min, max, dflt.getLabel (  ) , labels ) ;^[CLASS] TableSwitchInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] LabelNode  dflt  List  labels  Label[]  labels  boolean  int  i  max  min  MethodVisitor  mv  
[buglab_swap_variables]^mv.visitTableSwitchInsn (  max, dflt.getLabel (  ) , labels ) ;^103^^^^^98^104^mv.visitTableSwitchInsn ( min, max, dflt.getLabel (  ) , labels ) ;^[CLASS] TableSwitchInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] LabelNode  dflt  List  labels  Label[]  labels  boolean  int  i  max  min  MethodVisitor  mv  
[buglab_swap_variables]^mv.visitTableSwitchInsn ( max, min, dflt.getLabel (  ) , labels ) ;^103^^^^^98^104^mv.visitTableSwitchInsn ( min, max, dflt.getLabel (  ) , labels ) ;^[CLASS] TableSwitchInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] LabelNode  dflt  List  labels  Label[]  labels  boolean  int  i  max  min  MethodVisitor  mv  
[buglab_swap_variables]^mv.visitTableSwitchInsn ( min,  dflt.getLabel (  ) , labels ) ;^103^^^^^98^104^mv.visitTableSwitchInsn ( min, max, dflt.getLabel (  ) , labels ) ;^[CLASS] TableSwitchInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] LabelNode  dflt  List  labels  Label[]  labels  boolean  int  i  max  min  MethodVisitor  mv  
[buglab_swap_variables]^mv.visitTableSwitchInsn ( min, max, labels.getLabel (  ) , dflt ) ;^103^^^^^98^104^mv.visitTableSwitchInsn ( min, max, dflt.getLabel (  ) , labels ) ;^[CLASS] TableSwitchInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] LabelNode  dflt  List  labels  Label[]  labels  boolean  int  i  max  min  MethodVisitor  mv  
[buglab_swap_variables]^mv.visitTableSwitchInsn ( min, max.getLabel (  ) , labels ) ;^103^^^^^98^104^mv.visitTableSwitchInsn ( min, max, dflt.getLabel (  ) , labels ) ;^[CLASS] TableSwitchInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] LabelNode  dflt  List  labels  Label[]  labels  boolean  int  i  max  min  MethodVisitor  mv  
[buglab_swap_variables]^return new TableSwitchInsnNode ( min, labels, clone ( dflt, max ) , clone ( this.labels, labels )  ) ;^107^108^109^110^^106^111^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this. labels )  ) ;^107^108^109^110^^106^111^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^return new TableSwitchInsnNode ( max, min, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^107^108^109^110^^106^111^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^return new TableSwitchInsnNode (  max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^107^108^109^110^^106^111^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^return new TableSwitchInsnNode ( min,  clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^107^108^109^110^^106^111^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^return new TableSwitchInsnNode ( dflt, max, clone ( min, labels ) , clone ( this.labels, labels )  ) ;^107^108^109^110^^106^111^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^return new TableSwitchInsnNode ( min, max, clone (  labels ) , clone ( this.labels, labels )  ) ;^107^108^109^110^^106^111^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^return new TableSwitchInsnNode ( this.labels, max, clone ( dflt, labels ) , clone ( min, labels )  ) ;^107^108^109^110^^106^111^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone (  labels )  ) ;^107^108^109^110^^106^111^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^return new TableSwitchInsnNode ( min, max, clone ( labels, dflt ) , clone ( this.labels, labels )  ) ;^107^108^109^110^^106^111^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^return new TableSwitchInsnNode ( min, max, clone ( dflt, this.labels ) , clone ( labels, labels )  ) ;^107^108^109^110^^106^111^return new TableSwitchInsnNode ( min, max, clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^clone ( labels, dflt ) , clone ( this.labels, labels )  ) ;^109^110^^^^106^111^clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^clone ( dflt, labels ) , clone ( this. labels )  ) ;^109^110^^^^106^111^clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^clone (  labels ) , clone ( this.labels, labels )  ) ;^109^110^^^^106^111^clone ( dflt, labels ) , clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^clone ( labels, this.labels )  ) ;^110^^^^^106^111^clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^clone ( this. labels )  ) ;^110^^^^^106^111^clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  
[buglab_swap_variables]^clone (  labels )  ) ;^110^^^^^106^111^clone ( this.labels, labels )  ) ;^[CLASS] TableSwitchInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  dflt  List  labels  boolean  Map  labels  int  i  max  min  