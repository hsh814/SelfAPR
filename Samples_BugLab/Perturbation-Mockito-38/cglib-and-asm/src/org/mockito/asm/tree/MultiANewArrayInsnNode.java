[buglab_swap_variables]^mv.visitMultiANewArrayInsn ( dims, desc ) ;^71^^^^^70^72^mv.visitMultiANewArrayInsn ( desc, dims ) ;^[CLASS] MultiANewArrayInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] String  desc  boolean  int  dims  MethodVisitor  mv  
[buglab_swap_variables]^mv.visitMultiANewArrayInsn (  dims ) ;^71^^^^^70^72^mv.visitMultiANewArrayInsn ( desc, dims ) ;^[CLASS] MultiANewArrayInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] String  desc  boolean  int  dims  MethodVisitor  mv  
[buglab_swap_variables]^mv.visitMultiANewArrayInsn ( desc ) ;^71^^^^^70^72^mv.visitMultiANewArrayInsn ( desc, dims ) ;^[CLASS] MultiANewArrayInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] String  desc  boolean  int  dims  MethodVisitor  mv  
[buglab_swap_variables]^return new MultiANewArrayInsnNode ( dims, desc ) ;^75^^^^^74^76^return new MultiANewArrayInsnNode ( desc, dims ) ;^[CLASS] MultiANewArrayInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] String  desc  boolean  Map  labels  int  dims  
[buglab_swap_variables]^return new MultiANewArrayInsnNode (  dims ) ;^75^^^^^74^76^return new MultiANewArrayInsnNode ( desc, dims ) ;^[CLASS] MultiANewArrayInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] String  desc  boolean  Map  labels  int  dims  
[buglab_swap_variables]^return new MultiANewArrayInsnNode ( desc ) ;^75^^^^^74^76^return new MultiANewArrayInsnNode ( desc, dims ) ;^[CLASS] MultiANewArrayInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] String  desc  boolean  Map  labels  int  dims  