[buglab_swap_variables]^} else if  ( actual instanceof long[] && wanted instanceof long[] )  {^34^^^^^18^42^} else if  ( wanted instanceof long[] && actual instanceof long[] )  {^[CLASS] ArrayEquals  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] boolean  Object  actual  wanted  
[buglab_swap_variables]^} else if  ( actual instanceof Object[] && wanted instanceof Object[] )  {^38^^^^^18^42^} else if  ( wanted instanceof Object[] && actual instanceof Object[] )  {^[CLASS] ArrayEquals  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] boolean  Object  actual  wanted  
[buglab_swap_variables]^} else if  ( actual instanceof short[] && wanted instanceof short[] )  {^36^^^^^18^42^} else if  ( wanted instanceof short[] && actual instanceof short[] )  {^[CLASS] ArrayEquals  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] boolean  Object  actual  wanted  
[buglab_swap_variables]^} else if  ( actual instanceof float[] && wanted instanceof float[] )  {^30^^^^^18^42^} else if  ( wanted instanceof float[] && actual instanceof float[] )  {^[CLASS] ArrayEquals  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] boolean  Object  actual  wanted  
[buglab_swap_variables]^} else if  ( actual instanceof int[] && wanted instanceof int[] )  {^32^^^^^18^42^} else if  ( wanted instanceof int[] && actual instanceof int[] )  {^[CLASS] ArrayEquals  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] boolean  Object  actual  wanted  
[buglab_swap_variables]^} else if  ( actual instanceof char[] && wanted instanceof char[] )  {^26^^^^^18^42^} else if  ( wanted instanceof char[] && actual instanceof char[] )  {^[CLASS] ArrayEquals  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] boolean  Object  actual  wanted  
[buglab_swap_variables]^} else if  ( actual instanceof double[] && wanted instanceof double[] )  {^28^^^^^18^42^} else if  ( wanted instanceof double[] && actual instanceof double[] )  {^[CLASS] ArrayEquals  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] boolean  Object  actual  wanted  
[buglab_swap_variables]^if  ( array.length != i - 1 )  {^56^^^^^52^61^if  ( i != array.length - 1 )  {^[CLASS] ArrayEquals  [METHOD] appendArray [RETURN_TYPE] void   Object[] array Description description [VARIABLES] Description  description  boolean  Object[]  array  int  i  
[buglab_swap_variables]^if  ( array != i.length - 1 )  {^56^^^^^52^61^if  ( i != array.length - 1 )  {^[CLASS] ArrayEquals  [METHOD] appendArray [RETURN_TYPE] void   Object[] array Description description [VARIABLES] Description  description  boolean  Object[]  array  int  i  
[buglab_swap_variables]^for  ( arraynt i = 0; i < i.length; i++ )  {^54^^^^^52^61^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] ArrayEquals  [METHOD] appendArray [RETURN_TYPE] void   Object[] array Description description [VARIABLES] Description  description  boolean  Object[]  array  int  i  
[buglab_swap_variables]^new Equals ( description[i] ) .describeTo ( array ) ;^55^^^^^52^61^new Equals ( array[i] ) .describeTo ( description ) ;^[CLASS] ArrayEquals  [METHOD] appendArray [RETURN_TYPE] void   Object[] array Description description [VARIABLES] Description  description  boolean  Object[]  array  int  i  
[buglab_swap_variables]^for  ( arraynt i = 0; i < Array.getLength ( i ) ; i++ )  {^68^^^^^63^72^for  ( int i = 0; i < Array.getLength ( array ) ; i++ )  {^[CLASS] ArrayEquals  [METHOD] createObjectArray [RETURN_TYPE] Object[]   Object array [VARIABLES] boolean  Object  array  Object[]  result  int  i  
[buglab_swap_variables]^result[i] = Array.get ( array ) ;^69^^^^^63^72^result[i] = Array.get ( array, i ) ;^[CLASS] ArrayEquals  [METHOD] createObjectArray [RETURN_TYPE] Object[]   Object array [VARIABLES] boolean  Object  array  Object[]  result  int  i  
[buglab_swap_variables]^result[i] = Array.get ( i, array ) ;^69^^^^^63^72^result[i] = Array.get ( array, i ) ;^[CLASS] ArrayEquals  [METHOD] createObjectArray [RETURN_TYPE] Object[]   Object array [VARIABLES] boolean  Object  array  Object[]  result  int  i  
[buglab_swap_variables]^result[i] = Array.get (  i ) ;^69^^^^^63^72^result[i] = Array.get ( array, i ) ;^[CLASS] ArrayEquals  [METHOD] createObjectArray [RETURN_TYPE] Object[]   Object array [VARIABLES] boolean  Object  array  Object[]  result  int  i  