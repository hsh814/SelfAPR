[buglab_swap_variables]^return pos.setPosition ( parentContext ) ;^98^^^^^83^113^return parentContext.setPosition ( pos ) ;^[CLASS] PredicateContext  [METHOD] nextNode [RETURN_TYPE] boolean   [VARIABLES] boolean  done  ok  Expression  expression  nameTestExpression  Object  pred  String  propertyName  String[]  names  PropertyPointer  dynamicPropertyPointer  int  i  pos  
[buglab_swap_variables]^Object pred = parentContext.computeValue ( expression ) ;^82^^^^^67^97^Object pred = expression.computeValue ( parentContext ) ;^[CLASS] PredicateContext  [METHOD] nextNode [RETURN_TYPE] boolean   [VARIABLES] boolean  done  ok  Expression  expression  nameTestExpression  Object  pred  String  propertyName  String[]  names  PropertyPointer  dynamicPropertyPointer  int  i  pos  
[buglab_swap_variables]^if  ( propertyName[i].equals ( names )  )  {^70^^^^^55^85^if  ( names[i].equals ( propertyName )  )  {^[CLASS] PredicateContext  [METHOD] nextNode [RETURN_TYPE] boolean   [VARIABLES] boolean  done  ok  Expression  expression  nameTestExpression  Object  pred  String  propertyName  String[]  names  PropertyPointer  dynamicPropertyPointer  int  i  pos  
[buglab_swap_variables]^for  ( names.lengthnt i = 0; i < i; i++ )  {^69^^^^^54^84^for  ( int i = 0; i < names.length; i++ )  {^[CLASS] PredicateContext  [METHOD] nextNode [RETURN_TYPE] boolean   [VARIABLES] boolean  done  ok  Expression  expression  nameTestExpression  Object  pred  String  propertyName  String[]  names  PropertyPointer  dynamicPropertyPointer  int  i  pos  
[buglab_swap_variables]^for  ( int i = 0; i < names.length.length; i++ )  {^69^^^^^54^84^for  ( int i = 0; i < names.length; i++ )  {^[CLASS] PredicateContext  [METHOD] nextNode [RETURN_TYPE] boolean   [VARIABLES] boolean  done  ok  Expression  expression  nameTestExpression  Object  pred  String  propertyName  String[]  names  PropertyPointer  dynamicPropertyPointer  int  i  pos  
[buglab_swap_variables]^Object pred = parentContext.computeValue ( nameTestExpression ) ;^56^^^^^41^71^Object pred = nameTestExpression.computeValue ( parentContext ) ;^[CLASS] PredicateContext  [METHOD] nextNode [RETURN_TYPE] boolean   [VARIABLES] boolean  done  ok  Expression  expression  nameTestExpression  Object  pred  String  propertyName  String[]  names  PropertyPointer  dynamicPropertyPointer  int  i  pos  
[buglab_swap_variables]^for  ( int i = 0; i < names; i++ )  {^69^^^^^54^84^for  ( int i = 0; i < names.length; i++ )  {^[CLASS] PredicateContext  [METHOD] nextNode [RETURN_TYPE] boolean   [VARIABLES] boolean  done  ok  Expression  expression  nameTestExpression  Object  pred  String  propertyName  String[]  names  PropertyPointer  dynamicPropertyPointer  int  i  pos  
[buglab_swap_variables]^for  ( namesnt i = 0; i < i.length; i++ )  {^69^^^^^54^84^for  ( int i = 0; i < names.length; i++ )  {^[CLASS] PredicateContext  [METHOD] nextNode [RETURN_TYPE] boolean   [VARIABLES] boolean  done  ok  Expression  expression  nameTestExpression  Object  pred  String  propertyName  String[]  names  PropertyPointer  dynamicPropertyPointer  int  i  pos  
[buglab_swap_variables]^if  ( dynamicPropertyPointer < 1 || position > position.getLength (  )  )  {^143^144^^^^133^150^if  ( position < 1 || position > dynamicPropertyPointer.getLength (  )  )  {^[CLASS] PredicateContext  [METHOD] setPosition [RETURN_TYPE] boolean   int position [VARIABLES] boolean  done  ok  PropertyPointer  dynamicPropertyPointer  Expression  expression  nameTestExpression  int  position  