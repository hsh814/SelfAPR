[REPLACE]^return canCreateUsingDefault (  ) ;^52^53^54^55^^51^62^[REPLACE] return canCreateUsingDefault (  ) || canCreateUsingDelegate (  ) || canCreateFromObjectWith (  )^[METHOD] canInstantiate [TYPE] boolean [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return true;^69^^^^^68^70^[REPLACE] return false;^[METHOD] canCreateFromString [TYPE] boolean [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return true;^77^^^^^76^78^[REPLACE] return false;^[METHOD] canCreateFromInt [TYPE] boolean [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return true;^85^^^^^84^86^[REPLACE] return false;^[METHOD] canCreateFromLong [TYPE] boolean [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return true;^93^^^^^92^94^[REPLACE] return false;^[METHOD] canCreateFromDouble [TYPE] boolean [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return true;^101^^^^^100^102^[REPLACE] return false;^[METHOD] canCreateFromBoolean [TYPE] boolean [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return true ;^110^^^^^109^111^[REPLACE] return getDefaultCreator (  )  != null;^[METHOD] canCreateUsingDefault [TYPE] boolean [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return true;^119^^^^^118^120^[REPLACE] return false;^[METHOD] canCreateUsingDelegate [TYPE] boolean [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return true;^128^^^^^127^129^[REPLACE] return false;^[METHOD] canCreateFromObjectWith [TYPE] boolean [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return this;^142^^^^^141^143^[REPLACE] return null;^[METHOD] getFromObjectArguments [TYPE] SettableBeanProperty[] [PARAMETER] DeserializationConfig config [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationConfig config 
[REPLACE]^return true;^153^^^^^152^154^[REPLACE] return null;^[METHOD] getDelegateType [TYPE] JavaType [PARAMETER] DeserializationConfig config [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationConfig config 
[REPLACE]^return ;^174^175^^^^172^176^[REPLACE] throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +"; no default creator found" ) ;^[METHOD] createUsingDefault [TYPE] Object [PARAMETER] DeserializationContext ctxt [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt 
[REPLACE]^+getValueTypeDesc (  ) +" with arguments" ) ;^175^^^^^172^176^[REPLACE] +getValueTypeDesc (  ) +"; no default creator found" ) ;^[METHOD] createUsingDefault [TYPE] Object [PARAMETER] DeserializationContext ctxt [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt 
[REPLACE]^return ;^188^189^^^^186^190^[REPLACE] throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +" with arguments" ) ;^[METHOD] createFromObjectWith [TYPE] Object [PARAMETER] DeserializationContext ctxt Object[] args [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  Object[] args 
[REPLACE]^+getValueTypeDesc (  ) +" from Floating-point number  ( double ) " ) ;^189^^^^^186^190^[REPLACE] +getValueTypeDesc (  ) +" with arguments" ) ;^[METHOD] createFromObjectWith [TYPE] Object [PARAMETER] DeserializationContext ctxt Object[] args [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  Object[] args 
[REPLACE]^return ;^199^200^^^^196^201^[REPLACE] throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +" using delegate" ) ;^[METHOD] createUsingDelegate [TYPE] Object [PARAMETER] DeserializationContext ctxt Object delegate [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  Object delegate 
[REPLACE]^+getValueTypeDesc (  ) +" with arguments" ) ;^200^^^^^196^201^[REPLACE] +getValueTypeDesc (  ) +" using delegate" ) ;^[METHOD] createUsingDelegate [TYPE] Object [PARAMETER] DeserializationContext ctxt Object delegate [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  Object delegate 
[REPLACE]^return ;^212^213^^^^210^214^[REPLACE] throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +" from String value" ) ;^[METHOD] createFromString [TYPE] Object [PARAMETER] DeserializationContext ctxt String value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  String value 
[REPLACE]^+getValueTypeDesc (  ) +" from Boolean value" ) ;^213^^^^^210^214^[REPLACE] +getValueTypeDesc (  ) +" from String value" ) ;^[METHOD] createFromString [TYPE] Object [PARAMETER] DeserializationContext ctxt String value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  String value 
[ADD]^^213^^^^^210^214^[ADD] +getValueTypeDesc (  ) +" from String value" ) ;^[METHOD] createFromString [TYPE] Object [PARAMETER] DeserializationContext ctxt String value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  String value 
[REPLACE]^return ;^218^219^^^^216^220^[REPLACE] throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +" from Integer number  ( int ) " ) ;^[METHOD] createFromInt [TYPE] Object [PARAMETER] DeserializationContext ctxt int value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  int value 
[REPLACE]^+getValueTypeDesc (  ) +" from Integer number  ( long ) " ) ;^219^^^^^216^220^[REPLACE] +getValueTypeDesc (  ) +" from Integer number  ( int ) " ) ;^[METHOD] createFromInt [TYPE] Object [PARAMETER] DeserializationContext ctxt int value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  int value 
[ADD]^^219^^^^^216^220^[ADD] +getValueTypeDesc (  ) +" from Integer number  ( int ) " ) ;^[METHOD] createFromInt [TYPE] Object [PARAMETER] DeserializationContext ctxt int value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  int value 
[REPLACE]^throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +"; no default creator found" ) ; ;^224^225^^^^222^226^[REPLACE] throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +" from Integer number  ( long ) " ) ;^[METHOD] createFromLong [TYPE] Object [PARAMETER] DeserializationContext ctxt long value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  long value 
[ADD]^^224^225^^^^222^226^[ADD] throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +" from Integer number  ( long ) " ) ;^[METHOD] createFromLong [TYPE] Object [PARAMETER] DeserializationContext ctxt long value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  long value 
[REPLACE]^+getValueTypeDesc (  ) +" from Integer number  ( int ) " ) ;^225^^^^^222^226^[REPLACE] +getValueTypeDesc (  ) +" from Integer number  ( long ) " ) ;^[METHOD] createFromLong [TYPE] Object [PARAMETER] DeserializationContext ctxt long value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  long value 
[ADD]^^225^^^^^222^226^[ADD] +getValueTypeDesc (  ) +" from Integer number  ( long ) " ) ;^[METHOD] createFromLong [TYPE] Object [PARAMETER] DeserializationContext ctxt long value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  DeserializationContext ctxt  [TYPE]  long value 
[REPLACE]^throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +"; no default creator found" ) ; ;^230^231^^^^228^232^[REPLACE] throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +" from Floating-point number  ( double ) " ) ;^[METHOD] createFromDouble [TYPE] Object [PARAMETER] DeserializationContext ctxt double value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  double value  [TYPE]  DeserializationContext ctxt 
[ADD]^^230^231^^^^228^232^[ADD] throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +" from Floating-point number  ( double ) " ) ;^[METHOD] createFromDouble [TYPE] Object [PARAMETER] DeserializationContext ctxt double value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  double value  [TYPE]  DeserializationContext ctxt 
[REPLACE]^+getValueTypeDesc (  ) +" with arguments" ) ;^231^^^^^228^232^[REPLACE] +getValueTypeDesc (  ) +" from Floating-point number  ( double ) " ) ;^[METHOD] createFromDouble [TYPE] Object [PARAMETER] DeserializationContext ctxt double value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  [TYPE]  double value  [TYPE]  DeserializationContext ctxt 
[REPLACE]^return ;^236^237^^^^234^238^[REPLACE] throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +" from Boolean value" ) ;^[METHOD] createFromBoolean [TYPE] Object [PARAMETER] DeserializationContext ctxt boolean value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  value  [TYPE]  DeserializationContext ctxt 
[ADD]^^236^237^^^^234^238^[ADD] throw new JsonMappingException ( "Can not instantiate value of type " +getValueTypeDesc (  ) +" from Boolean value" ) ;^[METHOD] createFromBoolean [TYPE] Object [PARAMETER] DeserializationContext ctxt boolean value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  value  [TYPE]  DeserializationContext ctxt 
[REPLACE]^+getValueTypeDesc (  ) +" from String value" ) ;^237^^^^^234^238^[REPLACE] +getValueTypeDesc (  ) +" from Boolean value" ) ;^[METHOD] createFromBoolean [TYPE] Object [PARAMETER] DeserializationContext ctxt boolean value [CLASS] ValueInstantiator   [TYPE]  boolean false  true  value  [TYPE]  DeserializationContext ctxt 
[REPLACE]^return this;^257^^^^^256^258^[REPLACE] return null;^[METHOD] getDefaultCreator [TYPE] AnnotatedWithParams [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return this;^269^^^^^268^270^[REPLACE] return null;^[METHOD] getDelegateCreator [TYPE] AnnotatedWithParams [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return false;^282^^^^^281^283^[REPLACE] return null;^[METHOD] getWithArgsCreator [TYPE] AnnotatedWithParams [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 
[REPLACE]^return true;^290^^^^^289^291^[REPLACE] return null;^[METHOD] getIncompleteParameter [TYPE] AnnotatedParameter [PARAMETER] [CLASS] ValueInstantiator   [TYPE]  boolean false  true 