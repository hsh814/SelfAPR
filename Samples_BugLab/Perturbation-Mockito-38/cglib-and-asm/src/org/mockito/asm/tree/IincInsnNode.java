[buglab_swap_variables]^mv.visitIincInsn ( incr, var ) ;^71^^^^^70^72^mv.visitIincInsn ( var, incr ) ;^[CLASS] IincInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] int  incr  var  MethodVisitor  mv  boolean  
[buglab_swap_variables]^mv.visitIincInsn (  incr ) ;^71^^^^^70^72^mv.visitIincInsn ( var, incr ) ;^[CLASS] IincInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] int  incr  var  MethodVisitor  mv  boolean  
[buglab_swap_variables]^mv.visitIincInsn ( var ) ;^71^^^^^70^72^mv.visitIincInsn ( var, incr ) ;^[CLASS] IincInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] int  incr  var  MethodVisitor  mv  boolean  
[buglab_swap_variables]^return new IincInsnNode ( incr, var ) ;^75^^^^^74^76^return new IincInsnNode ( var, incr ) ;^[CLASS] IincInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] Map  labels  int  incr  var  boolean  
[buglab_swap_variables]^return new IincInsnNode (  incr ) ;^75^^^^^74^76^return new IincInsnNode ( var, incr ) ;^[CLASS] IincInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] Map  labels  int  incr  var  boolean  
[buglab_swap_variables]^return new IincInsnNode ( var ) ;^75^^^^^74^76^return new IincInsnNode ( var, incr ) ;^[CLASS] IincInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] Map  labels  int  incr  var  boolean  