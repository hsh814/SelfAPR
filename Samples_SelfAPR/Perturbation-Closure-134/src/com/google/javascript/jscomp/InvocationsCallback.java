[P2_Replace_Operator]^if  ( n.getType (  )  <= Token.CALL )  {^41^^^^^40^59^if  ( n.getType (  )  != Token.CALL )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P8_Replace_Mix]^if  ( parent.getType (  )  != Token.CALL )  {^41^^^^^40^59^if  ( n.getType (  )  != Token.CALL )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P9_Replace_Statement]^if  ( function.getType (  )  != Token.GETPROP )  {^41^^^^^40^59^if  ( n.getType (  )  != Token.CALL )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P9_Replace_Statement]^if  ( nameNode.getType (  )  != Token.STRING )  {^41^^^^^40^59^if  ( n.getType (  )  != Token.CALL )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P15_Unwrap_Block]^return ;^41^42^43^^^40^59^if  ( n.getType (  )  != Token.CALL )  { return; }^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P16_Remove_Block]^^41^42^43^^^40^59^if  ( n.getType (  )  != Token.CALL )  { return; }^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P13_Insert_Block]^if  (  ( function.getType (  )  )  !=  ( GETPROP )  )  {     return ; }^41^^^^^40^59^[Delete]^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P13_Insert_Block]^if  (  ( nameNode.getType (  )  )  !=  ( STRING )  )  {     return ; }^41^^^^^40^59^[Delete]^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P7_Replace_Invocation]^if  ( n .getString (  )   != Token.CALL )  {^41^^^^^40^59^if  ( n.getType (  )  != Token.CALL )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^Node function = parent.getFirstChild (  ) ;^45^^^^^40^59^Node function = n.getFirstChild (  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P8_Replace_Mix]^Node function = parent .getString (  )  ;^45^^^^^40^59^Node function = n.getFirstChild (  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P11_Insert_Donor_Statement]^Node nameNode = function.getFirstChild (  ) .getNext (  ) ;Node function = n.getFirstChild (  ) ;^45^^^^^40^59^Node function = n.getFirstChild (  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P14_Delete_Statement]^^45^^^^^40^59^Node function = n.getFirstChild (  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P2_Replace_Operator]^if  ( function.getType (  )  > Token.GETPROP )  {^47^^^^^40^59^if  ( function.getType (  )  != Token.GETPROP )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^if  ( parent.getType (  )  != Token.GETPROP )  {^47^^^^^40^59^if  ( function.getType (  )  != Token.GETPROP )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P7_Replace_Invocation]^if  ( function .getString (  )   != Token.GETPROP )  {^47^^^^^40^59^if  ( function.getType (  )  != Token.GETPROP )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P9_Replace_Statement]^if  ( nameNode.getType (  )  != Token.STRING )  {^47^^^^^40^59^if  ( function.getType (  )  != Token.GETPROP )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P9_Replace_Statement]^if  ( n.getType (  )  != Token.CALL )  {^47^^^^^40^59^if  ( function.getType (  )  != Token.GETPROP )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P15_Unwrap_Block]^return ;^47^48^49^^^40^59^if  ( function.getType (  )  != Token.GETPROP )  { return; }^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P16_Remove_Block]^^47^48^49^^^40^59^if  ( function.getType (  )  != Token.GETPROP )  { return; }^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P13_Insert_Block]^if  (  ( n.getType (  )  )  !=  ( CALL )  )  {     return ; }^47^^^^^40^59^[Delete]^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P13_Insert_Block]^if  (  ( nameNode.getType (  )  )  !=  ( STRING )  )  {     return ; }^47^^^^^40^59^[Delete]^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^Node nameNode = parent.getFirstChild (  ) .getNext (  ) ;^51^^^^^40^59^Node nameNode = function.getFirstChild (  ) .getNext (  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P11_Insert_Donor_Statement]^Node function = n.getFirstChild (  ) ;Node nameNode = function.getFirstChild (  ) .getNext (  ) ;^51^^^^^40^59^Node nameNode = function.getFirstChild (  ) .getNext (  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P14_Delete_Statement]^^51^^^^^40^59^Node nameNode = function.getFirstChild (  ) .getNext (  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P7_Replace_Invocation]^Node nameNode = function .getString (  )  .getNext (  ) ;^51^^^^^40^59^Node nameNode = function.getFirstChild (  ) .getNext (  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P2_Replace_Operator]^if  ( nameNode.getType (  )  == Token.STRING )  {^54^^^^^40^59^if  ( nameNode.getType (  )  != Token.STRING )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^if  ( parent.getType (  )  != Token.STRING )  {^54^^^^^40^59^if  ( nameNode.getType (  )  != Token.STRING )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P9_Replace_Statement]^if  ( function.getType (  )  != Token.GETPROP )  {^54^^^^^40^59^if  ( nameNode.getType (  )  != Token.STRING )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P9_Replace_Statement]^if  ( n.getType (  )  != Token.CALL )  {^54^^^^^40^59^if  ( nameNode.getType (  )  != Token.STRING )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P15_Unwrap_Block]^return ;^54^55^56^^^40^59^if  ( nameNode.getType (  )  != Token.STRING )  { return; }^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P16_Remove_Block]^^54^55^56^^^40^59^if  ( nameNode.getType (  )  != Token.STRING )  { return; }^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P13_Insert_Block]^if  (  ( function.getType (  )  )  !=  ( GETPROP )  )  {     return ; }^54^^^^^40^59^[Delete]^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P13_Insert_Block]^if  (  ( n.getType (  )  )  !=  ( CALL )  )  {     return ; }^54^^^^^40^59^[Delete]^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P7_Replace_Invocation]^if  ( nameNode .getString (  )   != Token.STRING )  {^54^^^^^40^59^if  ( nameNode.getType (  )  != Token.STRING )  {^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit ( t, nameNode, parent, nameNode.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit ( t, n, nameNode, nameNode.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit ( t, n, parent, n.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit (  n, parent, nameNode.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit ( t,  parent, nameNode.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit ( t, n,  nameNode.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit ( t, n, parent.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit ( parent, n, t, nameNode.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit ( t, parent, n, nameNode.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit ( t, n, nameNode, parent.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit ( t, nameNode, parent, n.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P8_Replace_Mix]^visit ( t, parent, parent, nameNode.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P14_Delete_Statement]^^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P5_Replace_Variable]^visit ( t, n, parent, parent.getString (  )  ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
[P7_Replace_Invocation]^visit ( t, n, parent, nameNode .getFirstChild (  )   ) ;^58^^^^^40^59^visit ( t, n, parent, nameNode.getString (  )  ) ;^[CLASS] InvocationsCallback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  function  n  nameNode  parent  
