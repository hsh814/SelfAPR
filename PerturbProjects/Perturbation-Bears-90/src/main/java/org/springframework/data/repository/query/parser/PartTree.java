[REPLACE]^private static final String KEYWORD_TEMPLATE ;^53^^^^^^^[REPLACE] private static final String KEYWORD_TEMPLATE = " ( %s )  ( ?= ( \\p{Lu}|\\P{InBASIC_LATIN} )  ) ";^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static final String QUERY_PATTERN ;^54^^^^^^^[REPLACE] private static final String QUERY_PATTERN = "find|read|get|query|stream";^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static final String COUNT_PATTERN ;^55^^^^^^^[REPLACE] private static final String COUNT_PATTERN = "count";^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static   double  EXISTS_PATTERN = "exists";^56^^^^^^^[REPLACE] private static final String EXISTS_PATTERN = "exists";^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static final String DELETE_PATTERN ;^57^^^^^^^[REPLACE] private static final String DELETE_PATTERN = "delete|remove";^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static final Pattern PREFIX_TEMPLATE  = null ;^58^59^^^^58^59^[REPLACE] private static final Pattern PREFIX_TEMPLATE = Pattern.compile ( "^ ( " + QUERY_PATTERN + "|" + COUNT_PATTERN + "|" + EXISTS_PATTERN + "|" + DELETE_PATTERN + " )  (  ( \\p{Lu}.*? )  ) ??By" ) ;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private  Object subject;^64^^^^^^^[REPLACE] private final Subject subject;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private final Object predicate;^69^^^^^^^[REPLACE] private final Predicate predicate;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private final List<Part> children ;^233^^^^^^^[REPLACE] private final List<Part> children = new ArrayList<Part> (  ) ;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static   char  DISTINCT = "Distinct";^275^^^^^^^[REPLACE] private static final String DISTINCT = "Distinct";^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static final Object COUNT_BY_TEMPLATE = Pattern.compile ( "^count ( \\p{Lu}.*? ) ??By" ) ;^276^^^^^^^[REPLACE] private static final Pattern COUNT_BY_TEMPLATE = Pattern.compile ( "^count ( \\p{Lu}.*? ) ??By" ) ;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static final Object EXISTS_BY_TEMPLATE = Pattern.compile ( "^ ( " + EXISTS_PATTERN + " )  ( \\p{Lu}.*? ) ??By" ) ;^277^^^^^^^[REPLACE] private static final Pattern EXISTS_BY_TEMPLATE = Pattern.compile ( "^ ( " + EXISTS_PATTERN + " )  ( \\p{Lu}.*? ) ??By" ) ;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static final Object DELETE_BY_TEMPLATE = Pattern.compile ( "^ ( " + DELETE_PATTERN + " )  ( \\p{Lu}.*? ) ??By" ) ;^278^^^^^^^[REPLACE] private static final Pattern DELETE_BY_TEMPLATE = Pattern.compile ( "^ ( " + DELETE_PATTERN + " )  ( \\p{Lu}.*? ) ??By" ) ;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static final String LIMITING_QUERY_PATTERN  = null ;^279^^^^^^^[REPLACE] private static final String LIMITING_QUERY_PATTERN = " ( First|Top )  ( \\d* ) ?";^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static final Pattern LIMITED_QUERY_TEMPLATE  = null ;^280^281^^^^280^281^[REPLACE] private static final Pattern LIMITED_QUERY_TEMPLATE = Pattern.compile ( "^ ( " + QUERY_PATTERN + " )  ( " + DISTINCT + " ) ?" + LIMITING_QUERY_PATTERN + " ( \\p{Lu}.*? ) ??By" ) ;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private  boolean distinct;^283^^^^^^^[REPLACE] private final boolean distinct;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private  boolean count;^284^^^^^^^[REPLACE] private final boolean count;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private  boolean exists;^285^^^^^^^[REPLACE] private final boolean exists;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private  Integer maxResults;^287^^^^^^^[REPLACE] private final Integer maxResults;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static final Pattern ALL_IGNORE_CASE  = null ;^363^^^^^^^[REPLACE] private static final Pattern ALL_IGNORE_CASE = Pattern.compile ( "AllIgnor ( ing|e ) Case" ) ;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private static final  int  ORDER_BY = "OrderBy";^364^^^^^^^[REPLACE] private static final String ORDER_BY = "OrderBy";^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private final List<OrPart> nodes  = null ;^366^^^^^^^[REPLACE] private final List<OrPart> nodes = new ArrayList<OrPart> (  ) ;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private  OrderBySource orderBySource;^367^^^^^^^[REPLACE] private final OrderBySource orderBySource;^ [CLASS] PartTree OrPart Subject Predicate  
[REPLACE]^private  List<Part> children = new ArrayList<Part> (  ) ;^233^^^^^^^[REPLACE] private final List<Part> children = new ArrayList<Part> (  ) ;^[METHOD] getOrderBySource [TYPE] OrderBySource [PARAMETER] [CLASS] OrPart   [TYPE]  Integer maxResults  [TYPE]  Pattern ALL_IGNORE_CASE  COUNT_BY_TEMPLATE  DELETE_BY_TEMPLATE  EXISTS_BY_TEMPLATE  LIMITED_QUERY_TEMPLATE  PREFIX_TEMPLATE  pattern  [TYPE]  boolean alwaysIgnoreCase  count  delete  distinct  exists  false  true  [TYPE]  OrderBySource orderBySource  [TYPE]  List children  nodes  result  [TYPE]  String COUNT_PATTERN  DELETE_PATTERN  DISTINCT  EXISTS_PATTERN  KEYWORD_TEMPLATE  LIMITING_QUERY_PATTERN  ORDER_BY  QUERY_PATTERN  keyword  part  predicate  source  subject  text  [TYPE]  Subject subject  [TYPE]  Predicate predicate 
[REPLACE]^private static  String DISTINCT = "Distinct";^275^^^^^^^[REPLACE] private static final String DISTINCT = "Distinct";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subject   [TYPE]  List children  [TYPE]  boolean false  true 
[REPLACE]^private static final Pattern COUNT_BY_TEMPLATE ;^276^^^^^^^[REPLACE] private static final Pattern COUNT_BY_TEMPLATE = Pattern.compile ( "^count ( \\p{Lu}.*? ) ??By" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subject   [TYPE]  List children  [TYPE]  boolean false  true 
[REPLACE]^private static final Pattern EXISTS_BY_TEMPLATE ;^277^^^^^^^[REPLACE] private static final Pattern EXISTS_BY_TEMPLATE = Pattern.compile ( "^ ( " + EXISTS_PATTERN + " )  ( \\p{Lu}.*? ) ??By" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subject   [TYPE]  List children  [TYPE]  boolean false  true 
[REPLACE]^private static final Sort DELETE_BY_TEMPLATE = Pattern.compile ( "^ ( " + DELETE_PATTERN + " )  ( \\p{Lu}.*? ) ??By" ) ;^278^^^^^^^[REPLACE] private static final Pattern DELETE_BY_TEMPLATE = Pattern.compile ( "^ ( " + DELETE_PATTERN + " )  ( \\p{Lu}.*? ) ??By" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subject   [TYPE]  List children  [TYPE]  boolean false  true 
[REPLACE]^private static final String LIMITING_QUERY_PATTERN ;^279^^^^^^^[REPLACE] private static final String LIMITING_QUERY_PATTERN = " ( First|Top )  ( \\d* ) ?";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subject   [TYPE]  List children  [TYPE]  boolean false  true 
[REPLACE]^private  final Object LIMITED_QUERY_TEMPLATE = Pattern.compile ( "^ ( " + QUERY_PATTERN + " )  ( " + DISTINCT + " ) ?" + LIMITING_QUERY_PATTERN + " ( \\p{Lu}.*? ) ??By" ) ;^280^281^^^^280^281^[REPLACE] private static final Pattern LIMITED_QUERY_TEMPLATE = Pattern.compile ( "^ ( " + QUERY_PATTERN + " )  ( " + DISTINCT + " ) ?" + LIMITING_QUERY_PATTERN + " ( \\p{Lu}.*? ) ??By" ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subject   [TYPE]  List children  [TYPE]  boolean false  true 
[REPLACE]^private  boolean distinct;^283^^^^^^^[REPLACE] private final boolean distinct;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subject   [TYPE]  List children  [TYPE]  boolean false  true 
[REPLACE]^private  boolean count;^284^^^^^^^[REPLACE] private final boolean count;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subject   [TYPE]  List children  [TYPE]  boolean false  true 
[REPLACE]^private  boolean exists;^285^^^^^^^[REPLACE] private final boolean exists;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subject   [TYPE]  List children  [TYPE]  boolean false  true 
[REPLACE]^private  boolean delete;^286^^^^^^^[REPLACE] private final boolean delete;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subject   [TYPE]  List children  [TYPE]  boolean false  true 
[REPLACE]^private final Iterator maxResults;^287^^^^^^^[REPLACE] private final Integer maxResults;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subject   [TYPE]  List children  [TYPE]  boolean false  true 
[REPLACE]^private static  Pattern ALL_IGNORE_CASE = Pattern.compile ( "AllIgnor ( ing|e ) Case" ) ;^363^^^^^^^[REPLACE] private static final Pattern ALL_IGNORE_CASE = Pattern.compile ( "AllIgnor ( ing|e ) Case" ) ;^[METHOD] matches [TYPE] boolean [PARAMETER] String subject Pattern pattern [CLASS] Predicate   [TYPE]  Integer maxResults  [TYPE]  Pattern COUNT_BY_TEMPLATE  DELETE_BY_TEMPLATE  EXISTS_BY_TEMPLATE  LIMITED_QUERY_TEMPLATE  pattern  [TYPE]  boolean count  delete  distinct  exists  false  true  [TYPE]  String DISTINCT  LIMITING_QUERY_PATTERN  subject 
[REPLACE]^private static final String ORDER_BY ;^364^^^^^^^[REPLACE] private static final String ORDER_BY = "OrderBy";^[METHOD] matches [TYPE] boolean [PARAMETER] String subject Pattern pattern [CLASS] Predicate   [TYPE]  Integer maxResults  [TYPE]  Pattern COUNT_BY_TEMPLATE  DELETE_BY_TEMPLATE  EXISTS_BY_TEMPLATE  LIMITED_QUERY_TEMPLATE  pattern  [TYPE]  boolean count  delete  distinct  exists  false  true  [TYPE]  String DISTINCT  LIMITING_QUERY_PATTERN  subject 
[REPLACE]^private final List<OrPart> nodes  = null ;^366^^^^^^^[REPLACE] private final List<OrPart> nodes = new ArrayList<OrPart> (  ) ;^[METHOD] matches [TYPE] boolean [PARAMETER] String subject Pattern pattern [CLASS] Predicate   [TYPE]  Integer maxResults  [TYPE]  Pattern COUNT_BY_TEMPLATE  DELETE_BY_TEMPLATE  EXISTS_BY_TEMPLATE  LIMITED_QUERY_TEMPLATE  pattern  [TYPE]  boolean count  delete  distinct  exists  false  true  [TYPE]  String DISTINCT  LIMITING_QUERY_PATTERN  subject 
[REPLACE]^private  OrderBySource orderBySource;^367^^^^^^^[REPLACE] private final OrderBySource orderBySource;^[METHOD] matches [TYPE] boolean [PARAMETER] String subject Pattern pattern [CLASS] Predicate   [TYPE]  Integer maxResults  [TYPE]  Pattern COUNT_BY_TEMPLATE  DELETE_BY_TEMPLATE  EXISTS_BY_TEMPLATE  LIMITED_QUERY_TEMPLATE  pattern  [TYPE]  boolean count  delete  distinct  exists  false  true  [TYPE]  String DISTINCT  LIMITING_QUERY_PATTERN  subject 