[P5_Replace_Variable]^super (  h ) ;^34^^^^^33^35^super ( function, h ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] <init> [RETURN_TYPE] UnivariateRealFunction,double)   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
[P5_Replace_Variable]^super ( function ) ;^34^^^^^33^35^super ( function, h ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] <init> [RETURN_TYPE] UnivariateRealFunction,double)   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
[P5_Replace_Variable]^super ( h, function ) ;^34^^^^^33^35^super ( function, h ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] <init> [RETURN_TYPE] UnivariateRealFunction,double)   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
[P14_Delete_Statement]^^34^^^^^33^35^super ( function, h ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] <init> [RETURN_TYPE] UnivariateRealFunction,double)   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
[P7_Replace_Invocation]^UnivariateRealFunction f = getDelta (  ) ;^41^^^^^40^45^UnivariateRealFunction f = getFunction (  ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P14_Delete_Statement]^^41^42^^^^40^45^UnivariateRealFunction f = getFunction (  ) ; double h2 = getDelta (  ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P1_Replace_Type]^float h2 = getDelta (  ) ;^42^^^^^40^45^double h2 = getDelta (  ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P7_Replace_Invocation]^double h2 = getFunction (  ) ;^42^^^^^40^45^double h2 = getDelta (  ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P11_Insert_Donor_Statement]^double h = h2 * .5;double h2 = getDelta (  ) ;^42^^^^^40^45^double h2 = getDelta (  ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P14_Delete_Statement]^^42^43^^^^40^45^double h2 = getDelta (  ) ; double h = h2 * .5;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P1_Replace_Type]^int h = h2 * .5;^43^^^^^40^45^double h = h2 * .5;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P2_Replace_Operator]^double - h = h2 * .5;^43^^^^^40^45^double h = h2 * .5;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P5_Replace_Variable]^double h = x * .5;^43^^^^^40^45^double h = h2 * .5;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P11_Insert_Donor_Statement]^double h2 = getDelta (  ) ;double h = h2 * .5;^43^^^^^40^45^double h = h2 * .5;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P2_Replace_Operator]^return  ( f.value ( x + h )  - f.value ( x - h )  )  + h2;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P2_Replace_Operator]^return  ( f.value ( x + h )   >=  f.value ( x - h )  )  / h2;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P2_Replace_Operator]^return  ( f.value ( x  ||  h )  - f.value ( x - h )  )  / h2;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P2_Replace_Operator]^return  ( f.value ( x + h )  - f.value ( x  >  h )  )  / h2;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P5_Replace_Variable]^return  ( f.value ( h + h )  - f.value ( x - h )  )  / h2;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P5_Replace_Variable]^return  ( f.value ( x + x )  - f.value ( x - h )  )  / h2;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P5_Replace_Variable]^return  ( f.value ( x + h )  - f.value ( x - h )  )  / x;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P5_Replace_Variable]^return  ( h2.value ( x + h )  - f.value ( x - h )  )  / f;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P5_Replace_Variable]^return  ( f.value ( h + x )  - f.value ( x - h )  )  / h2;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P5_Replace_Variable]^return  ( f.value ( x + h2 )  - f.value ( x - h )  )  / h;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P8_Replace_Mix]^return  ( f .value ( x )   - f^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P5_Replace_Variable]^return  ( f.value ( h2 + h )  - f.value ( x - h )  )  / h2;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P5_Replace_Variable]^return  ( x.value ( f + h )  - f.value ( x - h )  )  / h2;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P14_Delete_Statement]^^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P2_Replace_Operator]^return  ( f.value ( x + h )  - f.value ( x  >=  h )  )  / h2;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P5_Replace_Variable]^return  ( f.value ( x + h2 )  - f.value ( x - h )  )  / h2;^44^^^^^40^45^return  ( f.value ( x + h )  - f.value ( x - h )  )  / h2;^[CLASS] CenterDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  h2  x  UnivariateRealFunction  f  
[P4_Replace_Constructor]^return new CenterDifferenceDerivative (  h ) ;^51^^^^^50^52^return new CenterDifferenceDerivative ( function, h ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] decorate [RETURN_TYPE] UnivariateRealFunction   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
[P4_Replace_Constructor]^return new CenterDifferenceDerivative ( function ) ;^51^^^^^50^52^return new CenterDifferenceDerivative ( function, h ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] decorate [RETURN_TYPE] UnivariateRealFunction   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
[P5_Replace_Variable]^return new CenterDifferenceDerivative ( h, function ) ;^51^^^^^50^52^return new CenterDifferenceDerivative ( function, h ) ;^[CLASS] CenterDifferenceDerivative  [METHOD] decorate [RETURN_TYPE] UnivariateRealFunction   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
