[buglab_swap_variables]^return new LenientDateTimeField ( base, field ) ;^53^^^^^43^54^return new LenientDateTimeField ( field, base ) ;^[CLASS] LenientDateTimeField  [METHOD] getInstance [RETURN_TYPE] DateTimeField   DateTimeField field Chronology base [VARIABLES] Chronology  base  iBase  DateTimeField  field  boolean  long  serialVersionUID  
[buglab_swap_variables]^return new LenientDateTimeField (  base ) ;^53^^^^^43^54^return new LenientDateTimeField ( field, base ) ;^[CLASS] LenientDateTimeField  [METHOD] getInstance [RETURN_TYPE] DateTimeField   DateTimeField field Chronology base [VARIABLES] Chronology  base  iBase  DateTimeField  field  boolean  long  serialVersionUID  
[buglab_swap_variables]^return new LenientDateTimeField ( field ) ;^53^^^^^43^54^return new LenientDateTimeField ( field, base ) ;^[CLASS] LenientDateTimeField  [METHOD] getInstance [RETURN_TYPE] DateTimeField   DateTimeField field Chronology base [VARIABLES] Chronology  base  iBase  DateTimeField  field  boolean  long  serialVersionUID  
[buglab_swap_variables]^long localInstant = instant.getZone (  ) .convertUTCToLocal ( iBase ) ;^72^^^^^69^76^long localInstant = iBase.getZone (  ) .convertUTCToLocal ( instant ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  
[buglab_swap_variables]^long difference = FieldUtils.safeSubtract ( instant, get ( value )  ) ;^73^^^^^69^76^long difference = FieldUtils.safeSubtract ( value, get ( instant )  ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  
[buglab_swap_variables]^long difference = FieldUtils.safeSubtract (  get ( instant )  ) ;^73^^^^^69^76^long difference = FieldUtils.safeSubtract ( value, get ( instant )  ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  
[buglab_swap_variables]^localInstant = getType (  ) .getField ( iBase.withUTC (  )  ) .add ( difference, localInstant ) ;^74^^^^^69^76^localInstant = getType (  ) .getField ( iBase.withUTC (  )  ) .add ( localInstant, difference ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  
[buglab_swap_variables]^localInstant = getType (  ) .getField ( iBase.withUTC (  )  ) .add (  difference ) ;^74^^^^^69^76^localInstant = getType (  ) .getField ( iBase.withUTC (  )  ) .add ( localInstant, difference ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  
[buglab_swap_variables]^localInstant = getType (  ) .getField ( iBase.withUTC (  )  ) .add ( localInstant ) ;^74^^^^^69^76^localInstant = getType (  ) .getField ( iBase.withUTC (  )  ) .add ( localInstant, difference ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  
[buglab_swap_variables]^localInstant = getType (  ) .getField ( localInstant.withUTC (  )  ) .add ( iBase, difference ) ;^74^^^^^69^76^localInstant = getType (  ) .getField ( iBase.withUTC (  )  ) .add ( localInstant, difference ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  
[buglab_swap_variables]^localInstant = getType (  ) .getField ( difference.withUTC (  )  ) .add ( localInstant, iBase ) ;^74^^^^^69^76^localInstant = getType (  ) .getField ( iBase.withUTC (  )  ) .add ( localInstant, difference ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  
[buglab_swap_variables]^return iBase.getZone (  ) .convertLocalToUTC ( instant, false, localInstant ) ;^75^^^^^69^76^return iBase.getZone (  ) .convertLocalToUTC ( localInstant, false, instant ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  
[buglab_swap_variables]^return iBase.getZone (  ) .convertLocalToUTC (  false, instant ) ;^75^^^^^69^76^return iBase.getZone (  ) .convertLocalToUTC ( localInstant, false, instant ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  
[buglab_swap_variables]^return iBase.getZone (  ) .convertLocalToUTC ( localInstant, false ) ;^75^^^^^69^76^return iBase.getZone (  ) .convertLocalToUTC ( localInstant, false, instant ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  
[buglab_swap_variables]^return localInstant.getZone (  ) .convertLocalToUTC ( iBase, false, instant ) ;^75^^^^^69^76^return iBase.getZone (  ) .convertLocalToUTC ( localInstant, false, instant ) ;^[CLASS] LenientDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] Chronology  base  iBase  boolean  long  difference  instant  localInstant  serialVersionUID  int  value  