[buglab_swap_variables]^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * instant.getOffset ( new Date ( gwtTimeZone )  ) ;^42^^^^^41^43^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getOffset ( new Date ( instant )  ) ;^[CLASS] GwtTimeZone  [METHOD] getOffset [RETURN_TYPE] int   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  
[buglab_swap_variables]^return instant.getShortName ( new Date ( gwtTimeZone )  ) ;^46^^^^^45^47^return gwtTimeZone.getShortName ( new Date ( instant )  ) ;^[CLASS] GwtTimeZone  [METHOD] getNameKey [RETURN_TYPE] String   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  