[REPLACE]^public  static TimeZoneSerializer instance = new TimeZoneSerializer (  ) ;^14^^^^^^^[REPLACE] public final static TimeZoneSerializer instance = new TimeZoneSerializer (  ) ;^ [CLASS] TimeZoneSerializer  
[REPLACE]^typeSer.writeTypePrefixForScalar ( value, jgen, TimeZone.class ) ;^16^^^^^^^[REPLACE] public TimeZoneSerializer (  )  { super ( TimeZone.class ) ; }^[METHOD] <init> [TYPE] TimeZoneSerializer() [PARAMETER] [CLASS] TimeZoneSerializer   [TYPE]  TimeZoneSerializer instance  [TYPE]  boolean false  true 
[REPLACE]^typeSer.writeTypePrefixForScalar ( value, jgen, TimeZone.class ) ;^22^^^^^19^23^[REPLACE] jgen.writeString ( value.getID (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] TimeZone value JsonGenerator jgen SerializerProvider provider [CLASS] TimeZoneSerializer   [TYPE]  JsonGenerator jgen  [TYPE]  TimeZone value  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  TimeZoneSerializer instance 
[ADD]^^22^^^^^19^23^[ADD] jgen.writeString ( value.getID (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] TimeZone value JsonGenerator jgen SerializerProvider provider [CLASS] TimeZoneSerializer   [TYPE]  JsonGenerator jgen  [TYPE]  TimeZone value  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  TimeZoneSerializer instance 
[REPLACE]^typeSer .writeTypeSuffixForScalar ( value , jgen )  ;^31^^^^^26^34^[REPLACE] typeSer.writeTypePrefixForScalar ( value, jgen, TimeZone.class ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] TimeZone value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] TimeZoneSerializer   [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  TimeZone value  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  TimeZoneSerializer instance 
[REMOVE]^public TimeZoneSerializer (  )  { super ( TimeZone.class ) ; }^31^^^^^26^34^[REMOVE] ^[METHOD] serializeWithType [TYPE] void [PARAMETER] TimeZone value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] TimeZoneSerializer   [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  TimeZone value  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  TimeZoneSerializer instance 
[REPLACE]^typeSer.writeTypePrefixForScalar ( value, jgen, TimeZone.class ) ;^32^^^^^26^34^[REPLACE] serialize ( value, jgen, provider ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] TimeZone value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] TimeZoneSerializer   [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  TimeZone value  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  TimeZoneSerializer instance 
[REPLACE]^typeSer.writeTypePrefixForScalar ( value, jgen, TimeZone.class ) ;^33^^^^^26^34^[REPLACE] typeSer.writeTypeSuffixForScalar ( value, jgen ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] TimeZone value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] TimeZoneSerializer   [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  TimeZone value  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  TimeZoneSerializer instance 