[P1_Replace_Type]^private static final  short  serialVersionUID = 2307609000539943581L;^41^^^^^36^46^private static final long serialVersionUID = 2307609000539943581L;^[CLASS] PredicatedQueue   [VARIABLES] 
[P8_Replace_Mix]^private static final long serialVersionUID = 2307609000539943581;^41^^^^^36^46^private static final long serialVersionUID = 2307609000539943581L;^[CLASS] PredicatedQueue   [VARIABLES] 
[P5_Replace_Variable]^super (  predicate ) ;^74^^^^^73^75^super ( queue, predicate ) ;^[CLASS] PredicatedQueue  [METHOD] <init> [RETURN_TYPE] Predicate)   Queue<E> queue Predicate<? super E> predicate [VARIABLES] boolean  Queue  queue  long  serialVersionUID  Predicate  predicate  
[P5_Replace_Variable]^super ( queue ) ;^74^^^^^73^75^super ( queue, predicate ) ;^[CLASS] PredicatedQueue  [METHOD] <init> [RETURN_TYPE] Predicate)   Queue<E> queue Predicate<? super E> predicate [VARIABLES] boolean  Queue  queue  long  serialVersionUID  Predicate  predicate  
[P5_Replace_Variable]^super ( predicate, queue ) ;^74^^^^^73^75^super ( queue, predicate ) ;^[CLASS] PredicatedQueue  [METHOD] <init> [RETURN_TYPE] Predicate)   Queue<E> queue Predicate<? super E> predicate [VARIABLES] boolean  Queue  queue  long  serialVersionUID  Predicate  predicate  
[P8_Replace_Mix]^super ( null, predicate ) ;^74^^^^^73^75^super ( queue, predicate ) ;^[CLASS] PredicatedQueue  [METHOD] <init> [RETURN_TYPE] Predicate)   Queue<E> queue Predicate<? super E> predicate [VARIABLES] boolean  Queue  queue  long  serialVersionUID  Predicate  predicate  
[P14_Delete_Statement]^^74^^^^^73^75^super ( queue, predicate ) ;^[CLASS] PredicatedQueue  [METHOD] <init> [RETURN_TYPE] Predicate)   Queue<E> queue Predicate<? super E> predicate [VARIABLES] boolean  Queue  queue  long  serialVersionUID  Predicate  predicate  
[P4_Replace_Constructor]^return new PredicatedQueue<E> (  predicate ) ;^58^^^^^56^59^return new PredicatedQueue<E> ( Queue, predicate ) ;^[CLASS] PredicatedQueue  [METHOD] predicatedQueue [RETURN_TYPE] <E>   Queue<E> Queue Predicate<? super E> predicate [VARIABLES] boolean  Queue  Queue  long  serialVersionUID  Predicate  predicate  
[P4_Replace_Constructor]^return new PredicatedQueue<E> ( Queue ) ;^58^^^^^56^59^return new PredicatedQueue<E> ( Queue, predicate ) ;^[CLASS] PredicatedQueue  [METHOD] predicatedQueue [RETURN_TYPE] <E>   Queue<E> Queue Predicate<? super E> predicate [VARIABLES] boolean  Queue  Queue  long  serialVersionUID  Predicate  predicate  
[P5_Replace_Variable]^return new PredicatedQueue<E> ( 0, predicate ) ;^58^^^^^56^59^return new PredicatedQueue<E> ( Queue, predicate ) ;^[CLASS] PredicatedQueue  [METHOD] predicatedQueue [RETURN_TYPE] <E>   Queue<E> Queue Predicate<? super E> predicate [VARIABLES] boolean  Queue  Queue  long  serialVersionUID  Predicate  predicate  
[P5_Replace_Variable]^return new PredicatedQueue<E> ( predicate, Queue ) ;^58^^^^^56^59^return new PredicatedQueue<E> ( Queue, predicate ) ;^[CLASS] PredicatedQueue  [METHOD] predicatedQueue [RETURN_TYPE] <E>   Queue<E> Queue Predicate<? super E> predicate [VARIABLES] boolean  Queue  Queue  long  serialVersionUID  Predicate  predicate  
[P5_Replace_Variable]^return new PredicatedQueue<E> ( null, predicate ) ;^58^^^^^56^59^return new PredicatedQueue<E> ( Queue, predicate ) ;^[CLASS] PredicatedQueue  [METHOD] predicatedQueue [RETURN_TYPE] <E>   Queue<E> Queue Predicate<? super E> predicate [VARIABLES] boolean  Queue  Queue  long  serialVersionUID  Predicate  predicate  
[P7_Replace_Invocation]^return  ( Queue<E> )  super .decorated (  )  ;^84^^^^^83^85^return  ( Queue<E> )  super.decorated (  ) ;^[CLASS] PredicatedQueue  [METHOD] decorated [RETURN_TYPE] Queue   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^84^^^^^83^85^return  ( Queue<E> )  super.decorated (  ) ;^[CLASS] PredicatedQueue  [METHOD] decorated [RETURN_TYPE] Queue   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^offer ( object ) ;^98^^^^^97^100^validate ( object ) ;^[CLASS] PredicatedQueue  [METHOD] offer [RETURN_TYPE] boolean   final E object [VARIABLES] E  object  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^98^^^^^97^100^validate ( object ) ;^[CLASS] PredicatedQueue  [METHOD] offer [RETURN_TYPE] boolean   final E object [VARIABLES] E  object  long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  )  .decorated (  )  ;^99^^^^^97^100^return decorated (  ) .offer ( object ) ;^[CLASS] PredicatedQueue  [METHOD] offer [RETURN_TYPE] boolean   final E object [VARIABLES] E  object  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^99^^^^^97^100^return decorated (  ) .offer ( object ) ;^[CLASS] PredicatedQueue  [METHOD] offer [RETURN_TYPE] boolean   final E object [VARIABLES] E  object  long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  ) .peek (  ) ;^103^^^^^102^104^return decorated (  ) .poll (  ) ;^[CLASS] PredicatedQueue  [METHOD] poll [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^103^^^^^102^104^return decorated (  ) .poll (  ) ;^[CLASS] PredicatedQueue  [METHOD] poll [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  ) .poll (  ) ;^107^^^^^106^108^return decorated (  ) .peek (  ) ;^[CLASS] PredicatedQueue  [METHOD] peek [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  )  .element (  )  ;^107^^^^^106^108^return decorated (  ) .peek (  ) ;^[CLASS] PredicatedQueue  [METHOD] peek [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^107^^^^^106^108^return decorated (  ) .peek (  ) ;^[CLASS] PredicatedQueue  [METHOD] peek [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  ) .peek (  ) ;^111^^^^^110^112^return decorated (  ) .element (  ) ;^[CLASS] PredicatedQueue  [METHOD] element [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^111^^^^^110^112^return decorated (  ) .element (  ) ;^[CLASS] PredicatedQueue  [METHOD] element [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return decorated (  ) .element (  ) ;^115^^^^^114^116^return decorated (  ) .remove (  ) ;^[CLASS] PredicatedQueue  [METHOD] remove [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^115^^^^^114^116^return decorated (  ) .remove (  ) ;^[CLASS] PredicatedQueue  [METHOD] remove [RETURN_TYPE] E   [VARIABLES] long  serialVersionUID  boolean  
