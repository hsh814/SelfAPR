[P3_Replace_Literal]^private boolean constructed = true;^34^^^^^29^39^private boolean constructed = false;^[CLASS] JVMRandom   [VARIABLES] 
[P3_Replace_Literal]^this.constructed = false;^40^^^^^39^41^this.constructed = true;^[CLASS] JVMRandom  [METHOD] <init> [RETURN_TYPE] JVMRandom()   [VARIABLES] boolean  constructed  
[P12_Insert_Condition]^if  ( this.constructed )  { this.constructed = true; }^40^^^^^39^41^this.constructed = true;^[CLASS] JVMRandom  [METHOD] <init> [RETURN_TYPE] JVMRandom()   [VARIABLES] boolean  constructed  
[P5_Replace_Variable]^if  ( constructed )  {^50^^^^^49^53^if  ( this.constructed )  {^[CLASS] JVMRandom  [METHOD] setSeed [RETURN_TYPE] void   long seed [VARIABLES] long  seed  boolean  constructed  
[P15_Unwrap_Block]^throw new java.lang.UnsupportedOperationException();^50^51^52^^^49^53^if  ( this.constructed )  { throw new UnsupportedOperationException  (" ")  ; }^[CLASS] JVMRandom  [METHOD] setSeed [RETURN_TYPE] void   long seed [VARIABLES] long  seed  boolean  constructed  
[P16_Remove_Block]^^50^51^52^^^49^53^if  ( this.constructed )  { throw new UnsupportedOperationException  (" ")  ; }^[CLASS] JVMRandom  [METHOD] setSeed [RETURN_TYPE] void   long seed [VARIABLES] long  seed  boolean  constructed  
[P13_Insert_Block]^if  ( this.constructed )  {     throw new UnsupportedOperationException (  ) ; }^51^^^^^49^53^[Delete]^[CLASS] JVMRandom  [METHOD] setSeed [RETURN_TYPE] void   long seed [VARIABLES] long  seed  boolean  constructed  
[P5_Replace_Variable]^return nextInt ( Integer.1 ) ;^82^^^^^81^83^return nextInt ( Integer.MAX_VALUE ) ;^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   [VARIABLES] boolean  constructed  
[P14_Delete_Statement]^^82^^^^^81^83^return nextInt ( Integer.MAX_VALUE ) ;^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   [VARIABLES] boolean  constructed  
[P2_Replace_Operator]^if  ( n < 0 )  {^94^^^^^93^101^if  ( n <= 0 )  {^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P3_Replace_Literal]^if  ( n <= -8 )  {^94^^^^^93^101^if  ( n <= 0 )  {^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P8_Replace_Mix]^if  ( n <= 0L )  {^94^^^^^93^101^if  ( n <= 0 )  {^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("Upper bound for nextInt must be positive");^94^95^96^97^98^93^101^if  ( n <= 0 )  { throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ; }^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P16_Remove_Block]^^94^95^96^97^98^93^101^if  ( n <= 0 )  { throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ; }^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P3_Replace_Literal]^throw new IllegalArgumentException ( "nextI" ) ;^95^96^97^^^93^101^throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P13_Insert_Block]^if  ( n <= 0 )  {     throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ; }^95^^^^^93^101^[Delete]^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P3_Replace_Literal]^throw new IllegalArgumentException ( "nd pper bound for nextInt must be positive" ) ;^95^96^97^^^93^101^throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P3_Replace_Literal]^throw new IllegalArgumentException ( "Upper bound for nextInt must be positivend" ) ;^95^96^97^^^93^101^throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P3_Replace_Literal]^throw new IllegalArgumentException ( "per bound forpper bound for nextInt must be positive" ) ;^95^96^97^^^93^101^throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P2_Replace_Operator]^return / ( int )  ( Math.random (  )  * n ) ;^100^^^^^93^101^return  ( int )  ( Math.random (  )  * n ) ;^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P8_Replace_Mix]^return  ( int )  ( Math.random (  )  + n ) ;^100^^^^^93^101^return  ( int )  ( Math.random (  )  * n ) ;^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P14_Delete_Statement]^^100^^^^^93^101^return  ( int )  ( Math.random (  )  * n ) ;^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[P14_Delete_Statement]^^109^^^^^107^110^return nextLong ( Long.MAX_VALUE ) ;^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   [VARIABLES] boolean  constructed  
[P2_Replace_Operator]^if  ( n < 0 )  {^123^^^^^122^130^if  ( n <= 0 )  {^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P3_Replace_Literal]^if  ( n <= -7 )  {^123^^^^^122^130^if  ( n <= 0 )  {^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P8_Replace_Mix]^if  ( n <= 2 )  {^123^^^^^122^130^if  ( n <= 0 )  {^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("Upper bound for nextInt must be positive");^123^124^125^126^127^122^130^if  ( n <= 0 )  { throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ; }^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P16_Remove_Block]^^123^124^125^126^127^122^130^if  ( n <= 0 )  { throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ; }^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P3_Replace_Literal]^throw new IllegalArgumentException ( "Upper bound" ) ;^124^125^126^^^122^130^throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P13_Insert_Block]^if  ( n <= 0 )  {     throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ; }^124^^^^^122^130^[Delete]^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P3_Replace_Literal]^throw new IllegalArgumentException ( "Upper bound for nextInt must be positiveu" ) ;^124^125^126^^^122^130^throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P3_Replace_Literal]^throw new IllegalArgumentException ( "Upper bound for nextInt must be positivpper bound for nextInt must be positive" ) ;^124^125^126^^^122^130^throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P3_Replace_Literal]^throw new IllegalArgumentException ( "bound for nextInt must be pper bound for nextInt must be positive" ) ;^124^125^126^^^122^130^throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P8_Replace_Mix]^return ;^124^125^126^^^122^130^throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P2_Replace_Operator]^return + ( long )  ( Math.random (  )  * n ) ;^129^^^^^122^130^return  ( long )  ( Math.random (  )  * n ) ;^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P8_Replace_Mix]^return  ( long )  ( Math.random (  )  - n ) ;^129^^^^^122^130^return  ( long )  ( Math.random (  )  * n ) ;^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P14_Delete_Statement]^^129^^^^^122^130^return  ( long )  ( Math.random (  )  * n ) ;^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[P2_Replace_Operator]^return Math.random (  )  >= 0.5;^139^^^^^138^140^return Math.random (  )  > 0.5;^[CLASS] JVMRandom  [METHOD] nextBoolean [RETURN_TYPE] boolean   [VARIABLES] boolean  constructed  
[P8_Replace_Mix]^return Math.random (  )   !=  0.5;;^139^^^^^138^140^return Math.random (  )  > 0.5;^[CLASS] JVMRandom  [METHOD] nextBoolean [RETURN_TYPE] boolean   [VARIABLES] boolean  constructed  
[P14_Delete_Statement]^^139^^^^^138^140^return Math.random (  )  > 0.5;^[CLASS] JVMRandom  [METHOD] nextBoolean [RETURN_TYPE] boolean   [VARIABLES] boolean  constructed  
[P1_Replace_Type]^return  ( int ) Math.random (  ) ;^149^^^^^148^150^return  ( float ) Math.random (  ) ;^[CLASS] JVMRandom  [METHOD] nextFloat [RETURN_TYPE] float   [VARIABLES] boolean  constructed  
[P14_Delete_Statement]^^149^^^^^148^150^return  ( float ) Math.random (  ) ;^[CLASS] JVMRandom  [METHOD] nextFloat [RETURN_TYPE] float   [VARIABLES] boolean  constructed  
[P14_Delete_Statement]^^157^^^^^156^158^return Math.random (  ) ;^[CLASS] JVMRandom  [METHOD] nextDouble [RETURN_TYPE] double   [VARIABLES] boolean  constructed  
