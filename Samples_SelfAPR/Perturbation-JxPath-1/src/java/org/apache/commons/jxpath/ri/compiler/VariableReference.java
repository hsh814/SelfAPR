[P8_Replace_Mix]^this.varName =  null;^33^^^^^32^34^this.varName = varName;^[CLASS] VariableReference  [METHOD] <init> [RETURN_TYPE] QName)   QName varName [VARIABLES] QName  varName  boolean  
[P3_Replace_Literal]^return "" + varName;^41^^^^^40^42^return "$" + varName;^[CLASS] VariableReference  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] QName  varName  boolean  
[P8_Replace_Mix]^return false ;^41^^^^^40^42^return "$" + varName;^[CLASS] VariableReference  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] QName  varName  boolean  
[P3_Replace_Literal]^return true;^45^^^^^44^46^return false;^[CLASS] VariableReference  [METHOD] isContextDependent [RETURN_TYPE] boolean   [VARIABLES] QName  varName  boolean  
[P3_Replace_Literal]^return true;^49^^^^^48^50^return false;^[CLASS] VariableReference  [METHOD] computeContextDependent [RETURN_TYPE] boolean   [VARIABLES] QName  varName  boolean  
[P7_Replace_Invocation]^return compute ( context ) ;^53^^^^^52^54^return computeValue ( context ) ;^[CLASS] VariableReference  [METHOD] compute [RETURN_TYPE] Object   EvalContext context [VARIABLES] EvalContext  context  QName  varName  boolean  
[P14_Delete_Statement]^^53^^^^^52^54^return computeValue ( context ) ;^[CLASS] VariableReference  [METHOD] compute [RETURN_TYPE] Object   EvalContext context [VARIABLES] EvalContext  context  QName  varName  boolean  
[P5_Replace_Variable]^return varName.getRootContext (  ) .getVariableContext ( context ) ;^60^^^^^59^61^return context.getRootContext (  ) .getVariableContext ( varName ) ;^[CLASS] VariableReference  [METHOD] computeValue [RETURN_TYPE] Object   EvalContext context [VARIABLES] EvalContext  context  QName  varName  boolean  
[P14_Delete_Statement]^^60^^^^^59^61^return context.getRootContext (  ) .getVariableContext ( varName ) ;^[CLASS] VariableReference  [METHOD] computeValue [RETURN_TYPE] Object   EvalContext context [VARIABLES] EvalContext  context  QName  varName  boolean  
