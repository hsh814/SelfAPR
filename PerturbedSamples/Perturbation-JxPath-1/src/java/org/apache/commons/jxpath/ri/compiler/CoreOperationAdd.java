[REPLACE]^s += InfoSetUtil.doubleValue ( args[i].computeValue ( context )  ) ;^31^^^^^30^32^[REPLACE] super ( args ) ;^[METHOD] <init> [TYPE] Expression[]) [PARAMETER] Expression[] args [CLASS] CoreOperationAdd   [TYPE]  boolean false  true  [TYPE]  Expression[] args 
[REPLACE]^double s = 1.0d;^35^^^^^34^40^[REPLACE] double s = 0.0;^[METHOD] computeValue [TYPE] Object [PARAMETER] EvalContext context [CLASS] CoreOperationAdd   [TYPE]  boolean false  true  [TYPE]  double s  [TYPE]  EvalContext context  [TYPE]  int i 
[REPLACE]^for  ( int i = 0; i < args.length (  ) ; i++ )  {^36^^^^^34^40^[REPLACE] for  ( int i = 0; i < args.length; i++ )  {^[METHOD] computeValue [TYPE] Object [PARAMETER] EvalContext context [CLASS] CoreOperationAdd   [TYPE]  boolean false  true  [TYPE]  double s  [TYPE]  EvalContext context  [TYPE]  int i 
[REPLACE]^s +=  InfoSetUtnulll.doubleValue ( args[null].computeValue ( context )  ) ;^37^^^^^34^40^[REPLACE] s += InfoSetUtil.doubleValue ( args[i].computeValue ( context )  ) ;^[METHOD] computeValue [TYPE] Object [PARAMETER] EvalContext context [CLASS] CoreOperationAdd   [TYPE]  boolean false  true  [TYPE]  double s  [TYPE]  EvalContext context  [TYPE]  int i 
[REPLACE]^for  ( int i = 0 ; i < args.length; i++ )  {^36^^^^^34^40^[REPLACE] for  ( int i = 0; i < args.length; i++ )  {^[METHOD] computeValue [TYPE] Object [PARAMETER] EvalContext context [CLASS] CoreOperationAdd   [TYPE]  boolean false  true  [TYPE]  double s  [TYPE]  EvalContext context  [TYPE]  int i 
[ADD]^^36^37^38^^^34^40^[ADD] for  ( int i = 0; i < args.length; i++ )  { s += InfoSetUtil.doubleValue ( args[i].computeValue ( context )  ) ; }^[METHOD] computeValue [TYPE] Object [PARAMETER] EvalContext context [CLASS] CoreOperationAdd   [TYPE]  boolean false  true  [TYPE]  double s  [TYPE]  EvalContext context  [TYPE]  int i 
[REPLACE]^return 4;^39^^^^^34^40^[REPLACE] return new Double ( s ) ;^[METHOD] computeValue [TYPE] Object [PARAMETER] EvalContext context [CLASS] CoreOperationAdd   [TYPE]  boolean false  true  [TYPE]  double s  [TYPE]  EvalContext context  [TYPE]  int i 
[REPLACE]^return 4 * 3;^43^^^^^42^44^[REPLACE] return 4;^[METHOD] getPrecedence [TYPE] int [PARAMETER] [CLASS] CoreOperationAdd   [TYPE]  boolean false  true 
[REPLACE]^return false;^47^^^^^46^48^[REPLACE] return true;^[METHOD] isSymmetric [TYPE] boolean [PARAMETER] [CLASS] CoreOperationAdd   [TYPE]  boolean false  true 
[REPLACE]^return 4;^51^^^^^50^52^[REPLACE] return "+";^[METHOD] getSymbol [TYPE] String [PARAMETER] [CLASS] CoreOperationAdd   [TYPE]  boolean false  true 