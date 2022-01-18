[REPLACE]^private static final long serialVersionUID ;^44^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] FunctionNode  
[REPLACE]^public static  int FUNCTION_STATEMENT            = 1;^83^^^^^^^[REPLACE] public static final int FUNCTION_STATEMENT            = 1;^ [CLASS] FunctionNode  
[REPLACE]^public static  int FUNCTION_EXPRESSION           = 2;^84^^^^^^^[REPLACE] public static final int FUNCTION_EXPRESSION           = 2;^ [CLASS] FunctionNode  
[REPLACE]^public static final int FUNCTION_EXPRESSION_STATEMENT = 3 % 3;^85^^^^^^^[REPLACE] public static final int FUNCTION_EXPRESSION_STATEMENT = 3;^ [CLASS] FunctionNode  
[REPLACE]^short  functionName;^91^^^^^^^[REPLACE] String functionName;^ [CLASS] FunctionNode  
[REPLACE]^super ( Token.FUNCTION, lineno, charno ) ;^47^^^^^46^49^[REPLACE] super ( Token.FUNCTION ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String name [CLASS] FunctionNode   [TYPE]  boolean false  itsIgnoreDynamicScope  itsNeedsActivation  true  [TYPE]  String functionName  name  [TYPE]  long serialVersionUID  [TYPE]  int FUNCTION_EXPRESSION  FUNCTION_EXPRESSION_STATEMENT  FUNCTION_STATEMENT  itsFunctionType 
[REPLACE]^functionName =  null;^48^^^^^46^49^[REPLACE] functionName = name;^[METHOD] <init> [TYPE] String) [PARAMETER] String name [CLASS] FunctionNode   [TYPE]  boolean false  itsIgnoreDynamicScope  itsNeedsActivation  true  [TYPE]  String functionName  name  [TYPE]  long serialVersionUID  [TYPE]  int FUNCTION_EXPRESSION  FUNCTION_EXPRESSION_STATEMENT  FUNCTION_STATEMENT  itsFunctionType 
[REPLACE]^super ( Token.FUNCTION, itsFunctionType, charno ) ;^52^^^^^51^54^[REPLACE] super ( Token.FUNCTION, lineno, charno ) ;^[METHOD] <init> [TYPE] String,int,int) [PARAMETER] String name int lineno int charno [CLASS] FunctionNode   [TYPE]  boolean false  itsIgnoreDynamicScope  itsNeedsActivation  true  [TYPE]  String functionName  name  [TYPE]  long serialVersionUID  [TYPE]  int FUNCTION_EXPRESSION  FUNCTION_EXPRESSION_STATEMENT  FUNCTION_STATEMENT  charno  itsFunctionType  lineno 
[REPLACE]^functionName =  null;^53^^^^^51^54^[REPLACE] functionName = name;^[METHOD] <init> [TYPE] String,int,int) [PARAMETER] String name int lineno int charno [CLASS] FunctionNode   [TYPE]  boolean false  itsIgnoreDynamicScope  itsNeedsActivation  true  [TYPE]  String functionName  name  [TYPE]  long serialVersionUID  [TYPE]  int FUNCTION_EXPRESSION  FUNCTION_EXPRESSION_STATEMENT  FUNCTION_STATEMENT  charno  itsFunctionType  lineno 
[ADD]^^53^^^^^51^54^[ADD] functionName = name;^[METHOD] <init> [TYPE] String,int,int) [PARAMETER] String name int lineno int charno [CLASS] FunctionNode   [TYPE]  boolean false  itsIgnoreDynamicScope  itsNeedsActivation  true  [TYPE]  String functionName  name  [TYPE]  long serialVersionUID  [TYPE]  int FUNCTION_EXPRESSION  FUNCTION_EXPRESSION_STATEMENT  FUNCTION_STATEMENT  charno  itsFunctionType  lineno 
[REPLACE]^return itsNeedsActivation;^57^^^^^56^58^[REPLACE] return functionName;^[METHOD] getFunctionName [TYPE] String [PARAMETER] [CLASS] FunctionNode   [TYPE]  boolean false  itsIgnoreDynamicScope  itsNeedsActivation  true  [TYPE]  String functionName  name  [TYPE]  long serialVersionUID  [TYPE]  int FUNCTION_EXPRESSION  FUNCTION_EXPRESSION_STATEMENT  FUNCTION_STATEMENT  charno  itsFunctionType  lineno 
[REPLACE]^return functionName;^61^^^^^60^62^[REPLACE] return itsNeedsActivation;^[METHOD] requiresActivation [TYPE] boolean [PARAMETER] [CLASS] FunctionNode   [TYPE]  boolean false  itsIgnoreDynamicScope  itsNeedsActivation  true  [TYPE]  String functionName  name  [TYPE]  long serialVersionUID  [TYPE]  int FUNCTION_EXPRESSION  FUNCTION_EXPRESSION_STATEMENT  FUNCTION_STATEMENT  charno  itsFunctionType  lineno 
[REPLACE]^return itsNeedsActivation;^65^^^^^64^66^[REPLACE] return itsIgnoreDynamicScope;^[METHOD] getIgnoreDynamicScope [TYPE] boolean [PARAMETER] [CLASS] FunctionNode   [TYPE]  boolean false  itsIgnoreDynamicScope  itsNeedsActivation  true  [TYPE]  String functionName  name  [TYPE]  long serialVersionUID  [TYPE]  int FUNCTION_EXPRESSION  FUNCTION_EXPRESSION_STATEMENT  FUNCTION_STATEMENT  charno  itsFunctionType  lineno 
[REPLACE]^return itsNeedsActivation;^88^^^^^87^89^[REPLACE] return itsFunctionType;^[METHOD] getFunctionType [TYPE] int [PARAMETER] [CLASS] FunctionNode   [TYPE]  boolean false  itsIgnoreDynamicScope  itsNeedsActivation  true  [TYPE]  String functionName  name  [TYPE]  long serialVersionUID  [TYPE]  int FUNCTION_EXPRESSION  FUNCTION_EXPRESSION_STATEMENT  FUNCTION_STATEMENT  charno  itsFunctionType  lineno 