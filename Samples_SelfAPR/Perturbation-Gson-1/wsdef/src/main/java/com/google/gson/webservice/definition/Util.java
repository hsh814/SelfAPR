[P5_Replace_Variable]^return expectedType.equals ( typeOfValue ) ;^25^^^^^24^26^return typeOfValue.equals ( expectedType ) ;^[CLASS] Util  [METHOD] isAssignableFrom [RETURN_TYPE] boolean   Type typeOfValue Type expectedType [VARIABLES] Type  expectedType  typeOfValue  boolean  
[P14_Delete_Statement]^^25^^^^^24^26^return typeOfValue.equals ( expectedType ) ;^[CLASS] Util  [METHOD] isAssignableFrom [RETURN_TYPE] boolean   Type typeOfValue Type expectedType [VARIABLES] Type  expectedType  typeOfValue  boolean  
[P3_Replace_Literal]^StringBuilder sb = new StringBuilder ( "" ) ;^29^^^^^28^41^StringBuilder sb = new StringBuilder ( "[" ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P3_Replace_Literal]^boolean first = false;^30^^^^^28^41^boolean first = true;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P15_Unwrap_Block]^first = false;^32^33^34^35^36^28^41^if  ( first )  { first = false; } else { sb.append ( "," ) ; }^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P16_Remove_Block]^^32^33^34^35^36^28^41^if  ( first )  { first = false; } else { sb.append ( "," ) ; }^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P3_Replace_Literal]^sb.append ( "" ) ;^35^^^^^28^41^sb.append ( "," ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P7_Replace_Invocation]^sb .append ( null )  ;^35^^^^^28^41^sb.append ( "," ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P14_Delete_Statement]^^35^^^^^28^41^sb.append ( "," ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( "]" ) ;sb.append ( "," ) ;^35^^^^^28^41^sb.append ( "," ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P3_Replace_Literal]^first = true;^33^^^^^28^41^first = false;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P14_Delete_Statement]^^31^32^33^34^35^28^41^for  ( Map.Entry<String, ?> entry : map.entrySet (  )  )  { if  ( first )  { first = false; } else { sb.append ( "," ) ; }^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P8_Replace_Mix]^sb.append ( entry .getValue (  )   ) ;^37^^^^^28^41^sb.append ( entry.getKey (  )  ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P14_Delete_Statement]^^37^^^^^28^41^sb.append ( entry.getKey (  )  ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( entry.getKey (  )  ) .append ( ":" ) ;sb.append ( entry.getKey (  )  ) ;^37^^^^^28^41^sb.append ( entry.getKey (  )  ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( clazz.getSimpleName (  )  ) ;sb.append ( entry.getKey (  )  ) ;^37^^^^^28^41^sb.append ( entry.getKey (  )  ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P3_Replace_Literal]^sb.append ( "" ) ;^39^^^^^28^41^sb.append ( "]" ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P14_Delete_Statement]^^39^^^^^28^41^sb.append ( "]" ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( "," ) ;sb.append ( "]" ) ;^39^^^^^28^41^sb.append ( "]" ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P7_Replace_Invocation]^return sb.append (  ) ;^40^^^^^28^41^return sb.toString (  ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P14_Delete_Statement]^^40^^^^^28^41^return sb.toString (  ) ;^[CLASS] Util  [METHOD] toStringMapKeys [RETURN_TYPE] String   String, ?> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P3_Replace_Literal]^StringBuilder sb = new StringBuilder ( "" ) ;^44^^^^^43^58^StringBuilder sb = new StringBuilder ( "[" ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P3_Replace_Literal]^boolean first = false;^45^^^^^43^58^boolean first = true;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P15_Unwrap_Block]^first = false;^47^48^49^50^51^43^58^if  ( first )  { first = false; } else { sb.append ( "," ) ; }^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P16_Remove_Block]^^47^48^49^50^51^43^58^if  ( first )  { first = false; } else { sb.append ( "," ) ; }^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P3_Replace_Literal]^sb.append ( "" ) ;^50^^^^^43^58^sb.append ( "," ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P7_Replace_Invocation]^sb .append ( this )  ;^50^^^^^43^58^sb.append ( "," ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P14_Delete_Statement]^^50^^^^^43^58^sb.append ( "," ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( "]" ) ;sb.append ( "," ) ;^50^^^^^43^58^sb.append ( "," ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P3_Replace_Literal]^first = true;^48^^^^^43^58^first = false;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P7_Replace_Invocation]^Class<?> clazz =  ( Class<?> )  entry .getKey (  )  ;^53^^^^^43^58^Class<?> clazz =  ( Class<?> )  entry.getValue (  ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P8_Replace_Mix]^Class<?> clazz =  ( Class<?> )  2.getValue (  ) ;^53^^^^^43^58^Class<?> clazz =  ( Class<?> )  entry.getValue (  ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P14_Delete_Statement]^^46^47^48^49^50^43^58^for  ( Map.Entry<String, ?> entry : map.entrySet (  )  )  { if  ( first )  { first = false; } else { sb.append ( "," ) ; }^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P7_Replace_Invocation]^sb.append ( entry .getValue (  )   ) .append ( ":" ) ;^52^^^^^43^58^sb.append ( entry.getKey (  )  ) .append ( ":" ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P14_Delete_Statement]^^52^^^^^43^58^sb.append ( entry.getKey (  )  ) .append ( ":" ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( entry.getKey (  )  ) .append ( ":" ) .append ( entry.getValue (  )  ) ;sb.append ( entry.getKey (  )  ) .append ( ":" ) ;^52^^^^^43^58^sb.append ( entry.getKey (  )  ) .append ( ":" ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( entry.getKey (  )  ) ;sb.append ( entry.getKey (  )  ) .append ( ":" ) ;^52^^^^^43^58^sb.append ( entry.getKey (  )  ) .append ( ":" ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P5_Replace_Variable]^sb.append ( 3.getKey (  )  ) .append ( ":" ) ;^52^^^^^43^58^sb.append ( entry.getKey (  )  ) .append ( ":" ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P14_Delete_Statement]^^52^53^^^^43^58^sb.append ( entry.getKey (  )  ) .append ( ":" ) ; Class<?> clazz =  ( Class<?> )  entry.getValue (  ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P14_Delete_Statement]^^53^54^^^^43^58^Class<?> clazz =  ( Class<?> )  entry.getValue (  ) ; sb.append ( clazz.getSimpleName (  )  ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P14_Delete_Statement]^^54^^^^^43^58^sb.append ( clazz.getSimpleName (  )  ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( entry.getKey (  )  ) ;sb.append ( clazz.getSimpleName (  )  ) ;^54^^^^^43^58^sb.append ( clazz.getSimpleName (  )  ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P3_Replace_Literal]^sb.append ( "" ) ;^56^^^^^43^58^sb.append ( "]" ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P14_Delete_Statement]^^56^^^^^43^58^sb.append ( "]" ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( "," ) ;sb.append ( "]" ) ;^56^^^^^43^58^sb.append ( "]" ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P7_Replace_Invocation]^return sb.append (  ) ;^57^^^^^43^58^return sb.toString (  ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P14_Delete_Statement]^^57^^^^^43^58^return sb.toString (  ) ;^[CLASS] Util  [METHOD] toStringMapOfTypes [RETURN_TYPE] String   Type> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Class  clazz  Map  map  
[P3_Replace_Literal]^boolean first = false;^62^^^^^60^73^boolean first = true;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P15_Unwrap_Block]^first = false;^64^65^66^67^68^60^73^if  ( first )  { first = false; } else { sb.append ( "," ) ; }^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P16_Remove_Block]^^64^65^66^67^68^60^73^if  ( first )  { first = false; } else { sb.append ( "," ) ; }^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P14_Delete_Statement]^^67^^^^^60^73^sb.append ( "," ) ;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( "]" ) ;sb.append ( "," ) ;^67^^^^^60^73^sb.append ( "," ) ;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P3_Replace_Literal]^first = true;^65^^^^^60^73^first = false;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P14_Delete_Statement]^^63^64^65^66^67^60^73^for  ( Map.Entry<String, ?> entry : map.entrySet (  )  )  { if  ( first )  { first = false; } else { sb.append ( "," ) ; }^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P3_Replace_Literal]^sb.append ( "" ) ;^67^^^^^60^73^sb.append ( "," ) ;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P7_Replace_Invocation]^sb.append ( entry .getValue (  )   ) .append ( ":" ) .append ( entry.getValue (  )  ) ;^69^^^^^60^73^sb.append ( entry.getKey (  )  ) .append ( ":" ) .append ( entry.getValue (  )  ) ;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P14_Delete_Statement]^^69^^^^^60^73^sb.append ( entry.getKey (  )  ) .append ( ":" ) .append ( entry.getValue (  )  ) ;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( entry.getKey (  )  ) .append ( ":" ) ;sb.append ( entry.getKey (  )  ) .append ( ":" ) .append ( entry.getValue (  )  ) ;^69^^^^^60^73^sb.append ( entry.getKey (  )  ) .append ( ":" ) .append ( entry.getValue (  )  ) ;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P3_Replace_Literal]^sb.append ( "" ) ;^71^^^^^60^73^sb.append ( "]" ) ;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P14_Delete_Statement]^^71^^^^^60^73^sb.append ( "]" ) ;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P11_Insert_Donor_Statement]^sb.append ( "," ) ;sb.append ( "]" ) ;^71^^^^^60^73^sb.append ( "]" ) ;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P7_Replace_Invocation]^return sb.append (  ) ;^72^^^^^60^73^return sb.toString (  ) ;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  
[P14_Delete_Statement]^^72^^^^^60^73^return sb.toString (  ) ;^[CLASS] Util  [METHOD] toStringMap [RETURN_TYPE] String   Object> map [VARIABLES] Entry  entry  boolean  first  StringBuilder  sb  Map  map  