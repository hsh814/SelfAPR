[P8_Replace_Mix]^private final LinkedList<StubbedInvocationMatcher> stubbed  = null ;^20^^^^^15^25^private final LinkedList<StubbedInvocationMatcher> stubbed = new LinkedList<StubbedInvocationMatcher> (  ) ;^[CLASS] MockitoStubber   [VARIABLES] 
[P8_Replace_Mix]^private final List<Answer> answersForStubbing ;^22^^^^^17^27^private final List<Answer> answersForStubbing = new ArrayList<Answer> (  ) ;^[CLASS] MockitoStubber   [VARIABLES] 
[P8_Replace_Mix]^this.mockingProgress =  null;^27^^^^^26^28^this.mockingProgress = mockingProgress;^[CLASS] MockitoStubber  [METHOD] <init> [RETURN_TYPE] MockingProgress)   MockingProgress mockingProgress [VARIABLES] InvocationMatcher  invocationForStubbing  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P5_Replace_Variable]^this.invocationForStubbing = invocationForStubbing;^31^^^^^30^32^this.invocationForStubbing = invocation;^[CLASS] MockitoStubber  [METHOD] setInvocationForPotentialStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P11_Insert_Donor_Statement]^invocationForStubbing = invocation;this.invocationForStubbing = invocation;^31^^^^^30^32^this.invocationForStubbing = invocation;^[CLASS] MockitoStubber  [METHOD] setInvocationForPotentialStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P3_Replace_Literal]^addAnswer ( answer, true ) ;^35^^^^^34^36^addAnswer ( answer, false ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  Answer  answer  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P14_Delete_Statement]^^35^^^^^34^36^addAnswer ( answer, false ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  Answer  answer  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P11_Insert_Donor_Statement]^addAnswer ( answer, true ) ;addAnswer ( answer, false ) ;^35^^^^^34^36^addAnswer ( answer, false ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  Answer  answer  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P3_Replace_Literal]^addAnswer ( answer, false ) ;^39^^^^^38^40^addAnswer ( answer, true ) ;^[CLASS] MockitoStubber  [METHOD] addConsecutiveAnswer [RETURN_TYPE] void   Answer answer [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  Answer  answer  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P14_Delete_Statement]^^39^^^^^38^40^addAnswer ( answer, true ) ;^[CLASS] MockitoStubber  [METHOD] addConsecutiveAnswer [RETURN_TYPE] void   Answer answer [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  Answer  answer  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P11_Insert_Donor_Statement]^addAnswer ( answer, false ) ;addAnswer ( answer, true ) ;^39^^^^^38^40^addAnswer ( answer, true ) ;^[CLASS] MockitoStubber  [METHOD] addConsecutiveAnswer [RETURN_TYPE] void   Answer answer [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  Answer  answer  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P5_Replace_Variable]^Invocation invocation = invocation.getInvocation (  ) ;^43^^^^^42^53^Invocation invocation = invocationForStubbing.getInvocation (  ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P14_Delete_Statement]^^43^^^^^42^53^Invocation invocation = invocationForStubbing.getInvocation (  ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P14_Delete_Statement]^^44^45^^^^42^53^mockingProgress.stubbingCompleted ( invocation ) ; AnswersValidator answersValidator = new AnswersValidator (  ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P5_Replace_Variable]^answersValidator.validate (  invocation ) ;^46^^^^^42^53^answersValidator.validate ( answer, invocation ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P5_Replace_Variable]^answersValidator.validate ( answer ) ;^46^^^^^42^53^answersValidator.validate ( answer, invocation ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P5_Replace_Variable]^answersValidator.validate ( invocation, answer ) ;^46^^^^^42^53^answersValidator.validate ( answer, invocation ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P7_Replace_Invocation]^answersValidator .AnswersValidator (  )  ;^46^^^^^42^53^answersValidator.validate ( answer, invocation ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P14_Delete_Statement]^^46^^^^^42^53^answersValidator.validate ( answer, invocation ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P15_Unwrap_Block]^stubbed.getFirst().addAnswer(answer);^48^49^50^51^52^42^53^if  ( isConsecutive )  { stubbed.getFirst (  ) .addAnswer ( answer ) ; } else { stubbed.addFirst ( new StubbedInvocationMatcher ( invocationForStubbing, answer )  ) ; }^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P16_Remove_Block]^^48^49^50^51^52^42^53^if  ( isConsecutive )  { stubbed.getFirst (  ) .addAnswer ( answer ) ; } else { stubbed.addFirst ( new StubbedInvocationMatcher ( invocationForStubbing, answer )  ) ; }^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P5_Replace_Variable]^stubbed.addFirst ( new StubbedInvocationMatcher ( invocation, answer )  ) ;^51^^^^^42^53^stubbed.addFirst ( new StubbedInvocationMatcher ( invocationForStubbing, answer )  ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P5_Replace_Variable]^stubbed.addFirst ( new StubbedInvocationMatcher ( invocationForStubbing )  ) ;^51^^^^^42^53^stubbed.addFirst ( new StubbedInvocationMatcher ( invocationForStubbing, answer )  ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P5_Replace_Variable]^stubbed.addFirst ( new StubbedInvocationMatcher (  answer )  ) ;^51^^^^^42^53^stubbed.addFirst ( new StubbedInvocationMatcher ( invocationForStubbing, answer )  ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P5_Replace_Variable]^stubbed.addFirst ( new StubbedInvocationMatcher ( answer, invocationForStubbing )  ) ;^51^^^^^42^53^stubbed.addFirst ( new StubbedInvocationMatcher ( invocationForStubbing, answer )  ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P14_Delete_Statement]^^51^^^^^42^53^stubbed.addFirst ( new StubbedInvocationMatcher ( invocationForStubbing, answer )  ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P13_Insert_Block]^if  ( isConsecutive )  {     stubbed.getFirst (  ) .addAnswer ( answer ) ; }else {     stubbed.addFirst ( new StubbedInvocationMatcher ( invocationForStubbing, answer )  ) ; }^51^^^^^42^53^[Delete]^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P7_Replace_Invocation]^stubbed.getFirst (  ) .answer ( answer ) ;^49^^^^^42^53^stubbed.getFirst (  ) .addAnswer ( answer ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P7_Replace_Invocation]^stubbed.getFirst (  )  .addAnswer ( answer , isConsecutive )  ;^49^^^^^42^53^stubbed.getFirst (  ) .addAnswer ( answer ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P14_Delete_Statement]^^49^^^^^42^53^stubbed.getFirst (  ) .addAnswer ( answer ) ;^[CLASS] MockitoStubber  [METHOD] addAnswer [RETURN_TYPE] void   Answer answer boolean isConsecutive [VARIABLES] Answer  answer  boolean  isConsecutive  Invocation  invocation  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  AnswersValidator  answersValidator  
[P7_Replace_Invocation]^return answerTo ( invocation ) .answer ( invocation ) ;^56^^^^^55^57^return findAnswerFor ( invocation ) .answer ( invocation ) ;^[CLASS] MockitoStubber  [METHOD] answerTo [RETURN_TYPE] Object   Invocation invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  boolean  Invocation  invocation  MockingProgress  mockingProgress  LinkedList  stubbed  
[P14_Delete_Statement]^^56^^^^^55^57^return findAnswerFor ( invocation ) .answer ( invocation ) ;^[CLASS] MockitoStubber  [METHOD] answerTo [RETURN_TYPE] Object   Invocation invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  boolean  Invocation  invocation  MockingProgress  mockingProgress  LinkedList  stubbed  
[P5_Replace_Variable]^if  ( invocation.matches ( s )  )  {^61^^^^^59^67^if  ( s.matches ( invocation )  )  {^[CLASS] MockitoStubber  [METHOD] findAnswerFor [RETURN_TYPE] Answer   Invocation invocation [VARIABLES] boolean  Invocation  invocation  StubbedInvocationMatcher  s  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  
[P15_Unwrap_Block]^return s;^61^62^63^^^59^67^if  ( s.matches ( invocation )  )  { return s; }^[CLASS] MockitoStubber  [METHOD] findAnswerFor [RETURN_TYPE] Answer   Invocation invocation [VARIABLES] boolean  Invocation  invocation  StubbedInvocationMatcher  s  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  
[P16_Remove_Block]^^61^62^63^^^59^67^if  ( s.matches ( invocation )  )  { return s; }^[CLASS] MockitoStubber  [METHOD] findAnswerFor [RETURN_TYPE] Answer   Invocation invocation [VARIABLES] boolean  Invocation  invocation  StubbedInvocationMatcher  s  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  
[P8_Replace_Mix]^return false;^66^^^^^59^67^return null;^[CLASS] MockitoStubber  [METHOD] findAnswerFor [RETURN_TYPE] Answer   Invocation invocation [VARIABLES] boolean  Invocation  invocation  StubbedInvocationMatcher  s  InvocationMatcher  invocation  invocationForStubbing  List  answersForStubbing  MockingProgress  mockingProgress  LinkedList  stubbed  
[P7_Replace_Invocation]^answersForStubbing.addAll ( answer ) ;^70^^^^^69^71^answersForStubbing.add ( answer ) ;^[CLASS] MockitoStubber  [METHOD] addAnswerForVoidMethod [RETURN_TYPE] void   Answer answer [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  Answer  answer  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P14_Delete_Statement]^^70^^^^^69^71^answersForStubbing.add ( answer ) ;^[CLASS] MockitoStubber  [METHOD] addAnswerForVoidMethod [RETURN_TYPE] void   Answer answer [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  Answer  answer  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P11_Insert_Donor_Statement]^return !answersForStubbing.isEmpty (  ) ;answersForStubbing.add ( answer ) ;^70^^^^^69^71^answersForStubbing.add ( answer ) ;^[CLASS] MockitoStubber  [METHOD] addAnswerForVoidMethod [RETURN_TYPE] void   Answer answer [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  Answer  answer  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P11_Insert_Donor_Statement]^answersForStubbing.clear (  ) ;answersForStubbing.add ( answer ) ;^70^^^^^69^71^answersForStubbing.add ( answer ) ;^[CLASS] MockitoStubber  [METHOD] addAnswerForVoidMethod [RETURN_TYPE] void   Answer answer [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  Answer  answer  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P11_Insert_Donor_Statement]^answersForStubbing.addAll ( answers ) ;answersForStubbing.add ( answer ) ;^70^^^^^69^71^answersForStubbing.add ( answer ) ;^[CLASS] MockitoStubber  [METHOD] addAnswerForVoidMethod [RETURN_TYPE] void   Answer answer [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  Answer  answer  List  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P7_Replace_Invocation]^answersForStubbing.get ( answers ) ;^74^^^^^73^75^answersForStubbing.addAll ( answers ) ;^[CLASS] MockitoStubber  [METHOD] setAnswersForStubbing [RETURN_TYPE] void   Answer> answers [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P14_Delete_Statement]^^74^^^^^73^75^answersForStubbing.addAll ( answers ) ;^[CLASS] MockitoStubber  [METHOD] setAnswersForStubbing [RETURN_TYPE] void   Answer> answers [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P11_Insert_Donor_Statement]^answersForStubbing.add ( answer ) ;answersForStubbing.addAll ( answers ) ;^74^^^^^73^75^answersForStubbing.addAll ( answers ) ;^[CLASS] MockitoStubber  [METHOD] setAnswersForStubbing [RETURN_TYPE] void   Answer> answers [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P11_Insert_Donor_Statement]^answersForStubbing.clear (  ) ;answersForStubbing.addAll ( answers ) ;^74^^^^^73^75^answersForStubbing.addAll ( answers ) ;^[CLASS] MockitoStubber  [METHOD] setAnswersForStubbing [RETURN_TYPE] void   Answer> answers [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P7_Replace_Invocation]^return !answersForStubbing.size (  ) ;^78^^^^^77^79^return !answersForStubbing.isEmpty (  ) ;^[CLASS] MockitoStubber  [METHOD] hasAnswersForStubbing [RETURN_TYPE] boolean   [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P14_Delete_Statement]^^78^^^^^77^79^return !answersForStubbing.isEmpty (  ) ;^[CLASS] MockitoStubber  [METHOD] hasAnswersForStubbing [RETURN_TYPE] boolean   [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P5_Replace_Variable]^invocationForStubbing = invocationForStubbing;^82^^^^^81^88^invocationForStubbing = invocation;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P8_Replace_Mix]^invocationForStubbing =  null;^82^^^^^81^88^invocationForStubbing = invocation;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P11_Insert_Donor_Statement]^this.invocationForStubbing = invocation;invocationForStubbing = invocation;^82^^^^^81^88^invocationForStubbing = invocation;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P14_Delete_Statement]^^83^^^^^81^88^assert hasAnswersForStubbing (  ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P11_Insert_Donor_Statement]^return !answersForStubbing.isEmpty (  ) ;assert hasAnswersForStubbing (  ) ;^83^^^^^81^88^assert hasAnswersForStubbing (  ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P11_Insert_Donor_Statement]^answersForStubbing.clear (  ) ;assert hasAnswersForStubbing (  ) ;^83^^^^^81^88^assert hasAnswersForStubbing (  ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P11_Insert_Donor_Statement]^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;assert hasAnswersForStubbing (  ) ;^83^^^^^81^88^assert hasAnswersForStubbing (  ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P1_Replace_Type]^for  (  short  i = 0; i < answersForStubbing.size (  ) ; i++ )  {^84^^^^^81^88^for  ( int i = 0; i < answersForStubbing.size (  ) ; i++ )  {^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P2_Replace_Operator]^for  ( int i = 0; i > answersForStubbing.size (  ) ; i++ )  {^84^^^^^81^88^for  ( int i = 0; i < answersForStubbing.size (  ) ; i++ )  {^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P3_Replace_Literal]^for  ( int i = i; i < answersForStubbing.size (  ) ; i++ )  {^84^^^^^81^88^for  ( int i = 0; i < answersForStubbing.size (  ) ; i++ )  {^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P3_Replace_Literal]^for  ( int i = 0; i < answersForStubbing.size() - 6 ; i++ )  {^84^^^^^81^88^for  ( int i = 0; i < answersForStubbing.size (  ) ; i++ )  {^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P5_Replace_Variable]^for  ( answersForStubbingnt i = 0; i < i.size (  ) ; i++ )  {^84^^^^^81^88^for  ( int i = 0; i < answersForStubbing.size (  ) ; i++ )  {^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P7_Replace_Invocation]^for  ( int i = 0; i < answersForStubbing.clear (  ) ; i++ )  {^84^^^^^81^88^for  ( int i = 0; i < answersForStubbing.size (  ) ; i++ )  {^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P8_Replace_Mix]^for  ( int i = 0; i < answersForStubbing .isEmpty (  )  ; i++ )  {^84^^^^^81^88^for  ( int i = 0; i < answersForStubbing.size (  ) ; i++ )  {^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P2_Replace_Operator]^addAnswer ( answersForStubbing.get ( i ) , i >= 0 ) ;^85^^^^^81^88^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P3_Replace_Literal]^addAnswer ( answersForStubbing.get ( i ) , i != i ) ;^85^^^^^81^88^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P5_Replace_Variable]^addAnswer ( this.get ( i ) , i != 0 ) ;^85^^^^^81^88^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P5_Replace_Variable]^addAnswer ( answersForStubbing.get ( i )  != 0 ) ;^85^^^^^81^88^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P5_Replace_Variable]^addAnswer ( i.get ( answersForStubbing ) , i != 0 ) ;^85^^^^^81^88^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P7_Replace_Invocation]^addAnswer ( answersForStubbing.addAll ( i ) , i != 0 ) ;^85^^^^^81^88^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P14_Delete_Statement]^^85^^^^^81^88^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P11_Insert_Donor_Statement]^return !answersForStubbing.isEmpty (  ) ;addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^85^^^^^81^88^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P11_Insert_Donor_Statement]^assert hasAnswersForStubbing (  ) ;addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^85^^^^^81^88^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P3_Replace_Literal]^for  ( int i = 0; i < answersForStubbing.size() + 6 ; i++ )  {^84^^^^^81^88^for  ( int i = 0; i < answersForStubbing.size (  ) ; i++ )  {^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P3_Replace_Literal]^for  ( int i = 0; i < answersForStubbing.size() + 5 ; i++ )  {^84^^^^^81^88^for  ( int i = 0; i < answersForStubbing.size (  ) ; i++ )  {^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P14_Delete_Statement]^^84^85^86^^^81^88^for  ( int i = 0; i < answersForStubbing.size (  ) ; i++ )  { addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ; }^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P3_Replace_Literal]^addAnswer ( answersForStubbing.get ( i ) , i != -5 ) ;^85^^^^^81^88^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P7_Replace_Invocation]^addAnswer ( answersForStubbing .isEmpty (  )  , i != 0 ) ;^85^^^^^81^88^addAnswer ( answersForStubbing.get ( i ) , i != 0 ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P7_Replace_Invocation]^answersForStubbing.size (  ) ;^87^^^^^81^88^answersForStubbing.clear (  ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P14_Delete_Statement]^^87^^^^^81^88^answersForStubbing.clear (  ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P11_Insert_Donor_Statement]^return !answersForStubbing.isEmpty (  ) ;answersForStubbing.clear (  ) ;^87^^^^^81^88^answersForStubbing.clear (  ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P11_Insert_Donor_Statement]^answersForStubbing.add ( answer ) ;answersForStubbing.clear (  ) ;^87^^^^^81^88^answersForStubbing.clear (  ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P11_Insert_Donor_Statement]^answersForStubbing.addAll ( answers ) ;answersForStubbing.clear (  ) ;^87^^^^^81^88^answersForStubbing.clear (  ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P11_Insert_Donor_Statement]^assert hasAnswersForStubbing (  ) ;answersForStubbing.clear (  ) ;^87^^^^^81^88^answersForStubbing.clear (  ) ;^[CLASS] MockitoStubber  [METHOD] setMethodForStubbing [RETURN_TYPE] void   InvocationMatcher invocation [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  int  i  
[P3_Replace_Literal]^return "rStub" + invocationForStubbing;^92^^^^^91^93^return "invocationForStubbing: " + invocationForStubbing;^[CLASS] MockitoStubber  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P5_Replace_Variable]^return "invocationForStubbing: " + invocation;^92^^^^^91^93^return "invocationForStubbing: " + invocationForStubbing;^[CLASS] MockitoStubber  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  
[P8_Replace_Mix]^return "invocationForStubbing: " +null;^92^^^^^91^93^return "invocationForStubbing: " + invocationForStubbing;^[CLASS] MockitoStubber  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] InvocationMatcher  invocation  invocationForStubbing  List  answers  answersForStubbing  boolean  MockingProgress  mockingProgress  LinkedList  stubbed  