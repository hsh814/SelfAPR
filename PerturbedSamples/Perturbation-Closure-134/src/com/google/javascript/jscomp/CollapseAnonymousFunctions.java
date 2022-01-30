[REPLACE]^Preconditions .checkState (  )  ;^44^^^^^43^46^[REPLACE] Preconditions.checkArgument ( compiler.isNormalized (  )  ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true 
[REPLACE]^Preconditions.checkArgument ( compiler.reportCodeChange (  )  ) ;^44^^^^^43^46^[REPLACE] Preconditions.checkArgument ( compiler.isNormalized (  )  ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true 
[ADD]^^44^^^^^43^46^[ADD] Preconditions.checkArgument ( compiler.isNormalized (  )  ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true 
[REPLACE]^this.compiler =  null;^45^^^^^43^46^[REPLACE] this.compiler = compiler;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true 
[REPLACE]^Node value = name.getFirstChild (  ) ;^50^^^^^49^51^[REPLACE] NodeTraversal.traverse ( compiler, root, new Callback (  )  ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  Node externs  root  [TYPE]  boolean false  true 
[REPLACE]^if  ( n.getType (  )   ==  Token.VAR )  {^56^^^^^55^89^[REPLACE] if  ( n.getType (  )  != Token.VAR )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^return false;^57^^^^^55^89^[REPLACE] return;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node grandparent = value.getParent (  ) ;^66^^^^^55^89^[REPLACE] Node grandparent = parent.getParent (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^if  ( ! ( parent.getType (  )  != Token.SCRIPT ) {^67^68^69^70^^55^89^[REPLACE] if  ( ! ( parent.getType (  )  == Token.SCRIPT || grandparent != null && grandparent.getType (  )  == Token.FUNCTION && parent.getType (  )  == Token.BLOCK )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^return false;^71^^^^^67^72^[REPLACE] return;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^return false;^71^^^^^55^89^[REPLACE] return;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^parent.hasOneChild (  )  ;^76^^^^^55^89^[REPLACE] Preconditions.checkState ( n.hasOneChild (  )  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Preconditions.checkState ( n.getFirstChild (  )  ) ;^76^^^^^55^89^[REPLACE] Preconditions.checkState ( n.hasOneChild (  )  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node parentame = n.getFirstChild (  ) ;^77^^^^^55^89^[REPLACE] Node name = n.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[ADD]^^77^78^^^^55^89^[ADD] Node name = n.getFirstChild (  ) ; Node value = name.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node value = value.getFirstChild (  ) ;^78^^^^^55^89^[REPLACE] Node value = name.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[ADD]^^78^^^^^55^89^[ADD] Node value = name.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^if  (  value.getType (  )  != Token.FUNCTION && !isRecursiveFunction ( value )  )  {^79^80^81^^^55^89^[REPLACE] if  ( value != null && value.getType (  )  == Token.FUNCTION && !isRecursiveFunction ( value )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[ADD]^^79^80^81^82^83^55^89^[ADD] if  ( value != null && value.getType (  )  == Token.FUNCTION && !isRecursiveFunction ( value )  )  { Node fnName = value.getFirstChild (  ) ; fnName.setString ( name.getString (  )  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node fnName = value.getString (  ) ;^82^^^^^79^88^[REPLACE] Node fnName = value.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[ADD]^^82^83^^^^79^88^[ADD] Node fnName = value.getFirstChild (  ) ; fnName.setString ( name.getString (  )  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node fnName = value.getString (  ) ;^82^^^^^55^89^[REPLACE] Node fnName = value.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[ADD]^fnName.setString ( name.getString (  )  ) ;^82^83^^^^55^89^[ADD] Node fnName = value.getFirstChild (  ) ; fnName.setString ( name.getString (  )  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node name = name.getString (  ) ;^92^^^^^91^99^[REPLACE] Node name = function.getFirstChild (  ) ;^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  Node args  body  function  name  [TYPE]  boolean false  true 
[REPLACE]^if  ( name.getString (  ) .equals (  )  )  {^93^^^^^91^99^[REPLACE] if  ( name.getString (  ) .isEmpty (  )  )  {^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  Node args  body  function  name  [TYPE]  boolean false  true 
[ADD]^return false;^93^94^95^^^91^99^[ADD] if  ( name.getString (  ) .isEmpty (  )  )  { return false; }^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  Node args  body  function  name  [TYPE]  boolean false  true 
[REPLACE]^return true;^94^^^^^91^99^[REPLACE] return false;^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  Node args  body  function  name  [TYPE]  boolean false  true 
[REPLACE]^Node args = function.getNext (  ) ;^96^^^^^91^99^[REPLACE] Node args = name.getNext (  ) ;^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  Node args  body  function  name  [TYPE]  boolean false  true 
[REPLACE]^Node body = args.getParent (  ) ;^97^^^^^91^99^[REPLACE] Node body = args.getNext (  ) ;^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  Node args  body  function  name  [TYPE]  boolean false  true 
[REPLACE]^return containsName ( body, name.setString (  )  ) ;^98^^^^^91^99^[REPLACE] return containsName ( body, name.getString (  )  ) ;^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  Node args  body  function  name  [TYPE]  boolean false  true 
[REPLACE]^if  (  n.getString (  ) .equals ( name )  )  {^102^^^^^101^112^[REPLACE] if  ( n.getType (  )  == Token.NAME && n.getString (  ) .equals ( name )  )  {^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  Node child  n 
[REPLACE]^return false;^103^^^^^101^112^[REPLACE] return true;^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  Node child  n 
[REPLACE]^if  ( name.getString (  ) .isEmpty (  )  )  {^107^^^^^101^112^[REPLACE] if  ( containsName ( child, name )  )  {^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  Node child  n 
[REPLACE]^return false;^108^^^^^101^112^[REPLACE] return true;^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  Node child  n 
[REPLACE]^for  ( Node child : n.children (  )  )  { if  ( containsName ( child, name )  )  {^106^^^^^101^112^[REPLACE] for  ( Node child : n.children (  )  )  {^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  Node child  n 
[REPLACE]^return true;^111^^^^^101^112^[REPLACE] return false;^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] CollapseAnonymousFunctions Callback   [TYPE]  AbstractCompiler compiler  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  Node child  n 
[REPLACE]^if  ( n.getType (  )   ==  Token.VAR )  {^56^^^^^55^89^[REPLACE] if  ( n.getType (  )  != Token.VAR )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^return false;^57^^^^^55^89^[REPLACE] return;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node grandparent = parent .getString (  )  ;^66^^^^^55^89^[REPLACE] Node grandparent = parent.getParent (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^if  ( ! ( value.getType (  )  != Token.SCRIPT || grandparent != null && grandparent.getType (  )  == Token.FUNCTION && parent.getType (  )  == Token.BLOCK )  )  {^67^68^69^70^^55^89^[REPLACE] if  ( ! ( parent.getType (  )  == Token.SCRIPT || grandparent != null && grandparent.getType (  )  == Token.FUNCTION && parent.getType (  )  == Token.BLOCK )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^return false;^71^^^^^67^72^[REPLACE] return;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^return false;^71^^^^^55^89^[REPLACE] return;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Preconditions.checkState ( parent.hasOneChild (  )  ) ;^76^^^^^55^89^[REPLACE] Preconditions.checkState ( n.hasOneChild (  )  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[ADD]^^76^^^^^55^89^[ADD] Preconditions.checkState ( n.hasOneChild (  )  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node parentame = n .getString (  )  ;^77^^^^^55^89^[REPLACE] Node name = n.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[ADD]^^77^78^^^^55^89^[ADD] Node name = n.getFirstChild (  ) ; Node value = name.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node value = parent.getFirstChild (  ) ;^78^^^^^55^89^[REPLACE] Node value = name.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^if  (  value.getType (  )  != Token.FUNCTION && !isRecursiveFunction ( value )  )  {^79^80^81^^^55^89^[REPLACE] if  ( value != null && value.getType (  )  == Token.FUNCTION && !isRecursiveFunction ( value )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[ADD]^^79^80^81^82^83^55^89^[ADD] if  ( value != null && value.getType (  )  == Token.FUNCTION && !isRecursiveFunction ( value )  )  { Node fnName = value.getFirstChild (  ) ; fnName.setString ( name.getString (  )  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node fnName = parent.getString (  ) ;^82^^^^^79^88^[REPLACE] Node fnName = value.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node fnName = value .getString (  )  ;^82^^^^^55^89^[REPLACE] Node fnName = value.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node fnName  grandparent  n  name  parent  value 
[REPLACE]^Node name = name.getFirstChild (  ) ;^92^^^^^91^99^[REPLACE] Node name = function.getFirstChild (  ) ;^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node args  body  function  name 
[REPLACE]^if  ( function.getString (  ) .equals (  )  )  {^93^^^^^91^99^[REPLACE] if  ( name.getString (  ) .isEmpty (  )  )  {^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node args  body  function  name 
[REPLACE]^return true;^94^^^^^91^99^[REPLACE] return false;^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node args  body  function  name 
[REPLACE]^Node args = function .getParent (  )  ;^96^^^^^91^99^[REPLACE] Node args = name.getNext (  ) ;^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node args  body  function  name 
[REPLACE]^Node body = args.getParent (  ) ;^97^^^^^91^99^[REPLACE] Node body = args.getNext (  ) ;^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node args  body  function  name 
[REPLACE]^return containsName ( body, function .setString (  )   ) ;^98^^^^^91^99^[REPLACE] return containsName ( body, name.getString (  )  ) ;^[METHOD] isRecursiveFunction [TYPE] boolean [PARAMETER] Node function [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node args  body  function  name 
[REPLACE]^if  ( n.getType (  )  == Token.NAME || n.setString (  ) .equals ( name )  )  {^102^^^^^101^112^[REPLACE] if  ( n.getType (  )  == Token.NAME && n.getString (  ) .equals ( name )  )  {^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node child  n  [TYPE]  String name 
[REPLACE]^return false;^103^^^^^101^112^[REPLACE] return true;^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node child  n  [TYPE]  String name 
[REPLACE]^if  ( name.getString (  ) .isEmpty (  )  )  {^107^^^^^101^112^[REPLACE] if  ( containsName ( child, name )  )  {^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node child  n  [TYPE]  String name 
[REPLACE]^return false;^108^^^^^101^112^[REPLACE] return true;^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node child  n  [TYPE]  String name 
[REPLACE]^for  ( Node child : n.children (  )  )  { if  ( containsName ( child, name )  )  {^106^^^^^101^112^[REPLACE] for  ( Node child : n.children (  )  )  {^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node child  n  [TYPE]  String name 
[ADD]^^106^107^108^109^^101^112^[ADD] for  ( Node child : n.children (  )  )  { if  ( containsName ( child, name )  )  { return true; }^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node child  n  [TYPE]  String name 
[REPLACE]^return true;^111^^^^^101^112^[REPLACE] return false;^[METHOD] containsName [TYPE] boolean [PARAMETER] Node n String name [CLASS] Callback   [TYPE]  boolean false  true  [TYPE]  Node child  n  [TYPE]  String name 