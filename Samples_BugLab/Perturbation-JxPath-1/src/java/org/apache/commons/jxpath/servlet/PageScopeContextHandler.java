[buglab_swap_variables]^return  ( String[] )  STRING_ARRAY.toArray ( list ) ;^41^^^^^35^42^return  ( String[] )  list.toArray ( STRING_ARRAY ) ;^[CLASS] PageScopeContextHandler  [METHOD] getPropertyNames [RETURN_TYPE] String[]   Object pageScope [VARIABLES] ArrayList  list  Object  pageScope  String[]  STRING_ARRAY  Enumeration  e  boolean  
[buglab_swap_variables]^(  ( PageScopeContext )  pageScope ) .setAttribute (  value ) ;^49^^^^^48^50^(  ( PageScopeContext )  pageScope ) .setAttribute ( property, value ) ;^[CLASS] PageScopeContextHandler  [METHOD] setProperty [RETURN_TYPE] void   Object pageScope String property Object value [VARIABLES] Object  pageScope  value  String[]  STRING_ARRAY  String  property  boolean  
[buglab_swap_variables]^(  ( PageScopeContext )  pageScope ) .setAttribute ( property ) ;^49^^^^^48^50^(  ( PageScopeContext )  pageScope ) .setAttribute ( property, value ) ;^[CLASS] PageScopeContextHandler  [METHOD] setProperty [RETURN_TYPE] void   Object pageScope String property Object value [VARIABLES] Object  pageScope  value  String[]  STRING_ARRAY  String  property  boolean  