[P1_Replace_Type]^private static final  short  serialVersionUID = 6499119872185240161L;^41^^^^^36^46^private static final long serialVersionUID = 6499119872185240161L;^[CLASS] UnmodifiableSet   [VARIABLES] 
[P8_Replace_Mix]^private static final long serialVersionUID  = null ;^41^^^^^36^46^private static final long serialVersionUID = 6499119872185240161L;^[CLASS] UnmodifiableSet   [VARIABLES] 
[P14_Delete_Statement]^^70^^^^^69^71^super (  ( Set<E> )  set ) ;^[CLASS] UnmodifiableSet  [METHOD] <init> [RETURN_TYPE] Set)   Set<? extends E> set [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P2_Replace_Operator]^if  ( set  !=  Unmodifiable )  {^53^^^^^52^59^if  ( set instanceof Unmodifiable )  {^[CLASS] UnmodifiableSet  [METHOD] unmodifiableSet [RETURN_TYPE] <E>   Set<? extends E> set [VARIABLES] long  serialVersionUID  Set  set  tmpSet  boolean  
[P15_Unwrap_Block]^@java.lang.SuppressWarnings(value = "unchecked")final java.util.Set<E> tmpSet = ((java.util.Set<E>) (set)); return tmpSet;^53^54^55^56^57^52^59^if  ( set instanceof Unmodifiable )  { @SuppressWarnings ( "unchecked" ) final Set<E> tmpSet =  ( Set<E> )  set; return tmpSet; }^[CLASS] UnmodifiableSet  [METHOD] unmodifiableSet [RETURN_TYPE] <E>   Set<? extends E> set [VARIABLES] long  serialVersionUID  Set  set  tmpSet  boolean  
[P16_Remove_Block]^^53^54^55^56^57^52^59^if  ( set instanceof Unmodifiable )  { @SuppressWarnings ( "unchecked" ) final Set<E> tmpSet =  ( Set<E> )  set; return tmpSet; }^[CLASS] UnmodifiableSet  [METHOD] unmodifiableSet [RETURN_TYPE] <E>   Set<? extends E> set [VARIABLES] long  serialVersionUID  Set  set  tmpSet  boolean  
[P8_Replace_Mix]^return null;^56^^^^^52^59^return tmpSet;^[CLASS] UnmodifiableSet  [METHOD] unmodifiableSet [RETURN_TYPE] <E>   Set<? extends E> set [VARIABLES] long  serialVersionUID  Set  set  tmpSet  boolean  
[P8_Replace_Mix]^return new UnmodifiableSet<E> ( null ) ;^58^^^^^52^59^return new UnmodifiableSet<E> ( set ) ;^[CLASS] UnmodifiableSet  [METHOD] unmodifiableSet [RETURN_TYPE] <E>   Set<? extends E> set [VARIABLES] long  serialVersionUID  Set  set  tmpSet  boolean  
[P7_Replace_Invocation]^return UnmodifiableIterator.unmodifiableIterator ( decorated (  )  .iterator (  )   ) ;^76^^^^^75^77^return UnmodifiableIterator.unmodifiableIterator ( decorated (  ) .iterator (  )  ) ;^[CLASS] UnmodifiableSet  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^76^77^^^^75^77^return UnmodifiableIterator.unmodifiableIterator ( decorated (  ) .iterator (  )  ) ; }^[CLASS] UnmodifiableSet  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] long  serialVersionUID  boolean  
[P8_Replace_Mix]^return 0;^91^^^^^90^92^throw new UnsupportedOperationException  (" ")  ;^[CLASS] UnmodifiableSet  [METHOD] clear [RETURN_TYPE] void   [VARIABLES] long  serialVersionUID  boolean  