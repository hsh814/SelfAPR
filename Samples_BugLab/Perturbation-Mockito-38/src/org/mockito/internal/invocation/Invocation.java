[buglab_swap_variables]^this.arguments = expandVarArgs ( args.isVarArgs (  ) , method ) ;^52^^^^^48^56^this.arguments = expandVarArgs ( method.isVarArgs (  ) , args ) ;^[CLASS] Invocation  [METHOD] <init> [RETURN_TYPE] RealMethod)   Object mock Method method Object[] args int sequenceNumber RealMethod realMethod [VARIABLES] boolean  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  sequenceNumber  Object[]  args  arguments  rawArguments  Location  location  
[buglab_swap_variables]^this.arguments = expandVarArgs ( method.isVarArgs (  )  ) ;^52^^^^^48^56^this.arguments = expandVarArgs ( method.isVarArgs (  ) , args ) ;^[CLASS] Invocation  [METHOD] <init> [RETURN_TYPE] RealMethod)   Object mock Method method Object[] args int sequenceNumber RealMethod realMethod [VARIABLES] boolean  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  sequenceNumber  Object[]  args  arguments  rawArguments  Location  location  
[buglab_swap_variables]^if  ( !isVarArgs || args && isVarArgs[args.length - 1] != null && !args[args.length - 1].getClass (  ) .isArray (  )  )  {^61^^^^^60^78^if  ( !isVarArgs || isVarArgs && args[args.length - 1] != null && !args[args.length - 1].getClass (  ) .isArray (  )  )  {^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^final int nonVarArgsCount = args.length.length - 1;^65^^^^^60^78^final int nonVarArgsCount = args.length - 1;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^final int nonVarArgsCount = args - 1;^65^^^^^60^78^final int nonVarArgsCount = args.length - 1;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^final int varArgs.lengthCount = varArgs;^73^^^^^60^78^final int varArgsCount = varArgs.length;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy ( newArgs, 0, args, 0, nonVarArgsCount ) ;^75^^^^^60^78^System.arraycopy ( args, 0, newArgs, 0, nonVarArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy (  0, newArgs, 0, nonVarArgsCount ) ;^75^^^^^60^78^System.arraycopy ( args, 0, newArgs, 0, nonVarArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy ( args, 0,  0, nonVarArgsCount ) ;^75^^^^^60^78^System.arraycopy ( args, 0, newArgs, 0, nonVarArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy ( nonVarArgsCount, 0, newArgs, 0, args ) ;^75^^^^^60^78^System.arraycopy ( args, 0, newArgs, 0, nonVarArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy ( args, 0, newArgs, 0 ) ;^75^^^^^60^78^System.arraycopy ( args, 0, newArgs, 0, nonVarArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy ( newArgs, 0, varArgs, nonVarArgsCount, varArgsCount ) ;^76^^^^^60^78^System.arraycopy ( varArgs, 0, newArgs, nonVarArgsCount, varArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy (  0, newArgs, nonVarArgsCount, varArgsCount ) ;^76^^^^^60^78^System.arraycopy ( varArgs, 0, newArgs, nonVarArgsCount, varArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy ( varArgs, 0,  nonVarArgsCount, varArgsCount ) ;^76^^^^^60^78^System.arraycopy ( varArgs, 0, newArgs, nonVarArgsCount, varArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy ( varArgs, 0, nonVarArgsCount, newArgs, varArgsCount ) ;^76^^^^^60^78^System.arraycopy ( varArgs, 0, newArgs, nonVarArgsCount, varArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy ( varArgs, 0, newArgs,  varArgsCount ) ;^76^^^^^60^78^System.arraycopy ( varArgs, 0, newArgs, nonVarArgsCount, varArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy ( varArgs, 0, newArgs, varArgsCount, nonVarArgsCount ) ;^76^^^^^60^78^System.arraycopy ( varArgs, 0, newArgs, nonVarArgsCount, varArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^System.arraycopy ( varArgs, 0, newArgs, nonVarArgsCount ) ;^76^^^^^60^78^System.arraycopy ( varArgs, 0, newArgs, nonVarArgsCount, varArgsCount ) ;^[CLASS] Invocation  [METHOD] expandVarArgs [RETURN_TYPE] Object[]   final boolean isVarArgs Object[] args [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return this.mock.equals ( this.method.mock )  && other.equals ( other.method )  && this.equalArguments ( other.arguments ) ;^120^^^^^113^121^return this.mock.equals ( other.mock )  && this.method.equals ( other.method )  && this.equalArguments ( other.arguments ) ;^[CLASS] Invocation  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Invocation  other  Object  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return other.mock.equals ( this.mock )  && this.method.equals ( other.method )  && this.equalArguments ( other.arguments ) ;^120^^^^^113^121^return this.mock.equals ( other.mock )  && this.method.equals ( other.method )  && this.equalArguments ( other.arguments ) ;^[CLASS] Invocation  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Invocation  other  Object  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return this.mock.equals ( other.mock )  && other.method.equals ( this.method )  && this.equalArguments ( other.arguments ) ;^120^^^^^113^121^return this.mock.equals ( other.mock )  && this.method.equals ( other.method )  && this.equalArguments ( other.arguments ) ;^[CLASS] Invocation  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Invocation  other  Object  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return this.mock.equals ( other.mock )  && this.method.equals ( other.arguments )  && this.equalArguments ( other.method ) ;^120^^^^^113^121^return this.mock.equals ( other.mock )  && this.method.equals ( other.method )  && this.equalArguments ( other.arguments ) ;^[CLASS] Invocation  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Invocation  other  Object  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return other.equals ( this.mock.mock )  && this.method.equals ( other.method )  && this.equalArguments ( other.arguments ) ;^120^^^^^113^121^return this.mock.equals ( other.mock )  && this.method.equals ( other.method )  && this.equalArguments ( other.arguments ) ;^[CLASS] Invocation  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Invocation  other  Object  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return this.mock.equals ( other.method.mock )  && this.method.equals ( other )  && this.equalArguments ( other.arguments ) ;^120^^^^^113^121^return this.mock.equals ( other.mock )  && this.method.equals ( other.method )  && this.equalArguments ( other.arguments ) ;^[CLASS] Invocation  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Invocation  other  Object  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return this.mock.equals ( other.arguments.mock )  && this.method.equals ( other.method )  && this.equalArguments ( other ) ;^120^^^^^113^121^return this.mock.equals ( other.mock )  && this.method.equals ( other.method )  && this.equalArguments ( other.arguments ) ;^[CLASS] Invocation  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Invocation  other  Object  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return Arrays.equals ( this.arguments, arguments ) ;^124^^^^^123^125^return Arrays.equals ( arguments, this.arguments ) ;^[CLASS] Invocation  [METHOD] equalArguments [RETURN_TYPE] boolean   Object[] arguments [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return Arrays.equals (  this.arguments ) ;^124^^^^^123^125^return Arrays.equals ( arguments, this.arguments ) ;^[CLASS] Invocation  [METHOD] equalArguments [RETURN_TYPE] boolean   Object[] arguments [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return Arrays.equals ( arguments ) ;^124^^^^^123^125^return Arrays.equals ( arguments, this.arguments ) ;^[CLASS] Invocation  [METHOD] equalArguments [RETURN_TYPE] boolean   Object[] arguments [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^String invocation = printSettings + matchersPrinter.getArgumentsLine ( matchers, method ) ;^138^^^^^135^144^String invocation = method + matchersPrinter.getArgumentsLine ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^String invocation = matchersPrinter + method.getArgumentsLine ( matchers, printSettings ) ;^138^^^^^135^144^String invocation = method + matchersPrinter.getArgumentsLine ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^String invocation = matchers + methodPrinter.getArgumentsLine ( matchers, printSettings ) ;^138^^^^^135^144^String invocation = method + matchersPrinter.getArgumentsLine ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^String invocation = method + matchersPrinter.getArgumentsLine (  printSettings ) ;^138^^^^^135^144^String invocation = method + matchersPrinter.getArgumentsLine ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^String invocation = method + matchersPrinter.getArgumentsLine ( matchers ) ;^138^^^^^135^144^String invocation = method + matchersPrinter.getArgumentsLine ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^String invocation = method + printSettings.getArgumentsLine ( matchers, matchersPrinter ) ;^138^^^^^135^144^String invocation = method + matchersPrinter.getArgumentsLine ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^String invocation = method + matchersPrinterPrinter.getArgumentsLine ( matchers, printSettings ) ;^138^^^^^135^144^String invocation = method + matchersPrinter.getArgumentsLine ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^String invocation = method + printSettingsPrinter.getArgumentsLine ( matchers, matchers ) ;^138^^^^^135^144^String invocation = method + matchersPrinter.getArgumentsLine ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^if  ( MAX_LINE_LENGTH.isMultiline (  )  ||  ( !matchers.isEmpty (  )  && invocation.length (  )  > printSettings )  )  {^139^^^^^135^144^if  ( printSettings.isMultiline (  )  ||  ( !matchers.isEmpty (  )  && invocation.length (  )  > MAX_LINE_LENGTH )  )  {^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return matchers + methodPrinter.getArgumentsBlock ( matchers, printSettings ) ;^140^^^^^135^144^return method + matchersPrinter.getArgumentsBlock ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return method + printSettings.getArgumentsBlock ( matchers, matchersPrinter ) ;^140^^^^^135^144^return method + matchersPrinter.getArgumentsBlock ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return method + matchersPrinterPrinter.getArgumentsBlock ( matchers, printSettings ) ;^140^^^^^135^144^return method + matchersPrinter.getArgumentsBlock ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return method + matchersPrinter.getArgumentsBlock (  printSettings ) ;^140^^^^^135^144^return method + matchersPrinter.getArgumentsBlock ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return method + matchersPrinter.getArgumentsBlock ( matchers ) ;^140^^^^^135^144^return method + matchersPrinter.getArgumentsBlock ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return method + matchers.getArgumentsBlock ( matchersPrinter, printSettings ) ;^140^^^^^135^144^return method + matchersPrinter.getArgumentsBlock ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return method + printSettingsPrinter.getArgumentsBlock ( matchers, matchers ) ;^140^^^^^135^144^return method + matchersPrinter.getArgumentsBlock ( matchers, printSettings ) ;^[CLASS] Invocation  [METHOD] toString [RETURN_TYPE] String   Matcher> matchers PrintSettings printSettings [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  PrintSettings  printSettings  Object  mock  o  List  matchers  MatchersPrinter  matchersPrinter  Method  method  String  invocation  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return new MockUtil (  ) .getMockName ( method )  + "." + mock.getName (  ) ;^147^^^^^146^148^return new MockUtil (  ) .getMockName ( mock )  + "." + method.getName (  ) ;^[CLASS] Invocation  [METHOD] qualifiedMethodName [RETURN_TYPE] String   [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^List<Matcher> matchers = new ArrayList<Matcher> ( arguments ) ;^151^^^^^150^160^List<Matcher> matchers = new ArrayList<Matcher> ( arguments.length ) ;^[CLASS] Invocation  [METHOD] argumentsToMatchers [RETURN_TYPE] List   [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  arg  mock  o  List  matchers  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^List<Matcher> matchers = new ArrayList<Matcher> ( arguments.length.length ) ;^151^^^^^150^160^List<Matcher> matchers = new ArrayList<Matcher> ( arguments.length ) ;^[CLASS] Invocation  [METHOD] argumentsToMatchers [RETURN_TYPE] List   [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  arg  mock  o  List  matchers  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^if  ( throwableClass.isAssignableFrom ( exception )  )  {^175^^^^^171^181^if  ( exception.isAssignableFrom ( throwableClass )  )  {^[CLASS] Invocation  [METHOD] isValidException [RETURN_TYPE] boolean   Throwable throwable [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Class[]  exceptions  Throwable  throwable  Object  arg  mock  o  Class  exception  throwableClass  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return clazz.getReturnType (  ) .isAssignableFrom ( method ) ;^187^^^^^183^189^return method.getReturnType (  ) .isAssignableFrom ( clazz ) ;^[CLASS] Invocation  [METHOD] isValidReturnType [RETURN_TYPE] boolean   Class clazz [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  arg  mock  o  Class  clazz  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return Primitives.primitiveTypeOf ( method )  == clazz.getReturnType (  ) ;^185^^^^^183^189^return Primitives.primitiveTypeOf ( clazz )  == method.getReturnType (  ) ;^[CLASS] Invocation  [METHOD] isValidReturnType [RETURN_TYPE] boolean   Class clazz [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  arg  mock  o  Class  clazz  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return arguments;^212^^^^^211^213^return arguments.length;^[CLASS] Invocation  [METHOD] getArgumentsCount [RETURN_TYPE] int   [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  arg  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return arguments.length.length;^212^^^^^211^213^return arguments.length;^[CLASS] Invocation  [METHOD] getArgumentsCount [RETURN_TYPE] int   [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  arg  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return arguments.invoke ( mock, realMethod ) ;^220^^^^^219^221^return realMethod.invoke ( mock, arguments ) ;^[CLASS] Invocation  [METHOD] callRealMethod [RETURN_TYPE] Object   [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  arg  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return realMethod.invoke ( arguments, mock ) ;^220^^^^^219^221^return realMethod.invoke ( mock, arguments ) ;^[CLASS] Invocation  [METHOD] callRealMethod [RETURN_TYPE] Object   [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  arg  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return realMethod.invoke (  arguments ) ;^220^^^^^219^221^return realMethod.invoke ( mock, arguments ) ;^[CLASS] Invocation  [METHOD] callRealMethod [RETURN_TYPE] Object   [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  arg  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return realMethod.invoke ( mock ) ;^220^^^^^219^221^return realMethod.invoke ( mock, arguments ) ;^[CLASS] Invocation  [METHOD] callRealMethod [RETURN_TYPE] Object   [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  arg  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  
[buglab_swap_variables]^return mock.invoke ( realMethod, arguments ) ;^220^^^^^219^221^return realMethod.invoke ( mock, arguments ) ;^[CLASS] Invocation  [METHOD] callRealMethod [RETURN_TYPE] Object   [VARIABLES] boolean  isVarArgs  verified  verifiedInOrder  Object  arg  mock  o  Method  method  RealMethod  realMethod  int  MAX_LINE_LENGTH  nonVarArgsCount  sequenceNumber  varArgsCount  Object[]  args  arguments  newArgs  rawArguments  varArgs  Location  location  