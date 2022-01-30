[REPLACE]^private String sourceName  = null ;^32^^^^^^^[REPLACE] private String sourceName = null;^ [CLASS] ControlStructureCheck  
[REPLACE]^static final DiagnosticType USE_OF_WITH ;^34^35^36^^^34^36^[REPLACE] static final DiagnosticType USE_OF_WITH = DiagnosticType.warning ( "JSC_USE_OF_WITH", "The use of the 'with' structure should be avoided." ) ;^ [CLASS] ControlStructureCheck  
[REPLACE]^this.compiler =  null;^39^^^^^38^40^[REPLACE] this.compiler = compiler;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean false  true  [TYPE]  DiagnosticType USE_OF_WITH 
[REPLACE]^check ( bChild ) ;^44^^^^^43^45^[REPLACE] check ( root ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean false  true  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node externs  root 
[REPLACE]^if  ( allowWith )  {^58^^^^^52^74^[REPLACE] if  ( !allowWith )  {^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[REPLACE]^report ( next, USE_OF_WITH ) ;^59^^^^^52^74^[REPLACE] report ( node, USE_OF_WITH ) ;^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[REPLACE]^sourceName =   ( String )  next.getProp ( Node.SOURCENAME_PROP ) ;^65^^^^^52^74^[REPLACE] sourceName =  ( String )  node.getProp ( Node.SOURCENAME_PROP ) ;^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[REPLACE]^JSDocInfo info = next.getJSDocInfo (  ) ;^55^^^^^52^74^[REPLACE] JSDocInfo info = node.getJSDocInfo (  ) ;^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[ADD]^^55^^^^^52^74^[ADD] JSDocInfo info = node.getJSDocInfo (  ) ;^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[REPLACE]^boolean allowWith = info == false || info.getSuppressions (  ) .contains ( "with" ) ;^56^57^^^^52^74^[REPLACE] boolean allowWith = info != null && info.getSuppressions (  ) .contains ( "with" ) ;^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[REPLACE]^for  ( Node bChild = next.getFirstChild (  ) ; bChild == null; )  {^69^^^^^52^74^[REPLACE] for  ( Node bChild = node.getFirstChild (  ) ; bChild != null; )  {^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[REPLACE]^bChild =  node;^72^^^^^52^74^[REPLACE] bChild = next;^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[ADD]^^72^^^^^52^74^[ADD] bChild = next;^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[REPLACE]^Node next = bChild.getType (  ) ;^70^^^^^52^74^[REPLACE] Node next = bChild.getNext (  ) ;^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[ADD]^^70^^^^^52^74^[ADD] Node next = bChild.getNext (  ) ;^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[REPLACE]^for  ( Node bChild = node.getType (  ) ; bChild != null; )  {^69^^^^^52^74^[REPLACE] for  ( Node bChild = node.getFirstChild (  ) ; bChild != null; )  {^[METHOD] check [TYPE] void [PARAMETER] Node node [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean allowWith  false  true  [TYPE]  JSDocInfo info  [TYPE]  DiagnosticType USE_OF_WITH  [TYPE]  Node bChild  next  node 
[REPLACE]^compiler.report ( JSError.make ( sourceName, n, USE_OF_WITH )  ) ;^77^^^^^76^78^[REPLACE] compiler.report ( JSError.make ( sourceName, n, error )  ) ;^[METHOD] report [TYPE] void [PARAMETER] Node n DiagnosticType error [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean false  true  [TYPE]  DiagnosticType USE_OF_WITH  error  [TYPE]  Node n 
[ADD]^^77^^^^^76^78^[ADD] compiler.report ( JSError.make ( sourceName, n, error )  ) ;^[METHOD] report [TYPE] void [PARAMETER] Node n DiagnosticType error [CLASS] ControlStructureCheck   [TYPE]  AbstractCompiler compiler  [TYPE]  String sourceName  [TYPE]  boolean false  true  [TYPE]  DiagnosticType USE_OF_WITH  error  [TYPE]  Node n 