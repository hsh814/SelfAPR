[buglab_swap_variables]^return f.isEnabled ( delegate ) ;^58^^^^^57^59^return delegate.isEnabled ( f ) ;^[CLASS] JsonParserDelegate  [METHOD] isEnabled [RETURN_TYPE] boolean   Feature f [VARIABLES] Feature  f  JsonParser  d  delegate  boolean  
[buglab_swap_variables]^return schema.canUseSchema ( delegate ) ;^84^^^^^83^85^return delegate.canUseSchema ( schema ) ;^[CLASS] JsonParserDelegate  [METHOD] canUseSchema [RETURN_TYPE] boolean   FormatSchema schema [VARIABLES] JsonParser  d  delegate  FormatSchema  schema  boolean  
[buglab_swap_variables]^return defaultValue.getValueAsInt ( delegate ) ;^281^^^^^280^282^return delegate.getValueAsInt ( defaultValue ) ;^[CLASS] JsonParserDelegate  [METHOD] getValueAsInt [RETURN_TYPE] int   int defaultValue [VARIABLES] int  defaultValue  JsonParser  d  delegate  boolean  
[buglab_swap_variables]^return defaultValue.getValueAsLong ( delegate ) ;^291^^^^^290^292^return delegate.getValueAsLong ( defaultValue ) ;^[CLASS] JsonParserDelegate  [METHOD] getValueAsLong [RETURN_TYPE] long   long defaultValue [VARIABLES] long  defaultValue  JsonParser  d  delegate  boolean  
[buglab_swap_variables]^return defaultValue.getValueAsDouble ( delegate ) ;^301^^^^^300^302^return delegate.getValueAsDouble ( defaultValue ) ;^[CLASS] JsonParserDelegate  [METHOD] getValueAsDouble [RETURN_TYPE] double   double defaultValue [VARIABLES] double  defaultValue  JsonParser  d  delegate  boolean  
[buglab_swap_variables]^return defaultValue.getValueAsBoolean ( delegate ) ;^311^^^^^310^312^return delegate.getValueAsBoolean ( defaultValue ) ;^[CLASS] JsonParserDelegate  [METHOD] getValueAsBoolean [RETURN_TYPE] boolean   boolean defaultValue [VARIABLES] JsonParser  d  delegate  boolean  defaultValue  
[buglab_swap_variables]^return defaultValue.getValueAsString ( delegate ) ;^321^^^^^320^322^return delegate.getValueAsString ( defaultValue ) ;^[CLASS] JsonParserDelegate  [METHOD] getValueAsString [RETURN_TYPE] String   String defaultValue [VARIABLES] JsonParser  d  delegate  String  defaultValue  boolean  
[buglab_swap_variables]^return b64variant.getBinaryValue ( delegate ) ;^337^^^^^336^338^return delegate.getBinaryValue ( b64variant ) ;^[CLASS] JsonParserDelegate  [METHOD] getBinaryValue [RETURN_TYPE] byte[]   Base64Variant b64variant [VARIABLES] Base64Variant  b64variant  JsonParser  d  delegate  boolean  
[buglab_swap_variables]^return b64variant.readBinaryValue ( delegate, out ) ;^343^^^^^341^344^return delegate.readBinaryValue ( b64variant, out ) ;^[CLASS] JsonParserDelegate  [METHOD] readBinaryValue [RETURN_TYPE] int   Base64Variant b64variant OutputStream out [VARIABLES] Base64Variant  b64variant  boolean  JsonParser  d  delegate  OutputStream  out  
[buglab_swap_variables]^return delegate.readBinaryValue (  out ) ;^343^^^^^341^344^return delegate.readBinaryValue ( b64variant, out ) ;^[CLASS] JsonParserDelegate  [METHOD] readBinaryValue [RETURN_TYPE] int   Base64Variant b64variant OutputStream out [VARIABLES] Base64Variant  b64variant  boolean  JsonParser  d  delegate  OutputStream  out  
[buglab_swap_variables]^return out.readBinaryValue ( b64variant, delegate ) ;^343^^^^^341^344^return delegate.readBinaryValue ( b64variant, out ) ;^[CLASS] JsonParserDelegate  [METHOD] readBinaryValue [RETURN_TYPE] int   Base64Variant b64variant OutputStream out [VARIABLES] Base64Variant  b64variant  boolean  JsonParser  d  delegate  OutputStream  out  
[buglab_swap_variables]^return delegate.readBinaryValue ( b64variant ) ;^343^^^^^341^344^return delegate.readBinaryValue ( b64variant, out ) ;^[CLASS] JsonParserDelegate  [METHOD] readBinaryValue [RETURN_TYPE] int   Base64Variant b64variant OutputStream out [VARIABLES] Base64Variant  b64variant  boolean  JsonParser  d  delegate  OutputStream  out  
[buglab_swap_variables]^return delegate.readBinaryValue ( out, b64variant ) ;^343^^^^^341^344^return delegate.readBinaryValue ( b64variant, out ) ;^[CLASS] JsonParserDelegate  [METHOD] readBinaryValue [RETURN_TYPE] int   Base64Variant b64variant OutputStream out [VARIABLES] Base64Variant  b64variant  boolean  JsonParser  d  delegate  OutputStream  out  