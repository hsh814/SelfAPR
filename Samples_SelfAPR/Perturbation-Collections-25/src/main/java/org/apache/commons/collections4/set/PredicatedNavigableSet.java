[P1_Replace_Type]^private static final  int  serialVersionUID = 20150528L;^45^^^^^40^50^private static final long serialVersionUID = 20150528L;^[CLASS] PredicatedNavigableSet   [VARIABLES] 
[P8_Replace_Mix]^private static final long serialVersionUID = 20150528;^45^^^^^40^50^private static final long serialVersionUID = 20150528L;^[CLASS] PredicatedNavigableSet   [VARIABLES] 
[P5_Replace_Variable]^super (  predicate ) ;^79^^^^^78^80^super ( set, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] <init> [RETURN_TYPE] Predicate)   NavigableSet<E> set Predicate<? super E> predicate [VARIABLES] NavigableSet  set  boolean  long  serialVersionUID  Predicate  predicate  
[P5_Replace_Variable]^super ( set ) ;^79^^^^^78^80^super ( set, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] <init> [RETURN_TYPE] Predicate)   NavigableSet<E> set Predicate<? super E> predicate [VARIABLES] NavigableSet  set  boolean  long  serialVersionUID  Predicate  predicate  
[P5_Replace_Variable]^super ( predicate, set ) ;^79^^^^^78^80^super ( set, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] <init> [RETURN_TYPE] Predicate)   NavigableSet<E> set Predicate<? super E> predicate [VARIABLES] NavigableSet  set  boolean  long  serialVersionUID  Predicate  predicate  
[P14_Delete_Statement]^^79^^^^^78^80^super ( set, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] <init> [RETURN_TYPE] Predicate)   NavigableSet<E> set Predicate<? super E> predicate [VARIABLES] NavigableSet  set  boolean  long  serialVersionUID  Predicate  predicate  
[P4_Replace_Constructor]^return new PredicatedNavigableSet<E> (  predicate ) ;^63^^^^^61^64^return new PredicatedNavigableSet<E> ( set, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] predicatedNavigableSet [RETURN_TYPE] <E>   NavigableSet<E> set Predicate<? super E> predicate [VARIABLES] NavigableSet  set  boolean  long  serialVersionUID  Predicate  predicate  
[P4_Replace_Constructor]^return new PredicatedNavigableSet<E> ( set ) ;^63^^^^^61^64^return new PredicatedNavigableSet<E> ( set, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] predicatedNavigableSet [RETURN_TYPE] <E>   NavigableSet<E> set Predicate<? super E> predicate [VARIABLES] NavigableSet  set  boolean  long  serialVersionUID  Predicate  predicate  
[P5_Replace_Variable]^return new PredicatedNavigableSet<E> ( predicate, set ) ;^63^^^^^61^64^return new PredicatedNavigableSet<E> ( set, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] predicatedNavigableSet [RETURN_TYPE] <E>   NavigableSet<E> set Predicate<? super E> predicate [VARIABLES] NavigableSet  set  boolean  long  serialVersionUID  Predicate  predicate  
[P8_Replace_Mix]^return  ( NavigableSet<E> )  super .decorated (  )  ;^89^^^^^88^90^return  ( NavigableSet<E> )  super.decorated (  ) ;^[CLASS] PredicatedNavigableSet  [METHOD] decorated [RETURN_TYPE] NavigableSet   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^89^^^^^88^90^return  ( NavigableSet<E> )  super.decorated (  ) ;^[CLASS] PredicatedNavigableSet  [METHOD] decorated [RETURN_TYPE] NavigableSet   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  ) .floor ( e ) ;^96^^^^^95^97^return decorated (  ) .lower ( e ) ;^[CLASS] PredicatedNavigableSet  [METHOD] lower [RETURN_TYPE] E   E e [VARIABLES] E  e  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^96^^^^^95^97^return decorated (  ) .lower ( e ) ;^[CLASS] PredicatedNavigableSet  [METHOD] lower [RETURN_TYPE] E   E e [VARIABLES] E  e  long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  ) .higher ( e ) ;^101^^^^^100^102^return decorated (  ) .floor ( e ) ;^[CLASS] PredicatedNavigableSet  [METHOD] floor [RETURN_TYPE] E   E e [VARIABLES] E  e  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^101^^^^^100^102^return decorated (  ) .floor ( e ) ;^[CLASS] PredicatedNavigableSet  [METHOD] floor [RETURN_TYPE] E   E e [VARIABLES] E  e  long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  ) .floor ( e ) ;^106^^^^^105^107^return decorated (  ) .ceiling ( e ) ;^[CLASS] PredicatedNavigableSet  [METHOD] ceiling [RETURN_TYPE] E   E e [VARIABLES] E  e  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^106^^^^^105^107^return decorated (  ) .ceiling ( e ) ;^[CLASS] PredicatedNavigableSet  [METHOD] ceiling [RETURN_TYPE] E   E e [VARIABLES] E  e  long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  ) .floor ( e ) ;^111^^^^^110^112^return decorated (  ) .higher ( e ) ;^[CLASS] PredicatedNavigableSet  [METHOD] higher [RETURN_TYPE] E   E e [VARIABLES] E  e  long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  )  .lower ( e )  ;^111^^^^^110^112^return decorated (  ) .higher ( e ) ;^[CLASS] PredicatedNavigableSet  [METHOD] higher [RETURN_TYPE] E   E e [VARIABLES] E  e  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^111^^^^^110^112^return decorated (  ) .higher ( e ) ;^[CLASS] PredicatedNavigableSet  [METHOD] higher [RETURN_TYPE] E   E e [VARIABLES] E  e  long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  ) .pollLast (  ) ;^116^^^^^115^117^return decorated (  ) .pollFirst (  ) ;^[CLASS] PredicatedNavigableSet  [METHOD] pollFirst [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^116^^^^^115^117^return decorated (  ) .pollFirst (  ) ;^[CLASS] PredicatedNavigableSet  [METHOD] pollFirst [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  ) .pollFirst (  ) ;^121^^^^^120^122^return decorated (  ) .pollLast (  ) ;^[CLASS] PredicatedNavigableSet  [METHOD] pollLast [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^121^^^^^120^122^return decorated (  ) .pollLast (  ) ;^[CLASS] PredicatedNavigableSet  [METHOD] pollLast [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated ( decorated (  ) .descendingSet (  ) , predicate ) ;^126^^^^^125^127^return predicatedNavigableSet ( decorated (  ) .descendingSet (  ) , predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] descendingSet [RETURN_TYPE] NavigableSet   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return predicatedNavigableSet ( decorated (  ) .descendingIterator (  ) , predicate ) ;^126^^^^^125^127^return predicatedNavigableSet ( decorated (  ) .descendingSet (  ) , predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] descendingSet [RETURN_TYPE] NavigableSet   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^126^^^^^125^127^return predicatedNavigableSet ( decorated (  ) .descendingSet (  ) , predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] descendingSet [RETURN_TYPE] NavigableSet   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  ) .descendingSet (  ) ;^131^^^^^130^132^return decorated (  ) .descendingIterator (  ) ;^[CLASS] PredicatedNavigableSet  [METHOD] descendingIterator [RETURN_TYPE] Iterator   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^131^^^^^130^132^return decorated (  ) .descendingIterator (  ) ;^[CLASS] PredicatedNavigableSet  [METHOD] descendingIterator [RETURN_TYPE] Iterator   [VARIABLES] long  serialVersionUID  boolean  
[P5_Replace_Variable]^final NavigableSet<E> sub = decorated (  ) .subSet ( toElement, fromInclusive, toElement, toInclusive ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, toInclusive, toElement, toInclusive ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, fromElement, toInclusive ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, fromInclusive ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> sub = decorated (  ) .subSet (  fromInclusive, toElement, toInclusive ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement,  toElement, toInclusive ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive,  toInclusive ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> sub = decorated (  ) .subSet ( toElement, fromInclusive, fromElement, toInclusive ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, toInclusive, toElement, fromInclusive ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P11_Insert_Donor_Statement]^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P11_Insert_Donor_Statement]^final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ;final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P7_Replace_Invocation]^final NavigableSet<E> sub = decorated (  )  .headSet ( toElement , toInclusive )  ;^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P14_Delete_Statement]^^136^137^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ; return predicatedNavigableSet ( sub, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P14_Delete_Statement]^^136^^^^^135^138^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^return predicatedNavigableSet (  predicate ) ;^137^^^^^135^138^return predicatedNavigableSet ( sub, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^return predicatedNavigableSet ( sub ) ;^137^^^^^135^138^return predicatedNavigableSet ( sub, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^return subdNavigableSet ( predicate, predicate ) ;^137^^^^^135^138^return predicatedNavigableSet ( sub, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P7_Replace_Invocation]^return ceiling ( sub, predicate ) ;^137^^^^^135^138^return predicatedNavigableSet ( sub, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P8_Replace_Mix]^return ceiling ( null, predicate ) ;^137^^^^^135^138^return predicatedNavigableSet ( sub, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P8_Replace_Mix]^return 1dNavigableSet ( sub, predicate ) ;^137^^^^^135^138^return predicatedNavigableSet ( sub, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P14_Delete_Statement]^^137^^^^^135^138^return predicatedNavigableSet ( sub, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] subSet [RETURN_TYPE] NavigableSet   E fromElement boolean fromInclusive E toElement boolean toInclusive [VARIABLES] NavigableSet  sub  boolean  fromInclusive  toInclusive  E  fromElement  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> head = decorated (  ) .headSet (  inclusive ) ;^142^^^^^141^144^final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> head = decorated (  ) .headSet ( toElement ) ;^142^^^^^141^144^final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> head = decorated (  ) .headSet ( inclusive, toElement ) ;^142^^^^^141^144^final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P7_Replace_Invocation]^final NavigableSet<E> head = decorated (  ) .tailSet ( toElement, inclusive ) ;^142^^^^^141^144^final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P11_Insert_Donor_Statement]^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ;^142^^^^^141^144^final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P11_Insert_Donor_Statement]^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ;^142^^^^^141^144^final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P14_Delete_Statement]^^142^143^^^^141^144^final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ; return predicatedNavigableSet ( head, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P14_Delete_Statement]^^142^^^^^141^144^final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P5_Replace_Variable]^return predicatedNavigableSet (  predicate ) ;^143^^^^^141^144^return predicatedNavigableSet ( head, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P5_Replace_Variable]^return predicatedNavigableSet ( head ) ;^143^^^^^141^144^return predicatedNavigableSet ( head, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P5_Replace_Variable]^return headdNavigableSet ( predicate, predicate ) ;^143^^^^^141^144^return predicatedNavigableSet ( head, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P7_Replace_Invocation]^return ceiling ( head, predicate ) ;^143^^^^^141^144^return predicatedNavigableSet ( head, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P14_Delete_Statement]^^143^^^^^141^144^return predicatedNavigableSet ( head, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] headSet [RETURN_TYPE] NavigableSet   E toElement boolean inclusive [VARIABLES] NavigableSet  head  boolean  inclusive  E  toElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> tail = decorated (  ) .tailSet (  inclusive ) ;^148^^^^^147^150^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement ) ;^148^^^^^147^150^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P5_Replace_Variable]^final NavigableSet<E> tail = decorated (  ) .tailSet ( inclusive, fromElement ) ;^148^^^^^147^150^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P7_Replace_Invocation]^final NavigableSet<E> tail = decorated (  ) .headSet ( fromElement, inclusive ) ;^148^^^^^147^150^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P7_Replace_Invocation]^final NavigableSet<E> tail = decorated (  )  .subSet ( fromElement , inclusive , fromElement , inclusive )  ;^148^^^^^147^150^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P11_Insert_Donor_Statement]^final NavigableSet<E> head = decorated (  ) .headSet ( toElement, inclusive ) ;final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;^148^^^^^147^150^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P11_Insert_Donor_Statement]^final NavigableSet<E> sub = decorated (  ) .subSet ( fromElement, fromInclusive, toElement, toInclusive ) ;final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;^148^^^^^147^150^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P14_Delete_Statement]^^148^^^^^147^150^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P14_Delete_Statement]^^148^149^^^^147^150^final NavigableSet<E> tail = decorated (  ) .tailSet ( fromElement, inclusive ) ; return predicatedNavigableSet ( tail, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P5_Replace_Variable]^return predicatedNavigableSet (  predicate ) ;^149^^^^^147^150^return predicatedNavigableSet ( tail, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P5_Replace_Variable]^return predicatedNavigableSet ( tail ) ;^149^^^^^147^150^return predicatedNavigableSet ( tail, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P5_Replace_Variable]^return taildNavigableSet ( predicate, predicate ) ;^149^^^^^147^150^return predicatedNavigableSet ( tail, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P7_Replace_Invocation]^return ceiling ( tail, predicate ) ;^149^^^^^147^150^return predicatedNavigableSet ( tail, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
[P14_Delete_Statement]^^149^^^^^147^150^return predicatedNavigableSet ( tail, predicate ) ;^[CLASS] PredicatedNavigableSet  [METHOD] tailSet [RETURN_TYPE] NavigableSet   E fromElement boolean inclusive [VARIABLES] NavigableSet  tail  boolean  inclusive  E  fromElement  long  serialVersionUID  
