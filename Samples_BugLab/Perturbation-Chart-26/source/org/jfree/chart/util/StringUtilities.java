[buglab_swap_variables]^if  ( start.length (  )  < base.length (  )  )  {^67^^^^^66^71^if  ( base.length (  )  < start.length (  )  )  {^[CLASS] StringUtilities  [METHOD] startsWithIgnoreCase [RETURN_TYPE] boolean   String base String start [VARIABLES] boolean  String  base  start  
[buglab_swap_variables]^return start.regionMatches ( true, 0, base, 0, start.length (  )  ) ;^70^^^^^66^71^return base.regionMatches ( true, 0, start, 0, start.length (  )  ) ;^[CLASS] StringUtilities  [METHOD] startsWithIgnoreCase [RETURN_TYPE] boolean   String base String start [VARIABLES] boolean  String  base  start  
[buglab_swap_variables]^return base.regionMatches ( true, 0,  0, start.length (  )  ) ;^70^^^^^66^71^return base.regionMatches ( true, 0, start, 0, start.length (  )  ) ;^[CLASS] StringUtilities  [METHOD] startsWithIgnoreCase [RETURN_TYPE] boolean   String base String start [VARIABLES] boolean  String  base  start  
[buglab_swap_variables]^if  ( end.length (  )  < base.length (  )  )  {^83^^^^^82^88^if  ( base.length (  )  < end.length (  )  )  {^[CLASS] StringUtilities  [METHOD] endsWithIgnoreCase [RETURN_TYPE] boolean   String base String end [VARIABLES] boolean  String  base  end  
[buglab_swap_variables]^return end.regionMatches ( true, base.length (  )  - base.length (  ) , end, 0, end.length (  )  ) ;^86^87^^^^82^88^return base.regionMatches ( true, base.length (  )  - end.length (  ) , end, 0, end.length (  )  ) ;^[CLASS] StringUtilities  [METHOD] endsWithIgnoreCase [RETURN_TYPE] boolean   String base String end [VARIABLES] boolean  String  base  end  
[buglab_swap_variables]^return base.regionMatches ( true.length (  )  - end.length (  ) , end, 0, end.length (  )  ) ;^86^87^^^^82^88^return base.regionMatches ( true, base.length (  )  - end.length (  ) , end, 0, end.length (  )  ) ;^[CLASS] StringUtilities  [METHOD] endsWithIgnoreCase [RETURN_TYPE] boolean   String base String end [VARIABLES] boolean  String  base  end  
[buglab_swap_variables]^return base.regionMatches ( true, base.length (  )  - end.length (  ) ,  0, end.length (  )  ) ;^86^87^^^^82^88^return base.regionMatches ( true, base.length (  )  - end.length (  ) , end, 0, end.length (  )  ) ;^[CLASS] StringUtilities  [METHOD] endsWithIgnoreCase [RETURN_TYPE] boolean   String base String end [VARIABLES] boolean  String  base  end  