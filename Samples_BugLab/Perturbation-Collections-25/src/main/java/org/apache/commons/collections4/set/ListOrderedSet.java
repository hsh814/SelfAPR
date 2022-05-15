[buglab_swap_variables]^if  ( list.size (  )  > 0 || set.size (  )  > 0 )  {^84^^^^^77^88^if  ( set.size (  )  > 0 || list.size (  )  > 0 )  {^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] listOrderedSet [RETURN_TYPE] <E>   Set<E> set List<E> list [VARIABLES] Collection  set  List  list  setOrder  Set  set  boolean  E  last  long  serialVersionUID  
[buglab_swap_variables]^return new ListOrderedSet<E> ( list, set ) ;^87^^^^^77^88^return new ListOrderedSet<E> ( set, list ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] listOrderedSet [RETURN_TYPE] <E>   Set<E> set List<E> list [VARIABLES] Collection  set  List  list  setOrder  Set  set  boolean  E  last  long  serialVersionUID  
[buglab_swap_variables]^return new ListOrderedSet<E> (  list ) ;^87^^^^^77^88^return new ListOrderedSet<E> ( set, list ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] listOrderedSet [RETURN_TYPE] <E>   Set<E> set List<E> list [VARIABLES] Collection  set  List  list  setOrder  Set  set  boolean  E  last  long  serialVersionUID  
[buglab_swap_variables]^return new ListOrderedSet<E> ( set ) ;^87^^^^^77^88^return new ListOrderedSet<E> ( set, list ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] listOrderedSet [RETURN_TYPE] <E>   Set<E> set List<E> list [VARIABLES] Collection  set  List  list  setOrder  Set  set  boolean  E  last  long  serialVersionUID  
[buglab_swap_variables]^return new ListOrderedSet<E> ( list, set ) ;^126^^^^^119^127^return new ListOrderedSet<E> ( set, list ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] listOrderedSet [RETURN_TYPE] <E>   List<E> list [VARIABLES] Collection  set  List  list  setOrder  Set  set  boolean  E  last  long  serialVersionUID  
[buglab_swap_variables]^return new ListOrderedSet<E> (  list ) ;^126^^^^^119^127^return new ListOrderedSet<E> ( set, list ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] listOrderedSet [RETURN_TYPE] <E>   List<E> list [VARIABLES] Collection  set  List  list  setOrder  Set  set  boolean  E  last  long  serialVersionUID  
[buglab_swap_variables]^return new ListOrderedSet<E> ( set ) ;^126^^^^^119^127^return new ListOrderedSet<E> ( set, list ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] listOrderedSet [RETURN_TYPE] <E>   List<E> list [VARIABLES] Collection  set  List  list  setOrder  Set  set  boolean  E  last  long  serialVersionUID  
[buglab_swap_variables]^for  ( Iterator<E> setOrder = it.iterator (  ) ; it.hasNext (  ) ; )  {^246^^^^^238^253^for  ( Iterator<E> it = setOrder.iterator (  ) ; it.hasNext (  ) ; )  {^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] retainAll [RETURN_TYPE] boolean   Collection<?> coll [VARIABLES] Iterator  it  Collection  coll  set  List  list  setOrder  boolean  result  E  e  last  object  long  serialVersionUID  
[buglab_swap_variables]^return a.toArray ( setOrder ) ;^262^^^^^261^263^return setOrder.toArray ( a ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] toArray [RETURN_TYPE] <T>   final T[] a [VARIABLES] Collection  coll  set  List  list  setOrder  boolean  E  e  last  object  long  serialVersionUID  T[]  a  
[buglab_swap_variables]^return index.get ( setOrder ) ;^277^^^^^276^278^return setOrder.get ( index ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] get [RETURN_TYPE] E   final int index [VARIABLES] Collection  coll  set  List  list  setOrder  boolean  E  e  last  object  long  serialVersionUID  int  index  
[buglab_swap_variables]^return object.indexOf ( setOrder ) ;^290^^^^^289^291^return setOrder.indexOf ( object ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] indexOf [RETURN_TYPE] int   Object object [VARIABLES] Collection  coll  set  List  list  setOrder  Object  object  boolean  E  e  last  object  long  serialVersionUID  
[buglab_swap_variables]^setOrder.add (  object ) ;^305^^^^^302^307^setOrder.add ( index, object ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] add [RETURN_TYPE] void   final int index final E object [VARIABLES] Collection  coll  set  List  list  setOrder  boolean  E  e  last  object  long  serialVersionUID  int  index  
[buglab_swap_variables]^setOrder.add ( object, index ) ;^305^^^^^302^307^setOrder.add ( index, object ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] add [RETURN_TYPE] void   final int index final E object [VARIABLES] Collection  coll  set  List  list  setOrder  boolean  E  e  last  object  long  serialVersionUID  int  index  
[buglab_swap_variables]^setOrder.add ( index ) ;^305^^^^^302^307^setOrder.add ( index, object ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] add [RETURN_TYPE] void   final int index final E object [VARIABLES] Collection  coll  set  List  list  setOrder  boolean  E  e  last  object  long  serialVersionUID  int  index  
[buglab_swap_variables]^setOrder.addAll (  toAdd ) ;^334^^^^^320^338^setOrder.addAll ( index, toAdd ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] addAll [RETURN_TYPE] boolean   final int index Collection<? extends E> coll [VARIABLES] Collection  coll  set  List  list  setOrder  toAdd  boolean  changed  E  e  last  object  long  serialVersionUID  int  index  
[buglab_swap_variables]^setOrder.addAll ( index ) ;^334^^^^^320^338^setOrder.addAll ( index, toAdd ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] addAll [RETURN_TYPE] boolean   final int index Collection<? extends E> coll [VARIABLES] Collection  coll  set  List  list  setOrder  toAdd  boolean  changed  E  e  last  object  long  serialVersionUID  int  index  
[buglab_swap_variables]^final E obj = index.remove ( setOrder ) ;^349^^^^^348^352^final E obj = setOrder.remove ( index ) ;^[CLASS] ListOrderedSet OrderedSetIterator  [METHOD] remove [RETURN_TYPE] E   final int index [VARIABLES] Collection  coll  set  List  list  setOrder  toAdd  boolean  E  e  last  obj  object  long  serialVersionUID  int  index  