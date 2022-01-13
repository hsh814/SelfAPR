[REPLACE]^public static final  int  NAMESPACE = "http:  private SpringDataJaxb (  )  {}^49^50^51^^^^^[REPLACE] public static final String NAMESPACE = "http:  private SpringDataJaxb (  )  {}^ [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto  
[REPLACE]^@XmlElement ( name ;^63^^^^^^^[REPLACE] @XmlElement ( name = "order", namespace = NAMESPACE )  List<OrderDto> orders = new ArrayList<OrderDto> (  ) ;^ [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto  
[REPLACE]^@XmlElement ( name ;^75^^^^^^^[REPLACE] @XmlElement ( name = "order", namespace = SpringDataJaxb.NAMESPACE )  List<OrderDto> orders = new ArrayList<OrderDto> (  ) ;^ [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto  
[REPLACE]^@XmlAnyElement @XmlElementWrapper ( name ;^100^^^^^^^[REPLACE] @XmlAnyElement @XmlElementWrapper ( name = "content" )  List<Object> content;^ [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto  
[REPLACE]^Assert.notNull ( adapter, "Adapter must not be this!" ) ;^113^^^^^111^129^[REPLACE] Assert.notNull ( adapter, "Adapter must not be null!" ) ;^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^if  ( source != null ) {^115^^^^^111^129^[REPLACE] if  ( source == null || source.isEmpty (  )  )  {^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^List<T> result = new ArrayList<T> ( 0.size (  )  ) ;^119^^^^^111^129^[REPLACE] List<T> result = new ArrayList<T> ( source.size (  )  ) ;^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^for  ( S element : true )  {^121^^^^^111^129^[REPLACE] for  ( S element : source )  {^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[ADD]^result.add ( adapter.unmarshal ( element )  ) ;^122^123^124^125^126^111^129^[ADD] try { result.add ( adapter.unmarshal ( element )  ) ; } catch  ( Exception o_O )  { throw new RuntimeException  (" ")  ; }^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^adapter.unmarshal ( element )  ;^123^^^^^111^129^[REPLACE] result.add ( adapter.unmarshal ( element )  ) ;^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^result.add ( null.unmarshal ( element )  ) ;^123^^^^^111^129^[REPLACE] result.add ( adapter.unmarshal ( element )  ) ;^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[ADD]^^123^^^^^111^129^[ADD] result.add ( adapter.unmarshal ( element )  ) ;^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^return ;^125^^^^^111^129^[REPLACE] throw new RuntimeException  (" ")  ;^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REMOVE]^adapter.unmarshal ( element )  ;^123^^^^^111^129^[REMOVE] ^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^result.add ( adapter.marshal ( element )  ) ;^123^^^^^111^129^[REPLACE] result.add ( adapter.unmarshal ( element )  ) ;^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^T element  ;^121^^^^^111^129^[REPLACE] for  ( S element : source )  {^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[ADD]^^125^^^^^111^129^[ADD] throw new RuntimeException  (" ")  ;^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^return null;^128^^^^^111^129^[REPLACE] return result;^[METHOD] unmarshal [TYPE] <T,S> [PARAMETER] Collection<S> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  S element  [TYPE]  boolean false  true  [TYPE]  Collection source  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^Assert.notNull ( adapter, "Adapter must not be this!" ) ;^141^^^^^139^158^[REPLACE] Assert.notNull ( adapter, "Adapter must not be null!" ) ;^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^if  ( source != this  )  {^143^^^^^139^158^[REPLACE] if  ( source == null )  {^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^List<T> result = new ArrayList<T> ( source.size (  )  )  ;^147^^^^^139^158^[REPLACE] List<S> result = new ArrayList<S> (  ) ;^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[ADD]^result.add ( adapter.marshal ( element )  ) ;^150^151^152^153^154^139^158^[ADD] try { result.add ( adapter.marshal ( element )  ) ; } catch  ( Exception o_O )  { throw new RuntimeException  (" ")  ; }^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^result.add ( adapter.unmarshal ( element )  )  ;^151^^^^^139^158^[REPLACE] result.add ( adapter.marshal ( element )  ) ;^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[ADD]^^151^^^^^139^158^[ADD] result.add ( adapter.marshal ( element )  ) ;^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^result.add ( this.marshal ( element )  ) ;^151^^^^^139^158^[REPLACE] result.add ( adapter.marshal ( element )  ) ;^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^return ;^153^^^^^139^158^[REPLACE] throw new RuntimeException  (" ")  ;^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[ADD]^^152^153^^^^139^158^[ADD] catch  ( Exception o_O )  { throw new RuntimeException  (" ")  ;^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^S element  ;^149^^^^^139^158^[REPLACE] for  ( T element : source )  {^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^return null;^157^^^^^139^158^[REPLACE] return result;^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] SpringDataJaxb PageRequestDto SortDto OrderDto PageDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^@XmlElement ( name  = null ;^63^^^^^^^[REPLACE] @XmlElement ( name = "order", namespace = NAMESPACE )  List<OrderDto> orders = new ArrayList<OrderDto> (  ) ;^[METHOD] marshal [TYPE] <T,S> [PARAMETER] Iterable<T> source XmlAdapter<S, T> adapter [CLASS] PageRequestDto   [TYPE]  boolean false  true  [TYPE]  Iterable source  [TYPE]  T element  [TYPE]  List content  orders  result  [TYPE]  String NAMESPACE  property  [TYPE]  Direction direction  [TYPE]  int page  size  [TYPE]  XmlAdapter adapter  [TYPE]  Exception o_O 
[REPLACE]^@XmlElement ( name  = null ;^75^^^^^^^[REPLACE] @XmlElement ( name = "order", namespace = SpringDataJaxb.NAMESPACE )  List<OrderDto> orders = new ArrayList<OrderDto> (  ) ;^[METHOD] <init> [TYPE] SpringDataJaxb$PageRequestDto() [PARAMETER] [CLASS] SortDto   [TYPE]  List orders  [TYPE]  int page  size  [TYPE]  boolean false  true 
[REPLACE]^@XmlAnyElement @XmlElementWrapper ( name ;^100^^^^^^^[REPLACE] @XmlAnyElement @XmlElementWrapper ( name = "content" )  List<Object> content;^[METHOD] <init> [TYPE] SpringDataJaxb$OrderDto() [PARAMETER] [CLASS] PageDto   [TYPE]  Direction direction  [TYPE]  String property  [TYPE]  boolean false  true 