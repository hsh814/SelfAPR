[P8_Replace_Mix]^this.request =  null;^34^^^^^33^35^this.request = request;^[CLASS] CallPathProvider  [METHOD] <init> [RETURN_TYPE] HttpServletRequest)   HttpServletRequest request [VARIABLES] HttpServletRequest  request  boolean  
[P1_Replace_Type]^char pathInfo = request.getPathInfo (  ) ;^39^^^^^38^43^String pathInfo = request.getPathInfo (  ) ;^[CLASS] CallPathProvider  [METHOD] get [RETURN_TYPE] CallPath   [VARIABLES] HttpServletRequest  request  String  callPath  pathInfo  boolean  
[P14_Delete_Statement]^^39^40^^^^38^43^String pathInfo = request.getPathInfo (  ) ; System.out.println ( "Incoming request with pathInfo: " + pathInfo ) ;^[CLASS] CallPathProvider  [METHOD] get [RETURN_TYPE] CallPath   [VARIABLES] HttpServletRequest  request  String  callPath  pathInfo  boolean  
[P2_Replace_Operator]^System.out.println ( "Incoming request with pathInfo: "  |  pathInfo ) ;^40^^^^^38^43^System.out.println ( "Incoming request with pathInfo: " + pathInfo ) ;^[CLASS] CallPathProvider  [METHOD] get [RETURN_TYPE] CallPath   [VARIABLES] HttpServletRequest  request  String  callPath  pathInfo  boolean  
[P3_Replace_Literal]^System.out.println ( "I" + pathInfo ) ;^40^^^^^38^43^System.out.println ( "Incoming request with pathInfo: " + pathInfo ) ;^[CLASS] CallPathProvider  [METHOD] get [RETURN_TYPE] CallPath   [VARIABLES] HttpServletRequest  request  String  callPath  pathInfo  boolean  
[P8_Replace_Mix]^System.out.println ( "Incoming request with callPath: " + pathInfo ) ;^40^^^^^38^43^System.out.println ( "Incoming request with pathInfo: " + pathInfo ) ;^[CLASS] CallPathProvider  [METHOD] get [RETURN_TYPE] CallPath   [VARIABLES] HttpServletRequest  request  String  callPath  pathInfo  boolean  
[P14_Delete_Statement]^^40^41^^^^38^43^System.out.println ( "Incoming request with pathInfo: " + pathInfo ) ; String callPath = pathInfo;^[CLASS] CallPathProvider  [METHOD] get [RETURN_TYPE] CallPath   [VARIABLES] HttpServletRequest  request  String  callPath  pathInfo  boolean  
[P1_Replace_Type]^char callPath = pathInfo;^41^^^^^38^43^String callPath = pathInfo;^[CLASS] CallPathProvider  [METHOD] get [RETURN_TYPE] CallPath   [VARIABLES] HttpServletRequest  request  String  callPath  pathInfo  boolean  
[P5_Replace_Variable]^return new CallPath ( pathInfo ) ;^42^^^^^38^43^return new CallPath ( callPath ) ;^[CLASS] CallPathProvider  [METHOD] get [RETURN_TYPE] CallPath   [VARIABLES] HttpServletRequest  request  String  callPath  pathInfo  boolean  