[buglab_swap_variables]^this ( new DefaultKeyedValue ( value, key )  ) ;^80^^^^^79^81^this ( new DefaultKeyedValue ( key, value )  ) ;^[CLASS] DefaultKeyedValueDataset  [METHOD] <init> [RETURN_TYPE] Number)   Comparable key Number value [VARIABLES] Comparable  key  boolean  Number  value  KeyedValue  data  long  serialVersionUID  
[buglab_swap_variables]^this ( new DefaultKeyedValue (  value )  ) ;^80^^^^^79^81^this ( new DefaultKeyedValue ( key, value )  ) ;^[CLASS] DefaultKeyedValueDataset  [METHOD] <init> [RETURN_TYPE] Number)   Comparable key Number value [VARIABLES] Comparable  key  boolean  Number  value  KeyedValue  data  long  serialVersionUID  
[buglab_swap_variables]^this ( new DefaultKeyedValue ( key )  ) ;^80^^^^^79^81^this ( new DefaultKeyedValue ( key, value )  ) ;^[CLASS] DefaultKeyedValueDataset  [METHOD] <init> [RETURN_TYPE] Number)   Comparable key Number value [VARIABLES] Comparable  key  boolean  Number  value  KeyedValue  data  long  serialVersionUID  
[buglab_swap_variables]^setValue ( value.getKey (  ) , this.data ) ;^129^^^^^125^130^setValue ( this.data.getKey (  ) , value ) ;^[CLASS] DefaultKeyedValueDataset  [METHOD] updateValue [RETURN_TYPE] void   Number value [VARIABLES] boolean  Number  value  KeyedValue  data  long  serialVersionUID  
[buglab_swap_variables]^setValue ( this.data.getKey (  )  ) ;^129^^^^^125^130^setValue ( this.data.getKey (  ) , value ) ;^[CLASS] DefaultKeyedValueDataset  [METHOD] updateValue [RETURN_TYPE] void   Number value [VARIABLES] boolean  Number  value  KeyedValue  data  long  serialVersionUID  
[buglab_swap_variables]^this.data = new DefaultKeyedValue ( value, key ) ;^140^^^^^139^142^this.data = new DefaultKeyedValue ( key, value ) ;^[CLASS] DefaultKeyedValueDataset  [METHOD] setValue [RETURN_TYPE] void   Comparable key Number value [VARIABLES] Comparable  key  boolean  Number  value  KeyedValue  data  long  serialVersionUID  
[buglab_swap_variables]^this.data = new DefaultKeyedValue (  value ) ;^140^^^^^139^142^this.data = new DefaultKeyedValue ( key, value ) ;^[CLASS] DefaultKeyedValueDataset  [METHOD] setValue [RETURN_TYPE] void   Comparable key Number value [VARIABLES] Comparable  key  boolean  Number  value  KeyedValue  data  long  serialVersionUID  
[buglab_swap_variables]^this.data = new DefaultKeyedValue ( key ) ;^140^^^^^139^142^this.data = new DefaultKeyedValue ( key, value ) ;^[CLASS] DefaultKeyedValueDataset  [METHOD] setValue [RETURN_TYPE] void   Comparable key Number value [VARIABLES] Comparable  key  boolean  Number  value  KeyedValue  data  long  serialVersionUID  
[buglab_swap_variables]^if  ( !ObjectUtilities.equal ( that.getKey (  ) , this.data.getKey (  )  )  )  {^166^^^^^151^173^if  ( !ObjectUtilities.equal ( this.data.getKey (  ) , that.getKey (  )  )  )  {^[CLASS] DefaultKeyedValueDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  KeyedValueDataset  that  KeyedValue  data  long  serialVersionUID  
[buglab_swap_variables]^if  ( !ObjectUtilities.equal ( this.data.getKey (  ) .getKey (  )  )  )  {^166^^^^^151^173^if  ( !ObjectUtilities.equal ( this.data.getKey (  ) , that.getKey (  )  )  )  {^[CLASS] DefaultKeyedValueDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  KeyedValueDataset  that  KeyedValue  data  long  serialVersionUID  
[buglab_swap_variables]^if  ( !ObjectUtilities.equal ( that.getValue (  ) , this.data.getValue (  )  )  )  {^169^^^^^151^173^if  ( !ObjectUtilities.equal ( this.data.getValue (  ) , that.getValue (  )  )  )  {^[CLASS] DefaultKeyedValueDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  KeyedValueDataset  that  KeyedValue  data  long  serialVersionUID  
[buglab_swap_variables]^if  ( !ObjectUtilities.equal ( this.data.getValue (  ) .getValue (  )  )  )  {^169^^^^^151^173^if  ( !ObjectUtilities.equal ( this.data.getValue (  ) , that.getValue (  )  )  )  {^[CLASS] DefaultKeyedValueDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  KeyedValueDataset  that  KeyedValue  data  long  serialVersionUID  