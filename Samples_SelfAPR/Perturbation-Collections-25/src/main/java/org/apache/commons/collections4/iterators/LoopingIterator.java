[P2_Replace_Operator]^if  ( coll != null )  {^55^^^^^54^60^if  ( coll == null )  {^[CLASS] LoopingIterator  [METHOD] <init> [RETURN_TYPE] Collection)   Collection<? extends E> coll [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P8_Replace_Mix]^if  ( coll == true )  {^55^^^^^54^60^if  ( coll == null )  {^[CLASS] LoopingIterator  [METHOD] <init> [RETURN_TYPE] Collection)   Collection<? extends E> coll [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P15_Unwrap_Block]^throw new java.lang.NullPointerException("The collection must not be null");^55^56^57^^^54^60^if  ( coll == null )  { throw new NullPointerException  (" ")  ; }^[CLASS] LoopingIterator  [METHOD] <init> [RETURN_TYPE] Collection)   Collection<? extends E> coll [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P16_Remove_Block]^^55^56^57^^^54^60^if  ( coll == null )  { throw new NullPointerException  (" ")  ; }^[CLASS] LoopingIterator  [METHOD] <init> [RETURN_TYPE] Collection)   Collection<? extends E> coll [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P13_Insert_Block]^if  ( coll == null )  {     throw new NullPointerException ( "The collection must not be null" ) ; }^56^^^^^54^60^[Delete]^[CLASS] LoopingIterator  [METHOD] <init> [RETURN_TYPE] Collection)   Collection<? extends E> coll [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P11_Insert_Donor_Statement]^throw new NoSuchElementException  (" ")  ;throw new NullPointerException  (" ")  ;^56^^^^^54^60^throw new NullPointerException  (" ")  ;^[CLASS] LoopingIterator  [METHOD] <init> [RETURN_TYPE] Collection)   Collection<? extends E> coll [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P8_Replace_Mix]^throw new NoSuchElementException  (" ")  ; ;^56^^^^^54^60^throw new NullPointerException  (" ")  ;^[CLASS] LoopingIterator  [METHOD] <init> [RETURN_TYPE] Collection)   Collection<? extends E> coll [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P8_Replace_Mix]^collection =  this;^58^^^^^54^60^collection = coll;^[CLASS] LoopingIterator  [METHOD] <init> [RETURN_TYPE] Collection)   Collection<? extends E> coll [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P14_Delete_Statement]^^59^^^^^54^60^reset (  ) ;^[CLASS] LoopingIterator  [METHOD] <init> [RETURN_TYPE] Collection)   Collection<? extends E> coll [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P2_Replace_Operator]^return collection.size (  )  >= 0;^71^^^^^70^72^return collection.size (  )  > 0;^[CLASS] LoopingIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P3_Replace_Literal]^return collection.size() + 1  > 0;^71^^^^^70^72^return collection.size (  )  > 0;^[CLASS] LoopingIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P5_Replace_Variable]^return 2.size (  )  > 0;^71^^^^^70^72^return collection.size (  )  > 0;^[CLASS] LoopingIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P7_Replace_Invocation]^return collection.iterator (  )  > 0;^71^^^^^70^72^return collection.size (  )  > 0;^[CLASS] LoopingIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P12_Insert_Condition]^if  ( collection.size (  )  == 0 )  { return collection.size (  )  > 0; }^71^^^^^70^72^return collection.size (  )  > 0;^[CLASS] LoopingIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P3_Replace_Literal]^return collection.size() - 6  > 0;^71^^^^^70^72^return collection.size (  )  > 0;^[CLASS] LoopingIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P8_Replace_Mix]^return 1.size (  )  > 0;^71^^^^^70^72^return collection.size (  )  > 0;^[CLASS] LoopingIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P14_Delete_Statement]^^71^^^^^70^72^return collection.size (  )  > 0;^[CLASS] LoopingIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P2_Replace_Operator]^if  ( collection.size (  )  >= 0 )  {^84^^^^^83^91^if  ( collection.size (  )  == 0 )  {^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P3_Replace_Literal]^if  ( collection.size (  )  == null )  {^84^^^^^83^91^if  ( collection.size (  )  == 0 )  {^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P3_Replace_Literal]^if  ( collection.size() - 3  == 0 )  {^84^^^^^83^91^if  ( collection.size (  )  == 0 )  {^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P7_Replace_Invocation]^if  ( collection.iterator (  )  == 0 )  {^84^^^^^83^91^if  ( collection.size (  )  == 0 )  {^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P15_Unwrap_Block]^throw new java.util.NoSuchElementException("There are no elements for this iterator to loop on");^84^85^86^^^83^91^if  ( collection.size (  )  == 0 )  { throw new NoSuchElementException  (" ")  ; }^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P16_Remove_Block]^^84^85^86^^^83^91^if  ( collection.size (  )  == 0 )  { throw new NoSuchElementException  (" ")  ; }^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P13_Insert_Block]^if  (  ( collection.size (  )  )  == 0 )  {     throw new NoSuchElementException ( "There are no elements for this iterator to loop on" ) ; }^85^^^^^83^91^[Delete]^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P8_Replace_Mix]^throw new NullPointerException  (" ")  ; ;^85^^^^^83^91^throw new NoSuchElementException  (" ")  ;^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P11_Insert_Donor_Statement]^throw new NullPointerException  (" ")  ;throw new NoSuchElementException  (" ")  ;^85^^^^^83^91^throw new NoSuchElementException  (" ")  ;^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P3_Replace_Literal]^if  ( collection.size() - 6  == 0 )  {^84^^^^^83^91^if  ( collection.size (  )  == 0 )  {^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P5_Replace_Variable]^if  ( this.size (  )  == 0 )  {^84^^^^^83^91^if  ( collection.size (  )  == 0 )  {^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P2_Replace_Operator]^if  ( iterator.hasNext (  )  != false )  {^87^^^^^83^91^if  ( iterator.hasNext (  )  == false )  {^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P3_Replace_Literal]^if  ( iterator.hasNext (  )  == true )  {^87^^^^^83^91^if  ( iterator.hasNext (  )  == false )  {^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P7_Replace_Invocation]^if  ( iterator.next (  )  == false )  {^87^^^^^83^91^if  ( iterator.hasNext (  )  == false )  {^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P15_Unwrap_Block]^reset();^87^88^89^^^83^91^if  ( iterator.hasNext (  )  == false )  { reset (  ) ; }^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P16_Remove_Block]^^87^88^89^^^83^91^if  ( iterator.hasNext (  )  == false )  { reset (  ) ; }^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P14_Delete_Statement]^^88^^^^^83^91^reset (  ) ;^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P7_Replace_Invocation]^return iterator.hasNext (  ) ;^90^^^^^83^91^return iterator.next (  ) ;^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P14_Delete_Statement]^^90^^^^^83^91^return iterator.next (  ) ;^[CLASS] LoopingIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P7_Replace_Invocation]^iterator.next (  ) ;^106^^^^^105^107^iterator.remove (  ) ;^[CLASS] LoopingIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P14_Delete_Statement]^^106^^^^^105^107^iterator.remove (  ) ;^[CLASS] LoopingIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P11_Insert_Donor_Statement]^return iterator.next (  ) ;iterator.remove (  ) ;^106^^^^^105^107^iterator.remove (  ) ;^[CLASS] LoopingIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P7_Replace_Invocation]^iterator = collection.size (  ) ;^113^^^^^112^114^iterator = collection.iterator (  ) ;^[CLASS] LoopingIterator  [METHOD] reset [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P8_Replace_Mix]^iterator  =  iterator ;^113^^^^^112^114^iterator = collection.iterator (  ) ;^[CLASS] LoopingIterator  [METHOD] reset [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P14_Delete_Statement]^^113^^^^^112^114^iterator = collection.iterator (  ) ;^[CLASS] LoopingIterator  [METHOD] reset [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P11_Insert_Donor_Statement]^return collection.size (  )  > 0;iterator = collection.iterator (  ) ;^113^^^^^112^114^iterator = collection.iterator (  ) ;^[CLASS] LoopingIterator  [METHOD] reset [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P11_Insert_Donor_Statement]^return collection.size (  ) ;iterator = collection.iterator (  ) ;^113^^^^^112^114^iterator = collection.iterator (  ) ;^[CLASS] LoopingIterator  [METHOD] reset [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P3_Replace_Literal]^return collection.size() - 0 ;^122^^^^^121^123^return collection.size (  ) ;^[CLASS] LoopingIterator  [METHOD] size [RETURN_TYPE] int   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P7_Replace_Invocation]^return collection.iterator (  ) ;^122^^^^^121^123^return collection.size (  ) ;^[CLASS] LoopingIterator  [METHOD] size [RETURN_TYPE] int   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P12_Insert_Condition]^if  ( collection.size (  )  == 0 )  { return collection.size (  ) ; }^122^^^^^121^123^return collection.size (  ) ;^[CLASS] LoopingIterator  [METHOD] size [RETURN_TYPE] int   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P3_Replace_Literal]^return collection.size() + 6 ;^122^^^^^121^123^return collection.size (  ) ;^[CLASS] LoopingIterator  [METHOD] size [RETURN_TYPE] int   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
[P14_Delete_Statement]^^122^^^^^121^123^return collection.size (  ) ;^[CLASS] LoopingIterator  [METHOD] size [RETURN_TYPE] int   [VARIABLES] Iterator  iterator  Collection  coll  collection  boolean  
