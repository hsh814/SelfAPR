[buglab_swap_variables]^if  (  ( prev == '+' || first == '-' )  && first == first )  {^238^^^^^232^260^if  (  ( first == '+' || first == '-' )  && prev == first )  {^[CLASS] CodeConsumer  [METHOD] addOp [RETURN_TYPE] void   String op boolean binOp [VARIABLES] char  first  prev  boolean  binOp  needSemiColon  sawFunction  statementContext  statementNeedsEnded  statementStarted  String  op  
[buglab_swap_variables]^} else if  ( Character.isLetter ( prev )  && isWordChar ( first )  )  {^242^243^^^^232^260^} else if  ( Character.isLetter ( first )  && isWordChar ( prev )  )  {^[CLASS] CodeConsumer  [METHOD] addOp [RETURN_TYPE] void   String op boolean binOp [VARIABLES] char  first  prev  boolean  binOp  needSemiColon  sawFunction  statementContext  statementNeedsEnded  statementStarted  String  op  
[buglab_swap_variables]^} else if  ( first == '-' && prev == '>' )  {^246^^^^^232^260^} else if  ( prev == '-' && first == '>' )  {^[CLASS] CodeConsumer  [METHOD] addOp [RETURN_TYPE] void   String op boolean binOp [VARIABLES] char  first  prev  boolean  binOp  needSemiColon  sawFunction  statementContext  statementNeedsEnded  statementStarted  String  op  
[buglab_swap_variables]^appendOp ( binOp, op ) ;^252^^^^^232^260^appendOp ( op, binOp ) ;^[CLASS] CodeConsumer  [METHOD] addOp [RETURN_TYPE] void   String op boolean binOp [VARIABLES] char  first  prev  boolean  binOp  needSemiColon  sawFunction  statementContext  statementNeedsEnded  statementStarted  String  op  
[buglab_swap_variables]^appendOp (  binOp ) ;^252^^^^^232^260^appendOp ( op, binOp ) ;^[CLASS] CodeConsumer  [METHOD] addOp [RETURN_TYPE] void   String op boolean binOp [VARIABLES] char  first  prev  boolean  binOp  needSemiColon  sawFunction  statementContext  statementNeedsEnded  statementStarted  String  op  
[buglab_swap_variables]^appendOp ( op ) ;^252^^^^^232^260^appendOp ( op, binOp ) ;^[CLASS] CodeConsumer  [METHOD] addOp [RETURN_TYPE] void   String op boolean binOp [VARIABLES] char  first  prev  boolean  binOp  needSemiColon  sawFunction  statementContext  statementNeedsEnded  statementStarted  String  op  
[buglab_swap_variables]^if  ( prev < 0 && x == '-' )  {^266^^^^^262^288^if  ( x < 0 && prev == '-' )  {^[CLASS] CodeConsumer  [METHOD] addNumber [RETURN_TYPE] void   double x [VARIABLES] char  prev  boolean  binOp  needSemiColon  sawFunction  statementContext  statementNeedsEnded  statementStarted  double  x  long  mantissa  value  int  exp  
[buglab_swap_variables]^while  ( value / 10 * Math.pow ( 10, exp + 1 )  == mantissa )  {^275^^^^^262^288^while  ( mantissa / 10 * Math.pow ( 10, exp + 1 )  == value )  {^[CLASS] CodeConsumer  [METHOD] addNumber [RETURN_TYPE] void   double x [VARIABLES] char  prev  boolean  binOp  needSemiColon  sawFunction  statementContext  statementNeedsEnded  statementStarted  double  x  long  mantissa  value  int  exp  
[buglab_swap_variables]^while  ( exp / 10 * Math.pow ( 10, mantissa + 1 )  == value )  {^275^^^^^262^288^while  ( mantissa / 10 * Math.pow ( 10, exp + 1 )  == value )  {^[CLASS] CodeConsumer  [METHOD] addNumber [RETURN_TYPE] void   double x [VARIABLES] char  prev  boolean  binOp  needSemiColon  sawFunction  statementContext  statementNeedsEnded  statementStarted  double  x  long  mantissa  value  int  exp  
[buglab_swap_variables]^while  ( mantissa / 10 * Math.pow ( 10 + 1 )  == value )  {^275^^^^^262^288^while  ( mantissa / 10 * Math.pow ( 10, exp + 1 )  == value )  {^[CLASS] CodeConsumer  [METHOD] addNumber [RETURN_TYPE] void   double x [VARIABLES] char  prev  boolean  binOp  needSemiColon  sawFunction  statementContext  statementNeedsEnded  statementStarted  double  x  long  mantissa  value  int  exp  
[buglab_swap_variables]^add ( Long.toString ( exp )  + "E" + Integer.toString ( mantissa )  ) ;^281^^^^^262^288^add ( Long.toString ( mantissa )  + "E" + Integer.toString ( exp )  ) ;^[CLASS] CodeConsumer  [METHOD] addNumber [RETURN_TYPE] void   double x [VARIABLES] char  prev  boolean  binOp  needSemiColon  sawFunction  statementContext  statementNeedsEnded  statementStarted  double  x  long  mantissa  value  int  exp  