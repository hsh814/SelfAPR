[REPLACE]^private  AbstractCompiler compiler;^50^^^^^^^[REPLACE] private final AbstractCompiler compiler;^ [CLASS] CombinedCompilerPass CallbackWrapper  
[REPLACE]^private  Callback callback;^78^^^^^^^[REPLACE] private final Callback callback;^ [CLASS] CombinedCompilerPass CallbackWrapper  
[REPLACE]^private  ScopedCallback scopedCallback;^83^^^^^^^[REPLACE] private final ScopedCallback scopedCallback;^ [CLASS] CombinedCompilerPass CallbackWrapper  
[REPLACE]^private Node waiting = true;^90^^^^^^^[REPLACE] private Node waiting = null;^ [CLASS] CombinedCompilerPass CallbackWrapper  
[REPLACE]^this.compiler =  null;^58^^^^^56^63^[REPLACE] this.compiler = compiler;^[METHOD] <init> [TYPE] Callback[]) [PARAMETER] AbstractCompiler compiler  callbacks [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  Callback[] callbacks  [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting  [TYPE]  int i 
[ADD]^^58^^^^^56^63^[ADD] this.compiler = compiler;^[METHOD] <init> [TYPE] Callback[]) [PARAMETER] AbstractCompiler compiler  callbacks [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  Callback[] callbacks  [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting  [TYPE]  int i 
[REPLACE]^this.callbacks[i] = new CallbackWrapper ( callbacks[i] ) ; ;^59^^^^^56^63^[REPLACE] this.callbacks = new CallbackWrapper[callbacks.length];^[METHOD] <init> [TYPE] Callback[]) [PARAMETER] AbstractCompiler compiler  callbacks [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  Callback[] callbacks  [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting  [TYPE]  int i 
[ADD]^^59^^^^^56^63^[ADD] this.callbacks = new CallbackWrapper[callbacks.length];^[METHOD] <init> [TYPE] Callback[]) [PARAMETER] AbstractCompiler compiler  callbacks [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  Callback[] callbacks  [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting  [TYPE]  int i 
[REPLACE]^for  ( int i = 0; i < callbacks.length (  ) ; i++ )  {^60^^^^^56^63^[REPLACE] for  ( int i = 0; i < callbacks.length; i++ )  {^[METHOD] <init> [TYPE] Callback[]) [PARAMETER] AbstractCompiler compiler  callbacks [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  Callback[] callbacks  [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting  [TYPE]  int i 
[REPLACE]^this.callbacks = new CallbackWrapper[callbacks.length]; ;^61^^^^^56^63^[REPLACE] this.callbacks[i] = new CallbackWrapper ( callbacks[i] ) ;^[METHOD] <init> [TYPE] Callback[]) [PARAMETER] AbstractCompiler compiler  callbacks [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  Callback[] callbacks  [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting  [TYPE]  int i 
[REPLACE]^for  ( int i = 0 ; i < callbacks.length; i++ )  {^60^^^^^56^63^[REPLACE] for  ( int i = 0; i < callbacks.length; i++ )  {^[METHOD] <init> [TYPE] Callback[]) [PARAMETER] AbstractCompiler compiler  callbacks [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  Callback[] callbacks  [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting  [TYPE]  int i 
[ADD]^^60^61^62^^^56^63^[ADD] for  ( int i = 0; i < callbacks.length; i++ )  { this.callbacks[i] = new CallbackWrapper ( callbacks[i] ) ; }^[METHOD] <init> [TYPE] Callback[]) [PARAMETER] AbstractCompiler compiler  callbacks [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  Callback[] callbacks  [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting  [TYPE]  int i 
[REPLACE]^this.callback =  null;^93^^^^^92^99^[REPLACE] this.callback = callback;^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting 
[REPLACE]^if  ( ! callback instanceof ScopedCallback )  {^94^^^^^92^99^[REPLACE] if  ( callback instanceof ScopedCallback )  {^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting 
[REPLACE]^scopedCallback = false;^97^^^^^92^99^[REPLACE] scopedCallback = null;^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting 
[REPLACE]^scopedCallback =   ( ScopedCallback )  callback;^95^^^^^92^99^[REPLACE] scopedCallback =  ( ScopedCallback )  callback;^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting 
[ADD]^^95^^^^^92^99^[ADD] scopedCallback =  ( ScopedCallback )  callback;^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting 
[REPLACE]^scopedCallback = true;^97^^^^^92^99^[REPLACE] scopedCallback = null;^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node waiting 
[REPLACE]^if  ( callback instanceof ScopedCallback )  {^106^^^^^105^111^[REPLACE] if  ( isActive (  )  )  {^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^} else if  ( waiting  ||  waiting )  {^108^^^^^105^111^[REPLACE] } else if  ( waiting == n )  {^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[ADD]^}   waiting = null;^108^109^110^^^105^111^[ADD] else if  ( waiting == n )  { waiting = null; }^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^waiting = this;^109^^^^^105^111^[REPLACE] waiting = null;^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^waiting = n; ;^109^^^^^105^111^[REPLACE] waiting = null;^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^callback.visit ( t, n, waiting ) ;^107^^^^^105^111^[REPLACE] callback.visit ( t, n, parent ) ;^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[ADD]^^107^^^^^105^111^[ADD] callback.visit ( t, n, parent ) ;^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^}  if  (parent  &&  waiting )  {^108^^^^^105^111^[REPLACE] } else if  ( waiting == n )  {^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^waiting = true;^109^^^^^105^111^[REPLACE] waiting = null;^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^waiting = false;^109^^^^^105^111^[REPLACE] waiting = null;^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^if  (true (  )  ) {^114^^^^^113^117^[REPLACE] if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[METHOD] shouldTraverseIfActive [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^waiting = null; ;^115^^^^^113^117^[REPLACE] waiting = n;^[METHOD] shouldTraverseIfActive [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^if  ( isActive (  )  && scopedCallback == null )  {^120^^^^^119^123^[REPLACE] if  ( isActive (  )  && scopedCallback != null )  {^[METHOD] enterScopeIfActive [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[ADD]^^120^121^122^^^119^123^[ADD] if  ( isActive (  )  && scopedCallback != null )  { scopedCallback.enterScope ( t ) ; }^[METHOD] enterScopeIfActive [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^scopedCallback.exitScope ( t ) ;^121^^^^^119^123^[REPLACE] scopedCallback.enterScope ( t ) ;^[METHOD] enterScopeIfActive [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[ADD]^^121^^^^^119^123^[ADD] scopedCallback.enterScope ( t ) ;^[METHOD] enterScopeIfActive [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^if  ( isActive (  )  && scopedCallback == null )  {^126^^^^^125^129^[REPLACE] if  ( isActive (  )  && scopedCallback != null )  {^[METHOD] exitScopeIfActive [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^scopedCallback.enterScope ( t ) ;^127^^^^^125^129^[REPLACE] scopedCallback.exitScope ( t ) ;^[METHOD] exitScopeIfActive [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^return true ;^132^^^^^131^133^[REPLACE] return waiting == null;^[METHOD] isActive [TYPE] boolean [PARAMETER] [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node n  parent  waiting 
[REPLACE]^NodeTraversal.traverse ( compiler, waiting, this ) ;^138^^^^^137^139^[REPLACE] NodeTraversal.traverse ( compiler, root, this ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node externs  n  parent  root  waiting 
[REMOVE]^callback.shouldTraverseIfActive ( t, n, parent ) ;^138^^^^^137^139^[REMOVE] ^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  Node externs  n  parent  root  waiting 
[REPLACE]^for  ( CallbackWrapper callback : callbacks )  { callback.shouldTraverseIfActive ( t, n, parent ) ;^143^^^^^142^152^[REPLACE] for  ( CallbackWrapper callback : callbacks )  {^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node externs  n  parent  root  waiting  [TYPE]  CallbackWrapper callback 
[REPLACE]^return false;^151^^^^^142^152^[REPLACE] return true;^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node externs  n  parent  root  waiting  [TYPE]  CallbackWrapper callback 
[REPLACE]^for  ( CallbackWrapper callback : callbacks )  { callback.shouldTraverseIfActive ( t, n, parent ) ;^156^^^^^155^159^[REPLACE] for  ( CallbackWrapper callback : callbacks )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node externs  n  parent  root  waiting  [TYPE]  CallbackWrapper callback 
[ADD]^^156^157^158^^^155^159^[ADD] for  ( CallbackWrapper callback : callbacks )  { callback.visitOrMaybeActivate ( t, n, parent ) ; }^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node externs  n  parent  root  waiting  [TYPE]  CallbackWrapper callback 
[REPLACE]^for  ( CallbackWrapper callback : callbacks )  { callback.shouldTraverseIfActive ( t, n, parent ) ;^163^^^^^162^166^[REPLACE] for  ( CallbackWrapper callback : callbacks )  {^[METHOD] enterScope [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node externs  n  parent  root  waiting  [TYPE]  CallbackWrapper callback 
[REPLACE]^for  ( CallbackWrapper callback : callbacks )  { callback.shouldTraverseIfActive ( t, n, parent ) ;^170^^^^^169^173^[REPLACE] for  ( CallbackWrapper callback : callbacks )  {^[METHOD] exitScope [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CombinedCompilerPass CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node externs  n  parent  root  waiting  [TYPE]  CallbackWrapper callback 
[REPLACE]^private Node waiting = this;^90^^^^^^^[REPLACE] private Node waiting = null;^[METHOD] exitScope [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  AbstractCompiler compiler  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  CallbackWrapper[] callbacks  [TYPE]  NodeTraversal t  [TYPE]  Node externs  n  parent  root  waiting  [TYPE]  CallbackWrapper callback 
[REPLACE]^this.callback =  null;^93^^^^^92^99^[REPLACE] this.callback = callback;^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  Node waiting 
[REPLACE]^if  ( ! callback instanceof ScopedCallback )  {^94^^^^^92^99^[REPLACE] if  ( callback instanceof ScopedCallback )  {^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  Node waiting 
[ADD]^scopedCallback =  ( ScopedCallback )  callback;scopedCallback = null;^94^95^96^97^98^92^99^[ADD] if  ( callback instanceof ScopedCallback )  { scopedCallback =  ( ScopedCallback )  callback; } else { scopedCallback = null; }^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  Node waiting 
[REPLACE]^scopedCallback = true;^97^^^^^92^99^[REPLACE] scopedCallback = null;^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  Node waiting 
[REPLACE]^scopedCallback =   ( ScopedCallback )  callback;^95^^^^^92^99^[REPLACE] scopedCallback =  ( ScopedCallback )  callback;^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  Node waiting 
[ADD]^^95^^^^^92^99^[ADD] scopedCallback =  ( ScopedCallback )  callback;^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  Node waiting 
[REPLACE]^scopedCallback = false;^97^^^^^92^99^[REPLACE] scopedCallback = null;^[METHOD] <init> [TYPE] Callback) [PARAMETER] Callback callback [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  Node waiting 
[REPLACE]^if  ( callback instanceof ScopedCallback )  {^106^^^^^105^111^[REPLACE] if  ( isActive (  )  )  {^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^}  else {^108^^^^^105^111^[REPLACE] } else if  ( waiting == n )  {^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[ADD]^}^108^109^110^^^105^111^[ADD] else if  ( waiting == n )  { waiting = null; }^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^waiting = false;^109^^^^^105^111^[REPLACE] waiting = null;^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^waiting = true;^109^^^^^105^111^[REPLACE] waiting = null;^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^callback.visit ( t, waiting, parent ) ;^107^^^^^105^111^[REPLACE] callback.visit ( t, n, parent ) ;^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[ADD]^^107^^^^^105^111^[ADD] callback.visit ( t, n, parent ) ;^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^}  if  ( waiting  !=  n )  {^108^^^^^105^111^[REPLACE] } else if  ( waiting == n )  {^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^waiting = this;^109^^^^^105^111^[REPLACE] waiting = null;^[METHOD] visitOrMaybeActivate [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^if  ( isActive (  )  ) {^114^^^^^113^117^[REPLACE] if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[METHOD] shouldTraverseIfActive [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[ADD]^waiting = n;^114^115^116^^^113^117^[ADD] if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  { waiting = n; }^[METHOD] shouldTraverseIfActive [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^waiting = null; ;^115^^^^^113^117^[REPLACE] waiting = n;^[METHOD] shouldTraverseIfActive [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^if  (  scopedCallback == null )  {^120^^^^^119^123^[REPLACE] if  ( isActive (  )  && scopedCallback != null )  {^[METHOD] enterScopeIfActive [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^scopedCallback .exitScope ( t )  ;^121^^^^^119^123^[REPLACE] scopedCallback.enterScope ( t ) ;^[METHOD] enterScopeIfActive [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^if  ( isActive (  )  && scopedCallback == false )  {^126^^^^^125^129^[REPLACE] if  ( isActive (  )  && scopedCallback != null )  {^[METHOD] exitScopeIfActive [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^scopedCallback .enterScope ( t )  ;^127^^^^^125^129^[REPLACE] scopedCallback.exitScope ( t ) ;^[METHOD] exitScopeIfActive [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REMOVE]^if  ( isActive (  )  )  { callback.visit ( t, n, parent ) ;^127^^^^^125^129^[REMOVE] ^[METHOD] exitScopeIfActive [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  waiting 
[REPLACE]^return true ;^132^^^^^131^133^[REPLACE] return waiting == null;^[METHOD] isActive [TYPE] boolean [PARAMETER] [CLASS] CallbackWrapper   [TYPE]  ScopedCallback scopedCallback  [TYPE]  Callback callback  [TYPE]  boolean false  true  [TYPE]  Node n  parent  waiting 