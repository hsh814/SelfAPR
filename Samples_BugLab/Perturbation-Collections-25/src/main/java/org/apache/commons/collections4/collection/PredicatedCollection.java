[buglab_swap_variables]^return new PredicatedCollection<T> ( predicate, coll ) ;^103^^^^^101^104^return new PredicatedCollection<T> ( coll, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] predicatedCollection [RETURN_TYPE] <T>   Collection<T> coll Predicate<? super T> predicate [VARIABLES] Collection  coll  List  accepted  rejected  boolean  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^return new PredicatedCollection<T> (  predicate ) ;^103^^^^^101^104^return new PredicatedCollection<T> ( coll, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] predicatedCollection [RETURN_TYPE] <T>   Collection<T> coll Predicate<? super T> predicate [VARIABLES] Collection  coll  List  accepted  rejected  boolean  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^return new PredicatedCollection<T> ( coll ) ;^103^^^^^101^104^return new PredicatedCollection<T> ( coll, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] predicatedCollection [RETURN_TYPE] <T>   Collection<T> coll Predicate<? super T> predicate [VARIABLES] Collection  coll  List  accepted  rejected  boolean  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^if  ( object.evaluate ( predicate )  == false )  {^139^^^^^138^143^if  ( predicate.evaluate ( object )  == false )  {^[CLASS] PredicatedCollection Builder  [METHOD] validate [RETURN_TYPE] void   final E object [VARIABLES] List  accepted  rejected  boolean  E  object  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^throw new IllegalArgumentException ( "Cannot add Object '" + predicate + "' - Predicate '" + object + "' rejected it" ) ;^140^141^^^^138^143^throw new IllegalArgumentException ( "Cannot add Object '" + object + "' - Predicate '" + predicate + "' rejected it" ) ;^[CLASS] PredicatedCollection Builder  [METHOD] validate [RETURN_TYPE] void   final E object [VARIABLES] List  accepted  rejected  boolean  E  object  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^if  ( item.evaluate ( predicate )  )  {^238^^^^^237^244^if  ( predicate.evaluate ( item )  )  {^[CLASS] PredicatedCollection Builder  [METHOD] add [RETURN_TYPE] PredicatedCollection$Builder   final E item [VARIABLES] List  accepted  rejected  boolean  E  item  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^if  ( item != null )  {^256^^^^^255^262^if  ( items != null )  {^[CLASS] PredicatedCollection Builder  [METHOD] addAll [RETURN_TYPE] PredicatedCollection$Builder   Collection<? extends E> items [VARIABLES] Collection  items  List  accepted  rejected  boolean  E  item  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^if  ( itemss != null )  {^256^^^^^255^262^if  ( items != null )  {^[CLASS] PredicatedCollection Builder  [METHOD] addAll [RETURN_TYPE] PredicatedCollection$Builder   Collection<? extends E> items [VARIABLES] Collection  items  List  accepted  rejected  boolean  E  item  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^final List<E> listdList = PredicatedList.predicatedList ( predicate, predicate ) ;^291^^^^^287^294^final List<E> predicatedList = PredicatedList.predicatedList ( list, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedList [RETURN_TYPE] List   List<E> list [VARIABLES] List  accepted  list  predicatedList  rejected  boolean  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^final List<E> predicatedList = PredicatedList.predicatedList (  predicate ) ;^291^^^^^287^294^final List<E> predicatedList = PredicatedList.predicatedList ( list, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedList [RETURN_TYPE] List   List<E> list [VARIABLES] List  accepted  list  predicatedList  rejected  boolean  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^final List<E> predicatedList = PredicatedList.predicatedList ( list ) ;^291^^^^^287^294^final List<E> predicatedList = PredicatedList.predicatedList ( list, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedList [RETURN_TYPE] List   List<E> list [VARIABLES] List  accepted  list  predicatedList  rejected  boolean  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^final PredicatedSet<E> setdSet = PredicatedSet.predicatedSet ( predicate, predicate ) ;^323^^^^^319^326^final PredicatedSet<E> predicatedSet = PredicatedSet.predicatedSet ( set, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedSet [RETURN_TYPE] Set   Set<E> set [VARIABLES] List  accepted  list  predicatedList  rejected  Set  set  boolean  long  serialVersionUID  Predicate  predicate  PredicatedSet  predicatedSet  
[buglab_swap_variables]^final PredicatedSet<E> predicatedSet = PredicatedSet.predicatedSet (  predicate ) ;^323^^^^^319^326^final PredicatedSet<E> predicatedSet = PredicatedSet.predicatedSet ( set, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedSet [RETURN_TYPE] Set   Set<E> set [VARIABLES] List  accepted  list  predicatedList  rejected  Set  set  boolean  long  serialVersionUID  Predicate  predicate  PredicatedSet  predicatedSet  
[buglab_swap_variables]^final PredicatedSet<E> predicatedSet = PredicatedSet.predicatedSet ( set ) ;^323^^^^^319^326^final PredicatedSet<E> predicatedSet = PredicatedSet.predicatedSet ( set, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedSet [RETURN_TYPE] Set   Set<E> set [VARIABLES] List  accepted  list  predicatedList  rejected  Set  set  boolean  long  serialVersionUID  Predicate  predicate  PredicatedSet  predicatedSet  
[buglab_swap_variables]^final PredicatedBag<E> bagdBag = PredicatedBag.predicatedBag ( predicate, predicate ) ;^355^^^^^351^358^final PredicatedBag<E> predicatedBag = PredicatedBag.predicatedBag ( bag, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedBag [RETURN_TYPE] Bag   Bag<E> bag [VARIABLES] Bag  bag  PredicatedBag  predicatedBag  List  accepted  list  predicatedList  rejected  boolean  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^final PredicatedBag<E> predicatedBag = PredicatedBag.predicatedBag (  predicate ) ;^355^^^^^351^358^final PredicatedBag<E> predicatedBag = PredicatedBag.predicatedBag ( bag, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedBag [RETURN_TYPE] Bag   Bag<E> bag [VARIABLES] Bag  bag  PredicatedBag  predicatedBag  List  accepted  list  predicatedList  rejected  boolean  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^final PredicatedBag<E> predicatedBag = PredicatedBag.predicatedBag ( bag ) ;^355^^^^^351^358^final PredicatedBag<E> predicatedBag = PredicatedBag.predicatedBag ( bag, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedBag [RETURN_TYPE] Bag   Bag<E> bag [VARIABLES] Bag  bag  PredicatedBag  predicatedBag  List  accepted  list  predicatedList  rejected  boolean  long  serialVersionUID  Predicate  predicate  
[buglab_swap_variables]^final PredicatedQueue<E> queuedQueue = PredicatedQueue.predicatedQueue ( predicate, predicate ) ;^387^^^^^383^390^final PredicatedQueue<E> predicatedQueue = PredicatedQueue.predicatedQueue ( queue, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedQueue [RETURN_TYPE] Queue   Queue<E> queue [VARIABLES] List  accepted  list  predicatedList  rejected  boolean  Queue  queue  long  serialVersionUID  Predicate  predicate  PredicatedQueue  predicatedQueue  
[buglab_swap_variables]^final PredicatedQueue<E> predicatedQueue = PredicatedQueue.predicatedQueue (  predicate ) ;^387^^^^^383^390^final PredicatedQueue<E> predicatedQueue = PredicatedQueue.predicatedQueue ( queue, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedQueue [RETURN_TYPE] Queue   Queue<E> queue [VARIABLES] List  accepted  list  predicatedList  rejected  boolean  Queue  queue  long  serialVersionUID  Predicate  predicate  PredicatedQueue  predicatedQueue  
[buglab_swap_variables]^final PredicatedQueue<E> predicatedQueue = PredicatedQueue.predicatedQueue ( queue ) ;^387^^^^^383^390^final PredicatedQueue<E> predicatedQueue = PredicatedQueue.predicatedQueue ( queue, predicate ) ;^[CLASS] PredicatedCollection Builder  [METHOD] createPredicatedQueue [RETURN_TYPE] Queue   Queue<E> queue [VARIABLES] List  accepted  list  predicatedList  rejected  boolean  Queue  queue  long  serialVersionUID  Predicate  predicate  PredicatedQueue  predicatedQueue  
[buglab_swap_variables]^if  ( item.evaluate ( predicate )  )  {^238^^^^^237^244^if  ( predicate.evaluate ( item )  )  {^[CLASS] Builder  [METHOD] add [RETURN_TYPE] PredicatedCollection$Builder   final E item [VARIABLES] List  accepted  rejected  boolean  E  item  Predicate  predicate  
[buglab_swap_variables]^if  ( item != null )  {^256^^^^^255^262^if  ( items != null )  {^[CLASS] Builder  [METHOD] addAll [RETURN_TYPE] PredicatedCollection$Builder   Collection<? extends E> items [VARIABLES] Collection  items  List  accepted  rejected  boolean  E  item  Predicate  predicate  
[buglab_swap_variables]^if  ( itemss != null )  {^256^^^^^255^262^if  ( items != null )  {^[CLASS] Builder  [METHOD] addAll [RETURN_TYPE] PredicatedCollection$Builder   Collection<? extends E> items [VARIABLES] Collection  items  List  accepted  rejected  boolean  E  item  Predicate  predicate  
[buglab_swap_variables]^final List<E> listdList = PredicatedList.predicatedList ( predicate, predicate ) ;^291^^^^^287^294^final List<E> predicatedList = PredicatedList.predicatedList ( list, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedList [RETURN_TYPE] List   List<E> list [VARIABLES] List  accepted  list  predicatedList  rejected  Predicate  predicate  boolean  
[buglab_swap_variables]^final List<E> predicatedList = PredicatedList.predicatedList (  predicate ) ;^291^^^^^287^294^final List<E> predicatedList = PredicatedList.predicatedList ( list, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedList [RETURN_TYPE] List   List<E> list [VARIABLES] List  accepted  list  predicatedList  rejected  Predicate  predicate  boolean  
[buglab_swap_variables]^final List<E> predicatedList = PredicatedList.predicatedList ( list ) ;^291^^^^^287^294^final List<E> predicatedList = PredicatedList.predicatedList ( list, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedList [RETURN_TYPE] List   List<E> list [VARIABLES] List  accepted  list  predicatedList  rejected  Predicate  predicate  boolean  
[buglab_swap_variables]^final PredicatedSet<E> setdSet = PredicatedSet.predicatedSet ( predicate, predicate ) ;^323^^^^^319^326^final PredicatedSet<E> predicatedSet = PredicatedSet.predicatedSet ( set, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedSet [RETURN_TYPE] Set   Set<E> set [VARIABLES] List  accepted  list  predicatedList  rejected  Set  set  boolean  Predicate  predicate  PredicatedSet  predicatedSet  
[buglab_swap_variables]^final PredicatedSet<E> predicatedSet = PredicatedSet.predicatedSet (  predicate ) ;^323^^^^^319^326^final PredicatedSet<E> predicatedSet = PredicatedSet.predicatedSet ( set, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedSet [RETURN_TYPE] Set   Set<E> set [VARIABLES] List  accepted  list  predicatedList  rejected  Set  set  boolean  Predicate  predicate  PredicatedSet  predicatedSet  
[buglab_swap_variables]^final PredicatedSet<E> predicatedSet = PredicatedSet.predicatedSet ( set ) ;^323^^^^^319^326^final PredicatedSet<E> predicatedSet = PredicatedSet.predicatedSet ( set, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedSet [RETURN_TYPE] Set   Set<E> set [VARIABLES] List  accepted  list  predicatedList  rejected  Set  set  boolean  Predicate  predicate  PredicatedSet  predicatedSet  
[buglab_swap_variables]^final PredicatedBag<E> bagdBag = PredicatedBag.predicatedBag ( predicate, predicate ) ;^355^^^^^351^358^final PredicatedBag<E> predicatedBag = PredicatedBag.predicatedBag ( bag, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedBag [RETURN_TYPE] Bag   Bag<E> bag [VARIABLES] Bag  bag  PredicatedBag  predicatedBag  List  accepted  list  predicatedList  rejected  boolean  Predicate  predicate  
[buglab_swap_variables]^final PredicatedBag<E> predicatedBag = PredicatedBag.predicatedBag (  predicate ) ;^355^^^^^351^358^final PredicatedBag<E> predicatedBag = PredicatedBag.predicatedBag ( bag, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedBag [RETURN_TYPE] Bag   Bag<E> bag [VARIABLES] Bag  bag  PredicatedBag  predicatedBag  List  accepted  list  predicatedList  rejected  boolean  Predicate  predicate  
[buglab_swap_variables]^final PredicatedBag<E> predicatedBag = PredicatedBag.predicatedBag ( bag ) ;^355^^^^^351^358^final PredicatedBag<E> predicatedBag = PredicatedBag.predicatedBag ( bag, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedBag [RETURN_TYPE] Bag   Bag<E> bag [VARIABLES] Bag  bag  PredicatedBag  predicatedBag  List  accepted  list  predicatedList  rejected  boolean  Predicate  predicate  
[buglab_swap_variables]^final PredicatedQueue<E> queuedQueue = PredicatedQueue.predicatedQueue ( predicate, predicate ) ;^387^^^^^383^390^final PredicatedQueue<E> predicatedQueue = PredicatedQueue.predicatedQueue ( queue, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedQueue [RETURN_TYPE] Queue   Queue<E> queue [VARIABLES] List  accepted  list  predicatedList  rejected  boolean  Queue  queue  Predicate  predicate  PredicatedQueue  predicatedQueue  
[buglab_swap_variables]^final PredicatedQueue<E> predicatedQueue = PredicatedQueue.predicatedQueue (  predicate ) ;^387^^^^^383^390^final PredicatedQueue<E> predicatedQueue = PredicatedQueue.predicatedQueue ( queue, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedQueue [RETURN_TYPE] Queue   Queue<E> queue [VARIABLES] List  accepted  list  predicatedList  rejected  boolean  Queue  queue  Predicate  predicate  PredicatedQueue  predicatedQueue  
[buglab_swap_variables]^final PredicatedQueue<E> predicatedQueue = PredicatedQueue.predicatedQueue ( queue ) ;^387^^^^^383^390^final PredicatedQueue<E> predicatedQueue = PredicatedQueue.predicatedQueue ( queue, predicate ) ;^[CLASS] Builder  [METHOD] createPredicatedQueue [RETURN_TYPE] Queue   Queue<E> queue [VARIABLES] List  accepted  list  predicatedList  rejected  boolean  Queue  queue  Predicate  predicate  PredicatedQueue  predicatedQueue  