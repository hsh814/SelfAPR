[buglab_swap_variables]^if  ( replacementTemplateTemplate != null )  {^56^^^^^52^76^if  ( replacementTemplate != null )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^parent.replaceChild (  replacement ) ;^64^^^^^52^76^parent.replaceChild ( node, replacement ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^parent.replaceChild ( node ) ;^64^^^^^52^76^parent.replaceChild ( node, replacement ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^Node replacementTemplate = node.get ( replacements.getString (  )  ) ;^55^^^^^52^76^Node replacementTemplate = replacements.get ( node.getString (  )  ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^parent.replaceChild ( replacement, node ) ;^64^^^^^52^76^parent.replaceChild ( node, replacement ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^if  ( replacement != null )  {^56^^^^^52^76^if  ( replacementTemplate != null )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^for  ( Node node = c.getFirstChild (  ) ; c != null; c = c.getNext (  )  )  {^69^^^^^52^76^for  ( Node c = node.getFirstChild (  ) ; c != null; c = c.getNext (  )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^c = inject ( node, c, replacements ) ;^72^^^^^52^76^c = inject ( c, node, replacements ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^c = inject (  node, replacements ) ;^72^^^^^52^76^c = inject ( c, node, replacements ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^c = inject ( c, replacements, node ) ;^72^^^^^52^76^c = inject ( c, node, replacements ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^c = inject ( c,  replacements ) ;^72^^^^^52^76^c = inject ( c, node, replacements ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^c = inject ( replacements, node, c ) ;^72^^^^^52^76^c = inject ( c, node, replacements ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^c = inject ( c, node ) ;^72^^^^^52^76^c = inject ( c, node, replacements ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] inject [RETURN_TYPE] Node   Node node Node parent Node> replacements [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Map  replacements  int  loopsEntered  Node  c  node  parent  replacement  replacementTemplate  
[buglab_swap_variables]^argMap.put ( cArg.getString (  ) , fnArg ) ;^102^^^^^87^117^argMap.put ( fnArg.getString (  ) , cArg ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] getFunctionCallParameterMap [RETURN_TYPE] LinkedHashMap   Node fnNode Node callNode String> safeNameIdSupplier [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Node  cArg  callNode  fnArg  fnNode  Supplier  safeNameIdSupplier  String  uniquePlaceholder  int  anonArg  loopsEntered  LinkedHashMap  argMap  
[buglab_swap_variables]^argMap.put ( fnArg.getString (  )  ) ;^102^^^^^87^117^argMap.put ( fnArg.getString (  ) , cArg ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] getFunctionCallParameterMap [RETURN_TYPE] LinkedHashMap   Node fnNode Node callNode String> safeNameIdSupplier [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Node  cArg  callNode  fnArg  fnNode  Supplier  safeNameIdSupplier  String  uniquePlaceholder  int  anonArg  loopsEntered  LinkedHashMap  argMap  
[buglab_swap_variables]^argMap.put (  cArg ) ;^115^^^^^100^130^argMap.put ( uniquePlaceholder, cArg ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] getFunctionCallParameterMap [RETURN_TYPE] LinkedHashMap   Node fnNode Node callNode String> safeNameIdSupplier [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Node  cArg  callNode  fnArg  fnNode  Supplier  safeNameIdSupplier  String  uniquePlaceholder  int  anonArg  loopsEntered  LinkedHashMap  argMap  
[buglab_swap_variables]^argMap.put ( uniquePlaceholder ) ;^115^^^^^100^130^argMap.put ( uniquePlaceholder, cArg ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] getFunctionCallParameterMap [RETURN_TYPE] LinkedHashMap   Node fnNode Node callNode String> safeNameIdSupplier [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Node  cArg  callNode  fnArg  fnNode  Supplier  safeNameIdSupplier  String  uniquePlaceholder  int  anonArg  loopsEntered  LinkedHashMap  argMap  
[buglab_swap_variables]^argMap.put ( cArg, uniquePlaceholder ) ;^115^^^^^100^130^argMap.put ( uniquePlaceholder, cArg ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] getFunctionCallParameterMap [RETURN_TYPE] LinkedHashMap   Node fnNode Node callNode String> safeNameIdSupplier [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  Node  cArg  callNode  fnArg  fnNode  Supplier  safeNameIdSupplier  String  uniquePlaceholder  int  anonArg  loopsEntered  LinkedHashMap  argMap  
[buglab_swap_variables]^return findModifiedParameters ( unsafeNames, null, names, fnNode ) ;^142^143^^^^139^144^return findModifiedParameters ( fnNode, null, names, unsafeNames ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node fnNode [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  fnNode  
[buglab_swap_variables]^return findModifiedParameters (  null, names, unsafeNames ) ;^142^143^^^^139^144^return findModifiedParameters ( fnNode, null, names, unsafeNames ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node fnNode [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  fnNode  
[buglab_swap_variables]^return findModifiedParameters ( names, null, fnNode, unsafeNames ) ;^142^143^^^^139^144^return findModifiedParameters ( fnNode, null, names, unsafeNames ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node fnNode [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  fnNode  
[buglab_swap_variables]^return findModifiedParameters ( fnNode, null,  unsafeNames ) ;^142^143^^^^139^144^return findModifiedParameters ( fnNode, null, names, unsafeNames ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node fnNode [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  fnNode  
[buglab_swap_variables]^return findModifiedParameters ( fnNode, null, names ) ;^142^143^^^^139^144^return findModifiedParameters ( fnNode, null, names, unsafeNames ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node fnNode [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  fnNode  
[buglab_swap_variables]^return findModifiedParameters ( fnNode, null, unsafeNames, names ) ;^142^143^^^^139^144^return findModifiedParameters ( fnNode, null, names, unsafeNames ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node fnNode [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  fnNode  
[buglab_swap_variables]^if  ( canNameValueChange ( parent, n )  )  {^167^^^^^162^178^if  ( canNameValueChange ( n, parent )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^if  ( canNameValueChange (  parent )  )  {^167^^^^^162^178^if  ( canNameValueChange ( n, parent )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^if  ( canNameValueChange ( n )  )  {^167^^^^^162^178^if  ( canNameValueChange ( n, parent )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^if  ( n.contains ( names.getString (  )  )  )  {^166^^^^^162^178^if  ( names.contains ( n.getString (  )  )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^if  ( namesames.contains ( n.getString (  )  )  )  {^166^^^^^162^178^if  ( names.contains ( n.getString (  )  )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^findModifiedParameters ( names, n, c, unsafe ) ;^174^^^^^162^178^findModifiedParameters ( c, n, names, unsafe ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^findModifiedParameters (  n, names, unsafe ) ;^174^^^^^162^178^findModifiedParameters ( c, n, names, unsafe ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^findModifiedParameters ( n, c, names, unsafe ) ;^174^^^^^162^178^findModifiedParameters ( c, n, names, unsafe ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^findModifiedParameters ( c,  names, unsafe ) ;^174^^^^^162^178^findModifiedParameters ( c, n, names, unsafe ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^findModifiedParameters ( c, n,  unsafe ) ;^174^^^^^162^178^findModifiedParameters ( c, n, names, unsafe ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^findModifiedParameters ( c, n, unsafe, names ) ;^174^^^^^162^178^findModifiedParameters ( c, n, names, unsafe ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^findModifiedParameters ( c, n, names ) ;^174^^^^^162^178^findModifiedParameters ( c, n, names, unsafe ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findModifiedParameters [RETURN_TYPE] Set   Node n Node parent String> names String> unsafe [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  Node  c  n  parent  
[buglab_swap_variables]^return  ( parent == Token.VAR || type == Token.INC || type == Token.DEC || ( NodeUtil.isAssignmentOp ( type )  && parent.getFirstChild (  )  == n )  ) ;^193^194^^^^191^195^return  ( type == Token.VAR || type == Token.INC || type == Token.DEC || ( NodeUtil.isAssignmentOp ( parent )  && parent.getFirstChild (  )  == n )  ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] canNameValueChange [RETURN_TYPE] boolean   Node n Node parent [VARIABLES] Set  locals  names  parameters  parametersReferenced  unsafe  unsafeNames  boolean  sideEffectSeen  int  anonArg  loopsEntered  type  Node  n  parent  
[buglab_swap_variables]^Set<String> namesAfterSideEffects = findParametersReferencedAfterSideEffect ( block, parameters ) ;^219^220^^^^204^234^Set<String> namesAfterSideEffects = findParametersReferencedAfterSideEffect ( parameters, block ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] maybeAddTempsForCallArguments [RETURN_TYPE] void   Node fnNode Node> argMap String> namesNeedingTemps CodingConvention convention [VARIABLES] Entry  entry  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  Node  block  cArg  fnNode  CodingConvention  convention  String  argName  name  Map  argMap  int  anonArg  loopsEntered  references  type  
[buglab_swap_variables]^Set<String> namesAfterSideEffects = findParametersReferencedAfterSideEffect (  block ) ;^219^220^^^^204^234^Set<String> namesAfterSideEffects = findParametersReferencedAfterSideEffect ( parameters, block ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] maybeAddTempsForCallArguments [RETURN_TYPE] void   Node fnNode Node> argMap String> namesNeedingTemps CodingConvention convention [VARIABLES] Entry  entry  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  Node  block  cArg  fnNode  CodingConvention  convention  String  argName  name  Map  argMap  int  anonArg  loopsEntered  references  type  
[buglab_swap_variables]^Set<String> namesAfterSideEffects = findParametersReferencedAfterSideEffect ( parameters ) ;^219^220^^^^204^234^Set<String> namesAfterSideEffects = findParametersReferencedAfterSideEffect ( parameters, block ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] maybeAddTempsForCallArguments [RETURN_TYPE] void   Node fnNode Node> argMap String> namesNeedingTemps CodingConvention convention [VARIABLES] Entry  entry  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  Node  block  cArg  fnNode  CodingConvention  convention  String  argName  name  Map  argMap  int  anonArg  loopsEntered  references  type  
[buglab_swap_variables]^if  ( argName.contains ( namesNeedingTemps )  )  {^225^^^^^210^240^if  ( namesNeedingTemps.contains ( argName )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] maybeAddTempsForCallArguments [RETURN_TYPE] void   Node fnNode Node> argMap String> namesNeedingTemps CodingConvention convention [VARIABLES] Entry  entry  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  Node  block  cArg  fnNode  CodingConvention  convention  String  argName  name  Map  argMap  int  anonArg  loopsEntered  references  type  
[buglab_swap_variables]^} else if  ( NodeUtil.canBeSideEffected ( name ) && cArgsAfterSideEffects.contains ( argName )  )  {^247^248^^^^232^262^} else if  ( NodeUtil.canBeSideEffected ( cArg ) && namesAfterSideEffects.contains ( argName )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] maybeAddTempsForCallArguments [RETURN_TYPE] void   Node fnNode Node> argMap String> namesNeedingTemps CodingConvention convention [VARIABLES] Entry  entry  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  Node  block  cArg  fnNode  CodingConvention  convention  String  argName  name  Map  argMap  int  anonArg  loopsEntered  references  type  
[buglab_swap_variables]^} else if  ( NodeUtil.canBeSideEffected ( cArg ) && argNamesAfterSideEffects.contains ( name )  )  {^247^248^^^^232^262^} else if  ( NodeUtil.canBeSideEffected ( cArg ) && namesAfterSideEffects.contains ( argName )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] maybeAddTempsForCallArguments [RETURN_TYPE] void   Node fnNode Node> argMap String> namesNeedingTemps CodingConvention convention [VARIABLES] Entry  entry  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  Node  block  cArg  fnNode  CodingConvention  convention  String  argName  name  Map  argMap  int  anonArg  loopsEntered  references  type  
[buglab_swap_variables]^safe = ! ( name.isExported ( convention )  ) ;^255^^^^^240^270^safe = ! ( convention.isExported ( name )  ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] maybeAddTempsForCallArguments [RETURN_TYPE] void   Node fnNode Node> argMap String> namesNeedingTemps CodingConvention convention [VARIABLES] Entry  entry  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  Node  block  cArg  fnNode  CodingConvention  convention  String  argName  name  Map  argMap  int  anonArg  loopsEntered  references  type  
[buglab_swap_variables]^&& argName.contains ( namesAfterSideEffects )  )  {^248^^^^^233^263^&& namesAfterSideEffects.contains ( argName )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] maybeAddTempsForCallArguments [RETURN_TYPE] void   Node fnNode Node> argMap String> namesNeedingTemps CodingConvention convention [VARIABLES] Entry  entry  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  Node  block  cArg  fnNode  CodingConvention  convention  String  argName  name  Map  argMap  int  anonArg  loopsEntered  references  type  
[buglab_swap_variables]^int references = NodeUtil.getNameReferenceCount ( argName, block ) ;^230^^^^^215^245^int references = NodeUtil.getNameReferenceCount ( block, argName ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] maybeAddTempsForCallArguments [RETURN_TYPE] void   Node fnNode Node> argMap String> namesNeedingTemps CodingConvention convention [VARIABLES] Entry  entry  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  Node  block  cArg  fnNode  CodingConvention  convention  String  argName  name  Map  argMap  int  anonArg  loopsEntered  references  type  
[buglab_swap_variables]^int references = NodeUtil.getNameReferenceCount (  argName ) ;^230^^^^^215^245^int references = NodeUtil.getNameReferenceCount ( block, argName ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] maybeAddTempsForCallArguments [RETURN_TYPE] void   Node fnNode Node> argMap String> namesNeedingTemps CodingConvention convention [VARIABLES] Entry  entry  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  Node  block  cArg  fnNode  CodingConvention  convention  String  argName  name  Map  argMap  int  anonArg  loopsEntered  references  type  
[buglab_swap_variables]^int references = NodeUtil.getNameReferenceCount ( block ) ;^230^^^^^215^245^int references = NodeUtil.getNameReferenceCount ( block, argName ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] maybeAddTempsForCallArguments [RETURN_TYPE] void   Node fnNode Node> argMap String> namesNeedingTemps CodingConvention convention [VARIABLES] Entry  entry  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  Node  block  cArg  fnNode  CodingConvention  convention  String  argName  name  Map  argMap  int  anonArg  loopsEntered  references  type  
[buglab_swap_variables]^gatherLocalNames ( locals, root ) ;^294^^^^^289^303^gatherLocalNames ( root, locals ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findParametersReferencedAfterSideEffect [RETURN_TYPE] Set   String> parameters Node root [VARIABLES] ReferencedAfterSideEffect  collector  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  root  
[buglab_swap_variables]^gatherLocalNames (  locals ) ;^294^^^^^289^303^gatherLocalNames ( root, locals ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findParametersReferencedAfterSideEffect [RETURN_TYPE] Set   String> parameters Node root [VARIABLES] ReferencedAfterSideEffect  collector  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  root  
[buglab_swap_variables]^gatherLocalNames ( root ) ;^294^^^^^289^303^gatherLocalNames ( root, locals ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findParametersReferencedAfterSideEffect [RETURN_TYPE] Set   String> parameters Node root [VARIABLES] ReferencedAfterSideEffect  collector  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  root  
[buglab_swap_variables]^ReferencedAfterSideEffect collector = new ReferencedAfterSideEffect ( locals, parameters ) ;^296^297^^^^289^303^ReferencedAfterSideEffect collector = new ReferencedAfterSideEffect ( parameters, locals ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findParametersReferencedAfterSideEffect [RETURN_TYPE] Set   String> parameters Node root [VARIABLES] ReferencedAfterSideEffect  collector  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  root  
[buglab_swap_variables]^ReferencedAfterSideEffect collector = new ReferencedAfterSideEffect (  locals ) ;^296^297^^^^289^303^ReferencedAfterSideEffect collector = new ReferencedAfterSideEffect ( parameters, locals ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findParametersReferencedAfterSideEffect [RETURN_TYPE] Set   String> parameters Node root [VARIABLES] ReferencedAfterSideEffect  collector  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  root  
[buglab_swap_variables]^ReferencedAfterSideEffect collector = new ReferencedAfterSideEffect ( parameters ) ;^296^297^^^^289^303^ReferencedAfterSideEffect collector = new ReferencedAfterSideEffect ( parameters, locals ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findParametersReferencedAfterSideEffect [RETURN_TYPE] Set   String> parameters Node root [VARIABLES] ReferencedAfterSideEffect  collector  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  root  
[buglab_swap_variables]^NodeUtil.visitPostOrder ( collector, root, collector ) ;^298^299^300^301^^289^303^NodeUtil.visitPostOrder ( root, collector, collector ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findParametersReferencedAfterSideEffect [RETURN_TYPE] Set   String> parameters Node root [VARIABLES] ReferencedAfterSideEffect  collector  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  root  
[buglab_swap_variables]^NodeUtil.visitPostOrder (  collector, collector ) ;^298^299^300^301^^289^303^NodeUtil.visitPostOrder ( root, collector, collector ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findParametersReferencedAfterSideEffect [RETURN_TYPE] Set   String> parameters Node root [VARIABLES] ReferencedAfterSideEffect  collector  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  root  
[buglab_swap_variables]^NodeUtil.visitPostOrder ( root,  collector ) ;^298^299^300^301^^289^303^NodeUtil.visitPostOrder ( root, collector, collector ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] findParametersReferencedAfterSideEffect [RETURN_TYPE] Set   String> parameters Node root [VARIABLES] ReferencedAfterSideEffect  collector  Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  root  
[buglab_swap_variables]^return ! ( parametersReferenced && parameters.size (  )  == sideEffectSeen.size (  )  ) ;^351^352^^^^343^353^return ! ( sideEffectSeen && parameters.size (  )  == parametersReferenced.size (  )  ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] apply [RETURN_TYPE] boolean   Node node [VARIABLES] Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  node  
[buglab_swap_variables]^return ! ( sideEffectSeen && parametersReferenced.size (  )  == parameters.size (  )  ) ;^351^352^^^^343^353^return ! ( sideEffectSeen && parameters.size (  )  == parametersReferenced.size (  )  ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] apply [RETURN_TYPE] boolean   Node node [VARIABLES] Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  node  
[buglab_swap_variables]^if  ( name.contains ( parameters )  )  {^384^^^^^359^389^if  ( parameters.contains ( name )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] visit [RETURN_TYPE] void   Node n [VARIABLES] Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffectSeen  String  name  int  anonArg  loopsEntered  references  type  Node  n  
[buglab_swap_variables]^return name.contains ( locals ) ;^424^^^^^421^427^return locals.contains ( name ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] isLocalName [RETURN_TYPE] boolean   Node node [VARIABLES] Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffect  sideEffectSeen  String  name  int  anonArg  loopsEntered  references  type  Node  node  
[buglab_swap_variables]^for  ( Node n = c.getFirstChild (  ) ; c != null; c = c.getNext (  )  )  {^443^^^^^433^446^for  ( Node c = n.getFirstChild (  ) ; c != null; c = c.getNext (  )  )  {^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] gatherLocalNames [RETURN_TYPE] void   Node n String> names [VARIABLES] Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffect  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  c  n  
[buglab_swap_variables]^gatherLocalNames ( names, c ) ;^444^^^^^433^446^gatherLocalNames ( c, names ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] gatherLocalNames [RETURN_TYPE] void   Node n String> names [VARIABLES] Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffect  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  c  n  
[buglab_swap_variables]^gatherLocalNames (  names ) ;^444^^^^^433^446^gatherLocalNames ( c, names ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] gatherLocalNames [RETURN_TYPE] void   Node n String> names [VARIABLES] Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffect  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  c  n  
[buglab_swap_variables]^gatherLocalNames ( c ) ;^444^^^^^433^446^gatherLocalNames ( c, names ) ;^[CLASS] FunctionArgumentInjector ReferencedAfterSideEffect  [METHOD] gatherLocalNames [RETURN_TYPE] void   Node n String> names [VARIABLES] Set  locals  names  namesAfterSideEffects  namesNeedingTemps  parameters  parametersReferenced  unsafe  unsafeNames  boolean  safe  sideEffect  sideEffectSeen  int  anonArg  loopsEntered  references  type  Node  c  n  
[buglab_swap_variables]^return ! ( parametersReferenced && parameters.size (  )  == sideEffectSeen.size (  )  ) ;^351^352^^^^343^353^return ! ( sideEffectSeen && parameters.size (  )  == parametersReferenced.size (  )  ) ;^[CLASS] ReferencedAfterSideEffect  [METHOD] apply [RETURN_TYPE] boolean   Node node [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  int  loopsEntered  Node  node  
[buglab_swap_variables]^return ! ( parameters && sideEffectSeen.size (  )  == parametersReferenced.size (  )  ) ;^351^352^^^^343^353^return ! ( sideEffectSeen && parameters.size (  )  == parametersReferenced.size (  )  ) ;^[CLASS] ReferencedAfterSideEffect  [METHOD] apply [RETURN_TYPE] boolean   Node node [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  int  loopsEntered  Node  node  
[buglab_swap_variables]^return ! ( sideEffectSeen && parametersReferenced.size (  )  == parameters.size (  )  ) ;^351^352^^^^343^353^return ! ( sideEffectSeen && parameters.size (  )  == parametersReferenced.size (  )  ) ;^[CLASS] ReferencedAfterSideEffect  [METHOD] apply [RETURN_TYPE] boolean   Node node [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  int  loopsEntered  Node  node  
[buglab_swap_variables]^if  ( name.contains ( parameters )  )  {^384^^^^^359^389^if  ( parameters.contains ( name )  )  {^[CLASS] ReferencedAfterSideEffect  [METHOD] visit [RETURN_TYPE] void   Node n [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffectSeen  String  name  int  loopsEntered  Node  n  
[buglab_swap_variables]^if  ( NodeUtil.isAssignmentOp ( type ) || n == Token.INC || type == Token.DEC )  {^399^400^401^^^394^416^if  ( NodeUtil.isAssignmentOp ( n ) || type == Token.INC || type == Token.DEC )  {^[CLASS] ReferencedAfterSideEffect  [METHOD] hasNonLocalSideEffect [RETURN_TYPE] boolean   Node n [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffect  sideEffectSeen  int  loopsEntered  type  Node  lhs  n  
[buglab_swap_variables]^return name.contains ( locals ) ;^424^^^^^421^427^return locals.contains ( name ) ;^[CLASS] ReferencedAfterSideEffect  [METHOD] isLocalName [RETURN_TYPE] boolean   Node node [VARIABLES] Set  locals  parameters  parametersReferenced  boolean  sideEffect  sideEffectSeen  String  name  int  loopsEntered  type  Node  node  