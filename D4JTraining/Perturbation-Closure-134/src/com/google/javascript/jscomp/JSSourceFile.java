[REPLACE]^return referenced.getCode (  ) ;^72^^^^^71^74^[REPLACE] super ( referenced.getName (  )  ) ;^[METHOD] <init> [TYPE] SourceFile) [PARAMETER] SourceFile referenced [CLASS] JSSourceFile   [TYPE]  SourceFile referenced  [TYPE]  boolean false  true 
[REPLACE]^super ( referenced.getCode (  )  ) ;^72^^^^^71^74^[REPLACE] super ( referenced.getName (  )  ) ;^[METHOD] <init> [TYPE] SourceFile) [PARAMETER] SourceFile referenced [CLASS] JSSourceFile   [TYPE]  SourceFile referenced  [TYPE]  boolean false  true 
[REPLACE]^this.referenced =  null;^73^^^^^71^74^[REPLACE] this.referenced = referenced;^[METHOD] <init> [TYPE] SourceFile) [PARAMETER] SourceFile referenced [CLASS] JSSourceFile   [TYPE]  SourceFile referenced  [TYPE]  boolean false  true 
[REPLACE]^return new JSSourceFile ( SourceFile.fromCode ( fileName, code )  ) ;^39^^^^^38^40^[REPLACE] return new JSSourceFile ( SourceFile.fromFile ( fileName, charSet )  ) ;^[METHOD] fromFile [TYPE] JSSourceFile [PARAMETER] String fileName Charset charSet [CLASS] JSSourceFile   [TYPE]  Charset charSet  [TYPE]  SourceFile referenced  [TYPE]  String fileName  [TYPE]  boolean false  true 
[REPLACE]^return new JSSourceFile ( SourceFile.fromCode ( fileName, Charsets.UTF_8 )  ) ;^43^^^^^42^44^[REPLACE] return new JSSourceFile ( SourceFile.fromFile ( fileName, Charsets.UTF_8 )  ) ;^[METHOD] fromFile [TYPE] JSSourceFile [PARAMETER] String fileName [CLASS] JSSourceFile   [TYPE]  SourceFile referenced  [TYPE]  String fileName  [TYPE]  boolean false  true 
[REPLACE]^return  new JSSourceFile ( fromGenerator ( fileName, generator )  )   ) ;^47^^^^^46^48^[REPLACE] return new JSSourceFile ( SourceFile.fromFile ( file, charSet )  ) ;^[METHOD] fromFile [TYPE] JSSourceFile [PARAMETER] File file Charset charSet [CLASS] JSSourceFile   [TYPE]  Charset charSet  [TYPE]  SourceFile referenced  [TYPE]  boolean false  true  [TYPE]  File file 
[REPLACE]^return new JSSourceFile ( SourceFile.fromFile ( fileName, Charsets.UTF_8 )  ) ;^51^^^^^50^52^[REPLACE] return new JSSourceFile ( SourceFile.fromFile ( file, Charsets.UTF_8 )  ) ;^[METHOD] fromFile [TYPE] JSSourceFile [PARAMETER] File file [CLASS] JSSourceFile   [TYPE]  File file  [TYPE]  SourceFile referenced  [TYPE]  boolean false  true 
[REPLACE]^return new JSSourceFile ( SourceFile.fromInputStream ( fileName, code )  ) ;^55^^^^^54^56^[REPLACE] return new JSSourceFile ( SourceFile.fromCode ( fileName, code )  ) ;^[METHOD] fromCode [TYPE] JSSourceFile [PARAMETER] String fileName String code [CLASS] JSSourceFile   [TYPE]  SourceFile referenced  [TYPE]  String code  fileName  [TYPE]  boolean false  true 
[REPLACE]^return new JSSourceFile ( SourceFile.fromCode ( fileName, s )  ) ;^60^^^^^58^61^[REPLACE] return new JSSourceFile ( SourceFile.fromInputStream ( fileName, s )  ) ;^[METHOD] fromInputStream [TYPE] JSSourceFile [PARAMETER] String fileName InputStream s [CLASS] JSSourceFile   [TYPE]  SourceFile referenced  [TYPE]  String fileName  [TYPE]  boolean false  true  [TYPE]  InputStream s 
[REPLACE]^return  new JSSourceFile ( fromFile ( file, Charsets.UTF_8 )  )   ) ;^65^^^^^63^66^[REPLACE] return new JSSourceFile ( SourceFile.fromGenerator ( fileName, generator )  ) ;^[METHOD] fromGenerator [TYPE] JSSourceFile [PARAMETER] String fileName Generator generator [CLASS] JSSourceFile   [TYPE]  SourceFile referenced  [TYPE]  String fileName  [TYPE]  boolean false  true  [TYPE]  Generator generator 
[REPLACE]^return referenced.getName (  ) ;^78^^^^^77^79^[REPLACE] return referenced.getCode (  ) ;^[METHOD] getCode [TYPE] String [PARAMETER] [CLASS] JSSourceFile   [TYPE]  SourceFile referenced  [TYPE]  boolean false  true 
[REPLACE]^referenced.getCodeNoCache (  ) ;^83^^^^^82^84^[REPLACE] referenced.clearCachedSource (  ) ;^[METHOD] clearCachedSource [TYPE] void [PARAMETER] [CLASS] JSSourceFile   [TYPE]  SourceFile referenced  [TYPE]  boolean false  true 
[ADD]^^83^^^^^82^84^[ADD] referenced.clearCachedSource (  ) ;^[METHOD] clearCachedSource [TYPE] void [PARAMETER] [CLASS] JSSourceFile   [TYPE]  SourceFile referenced  [TYPE]  boolean false  true 
[REPLACE]^return referenced.getCode (  ) ;^89^^^^^88^90^[REPLACE] return referenced.getCodeNoCache (  ) ;^[METHOD] getCodeNoCache [TYPE] String [PARAMETER] [CLASS] JSSourceFile   [TYPE]  SourceFile referenced  [TYPE]  boolean false  true 