[P1_Replace_Type]^private static final  int  serialVersionUID = 1L;^16^^^^^11^21^private static final long serialVersionUID = 1L;^[CLASS] RootNameLookup   [VARIABLES] 
[P8_Replace_Mix]^private static final long serialVersionUID = 1;^16^^^^^11^21^private static final long serialVersionUID = 1L;^[CLASS] RootNameLookup   [VARIABLES] 
[P5_Replace_Variable]^return findRootName ( rootType.getRawClass (  )  ) ;^28^^^^^26^29^return findRootName ( rootType.getRawClass (  ) , config ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   JavaType rootType MapperConfig<?> config [VARIABLES] MapperConfig  config  JavaType  rootType  boolean  LRUMap  _rootNames  long  serialVersionUID  
[P5_Replace_Variable]^return findRootName ( config.getRawClass (  ) , rootType ) ;^28^^^^^26^29^return findRootName ( rootType.getRawClass (  ) , config ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   JavaType rootType MapperConfig<?> config [VARIABLES] MapperConfig  config  JavaType  rootType  boolean  LRUMap  _rootNames  long  serialVersionUID  
[P14_Delete_Statement]^^28^^^^^26^29^return findRootName ( rootType.getRawClass (  ) , config ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   JavaType rootType MapperConfig<?> config [VARIABLES] MapperConfig  config  JavaType  rootType  boolean  LRUMap  _rootNames  long  serialVersionUID  
[P5_Replace_Variable]^ClassKey key = new ClassKey ( null ) ;^33^^^^^32^58^ClassKey key = new ClassKey ( rootType ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P2_Replace_Operator]^if  ( _rootNames != null )  {^35^^^^^32^58^if  ( _rootNames == null )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P6_Replace_Expression]^if  ( name != null )  {^35^^^^^32^58^if  ( _rootNames == null )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^if  ( _rootNames == true )  {^35^^^^^32^58^if  ( _rootNames == null )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P2_Replace_Operator]^if  ( name == null )  {^39^^^^^35^42^if  ( name != null )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^if  ( name != this )  {^39^^^^^35^42^if  ( name != null )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P9_Replace_Statement]^if  ( _rootNames == null )  {^39^^^^^35^42^if  ( name != null )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P15_Unwrap_Block]^return name;^39^40^41^^^35^42^if  ( name != null )  { return name; }^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P16_Remove_Block]^^39^40^41^^^35^42^if  ( name != null )  { return name; }^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^SerializedString name = key.get ( _rootNames ) ;^38^^^^^35^42^SerializedString name = _rootNames.get ( key ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P11_Insert_Donor_Statement]^SerializedString name = new SerializedString ( nameStr ) ;SerializedString name = _rootNames.get ( key ) ;^38^^^^^35^42^SerializedString name = _rootNames.get ( key ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P7_Replace_Invocation]^SerializedString name = _rootNames .put ( key , name )  ;^38^^^^^35^42^SerializedString name = _rootNames.get ( key ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P14_Delete_Statement]^^38^^^^^35^42^SerializedString name = _rootNames.get ( key ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P3_Replace_Literal]^_rootNames = new LRUMap<ClassKey,SerializedString> ( 24, 240 ) ;^36^^^^^32^58^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20, 200 ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P3_Replace_Literal]^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20, 197 ) ;^36^^^^^32^58^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20, 200 ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^_rootNames = new LRUMap<ClassKey,SerializedString> ( 14, 140 ) ;^36^^^^^32^58^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20, 200 ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P3_Replace_Literal]^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20,  ) ;^36^^^^^32^58^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20, 200 ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P2_Replace_Operator]^if  ( name == null )  {^39^^^^^32^58^if  ( name != null )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^if  ( name != this )  {^39^^^^^32^58^if  ( name != null )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P9_Replace_Statement]^if  ( _rootNames == null )  {^39^^^^^32^58^if  ( name != null )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P15_Unwrap_Block]^return name;^39^40^41^^^32^58^if  ( name != null )  { return name; }^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P16_Remove_Block]^^39^40^41^^^32^58^if  ( name != null )  { return name; }^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P3_Replace_Literal]^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20, 192 ) ;^36^^^^^32^58^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20, 200 ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20L, 20L0 ) ;^36^^^^^32^58^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20, 200 ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P3_Replace_Literal]^_rootNames = new LRUMap<ClassKey,SerializedString> ( , 0 ) ;^36^^^^^32^58^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20, 200 ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P3_Replace_Literal]^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20, 203 ) ;^36^^^^^32^58^_rootNames = new LRUMap<ClassKey,SerializedString> ( 20, 200 ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^SerializedString name = key.get ( _rootNames ) ;^38^^^^^32^58^SerializedString name = _rootNames.get ( key ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^SerializedString name = _rootNames .put ( key , name )  ;^38^^^^^32^58^SerializedString name = _rootNames.get ( key ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P11_Insert_Donor_Statement]^SerializedString name = new SerializedString ( nameStr ) ;SerializedString name = _rootNames.get ( key ) ;^38^^^^^32^58^SerializedString name = _rootNames.get ( key ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P14_Delete_Statement]^^38^^^^^32^58^SerializedString name = _rootNames.get ( key ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^BeanDescription beanDesc = 4.introspectClassAnnotations ( rootType ) ;^43^^^^^32^58^BeanDescription beanDesc = config.introspectClassAnnotations ( rootType ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^BeanDescription beanDesc = rootType.introspectClassAnnotations ( config ) ;^43^^^^^32^58^BeanDescription beanDesc = config.introspectClassAnnotations ( rootType ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P7_Replace_Invocation]^BeanDescription beanDesc = config .getAnnotationIntrospector (  )  ;^43^^^^^32^58^BeanDescription beanDesc = config.introspectClassAnnotations ( rootType ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P14_Delete_Statement]^^43^^^^^32^58^BeanDescription beanDesc = config.introspectClassAnnotations ( rootType ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P7_Replace_Invocation]^AnnotationIntrospector intr = config.introspectClassAnnotations (  ) ;^44^^^^^32^58^AnnotationIntrospector intr = config.getAnnotationIntrospector (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^AnnotationIntrospector intr = 3.getAnnotationIntrospector (  ) ;^44^^^^^32^58^AnnotationIntrospector intr = config.getAnnotationIntrospector (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^AnnotationIntrospector intr = null.getAnnotationIntrospector (  ) ;^44^^^^^32^58^AnnotationIntrospector intr = config.getAnnotationIntrospector (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P14_Delete_Statement]^^44^^^^^32^58^AnnotationIntrospector intr = config.getAnnotationIntrospector (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P14_Delete_Statement]^^45^^^^^32^58^AnnotatedClass ac = beanDesc.getClassInfo (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^PropertyName pname = ac.findRootName ( intr ) ;^46^^^^^32^58^PropertyName pname = intr.findRootName ( ac ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P7_Replace_Invocation]^PropertyName pname = intr .findRootName ( ac )  ;^46^^^^^32^58^PropertyName pname = intr.findRootName ( ac ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P14_Delete_Statement]^^46^47^^^^32^58^PropertyName pname = intr.findRootName ( ac ) ; String nameStr;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P1_Replace_Type]^char nameStr;^47^^^^^32^58^String nameStr;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P2_Replace_Operator]^if  ( pname == null && !pname.hasSimpleName (  )  )  {^49^^^^^32^58^if  ( pname == null || !pname.hasSimpleName (  )  )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P2_Replace_Operator]^if  ( pname != null || !pname.hasSimpleName (  )  )  {^49^^^^^32^58^if  ( pname == null || !pname.hasSimpleName (  )  )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P6_Replace_Expression]^if  ( pname == null ) {^49^^^^^32^58^if  ( pname == null || !pname.hasSimpleName (  )  )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P6_Replace_Expression]^if  (  !pname.hasSimpleName (  )  )  {^49^^^^^32^58^if  ( pname == null || !pname.hasSimpleName (  )  )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P7_Replace_Invocation]^if  ( pname == null || !pname .getSimpleName (  )   )  {^49^^^^^32^58^if  ( pname == null || !pname.hasSimpleName (  )  )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^if  ( pname == false ) {^49^^^^^32^58^if  ( pname == null || !pname.hasSimpleName (  )  )  {^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P15_Unwrap_Block]^nameStr = rootType.getSimpleName();^49^50^51^52^53^32^58^if  ( pname == null || !pname.hasSimpleName (  )  )  {  nameStr = rootType.getSimpleName (  ) ; } else { nameStr = pname.getSimpleName (  ) ; }^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P16_Remove_Block]^^49^50^51^52^53^32^58^if  ( pname == null || !pname.hasSimpleName (  )  )  {  nameStr = rootType.getSimpleName (  ) ; } else { nameStr = pname.getSimpleName (  ) ; }^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^nameStr =  null.getSimpleName (  ) ;^53^^^^^49^54^nameStr = pname.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P11_Insert_Donor_Statement]^nameStr = rootType.getSimpleName (  ) ;nameStr = pname.getSimpleName (  ) ;^53^^^^^49^54^nameStr = pname.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P12_Insert_Condition]^if  ( pname == null || !pname.hasSimpleName (  )  )  { nameStr = pname.getSimpleName (  ) ; }^53^^^^^49^54^nameStr = pname.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P14_Delete_Statement]^^53^^^^^49^54^nameStr = pname.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^nameStr = null.getSimpleName (  ) ;^51^^^^^32^58^nameStr = rootType.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^nameStr =  3.getSimpleName (  ) ;^51^^^^^32^58^nameStr = rootType.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P11_Insert_Donor_Statement]^nameStr = pname.getSimpleName (  ) ;nameStr = rootType.getSimpleName (  ) ;^51^^^^^32^58^nameStr = rootType.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^nameStr = 0.getSimpleName (  ) ;^51^^^^^32^58^nameStr = rootType.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P14_Delete_Statement]^^51^^^^^32^58^nameStr = rootType.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^nameStr = 4.getSimpleName (  ) ;^51^^^^^32^58^nameStr = rootType.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^nameStr =  null.getSimpleName (  ) ;^53^^^^^32^58^nameStr = pname.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P11_Insert_Donor_Statement]^nameStr = rootType.getSimpleName (  ) ;nameStr = pname.getSimpleName (  ) ;^53^^^^^32^58^nameStr = pname.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P12_Insert_Condition]^if  ( pname == null || !pname.hasSimpleName (  )  )  { nameStr = pname.getSimpleName (  ) ; }^53^^^^^32^58^nameStr = pname.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P14_Delete_Statement]^^53^^^^^32^58^nameStr = pname.getSimpleName (  ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P11_Insert_Donor_Statement]^SerializedString name = _rootNames.get ( key ) ;SerializedString name = new SerializedString ( nameStr ) ;^55^^^^^32^58^SerializedString name = new SerializedString ( nameStr ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^_rootNames.put (  name ) ;^56^^^^^32^58^_rootNames.put ( key, name ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^_rootNames.put ( key ) ;^56^^^^^32^58^_rootNames.put ( key, name ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P5_Replace_Variable]^_rootNames.put ( name, key ) ;^56^^^^^32^58^_rootNames.put ( key, name ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P8_Replace_Mix]^_rootNames .get ( key )  ;^56^^^^^32^58^_rootNames.put ( key, name ) ;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
[P14_Delete_Statement]^^56^57^^^^32^58^_rootNames.put ( key, name ) ; return name;^[CLASS] RootNameLookup  [METHOD] findRootName [RETURN_TYPE] SerializedString   Class<?> rootType MapperConfig<?> config [VARIABLES] SerializedString  name  PropertyName  pname  boolean  AnnotatedClass  ac  LRUMap  _rootNames  BeanDescription  beanDesc  ClassKey  key  AnnotationIntrospector  intr  MapperConfig  config  Class  rootType  String  nameStr  long  serialVersionUID  
