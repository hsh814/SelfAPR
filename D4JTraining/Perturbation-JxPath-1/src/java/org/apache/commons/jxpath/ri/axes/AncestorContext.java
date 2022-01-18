[REPLACE]^private boolean setStarted ;^31^^^^^^^[REPLACE] private boolean setStarted = false;^ [CLASS] AncestorContext  
[REPLACE]^super.reset (  ) ;^46^^^^^41^49^[REPLACE] super ( parentContext ) ;^[METHOD] <init> [TYPE] NodeTest) [PARAMETER] EvalContext parentContext boolean includeSelf NodeTest nodeTest [CLASS] AncestorContext   [TYPE]  EvalContext parentContext  [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REMOVE]^super.reset (  ) ;^46^^^^^41^49^[REMOVE] ^[METHOD] <init> [TYPE] NodeTest) [PARAMETER] EvalContext parentContext boolean includeSelf NodeTest nodeTest [CLASS] AncestorContext   [TYPE]  EvalContext parentContext  [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^this.includeSelf =  true;^47^^^^^41^49^[REPLACE] this.includeSelf = includeSelf;^[METHOD] <init> [TYPE] NodeTest) [PARAMETER] EvalContext parentContext boolean includeSelf NodeTest nodeTest [CLASS] AncestorContext   [TYPE]  EvalContext parentContext  [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[ADD]^^47^^^^^41^49^[ADD] this.includeSelf = includeSelf;^[METHOD] <init> [TYPE] NodeTest) [PARAMETER] EvalContext parentContext boolean includeSelf NodeTest nodeTest [CLASS] AncestorContext   [TYPE]  EvalContext parentContext  [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^this.nodeTest =  null;^48^^^^^41^49^[REPLACE] this.nodeTest = nodeTest;^[METHOD] <init> [TYPE] NodeTest) [PARAMETER] EvalContext parentContext boolean includeSelf NodeTest nodeTest [CLASS] AncestorContext   [TYPE]  EvalContext parentContext  [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^return false;^52^^^^^51^53^[REPLACE] return currentNodePointer;^[METHOD] getCurrentNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^return -2;^56^^^^^55^57^[REPLACE] return -1;^[METHOD] getDocumentOrder [TYPE] int [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^super .getCurrentPosition (  )  ;^60^^^^^59^62^[REPLACE] super.reset (  ) ;^[METHOD] reset [TYPE] void [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^setStarted = true; ;^61^^^^^59^62^[REPLACE] setStarted = false;^[METHOD] reset [TYPE] void [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^if  ( position  <=  getCurrentPosition (  )  )  {^65^^^^^64^75^[REPLACE] if  ( position < getCurrentPosition (  )  )  {^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest  [TYPE]  int position 
[ADD]^reset (  ) ;^65^66^67^^^64^75^[ADD] if  ( position < getCurrentPosition (  )  )  { reset (  ) ; }^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest  [TYPE]  int position 
[REPLACE]^super.reset (  ) ;^66^^^^^64^75^[REPLACE] reset (  ) ;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest  [TYPE]  int position 
[ADD]^^66^^^^^64^75^[ADD] reset (  ) ;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest  [TYPE]  int position 
[REPLACE]^while  ( getCurrentPosition (  )   <=  position )  {^69^^^^^64^75^[REPLACE] while  ( getCurrentPosition (  )  < position )  {^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest  [TYPE]  int position 
[REPLACE]^if  ( nextNode (  )  )  {^70^^^^^64^75^[REPLACE] if  ( !nextNode (  )  )  {^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest  [TYPE]  int position 
[REPLACE]^return true;^71^^^^^64^75^[REPLACE] return false;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest  [TYPE]  int position 
[REPLACE]^return false;^74^^^^^64^75^[REPLACE] return true;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest  [TYPE]  int position 
[REPLACE]^if  ( setStarted )  {^78^^^^^77^101^[REPLACE] if  ( !setStarted )  {^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^if  ( !setStarted )  {^81^^^^^77^101^[REPLACE] if  ( includeSelf )  {^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^if  ( current  nodeTest    )  {^82^^^^^77^101^[REPLACE] if  ( currentNodePointer.testNode ( nodeTest )  )  {^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^return false;^84^^^^^77^101^[REPLACE] return true;^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^setStarted = false;^79^^^^^77^101^[REPLACE] setStarted = true;^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^currentNodePointer  =  currentNodePointer ;^80^^^^^77^101^[REPLACE] currentNodePointer = parentContext.getCurrentNodePointer (  ) ;^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[ADD]^^80^^^^^77^101^[ADD] currentNodePointer = parentContext.getCurrentNodePointer (  ) ;^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^if  ( currentNodePointer .getImmediateParentPointer (  )   )  {^82^^^^^77^101^[REPLACE] if  ( currentNodePointer.testNode ( nodeTest )  )  {^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[ADD]^^79^80^^^^77^101^[ADD] setStarted = true; currentNodePointer = parentContext.getCurrentNodePointer (  ) ;^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^while  ( false )  {^89^^^^^77^101^[REPLACE] while  ( true )  {^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^if  ( currentNodePointer != true )  {^92^^^^^77^101^[REPLACE] if  ( currentNodePointer == null )  {^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[ADD]^return false;^92^93^94^^^77^101^[ADD] if  ( currentNodePointer == null )  { return false; }^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^return true;^93^^^^^77^101^[REPLACE] return false;^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^if  ( currentNodePointer .getImmediateParentPointer (  )   )  {^96^^^^^77^101^[REPLACE] if  ( currentNodePointer.testNode ( nodeTest )  )  {^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^return false;^98^^^^^77^101^[REPLACE] return true;^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^currentNodePointer  =  currentNodePointer ;^90^^^^^77^101^[REPLACE] currentNodePointer = currentNodePointer.getImmediateParentPointer (  ) ;^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[ADD]^^90^^^^^77^101^[ADD] currentNodePointer = currentNodePointer.getImmediateParentPointer (  ) ;^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^if  ( currentNodePointer != this )  {^92^^^^^77^101^[REPLACE] if  ( currentNodePointer == null )  {^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 
[REPLACE]^currentNodePointer ;^90^^^^^77^101^[REPLACE] currentNodePointer = currentNodePointer.getImmediateParentPointer (  ) ;^[METHOD] nextNode [TYPE] boolean [PARAMETER] [CLASS] AncestorContext   [TYPE]  boolean false  includeSelf  setStarted  true  [TYPE]  NodePointer currentNodePointer  [TYPE]  NodeTest nodeTest 