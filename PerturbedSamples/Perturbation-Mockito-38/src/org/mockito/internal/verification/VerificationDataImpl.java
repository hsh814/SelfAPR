[REPLACE]^private  InvocationMatcher wanted;^16^^^^^^^[REPLACE] private final InvocationMatcher wanted;^ [CLASS] VerificationDataImpl  
[REPLACE]^this.allInvocations =  null;^19^^^^^18^21^[REPLACE] this.allInvocations = allInvocations;^[METHOD] <init> [TYPE] InvocationMatcher) [PARAMETER] Invocation> allInvocations InvocationMatcher wanted [CLASS] VerificationDataImpl   [TYPE]  InvocationMatcher wanted  [TYPE]  List allInvocations  [TYPE]  boolean false  true 
[REPLACE]^this.wanted =  null;^20^^^^^18^21^[REPLACE] this.wanted = wanted;^[METHOD] <init> [TYPE] InvocationMatcher) [PARAMETER] Invocation> allInvocations InvocationMatcher wanted [CLASS] VerificationDataImpl   [TYPE]  InvocationMatcher wanted  [TYPE]  List allInvocations  [TYPE]  boolean false  true 
[REPLACE]^return wanted;^24^^^^^23^25^[REPLACE] return allInvocations;^[METHOD] getAllInvocations [TYPE] List [PARAMETER] [CLASS] VerificationDataImpl   [TYPE]  InvocationMatcher wanted  [TYPE]  List allInvocations  [TYPE]  boolean false  true 
[REPLACE]^return allInvocations;^28^^^^^27^29^[REPLACE] return wanted;^[METHOD] getWanted [TYPE] InvocationMatcher [PARAMETER] [CLASS] VerificationDataImpl   [TYPE]  InvocationMatcher wanted  [TYPE]  List allInvocations  [TYPE]  boolean false  true 