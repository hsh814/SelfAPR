[P14_Delete_Statement]^^35^^^^^34^40^Set<String> usedNames = Sets.newHashSet (  ) ;^[CLASS] VariableNameGenerator  [METHOD] <init> [RETURN_TYPE] Scope)   Scope scope [VARIABLES] Iterator  i  NameGenerator  names  Set  usedNames  boolean  Scope  scope  
[P14_Delete_Statement]^^37^^^^^34^40^usedNames.add ( i.next (  ) .getName (  )  ) ;^[CLASS] VariableNameGenerator  [METHOD] <init> [RETURN_TYPE] Scope)   Scope scope [VARIABLES] Iterator  i  NameGenerator  names  Set  usedNames  boolean  Scope  scope  
[P7_Replace_Invocation]^usedNames.add ( i .hasNext (  )  .getName (  )  ) ;^37^^^^^34^40^usedNames.add ( i.next (  ) .getName (  )  ) ;^[CLASS] VariableNameGenerator  [METHOD] <init> [RETURN_TYPE] Scope)   Scope scope [VARIABLES] Iterator  i  NameGenerator  names  Set  usedNames  boolean  Scope  scope  
[P14_Delete_Statement]^^36^37^38^^^34^40^for  ( Iterator<Var> i = scope.getVars (  ) ; i.hasNext (  ) ; )  { usedNames.add ( i.next (  ) .getName (  )  ) ; }^[CLASS] VariableNameGenerator  [METHOD] <init> [RETURN_TYPE] Scope)   Scope scope [VARIABLES] Iterator  i  NameGenerator  names  Set  usedNames  boolean  Scope  scope  
[P8_Replace_Mix]^names = new NameGenerator ( usedNames, "", true ) ;^39^^^^^34^40^names = new NameGenerator ( usedNames, "", null ) ;^[CLASS] VariableNameGenerator  [METHOD] <init> [RETURN_TYPE] Scope)   Scope scope [VARIABLES] Iterator  i  NameGenerator  names  Set  usedNames  boolean  Scope  scope  
[P14_Delete_Statement]^^43^^^^^42^44^return names.generateNextName (  ) ;^[CLASS] VariableNameGenerator  [METHOD] getNameNewName [RETURN_TYPE] String   [VARIABLES] NameGenerator  names  boolean  