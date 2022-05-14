[P8_Replace_Mix]^private  Iterator<? extends E> iterator;^37^^^^^32^42^private final Iterator<? extends E> iterator;^[CLASS] BoundedIterator   [VARIABLES] 
[P1_Replace_Type]^private final  short  offset;^40^^^^^35^45^private final long offset;^[CLASS] BoundedIterator   [VARIABLES] 
[P8_Replace_Mix]^private final  int  offset;^40^^^^^35^45^private final long offset;^[CLASS] BoundedIterator   [VARIABLES] 
[P1_Replace_Type]^private final  short  max;^43^^^^^38^48^private final long max;^[CLASS] BoundedIterator   [VARIABLES] 
[P1_Replace_Type]^private  short  pos;^46^^^^^41^51^private long pos;^[CLASS] BoundedIterator   [VARIABLES] 
[P8_Replace_Mix]^private  int  pos;^46^^^^^41^51^private long pos;^[CLASS] BoundedIterator   [VARIABLES] 
[P2_Replace_Operator]^if  ( iterator != null )  {^63^^^^^62^78^if  ( iterator == null )  {^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P8_Replace_Mix]^if  ( iterator == true )  {^63^^^^^62^78^if  ( iterator == null )  {^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("Iterator must not be null");^63^64^65^^^62^78^if  ( iterator == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P16_Remove_Block]^^63^64^65^^^62^78^if  ( iterator == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( max < 0 )  {     throw new IllegalArgumentException ( "Max parameter must not be negative." ) ; }^63^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( offset < 0 )  {     throw new IllegalArgumentException ( "Offset parameter must not be negative." ) ; }^63^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  (  ( pos )  <=  ( offset )  )  {     throw new IllegalStateException ( "remove (  )  can not be called before calling next (  ) " ) ; }^63^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P4_Replace_Constructor]^throw throw  new IllegalArgumentException ( "Offset parameter must not be negative." )   ;^64^^^^^62^78^throw new IllegalArgumentException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( iterator == null )  {     throw new IllegalArgumentException ( "Iterator must not be null" ) ; }^64^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( max < 0 )  {     throw new IllegalArgumentException ( "Max parameter must not be negative." ) ; }^64^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( offset < 0 )  {     throw new IllegalArgumentException ( "Offset parameter must not be negative." ) ; }^64^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new IllegalArgumentException  (" ")  ;^64^^^^^62^78^throw new IllegalArgumentException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^throw new NoSuchElementException  (" ")  ;throw new IllegalArgumentException  (" ")  ;^64^^^^^62^78^throw new IllegalArgumentException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P2_Replace_Operator]^if  ( offset <= 0 )  {^66^^^^^62^78^if  ( offset < 0 )  {^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^if  ( pos < 0 )  {^66^^^^^62^78^if  ( offset < 0 )  {^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P8_Replace_Mix]^if  ( pos < 4 )  {^66^^^^^62^78^if  ( offset < 0 )  {^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P9_Replace_Statement]^if  ( max < 0 )  {^66^^^^^62^78^if  ( offset < 0 )  {^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("Offset parameter must not be negative.");^66^67^68^^^62^78^if  ( offset < 0 )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P16_Remove_Block]^^66^67^68^^^62^78^if  ( offset < 0 )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P4_Replace_Constructor]^throw throw  new IllegalArgumentException ( "Iterator must not be null" )   ;^67^^^^^62^78^throw new IllegalArgumentException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( max < 0 )  {     throw new IllegalArgumentException ( "Max parameter must not be negative." ) ; }^67^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( offset < 0 )  {     throw new IllegalArgumentException ( "Offset parameter must not be negative." ) ; }^67^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new IllegalArgumentException  (" ")  ;^67^^^^^62^78^throw new IllegalArgumentException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^throw new NoSuchElementException  (" ")  ;throw new IllegalArgumentException  (" ")  ;^67^^^^^62^78^throw new IllegalArgumentException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( iterator == null )  {     throw new IllegalArgumentException ( "Iterator must not be null" ) ; }^67^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P8_Replace_Mix]^throw new IllegalStateException  (" ")  ; ;^67^^^^^62^78^throw new IllegalArgumentException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P2_Replace_Operator]^if  ( max <= 0 )  {^69^^^^^62^78^if  ( max < 0 )  {^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P3_Replace_Literal]^if  ( max <  )  {^69^^^^^62^78^if  ( max < 0 )  {^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^if  ( pos < 0 )  {^69^^^^^62^78^if  ( max < 0 )  {^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P8_Replace_Mix]^if  ( max < 0L )  {^69^^^^^62^78^if  ( max < 0 )  {^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P9_Replace_Statement]^if  ( offset < 0 )  {^69^^^^^62^78^if  ( max < 0 )  {^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("Max parameter must not be negative.");^69^70^71^^^62^78^if  ( max < 0 )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P16_Remove_Block]^^69^70^71^^^62^78^if  ( max < 0 )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P4_Replace_Constructor]^throw throw  new IllegalArgumentException ( "Iterator must not be null" )   ;^70^^^^^62^78^throw new IllegalArgumentException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( max < 0 )  {     throw new IllegalArgumentException ( "Max parameter must not be negative." ) ; }^70^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( offset < 0 )  {     throw new IllegalArgumentException ( "Offset parameter must not be negative." ) ; }^70^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new IllegalArgumentException  (" ")  ;^70^^^^^62^78^throw new IllegalArgumentException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^throw new NoSuchElementException  (" ")  ;throw new IllegalArgumentException  (" ")  ;^70^^^^^62^78^throw new IllegalArgumentException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( iterator == null )  {     throw new IllegalArgumentException ( "Iterator must not be null" ) ; }^70^^^^^62^78^[Delete]^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P8_Replace_Mix]^this.iterator =  null;^73^^^^^62^78^this.iterator = iterator;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^this.offset = pos;^74^^^^^62^78^this.offset = offset;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^this.max = pos;^75^^^^^62^78^this.max = max;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P8_Replace_Mix]^pos = 4;^76^^^^^62^78^pos = 0;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P7_Replace_Invocation]^checkBounds (  ) ;^77^^^^^62^78^init (  ) ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P14_Delete_Statement]^^77^^^^^62^78^init (  ) ;^[CLASS] BoundedIterator  [METHOD] <init> [RETURN_TYPE] Iterator,long,long)   Iterator<? extends E> iterator final long offset final long max [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P2_Replace_Operator]^while  ( pos < offset || iterator.hasNext (  )  )  {^84^^^^^83^88^while  ( pos < offset && iterator.hasNext (  )  )  {^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P2_Replace_Operator]^while  ( pos > offset && iterator.hasNext (  )  )  {^84^^^^^83^88^while  ( pos < offset && iterator.hasNext (  )  )  {^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^while  ( max < offset && iterator.hasNext (  )  )  {^84^^^^^83^88^while  ( pos < offset && iterator.hasNext (  )  )  {^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^while  ( pos < pos && iterator.hasNext (  )  )  {^84^^^^^83^88^while  ( pos < offset && iterator.hasNext (  )  )  {^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^while  ( iterator < offset && pos.hasNext (  )  )  {^84^^^^^83^88^while  ( pos < offset && iterator.hasNext (  )  )  {^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^while  ( offset < pos && iterator.hasNext (  )  )  {^84^^^^^83^88^while  ( pos < offset && iterator.hasNext (  )  )  {^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^while  ( pos < iterator && offset.hasNext (  )  )  {^84^^^^^83^88^while  ( pos < offset && iterator.hasNext (  )  )  {^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P7_Replace_Invocation]^while  ( pos < offset && iterator.next (  )  )  {^84^^^^^83^88^while  ( pos < offset && iterator.hasNext (  )  )  {^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P8_Replace_Mix]^while  ( pos < max && iterator.hasNext (  )  )  {^84^^^^^83^88^while  ( pos < offset && iterator.hasNext (  )  )  {^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P7_Replace_Invocation]^iterator.hasNext (  ) ;^85^^^^^83^88^iterator.next (  ) ;^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P14_Delete_Statement]^^85^^^^^83^88^iterator.next (  ) ;^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^final E next = iterator.next (  ) ;iterator.next (  ) ;^85^^^^^83^88^iterator.next (  ) ;^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^iterator.remove (  ) ;iterator.next (  ) ;^85^^^^^83^88^iterator.next (  ) ;^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^return iterator.hasNext (  ) ;iterator.next (  ) ;^85^^^^^83^88^iterator.next (  ) ;^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P14_Delete_Statement]^^84^85^^^^83^88^while  ( pos < offset && iterator.hasNext (  )  )  { iterator.next (  ) ;^[CLASS] BoundedIterator  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P7_Replace_Invocation]^if  ( !init (  )  )  {^93^^^^^92^97^if  ( !checkBounds (  )  )  {^[CLASS] BoundedIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P15_Unwrap_Block]^return false;^93^94^95^^^92^97^if  ( !checkBounds (  )  )  { return false; }^[CLASS] BoundedIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P16_Remove_Block]^^93^94^95^^^92^97^if  ( !checkBounds (  )  )  { return false; }^[CLASS] BoundedIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  (  (  (  ( pos )  -  ( offset )  )  + 1 )  >  ( max )  )  {     return false; }^93^^^^^92^97^[Delete]^[CLASS] BoundedIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P3_Replace_Literal]^return true;^94^^^^^92^97^return false;^[CLASS] BoundedIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P7_Replace_Invocation]^return iterator.next (  ) ;^96^^^^^92^97^return iterator.hasNext (  ) ;^[CLASS] BoundedIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^return this.hasNext (  ) ;^96^^^^^92^97^return iterator.hasNext (  ) ;^[CLASS] BoundedIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P14_Delete_Statement]^^96^^^^^92^97^return iterator.hasNext (  ) ;^[CLASS] BoundedIterator  [METHOD] hasNext [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P2_Replace_Operator]^if  ( pos - offset + 1 >= max )  {^104^^^^^103^108^if  ( pos - offset + 1 > max )  {^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P2_Replace_Operator]^if  ^  ( pos - offset + 1 > max )  {^104^^^^^103^108^if  ( pos - offset + 1 > max )  {^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P2_Replace_Operator]^if  ( pos  ||  offset + 1 > max )  {^104^^^^^103^108^if  ( pos - offset + 1 > max )  {^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P3_Replace_Literal]^if  ( pos - offset  > max )  {^104^^^^^103^108^if  ( pos - offset + 1 > max )  {^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^if  ( pos - max + 1 > max )  {^104^^^^^103^108^if  ( pos - offset + 1 > max )  {^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^if  ( pos - offset + 1 > offset )  {^104^^^^^103^108^if  ( pos - offset + 1 > max )  {^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^if  ( offset - pos + 1 > max )  {^104^^^^^103^108^if  ( pos - offset + 1 > max )  {^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^if  ( pos - max + 1 > offset )  {^104^^^^^103^108^if  ( pos - offset + 1 > max )  {^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P6_Replace_Expression]^if  (  ( pos )  -  ( offset )  + 1 )  {^104^^^^^103^108^if  ( pos - offset + 1 > max )  {^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P6_Replace_Expression]^if  ( pos - offset )  {^104^^^^^103^108^if  ( pos - offset + 1 > max )  {^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P8_Replace_Mix]^if  ( pos - pos + 1 << 2 > max )  {^104^^^^^103^108^if  ( pos - offset + 1 > max )  {^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P15_Unwrap_Block]^return false;^104^105^106^^^103^108^if  ( pos - offset + 1 > max )  { return false; }^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P16_Remove_Block]^^104^105^106^^^103^108^if  ( pos - offset + 1 > max )  { return false; }^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( ! ( checkBounds (  )  )  )  {     return false; }^104^^^^^103^108^[Delete]^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P3_Replace_Literal]^return true;^105^^^^^103^108^return false;^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P3_Replace_Literal]^return false;^107^^^^^103^108^return true;^[CLASS] BoundedIterator  [METHOD] checkBounds [RETURN_TYPE] boolean   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P7_Replace_Invocation]^if  ( !init (  )  )  {^111^^^^^110^117^if  ( !checkBounds (  )  )  {^[CLASS] BoundedIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  E  next  long  max  offset  pos  
[P15_Unwrap_Block]^throw new java.util.NoSuchElementException();^111^112^113^^^110^117^if  ( !checkBounds (  )  )  { throw new NoSuchElementException  (" ")  ; }^[CLASS] BoundedIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  E  next  long  max  offset  pos  
[P16_Remove_Block]^^111^112^113^^^110^117^if  ( !checkBounds (  )  )  { throw new NoSuchElementException  (" ")  ; }^[CLASS] BoundedIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  E  next  long  max  offset  pos  
[P13_Insert_Block]^if  ( ! ( checkBounds (  )  )  )  {     throw new NoSuchElementException (  ) ; }^112^^^^^110^117^[Delete]^[CLASS] BoundedIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  E  next  long  max  offset  pos  
[P11_Insert_Donor_Statement]^throw new IllegalArgumentException  (" ")  ;throw new NoSuchElementException  (" ")  ;^112^^^^^110^117^throw new NoSuchElementException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  E  next  long  max  offset  pos  
[P11_Insert_Donor_Statement]^throw new IllegalStateException  (" ")  ;throw new NoSuchElementException  (" ")  ;^112^^^^^110^117^throw new NoSuchElementException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  E  next  long  max  offset  pos  
[P7_Replace_Invocation]^final E next = iterator.hasNext (  ) ;^114^^^^^110^117^final E next = iterator.next (  ) ;^[CLASS] BoundedIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  E  next  long  max  offset  pos  
[P14_Delete_Statement]^^114^^^^^110^117^final E next = iterator.next (  ) ;^[CLASS] BoundedIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  E  next  long  max  offset  pos  
[P11_Insert_Donor_Statement]^iterator.next (  ) ;final E next = iterator.next (  ) ;^114^^^^^110^117^final E next = iterator.next (  ) ;^[CLASS] BoundedIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  E  next  long  max  offset  pos  
[P11_Insert_Donor_Statement]^return iterator.hasNext (  ) ;final E next = iterator.next (  ) ;^114^^^^^110^117^final E next = iterator.next (  ) ;^[CLASS] BoundedIterator  [METHOD] next [RETURN_TYPE] E   [VARIABLES] Iterator  iterator  boolean  E  next  long  max  offset  pos  
[P2_Replace_Operator]^if  ( pos == offset )  {^128^^^^^127^132^if  ( pos <= offset )  {^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^if  ( max <= offset )  {^128^^^^^127^132^if  ( pos <= offset )  {^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^if  ( pos <= max )  {^128^^^^^127^132^if  ( pos <= offset )  {^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P5_Replace_Variable]^if  ( offset <= pos )  {^128^^^^^127^132^if  ( pos <= offset )  {^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P15_Unwrap_Block]^throw new java.lang.IllegalStateException("remove() can not be called before calling next()");^128^129^130^^^127^132^if  ( pos <= offset )  { throw new IllegalStateException  (" ")  ; }^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P16_Remove_Block]^^128^129^130^^^127^132^if  ( pos <= offset )  { throw new IllegalStateException  (" ")  ; }^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( iterator == null )  {     throw new IllegalArgumentException ( "Iterator must not be null" ) ; }^128^^^^^127^132^[Delete]^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( max < 0 )  {     throw new IllegalArgumentException ( "Max parameter must not be negative." ) ; }^128^^^^^127^132^[Delete]^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  ( offset < 0 )  {     throw new IllegalArgumentException ( "Offset parameter must not be negative." ) ; }^128^^^^^127^132^[Delete]^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P13_Insert_Block]^if  (  ( pos )  <=  ( offset )  )  {     throw new IllegalStateException ( "remove (  )  can not be called before calling next (  ) " ) ; }^129^^^^^127^132^[Delete]^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P8_Replace_Mix]^throw new IllegalArgumentException  (" ")  ; ;^129^^^^^127^132^throw new IllegalStateException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^throw new IllegalArgumentException  (" ")  ;throw new IllegalStateException  (" ")  ;^129^^^^^127^132^throw new IllegalStateException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^throw new NoSuchElementException  (" ")  ;throw new IllegalStateException  (" ")  ;^129^^^^^127^132^throw new IllegalStateException  (" ")  ;^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P7_Replace_Invocation]^iterator.next (  ) ;^131^^^^^127^132^iterator.remove (  ) ;^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P14_Delete_Statement]^^131^^^^^127^132^iterator.remove (  ) ;^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^iterator.next (  ) ;iterator.remove (  ) ;^131^^^^^127^132^iterator.remove (  ) ;^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
[P11_Insert_Donor_Statement]^return iterator.hasNext (  ) ;iterator.remove (  ) ;^131^^^^^127^132^iterator.remove (  ) ;^[CLASS] BoundedIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Iterator  iterator  long  max  offset  pos  boolean  
