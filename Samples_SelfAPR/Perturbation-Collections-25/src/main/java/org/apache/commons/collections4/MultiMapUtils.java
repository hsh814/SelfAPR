[P8_Replace_Mix]^public  final MultiValuedMap EMPTY_MULTI_VALUED_MAP = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap ( new MultiValuedHashMap (  )  ) ;^54^55^^^^54^55^public static final MultiValuedMap EMPTY_MULTI_VALUED_MAP = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap ( new MultiValuedHashMap (  )  ) ;^[CLASS] MultiMapUtils   [VARIABLES] 
[P2_Replace_Operator]^return map != null ? EMPTY_MULTI_VALUED_MAP : map;^82^^^^^81^83^return map == null ? EMPTY_MULTI_VALUED_MAP : map;^[CLASS] MultiMapUtils  [METHOD] emptyIfNull [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P5_Replace_Variable]^return EMPTY_MULTI_VALUED_MAP == null ? map : map;^82^^^^^81^83^return map == null ? EMPTY_MULTI_VALUED_MAP : map;^[CLASS] MultiMapUtils  [METHOD] emptyIfNull [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P6_Replace_Expression]^return map ( map;^82^^^^^81^83^return map == null ? EMPTY_MULTI_VALUED_MAP : map;^[CLASS] MultiMapUtils  [METHOD] emptyIfNull [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P8_Replace_Mix]^return map;^82^^^^^81^83^return map == null ? EMPTY_MULTI_VALUED_MAP : map;^[CLASS] MultiMapUtils  [METHOD] emptyIfNull [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P2_Replace_Operator]^return map == null && map.isEmpty (  ) ;^94^^^^^93^95^return map == null || map.isEmpty (  ) ;^[CLASS] MultiMapUtils  [METHOD] isEmpty [RETURN_TYPE] boolean   MultiValuedMap<?, ?> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P2_Replace_Operator]^return map != null || map.isEmpty (  ) ;^94^^^^^93^95^return map == null || map.isEmpty (  ) ;^[CLASS] MultiMapUtils  [METHOD] isEmpty [RETURN_TYPE] boolean   MultiValuedMap<?, ?> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P7_Replace_Invocation]^return map == null || map.get (  ) ;^94^^^^^93^95^return map == null || map.isEmpty (  ) ;^[CLASS] MultiMapUtils  [METHOD] isEmpty [RETURN_TYPE] boolean   MultiValuedMap<?, ?> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P8_Replace_Mix]^return   map.get (  ) ;^94^^^^^93^95^return map == null || map.isEmpty (  ) ;^[CLASS] MultiMapUtils  [METHOD] isEmpty [RETURN_TYPE] boolean   MultiValuedMap<?, ?> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P5_Replace_Variable]^return 4 == null || map.isEmpty (  ) ;^94^^^^^93^95^return map == null || map.isEmpty (  ) ;^[CLASS] MultiMapUtils  [METHOD] isEmpty [RETURN_TYPE] boolean   MultiValuedMap<?, ?> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P14_Delete_Statement]^^94^^^^^93^95^return map == null || map.isEmpty (  ) ;^[CLASS] MultiMapUtils  [METHOD] isEmpty [RETURN_TYPE] boolean   MultiValuedMap<?, ?> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P2_Replace_Operator]^if  ( map == null )  {^110^^^^^109^114^if  ( map != null )  {^[CLASS] MultiMapUtils  [METHOD] getCollection [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  K  key  boolean  
[P8_Replace_Mix]^if  ( map != true )  {^110^^^^^109^114^if  ( map != null )  {^[CLASS] MultiMapUtils  [METHOD] getCollection [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  K  key  boolean  
[P15_Unwrap_Block]^return map.get(key);^110^111^112^^^109^114^if  ( map != null )  { return map.get ( key ) ; }^[CLASS] MultiMapUtils  [METHOD] getCollection [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  K  key  boolean  
[P16_Remove_Block]^^110^111^112^^^109^114^if  ( map != null )  { return map.get ( key ) ; }^[CLASS] MultiMapUtils  [METHOD] getCollection [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  K  key  boolean  
[P5_Replace_Variable]^return key.get ( map ) ;^111^^^^^109^114^return map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getCollection [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  K  key  boolean  
[P14_Delete_Statement]^^111^^^^^109^114^return map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getCollection [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  K  key  boolean  
[P8_Replace_Mix]^return true;^113^^^^^109^114^return null;^[CLASS] MultiMapUtils  [METHOD] getCollection [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  K  key  boolean  
[P2_Replace_Operator]^if  ( map == null )  {^129^^^^^128^137^if  ( map != null )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P6_Replace_Expression]^if  ( col instanceof List )  {^129^^^^^128^137^if  ( map != null )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P8_Replace_Mix]^if  ( map != this )  {^129^^^^^128^137^if  ( map != null )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P15_Unwrap_Block]^java.util.Collection<V> col = map.get(key); if (col instanceof java.util.List) {    return ((java.util.List<V>) (col));}; return new java.util.ArrayList<V>(col);^129^130^131^132^133^128^137^if  ( map != null )  { Collection<V> col = map.get ( key ) ; if  ( col instanceof List )  { return  ( List<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P16_Remove_Block]^^129^130^131^132^133^128^137^if  ( map != null )  { Collection<V> col = map.get ( key ) ; if  ( col instanceof List )  { return  ( List<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( map != null )  {     Collection<V> col = map.get ( key ) ;     if  ( col instanceof Bag )  {         return  (  ( Bag<V> )   ( col )  ) ;     }     return new HashBag<V> ( col ) ; }^129^^^^^128^137^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( map != null )  {     Collection<V> col = map.get ( key ) ;     if  ( col instanceof Set )  {         return  (  ( Set<V> )   ( col )  ) ;     }     return new HashSet<V> ( col ) ; }^129^^^^^128^137^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P2_Replace_Operator]^if  ( col  &&  List )  {^131^^^^^128^137^if  ( col instanceof List )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P9_Replace_Statement]^if  ( col instanceof Bag )  {^131^^^^^128^137^if  ( col instanceof List )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P9_Replace_Statement]^if  ( col instanceof Set )  {^131^^^^^128^137^if  ( col instanceof List )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P15_Unwrap_Block]^return ((java.util.List<V>) (col));^131^132^133^^^128^137^if  ( col instanceof List )  { return  ( List<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P16_Remove_Block]^^131^132^133^^^128^137^if  ( col instanceof List )  { return  ( List<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( col instanceof Set )  {     return  (  ( Set<V> )   ( col )  ) ; }^131^^^^^128^137^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( col instanceof Bag )  {     return  (  ( Bag<V> )   ( col )  ) ; }^131^^^^^128^137^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P1_Replace_Type]^return new  LinkedList <V> ( col ) ;^134^^^^^128^137^return new ArrayList<V> ( col ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P4_Replace_Constructor]^return return  new HashSet<V> ( col )  ;^134^^^^^128^137^return new ArrayList<V> ( col ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P8_Replace_Mix]^return  new HashSet<V> ( col )  ;^134^^^^^128^137^return new ArrayList<V> ( col ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P1_Replace_Type]^return new  LinkedHashSet <V> ( col ) ;^134^^^^^128^137^return new ArrayList<V> ( col ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P5_Replace_Variable]^Collection<V> col = key.get ( map ) ;^130^^^^^128^137^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P14_Delete_Statement]^^130^^^^^128^137^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P11_Insert_Donor_Statement]^return map.get ( key ) ;Collection<V> col = map.get ( key ) ;^130^^^^^128^137^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P2_Replace_Operator]^if  ( col  &  List )  {^131^^^^^128^137^if  ( col instanceof List )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P1_Replace_Type]^return new  Set <V> ( col ) ;^134^^^^^128^137^return new ArrayList<V> ( col ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P8_Replace_Mix]^return new ArrayList<V> ( null ) ;^134^^^^^128^137^return new ArrayList<V> ( col ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P5_Replace_Variable]^Collection<V> col = 2.get ( key ) ;^130^^^^^128^137^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P8_Replace_Mix]^return true;^136^^^^^128^137^return null;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P2_Replace_Operator]^if  ( map == null )  {^149^^^^^148^157^if  ( map != null )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P6_Replace_Expression]^if  ( col instanceof Set )  {^149^^^^^148^157^if  ( map != null )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P8_Replace_Mix]^if  ( map != this )  {^149^^^^^148^157^if  ( map != null )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P15_Unwrap_Block]^java.util.Collection<V> col = map.get(key); if (col instanceof java.util.Set) {    return ((java.util.Set<V>) (col));}; return new java.util.HashSet<V>(col);^149^150^151^152^153^148^157^if  ( map != null )  { Collection<V> col = map.get ( key ) ; if  ( col instanceof Set )  { return  ( Set<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P16_Remove_Block]^^149^150^151^152^153^148^157^if  ( map != null )  { Collection<V> col = map.get ( key ) ; if  ( col instanceof Set )  { return  ( Set<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( map != null )  {     Collection<V> col = map.get ( key ) ;     if  ( col instanceof Bag )  {         return  (  ( Bag<V> )   ( col )  ) ;     }     return new HashBag<V> ( col ) ; }^149^^^^^148^157^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( map != null )  {     Collection<V> col = map.get ( key ) ;     if  ( col instanceof List )  {         return  (  ( List<V> )   ( col )  ) ;     }     return new ArrayList<V> ( col ) ; }^149^^^^^148^157^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P2_Replace_Operator]^if  ( col  &&  Set )  {^151^^^^^148^157^if  ( col instanceof Set )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P9_Replace_Statement]^if  ( col instanceof Bag )  {^151^^^^^148^157^if  ( col instanceof Set )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P9_Replace_Statement]^if  ( col instanceof List )  {^151^^^^^148^157^if  ( col instanceof Set )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P15_Unwrap_Block]^return ((java.util.Set<V>) (col));^151^152^153^^^148^157^if  ( col instanceof Set )  { return  ( Set<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P16_Remove_Block]^^151^152^153^^^148^157^if  ( col instanceof Set )  { return  ( Set<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( col instanceof List )  {     return  (  ( List<V> )   ( col )  ) ; }^151^^^^^148^157^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( col instanceof Bag )  {     return  (  ( Bag<V> )   ( col )  ) ; }^151^^^^^148^157^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P4_Replace_Constructor]^return return  new ArrayList<V> ( col )  ;^154^^^^^148^157^return new HashSet<V> ( col ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P8_Replace_Mix]^return  new ArrayList<V> ( col )  ;^154^^^^^148^157^return new HashSet<V> ( col ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P5_Replace_Variable]^Collection<V> col = key.get ( map ) ;^150^^^^^148^157^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P14_Delete_Statement]^^150^^^^^148^157^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P11_Insert_Donor_Statement]^return map.get ( key ) ;Collection<V> col = map.get ( key ) ;^150^^^^^148^157^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P2_Replace_Operator]^if  ( col  <<  Set )  {^151^^^^^148^157^if  ( col instanceof Set )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P8_Replace_Mix]^return false;^156^^^^^148^157^return null;^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P2_Replace_Operator]^if  ( map == null )  {^169^^^^^168^177^if  ( map != null )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P6_Replace_Expression]^if  ( col instanceof Bag )  {^169^^^^^168^177^if  ( map != null )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P8_Replace_Mix]^if  ( map != false )  {^169^^^^^168^177^if  ( map != null )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P15_Unwrap_Block]^java.util.Collection<V> col = map.get(key); if (col instanceof org.apache.commons.collections4.Bag) {    return ((org.apache.commons.collections4.Bag<V>) (col));}; return new org.apache.commons.collections4.bag.HashBag<V>(col);^169^170^171^172^173^168^177^if  ( map != null )  { Collection<V> col = map.get ( key ) ; if  ( col instanceof Bag )  { return  ( Bag<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P16_Remove_Block]^^169^170^171^172^173^168^177^if  ( map != null )  { Collection<V> col = map.get ( key ) ; if  ( col instanceof Bag )  { return  ( Bag<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( map != null )  {     Collection<V> col = map.get ( key ) ;     if  ( col instanceof Set )  {         return  (  ( Set<V> )   ( col )  ) ;     }     return new HashSet<V> ( col ) ; }^169^^^^^168^177^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( map != null )  {     Collection<V> col = map.get ( key ) ;     if  ( col instanceof List )  {         return  (  ( List<V> )   ( col )  ) ;     }     return new ArrayList<V> ( col ) ; }^169^^^^^168^177^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P2_Replace_Operator]^if  ( col  >=  Bag )  {^171^^^^^168^177^if  ( col instanceof Bag )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P9_Replace_Statement]^if  ( col instanceof Set )  {^171^^^^^168^177^if  ( col instanceof Bag )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P9_Replace_Statement]^if  ( col instanceof List )  {^171^^^^^168^177^if  ( col instanceof Bag )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P15_Unwrap_Block]^return ((org.apache.commons.collections4.Bag<V>) (col));^171^172^173^^^168^177^if  ( col instanceof Bag )  { return  ( Bag<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P16_Remove_Block]^^171^172^173^^^168^177^if  ( col instanceof Bag )  { return  ( Bag<V> )  col; }^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( col instanceof List )  {     return  (  ( List<V> )   ( col )  ) ; }^171^^^^^168^177^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P13_Insert_Block]^if  ( col instanceof Set )  {     return  (  ( Set<V> )   ( col )  ) ; }^171^^^^^168^177^[Delete]^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P5_Replace_Variable]^return new HashBag<V> ( 1 ) ;^174^^^^^168^177^return new HashBag<V> ( col ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P5_Replace_Variable]^Collection<V> col = key.get ( map ) ;^170^^^^^168^177^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P14_Delete_Statement]^^170^^^^^168^177^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P11_Insert_Donor_Statement]^return map.get ( key ) ;Collection<V> col = map.get ( key ) ;^170^^^^^168^177^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P2_Replace_Operator]^if  ( col  &  Bag )  {^171^^^^^168^177^if  ( col instanceof Bag )  {^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P8_Replace_Mix]^return new HashBag<V> ( 3 ) ;^174^^^^^168^177^return new HashBag<V> ( col ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P8_Replace_Mix]^return false;^176^^^^^168^177^return null;^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[P7_Replace_Invocation]^return MultiValuedHashMap.<K, V>setValuedHashMap (  ) ;^191^^^^^190^192^return MultiValuedHashMap.<K, V>listValuedHashMap (  ) ;^[CLASS] MultiMapUtils  [METHOD] newListValuedHashMap [RETURN_TYPE] <K,V>   [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P14_Delete_Statement]^^191^^^^^190^192^return MultiValuedHashMap.<K, V>listValuedHashMap (  ) ;^[CLASS] MultiMapUtils  [METHOD] newListValuedHashMap [RETURN_TYPE] <K,V>   [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P7_Replace_Invocation]^return MultiValuedHashMap.<K, V, C>setValuedHashMap ( listClass ) ;^205^^^^^204^206^return MultiValuedHashMap.<K, V, C>listValuedHashMap ( listClass ) ;^[CLASS] MultiMapUtils  [METHOD] newListValuedHashMap [RETURN_TYPE] <K,V,C   Class<C> listClass [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Class  listClass  boolean  
[P14_Delete_Statement]^^205^^^^^204^206^return MultiValuedHashMap.<K, V, C>listValuedHashMap ( listClass ) ;^[CLASS] MultiMapUtils  [METHOD] newListValuedHashMap [RETURN_TYPE] <K,V,C   Class<C> listClass [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Class  listClass  boolean  
[P7_Replace_Invocation]^return MultiValuedHashMap.<K, V>listValuedHashMap (  ) ;^217^^^^^216^218^return MultiValuedHashMap.<K, V>setValuedHashMap (  ) ;^[CLASS] MultiMapUtils  [METHOD] newSetValuedHashMap [RETURN_TYPE] <K,V>   [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P14_Delete_Statement]^^217^^^^^216^218^return MultiValuedHashMap.<K, V>setValuedHashMap (  ) ;^[CLASS] MultiMapUtils  [METHOD] newSetValuedHashMap [RETURN_TYPE] <K,V>   [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P5_Replace_Variable]^return MultiValuedHashMap.<K, V, C>setValuedHashMap ( this ) ;^231^^^^^230^232^return MultiValuedHashMap.<K, V, C>setValuedHashMap ( setClass ) ;^[CLASS] MultiMapUtils  [METHOD] newSetValuedHashMap [RETURN_TYPE] <K,V,C   Class<C> setClass [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Class  setClass  boolean  
[P7_Replace_Invocation]^return MultiValuedHashMap.<K, V, C>listValuedHashMap ( setClass ) ;^231^^^^^230^232^return MultiValuedHashMap.<K, V, C>setValuedHashMap ( setClass ) ;^[CLASS] MultiMapUtils  [METHOD] newSetValuedHashMap [RETURN_TYPE] <K,V,C   Class<C> setClass [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Class  setClass  boolean  
[P14_Delete_Statement]^^231^^^^^230^232^return MultiValuedHashMap.<K, V, C>setValuedHashMap ( setClass ) ;^[CLASS] MultiMapUtils  [METHOD] newSetValuedHashMap [RETURN_TYPE] <K,V,C   Class<C> setClass [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Class  setClass  boolean  
[P5_Replace_Variable]^return UnmodifiableMultiValuedMap.<K, V>unmodifiableMultiValuedMap ( this ) ;^249^^^^^247^250^return UnmodifiableMultiValuedMap.<K, V>unmodifiableMultiValuedMap ( map ) ;^[CLASS] MultiMapUtils  [METHOD] unmodifiableMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<? extends K, ? extends V> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P14_Delete_Statement]^^249^250^^^^247^250^return UnmodifiableMultiValuedMap.<K, V>unmodifiableMultiValuedMap ( map ) ; }^[CLASS] MultiMapUtils  [METHOD] unmodifiableMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<? extends K, ? extends V> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[P5_Replace_Variable]^return TransformedMultiValuedMap.transformingMap (  keyTransformer, valueTransformer ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
[P5_Replace_Variable]^return TransformedMultiValuedMap.transformingMap ( map,  valueTransformer ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
[P5_Replace_Variable]^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
[P5_Replace_Variable]^return TransformedMultiValuedMap.transformingMap ( keyTransformer, map, valueTransformer ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
[P5_Replace_Variable]^return TransformedMultiValuedMap.transformingMap ( map, valueTransformer, keyTransformer ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
[P5_Replace_Variable]^return TransformedMultiValuedMap.transformingMap ( valueTransformer, keyTransformer, map ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
[P14_Delete_Statement]^^278^279^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ; }^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
