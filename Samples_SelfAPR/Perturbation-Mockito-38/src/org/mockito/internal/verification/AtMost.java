[P1_Replace_Type]^private final  long  maxNumberOfInvocations;^19^^^^^14^24^private final int maxNumberOfInvocations;^[CLASS] AtMost   [VARIABLES] 
[P8_Replace_Mix]^private   short  maxNumberOfInvocations;^19^^^^^14^24^private final int maxNumberOfInvocations;^[CLASS] AtMost   [VARIABLES] 
[P12_Insert_Condition]^if  ( foundSize > maxNumberOfInvocations )  { private final int maxNumberOfInvocations; }^19^^^^^14^24^private final int maxNumberOfInvocations;^[CLASS] AtMost   [VARIABLES] 
[P2_Replace_Operator]^if  ( maxNumberOfInvocations == 0 )  {^22^^^^^21^26^if  ( maxNumberOfInvocations < 0 )  {^[CLASS] AtMost  [METHOD] <init> [RETURN_TYPE] AtMost(int)   int maxNumberOfInvocations [VARIABLES] int  maxNumberOfInvocations  boolean  
[P8_Replace_Mix]^if  ( maxNumberOfInvocations < 2 )  {^22^^^^^21^26^if  ( maxNumberOfInvocations < 0 )  {^[CLASS] AtMost  [METHOD] <init> [RETURN_TYPE] AtMost(int)   int maxNumberOfInvocations [VARIABLES] int  maxNumberOfInvocations  boolean  
[P15_Unwrap_Block]^throw new org.mockito.exceptions.base.MockitoException("Negative value is not allowed here");^22^23^24^^^21^26^if  ( maxNumberOfInvocations < 0 )  { throw new MockitoException  (" ")  ; }^[CLASS] AtMost  [METHOD] <init> [RETURN_TYPE] AtMost(int)   int maxNumberOfInvocations [VARIABLES] int  maxNumberOfInvocations  boolean  
[P16_Remove_Block]^^22^23^24^^^21^26^if  ( maxNumberOfInvocations < 0 )  { throw new MockitoException  (" ")  ; }^[CLASS] AtMost  [METHOD] <init> [RETURN_TYPE] AtMost(int)   int maxNumberOfInvocations [VARIABLES] int  maxNumberOfInvocations  boolean  
[P13_Insert_Block]^if  ( maxNumberOfInvocations < 0 )  {     throw new MockitoException ( "Negative value is not allowed here" ) ; }^23^^^^^21^26^[Delete]^[CLASS] AtMost  [METHOD] <init> [RETURN_TYPE] AtMost(int)   int maxNumberOfInvocations [VARIABLES] int  maxNumberOfInvocations  boolean  
[P8_Replace_Mix]^this.maxNumberOfInvocations =  null;^25^^^^^21^26^this.maxNumberOfInvocations = maxNumberOfInvocations;^[CLASS] AtMost  [METHOD] <init> [RETURN_TYPE] AtMost(int)   int maxNumberOfInvocations [VARIABLES] int  maxNumberOfInvocations  boolean  
[P7_Replace_Invocation]^List<Invocation> invocations = data .getWanted (  )  ;^29^^^^^28^42^List<Invocation> invocations = data.getAllInvocations (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P11_Insert_Donor_Statement]^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;List<Invocation> invocations = data.getAllInvocations (  ) ;^29^^^^^28^42^List<Invocation> invocations = data.getAllInvocations (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P14_Delete_Statement]^^29^^^^^28^42^List<Invocation> invocations = data.getAllInvocations (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P8_Replace_Mix]^InvocationMatcher wanted = data .getAllInvocations (  )  ;^30^^^^^28^42^InvocationMatcher wanted = data.getWanted (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P11_Insert_Donor_Statement]^InvocationsFinder finder = new InvocationsFinder (  ) ;InvocationMatcher wanted = data.getWanted (  ) ;^30^^^^^28^42^InvocationMatcher wanted = data.getWanted (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P14_Delete_Statement]^^30^^^^^28^42^InvocationMatcher wanted = data.getWanted (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P11_Insert_Donor_Statement]^InvocationMatcher wanted = data.getWanted (  ) ;InvocationsFinder finder = new InvocationsFinder (  ) ;^32^^^^^28^42^InvocationsFinder finder = new InvocationsFinder (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P11_Insert_Donor_Statement]^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;InvocationsFinder finder = new InvocationsFinder (  ) ;^32^^^^^28^42^InvocationsFinder finder = new InvocationsFinder (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P5_Replace_Variable]^List<Invocation> found = finder.findInvocations (  wanted ) ;^33^^^^^28^42^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P5_Replace_Variable]^List<Invocation> found = finder.findInvocations ( invocations ) ;^33^^^^^28^42^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P5_Replace_Variable]^List<Invocation> found = invocations.findInvocations ( finder, wanted ) ;^33^^^^^28^42^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P5_Replace_Variable]^List<Invocation> found = finder.findInvocations ( wanted, invocations ) ;^33^^^^^28^42^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P11_Insert_Donor_Statement]^List<Invocation> invocations = data.getAllInvocations (  ) ;List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^33^^^^^28^42^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P11_Insert_Donor_Statement]^InvocationsFinder finder = new InvocationsFinder (  ) ;List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^33^^^^^28^42^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P5_Replace_Variable]^List<Invocation> found = finder.findInvocations ( this, wanted ) ;^33^^^^^28^42^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P7_Replace_Invocation]^List<Invocation> found = finder .InvocationsFinder (  )  ;^33^^^^^28^42^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P8_Replace_Mix]^List<Invocation> found = finder.findInvocations ( 1, wanted ) ;^33^^^^^28^42^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P14_Delete_Statement]^^33^^^^^28^42^List<Invocation> found = finder.findInvocations ( invocations, wanted ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P1_Replace_Type]^short  foundSize = found.size (  ) ;^34^^^^^28^42^int foundSize = found.size (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P3_Replace_Literal]^int foundSize = found.size() - 5 ;^34^^^^^28^42^int foundSize = found.size (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P3_Replace_Literal]^int foundSize = found.size() + 3 ;^34^^^^^28^42^int foundSize = found.size (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P14_Delete_Statement]^^34^^^^^28^42^int foundSize = found.size (  ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P2_Replace_Operator]^if  ( foundSize >= maxNumberOfInvocations )  {^35^^^^^28^42^if  ( foundSize > maxNumberOfInvocations )  {^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P5_Replace_Variable]^if  ( maxNumberOfInvocations > foundSize )  {^35^^^^^28^42^if  ( foundSize > maxNumberOfInvocations )  {^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P15_Unwrap_Block]^new org.mockito.exceptions.Reporter().wantedAtMostX(maxNumberOfInvocations, foundSize);^35^36^37^^^28^42^if  ( foundSize > maxNumberOfInvocations )  { new Reporter (  ) .wantedAtMostX ( maxNumberOfInvocations, foundSize ) ; }^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P16_Remove_Block]^^35^36^37^^^28^42^if  ( foundSize > maxNumberOfInvocations )  { new Reporter (  ) .wantedAtMostX ( maxNumberOfInvocations, foundSize ) ; }^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P5_Replace_Variable]^new Reporter (  ) .wantedAtMostX ( maxNumberOfInvocations ) ;^36^^^^^28^42^new Reporter (  ) .wantedAtMostX ( maxNumberOfInvocations, foundSize ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P5_Replace_Variable]^new Reporter (  ) .wantedAtMostX (  foundSize ) ;^36^^^^^28^42^new Reporter (  ) .wantedAtMostX ( maxNumberOfInvocations, foundSize ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P5_Replace_Variable]^new Reporter (  ) .wantedAtMostX ( foundSize, maxNumberOfInvocations ) ;^36^^^^^28^42^new Reporter (  ) .wantedAtMostX ( maxNumberOfInvocations, foundSize ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P7_Replace_Invocation]^new Reporter (  )  .Reporter (  )  ;^36^^^^^28^42^new Reporter (  ) .wantedAtMostX ( maxNumberOfInvocations, foundSize ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P14_Delete_Statement]^^36^^^^^28^42^new Reporter (  ) .wantedAtMostX ( maxNumberOfInvocations, foundSize ) ;^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P13_Insert_Block]^if  ( foundSize >  ( maxNumberOfInvocations )  )  {     new Reporter (  ) .wantedAtMostX ( maxNumberOfInvocations, foundSize ) ; }^36^^^^^28^42^[Delete]^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
[P14_Delete_Statement]^^40^41^^^^28^42^i.markVerified (  ) ; }^[CLASS] AtMost  [METHOD] verify [RETURN_TYPE] void   VerificationData data [VARIABLES] boolean  Invocation  i  InvocationsFinder  finder  InvocationMatcher  wanted  List  found  invocations  int  foundSize  maxNumberOfInvocations  VerificationData  data  
