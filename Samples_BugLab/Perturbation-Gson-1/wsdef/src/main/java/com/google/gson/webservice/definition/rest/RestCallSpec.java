[buglab_swap_variables]^reqParamsSpecBuilder.put ( param.getName (  ) .getClassOfT (  )  ) ;^53^^^^^52^55^reqParamsSpecBuilder.put ( param.getName (  ) , param.getClassOfT (  )  ) ;^[CLASS] RestCallSpec Builder  [METHOD] addRequestParam [RETURN_TYPE] <T>   TypedKey<T> param [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  TypedKey  param  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^resParamsSpecBuilder.put ( param.getName (  ) .getClassOfT (  )  ) ;^58^^^^^57^60^resParamsSpecBuilder.put ( param.getName (  ) , param.getClassOfT (  )  ) ;^[CLASS] RestCallSpec Builder  [METHOD] addResponseParam [RETURN_TYPE] <T>   TypedKey<T> param [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  TypedKey  param  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^new RestRequestSpec ( resourceType.build (  ) , reqParamsSpecBuilder ) ;^67^^^^^62^72^new RestRequestSpec ( reqParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^new RestRequestSpec ( reqParamsSpecBuilder.build (  )  ) ;^67^^^^^62^72^new RestRequestSpec ( reqParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^RestRequestSpec requestSpec = new RestRequestSpec ( resourceType.build (  ) , reqParamsSpecBuilder ) ;^66^67^^^^62^72^RestRequestSpec requestSpec = new RestRequestSpec ( reqParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^RestRequestSpec requestSpec = new RestRequestSpec ( reqParamsSpecBuilder.build (  )  ) ;^66^67^^^^62^72^RestRequestSpec requestSpec = new RestRequestSpec ( reqParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^new RestResponseSpec ( resourceType.build (  ) , resParamsSpecBuilder ) ;^69^^^^^62^72^new RestResponseSpec ( resParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^new RestResponseSpec ( resParamsSpecBuilder.build (  )  ) ;^69^^^^^62^72^new RestResponseSpec ( resParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^RestResponseSpec responseSpec = new RestResponseSpec ( resourceType.build (  ) , resParamsSpecBuilder ) ;^68^69^^^^62^72^RestResponseSpec responseSpec = new RestResponseSpec ( resParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^RestResponseSpec responseSpec = new RestResponseSpec ( resParamsSpecBuilder.build (  )  ) ;^68^69^^^^62^72^RestResponseSpec responseSpec = new RestResponseSpec ( resParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, callPath, responseSpec, requestSpec, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, callPath,  responseSpec, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, resourceType, responseSpec ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec,  resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( resourceType, callPath, requestSpec, responseSpec, supportedHttpMethods ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec (  callPath, requestSpec, responseSpec, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, responseSpec, requestSpec, callPath, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods,  requestSpec, responseSpec, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, callPath, resourceType, responseSpec, requestSpec ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( requestSpec, callPath, supportedHttpMethods, responseSpec, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, resourceType, requestSpec, responseSpec, callPath ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] RestCallSpec Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, path: %s", responseSpec, resourceType, requestSpec, responseSpec ) ;^115^116^^^^114^117^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, responseSpec: %s", path, resourceType, requestSpec, responseSpec ) ;^[CLASS] RestCallSpec Builder  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, responseSpec: %s",  resourceType, requestSpec, responseSpec ) ;^115^116^^^^114^117^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, responseSpec: %s", path, resourceType, requestSpec, responseSpec ) ;^[CLASS] RestCallSpec Builder  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return String.format ( "path: %s, requestSpec: %s, resourceType: %s, responseSpec: %s", path, resourceType, requestSpec, responseSpec ) ;^115^116^^^^114^117^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, responseSpec: %s", path, resourceType, requestSpec, responseSpec ) ;^[CLASS] RestCallSpec Builder  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, responseSpec: %s", path,  requestSpec, responseSpec ) ;^115^116^^^^114^117^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, responseSpec: %s", path, resourceType, requestSpec, responseSpec ) ;^[CLASS] RestCallSpec Builder  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return String.format ( "path: %s, resourceType: %s, path: %s, responseSpec: %s", requestSpec, resourceType, requestSpec, responseSpec ) ;^115^116^^^^114^117^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, responseSpec: %s", path, resourceType, requestSpec, responseSpec ) ;^[CLASS] RestCallSpec Builder  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, responseSpec: %s", path, resourceType,  responseSpec ) ;^115^116^^^^114^117^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, responseSpec: %s", path, resourceType, requestSpec, responseSpec ) ;^[CLASS] RestCallSpec Builder  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return String.format ( "path: %s, resourceType: %s, responseSpec: %s, requestSpec: %s", path, resourceType, requestSpec, responseSpec ) ;^115^116^^^^114^117^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, responseSpec: %s", path, resourceType, requestSpec, responseSpec ) ;^[CLASS] RestCallSpec Builder  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return String.format ( "path: %s, resourceType: %s, requestSpec: %s: %s", path, resourceType, requestSpec, responseSpec ) ;^115^116^^^^114^117^return String.format ( "path: %s, resourceType: %s, requestSpec: %s, responseSpec: %s", path, resourceType, requestSpec, responseSpec ) ;^[CLASS] RestCallSpec Builder  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  path  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^reqParamsSpecBuilder.put ( param.getName (  ) .getClassOfT (  )  ) ;^53^^^^^52^55^reqParamsSpecBuilder.put ( param.getName (  ) , param.getClassOfT (  )  ) ;^[CLASS] Builder  [METHOD] addRequestParam [RETURN_TYPE] <T>   TypedKey<T> param [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  TypedKey  param  CallPath  callPath  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  
[buglab_swap_variables]^resParamsSpecBuilder.put ( param.getName (  ) .getClassOfT (  )  ) ;^58^^^^^57^60^resParamsSpecBuilder.put ( param.getName (  ) , param.getClassOfT (  )  ) ;^[CLASS] Builder  [METHOD] addResponseParam [RETURN_TYPE] <T>   TypedKey<T> param [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  TypedKey  param  CallPath  callPath  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  
[buglab_swap_variables]^new RestRequestSpec ( resourceType.build (  ) , reqParamsSpecBuilder ) ;^67^^^^^62^72^new RestRequestSpec ( reqParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^new RestRequestSpec ( reqParamsSpecBuilder.build (  )  ) ;^67^^^^^62^72^new RestRequestSpec ( reqParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^RestRequestSpec requestSpec = new RestRequestSpec ( resourceType.build (  ) , reqParamsSpecBuilder ) ;^66^67^^^^62^72^RestRequestSpec requestSpec = new RestRequestSpec ( reqParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^RestRequestSpec requestSpec = new RestRequestSpec ( reqParamsSpecBuilder.build (  )  ) ;^66^67^^^^62^72^RestRequestSpec requestSpec = new RestRequestSpec ( reqParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^new RestResponseSpec ( resourceType.build (  ) , resParamsSpecBuilder ) ;^69^^^^^62^72^new RestResponseSpec ( resParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^new RestResponseSpec ( resParamsSpecBuilder.build (  )  ) ;^69^^^^^62^72^new RestResponseSpec ( resParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^RestResponseSpec responseSpec = new RestResponseSpec ( resourceType.build (  ) , resParamsSpecBuilder ) ;^68^69^^^^62^72^RestResponseSpec responseSpec = new RestResponseSpec ( resParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^RestResponseSpec responseSpec = new RestResponseSpec ( resParamsSpecBuilder.build (  )  ) ;^68^69^^^^62^72^RestResponseSpec responseSpec = new RestResponseSpec ( resParamsSpecBuilder.build (  ) , resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, callPath, resourceType, responseSpec, requestSpec ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, callPath,  responseSpec, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( responseSpec, callPath, requestSpec, supportedHttpMethods, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec,  resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec (  callPath, requestSpec, responseSpec, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, resourceType, requestSpec, responseSpec, callPath ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods,  requestSpec, responseSpec, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, requestSpec, callPath, responseSpec, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( supportedHttpMethods, callPath, responseSpec, requestSpec, resourceType ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  
[buglab_swap_variables]^return new RestCallSpec ( resourceType, callPath, requestSpec, responseSpec, supportedHttpMethods ) ;^70^71^^^^62^72^return new RestCallSpec ( supportedHttpMethods, callPath, requestSpec, responseSpec, resourceType ) ;^[CLASS] Builder  [METHOD] build [RETURN_TYPE] RestCallSpec   [VARIABLES] Type  resourceType  Set  supportedHttpMethods  boolean  Builder  reqParamsSpecBuilder  resParamsSpecBuilder  CallPath  callPath  RestResponseSpec  responseSpec  RestRequestSpec  requestSpec  