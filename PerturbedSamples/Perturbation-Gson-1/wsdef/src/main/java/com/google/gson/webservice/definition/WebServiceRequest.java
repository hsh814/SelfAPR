[REPLACE]^private  HttpMethod method;^25^^^^^^^[REPLACE] private final HttpMethod method;^ [CLASS] WebServiceRequest  
[REPLACE]^private  RequestSpec spec;^28^^^^^^^[REPLACE] private final RequestSpec spec;^ [CLASS] WebServiceRequest  
[REPLACE]^this.method =  null;^31^^^^^30^35^[REPLACE] this.method = method;^[METHOD] <init> [TYPE] RequestBody) [PARAMETER] HttpMethod method HeaderMap requestHeaders RequestBody requestBody [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^this.body =  body;^32^^^^^30^35^[REPLACE] this.body = requestBody;^[METHOD] <init> [TYPE] RequestBody) [PARAMETER] HttpMethod method HeaderMap requestHeaders RequestBody requestBody [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^this.headers =  headers;^33^^^^^30^35^[REPLACE] this.headers = requestHeaders;^[METHOD] <init> [TYPE] RequestBody) [PARAMETER] HttpMethod method HeaderMap requestHeaders RequestBody requestBody [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^this.spec =  new RequestSpec ( headers.getSpec (  ) , requestBody.getSpec (  )  ) ;^34^^^^^30^35^[REPLACE] this.spec = new RequestSpec ( requestHeaders.getSpec (  ) , requestBody.getSpec (  )  ) ;^[METHOD] <init> [TYPE] RequestBody) [PARAMETER] HttpMethod method HeaderMap requestHeaders RequestBody requestBody [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[ADD]^^34^^^^^30^35^[ADD] this.spec = new RequestSpec ( requestHeaders.getSpec (  ) , requestBody.getSpec (  )  ) ;^[METHOD] <init> [TYPE] RequestBody) [PARAMETER] HttpMethod method HeaderMap requestHeaders RequestBody requestBody [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^return body;^38^^^^^37^39^[REPLACE] return method;^[METHOD] getMethod [TYPE] HttpMethod [PARAMETER] [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^return body;^42^^^^^41^43^[REPLACE] return spec;^[METHOD] getSpec [TYPE] RequestSpec [PARAMETER] [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^return body;^46^^^^^45^47^[REPLACE] return method;^[METHOD] getHttpMethod [TYPE] HttpMethod [PARAMETER] [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^return method;^50^^^^^49^51^[REPLACE] return body;^[METHOD] getBody [TYPE] RequestBody [PARAMETER] [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^return body;^54^^^^^53^55^[REPLACE] return headers;^[METHOD] getHeaders [TYPE] HeaderMap [PARAMETER] [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^return headers.get ( true ) ;^62^^^^^61^63^[REPLACE] return headers.get ( headerKey ) ;^[METHOD] getHeader [TYPE] <T> [PARAMETER] TypedKey<T> headerKey [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  TypedKey headerKey  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^sb .StringBuilder ( null )^68^^^^^66^73^[REPLACE] sb.append ( method ) .append ( "," ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  StringBuilder sb  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^sb.append ( ",body:" ) .append ( body ) ;^69^^^^^66^73^[REPLACE] sb.append ( ",headers:" ) .append ( headers ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  StringBuilder sb  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^sb.append ( method ) .append ( "," ) ;^70^^^^^66^73^[REPLACE] sb.append ( ",body:" ) .append ( body ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  StringBuilder sb  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^sb .StringBuilder ( null )  ;^71^^^^^66^73^[REPLACE] sb.append ( "}" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  StringBuilder sb  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[ADD]^^71^72^^^^66^73^[ADD] sb.append ( "}" ) ; return sb.toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  StringBuilder sb  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 
[REPLACE]^return body;^72^^^^^66^73^[REPLACE] return sb.toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] WebServiceRequest   [TYPE]  boolean false  true  [TYPE]  HeaderMap headers  requestHeaders  [TYPE]  RequestSpec spec  [TYPE]  StringBuilder sb  [TYPE]  HttpMethod method  [TYPE]  RequestBody body  requestBody 