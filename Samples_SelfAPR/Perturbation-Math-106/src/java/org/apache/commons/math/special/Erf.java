[P14_Delete_Statement]^^34^^^^^33^35^super (  ) ;^[CLASS] Erf  [METHOD] <init> [RETURN_TYPE] Erf()   [VARIABLES] boolean  
[P1_Replace_Type]^int ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^52^^^^^51^57^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P2_Replace_Operator]^double / ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^52^^^^^51^57^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P3_Replace_Literal]^double ret = Gamma.regularizedGammaP ( 0.1, x * x, 1.0e-15, 10000 ) ;^52^^^^^51^57^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P3_Replace_Literal]^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 9996 ) ;^52^^^^^51^57^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P2_Replace_Operator]^double - ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^52^^^^^51^57^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P3_Replace_Literal]^double ret = Gamma.regularizedGammaP ( 2.0, x * x, 1.0e-15, 10000 ) ;^52^^^^^51^57^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P3_Replace_Literal]^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 9993 ) ;^52^^^^^51^57^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P5_Replace_Variable]^double ret = Gamma.regularizedGammaP ( 0.5, ret * x, 1.0e-15, 10000 ) ;^52^^^^^51^57^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P14_Delete_Statement]^^52^^^^^51^57^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P2_Replace_Operator]^if  ( x > 0 )  {^53^^^^^51^57^if  ( x < 0 )  {^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P8_Replace_Mix]^if  ( x < 1 )  {^53^^^^^51^57^if  ( x < 0 )  {^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P15_Unwrap_Block]^ret = -ret;^53^54^55^^^51^57^if  ( x < 0 )  { ret = -ret; }^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P16_Remove_Block]^^53^54^55^^^51^57^if  ( x < 0 )  { ret = -ret; }^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P5_Replace_Variable]^x = -ret;^54^^^^^51^57^ret = -ret;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P8_Replace_Mix]^ret =  -x;^54^^^^^51^57^ret = -ret;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
[P5_Replace_Variable]^return x;^56^^^^^51^57^return ret;^[CLASS] Erf  [METHOD] erf [RETURN_TYPE] double   double x [VARIABLES] boolean  double  ret  x  
