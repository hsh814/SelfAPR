[buglab_swap_variables]^if  ( suffix.endsWith ( str )  )  {^46^^^^^31^61^if  ( str.endsWith ( suffix )  )  {^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^return suffix.substring ( 0, str.length (  )  - str.length (  )  ) ;^47^^^^^32^62^return str.substring ( 0, str.length (  )  - suffix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^return str.substring ( 0.length (  )  - suffix.length (  )  ) ;^47^^^^^32^62^return str.substring ( 0, str.length (  )  - suffix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^String str = prefix.substring ( transformed.length (  )  ) ;^45^^^^^30^60^String str = transformed.substring ( prefix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^public String transform ( String prefix )  { return name + name + suffix; }^41^^^^^26^56^public String transform ( String name )  { return prefix + name + suffix; }^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^public String transform ( String name )  { return suffix + name + prefix; }^41^^^^^26^56^public String transform ( String name )  { return prefix + name + suffix; }^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^if  ( prefix.startsWith ( transformed )  )  {^44^^^^^29^59^if  ( transformed.startsWith ( prefix )  )  {^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^if  ( prefix.startsWith ( transformed )  )  {^61^^^^^46^76^if  ( transformed.startsWith ( prefix )  )  {^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^return prefix.substring ( transformed.length (  )  ) ;^62^^^^^47^77^return transformed.substring ( prefix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^public String transform ( String suffix )  { return prefix + name + name; }^41^^^^^26^56^public String transform ( String name )  { return prefix + name + suffix; }^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^public String transform ( String prefix )  { return name + name; }^58^^^^^43^73^public String transform ( String name )  { return prefix + name; }^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^if  ( suffix.endsWith ( transformed )  )  {^76^^^^^61^91^if  ( transformed.endsWith ( suffix )  )  {^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^return suffix.substring ( 0, transformed.length (  )  - transformed.length (  )  ) ;^77^^^^^62^92^return transformed.substring ( 0, transformed.length (  )  - suffix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^return transformed.substring ( 0.length (  )  - suffix.length (  )  ) ;^77^^^^^62^92^return transformed.substring ( 0, transformed.length (  )  - suffix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^public String transform ( String suffix )  { return name + name; }^73^^^^^58^88^public String transform ( String name )  { return name + suffix; }^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] simpleTransformer [RETURN_TYPE] NameTransformer   String prefix String suffix [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  prefix  str  suffix  transformed  boolean  hasPrefix  hasSuffix  
[buglab_swap_variables]^public String transform ( String prefix )  { return name + name + suffix; }^41^^^^^36^46^public String transform ( String name )  { return prefix + name + suffix; }^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  boolean  
[buglab_swap_variables]^public String transform ( String name )  { return suffix + name + prefix; }^41^^^^^36^46^public String transform ( String name )  { return prefix + name + suffix; }^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  boolean  
[buglab_swap_variables]^if  ( prefix.startsWith ( transformed )  )  {^44^^^^^43^51^if  ( transformed.startsWith ( prefix )  )  {^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  str  transformed  boolean  
[buglab_swap_variables]^if  ( suffix.endsWith ( str )  )  {^46^^^^^43^51^if  ( str.endsWith ( suffix )  )  {^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  str  transformed  boolean  
[buglab_swap_variables]^return suffix.substring ( 0, str.length (  )  - str.length (  )  ) ;^47^^^^^43^51^return str.substring ( 0, str.length (  )  - suffix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  str  transformed  boolean  
[buglab_swap_variables]^return str.substring ( 0.length (  )  - suffix.length (  )  ) ;^47^^^^^43^51^return str.substring ( 0, str.length (  )  - suffix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  str  transformed  boolean  
[buglab_swap_variables]^String str = prefix.substring ( transformed.length (  )  ) ;^45^^^^^43^51^String str = transformed.substring ( prefix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  str  transformed  boolean  
[buglab_swap_variables]^public String transform ( String prefix )  { return name + name; }^58^^^^^53^63^public String transform ( String name )  { return prefix + name; }^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  boolean  
[buglab_swap_variables]^if  ( prefix.startsWith ( transformed )  )  {^61^^^^^60^65^if  ( transformed.startsWith ( prefix )  )  {^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  transformed  boolean  
[buglab_swap_variables]^return prefix.substring ( transformed.length (  )  ) ;^62^^^^^60^65^return transformed.substring ( prefix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  transformed  boolean  
[buglab_swap_variables]^public String transform ( String suffix )  { return name + name; }^73^^^^^68^78^public String transform ( String name )  { return name + suffix; }^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  boolean  
[buglab_swap_variables]^if  ( suffix.endsWith ( transformed )  )  {^76^^^^^75^80^if  ( transformed.endsWith ( suffix )  )  {^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  transformed  boolean  
[buglab_swap_variables]^return suffix.substring ( 0, transformed.length (  )  - transformed.length (  )  ) ;^77^^^^^75^80^return transformed.substring ( 0, transformed.length (  )  - suffix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  transformed  boolean  
[buglab_swap_variables]^return transformed.substring ( 0.length (  )  - suffix.length (  )  ) ;^77^^^^^75^80^return transformed.substring ( 0, transformed.length (  )  - suffix.length (  )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  transformed  boolean  
[buglab_swap_variables]^return new Chained ( t2, t1 ) ;^94^^^^^93^95^return new Chained ( t1, t2 ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] chainedTransformer [RETURN_TYPE] NameTransformer   NameTransformer t1 NameTransformer t2 [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  boolean  
[buglab_swap_variables]^return new Chained (  t2 ) ;^94^^^^^93^95^return new Chained ( t1, t2 ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] chainedTransformer [RETURN_TYPE] NameTransformer   NameTransformer t1 NameTransformer t2 [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  boolean  
[buglab_swap_variables]^return new Chained ( t1 ) ;^94^^^^^93^95^return new Chained ( t1, t2 ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] chainedTransformer [RETURN_TYPE] NameTransformer   NameTransformer t1 NameTransformer t2 [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  boolean  
[buglab_swap_variables]^return _t1.transform ( name.transform ( _t2 )  ) ;^120^^^^^119^121^return _t1.transform ( _t2.transform ( name )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  boolean  
[buglab_swap_variables]^return name.transform ( _t2.transform ( _t1 )  ) ;^120^^^^^119^121^return _t1.transform ( _t2.transform ( name )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  boolean  
[buglab_swap_variables]^return _t2.transform ( _t1.transform ( name )  ) ;^120^^^^^119^121^return _t1.transform ( _t2.transform ( name )  ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  name  boolean  
[buglab_swap_variables]^transformed = transformed.reverse ( _t1 ) ;^125^^^^^124^130^transformed = _t1.reverse ( transformed ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  transformed  boolean  
[buglab_swap_variables]^transformed = transformed.reverse ( _t2 ) ;^127^^^^^124^130^transformed = _t2.reverse ( transformed ) ;^[CLASS] NameTransformer 1 2 3 4 Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  NOP  _t1  _t2  t1  t2  String  transformed  boolean  
[buglab_swap_variables]^public String transform ( String name )  { return suffix + name + prefix; }^41^^^^^36^46^public String transform ( String name )  { return prefix + name + suffix; }^[CLASS] 2  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] boolean  String  name  
[buglab_swap_variables]^public String transform ( String suffix )  { return prefix + name + name; }^41^^^^^36^46^public String transform ( String name )  { return prefix + name + suffix; }^[CLASS] 2  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] boolean  String  name  
[buglab_swap_variables]^if  ( prefix.startsWith ( transformed )  )  {^44^^^^^43^51^if  ( transformed.startsWith ( prefix )  )  {^[CLASS] 2  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] boolean  String  str  transformed  
[buglab_swap_variables]^if  ( suffix.endsWith ( str )  )  {^46^^^^^43^51^if  ( str.endsWith ( suffix )  )  {^[CLASS] 2  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] boolean  String  str  transformed  
[buglab_swap_variables]^return suffix.substring ( 0, str.length (  )  - str.length (  )  ) ;^47^^^^^43^51^return str.substring ( 0, str.length (  )  - suffix.length (  )  ) ;^[CLASS] 2  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] boolean  String  str  transformed  
[buglab_swap_variables]^return str.substring ( 0.length (  )  - suffix.length (  )  ) ;^47^^^^^43^51^return str.substring ( 0, str.length (  )  - suffix.length (  )  ) ;^[CLASS] 2  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] boolean  String  str  transformed  
[buglab_swap_variables]^String str = prefix.substring ( transformed.length (  )  ) ;^45^^^^^43^51^String str = transformed.substring ( prefix.length (  )  ) ;^[CLASS] 2  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] boolean  String  str  transformed  
[buglab_swap_variables]^public String transform ( String prefix )  { return name + name; }^58^^^^^53^63^public String transform ( String name )  { return prefix + name; }^[CLASS] 3  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] boolean  String  name  
[buglab_swap_variables]^if  ( prefix.startsWith ( transformed )  )  {^61^^^^^60^65^if  ( transformed.startsWith ( prefix )  )  {^[CLASS] 3  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] boolean  String  transformed  
[buglab_swap_variables]^return prefix.substring ( transformed.length (  )  ) ;^62^^^^^60^65^return transformed.substring ( prefix.length (  )  ) ;^[CLASS] 3  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] boolean  String  transformed  
[buglab_swap_variables]^public String transform ( String suffix )  { return name + name; }^73^^^^^68^78^public String transform ( String name )  { return name + suffix; }^[CLASS] 4  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] boolean  String  name  
[buglab_swap_variables]^if  ( suffix.endsWith ( transformed )  )  {^76^^^^^75^80^if  ( transformed.endsWith ( suffix )  )  {^[CLASS] 4  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] boolean  String  transformed  
[buglab_swap_variables]^return suffix.substring ( 0, transformed.length (  )  - transformed.length (  )  ) ;^77^^^^^75^80^return transformed.substring ( 0, transformed.length (  )  - suffix.length (  )  ) ;^[CLASS] 4  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] boolean  String  transformed  
[buglab_swap_variables]^return transformed.substring ( 0.length (  )  - suffix.length (  )  ) ;^77^^^^^75^80^return transformed.substring ( 0, transformed.length (  )  - suffix.length (  )  ) ;^[CLASS] 4  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] boolean  String  transformed  
[buglab_swap_variables]^return _t1.transform ( name.transform ( _t2 )  ) ;^120^^^^^119^121^return _t1.transform ( _t2.transform ( name )  ) ;^[CLASS] Chained  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] NameTransformer  _t1  _t2  t1  t2  String  name  boolean  
[buglab_swap_variables]^return name.transform ( _t2.transform ( _t1 )  ) ;^120^^^^^119^121^return _t1.transform ( _t2.transform ( name )  ) ;^[CLASS] Chained  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] NameTransformer  _t1  _t2  t1  t2  String  name  boolean  
[buglab_swap_variables]^return _t2.transform ( _t1.transform ( name )  ) ;^120^^^^^119^121^return _t1.transform ( _t2.transform ( name )  ) ;^[CLASS] Chained  [METHOD] transform [RETURN_TYPE] String   String name [VARIABLES] NameTransformer  _t1  _t2  t1  t2  String  name  boolean  
[buglab_swap_variables]^transformed = transformed.reverse ( _t1 ) ;^125^^^^^124^130^transformed = _t1.reverse ( transformed ) ;^[CLASS] Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  _t1  _t2  t1  t2  String  transformed  boolean  
[buglab_swap_variables]^transformed = transformed.reverse ( _t2 ) ;^127^^^^^124^130^transformed = _t2.reverse ( transformed ) ;^[CLASS] Chained  [METHOD] reverse [RETURN_TYPE] String   String transformed [VARIABLES] NameTransformer  _t1  _t2  t1  t2  String  transformed  boolean  