[REPLACE]^private static TTest tTest  = null ;^37^^^^^^^[REPLACE] private static TTest tTest = TestFactory.newInstance (  ) .createTTest (  ) ;^ [CLASS] TestUtils  
[REPLACE]^private static ChiSquareTest chiSquareTest ;^40^41^^^^40^41^[REPLACE] private static ChiSquareTest chiSquareTest = TestFactory.newInstance (  ) .createChiSquareTest (  ) ;^ [CLASS] TestUtils  
[REPLACE]^return chiSquareTest.chiSquareTest ( expected, observed ) ;^33^^^^^32^34^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] TestUtils() [PARAMETER] [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  boolean false  true 
[REPLACE]^return tTest.tTest ( mu, sampleStats ) ;^49^^^^^48^50^[REPLACE] return tTest;^[METHOD] getTTest [TYPE] TTest [PARAMETER] [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  boolean false  true 
[REPLACE]^return chiSquareTest.chiSquareTest ( expected, observed ) ;^58^^^^^57^59^[REPLACE] return chiSquareTest;^[METHOD] getChiSquareTest [TYPE] ChiSquareTest [PARAMETER] [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  boolean false  true 
[REPLACE]^return tTest.homoscedasticTTest ( sample1, sample2 ) ;^66^^^^^64^67^[REPLACE] return tTest.homoscedasticT ( sample1, sample2 ) ;^[METHOD] homoscedasticT [TYPE] double [PARAMETER] double[] sample1 double[] sample2 [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] sample1  sample2  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^return tTest.homoscedasticTTest ( sampleStats1, sampleStats2 ) ;^75^^^^^72^76^[REPLACE] return tTest.homoscedasticT ( sampleStats1, sampleStats2 ) ;^[METHOD] homoscedasticT [TYPE] double [PARAMETER] StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  StatisticalSummary sampleStats1  sampleStats2  [TYPE]  boolean false  true  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^return tTest.pairedTTest ( sample1, sample2, alpha ) ;^84^^^^^81^85^[REPLACE] return tTest. homoscedasticTTest ( sample1, sample2, alpha ) ;^[METHOD] homoscedasticTTest [TYPE] boolean [PARAMETER] double[] sample1 double[] sample2 double alpha [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] sample1  sample2  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double alpha 
[REPLACE]^return tTest .homoscedasticTTest ( sample2 , sample1 , null )  ;^92^^^^^90^93^[REPLACE] return tTest.homoscedasticTTest ( sample1, sample2 ) ;^[METHOD] homoscedasticTTest [TYPE] double [PARAMETER] double[] sample1 double[] sample2 [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] sample1  sample2  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^return tTest.homoscedasticT ( sampleStats1, sampleStats2 ) ;^101^^^^^98^102^[REPLACE] return tTest.homoscedasticTTest ( sampleStats1, sampleStats2 ) ;^[METHOD] homoscedasticTTest [TYPE] double [PARAMETER] StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  StatisticalSummary sampleStats1  sampleStats2  [TYPE]  boolean false  true  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^return tTest.pairedTTest ( sample1, sample2 ) ;^109^^^^^107^110^[REPLACE] return tTest.pairedT ( sample1, sample2 ) ;^[METHOD] pairedT [TYPE] double [PARAMETER] double[] sample1 double[] sample2 [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] sample1  sample2  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^return tTest.tTest ( sample1, sample2, alpha ) ;^118^^^^^115^119^[REPLACE] return tTest.pairedTTest ( sample1, sample2, alpha ) ;^[METHOD] pairedTTest [TYPE] boolean [PARAMETER] double[] sample1 double[] sample2 double alpha [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] sample1  sample2  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double alpha 
[REPLACE]^return tTest.pairedT ( sample1, sample2 ) ;^126^^^^^124^127^[REPLACE] return tTest.pairedTTest ( sample1, sample2 ) ;^[METHOD] pairedTTest [TYPE] double [PARAMETER] double[] sample1 double[] sample2 [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] sample1  sample2  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^r.turn tTest.t ( mu, observed ) ;^134^^^^^132^135^[REPLACE] return tTest.t ( mu, observed ) ;^[METHOD] t [TYPE] double [PARAMETER] double mu double[] observed [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] observed  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double mu 
[REPLACE]^r.tTesturn tTest.t ( mu, sampleStats ) ;^142^^^^^140^143^[REPLACE] return tTest.t ( mu, sampleStats ) ;^[METHOD] t [TYPE] double [PARAMETER] double mu StatisticalSummary sampleStats [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  StatisticalSummary sampleStats  [TYPE]  boolean false  true  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double mu 
[REPLACE]^r.turn tTest.t ( sample1, sample2 ) ;^150^^^^^148^151^[REPLACE] return tTest.t ( sample1, sample2 ) ;^[METHOD] t [TYPE] double [PARAMETER] double[] sample1 double[] sample2 [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] sample1  sample2  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^r.tTesturn tTest.t ( sampleStats1, sampleStats2 ) ;^159^^^^^156^160^[REPLACE] return tTest.t ( sampleStats1, sampleStats2 ) ;^[METHOD] t [TYPE] double [PARAMETER] StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  StatisticalSummary sampleStats1  sampleStats2  [TYPE]  boolean false  true  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^return.tTest.tTest ( mu, sample, alpha ) ;^167^^^^^165^168^[REPLACE] return tTest.tTest ( mu, sample, alpha ) ;^[METHOD] tTest [TYPE] boolean [PARAMETER] double mu double[] sample double alpha [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] sample  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double alpha  mu 
[REPLACE]^return tTest .tTest ( mu , sample , mu )  ;^175^^^^^173^176^[REPLACE] return tTest.tTest ( mu, sample ) ;^[METHOD] tTest [TYPE] double [PARAMETER] double mu double[] sample [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] sample  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double mu 
[REPLACE]^return tTest.tTest ( mu, sampleStats ) ;^184^^^^^181^185^[REPLACE] return tTest. tTest ( mu, sampleStats, alpha ) ;^[METHOD] tTest [TYPE] boolean [PARAMETER] double mu StatisticalSummary sampleStats double alpha [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  StatisticalSummary sampleStats  [TYPE]  boolean false  true  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double alpha  mu 
[REPLACE]^return tTest. tTest ( mu, sampleStats, alpha ) ;^192^^^^^190^193^[REPLACE] return tTest.tTest ( mu, sampleStats ) ;^[METHOD] tTest [TYPE] double [PARAMETER] double mu StatisticalSummary sampleStats [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  StatisticalSummary sampleStats  [TYPE]  boolean false  true  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double mu 
[REPLACE]^return.tTest.tTest ( sample1, sample2, alpha ) ;^200^^^^^198^201^[REPLACE] return tTest.tTest ( sample1, sample2, alpha ) ;^[METHOD] tTest [TYPE] boolean [PARAMETER] double[] sample1 double[] sample2 double alpha [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] sample1  sample2  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double alpha 
[REPLACE]^return.tTest.tTest ( sample1, sample2 ) ;^208^^^^^206^209^[REPLACE] return tTest.tTest ( sample1, sample2 ) ;^[METHOD] tTest [TYPE] double [PARAMETER] double[] sample1 double[] sample2 [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] sample1  sample2  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^return tTest. tTest ( sampleStats2, sampleStats2, alpha ) ;^217^^^^^214^218^[REPLACE] return tTest. tTest ( sampleStats1, sampleStats2, alpha ) ;^[METHOD] tTest [TYPE] boolean [PARAMETER] StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 double alpha [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  StatisticalSummary sampleStats1  sampleStats2  [TYPE]  boolean false  true  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double alpha 
[REPLACE]^return tTest .tTest ( null , true , null )  ;^226^^^^^223^227^[REPLACE] return tTest.tTest ( sampleStats1, sampleStats2 ) ;^[METHOD] tTest [TYPE] double [PARAMETER] StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  StatisticalSummary sampleStats1  sampleStats2  [TYPE]  boolean false  true  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^return.chiSquareTestTest.chiSquare ( expected, observed ) ;^234^^^^^232^235^[REPLACE] return chiSquareTest.chiSquare ( expected, observed ) ;^[METHOD] chiSquare [TYPE] double [PARAMETER] double[] expected long[] observed [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] expected  [TYPE]  long[] observed  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^return chiSquareTest .chiSquare ( this , null )  ;^242^^^^^240^243^[REPLACE] return chiSquareTest.chiSquare ( counts ) ;^[METHOD] chiSquare [TYPE] double [PARAMETER] long[][] counts [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  long[][] counts  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^return chiSquareTest.chiSquareTest ( expected, observed ) ;^251^^^^^248^252^[REPLACE] return chiSquareTest.chiSquareTest ( expected, observed, alpha ) ;^[METHOD] chiSquareTest [TYPE] boolean [PARAMETER] double[] expected long[] observed double alpha [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] expected  [TYPE]  long[] observed  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double alpha 
[REPLACE]^return.chiSquare.chiSquareTest ( expected, observed ) ;^259^^^^^257^260^[REPLACE] return chiSquareTest.chiSquareTest ( expected, observed ) ;^[METHOD] chiSquareTest [TYPE] double [PARAMETER] double[] expected long[] observed [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  double[] expected  [TYPE]  long[] observed  [TYPE]  ChiSquareTest chiSquareTest 
[REPLACE]^return chiSquareTest. chiSquareTest ( counts ) ;^267^^^^^265^268^[REPLACE] return chiSquareTest. chiSquareTest ( counts, alpha ) ;^[METHOD] chiSquareTest [TYPE] boolean [PARAMETER] long[][] counts double alpha [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  long[][] counts  [TYPE]  ChiSquareTest chiSquareTest  [TYPE]  double alpha 
[REPLACE]^return chiSquareTest. chiSquareTest ( counts, alpha ) ;^275^^^^^273^276^[REPLACE] return chiSquareTest. chiSquareTest ( counts ) ;^[METHOD] chiSquareTest [TYPE] double [PARAMETER] long[][] counts [CLASS] TestUtils   [TYPE]  TTest tTest  [TYPE]  boolean false  true  [TYPE]  long[][] counts  [TYPE]  ChiSquareTest chiSquareTest 