[P14_Delete_Statement]^^45^^^^^44^48^super ( parent ) ;^[CLASS] AbstractClassLoader 1  [METHOD] <init> [RETURN_TYPE] ClassFilter)   ClassLoader parent ClassLoader classPath ClassFilter filter [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  boolean  ClassFilter  filter  
[P8_Replace_Mix]^this.filter =  null;^46^^^^^44^48^this.filter = filter;^[CLASS] AbstractClassLoader 1  [METHOD] <init> [RETURN_TYPE] ClassFilter)   ClassLoader parent ClassLoader classPath ClassFilter filter [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  boolean  ClassFilter  filter  
[P5_Replace_Variable]^this.classPath = parent;^47^^^^^44^48^this.classPath = classPath;^[CLASS] AbstractClassLoader 1  [METHOD] <init> [RETURN_TYPE] ClassFilter)   ClassLoader parent ClassLoader classPath ClassFilter filter [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  boolean  ClassFilter  filter  
[P8_Replace_Mix]^this.classPath =  null;^47^^^^^44^48^this.classPath = classPath;^[CLASS] AbstractClassLoader 1  [METHOD] <init> [RETURN_TYPE] ClassFilter)   ClassLoader parent ClassLoader classPath ClassFilter filter [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  boolean  ClassFilter  filter  
[P7_Replace_Invocation]^return AbstractClassLoader.class.getClassLoader (  ) ;^39^^^^^38^40^return AbstractClassLoader.class.getProtectionDomain (  ) ;^[CLASS] AbstractClassLoader 1  [METHOD] run [RETURN_TYPE] Object   [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  boolean  ClassFilter  filter  
[P14_Delete_Statement]^^39^^^^^38^40^return AbstractClassLoader.class.getProtectionDomain (  ) ;^[CLASS] AbstractClassLoader 1  [METHOD] run [RETURN_TYPE] Object   [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  boolean  ClassFilter  filter  
[P7_Replace_Invocation]^Class loaded = loadClass ( name ) ;^52^^^^^37^67^Class loaded = findLoadedClass ( name ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^52^^^^^37^67^Class loaded = findLoadedClass ( name ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P11_Insert_Donor_Statement]^return super.loadClass ( name ) ;Class loaded = findLoadedClass ( name ) ;^52^^^^^37^67^Class loaded = findLoadedClass ( name ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P2_Replace_Operator]^if (  loaded == null  ) {^54^^^^^39^69^if (  loaded != null  ) {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^if (  c != null  ) {^54^^^^^39^69^if (  loaded != null  ) {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P6_Replace_Expression]^if ( loaded.getClassLoader() == this ) {^54^^^^^39^69^if (  loaded != null  ) {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P8_Replace_Mix]^if (  loaded != true  ) {^54^^^^^39^69^if (  loaded != null  ) {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P15_Unwrap_Block]^if ((loaded.getClassLoader()) == (this)) {    return loaded;};^54^55^56^57^^39^69^if (  loaded != null  ) { if (  loaded.getClassLoader (  )  == this  ) { return loaded; }^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P16_Remove_Block]^^54^55^56^57^^39^69^if (  loaded != null  ) { if (  loaded.getClassLoader (  )  == this  ) { return loaded; }^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P13_Insert_Block]^if  (  ( loaded.getClassLoader (  )  )  ==  ( this )  )  {     return loaded; }^54^^^^^39^69^[Delete]^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P2_Replace_Operator]^if (  loaded.getClassLoader (  )  != this  ) {^55^^^^^40^70^if (  loaded.getClassLoader (  )  == this  ) {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^if (  c.getClassLoader (  )  == this  ) {^55^^^^^40^70^if (  loaded.getClassLoader (  )  == this  ) {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P7_Replace_Invocation]^if (  loaded .getProtectionDomain (  )   == this  ) {^55^^^^^40^70^if (  loaded.getClassLoader (  )  == this  ) {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P15_Unwrap_Block]^return loaded;^55^56^57^^^40^70^if (  loaded.getClassLoader (  )  == this  ) { return loaded; }^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P16_Remove_Block]^^55^56^57^^^40^70^if (  loaded.getClassLoader (  )  == this  ) { return loaded; }^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P13_Insert_Block]^if  ( loaded != null )  {     if  (  ( loaded.getClassLoader (  )  )  ==  ( this )  )  {         return loaded;     } }^55^^^^^40^70^[Delete]^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^return c;^56^^^^^41^71^return loaded;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P2_Replace_Operator]^if (  loaded.getClassLoader (  )  > this  ) {^55^^^^^40^70^if (  loaded.getClassLoader (  )  == this  ) {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P8_Replace_Mix]^if ( !  loaded.getClassLoader (  )  == this  ) {^55^^^^^40^70^if (  loaded.getClassLoader (  )  == this  ) {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P8_Replace_Mix]^if  ( filter.accept ( name )  )  {^60^^^^^45^75^if  ( !filter.accept ( name )  )  {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P15_Unwrap_Block]^return super.loadClass(name);^60^61^62^^^45^75^if  ( !filter.accept ( name )  )  { return super.loadClass ( name ) ; }^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P16_Remove_Block]^^60^61^62^^^45^75^if  ( !filter.accept ( name )  )  { return super.loadClass ( name ) ; }^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P7_Replace_Invocation]^return super .getFlags (  )  ;^61^^^^^46^76^return super.loadClass ( name ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^61^^^^^46^76^return super.loadClass ( name ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P2_Replace_Operator]^if  ( is != null )  {^70^^^^^55^85^if  ( is == null )  {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P8_Replace_Mix]^if  ( is == false )  {^70^^^^^55^85^if  ( is == null )  {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P15_Unwrap_Block]^throw new java.lang.ClassNotFoundException(name);^70^71^72^^74^55^85^if  ( is == null )  {  throw new ClassNotFoundException  (" ")  ; }^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P16_Remove_Block]^^70^71^72^^74^55^85^if  ( is == null )  {  throw new ClassNotFoundException  (" ")  ; }^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P11_Insert_Donor_Statement]^throw new CodeGenerationException  (" ")  ;throw new ClassNotFoundException  (" ")  ;^72^^^^^57^87^throw new ClassNotFoundException  (" ")  ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P8_Replace_Mix]^if  ( is == true )  {^70^^^^^55^85^if  ( is == null )  {^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P8_Replace_Mix]^r =  new ClassReader ( null ) ;^77^^^^^62^92^r = new ClassReader ( is ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P2_Replace_Operator]^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )   instanceof   + ".class" ) ;^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^java.io.InputStream is = parent.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^java.io.InputStream is = name.getResourceAsStream ( classPath.replace ( '.','/' )  + ".class" ) ;^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P8_Replace_Mix]^java.io.InputStream is = parent .loadClass ( name )  ;^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P2_Replace_Operator]^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  <  + ".class" ) ;^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P3_Replace_Literal]^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + "class" ) ;^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^67^68^^^^52^82^name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^81^^^^^66^96^is.close (  ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P11_Insert_Donor_Statement]^postProcess ( c ) ;is.close (  ) ;^81^^^^^66^96^is.close (  ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P2_Replace_Operator]^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  &  + ".class" ) ;^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P3_Replace_Literal]^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".cclass" ) ;^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P11_Insert_Donor_Statement]^throw new CodeGenerationException  (" ")  ;throw new ClassNotFoundException  (" ")  ;^85^^^^^70^100^throw new ClassNotFoundException  (" ")  ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P2_Replace_Operator]^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  <<  + ".class" ) ;^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P3_Replace_Literal]^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".cla" ) ;^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P8_Replace_Mix]^java.io.InputStream is = classPath .loadClass ( name )  ;^66^67^68^^^51^81^java.io.InputStream is = classPath.getResourceAsStream ( name.replace ( '.','/' )  + ".class" ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^85^^^^^70^100^throw new ClassNotFoundException  (" ")  ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^return loaded;^94^^^^^79^109^return c;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P3_Replace_Literal]^Class c = super.defineClass ( name, b, 1, b.length, DOMAIN ) ;^92^^^^^77^107^Class c = super.defineClass ( name, b, 0, b.length, DOMAIN ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^Class c = super.defineClass (  b, 0, b.length, DOMAIN ) ;^92^^^^^77^107^Class c = super.defineClass ( name, b, 0, b.length, DOMAIN ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^Class c = super.defineClass ( name,  0, b.length, DOMAIN ) ;^92^^^^^77^107^Class c = super.defineClass ( name, b, 0, b.length, DOMAIN ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^Class c = super.defineClass ( name, b, 0,  DOMAIN ) ;^92^^^^^77^107^Class c = super.defineClass ( name, b, 0, b.length, DOMAIN ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^Class c = super.defineClass ( name, b, 0, b.length ) ;^92^^^^^77^107^Class c = super.defineClass ( name, b, 0, b.length, DOMAIN ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P7_Replace_Invocation]^Class c = super .findLoadedClass ( name )  ;^92^^^^^77^107^Class c = super.defineClass ( name, b, 0, b.length, DOMAIN ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^getGenerator ( w ) .generateClass ( r ) ;^90^^^^^75^105^getGenerator ( r ) .generateClass ( w ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P7_Replace_Invocation]^postProcess ( r ) .generateClass ( w ) ;^90^^^^^75^105^getGenerator ( r ) .generateClass ( w ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^90^^^^^75^105^getGenerator ( r ) .generateClass ( w ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^91^92^^^^76^106^byte[] b = w.toByteArray (  ) ; Class c = super.defineClass ( name, b, 0, b.length, DOMAIN ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^92^^^^^77^107^Class c = super.defineClass ( name, b, 0, b.length, DOMAIN ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P5_Replace_Variable]^postProcess ( loaded ) ;^93^^^^^78^108^postProcess ( c ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P7_Replace_Invocation]^loadClass ( c ) ;^93^^^^^78^108^postProcess ( c ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P8_Replace_Mix]^loadClass ( loaded ) ;^93^^^^^78^108^postProcess ( c ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^93^94^^^^78^108^postProcess ( c ) ; return c;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P11_Insert_Donor_Statement]^is.close (  ) ;postProcess ( c ) ;^93^^^^^78^108^postProcess ( c ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P3_Replace_Literal]^Class c = super.defineClass ( name, b, -1, b.length, DOMAIN ) ;^92^^^^^77^107^Class c = super.defineClass ( name, b, 0, b.length, DOMAIN ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P8_Replace_Mix]^throw new ClassNotFoundException  (" ")  ; ;^100^^^^^85^115^throw new CodeGenerationException  (" ")  ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P11_Insert_Donor_Statement]^throw new ClassNotFoundException  (" ")  ;throw new CodeGenerationException  (" ")  ;^100^^^^^85^115^throw new CodeGenerationException  (" ")  ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^90^91^^^^75^105^getGenerator ( r ) .generateClass ( w ) ; byte[] b = w.toByteArray (  ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^91^^^^^76^106^byte[] b = w.toByteArray (  ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P3_Replace_Literal]^Class c = super.defineClass ( name, b, , b.length, DOMAIN ) ;^92^^^^^77^107^Class c = super.defineClass ( name, b, 0, b.length, DOMAIN ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^92^93^^^^77^107^Class c = super.defineClass ( name, b, 0, b.length, DOMAIN ) ; postProcess ( c ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P14_Delete_Statement]^^93^^^^^78^108^postProcess ( c ) ;^[CLASS] AbstractClassLoader 1  [METHOD] loadClass [RETURN_TYPE] Class   String name [VARIABLES] ProtectionDomain  DOMAIN  InputStream  is  Error  e  String  name  IOException  e  ClassWriter  w  Exception  e  byte[]  b  RuntimeException  e  boolean  ClassFilter  filter  ClassLoader  classPath  parent  ClassReader  r  Class  c  loaded  
[P7_Replace_Invocation]^return new ClassReaderGenerator ( r, getFlags (  ) , getFlags (  )  ) ;^105^^^^^104^106^return new ClassReaderGenerator ( r, attributes (  ) , getFlags (  )  ) ;^[CLASS] AbstractClassLoader 1  [METHOD] getGenerator [RETURN_TYPE] ClassGenerator   ClassReader r [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  ClassReader  r  boolean  ClassFilter  filter  
[P7_Replace_Invocation]^return new ClassReaderGenerator ( r, attributes (  ) , attributes (  )  ) ;^105^^^^^104^106^return new ClassReaderGenerator ( r, attributes (  ) , getFlags (  )  ) ;^[CLASS] AbstractClassLoader 1  [METHOD] getGenerator [RETURN_TYPE] ClassGenerator   ClassReader r [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  ClassReader  r  boolean  ClassFilter  filter  
[P14_Delete_Statement]^^105^^^^^104^106^return new ClassReaderGenerator ( r, attributes (  ) , getFlags (  )  ) ;^[CLASS] AbstractClassLoader 1  [METHOD] getGenerator [RETURN_TYPE] ClassGenerator   ClassReader r [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  ClassReader  r  boolean  ClassFilter  filter  
[P3_Replace_Literal]^return 6;^109^^^^^108^110^return 0;^[CLASS] AbstractClassLoader 1  [METHOD] getFlags [RETURN_TYPE] int   [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  boolean  ClassFilter  filter  
[P8_Replace_Mix]^return 4;^109^^^^^108^110^return 0;^[CLASS] AbstractClassLoader 1  [METHOD] getFlags [RETURN_TYPE] int   [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  boolean  ClassFilter  filter  
[P8_Replace_Mix]^return false;^113^^^^^112^114^return null;^[CLASS] AbstractClassLoader 1  [METHOD] attributes [RETURN_TYPE] Attribute[]   [VARIABLES] ProtectionDomain  DOMAIN  ClassLoader  classPath  parent  boolean  ClassFilter  filter  
[P14_Delete_Statement]^^39^^^^^38^40^return AbstractClassLoader.class.getProtectionDomain (  ) ;^[CLASS] 1  [METHOD] run [RETURN_TYPE] Object   [VARIABLES] boolean  
