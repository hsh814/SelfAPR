[REPLACE]^JsonObject location = location.getJsonObject ( "location" ) ;^49^^^^^45^54^[REPLACE] JsonObject location = json.getJsonObject ( "location" ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^callback.onFailure ( new GeolocationException ( json.getJsonNumber ( "error" ) .getString ( "message" )  )  ) ;^46^47^^^^37^67^[REPLACE] callback.onFailure ( new GeolocationException ( json.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[ADD]^^46^47^^^^37^67^[ADD] callback.onFailure ( new GeolocationException ( json.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^new GeolocationException ( location.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^47^^^^^37^67^[REPLACE] new GeolocationException ( json.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^json.getJsonObject ( "location" )  ;^47^^^^^37^67^[REPLACE] new GeolocationException ( json.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[ADD]^String request = Context.getObjectMapper (  ) .writeValueAsString ( network ) ;^38^39^40^41^42^37^67^[ADD] try { String request = Context.getObjectMapper (  ) .writeValueAsString ( network ) ; Context.getAsyncHttpClient (  ) .preparePost ( url ) .setBody ( request ) .execute ( new AsyncCompletionHandler (  )  { @Override public Object onCompleted ( Response response )  throws Exception {^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^if  ( location.containsKey ( "error" )  )  {^45^^^^^37^67^[REPLACE] if  ( json.containsKey ( "error" )  )  {^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[ADD]^^45^46^47^48^49^37^67^[ADD] if  ( json.containsKey ( "error" )  )  { callback.onFailure ( new GeolocationException ( json.getJsonObject ( "error" ) .getString ( "message" )  )  ) ; } else { JsonObject location = json.getJsonObject ( "location" ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^callback.onFailure ( new GeolocationException ( location.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^46^47^^^^37^67^[REPLACE] callback.onFailure ( new GeolocationException ( json.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^new GeolocationException ( json .getJsonNumber ( request )  .getString ( "message" )  )  ) ;^47^^^^^37^67^[REPLACE] new GeolocationException ( json.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[ADD]^^47^^^^^37^67^[ADD] new GeolocationException ( json.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[ADD]^JsonObject json = reader.readObject (  ) ;new GeolocationException ( json.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^43^44^45^46^47^37^67^[ADD] try  ( JsonReader reader = Json.createReader ( response.getResponseBodyAsStream (  )  )  )  { JsonObject json = reader.readObject (  ) ; if  ( json.containsKey ( "error" )  )  { callback.onFailure ( new GeolocationException ( json.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^JsonObject location = location.getJsonObject ( "location" ) ;^49^^^^^37^67^[REPLACE] JsonObject location = json.getJsonObject ( "location" ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^return true;^56^^^^^37^67^[REPLACE] return null;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^String request = Context.getAsyncHttpClient (  ) .writeValueAsString ( network ) ;^39^^^^^37^67^[REPLACE] String request = Context.getObjectMapper (  ) .writeValueAsString ( network ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^JsonObject location = json.getJsonNumber ( "location" ) ;^49^^^^^37^67^[REPLACE] JsonObject location = json.getJsonObject ( "location" ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[ADD]^^49^^^^^45^54^[ADD] JsonObject location = json.getJsonObject ( "location" ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^callback.onFailure ( new GeolocationException ( location.getJsonObject ( "error" ) .setBody ( "message" )  )  ) ;^46^47^^^^37^67^[REPLACE] callback.onFailure ( new GeolocationException ( json.getJsonObject ( "error" ) .getString ( "message" )  )  ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[ADD]^^49^^^^^37^67^[ADD] JsonObject location = json.getJsonObject ( "location" ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^return this;^56^^^^^37^67^[REPLACE] return null;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[REPLACE]^String request = Context.getObjectMapper (  ) .getString ( network ) ;^39^^^^^37^67^[REPLACE] String request = Context.getObjectMapper (  ) .writeValueAsString ( network ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 
[ADD]^^64^65^^^^37^67^[ADD] catch  ( JsonProcessingException e )  { callback.onFailure ( e ) ;^[METHOD] getLocation [TYPE] void [PARAMETER] Network network LocationProviderCallback callback [CLASS] UniversalGeolocationProvider 1   [TYPE]  Response response  [TYPE]  boolean false  true  [TYPE]  Network network  [TYPE]  JsonReader reader  [TYPE]  JsonObject json  location  [TYPE]  Throwable t  [TYPE]  String key  request  url  [TYPE]  LocationProviderCallback callback  [TYPE]  JsonProcessingException e 