[buglab_swap_variables]^ran.nextBytes ( randomBytesdomBytes ) ;^133^^^^^118^148^ran.nextBytes ( randomBytes ) ;^[CLASS] RandomDataImpl  [METHOD] nextHexString [RETURN_TYPE] String   int len [VARIABLES] byte[]  randomBytes  Integer  c  StringBuffer  outBuffer  boolean  SecureRandom  secRand  String  hex  long  serialVersionUID  RandomGenerator  ran  rand  int  i  len  
[buglab_swap_variables]^ran.nextBytes ( ran ) ;^133^^^^^118^148^ran.nextBytes ( randomBytes ) ;^[CLASS] RandomDataImpl  [METHOD] nextHexString [RETURN_TYPE] String   int len [VARIABLES] byte[]  randomBytes  Integer  c  StringBuffer  outBuffer  boolean  SecureRandom  secRand  String  hex  long  serialVersionUID  RandomGenerator  ran  rand  int  i  len  
[buglab_swap_variables]^for  ( randomBytes.lengthnt i = 0; i < i; i++ )  {^136^^^^^121^151^for  ( int i = 0; i < randomBytes.length; i++ )  {^[CLASS] RandomDataImpl  [METHOD] nextHexString [RETURN_TYPE] String   int len [VARIABLES] byte[]  randomBytes  Integer  c  StringBuffer  outBuffer  boolean  SecureRandom  secRand  String  hex  long  serialVersionUID  RandomGenerator  ran  rand  int  i  len  
[buglab_swap_variables]^return len.toString (  ) .substring ( 0, outBuffer ) ;^152^^^^^137^167^return outBuffer.toString (  ) .substring ( 0, len ) ;^[CLASS] RandomDataImpl  [METHOD] nextHexString [RETURN_TYPE] String   int len [VARIABLES] byte[]  randomBytes  Integer  c  StringBuffer  outBuffer  boolean  SecureRandom  secRand  String  hex  long  serialVersionUID  RandomGenerator  ran  rand  int  i  len  
[buglab_swap_variables]^return outBuffer.toString (  ) .substring ( 0 ) ;^152^^^^^137^167^return outBuffer.toString (  ) .substring ( 0, len ) ;^[CLASS] RandomDataImpl  [METHOD] nextHexString [RETURN_TYPE] String   int len [VARIABLES] byte[]  randomBytes  Integer  c  StringBuffer  outBuffer  boolean  SecureRandom  secRand  String  hex  long  serialVersionUID  RandomGenerator  ran  rand  int  i  len  
[buglab_swap_variables]^if  ( upper >= lower )  {^164^^^^^163^170^if  ( lower >= upper )  {^[CLASS] RandomDataImpl  [METHOD] nextInt [RETURN_TYPE] int   int lower int upper [VARIABLES] SecureRandom  secRand  boolean  long  serialVersionUID  RandomGenerator  ran  rand  int  lower  upper  
[buglab_swap_variables]^return upper +  ( int )   ( rand.nextDouble (  )  *  ( lower - lower + 1 )  ) ;^169^^^^^163^170^return lower +  ( int )   ( rand.nextDouble (  )  *  ( upper - lower + 1 )  ) ;^[CLASS] RandomDataImpl  [METHOD] nextInt [RETURN_TYPE] int   int lower int upper [VARIABLES] SecureRandom  secRand  boolean  long  serialVersionUID  RandomGenerator  ran  rand  int  lower  upper  
[buglab_swap_variables]^return rand +  ( int )   ( lower.nextDouble (  )  *  ( upper - lower + 1 )  ) ;^169^^^^^163^170^return lower +  ( int )   ( rand.nextDouble (  )  *  ( upper - lower + 1 )  ) ;^[CLASS] RandomDataImpl  [METHOD] nextInt [RETURN_TYPE] int   int lower int upper [VARIABLES] SecureRandom  secRand  boolean  long  serialVersionUID  RandomGenerator  ran  rand  int  lower  upper  
[buglab_swap_variables]^if  ( upper >= lower )  {^181^^^^^180^187^if  ( lower >= upper )  {^[CLASS] RandomDataImpl  [METHOD] nextLong [RETURN_TYPE] long   long lower long upper [VARIABLES] SecureRandom  secRand  boolean  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  
[buglab_swap_variables]^return rand +  ( long )   ( lower.nextDouble (  )  *  ( upper - lower + 1 )  ) ;^186^^^^^180^187^return lower +  ( long )   ( rand.nextDouble (  )  *  ( upper - lower + 1 )  ) ;^[CLASS] RandomDataImpl  [METHOD] nextLong [RETURN_TYPE] long   long lower long upper [VARIABLES] SecureRandom  secRand  boolean  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  
[buglab_swap_variables]^return lower +  ( long )   ( upper.nextDouble (  )  *  ( rand - lower + 1 )  ) ;^186^^^^^180^187^return lower +  ( long )   ( rand.nextDouble (  )  *  ( upper - lower + 1 )  ) ;^[CLASS] RandomDataImpl  [METHOD] nextLong [RETURN_TYPE] long   long lower long upper [VARIABLES] SecureRandom  secRand  boolean  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  
[buglab_swap_variables]^for  ( numIternt iter = 1; iter < i + 1; iter++ )  {^222^^^^^207^237^for  ( int iter = 1; iter < numIter + 1; iter++ )  {^[CLASS] RandomDataImpl  [METHOD] nextSecureHexString [RETURN_TYPE] String   int len [VARIABLES] byte[]  hash  randomBytes  Integer  c  StringBuffer  outBuffer  boolean  SecureRandom  secRan  secRand  NoSuchAlgorithmException  ex  String  hex  MessageDigest  alg  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  iter  len  numIter  
[buglab_swap_variables]^for  ( iternt i = 1; iter < numIter + 1; iter++ )  {^222^^^^^207^237^for  ( int iter = 1; iter < numIter + 1; iter++ )  {^[CLASS] RandomDataImpl  [METHOD] nextSecureHexString [RETURN_TYPE] String   int len [VARIABLES] byte[]  hash  randomBytes  Integer  c  StringBuffer  outBuffer  boolean  SecureRandom  secRan  secRand  NoSuchAlgorithmException  ex  String  hex  MessageDigest  alg  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  iter  len  numIter  
[buglab_swap_variables]^for  ( hash.lengthnt i = 0; i < i; i++ )  {^231^^^^^216^246^for  ( int i = 0; i < hash.length; i++ )  {^[CLASS] RandomDataImpl  [METHOD] nextSecureHexString [RETURN_TYPE] String   int len [VARIABLES] byte[]  hash  randomBytes  Integer  c  StringBuffer  outBuffer  boolean  SecureRandom  secRan  secRand  NoSuchAlgorithmException  ex  String  hex  MessageDigest  alg  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  iter  len  numIter  
[buglab_swap_variables]^for  ( int i = 0; i < hash; i++ )  {^231^^^^^216^246^for  ( int i = 0; i < hash.length; i++ )  {^[CLASS] RandomDataImpl  [METHOD] nextSecureHexString [RETURN_TYPE] String   int len [VARIABLES] byte[]  hash  randomBytes  Integer  c  StringBuffer  outBuffer  boolean  SecureRandom  secRan  secRand  NoSuchAlgorithmException  ex  String  hex  MessageDigest  alg  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  iter  len  numIter  
[buglab_swap_variables]^return len.toString (  ) .substring ( 0, outBuffer ) ;^248^^^^^233^263^return outBuffer.toString (  ) .substring ( 0, len ) ;^[CLASS] RandomDataImpl  [METHOD] nextSecureHexString [RETURN_TYPE] String   int len [VARIABLES] byte[]  hash  randomBytes  Integer  c  StringBuffer  outBuffer  boolean  SecureRandom  secRan  secRand  NoSuchAlgorithmException  ex  String  hex  MessageDigest  alg  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  iter  len  numIter  
[buglab_swap_variables]^return outBuffer.toString (  ) .substring ( 0 ) ;^248^^^^^233^263^return outBuffer.toString (  ) .substring ( 0, len ) ;^[CLASS] RandomDataImpl  [METHOD] nextSecureHexString [RETURN_TYPE] String   int len [VARIABLES] byte[]  hash  randomBytes  Integer  c  StringBuffer  outBuffer  boolean  SecureRandom  secRan  secRand  NoSuchAlgorithmException  ex  String  hex  MessageDigest  alg  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  iter  len  numIter  
[buglab_swap_variables]^if  ( upper >= lower )  {^261^^^^^260^267^if  ( lower >= upper )  {^[CLASS] RandomDataImpl  [METHOD] nextSecureInt [RETURN_TYPE] int   int lower int upper [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  int  lower  upper  
[buglab_swap_variables]^return upper +  ( int )   ( sec.nextDouble (  )  *  ( lower - lower + 1 )  ) ;^266^^^^^260^267^return lower +  ( int )   ( sec.nextDouble (  )  *  ( upper - lower + 1 )  ) ;^[CLASS] RandomDataImpl  [METHOD] nextSecureInt [RETURN_TYPE] int   int lower int upper [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  int  lower  upper  
[buglab_swap_variables]^return lower +  ( int )   ( upper.nextDouble (  )  *  ( sec - lower + 1 )  ) ;^266^^^^^260^267^return lower +  ( int )   ( sec.nextDouble (  )  *  ( upper - lower + 1 )  ) ;^[CLASS] RandomDataImpl  [METHOD] nextSecureInt [RETURN_TYPE] int   int lower int upper [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  int  lower  upper  
[buglab_swap_variables]^if  ( upper >= lower )  {^279^^^^^278^285^if  ( lower >= upper )  {^[CLASS] RandomDataImpl  [METHOD] nextSecureLong [RETURN_TYPE] long   long lower long upper [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  
[buglab_swap_variables]^return upper +  ( long )   ( sec.nextDouble (  )  *  ( lower - lower + 1 )  ) ;^284^^^^^278^285^return lower +  ( long )   ( sec.nextDouble (  )  *  ( upper - lower + 1 )  ) ;^[CLASS] RandomDataImpl  [METHOD] nextSecureLong [RETURN_TYPE] long   long lower long upper [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  
[buglab_swap_variables]^return lower +  ( long )   ( upper.nextDouble (  )  *  ( sec - lower + 1 )  ) ;^284^^^^^278^285^return lower +  ( long )   ( sec.nextDouble (  )  *  ( upper - lower + 1 )  ) ;^[CLASS] RandomDataImpl  [METHOD] nextSecureLong [RETURN_TYPE] long   long lower long upper [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  serialVersionUID  upper  RandomGenerator  ran  rand  
[buglab_swap_variables]^if  ( p >= r )  {^315^^^^^303^322^if  ( r >= p )  {^[CLASS] RandomDataImpl  [METHOD] nextPoisson [RETURN_TYPE] long   double mean [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  n  serialVersionUID  upper  RandomGenerator  ran  rand  double  mean  p  r  rnd  
[buglab_swap_variables]^r = rnd * r;^314^^^^^303^322^r = r * rnd;^[CLASS] RandomDataImpl  [METHOD] nextPoisson [RETURN_TYPE] long   double mean [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  n  serialVersionUID  upper  RandomGenerator  ran  rand  double  mean  p  r  rnd  
[buglab_swap_variables]^return mu * rand.nextGaussian (  )  + sigma;^338^^^^^333^339^return sigma * rand.nextGaussian (  )  + mu;^[CLASS] RandomDataImpl  [METHOD] nextGaussian [RETURN_TYPE] double   double mu double sigma [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  n  serialVersionUID  upper  RandomGenerator  ran  rand  double  mu  sigma  
[buglab_swap_variables]^return sigma * mu.nextGaussian (  )  + rand;^338^^^^^333^339^return sigma * rand.nextGaussian (  )  + mu;^[CLASS] RandomDataImpl  [METHOD] nextGaussian [RETURN_TYPE] double   double mu double sigma [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  n  serialVersionUID  upper  RandomGenerator  ran  rand  double  mu  sigma  
[buglab_swap_variables]^if  ( upper >= lower )  {^378^^^^^377^391^if  ( lower >= upper )  {^[CLASS] RandomDataImpl  [METHOD] nextUniform [RETURN_TYPE] double   double lower double upper [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  n  serialVersionUID  upper  RandomGenerator  ran  rand  double  lower  u  upper  
[buglab_swap_variables]^return u + lower *  ( upper - lower ) ;^390^^^^^377^391^return lower + u *  ( upper - lower ) ;^[CLASS] RandomDataImpl  [METHOD] nextUniform [RETURN_TYPE] double   double lower double upper [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  n  serialVersionUID  upper  RandomGenerator  ran  rand  double  lower  u  upper  
[buglab_swap_variables]^return lower + upper *  ( u - lower ) ;^390^^^^^377^391^return lower + u *  ( upper - lower ) ;^[CLASS] RandomDataImpl  [METHOD] nextUniform [RETURN_TYPE] double   double lower double upper [VARIABLES] SecureRandom  sec  secRan  secRand  boolean  long  lower  n  serialVersionUID  upper  RandomGenerator  ran  rand  double  lower  u  upper  
[buglab_swap_variables]^secRand = SecureRandom.getInstance ( provider, algorithm ) ;^496^^^^^494^497^secRand = SecureRandom.getInstance ( algorithm, provider ) ;^[CLASS] RandomDataImpl  [METHOD] setSecureAlgorithm [RETURN_TYPE] void   String algorithm String provider [VARIABLES] SecureRandom  sec  secRan  secRand  String  algorithm  provider  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  
[buglab_swap_variables]^secRand = SecureRandom.getInstance (  provider ) ;^496^^^^^494^497^secRand = SecureRandom.getInstance ( algorithm, provider ) ;^[CLASS] RandomDataImpl  [METHOD] setSecureAlgorithm [RETURN_TYPE] void   String algorithm String provider [VARIABLES] SecureRandom  sec  secRan  secRand  String  algorithm  provider  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  
[buglab_swap_variables]^secRand = SecureRandom.getInstance ( algorithm ) ;^496^^^^^494^497^secRand = SecureRandom.getInstance ( algorithm, provider ) ;^[CLASS] RandomDataImpl  [METHOD] setSecureAlgorithm [RETURN_TYPE] void   String algorithm String provider [VARIABLES] SecureRandom  sec  secRan  secRand  String  algorithm  provider  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  
[buglab_swap_variables]^if  ( n > k )  {^509^^^^^508^526^if  ( k > n )  {^[CLASS] RandomDataImpl  [METHOD] nextPermutation [RETURN_TYPE] int[]   int n int k [VARIABLES] SecureRandom  sec  secRan  secRand  int[]  index  result  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  k  n  
[buglab_swap_variables]^shuffle ( n, index - k ) ;^519^^^^^508^526^shuffle ( index, n - k ) ;^[CLASS] RandomDataImpl  [METHOD] nextPermutation [RETURN_TYPE] int[]   int n int k [VARIABLES] SecureRandom  sec  secRan  secRand  int[]  index  result  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  k  n  
[buglab_swap_variables]^shuffle (  n - k ) ;^519^^^^^508^526^shuffle ( index, n - k ) ;^[CLASS] RandomDataImpl  [METHOD] nextPermutation [RETURN_TYPE] int[]   int n int k [VARIABLES] SecureRandom  sec  secRan  secRand  int[]  index  result  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  k  n  
[buglab_swap_variables]^shuffle ( index - k ) ;^519^^^^^508^526^shuffle ( index, n - k ) ;^[CLASS] RandomDataImpl  [METHOD] nextPermutation [RETURN_TYPE] int[]   int n int k [VARIABLES] SecureRandom  sec  secRan  secRand  int[]  index  result  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  k  n  
[buglab_swap_variables]^shuffle ( k, n - index ) ;^519^^^^^508^526^shuffle ( index, n - k ) ;^[CLASS] RandomDataImpl  [METHOD] nextPermutation [RETURN_TYPE] int[]   int n int k [VARIABLES] SecureRandom  sec  secRan  secRand  int[]  index  result  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  k  n  
[buglab_swap_variables]^result[i] = i[n - index - 1];^522^^^^^508^526^result[i] = index[n - i - 1];^[CLASS] RandomDataImpl  [METHOD] nextPermutation [RETURN_TYPE] int[]   int n int k [VARIABLES] SecureRandom  sec  secRan  secRand  int[]  index  result  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  k  n  
[buglab_swap_variables]^if  ( len > k )  {^543^^^^^541^559^if  ( k > len )  {^[CLASS] RandomDataImpl  [METHOD] nextSample [RETURN_TYPE] Object[]   Collection c int k [VARIABLES] boolean  SecureRandom  sec  secRan  secRand  Collection  c  int[]  index  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  k  len  Object[]  objects  result  
[buglab_swap_variables]^int[] index = nextPermutation ( k, len ) ;^553^^^^^541^559^int[] index = nextPermutation ( len, k ) ;^[CLASS] RandomDataImpl  [METHOD] nextSample [RETURN_TYPE] Object[]   Collection c int k [VARIABLES] boolean  SecureRandom  sec  secRan  secRand  Collection  c  int[]  index  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  k  len  Object[]  objects  result  
[buglab_swap_variables]^int[] index = nextPermutation (  k ) ;^553^^^^^541^559^int[] index = nextPermutation ( len, k ) ;^[CLASS] RandomDataImpl  [METHOD] nextSample [RETURN_TYPE] Object[]   Collection c int k [VARIABLES] boolean  SecureRandom  sec  secRan  secRand  Collection  c  int[]  index  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  k  len  Object[]  objects  result  
[buglab_swap_variables]^int[] index = nextPermutation ( len ) ;^553^^^^^541^559^int[] index = nextPermutation ( len, k ) ;^[CLASS] RandomDataImpl  [METHOD] nextSample [RETURN_TYPE] Object[]   Collection c int k [VARIABLES] boolean  SecureRandom  sec  secRan  secRand  Collection  c  int[]  index  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  k  len  Object[]  objects  result  
[buglab_swap_variables]^for  ( knt i = 0; i < i; i++ )  {^555^^^^^541^559^for  ( int i = 0; i < k; i++ )  {^[CLASS] RandomDataImpl  [METHOD] nextSample [RETURN_TYPE] Object[]   Collection c int k [VARIABLES] boolean  SecureRandom  sec  secRan  secRand  Collection  c  int[]  index  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  k  len  Object[]  objects  result  
[buglab_swap_variables]^for  ( listnt i = i.length - 1 ; i >= end; i-- )  {^572^^^^^570^582^for  ( int i = list.length - 1 ; i >= end; i-- )  {^[CLASS] RandomDataImpl  [METHOD] shuffle [RETURN_TYPE] void   int[] list int end [VARIABLES] SecureRandom  sec  secRan  secRand  int[]  list  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  end  i  target  temp  
[buglab_swap_variables]^for  ( int i = list.length.length - 1 ; i >= end; i-- )  {^572^^^^^570^582^for  ( int i = list.length - 1 ; i >= end; i-- )  {^[CLASS] RandomDataImpl  [METHOD] shuffle [RETURN_TYPE] void   int[] list int end [VARIABLES] SecureRandom  sec  secRan  secRand  int[]  list  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  end  i  target  temp  
[buglab_swap_variables]^for  ( int i = list - 1 ; i >= end; i-- )  {^572^^^^^570^582^for  ( int i = list.length - 1 ; i >= end; i-- )  {^[CLASS] RandomDataImpl  [METHOD] shuffle [RETURN_TYPE] void   int[] list int end [VARIABLES] SecureRandom  sec  secRan  secRand  int[]  list  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  end  i  target  temp  
[buglab_swap_variables]^for  ( nnt i = 0; i < i; i++ )  {^592^^^^^590^596^for  ( int i = 0; i < n; i++ )  {^[CLASS] RandomDataImpl  [METHOD] getNatural [RETURN_TYPE] int[]   int n [VARIABLES] SecureRandom  sec  secRan  secRand  int[]  natural  boolean  long  lower  n  seed  serialVersionUID  upper  RandomGenerator  ran  rand  int  i  n  