[buglab_swap_variables]^new TransformingClassGenerator ( new ClassReaderGenerator ( getClassReader ( t ) , attributes (  ) , getFlags (  )  ) , file ) .generateClass ( w ) ;^89^90^91^^^77^101^new TransformingClassGenerator ( new ClassReaderGenerator ( getClassReader ( file ) , attributes (  ) , getFlags (  )  ) , t ) .generateClass ( w ) ;^[CLASS] AbstractTransformTask  [METHOD] processClassFile [RETURN_TYPE] void   File file [VARIABLES] boolean  verbose  FileOutputStream  fos  ClassReader  reader  ClassTransformer  t  String[]  name  File  file  int  CLASS_MAGIC  ZIP_MAGIC  ClassWriter  w  
[buglab_swap_variables]^new TransformingClassGenerator ( new ClassReaderGenerator ( getClassReader ( file ) , attributes (  ) , getFlags (  )  )  ) .generateClass ( w ) ;^89^90^91^^^77^101^new TransformingClassGenerator ( new ClassReaderGenerator ( getClassReader ( file ) , attributes (  ) , getFlags (  )  ) , t ) .generateClass ( w ) ;^[CLASS] AbstractTransformTask  [METHOD] processClassFile [RETURN_TYPE] void   File file [VARIABLES] boolean  verbose  FileOutputStream  fos  ClassReader  reader  ClassTransformer  t  String[]  name  File  file  int  CLASS_MAGIC  ZIP_MAGIC  ClassWriter  w  
[buglab_swap_variables]^new TransformingClassGenerator ( new ClassReaderGenerator ( getClassReader ( w ) , attributes (  ) , getFlags (  )  ) , t ) .generateClass ( file ) ;^89^90^91^^^77^101^new TransformingClassGenerator ( new ClassReaderGenerator ( getClassReader ( file ) , attributes (  ) , getFlags (  )  ) , t ) .generateClass ( w ) ;^[CLASS] AbstractTransformTask  [METHOD] processClassFile [RETURN_TYPE] void   File file [VARIABLES] boolean  verbose  FileOutputStream  fos  ClassReader  reader  ClassTransformer  t  String[]  name  File  file  int  CLASS_MAGIC  ZIP_MAGIC  ClassWriter  w  
[buglab_swap_variables]^new TransformingClassGenerator ( new ClassReaderGenerator ( getClassReader ( file ) , attributes (  ) , getFlags (  )  ) , w ) .generateClass ( t ) ;^89^90^91^^^77^101^new TransformingClassGenerator ( new ClassReaderGenerator ( getClassReader ( file ) , attributes (  ) , getFlags (  )  ) , t ) .generateClass ( w ) ;^[CLASS] AbstractTransformTask  [METHOD] processClassFile [RETURN_TYPE] void   File file [VARIABLES] boolean  verbose  FileOutputStream  fos  ClassReader  reader  ClassTransformer  t  String[]  name  File  file  int  CLASS_MAGIC  ZIP_MAGIC  ClassWriter  w  
[buglab_swap_variables]^return checkMagic ( CLASS_MAGIC, file ) ;^120^^^^^118^122^return checkMagic ( file, CLASS_MAGIC ) ;^[CLASS] AbstractTransformTask  [METHOD] isClassFile [RETURN_TYPE] boolean   File file [VARIABLES] File  file  int  CLASS_MAGIC  ZIP_MAGIC  boolean  verbose  
[buglab_swap_variables]^return checkMagic (  CLASS_MAGIC ) ;^120^^^^^118^122^return checkMagic ( file, CLASS_MAGIC ) ;^[CLASS] AbstractTransformTask  [METHOD] isClassFile [RETURN_TYPE] boolean   File file [VARIABLES] File  file  int  CLASS_MAGIC  ZIP_MAGIC  boolean  verbose  
[buglab_swap_variables]^return checkMagic ( file ) ;^120^^^^^118^122^return checkMagic ( file, CLASS_MAGIC ) ;^[CLASS] AbstractTransformTask  [METHOD] isClassFile [RETURN_TYPE] boolean   File file [VARIABLES] File  file  int  CLASS_MAGIC  ZIP_MAGIC  boolean  verbose  
[buglab_swap_variables]^while  (  ( zip = entry.getNextEntry (  )  )  != null )  {^141^^^^^126^156^while  (  ( entry = zip.getNextEntry (  )  )  != null )  {^[CLASS] AbstractTransformTask  [METHOD] processJarFile [RETURN_TYPE] void   File file [VARIABLES] byte[]  bytes  ZipInputStream  zip  boolean  verbose  CRC32  crc  ZipOutputStream  out  FileOutputStream  fout  ZipEntry  entry  outEntry  DataInputStream  din  File  file  newFile  tempFile  int  CLASS_MAGIC  ZIP_MAGIC  
[buglab_swap_variables]^if  ( CLASS_MAGIC.readInt (  )  == din )  {^152^^^^^137^167^if  ( din.readInt (  )  == CLASS_MAGIC )  {^[CLASS] AbstractTransformTask  [METHOD] processJarFile [RETURN_TYPE] void   File file [VARIABLES] byte[]  bytes  ZipInputStream  zip  boolean  verbose  CRC32  crc  ZipOutputStream  out  FileOutputStream  fout  ZipEntry  entry  outEntry  DataInputStream  din  File  file  newFile  tempFile  int  CLASS_MAGIC  ZIP_MAGIC  
[buglab_swap_variables]^outEntry.setCompressedSize ( bytes.length.length ) ;^173^^^^^158^188^outEntry.setCompressedSize ( bytes.length ) ;^[CLASS] AbstractTransformTask  [METHOD] processJarFile [RETURN_TYPE] void   File file [VARIABLES] byte[]  bytes  ZipInputStream  zip  boolean  verbose  CRC32  crc  ZipOutputStream  out  FileOutputStream  fout  ZipEntry  entry  outEntry  DataInputStream  din  File  file  newFile  tempFile  int  CLASS_MAGIC  ZIP_MAGIC  
[buglab_swap_variables]^outEntry.setCompressedSize ( bytes ) ;^173^^^^^158^188^outEntry.setCompressedSize ( bytes.length ) ;^[CLASS] AbstractTransformTask  [METHOD] processJarFile [RETURN_TYPE] void   File file [VARIABLES] byte[]  bytes  ZipInputStream  zip  boolean  verbose  CRC32  crc  ZipOutputStream  out  FileOutputStream  fout  ZipEntry  entry  outEntry  DataInputStream  din  File  file  newFile  tempFile  int  CLASS_MAGIC  ZIP_MAGIC  
[buglab_swap_variables]^outEntry.setSize ( bytes.length.length ) ;^166^^^^^151^181^outEntry.setSize ( bytes.length ) ;^[CLASS] AbstractTransformTask  [METHOD] processJarFile [RETURN_TYPE] void   File file [VARIABLES] byte[]  bytes  ZipInputStream  zip  boolean  verbose  CRC32  crc  ZipOutputStream  out  FileOutputStream  fout  ZipEntry  entry  outEntry  DataInputStream  din  File  file  newFile  tempFile  int  CLASS_MAGIC  ZIP_MAGIC  
[buglab_swap_variables]^outEntry.setSize ( bytes ) ;^166^^^^^151^181^outEntry.setSize ( bytes.length ) ;^[CLASS] AbstractTransformTask  [METHOD] processJarFile [RETURN_TYPE] void   File file [VARIABLES] byte[]  bytes  ZipInputStream  zip  boolean  verbose  CRC32  crc  ZipOutputStream  out  FileOutputStream  fout  ZipEntry  entry  outEntry  DataInputStream  din  File  file  newFile  tempFile  int  CLASS_MAGIC  ZIP_MAGIC  
[buglab_swap_variables]^out.putNextEntry ( outEntryEntry ) ;^175^^^^^160^190^out.putNextEntry ( outEntry ) ;^[CLASS] AbstractTransformTask  [METHOD] processJarFile [RETURN_TYPE] void   File file [VARIABLES] byte[]  bytes  ZipInputStream  zip  boolean  verbose  CRC32  crc  ZipOutputStream  out  FileOutputStream  fout  ZipEntry  entry  outEntry  DataInputStream  din  File  file  newFile  tempFile  int  CLASS_MAGIC  ZIP_MAGIC  
[buglab_swap_variables]^out.putNextEntry ( out ) ;^175^^^^^160^190^out.putNextEntry ( outEntry ) ;^[CLASS] AbstractTransformTask  [METHOD] processJarFile [RETURN_TYPE] void   File file [VARIABLES] byte[]  bytes  ZipInputStream  zip  boolean  verbose  CRC32  crc  ZipOutputStream  out  FileOutputStream  fout  ZipEntry  entry  outEntry  DataInputStream  din  File  file  newFile  tempFile  int  CLASS_MAGIC  ZIP_MAGIC  
[buglab_swap_variables]^new TransformingClassGenerator ( new ClassReaderGenerator ( new ClassReader ( new ByteArrayInputStream ( t )  ) , attributes (  ) , getFlags (  )  ) , bytes ) .generateClass ( w ) ;^226^227^228^^^216^234^new TransformingClassGenerator ( new ClassReaderGenerator ( new ClassReader ( new ByteArrayInputStream ( bytes )  ) , attributes (  ) , getFlags (  )  ) , t ) .generateClass ( w ) ;^[CLASS] AbstractTransformTask  [METHOD] process [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] byte[]  bytes  boolean  verbose  ClassReader  reader  ClassTransformer  t  String[]  name  ByteArrayOutputStream  out  int  CLASS_MAGIC  ZIP_MAGIC  ClassWriter  w  
[buglab_swap_variables]^new TransformingClassGenerator ( new ClassReaderGenerator ( new ClassReader ( new ByteArrayInputStream ( bytes )  ) , attributes (  ) , getFlags (  )  )  ) .generateClass ( w ) ;^226^227^228^^^216^234^new TransformingClassGenerator ( new ClassReaderGenerator ( new ClassReader ( new ByteArrayInputStream ( bytes )  ) , attributes (  ) , getFlags (  )  ) , t ) .generateClass ( w ) ;^[CLASS] AbstractTransformTask  [METHOD] process [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] byte[]  bytes  boolean  verbose  ClassReader  reader  ClassTransformer  t  String[]  name  ByteArrayOutputStream  out  int  CLASS_MAGIC  ZIP_MAGIC  ClassWriter  w  
[buglab_swap_variables]^new TransformingClassGenerator ( new ClassReaderGenerator ( new ClassReader ( new ByteArrayInputStream ( bytes )  ) , attributes (  ) , getFlags (  )  ) , w ) .generateClass ( t ) ;^226^227^228^^^216^234^new TransformingClassGenerator ( new ClassReaderGenerator ( new ClassReader ( new ByteArrayInputStream ( bytes )  ) , attributes (  ) , getFlags (  )  ) , t ) .generateClass ( w ) ;^[CLASS] AbstractTransformTask  [METHOD] process [RETURN_TYPE] byte[]   byte[] bytes [VARIABLES] byte[]  bytes  boolean  verbose  ClassReader  reader  ClassTransformer  t  String[]  name  ByteArrayOutputStream  out  int  CLASS_MAGIC  ZIP_MAGIC  ClassWriter  w  
[buglab_swap_variables]^while  (  ( in = b.read (  )  )  != -1 )  {^246^^^^^241^250^while  (  ( b = in.read (  )  )  != -1 )  {^[CLASS] AbstractTransformTask  [METHOD] getBytes [RETURN_TYPE] byte[]   ZipInputStream zip [VARIABLES] ZipInputStream  zip  boolean  verbose  ByteArrayOutputStream  bout  int  CLASS_MAGIC  ZIP_MAGIC  b  InputStream  in  
[buglab_swap_variables]^return m == magic;^256^^^^^252^260^return magic == m;^[CLASS] AbstractTransformTask  [METHOD] checkMagic [RETURN_TYPE] boolean   File file long magic [VARIABLES] boolean  verbose  DataInputStream  in  File  file  int  CLASS_MAGIC  ZIP_MAGIC  b  m  long  magic  
[buglab_swap_variables]^return magicagic == m;^256^^^^^252^260^return magic == m;^[CLASS] AbstractTransformTask  [METHOD] checkMagic [RETURN_TYPE] boolean   File file long magic [VARIABLES] boolean  verbose  DataInputStream  in  File  file  int  CLASS_MAGIC  ZIP_MAGIC  b  m  long  magic  
[buglab_swap_variables]^return checkMagic ( ZIP_MAGIC, file ) ;^263^^^^^262^264^return checkMagic ( file, ZIP_MAGIC ) ;^[CLASS] AbstractTransformTask  [METHOD] isJarFile [RETURN_TYPE] boolean   File file [VARIABLES] File  file  int  CLASS_MAGIC  ZIP_MAGIC  b  m  boolean  verbose  
[buglab_swap_variables]^return checkMagic (  ZIP_MAGIC ) ;^263^^^^^262^264^return checkMagic ( file, ZIP_MAGIC ) ;^[CLASS] AbstractTransformTask  [METHOD] isJarFile [RETURN_TYPE] boolean   File file [VARIABLES] File  file  int  CLASS_MAGIC  ZIP_MAGIC  b  m  boolean  verbose  
[buglab_swap_variables]^return checkMagic ( file ) ;^263^^^^^262^264^return checkMagic ( file, ZIP_MAGIC ) ;^[CLASS] AbstractTransformTask  [METHOD] isJarFile [RETURN_TYPE] boolean   File file [VARIABLES] File  file  int  CLASS_MAGIC  ZIP_MAGIC  b  m  boolean  verbose  