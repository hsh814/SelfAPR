[P1_Replace_Type]^private static final  int  serialVersionUID = 7450927208116179316L;^60^^^^^55^65^private static final long serialVersionUID = 7450927208116179316L;^[CLASS] FixedSizeMap   [VARIABLES] 
[P8_Replace_Mix]^private static final  int  serialVersionUID = 7450927208116179316;^60^^^^^55^65^private static final long serialVersionUID = 7450927208116179316L;^[CLASS] FixedSizeMap   [VARIABLES] 
[P8_Replace_Mix]^super ( 2 ) ;^84^^^^^83^85^super ( map ) ;^[CLASS] FixedSizeMap  [METHOD] <init> [RETURN_TYPE] Map)   Map<K, V> map [VARIABLES] Map  map  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^84^^^^^83^85^super ( map ) ;^[CLASS] FixedSizeMap  [METHOD] <init> [RETURN_TYPE] Map)   Map<K, V> map [VARIABLES] Map  map  long  serialVersionUID  boolean  
[P7_Replace_Invocation]^out.writeObject (  ) ;^96^^^^^95^98^out.defaultWriteObject (  ) ;^[CLASS] FixedSizeMap  [METHOD] writeObject [RETURN_TYPE] void   ObjectOutputStream out [VARIABLES] ObjectOutputStream  out  long  serialVersionUID  boolean  
[P7_Replace_Invocation]^out .writeObject ( out )  ;^96^^^^^95^98^out.defaultWriteObject (  ) ;^[CLASS] FixedSizeMap  [METHOD] writeObject [RETURN_TYPE] void   ObjectOutputStream out [VARIABLES] ObjectOutputStream  out  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^96^97^^^^95^98^out.defaultWriteObject (  ) ; out.writeObject ( map ) ;^[CLASS] FixedSizeMap  [METHOD] writeObject [RETURN_TYPE] void   ObjectOutputStream out [VARIABLES] ObjectOutputStream  out  long  serialVersionUID  boolean  
[P11_Insert_Donor_Statement]^in.defaultReadObject (  ) ;out.defaultWriteObject (  ) ;^96^^^^^95^98^out.defaultWriteObject (  ) ;^[CLASS] FixedSizeMap  [METHOD] writeObject [RETURN_TYPE] void   ObjectOutputStream out [VARIABLES] ObjectOutputStream  out  long  serialVersionUID  boolean  
[P11_Insert_Donor_Statement]^out.writeObject ( map ) ;out.defaultWriteObject (  ) ;^96^^^^^95^98^out.defaultWriteObject (  ) ;^[CLASS] FixedSizeMap  [METHOD] writeObject [RETURN_TYPE] void   ObjectOutputStream out [VARIABLES] ObjectOutputStream  out  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^97^^^^^95^98^out.writeObject ( map ) ;^[CLASS] FixedSizeMap  [METHOD] writeObject [RETURN_TYPE] void   ObjectOutputStream out [VARIABLES] ObjectOutputStream  out  long  serialVersionUID  boolean  
[P11_Insert_Donor_Statement]^out.defaultWriteObject (  ) ;out.writeObject ( map ) ;^97^^^^^95^98^out.writeObject ( map ) ;^[CLASS] FixedSizeMap  [METHOD] writeObject [RETURN_TYPE] void   ObjectOutputStream out [VARIABLES] ObjectOutputStream  out  long  serialVersionUID  boolean  
[P7_Replace_Invocation]^in .readObject ( in )  ;^110^^^^^109^112^in.defaultReadObject (  ) ;^[CLASS] FixedSizeMap  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream in [VARIABLES] long  serialVersionUID  ObjectInputStream  in  boolean  
[P14_Delete_Statement]^^110^^^^^109^112^in.defaultReadObject (  ) ;^[CLASS] FixedSizeMap  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream in [VARIABLES] long  serialVersionUID  ObjectInputStream  in  boolean  
[P11_Insert_Donor_Statement]^out.defaultWriteObject (  ) ;in.defaultReadObject (  ) ;^110^^^^^109^112^in.defaultReadObject (  ) ;^[CLASS] FixedSizeMap  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream in [VARIABLES] long  serialVersionUID  ObjectInputStream  in  boolean  
[P8_Replace_Mix]^map =   ( Map<K, V> )  null.readObject (  ) ;^111^^^^^109^112^map =  ( Map<K, V> )  in.readObject (  ) ;^[CLASS] FixedSizeMap  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream in [VARIABLES] long  serialVersionUID  ObjectInputStream  in  boolean  
[P14_Delete_Statement]^^111^^^^^109^112^map =  ( Map<K, V> )  in.readObject (  ) ;^[CLASS] FixedSizeMap  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream in [VARIABLES] long  serialVersionUID  ObjectInputStream  in  boolean  
[P2_Replace_Operator]^if  ( map.containsKey ( key )  != false )  {^117^^^^^116^121^if  ( map.containsKey ( key )  == false )  {^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P3_Replace_Literal]^if  ( map.containsKey ( key )  == true )  {^117^^^^^116^121^if  ( map.containsKey ( key )  == false )  {^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P5_Replace_Variable]^if  ( key.containsKey ( map )  == false )  {^117^^^^^116^121^if  ( map.containsKey ( key )  == false )  {^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P7_Replace_Invocation]^if  ( map.putAll ( key )  == false )  {^117^^^^^116^121^if  ( map.containsKey ( key )  == false )  {^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P7_Replace_Invocation]^if  ( map .entrySet (  )   == false )  {^117^^^^^116^121^if  ( map.containsKey ( key )  == false )  {^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P9_Replace_Statement]^if  ( !containsKey ( key )  )  {^117^^^^^116^121^if  ( map.containsKey ( key )  == false )  {^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");^117^118^119^^^116^121^if  ( map.containsKey ( key )  == false )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P16_Remove_Block]^^117^118^119^^^116^121^if  ( map.containsKey ( key )  == false )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P13_Insert_Block]^if  ( ! ( containsKey ( key )  )  )  {     throw new IllegalArgumentException ( "Cannot put new key/value pair - Map is fixed size" ) ; }^117^^^^^116^121^[Delete]^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P13_Insert_Block]^if  (  ( map.containsKey ( key )  )  == false )  {     throw new IllegalArgumentException ( "Cannot put new key/value pair - Map is fixed size" ) ; }^118^^^^^116^121^[Delete]^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P13_Insert_Block]^if  ( ! ( containsKey ( key )  )  )  {     throw new IllegalArgumentException ( "Cannot put new key/value pair - Map is fixed size" ) ; }^118^^^^^116^121^[Delete]^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P8_Replace_Mix]^return ;^118^^^^^116^121^throw new IllegalArgumentException  (" ")  ;^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P11_Insert_Donor_Statement]^throw new UnsupportedOperationException  (" ")  ;throw new IllegalArgumentException  (" ")  ;^118^^^^^116^121^throw new IllegalArgumentException  (" ")  ;^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P5_Replace_Variable]^return 3.put ( key, value ) ;^120^^^^^116^121^return map.put ( key, value ) ;^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P5_Replace_Variable]^return map.put (  value ) ;^120^^^^^116^121^return map.put ( key, value ) ;^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P5_Replace_Variable]^return map.put ( key ) ;^120^^^^^116^121^return map.put ( key, value ) ;^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P5_Replace_Variable]^return key.put ( map, value ) ;^120^^^^^116^121^return map.put ( key, value ) ;^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P5_Replace_Variable]^return value.put ( key, map ) ;^120^^^^^116^121^return map.put ( key, value ) ;^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P5_Replace_Variable]^return null.put ( key, value ) ;^120^^^^^116^121^return map.put ( key, value ) ;^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P14_Delete_Statement]^^120^^^^^116^121^return map.put ( key, value ) ;^[CLASS] FixedSizeMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  
[P7_Replace_Invocation]^if  ( !putAll ( key )  )  {^126^^^^^124^131^if  ( !containsKey ( key )  )  {^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P9_Replace_Statement]^if  ( map.containsKey ( key )  == false )  {^126^^^^^124^131^if  ( !containsKey ( key )  )  {^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");^126^127^128^^^124^131^if  ( !containsKey ( key )  )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P16_Remove_Block]^^126^127^128^^^124^131^if  ( !containsKey ( key )  )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P13_Insert_Block]^if  (  ( map.containsKey ( key )  )  == false )  {     throw new IllegalArgumentException ( "Cannot put new key/value pair - Map is fixed size" ) ; }^126^^^^^124^131^[Delete]^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P13_Insert_Block]^if  (  ( map.containsKey ( key )  )  == false )  {     throw new IllegalArgumentException ( "Cannot put new key/value pair - Map is fixed size" ) ; }^127^^^^^124^131^[Delete]^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P13_Insert_Block]^if  ( ! ( containsKey ( key )  )  )  {     throw new IllegalArgumentException ( "Cannot put new key/value pair - Map is fixed size" ) ; }^127^^^^^124^131^[Delete]^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P11_Insert_Donor_Statement]^throw new UnsupportedOperationException  (" ")  ;throw new IllegalArgumentException  (" ")  ;^127^^^^^124^131^throw new IllegalArgumentException  (" ")  ;^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P8_Replace_Mix]^for  ( final K key : this.keySet (  )  )  {^125^^^^^124^131^for  ( final K key : mapToCopy.keySet (  )  )  {^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P14_Delete_Statement]^^125^126^127^128^^124^131^for  ( final K key : mapToCopy.keySet (  )  )  { if  ( !containsKey ( key )  )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P5_Replace_Variable]^map.putAll ( map ) ;^130^^^^^124^131^map.putAll ( mapToCopy ) ;^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P5_Replace_Variable]^map.putAll ( mapToCopyToCopy ) ;^130^^^^^124^131^map.putAll ( mapToCopy ) ;^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P7_Replace_Invocation]^map.containsKey ( mapToCopy ) ;^130^^^^^124^131^map.putAll ( mapToCopy ) ;^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P14_Delete_Statement]^^130^^^^^124^131^map.putAll ( mapToCopy ) ;^[CLASS] FixedSizeMap  [METHOD] putAll [RETURN_TYPE] void   Map<? extends K, ? extends V> mapToCopy [VARIABLES] K  key  boolean  Map  mapToCopy  long  serialVersionUID  
[P8_Replace_Mix]^throw new IllegalArgumentException  (" ")  ; ;^135^^^^^134^136^throw new UnsupportedOperationException  (" ")  ;^[CLASS] FixedSizeMap  [METHOD] clear [RETURN_TYPE] void   [VARIABLES] long  serialVersionUID  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalArgumentException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^135^^^^^134^136^throw new UnsupportedOperationException  (" ")  ;^[CLASS] FixedSizeMap  [METHOD] clear [RETURN_TYPE] void   [VARIABLES] long  serialVersionUID  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalArgumentException  (" ")  ;throw new UnsupportedOperationException  (" ")  ;^140^^^^^139^141^throw new UnsupportedOperationException  (" ")  ;^[CLASS] FixedSizeMap  [METHOD] remove [RETURN_TYPE] V   Object key [VARIABLES] long  serialVersionUID  Object  key  boolean  
[P7_Replace_Invocation]^final Set<Map.Entry<K, V>> set = map.keySet (  ) ;^145^^^^^144^148^final Set<Map.Entry<K, V>> set = map.entrySet (  ) ;^[CLASS] FixedSizeMap  [METHOD] entrySet [RETURN_TYPE] Set   [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P11_Insert_Donor_Statement]^final Set<K> set = map.keySet (  ) ;final Set<Map.Entry<K, V>> set = map.entrySet (  ) ;^145^^^^^144^148^final Set<Map.Entry<K, V>> set = map.entrySet (  ) ;^[CLASS] FixedSizeMap  [METHOD] entrySet [RETURN_TYPE] Set   [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P14_Delete_Statement]^^145^^^^^144^148^final Set<Map.Entry<K, V>> set = map.entrySet (  ) ;^[CLASS] FixedSizeMap  [METHOD] entrySet [RETURN_TYPE] Set   [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P14_Delete_Statement]^^147^148^^^^144^148^return UnmodifiableSet.unmodifiableSet ( set ) ; }^[CLASS] FixedSizeMap  [METHOD] entrySet [RETURN_TYPE] Set   [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P7_Replace_Invocation]^final Set<K> set = map.entrySet (  ) ;^152^^^^^151^154^final Set<K> set = map.keySet (  ) ;^[CLASS] FixedSizeMap  [METHOD] keySet [RETURN_TYPE] Set   [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P7_Replace_Invocation]^final Set<K> set = map .keySet (  )  ;^152^^^^^151^154^final Set<K> set = map.keySet (  ) ;^[CLASS] FixedSizeMap  [METHOD] keySet [RETURN_TYPE] Set   [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P11_Insert_Donor_Statement]^final Set<Map.Entry<K, V>> set = map.entrySet (  ) ;final Set<K> set = map.keySet (  ) ;^152^^^^^151^154^final Set<K> set = map.keySet (  ) ;^[CLASS] FixedSizeMap  [METHOD] keySet [RETURN_TYPE] Set   [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P11_Insert_Donor_Statement]^final Collection<V> coll = map.values (  ) ;final Set<K> set = map.keySet (  ) ;^152^^^^^151^154^final Set<K> set = map.keySet (  ) ;^[CLASS] FixedSizeMap  [METHOD] keySet [RETURN_TYPE] Set   [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P14_Delete_Statement]^^152^^^^^151^154^final Set<K> set = map.keySet (  ) ;^[CLASS] FixedSizeMap  [METHOD] keySet [RETURN_TYPE] Set   [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P14_Delete_Statement]^^153^154^^^^151^154^return UnmodifiableSet.unmodifiableSet ( set ) ; }^[CLASS] FixedSizeMap  [METHOD] keySet [RETURN_TYPE] Set   [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P7_Replace_Invocation]^final Collection<V> coll = map.keySet (  ) ;^158^^^^^157^160^final Collection<V> coll = map.values (  ) ;^[CLASS] FixedSizeMap  [METHOD] values [RETURN_TYPE] Collection   [VARIABLES] Collection  coll  long  serialVersionUID  boolean  
[P11_Insert_Donor_Statement]^final Set<K> set = map.keySet (  ) ;final Collection<V> coll = map.values (  ) ;^158^^^^^157^160^final Collection<V> coll = map.values (  ) ;^[CLASS] FixedSizeMap  [METHOD] values [RETURN_TYPE] Collection   [VARIABLES] Collection  coll  long  serialVersionUID  boolean  
[P5_Replace_Variable]^final Collection<V> coll = this.values (  ) ;^158^^^^^157^160^final Collection<V> coll = map.values (  ) ;^[CLASS] FixedSizeMap  [METHOD] values [RETURN_TYPE] Collection   [VARIABLES] Collection  coll  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^158^159^^^^157^160^final Collection<V> coll = map.values (  ) ; return UnmodifiableCollection.unmodifiableCollection ( coll ) ;^[CLASS] FixedSizeMap  [METHOD] values [RETURN_TYPE] Collection   [VARIABLES] Collection  coll  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^159^160^^^^157^160^return UnmodifiableCollection.unmodifiableCollection ( coll ) ; }^[CLASS] FixedSizeMap  [METHOD] values [RETURN_TYPE] Collection   [VARIABLES] Collection  coll  long  serialVersionUID  boolean  
[P3_Replace_Literal]^return false;^163^^^^^162^164^return true;^[CLASS] FixedSizeMap  [METHOD] isFull [RETURN_TYPE] boolean   [VARIABLES] long  serialVersionUID  boolean  
[P3_Replace_Literal]^return size() + 3 ;^167^^^^^166^168^return size (  ) ;^[CLASS] FixedSizeMap  [METHOD] maxSize [RETURN_TYPE] int   [VARIABLES] long  serialVersionUID  boolean  
[P3_Replace_Literal]^return size() - 7 ;^167^^^^^166^168^return size (  ) ;^[CLASS] FixedSizeMap  [METHOD] maxSize [RETURN_TYPE] int   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^167^^^^^166^168^return size (  ) ;^[CLASS] FixedSizeMap  [METHOD] maxSize [RETURN_TYPE] int   [VARIABLES] long  serialVersionUID  boolean  