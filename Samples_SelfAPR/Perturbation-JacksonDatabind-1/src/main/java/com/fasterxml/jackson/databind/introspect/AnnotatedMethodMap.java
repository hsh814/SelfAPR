[P8_Replace_Mix]^private LinkedHashMap<MemberKey,AnnotatedMethod> _methods;^14^^^^^9^19^protected LinkedHashMap<MemberKey,AnnotatedMethod> _methods;^[CLASS] AnnotatedMethodMap   [VARIABLES] 
[P2_Replace_Operator]^if  ( _methods != null )  {^23^^^^^21^27^if  ( _methods == null )  {^[CLASS] AnnotatedMethodMap  [METHOD] add [RETURN_TYPE] void   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P8_Replace_Mix]^if  ( _methods == false )  {^23^^^^^21^27^if  ( _methods == null )  {^[CLASS] AnnotatedMethodMap  [METHOD] add [RETURN_TYPE] void   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P15_Unwrap_Block]^_methods = new java.util.LinkedHashMap<com.fasterxml.jackson.databind.introspect.MemberKey, com.fasterxml.jackson.databind.introspect.AnnotatedMethod>();^23^24^25^^^21^27^if  ( _methods == null )  { _methods = new LinkedHashMap<MemberKey,AnnotatedMethod> (  ) ; }^[CLASS] AnnotatedMethodMap  [METHOD] add [RETURN_TYPE] void   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P16_Remove_Block]^^23^24^25^^^21^27^if  ( _methods == null )  { _methods = new LinkedHashMap<MemberKey,AnnotatedMethod> (  ) ; }^[CLASS] AnnotatedMethodMap  [METHOD] add [RETURN_TYPE] void   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P8_Replace_Mix]^_methods ;^24^^^^^21^27^_methods = new LinkedHashMap<MemberKey,AnnotatedMethod> (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] add [RETURN_TYPE] void   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P13_Insert_Block]^if  (  ( _methods )  == null )  {     _methods = new MemberKey, AnnotatedMethod> (  ) ; }^24^^^^^21^27^[Delete]^[CLASS] AnnotatedMethodMap  [METHOD] add [RETURN_TYPE] void   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P8_Replace_Mix]^_methods  = null ;^24^^^^^21^27^_methods = new LinkedHashMap<MemberKey,AnnotatedMethod> (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] add [RETURN_TYPE] void   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P5_Replace_Variable]^_methods.put ( new MemberKey ( am.getAnnotated (  )  )  ) ;^26^^^^^21^27^_methods.put ( new MemberKey ( am.getAnnotated (  )  ) , am ) ;^[CLASS] AnnotatedMethodMap  [METHOD] add [RETURN_TYPE] void   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P14_Delete_Statement]^^26^^^^^21^27^_methods.put ( new MemberKey ( am.getAnnotated (  )  ) , am ) ;^[CLASS] AnnotatedMethodMap  [METHOD] add [RETURN_TYPE] void   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P11_Insert_Donor_Statement]^return remove ( am.getAnnotated (  )  ) ;_methods.put ( new MemberKey ( am.getAnnotated (  )  ) , am ) ;^26^^^^^21^27^_methods.put ( new MemberKey ( am.getAnnotated (  )  ) , am ) ;^[CLASS] AnnotatedMethodMap  [METHOD] add [RETURN_TYPE] void   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P7_Replace_Invocation]^return add ( am.getAnnotated (  )  ) ;^35^^^^^33^36^return remove ( am.getAnnotated (  )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P14_Delete_Statement]^^35^^^^^33^36^return remove ( am.getAnnotated (  )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   AnnotatedMethod am [VARIABLES] AnnotatedMethod  am  LinkedHashMap  _methods  boolean  
[P2_Replace_Operator]^if  ( _methods == null )  {^40^^^^^38^44^if  ( _methods != null )  {^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P8_Replace_Mix]^if  ( _methods != true )  {^40^^^^^38^44^if  ( _methods != null )  {^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P15_Unwrap_Block]^return _methods.remove(new com.fasterxml.jackson.databind.introspect.MemberKey(m));^40^41^42^^^38^44^if  ( _methods != null )  { return _methods.remove ( new MemberKey ( m )  ) ; }^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P16_Remove_Block]^^40^41^42^^^38^44^if  ( _methods != null )  { return _methods.remove ( new MemberKey ( m )  ) ; }^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P13_Insert_Block]^if  (  ( _methods )  != null )  {     return _methods.values (  ) .iterator (  ) ; }^40^^^^^38^44^[Delete]^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P4_Replace_Constructor]^return _methods.remove ( return _methods.remove (  new MemberKey ( name, paramTypes )   ) ;^41^^^^^38^44^return _methods.remove ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P5_Replace_Variable]^return null.remove ( new MemberKey ( m )  ) ;^41^^^^^38^44^return _methods.remove ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P5_Replace_Variable]^return m.remove ( new MemberKey ( _methods )  ) ;^41^^^^^38^44^return _methods.remove ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P7_Replace_Invocation]^return _methods.get ( new MemberKey ( m )  ) ;^41^^^^^38^44^return _methods.remove ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P8_Replace_Mix]^return _methods.get (  new MemberKey ( name, paramTypes )   ) ;^41^^^^^38^44^return _methods.remove ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P13_Insert_Block]^if  (  ( _methods )  != null )  {     return _methods.remove ( new MemberKey ( m )  ) ; }^41^^^^^38^44^[Delete]^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P14_Delete_Statement]^^41^^^^^38^44^return _methods.remove ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P8_Replace_Mix]^return _methods .remove ( 1 )  ;^41^^^^^38^44^return _methods.remove ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P8_Replace_Mix]^return _methods .remove ( m )  ;^41^^^^^38^44^return _methods.remove ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P8_Replace_Mix]^return false;^43^^^^^38^44^return null;^[CLASS] AnnotatedMethodMap  [METHOD] remove [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P2_Replace_Operator]^return  ( _methods == null && _methods.size (  )  == 0 ) ;^47^^^^^46^48^return  ( _methods == null || _methods.size (  )  == 0 ) ;^[CLASS] AnnotatedMethodMap  [METHOD] isEmpty [RETURN_TYPE] boolean   [VARIABLES] LinkedHashMap  _methods  boolean  
[P2_Replace_Operator]^return  ( _methods != null || _methods.size (  )  == 0 ) ;^47^^^^^46^48^return  ( _methods == null || _methods.size (  )  == 0 ) ;^[CLASS] AnnotatedMethodMap  [METHOD] isEmpty [RETURN_TYPE] boolean   [VARIABLES] LinkedHashMap  _methods  boolean  
[P2_Replace_Operator]^return  ( _methods == null || _methods.size (  )  != 0 ) ;^47^^^^^46^48^return  ( _methods == null || _methods.size (  )  == 0 ) ;^[CLASS] AnnotatedMethodMap  [METHOD] isEmpty [RETURN_TYPE] boolean   [VARIABLES] LinkedHashMap  _methods  boolean  
[P3_Replace_Literal]^return  ( _methods == null || _methods.size (  )  == -5 ) ;^47^^^^^46^48^return  ( _methods == null || _methods.size (  )  == 0 ) ;^[CLASS] AnnotatedMethodMap  [METHOD] isEmpty [RETURN_TYPE] boolean   [VARIABLES] LinkedHashMap  _methods  boolean  
[P3_Replace_Literal]^return  ( _methods == null || _methods.size() - 7  == 0 ) ;^47^^^^^46^48^return  ( _methods == null || _methods.size (  )  == 0 ) ;^[CLASS] AnnotatedMethodMap  [METHOD] isEmpty [RETURN_TYPE] boolean   [VARIABLES] LinkedHashMap  _methods  boolean  
[P7_Replace_Invocation]^return  ( _methods == null || _methods.values (  )  == 0 ) ;^47^^^^^46^48^return  ( _methods == null || _methods.size (  )  == 0 ) ;^[CLASS] AnnotatedMethodMap  [METHOD] isEmpty [RETURN_TYPE] boolean   [VARIABLES] LinkedHashMap  _methods  boolean  
[P7_Replace_Invocation]^return  ( _methods == null || _methods .remove ( 2 )   == 0 ) ;^47^^^^^46^48^return  ( _methods == null || _methods.size (  )  == 0 ) ;^[CLASS] AnnotatedMethodMap  [METHOD] isEmpty [RETURN_TYPE] boolean   [VARIABLES] LinkedHashMap  _methods  boolean  
[P3_Replace_Literal]^return  ( _methods == null || _methods.size() - 4  == 0 ) ;^47^^^^^46^48^return  ( _methods == null || _methods.size (  )  == 0 ) ;^[CLASS] AnnotatedMethodMap  [METHOD] isEmpty [RETURN_TYPE] boolean   [VARIABLES] LinkedHashMap  _methods  boolean  
[P14_Delete_Statement]^^47^^^^^46^48^return  ( _methods == null || _methods.size (  )  == 0 ) ;^[CLASS] AnnotatedMethodMap  [METHOD] isEmpty [RETURN_TYPE] boolean   [VARIABLES] LinkedHashMap  _methods  boolean  
[P2_Replace_Operator]^return  ( _methods != null )  ? 0 : _methods.size (  ) ;^51^^^^^50^52^return  ( _methods == null )  ? 0 : _methods.size (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] size [RETURN_TYPE] int   [VARIABLES] LinkedHashMap  _methods  boolean  
[P3_Replace_Literal]^return  ( _methods == null )  ? 4 : _methods.size (  ) ;^51^^^^^50^52^return  ( _methods == null )  ? 0 : _methods.size (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] size [RETURN_TYPE] int   [VARIABLES] LinkedHashMap  _methods  boolean  
[P3_Replace_Literal]^return  ( _methods == null )  ? 0 : _methods.size() + 2 ;^51^^^^^50^52^return  ( _methods == null )  ? 0 : _methods.size (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] size [RETURN_TYPE] int   [VARIABLES] LinkedHashMap  _methods  boolean  
[P6_Replace_Expression]^return  ( _methods.size (  ) ;^51^^^^^50^52^return  ( _methods == null )  ? 0 : _methods.size (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] size [RETURN_TYPE] int   [VARIABLES] LinkedHashMap  _methods  boolean  
[P7_Replace_Invocation]^return  ( _methods == null )  ? 0 : _methods.values (  ) ;^51^^^^^50^52^return  ( _methods == null )  ? 0 : _methods.size (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] size [RETURN_TYPE] int   [VARIABLES] LinkedHashMap  _methods  boolean  
[P3_Replace_Literal]^return  ( _methods == null )  ? 0 : _methods.size() + 1 ;^51^^^^^50^52^return  ( _methods == null )  ? 0 : _methods.size (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] size [RETURN_TYPE] int   [VARIABLES] LinkedHashMap  _methods  boolean  
[P14_Delete_Statement]^^51^^^^^50^52^return  ( _methods == null )  ? 0 : _methods.size (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] size [RETURN_TYPE] int   [VARIABLES] LinkedHashMap  _methods  boolean  
[P2_Replace_Operator]^if  ( _methods != null )  {^56^^^^^54^60^if  ( _methods == null )  {^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P8_Replace_Mix]^if  ( _methods == false )  {^56^^^^^54^60^if  ( _methods == null )  {^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P15_Unwrap_Block]^return null;^56^57^58^^^54^60^if  ( _methods == null )  { return null; }^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P16_Remove_Block]^^56^57^58^^^54^60^if  ( _methods == null )  { return null; }^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P13_Insert_Block]^if  (  ( _methods )  != null )  {     return _methods.values (  ) .iterator (  ) ; }^56^^^^^54^60^[Delete]^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P8_Replace_Mix]^return false;^57^^^^^54^60^return null;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P8_Replace_Mix]^return this;^57^^^^^54^60^return null;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P4_Replace_Constructor]^return _methods.get ( return _methods.get (  new MemberKey ( m )   ) ;^59^^^^^54^60^return _methods.get ( new MemberKey ( name, paramTypes )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P4_Replace_Constructor]^return _methods.get ( new MemberKey (  paramTypes )  ) ;^59^^^^^54^60^return _methods.get ( new MemberKey ( name, paramTypes )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P4_Replace_Constructor]^return _methods.get ( new MemberKey ( name )  ) ;^59^^^^^54^60^return _methods.get ( new MemberKey ( name, paramTypes )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P5_Replace_Variable]^return name.get ( new MemberKey ( _methods, paramTypes )  ) ;^59^^^^^54^60^return _methods.get ( new MemberKey ( name, paramTypes )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P5_Replace_Variable]^return _methods.get ( new MemberKey ( paramTypes, name )  ) ;^59^^^^^54^60^return _methods.get ( new MemberKey ( name, paramTypes )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P8_Replace_Mix]^return _methods.get (  new MemberKey ( m )   ) ;^59^^^^^54^60^return _methods.get ( new MemberKey ( name, paramTypes )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P14_Delete_Statement]^^59^^^^^54^60^return _methods.get ( new MemberKey ( name, paramTypes )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   String name Class<?>[] paramTypes [VARIABLES] String  name  Class[]  paramTypes  boolean  LinkedHashMap  _methods  
[P2_Replace_Operator]^if  ( _methods != null )  {^64^^^^^62^68^if  ( _methods == null )  {^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P8_Replace_Mix]^if  ( _methods == this )  {^64^^^^^62^68^if  ( _methods == null )  {^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P15_Unwrap_Block]^return null;^64^65^66^^^62^68^if  ( _methods == null )  { return null; }^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P16_Remove_Block]^^64^65^66^^^62^68^if  ( _methods == null )  { return null; }^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P13_Insert_Block]^if  (  ( _methods )  != null )  {     return _methods.values (  ) .iterator (  ) ; }^64^^^^^62^68^[Delete]^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P8_Replace_Mix]^return this;^65^^^^^62^68^return null;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P4_Replace_Constructor]^return _methods.get ( return _methods.get (  new MemberKey ( name, paramTypes )   ) ;^67^^^^^62^68^return _methods.get ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P5_Replace_Variable]^return m.get ( new MemberKey ( _methods )  ) ;^67^^^^^62^68^return _methods.get ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P7_Replace_Invocation]^return _methods.remove ( new MemberKey ( m )  ) ;^67^^^^^62^68^return _methods.get ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P14_Delete_Statement]^^67^^^^^62^68^return _methods.get ( new MemberKey ( m )  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] find [RETURN_TYPE] AnnotatedMethod   Method m [VARIABLES] LinkedHashMap  _methods  Method  m  boolean  
[P2_Replace_Operator]^if  ( _methods == null )  {^79^^^^^77^84^if  ( _methods != null )  {^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P8_Replace_Mix]^if  ( _methods != this )  {^79^^^^^77^84^if  ( _methods != null )  {^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P15_Unwrap_Block]^return _methods.values().iterator();^79^80^81^^^77^84^if  ( _methods != null )  { return _methods.values (  ) .iterator (  ) ; }^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P16_Remove_Block]^^79^80^81^^^77^84^if  ( _methods != null )  { return _methods.values (  ) .iterator (  ) ; }^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P13_Insert_Block]^if  (  ( _methods )  == null )  {     return null; }^79^^^^^77^84^[Delete]^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P13_Insert_Block]^if  (  ( _methods )  != null )  {     return _methods.remove ( new MemberKey ( m )  ) ; }^79^^^^^77^84^[Delete]^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P7_Replace_Invocation]^return _methods.values (  )  .iterator (  )  ;^80^^^^^77^84^return _methods.values (  ) .iterator (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P7_Replace_Invocation]^return _methods.size (  ) .iterator (  ) ;^80^^^^^77^84^return _methods.values (  ) .iterator (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P13_Insert_Block]^if  (  ( _methods )  != null )  {     return _methods.values (  ) .iterator (  ) ; }^80^^^^^77^84^[Delete]^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P14_Delete_Statement]^^80^^^^^77^84^return _methods.values (  ) .iterator (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P5_Replace_Variable]^return null.values (  ) .iterator (  ) ;^80^^^^^77^84^return _methods.values (  ) .iterator (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P14_Delete_Statement]^^82^83^^^^77^84^List<AnnotatedMethod> empty = Collections.emptyList (  ) ; return empty.iterator (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P7_Replace_Invocation]^return empty .iterator (  )  ;^83^^^^^77^84^return empty.iterator (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  
[P14_Delete_Statement]^^83^^^^^77^84^return empty.iterator (  ) ;^[CLASS] AnnotatedMethodMap  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] List  empty  LinkedHashMap  _methods  boolean  