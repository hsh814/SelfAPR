[P1_Replace_Type]^short  i = index;^55^^^^^54^66^int i = index;^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P5_Replace_Variable]^CollectionUtils.checkIndexBounds ( index ) ;^56^^^^^54^66^CollectionUtils.checkIndexBounds ( i ) ;^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P14_Delete_Statement]^^56^^^^^54^66^CollectionUtils.checkIndexBounds ( i ) ;^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P8_Replace_Mix]^while  ( e .nextElement (  )   )  {^57^^^^^54^66^while  ( e.hasMoreElements (  )  )  {^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P2_Replace_Operator]^if  ( i != -1 )  {^59^^^^^54^66^if  ( i == -1 )  {^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P3_Replace_Literal]^if  ( i == -index )  {^59^^^^^54^66^if  ( i == -1 )  {^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P5_Replace_Variable]^if  ( index == -1 )  {^59^^^^^54^66^if  ( i == -1 )  {^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P8_Replace_Mix]^if  ( i == -1L )  {^59^^^^^54^66^if  ( i == -1 )  {^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P15_Unwrap_Block]^return e.nextElement();^59^60^61^62^63^54^66^if  ( i == -1 )  { return e.nextElement (  ) ; } else { e.nextElement (  ) ; }^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P16_Remove_Block]^^59^60^61^62^63^54^66^if  ( i == -1 )  { return e.nextElement (  ) ; } else { e.nextElement (  ) ; }^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P14_Delete_Statement]^^62^^^^^54^66^e.nextElement (  ) ;^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P11_Insert_Donor_Statement]^return e.nextElement (  ) ;e.nextElement (  ) ;^62^^^^^54^66^e.nextElement (  ) ;^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P5_Replace_Variable]^return 4.nextElement (  ) ;^60^^^^^54^66^return e.nextElement (  ) ;^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P7_Replace_Invocation]^return e .hasMoreElements (  )  ;^60^^^^^54^66^return e.nextElement (  ) ;^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P14_Delete_Statement]^^60^^^^^54^66^return e.nextElement (  ) ;^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P3_Replace_Literal]^if  ( i == -i )  {^59^^^^^54^66^if  ( i == -1 )  {^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P8_Replace_Mix]^if  ( i == -1 >>> 3 )  {^59^^^^^54^66^if  ( i == -1 )  {^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P8_Replace_Mix]^e .hasMoreElements (  )  ;^62^^^^^54^66^e.nextElement (  ) ;^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P14_Delete_Statement]^^57^58^^^^54^66^while  ( e.hasMoreElements (  )  )  { i--;^[CLASS] EnumerationUtils  [METHOD] get [RETURN_TYPE] <T>   Enumeration<T> e final int index [VARIABLES] Enumeration  e  boolean  int  i  index  
[P5_Replace_Variable]^return IteratorUtils.toList ( new EnumerationIterator<E> ( null )  ) ;^80^^^^^79^81^return IteratorUtils.toList ( new EnumerationIterator<E> ( enumeration )  ) ;^[CLASS] EnumerationUtils  [METHOD] toList [RETURN_TYPE] <E>   Enumeration<? extends E> enumeration [VARIABLES] Enumeration  enumeration  boolean  
[P14_Delete_Statement]^^80^^^^^79^81^return IteratorUtils.toList ( new EnumerationIterator<E> ( enumeration )  ) ;^[CLASS] EnumerationUtils  [METHOD] toList [RETURN_TYPE] <E>   Enumeration<? extends E> enumeration [VARIABLES] Enumeration  enumeration  boolean  
[P1_Replace_Type]^final List<String> result = new  Set <String> ( stringTokenizer.countTokens (  )  ) ;^91^^^^^90^96^final List<String> result = new ArrayList<String> ( stringTokenizer.countTokens (  )  ) ;^[CLASS] EnumerationUtils  [METHOD] toList [RETURN_TYPE] List   StringTokenizer stringTokenizer [VARIABLES] StringTokenizer  stringTokenizer  boolean  List  result  
[P14_Delete_Statement]^^91^^^^^90^96^final List<String> result = new ArrayList<String> ( stringTokenizer.countTokens (  )  ) ;^[CLASS] EnumerationUtils  [METHOD] toList [RETURN_TYPE] List   StringTokenizer stringTokenizer [VARIABLES] StringTokenizer  stringTokenizer  boolean  List  result  
[P7_Replace_Invocation]^while  ( stringTokenizer .countTokens (  )   )  {^92^^^^^90^96^while  ( stringTokenizer.hasMoreTokens (  )  )  {^[CLASS] EnumerationUtils  [METHOD] toList [RETURN_TYPE] List   StringTokenizer stringTokenizer [VARIABLES] StringTokenizer  stringTokenizer  boolean  List  result  
[P8_Replace_Mix]^result.add ( stringTokenizer .countTokens (  )   ) ;^93^^^^^90^96^result.add ( stringTokenizer.nextToken (  )  ) ;^[CLASS] EnumerationUtils  [METHOD] toList [RETURN_TYPE] List   StringTokenizer stringTokenizer [VARIABLES] StringTokenizer  stringTokenizer  boolean  List  result  
[P14_Delete_Statement]^^93^^^^^90^96^result.add ( stringTokenizer.nextToken (  )  ) ;^[CLASS] EnumerationUtils  [METHOD] toList [RETURN_TYPE] List   StringTokenizer stringTokenizer [VARIABLES] StringTokenizer  stringTokenizer  boolean  List  result  
[P14_Delete_Statement]^^92^93^^^^90^96^while  ( stringTokenizer.hasMoreTokens (  )  )  { result.add ( stringTokenizer.nextToken (  )  ) ;^[CLASS] EnumerationUtils  [METHOD] toList [RETURN_TYPE] List   StringTokenizer stringTokenizer [VARIABLES] StringTokenizer  stringTokenizer  boolean  List  result  