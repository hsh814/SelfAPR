[buglab_swap_variables]^super ( property, idRes ) ;^26^^^^^24^27^super ( idRes, property ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] <init> [RETURN_TYPE] BeanProperty)   TypeIdResolver idRes BeanProperty property [VARIABLES] boolean  TypeIdResolver  idRes  BeanProperty  property  
[buglab_swap_variables]^super (  property ) ;^26^^^^^24^27^super ( idRes, property ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] <init> [RETURN_TYPE] BeanProperty)   TypeIdResolver idRes BeanProperty property [VARIABLES] boolean  TypeIdResolver  idRes  BeanProperty  property  
[buglab_swap_variables]^super ( idRes ) ;^26^^^^^24^27^super ( idRes, property ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] <init> [RETURN_TYPE] BeanProperty)   TypeIdResolver idRes BeanProperty property [VARIABLES] boolean  TypeIdResolver  idRes  BeanProperty  property  
[buglab_swap_variables]^if  ( prop == _property )  return this;^31^^^^^30^33^if  ( _property == prop )  return this;^[CLASS] AsWrapperTypeSerializer  [METHOD] forProperty [RETURN_TYPE] AsWrapperTypeSerializer   BeanProperty prop [VARIABLES] boolean  BeanProperty  prop  
[buglab_swap_variables]^jgen.writeObjectFieldStart ( idFromValueAndType (  type )  ) ;^56^^^^^49^57^jgen.writeObjectFieldStart ( idFromValueAndType ( value, type )  ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] boolean  JsonGenerator  jgen  Object  value  Class  type  
[buglab_swap_variables]^jgen.writeObjectFieldStart ( idFromValueAndType ( value )  ) ;^56^^^^^49^57^jgen.writeObjectFieldStart ( idFromValueAndType ( value, type )  ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] boolean  JsonGenerator  jgen  Object  value  Class  type  
[buglab_swap_variables]^jgen.writeObjectFieldStart ( idFromValueAndType ( type, value )  ) ;^56^^^^^49^57^jgen.writeObjectFieldStart ( idFromValueAndType ( value, type )  ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] boolean  JsonGenerator  jgen  Object  value  Class  type  
[buglab_swap_variables]^jgen.writeArrayFieldStart ( idFromValueAndType (  type )  ) ;^77^^^^^70^78^jgen.writeArrayFieldStart ( idFromValueAndType ( value, type )  ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeTypePrefixForArray [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] boolean  JsonGenerator  jgen  Object  value  Class  type  
[buglab_swap_variables]^jgen.writeArrayFieldStart ( idFromValueAndType ( value )  ) ;^77^^^^^70^78^jgen.writeArrayFieldStart ( idFromValueAndType ( value, type )  ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeTypePrefixForArray [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] boolean  JsonGenerator  jgen  Object  value  Class  type  
[buglab_swap_variables]^jgen.writeArrayFieldStart ( idFromValueAndType ( type, value )  ) ;^77^^^^^70^78^jgen.writeArrayFieldStart ( idFromValueAndType ( value, type )  ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeTypePrefixForArray [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] boolean  JsonGenerator  jgen  Object  value  Class  type  
[buglab_swap_variables]^jgen.writeFieldName ( idFromValueAndType (  type )  ) ;^96^^^^^90^97^jgen.writeFieldName ( idFromValueAndType ( value, type )  ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeTypePrefixForScalar [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] boolean  JsonGenerator  jgen  Object  value  Class  type  
[buglab_swap_variables]^jgen.writeFieldName ( idFromValueAndType ( value )  ) ;^96^^^^^90^97^jgen.writeFieldName ( idFromValueAndType ( value, type )  ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeTypePrefixForScalar [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] boolean  JsonGenerator  jgen  Object  value  Class  type  
[buglab_swap_variables]^jgen.writeFieldName ( idFromValueAndType ( type, value )  ) ;^96^^^^^90^97^jgen.writeFieldName ( idFromValueAndType ( value, type )  ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeTypePrefixForScalar [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] boolean  JsonGenerator  jgen  Object  value  Class  type  
[buglab_swap_variables]^writeTypeSuffixForObject ( jgen, value ) ;^160^^^^^158^161^writeTypeSuffixForObject ( value, jgen ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeCustomTypeSuffixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] boolean  JsonGenerator  jgen  Object  value  String  typeId  
[buglab_swap_variables]^writeTypeSuffixForObject (  jgen ) ;^160^^^^^158^161^writeTypeSuffixForObject ( value, jgen ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeCustomTypeSuffixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] boolean  JsonGenerator  jgen  Object  value  String  typeId  
[buglab_swap_variables]^writeTypeSuffixForObject ( value ) ;^160^^^^^158^161^writeTypeSuffixForObject ( value, jgen ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeCustomTypeSuffixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] boolean  JsonGenerator  jgen  Object  value  String  typeId  
[buglab_swap_variables]^writeTypeSuffixForArray ( jgen, value ) ;^166^^^^^164^167^writeTypeSuffixForArray ( value, jgen ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeCustomTypeSuffixForArray [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] boolean  JsonGenerator  jgen  Object  value  String  typeId  
[buglab_swap_variables]^writeTypeSuffixForArray (  jgen ) ;^166^^^^^164^167^writeTypeSuffixForArray ( value, jgen ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeCustomTypeSuffixForArray [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] boolean  JsonGenerator  jgen  Object  value  String  typeId  
[buglab_swap_variables]^writeTypeSuffixForArray ( value ) ;^166^^^^^164^167^writeTypeSuffixForArray ( value, jgen ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeCustomTypeSuffixForArray [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] boolean  JsonGenerator  jgen  Object  value  String  typeId  
[buglab_swap_variables]^writeTypeSuffixForScalar ( jgen, value ) ;^172^^^^^170^173^writeTypeSuffixForScalar ( value, jgen ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeCustomTypeSuffixForScalar [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] boolean  JsonGenerator  jgen  Object  value  String  typeId  
[buglab_swap_variables]^writeTypeSuffixForScalar (  jgen ) ;^172^^^^^170^173^writeTypeSuffixForScalar ( value, jgen ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeCustomTypeSuffixForScalar [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] boolean  JsonGenerator  jgen  Object  value  String  typeId  
[buglab_swap_variables]^writeTypeSuffixForScalar ( value ) ;^172^^^^^170^173^writeTypeSuffixForScalar ( value, jgen ) ;^[CLASS] AsWrapperTypeSerializer  [METHOD] writeCustomTypeSuffixForScalar [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] boolean  JsonGenerator  jgen  Object  value  String  typeId  