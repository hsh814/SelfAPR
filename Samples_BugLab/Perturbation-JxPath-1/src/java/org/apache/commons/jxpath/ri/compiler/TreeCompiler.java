[buglab_swap_variables]^return new QName ( name, prefix ) ;^39^^^^^38^40^return new QName ( prefix, name ) ;^[CLASS] TreeCompiler  [METHOD] qname [RETURN_TYPE] Object   String prefix String name [VARIABLES] QName  QNAME_NAME  String  name  prefix  boolean  
[buglab_swap_variables]^return new QName (  name ) ;^39^^^^^38^40^return new QName ( prefix, name ) ;^[CLASS] TreeCompiler  [METHOD] qname [RETURN_TYPE] Object   String prefix String name [VARIABLES] QName  QNAME_NAME  String  name  prefix  boolean  
[buglab_swap_variables]^return new QName ( prefix ) ;^39^^^^^38^40^return new QName ( prefix, name ) ;^[CLASS] TreeCompiler  [METHOD] qname [RETURN_TYPE] Object   String prefix String name [VARIABLES] QName  QNAME_NAME  String  name  prefix  boolean  
[buglab_swap_variables]^return new CoreFunction ( args, toExpressionArray ( code )  ) ;^112^^^^^111^113^return new CoreFunction ( code, toExpressionArray ( args )  ) ;^[CLASS] TreeCompiler  [METHOD] function [RETURN_TYPE] Object   int code Object[] args [VARIABLES] boolean  QName  QNAME_NAME  int  code  Object[]  args  
[buglab_swap_variables]^return new CoreFunction (  toExpressionArray ( args )  ) ;^112^^^^^111^113^return new CoreFunction ( code, toExpressionArray ( args )  ) ;^[CLASS] TreeCompiler  [METHOD] function [RETURN_TYPE] Object   int code Object[] args [VARIABLES] boolean  QName  QNAME_NAME  int  code  Object[]  args  
[buglab_swap_variables]^return new LocationPath ( steps, toStepArray ( absolute )  ) ;^135^^^^^134^136^return new LocationPath ( absolute, toStepArray ( steps )  ) ;^[CLASS] TreeCompiler  [METHOD] locationPath [RETURN_TYPE] Object   boolean absolute Object[] steps [VARIABLES] QName  QNAME_NAME  Object[]  steps  boolean  absolute  
[buglab_swap_variables]^return new LocationPath (  toStepArray ( steps )  ) ;^135^^^^^134^136^return new LocationPath ( absolute, toStepArray ( steps )  ) ;^[CLASS] TreeCompiler  [METHOD] locationPath [RETURN_TYPE] Object   boolean absolute Object[] steps [VARIABLES] QName  QNAME_NAME  Object[]  steps  boolean  absolute  
[buglab_swap_variables]^return new Step (  ( NodeTest )  nodeTest, toExpressionArray ( predicates )  ) ;^162^163^164^165^^161^166^return new Step ( axis, ( NodeTest )  nodeTest, toExpressionArray ( predicates )  ) ;^[CLASS] TreeCompiler  [METHOD] step [RETURN_TYPE] Object   int axis Object nodeTest Object[] predicates [VARIABLES] Object  nodeTest  boolean  QName  QNAME_NAME  int  axis  Object[]  predicates  
[buglab_swap_variables]^return new Step ( predicates, ( NodeTest )  nodeTest, toExpressionArray ( axis )  ) ;^162^163^164^165^^161^166^return new Step ( axis, ( NodeTest )  nodeTest, toExpressionArray ( predicates )  ) ;^[CLASS] TreeCompiler  [METHOD] step [RETURN_TYPE] Object   int axis Object nodeTest Object[] predicates [VARIABLES] Object  nodeTest  boolean  QName  QNAME_NAME  int  axis  Object[]  predicates  