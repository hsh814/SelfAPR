[buglab_swap_variables]^RequestReceiver receiver = new RequestReceiver ( callSpec, gson.getRequestSpec (  )  ) ;^50^^^^^49^56^RequestReceiver receiver = new RequestReceiver ( gson, callSpec.getRequestSpec (  )  ) ;^[CLASS] WebServiceCallServerProvider  [METHOD] get [RETURN_TYPE] WebServiceCallServerBuilder   [VARIABLES] HttpServletRequest  request  RequestReceiver  receiver  boolean  WebServiceRequest  wsRequest  Builder  responseBuilder  WebServiceCallSpec  callSpec  Gson  gson  
[buglab_swap_variables]^RequestReceiver receiver = new RequestReceiver (  callSpec.getRequestSpec (  )  ) ;^50^^^^^49^56^RequestReceiver receiver = new RequestReceiver ( gson, callSpec.getRequestSpec (  )  ) ;^[CLASS] WebServiceCallServerProvider  [METHOD] get [RETURN_TYPE] WebServiceCallServerBuilder   [VARIABLES] HttpServletRequest  request  RequestReceiver  receiver  boolean  WebServiceRequest  wsRequest  Builder  responseBuilder  WebServiceCallSpec  callSpec  Gson  gson  
[buglab_swap_variables]^RequestReceiver receiver = new RequestReceiver ( gson.getRequestSpec (  )  ) ;^50^^^^^49^56^RequestReceiver receiver = new RequestReceiver ( gson, callSpec.getRequestSpec (  )  ) ;^[CLASS] WebServiceCallServerProvider  [METHOD] get [RETURN_TYPE] WebServiceCallServerBuilder   [VARIABLES] HttpServletRequest  request  RequestReceiver  receiver  boolean  WebServiceRequest  wsRequest  Builder  responseBuilder  WebServiceCallSpec  callSpec  Gson  gson  
[buglab_swap_variables]^WebServiceRequest wsRequest = request.receive ( receiver ) ;^51^^^^^49^56^WebServiceRequest wsRequest = receiver.receive ( request ) ;^[CLASS] WebServiceCallServerProvider  [METHOD] get [RETURN_TYPE] WebServiceCallServerBuilder   [VARIABLES] HttpServletRequest  request  RequestReceiver  receiver  boolean  WebServiceRequest  wsRequest  Builder  responseBuilder  WebServiceCallSpec  callSpec  Gson  gson  
[buglab_swap_variables]^return new WebServiceCallServerBuilder ( callSpec, responseBuilder, wsRequest ) ;^55^^^^^49^56^return new WebServiceCallServerBuilder ( callSpec, wsRequest, responseBuilder ) ;^[CLASS] WebServiceCallServerProvider  [METHOD] get [RETURN_TYPE] WebServiceCallServerBuilder   [VARIABLES] HttpServletRequest  request  RequestReceiver  receiver  boolean  WebServiceRequest  wsRequest  Builder  responseBuilder  WebServiceCallSpec  callSpec  Gson  gson  
[buglab_swap_variables]^return new WebServiceCallServerBuilder ( callSpec,  responseBuilder ) ;^55^^^^^49^56^return new WebServiceCallServerBuilder ( callSpec, wsRequest, responseBuilder ) ;^[CLASS] WebServiceCallServerProvider  [METHOD] get [RETURN_TYPE] WebServiceCallServerBuilder   [VARIABLES] HttpServletRequest  request  RequestReceiver  receiver  boolean  WebServiceRequest  wsRequest  Builder  responseBuilder  WebServiceCallSpec  callSpec  Gson  gson  
[buglab_swap_variables]^return new WebServiceCallServerBuilder ( callSpec, wsRequest ) ;^55^^^^^49^56^return new WebServiceCallServerBuilder ( callSpec, wsRequest, responseBuilder ) ;^[CLASS] WebServiceCallServerProvider  [METHOD] get [RETURN_TYPE] WebServiceCallServerBuilder   [VARIABLES] HttpServletRequest  request  RequestReceiver  receiver  boolean  WebServiceRequest  wsRequest  Builder  responseBuilder  WebServiceCallSpec  callSpec  Gson  gson  
[buglab_swap_variables]^return new WebServiceCallServerBuilder ( responseBuilder, wsRequest, callSpec ) ;^55^^^^^49^56^return new WebServiceCallServerBuilder ( callSpec, wsRequest, responseBuilder ) ;^[CLASS] WebServiceCallServerProvider  [METHOD] get [RETURN_TYPE] WebServiceCallServerBuilder   [VARIABLES] HttpServletRequest  request  RequestReceiver  receiver  boolean  WebServiceRequest  wsRequest  Builder  responseBuilder  WebServiceCallSpec  callSpec  Gson  gson  
[buglab_swap_variables]^return new WebServiceCallServerBuilder (  wsRequest, responseBuilder ) ;^55^^^^^49^56^return new WebServiceCallServerBuilder ( callSpec, wsRequest, responseBuilder ) ;^[CLASS] WebServiceCallServerProvider  [METHOD] get [RETURN_TYPE] WebServiceCallServerBuilder   [VARIABLES] HttpServletRequest  request  RequestReceiver  receiver  boolean  WebServiceRequest  wsRequest  Builder  responseBuilder  WebServiceCallSpec  callSpec  Gson  gson  
[buglab_swap_variables]^return new WebServiceCallServerBuilder ( wsRequest, callSpec, responseBuilder ) ;^55^^^^^49^56^return new WebServiceCallServerBuilder ( callSpec, wsRequest, responseBuilder ) ;^[CLASS] WebServiceCallServerProvider  [METHOD] get [RETURN_TYPE] WebServiceCallServerBuilder   [VARIABLES] HttpServletRequest  request  RequestReceiver  receiver  boolean  WebServiceRequest  wsRequest  Builder  responseBuilder  WebServiceCallSpec  callSpec  Gson  gson  