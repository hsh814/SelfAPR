[P3_Replace_Literal]^private static final Escaper BASIC_ESCAPER = new Escaper ( true ) ;^31^^^^^26^36^private static final Escaper BASIC_ESCAPER = new Escaper ( false ) ;^[CLASS] JsonElement   [VARIABLES] 
[P2_Replace_Operator]^return this  ||  JsonArray;^39^^^^^38^40^return this instanceof JsonArray;^[CLASS] JsonElement  [METHOD] isJsonArray [RETURN_TYPE] boolean   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^return null instanceof JsonArray;^39^^^^^38^40^return this instanceof JsonArray;^[CLASS] JsonElement  [METHOD] isJsonArray [RETURN_TYPE] boolean   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P2_Replace_Operator]^return this  >  JsonObject;^48^^^^^47^49^return this instanceof JsonObject;^[CLASS] JsonElement  [METHOD] isJsonObject [RETURN_TYPE] boolean   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^return null instanceof JsonObject;^48^^^^^47^49^return this instanceof JsonObject;^[CLASS] JsonElement  [METHOD] isJsonObject [RETURN_TYPE] boolean   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P2_Replace_Operator]^return this  <=  JsonPrimitive;^57^^^^^56^58^return this instanceof JsonPrimitive;^[CLASS] JsonElement  [METHOD] isJsonPrimitive [RETURN_TYPE] boolean   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^return null instanceof JsonPrimitive;^57^^^^^56^58^return this instanceof JsonPrimitive;^[CLASS] JsonElement  [METHOD] isJsonPrimitive [RETURN_TYPE] boolean   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P2_Replace_Operator]^return this  |  JsonNull;^67^^^^^66^68^return this instanceof JsonNull;^[CLASS] JsonElement  [METHOD] isJsonNull [RETURN_TYPE] boolean   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^return null instanceof JsonNull;^67^^^^^66^68^return this instanceof JsonNull;^[CLASS] JsonElement  [METHOD] isJsonNull [RETURN_TYPE] boolean   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P7_Replace_Invocation]^if  ( isJsonArray (  )  )  {^80^^^^^79^84^if  ( isJsonObject (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P9_Replace_Statement]^if  ( isJsonPrimitive (  )  )  {^80^^^^^79^84^if  ( isJsonObject (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P9_Replace_Statement]^if  ( isJsonNull (  )  )  {^80^^^^^79^84^if  ( isJsonObject (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P15_Unwrap_Block]^return ((com.google.gson.JsonObject) (this));^80^81^82^^^79^84^if  ( isJsonObject (  )  )  { return  ( JsonObject )  this; }^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P16_Remove_Block]^^80^81^82^^^79^84^if  ( isJsonObject (  )  )  { return  ( JsonObject )  this; }^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonArray (  )  )  {     return  (  ( JsonArray )   ( this )  ) ; }^80^^^^^79^84^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonPrimitive (  )  )  {     return  (  ( JsonPrimitive )   ( this )  ) ; }^80^^^^^79^84^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonNull (  )  )  {     return  (  ( JsonNull )   ( this )  ) ; }^80^^^^^79^84^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^return  ( JsonObject )  null;^81^^^^^79^84^return  ( JsonObject )  this;^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonArray (  )  )  {     return  (  ( JsonArray )   ( this )  ) ; }^81^^^^^79^84^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonObject (  )  )  {     return  (  ( JsonObject )   ( this )  ) ; }^81^^^^^79^84^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonNull (  )  )  {     return  (  ( JsonNull )   ( this )  ) ; }^81^^^^^79^84^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P4_Replace_Constructor]^throw throw  new IllegalStateException ( "This is not a JSON Primitive." )   ;^83^^^^^79^84^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new UnsupportedOperationException  (" ")  ;throw new IllegalStateException  (" ")  ;^83^^^^^79^84^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new IllegalStateException  (" ")  ;^83^^^^^79^84^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P7_Replace_Invocation]^if  ( isJsonNull (  )  )  {^96^^^^^95^100^if  ( isJsonArray (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P9_Replace_Statement]^if  ( isJsonPrimitive (  )  )  {^96^^^^^95^100^if  ( isJsonArray (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P9_Replace_Statement]^if  ( isJsonObject (  )  )  {^96^^^^^95^100^if  ( isJsonArray (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P15_Unwrap_Block]^return ((com.google.gson.JsonArray) (this));^96^97^98^^^95^100^if  ( isJsonArray (  )  )  { return  ( JsonArray )  this; }^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P16_Remove_Block]^^96^97^98^^^95^100^if  ( isJsonArray (  )  )  { return  ( JsonArray )  this; }^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonObject (  )  )  {     return  (  ( JsonObject )   ( this )  ) ; }^96^^^^^95^100^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonPrimitive (  )  )  {     return  (  ( JsonPrimitive )   ( this )  ) ; }^96^^^^^95^100^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonNull (  )  )  {     return  (  ( JsonNull )   ( this )  ) ; }^96^^^^^95^100^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^return  ( JsonArray )  null;^97^^^^^95^100^return  ( JsonArray )  this;^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonArray (  )  )  {     return  (  ( JsonArray )   ( this )  ) ; }^97^^^^^95^100^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonObject (  )  )  {     return  (  ( JsonObject )   ( this )  ) ; }^97^^^^^95^100^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonNull (  )  )  {     return  (  ( JsonNull )   ( this )  ) ; }^97^^^^^95^100^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P4_Replace_Constructor]^throw throw  new IllegalStateException ( "This is not a JSON Primitive." )   ;^99^^^^^95^100^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new UnsupportedOperationException  (" ")  ;throw new IllegalStateException  (" ")  ;^99^^^^^95^100^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new IllegalStateException  (" ")  ;^99^^^^^95^100^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P7_Replace_Invocation]^if  ( isJsonObject (  )  )  {^112^^^^^111^116^if  ( isJsonPrimitive (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P9_Replace_Statement]^if  ( isJsonArray (  )  )  {^112^^^^^111^116^if  ( isJsonPrimitive (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P9_Replace_Statement]^if  ( isJsonNull (  )  )  {^112^^^^^111^116^if  ( isJsonPrimitive (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P15_Unwrap_Block]^return ((com.google.gson.JsonPrimitive) (this));^112^113^114^^^111^116^if  ( isJsonPrimitive (  )  )  { return  ( JsonPrimitive )  this; }^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P16_Remove_Block]^^112^113^114^^^111^116^if  ( isJsonPrimitive (  )  )  { return  ( JsonPrimitive )  this; }^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonArray (  )  )  {     return  (  ( JsonArray )   ( this )  ) ; }^112^^^^^111^116^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonObject (  )  )  {     return  (  ( JsonObject )   ( this )  ) ; }^112^^^^^111^116^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonNull (  )  )  {     return  (  ( JsonNull )   ( this )  ) ; }^112^^^^^111^116^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^return  ( JsonPrimitive )  null;^113^^^^^111^116^return  ( JsonPrimitive )  this;^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonPrimitive (  )  )  {     return  (  ( JsonPrimitive )   ( this )  ) ; }^113^^^^^111^116^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P4_Replace_Constructor]^throw throw  new IllegalStateException ( "This is not a JSON Null." )   ;^115^^^^^111^116^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new UnsupportedOperationException  (" ")  ;throw new IllegalStateException  (" ")  ;^115^^^^^111^116^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new IllegalStateException  (" ")  ;^115^^^^^111^116^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P7_Replace_Invocation]^if  ( isJsonArray (  )  )  {^129^^^^^128^133^if  ( isJsonNull (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P9_Replace_Statement]^if  ( isJsonPrimitive (  )  )  {^129^^^^^128^133^if  ( isJsonNull (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P9_Replace_Statement]^if  ( isJsonObject (  )  )  {^129^^^^^128^133^if  ( isJsonNull (  )  )  {^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P15_Unwrap_Block]^return ((com.google.gson.JsonNull) (this));^129^130^131^^^128^133^if  ( isJsonNull (  )  )  { return  ( JsonNull )  this; }^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P16_Remove_Block]^^129^130^131^^^128^133^if  ( isJsonNull (  )  )  { return  ( JsonNull )  this; }^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonArray (  )  )  {     return  (  ( JsonArray )   ( this )  ) ; }^129^^^^^128^133^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonObject (  )  )  {     return  (  ( JsonObject )   ( this )  ) ; }^129^^^^^128^133^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonPrimitive (  )  )  {     return  (  ( JsonPrimitive )   ( this )  ) ; }^129^^^^^128^133^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^return  ( JsonNull )  null;^130^^^^^128^133^return  ( JsonNull )  this;^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonArray (  )  )  {     return  (  ( JsonArray )   ( this )  ) ; }^130^^^^^128^133^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonObject (  )  )  {     return  (  ( JsonObject )   ( this )  ) ; }^130^^^^^128^133^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P13_Insert_Block]^if  ( isJsonNull (  )  )  {     return  (  ( JsonNull )   ( this )  ) ; }^130^^^^^128^133^[Delete]^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P4_Replace_Constructor]^throw throw  new IllegalStateException ( "This is not a JSON Primitive." )   ;^132^^^^^128^133^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^return false;^132^^^^^128^133^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new UnsupportedOperationException  (" ")  ;throw new IllegalStateException  (" ")  ;^132^^^^^128^133^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new IllegalStateException  (" ")  ;^132^^^^^128^133^throw new IllegalStateException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsJsonNull [RETURN_TYPE] JsonNull   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^return ;^158^^^^^157^159^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsBooleanWrapper [RETURN_TYPE] Boolean   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^158^^^^^157^159^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsBooleanWrapper [RETURN_TYPE] Boolean   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^158^^^^^157^159^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsBooleanWrapper [RETURN_TYPE] Boolean   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^171^^^^^170^172^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsNumber [RETURN_TYPE] Number   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^171^^^^^170^172^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsNumber [RETURN_TYPE] Number   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^184^^^^^183^185^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsString [RETURN_TYPE] String   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^184^^^^^183^185^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsString [RETURN_TYPE] String   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^197^^^^^196^198^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsDouble [RETURN_TYPE] double   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^197^^^^^196^198^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsDouble [RETURN_TYPE] double   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^210^^^^^209^211^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsFloat [RETURN_TYPE] float   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^210^^^^^209^211^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsFloat [RETURN_TYPE] float   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^223^^^^^222^224^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsLong [RETURN_TYPE] long   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^223^^^^^222^224^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsLong [RETURN_TYPE] long   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^return 0;^236^^^^^235^237^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsInt [RETURN_TYPE] int   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^236^^^^^235^237^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsInt [RETURN_TYPE] int   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^236^^^^^235^237^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsInt [RETURN_TYPE] int   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^250^^^^^249^251^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsByte [RETURN_TYPE] byte   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^250^^^^^249^251^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsByte [RETURN_TYPE] byte   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^264^^^^^263^265^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsCharacter [RETURN_TYPE] char   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^264^^^^^263^265^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsCharacter [RETURN_TYPE] char   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P8_Replace_Mix]^throw new IllegalStateException  (" ")  ; ;^278^^^^^277^279^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsBigDecimal [RETURN_TYPE] BigDecimal   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^278^^^^^277^279^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsBigDecimal [RETURN_TYPE] BigDecimal   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^278^^^^^277^279^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsBigDecimal [RETURN_TYPE] BigDecimal   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^292^^^^^291^293^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsBigInteger [RETURN_TYPE] BigInteger   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^292^^^^^291^293^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsBigInteger [RETURN_TYPE] BigInteger   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^305^^^^^304^306^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsShort [RETURN_TYPE] short   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^305^^^^^304^306^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsShort [RETURN_TYPE] short   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^318^^^^^317^319^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsObject [RETURN_TYPE] Object   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P11_Insert_Donor_Statement]^throw new RuntimeException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^318^^^^^317^319^throw new UnsupportedOperationException  (" ")  ;^[CLASS] JsonElement  [METHOD] getAsObject [RETURN_TYPE] Object   [VARIABLES] Escaper  BASIC_ESCAPER  boolean  
[P5_Replace_Variable]^toString (  BASIC_ESCAPER ) ;^330^^^^^327^335^toString ( sb, BASIC_ESCAPER ) ;^[CLASS] JsonElement  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] IOException  e  boolean  StringBuilder  sb  Escaper  BASIC_ESCAPER  
[P5_Replace_Variable]^toString ( sb ) ;^330^^^^^327^335^toString ( sb, BASIC_ESCAPER ) ;^[CLASS] JsonElement  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] IOException  e  boolean  StringBuilder  sb  Escaper  BASIC_ESCAPER  
[P5_Replace_Variable]^toString ( BASIC_ESCAPER, sb ) ;^330^^^^^327^335^toString ( sb, BASIC_ESCAPER ) ;^[CLASS] JsonElement  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] IOException  e  boolean  StringBuilder  sb  Escaper  BASIC_ESCAPER  
[P14_Delete_Statement]^^330^^^^^327^335^toString ( sb, BASIC_ESCAPER ) ;^[CLASS] JsonElement  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] IOException  e  boolean  StringBuilder  sb  Escaper  BASIC_ESCAPER  
[P14_Delete_Statement]^^331^^^^^327^335^return sb.toString (  ) ;^[CLASS] JsonElement  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] IOException  e  boolean  StringBuilder  sb  Escaper  BASIC_ESCAPER  
[P11_Insert_Donor_Statement]^throw new UnsupportedOperationException  (" ")  ;throw new RuntimeException  (" ")  ;^333^^^^^327^335^throw new RuntimeException  (" ")  ;^[CLASS] JsonElement  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] IOException  e  boolean  StringBuilder  sb  Escaper  BASIC_ESCAPER  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new RuntimeException  (" ")  ;^333^^^^^327^335^throw new RuntimeException  (" ")  ;^[CLASS] JsonElement  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] IOException  e  boolean  StringBuilder  sb  Escaper  BASIC_ESCAPER  
[P14_Delete_Statement]^^330^331^^^^327^335^toString ( sb, BASIC_ESCAPER ) ; return sb.toString (  ) ;^[CLASS] JsonElement  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] IOException  e  boolean  StringBuilder  sb  Escaper  BASIC_ESCAPER  
