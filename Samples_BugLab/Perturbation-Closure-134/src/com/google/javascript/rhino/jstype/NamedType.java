[buglab_swap_variables]^return reference.isNominalType (  )  && objType.equals ( objType.getReferenceName (  )  ) ;^175^176^^^^169^180^return objType.isNominalType (  )  && reference.equals ( objType.getReferenceName (  )  ) ;^[CLASS] NamedType  [METHOD] equals [RETURN_TYPE] boolean   Object that [VARIABLES] ObjectType  objType  Object  that  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  
[buglab_swap_variables]^resolveViaRegistry ( enclosing, t ) ;^197^^^^^190^208^resolveViaRegistry ( t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolve [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  StaticScope  enclosing  
[buglab_swap_variables]^resolveViaRegistry (  enclosing ) ;^197^^^^^190^208^resolveViaRegistry ( t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolve [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  StaticScope  enclosing  
[buglab_swap_variables]^resolveViaRegistry ( t ) ;^197^^^^^190^208^resolveViaRegistry ( t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolve [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  StaticScope  enclosing  
[buglab_swap_variables]^resolveViaProperties ( enclosing, t ) ;^204^^^^^190^208^resolveViaProperties ( t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolve [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  StaticScope  enclosing  
[buglab_swap_variables]^resolveViaProperties (  enclosing ) ;^204^^^^^190^208^resolveViaProperties ( t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolve [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  StaticScope  enclosing  
[buglab_swap_variables]^resolveViaProperties ( t ) ;^204^^^^^190^208^resolveViaProperties ( t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolve [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  StaticScope  enclosing  
[buglab_swap_variables]^ObjectType type = ObjectType.cast ( reference.getType ( registry )  ) ;^215^^^^^213^219^ObjectType type = ObjectType.cast ( registry.getType ( reference )  ) ;^[CLASS] NamedType  [METHOD] resolveViaRegistry [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  type  ErrorReporter  t  boolean  forgiving  isResolved  StaticScope  enclosing  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  
[buglab_swap_variables]^if  ( t != null )  {^216^^^^^213^219^if  ( type != null )  {^[CLASS] NamedType  [METHOD] resolveViaRegistry [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  type  ErrorReporter  t  boolean  forgiving  isResolved  StaticScope  enclosing  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  
[buglab_swap_variables]^setReferencedType ( t, type, enclosing ) ;^217^^^^^213^219^setReferencedType ( type, t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaRegistry [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  type  ErrorReporter  t  boolean  forgiving  isResolved  StaticScope  enclosing  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  
[buglab_swap_variables]^setReferencedType (  t, enclosing ) ;^217^^^^^213^219^setReferencedType ( type, t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaRegistry [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  type  ErrorReporter  t  boolean  forgiving  isResolved  StaticScope  enclosing  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  
[buglab_swap_variables]^setReferencedType ( enclosingype, t, t ) ;^217^^^^^213^219^setReferencedType ( type, t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaRegistry [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  type  ErrorReporter  t  boolean  forgiving  isResolved  StaticScope  enclosing  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  
[buglab_swap_variables]^setReferencedType ( type,  enclosing ) ;^217^^^^^213^219^setReferencedType ( type, t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaRegistry [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  type  ErrorReporter  t  boolean  forgiving  isResolved  StaticScope  enclosing  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  
[buglab_swap_variables]^setReferencedType ( enclosing, t, type ) ;^217^^^^^213^219^setReferencedType ( type, t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaRegistry [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  type  ErrorReporter  t  boolean  forgiving  isResolved  StaticScope  enclosing  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  
[buglab_swap_variables]^setReferencedType ( type, t ) ;^217^^^^^213^219^setReferencedType ( type, t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaRegistry [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  type  ErrorReporter  t  boolean  forgiving  isResolved  StaticScope  enclosing  String  reference  sourceName  long  serialVersionUID  int  charno  lineno  
[buglab_swap_variables]^StaticSlot<JSType> slot = componentNames.getSlot ( enclosing[0] ) ;^233^^^^^218^248^StaticSlot<JSType> slot = enclosing.getSlot ( componentNames[0] ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^JSType value = getTypedefType ( componentNames, slot, t[0] ) ;^246^^^^^231^261^JSType value = getTypedefType ( t, slot, componentNames[0] ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^JSType value = getTypedefType (  slot, componentNames[0] ) ;^246^^^^^231^261^JSType value = getTypedefType ( t, slot, componentNames[0] ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^JSType value = getTypedefType ( t, componentNames, slot[0] ) ;^246^^^^^231^261^JSType value = getTypedefType ( t, slot, componentNames[0] ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^JSType value = getTypedefType ( t,  componentNames[0] ) ;^246^^^^^231^261^JSType value = getTypedefType ( t, slot, componentNames[0] ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^JSType value = getTypedefType ( t, slot[0] ) ;^246^^^^^231^261^JSType value = getTypedefType ( t, slot, componentNames[0] ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^JSType value = getTypedefType ( slot, t, componentNames[0] ) ;^246^^^^^231^261^JSType value = getTypedefType ( t, slot, componentNames[0] ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^for  ( componentNamesnt i = 1; i < i.length; i++ )  {^253^^^^^238^268^for  ( int i = 1; i < componentNames.length; i++ )  {^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^value = componentNames.getPropertyType ( parentClass[i] ) ;^263^^^^^248^278^value = parentClass.getPropertyType ( componentNames[i] ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^setReferencedType (  (  ( EnumType )  value ) .getElementsType (  ) ,  enclosing ) ;^275^^^^^260^290^setReferencedType (  (  ( EnumType )  value ) .getElementsType (  ) , t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^setReferencedType (  (  ( EnumType )  value ) .getElementsType (  ) , t ) ;^275^^^^^260^290^setReferencedType (  (  ( EnumType )  value ) .getElementsType (  ) , t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^setReferencedType ( enclosing.getInstanceType (  ) , t, functionType ) ;^270^^^^^255^285^setReferencedType ( functionType.getInstanceType (  ) , t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^setReferencedType ( t.getInstanceType (  ) , functionType, enclosing ) ;^270^^^^^255^285^setReferencedType ( functionType.getInstanceType (  ) , t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^setReferencedType ( functionType.getInstanceType (  ) ,  enclosing ) ;^270^^^^^255^285^setReferencedType ( functionType.getInstanceType (  ) , t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^setReferencedType ( functionType.getInstanceType (  ) , t ) ;^270^^^^^255^285^setReferencedType ( functionType.getInstanceType (  ) , t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^setReferencedType ( functionType.getInstanceType (  ) , enclosing, t ) ;^270^^^^^255^285^setReferencedType ( functionType.getInstanceType (  ) , t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^setReferencedType (  (  ( EnumType )  value ) .getElementsType (  ) , enclosing, t ) ;^275^^^^^260^290^setReferencedType (  (  ( EnumType )  value ) .getElementsType (  ) , t, enclosing ) ;^[CLASS] NamedType  [METHOD] resolveViaProperties [RETURN_TYPE] void   ErrorReporter t JSType> enclosing [VARIABLES] ObjectType  parentClass  ErrorReporter  t  StaticSlot  slot  boolean  forgiving  isResolved  JSType  slotType  value  StaticScope  enclosing  FunctionType  functionType  String  reference  sourceName  String[]  componentNames  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Cycle detected in inheritance chain of linenoype " + reference, sourceName, t, null, charno ) ;^290^291^^^^288^293^t.warning ( "Cycle detected in inheritance chain of type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleTypeCycle [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Cycle detected in inheritance chain of type " + sourceName, reference, lineno, null, charno ) ;^290^291^^^^288^293^t.warning ( "Cycle detected in inheritance chain of type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleTypeCycle [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Cycle detected in inheritance chain of type " +  sourceName, lineno, null, charno ) ;^290^291^^^^288^293^t.warning ( "Cycle detected in inheritance chain of type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleTypeCycle [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Cycle detected in inheritance chain of type " + reference,  lineno, null, charno ) ;^290^291^^^^288^293^t.warning ( "Cycle detected in inheritance chain of type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleTypeCycle [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Cycle detected in inheritance chain of type " + reference, sourceName,  null, charno ) ;^290^291^^^^288^293^t.warning ( "Cycle detected in inheritance chain of type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleTypeCycle [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Cycle detected in inheritance chain of type " + reference, sourceName, charno, null, lineno ) ;^290^291^^^^288^293^t.warning ( "Cycle detected in inheritance chain of type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleTypeCycle [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Cycle detected in inheritance chain of type " + reference, sourceName, lineno, null ) ;^290^291^^^^288^293^t.warning ( "Cycle detected in inheritance chain of type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleTypeCycle [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^if  ( !registry.isForwardDeclaredType ( registry )  && !forgiving && reference.isLastGeneration (  )  )  {^305^306^^^^304^315^if  ( !registry.isForwardDeclaredType ( reference )  && !forgiving && registry.isLastGeneration (  )  )  {^[CLASS] NamedType  [METHOD] handleUnresolvedType [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Unknown referenceype " + t, sourceName, lineno, null, charno ) ;^307^308^^^^304^315^t.warning ( "Unknown type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleUnresolvedType [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Unknown type " +  sourceName, lineno, null, charno ) ;^307^308^^^^304^315^t.warning ( "Unknown type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleUnresolvedType [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Unknown sourceNameype " + reference, t, lineno, null, charno ) ;^307^308^^^^304^315^t.warning ( "Unknown type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleUnresolvedType [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Unknown type " + reference,  lineno, null, charno ) ;^307^308^^^^304^315^t.warning ( "Unknown type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleUnresolvedType [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Unknown type " + reference, sourceName, charno, null, lineno ) ;^307^308^^^^304^315^t.warning ( "Unknown type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleUnresolvedType [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Unknown type " + reference, sourceName,  null, charno ) ;^307^308^^^^304^315^t.warning ( "Unknown type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleUnresolvedType [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Unknown type " + reference, sourceName, lineno, null ) ;^307^308^^^^304^315^t.warning ( "Unknown type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleUnresolvedType [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Unknown linenoype " + reference, sourceName, t, null, charno ) ;^307^308^^^^304^315^t.warning ( "Unknown type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleUnresolvedType [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Unknown type " + charno, sourceName, lineno, null, reference ) ;^307^308^^^^304^315^t.warning ( "Unknown type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleUnresolvedType [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  
[buglab_swap_variables]^t.warning ( "Unknown type " + sourceName, reference, lineno, null, charno ) ;^307^308^^^^304^315^t.warning ( "Unknown type " + reference, sourceName, lineno, null, charno ) ;^[CLASS] NamedType  [METHOD] handleUnresolvedType [RETURN_TYPE] void   ErrorReporter t [VARIABLES] ErrorReporter  t  boolean  forgiving  isResolved  String  reference  sourceName  long  serialVersionUID  int  charno  i  lineno  