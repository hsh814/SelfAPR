[buglab_swap_variables]^isAllType = alternate || isAllType.isAllType (  ) ;^92^^^^^77^107^isAllType = isAllType || alternate.isAllType (  ) ;^[CLASS] UnionTypeBuilder  [METHOD] addAlternate [RETURN_TYPE] UnionTypeBuilder   JSType alternate [VARIABLES] UnionType  union  JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Iterator  it  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  
[buglab_swap_variables]^isNativeUnknownType = isAlternateUnknown || isNativeUnknownType;^95^^^^^80^110^isNativeUnknownType = isNativeUnknownType || isAlternateUnknown;^[CLASS] UnionTypeBuilder  [METHOD] addAlternate [RETURN_TYPE] UnionTypeBuilder   JSType alternate [VARIABLES] UnionType  union  JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Iterator  it  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  
[buglab_swap_variables]^areAllUnknownsChecked = alternate && areAllUnknownsChecked.isCheckedUnknownType (  ) ;^97^98^^^^82^112^areAllUnknownsChecked = areAllUnknownsChecked && alternate.isCheckedUnknownType (  ) ;^[CLASS] UnionTypeBuilder  [METHOD] addAlternate [RETURN_TYPE] UnionTypeBuilder   JSType alternate [VARIABLES] UnionType  union  JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Iterator  it  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  
[buglab_swap_variables]^if  ( current.isSubtype ( alternate )  )  {^112^^^^^97^127^if  ( alternate.isSubtype ( current )  )  {^[CLASS] UnionTypeBuilder  [METHOD] addAlternate [RETURN_TYPE] UnionTypeBuilder   JSType alternate [VARIABLES] UnionType  union  JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Iterator  it  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  
[buglab_swap_variables]^} else if  ( alternate.isSubtype ( current )  )  {^115^^^^^100^130^} else if  ( current.isSubtype ( alternate )  )  {^[CLASS] UnionTypeBuilder  [METHOD] addAlternate [RETURN_TYPE] UnionTypeBuilder   JSType alternate [VARIABLES] UnionType  union  JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Iterator  it  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  
[buglab_swap_variables]^if  ( current.isSubtype ( alternate )  )  {^112^^^^^101^124^if  ( alternate.isSubtype ( current )  )  {^[CLASS] UnionTypeBuilder  [METHOD] addAlternate [RETURN_TYPE] UnionTypeBuilder   JSType alternate [VARIABLES] UnionType  union  JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Iterator  it  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  
[buglab_swap_variables]^} else if  ( alternate.isSubtype ( current )  )  {^115^^^^^101^124^} else if  ( current.isSubtype ( alternate )  )  {^[CLASS] UnionTypeBuilder  [METHOD] addAlternate [RETURN_TYPE] UnionTypeBuilder   JSType alternate [VARIABLES] UnionType  union  JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Iterator  it  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  
[buglab_swap_variables]^if  ( MAX_UNION_SIZE > size )  {^149^^^^^140^160^if  ( size > MAX_UNION_SIZE )  {^[CLASS] UnionTypeBuilder  [METHOD] build [RETURN_TYPE] JSType   [VARIABLES] JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Set  alternateSet  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  size  
[buglab_swap_variables]^result = new UnionType ( alternateSet, registry ) ;^153^^^^^140^160^result = new UnionType ( registry, alternateSet ) ;^[CLASS] UnionTypeBuilder  [METHOD] build [RETURN_TYPE] JSType   [VARIABLES] JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Set  alternateSet  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  size  
[buglab_swap_variables]^result = new UnionType ( registry ) ;^153^^^^^140^160^result = new UnionType ( registry, alternateSet ) ;^[CLASS] UnionTypeBuilder  [METHOD] build [RETURN_TYPE] JSType   [VARIABLES] JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Set  alternateSet  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  size  
[buglab_swap_variables]^result = new UnionType (  alternateSet ) ;^153^^^^^140^160^result = new UnionType ( registry, alternateSet ) ;^[CLASS] UnionTypeBuilder  [METHOD] build [RETURN_TYPE] JSType   [VARIABLES] JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Set  alternateSet  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  size  
[buglab_swap_variables]^if  ( MAX_UNION_SIZE > size )  {^149^^^^^136^163^if  ( size > MAX_UNION_SIZE )  {^[CLASS] UnionTypeBuilder  [METHOD] build [RETURN_TYPE] JSType   [VARIABLES] JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Set  alternateSet  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  size  
[buglab_swap_variables]^result = new UnionType ( alternateSet, registry ) ;^153^^^^^149^159^result = new UnionType ( registry, alternateSet ) ;^[CLASS] UnionTypeBuilder  [METHOD] build [RETURN_TYPE] JSType   [VARIABLES] JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Set  alternateSet  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  size  
[buglab_swap_variables]^result = new UnionType ( registry ) ;^153^^^^^149^159^result = new UnionType ( registry, alternateSet ) ;^[CLASS] UnionTypeBuilder  [METHOD] build [RETURN_TYPE] JSType   [VARIABLES] JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Set  alternateSet  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  size  
[buglab_swap_variables]^result = new UnionType (  alternateSet ) ;^153^^^^^149^159^result = new UnionType ( registry, alternateSet ) ;^[CLASS] UnionTypeBuilder  [METHOD] build [RETURN_TYPE] JSType   [VARIABLES] JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Set  alternateSet  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  size  
[buglab_swap_variables]^result = new UnionType ( alternateSet, registry ) ;^153^^^^^136^163^result = new UnionType ( registry, alternateSet ) ;^[CLASS] UnionTypeBuilder  [METHOD] build [RETURN_TYPE] JSType   [VARIABLES] JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Set  alternateSet  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  size  
[buglab_swap_variables]^result = new UnionType ( registry ) ;^153^^^^^136^163^result = new UnionType ( registry, alternateSet ) ;^[CLASS] UnionTypeBuilder  [METHOD] build [RETURN_TYPE] JSType   [VARIABLES] JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Set  alternateSet  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  size  
[buglab_swap_variables]^result = new UnionType (  alternateSet ) ;^153^^^^^136^163^result = new UnionType ( registry, alternateSet ) ;^[CLASS] UnionTypeBuilder  [METHOD] build [RETURN_TYPE] JSType   [VARIABLES] JSTypeRegistry  registry  boolean  areAllUnknownsChecked  isAllType  isAlternateUnknown  isNativeUnknownType  JSType  alternate  current  result  unionAlt  Set  alternateSet  List  alternates  long  serialVersionUID  int  MAX_UNION_SIZE  size  