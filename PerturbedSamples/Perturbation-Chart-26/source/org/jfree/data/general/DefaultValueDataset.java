[REPLACE]^private static final long serialVersionUID ;^66^^^^^^^[REPLACE] private static final long serialVersionUID = 8137521217249294891L;^ [CLASS] DefaultValueDataset  
[REPLACE]^this ( true ) ;^75^^^^^74^76^[REPLACE] this ( null ) ;^[METHOD] <init> [TYPE] DefaultValueDataset() [PARAMETER] [CLASS] DefaultValueDataset   [TYPE]  Number value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^this ( null ) ;^84^^^^^83^85^[REPLACE] this ( new Double ( value )  ) ;^[METHOD] <init> [TYPE] DefaultValueDataset(double) [PARAMETER] double value [CLASS] DefaultValueDataset   [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID  [TYPE]  double value 
[REPLACE]^this ( null ) ;^93^^^^^92^95^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] Number) [PARAMETER] Number value [CLASS] DefaultValueDataset   [TYPE]  Number value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^this.value =  null;^94^^^^^92^95^[REPLACE] this.value = value;^[METHOD] <init> [TYPE] Number) [PARAMETER] Number value [CLASS] DefaultValueDataset   [TYPE]  Number value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return false;^103^^^^^102^104^[REPLACE] return this.value;^[METHOD] getValue [TYPE] Number [PARAMETER] [CLASS] DefaultValueDataset   [TYPE]  Number value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^this.value =  null;^113^^^^^112^115^[REPLACE] this.value = value;^[METHOD] setValue [TYPE] void [PARAMETER] Number value [CLASS] DefaultValueDataset   [TYPE]  Number value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( obj  &&  this )  {^125^^^^^124^133^[REPLACE] if  ( obj == this )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] DefaultValueDataset   [TYPE]  Object obj  [TYPE]  ValueDataset vd  [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID 
[ADD]^return true;^125^126^127^^^124^133^[ADD] if  ( obj == this )  { return true; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] DefaultValueDataset   [TYPE]  Object obj  [TYPE]  ValueDataset vd  [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^126^^^^^124^133^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] DefaultValueDataset   [TYPE]  Object obj  [TYPE]  ValueDataset vd  [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ! obj instanceof ValueDataset )  {^128^^^^^124^133^[REPLACE] if  ( obj instanceof ValueDataset )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] DefaultValueDataset   [TYPE]  Object obj  [TYPE]  ValueDataset vd  [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID 
[REPLACE]^return  ( this.value != null ? this.value.hashCode (  )  : 0 ) ;^130^^^^^124^133^[REPLACE] return ObjectUtilities.equal ( this.value, vd.getValue (  )  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] DefaultValueDataset   [TYPE]  Object obj  [TYPE]  ValueDataset vd  [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID 
[ADD]^^129^130^^^^124^133^[ADD] ValueDataset vd =  ( ValueDataset )  obj; return ObjectUtilities.equal ( this.value, vd.getValue (  )  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] DefaultValueDataset   [TYPE]  Object obj  [TYPE]  ValueDataset vd  [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID 
[REPLACE]^return ObjectUtilities.equal ( this.value, vd .getValue (  )   ) ;^130^^^^^124^133^[REPLACE] return ObjectUtilities.equal ( this.value, vd.getValue (  )  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] DefaultValueDataset   [TYPE]  Object obj  [TYPE]  ValueDataset vd  [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^132^^^^^124^133^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] DefaultValueDataset   [TYPE]  Object obj  [TYPE]  ValueDataset vd  [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID 
[REPLACE]^return  ( this.value != null ? this.value .hashCode (  )   : 0 ) ;^141^^^^^140^142^[REPLACE] return  ( this.value != null ? this.value.hashCode (  )  : 0 ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] DefaultValueDataset   [TYPE]  Number value  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 