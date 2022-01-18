[REPLACE]^private  Stubber mockitoStubber;^158^^^^^^^[REPLACE] private final Stubber mockitoStubber;^ [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl  
[REPLACE]^this.mockitoOngoingStubbing =  null;^83^^^^^82^84^[REPLACE] this.mockitoOngoingStubbing = ongoingStubbing;^[METHOD] <init> [TYPE] OngoingStubbing) [PARAMETER] OngoingStubbing<T> ongoingStubbing [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 
[REPLACE]^this.mockitoStubber =  null;^161^^^^^160^162^[REPLACE] this.mockitoStubber = mockitoStubber;^[METHOD] <init> [TYPE] Stubber) [PARAMETER] Stubber mockitoStubber [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 
[REPLACE]^return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenReturn ( answer )  ) ;^90^^^^^89^91^[REPLACE] return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenAnswer ( answer )  ) ;^[METHOD] willAnswer [TYPE] BDDMockito$BDDMyOngoingStubbing [PARAMETER] Answer<?> answer [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  Answer answer  [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true  [TYPE]  Stubber mockitoStubber 
[REPLACE]^return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenThrow ( value )  ) ;^97^^^^^96^98^[REPLACE] return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenReturn ( value )  ) ;^[METHOD] willReturn [TYPE] BDDMockito$BDDMyOngoingStubbing [PARAMETER] T value [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  Stubber mockitoStubber 
[REPLACE]^return  new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenAnswer ( answer )  )   ) ;^104^^^^^103^105^[REPLACE] return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenReturn ( value, values )  ) ;^[METHOD] willReturn [TYPE] BDDMockito$BDDMyOngoingStubbing [PARAMETER] T value  values [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  Stubber mockitoStubber  [TYPE]  T[] values 
[REPLACE]^return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenReturn ( value, values )  ) ;^111^^^^^110^112^[REPLACE] return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenThrow ( throwables )  ) ;^[METHOD] willThrow [TYPE] BDDMockito$BDDMyOngoingStubbing [PARAMETER]  throwables [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true  [TYPE]  Throwable[] throwables  [TYPE]  Stubber mockitoStubber 
[REPLACE]^return  new BDDStubberImpl ( doCallRealMethod (  )  )    ) ;^115^^^^^114^116^[REPLACE] return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenCallRealMethod (  )  ) ;^[METHOD] willCallRealMethod [TYPE] BDDMockito$BDDMyOngoingStubbing [PARAMETER] [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 
[REPLACE]^return new BDDOngoingStubbingImpl<T> ( Mockito.doReturn ( methodCall )  ) ;^123^^^^^122^124^[REPLACE] return new BDDOngoingStubbingImpl<T> ( Mockito.when ( methodCall )  ) ;^[METHOD] given [TYPE] <T> [PARAMETER] T methodCall [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true  [TYPE]  T methodCall  [TYPE]  Stubber mockitoStubber 
[REPLACE]^return mockitoStubber.doReturn ( mock ) ;^168^^^^^167^169^[REPLACE] return mockitoStubber.when ( mock ) ;^[METHOD] given [TYPE] <T> [PARAMETER] T mock [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true  [TYPE]  T mock  [TYPE]  Stubber mockitoStubber 
[REPLACE]^return  new BDDStubberImpl ( doThrow ( toBeThrown )  )   ) ;^175^^^^^174^176^[REPLACE] return new BDDStubberImpl ( mockitoStubber.doAnswer ( answer )  ) ;^[METHOD] willAnswer [TYPE] BDDMockito$BDDStubber [PARAMETER] Answer answer [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  Answer answer  [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true  [TYPE]  Stubber mockitoStubber 
[REPLACE]^return  new BDDStubberImpl ( doThrow ( toBeThrown )  )   ) ;^182^^^^^181^183^[REPLACE] return new BDDStubberImpl ( mockitoStubber.doNothing (  )  ) ;^[METHOD] willNothing [TYPE] BDDMockito$BDDStubber [PARAMETER] [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 
[REPLACE]^return  new BDDStubberImpl ( doThrow ( toBeThrown )  )   ) ;^189^^^^^188^190^[REPLACE] return new BDDStubberImpl ( mockitoStubber.doReturn ( toBeReturned )  ) ;^[METHOD] willReturn [TYPE] BDDMockito$BDDStubber [PARAMETER] Object toBeReturned [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  Object toBeReturned  [TYPE]  boolean false  true  [TYPE]  Stubber mockitoStubber 
[REPLACE]^return new BDDStubberImpl ( mockitoStubber.doReturn ( toBeThrown )  ) ;^196^^^^^195^197^[REPLACE] return new BDDStubberImpl ( mockitoStubber.doThrow ( toBeThrown )  ) ;^[METHOD] willThrow [TYPE] BDDMockito$BDDStubber [PARAMETER] Throwable toBeThrown [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  Throwable toBeThrown  [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true  [TYPE]  Stubber mockitoStubber 
[REPLACE]^return new BDDStubberImpl ( Mockito .doNothing (  )   ) ;^204^^^^^203^205^[REPLACE] return new BDDStubberImpl ( Mockito.doThrow ( toBeThrown )  ) ;^[METHOD] willThrow [TYPE] BDDMockito$BDDStubber [PARAMETER] Throwable toBeThrown [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  Throwable toBeThrown  [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true  [TYPE]  Stubber mockitoStubber 
[REPLACE]^return new BDDStubberImpl ( Mockito.doReturn ( answer )  ) ;^211^^^^^210^212^[REPLACE] return new BDDStubberImpl ( Mockito.doAnswer ( answer )  ) ;^[METHOD] willAnswer [TYPE] BDDMockito$BDDStubber [PARAMETER] Answer answer [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  Answer answer  [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true  [TYPE]  Stubber mockitoStubber 
[REPLACE]^return  new BDDStubberImpl ( doThrow ( toBeThrown )  )    ) ;^218^^^^^217^219^[REPLACE] return new BDDStubberImpl ( Mockito.doNothing (  )  ) ;^[METHOD] willDoNothing [TYPE] BDDMockito$BDDStubber [PARAMETER] [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 
[REPLACE]^return new BDDStubberImpl ( Mockito .doNothing (  )   ) ;^225^^^^^224^226^[REPLACE] return new BDDStubberImpl ( Mockito.doReturn ( toBeReturned )  ) ;^[METHOD] willReturn [TYPE] BDDMockito$BDDStubber [PARAMETER] Object toBeReturned [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  Object toBeReturned  [TYPE]  boolean false  true  [TYPE]  Stubber mockitoStubber 
[REPLACE]^return new BDDStubberImpl ( Mockito .doReturn ( null )   ) ;^232^^^^^231^233^[REPLACE] return new BDDStubberImpl ( Mockito.doCallRealMethod (  )  ) ;^[METHOD] willCallRealMethod [TYPE] BDDMockito$BDDStubber [PARAMETER] [CLASS] BDDMockito BDDOngoingStubbingImpl BDDStubberImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 
[REPLACE]^this.mockitoOngoingStubbing =  false;^83^^^^^82^84^[REPLACE] this.mockitoOngoingStubbing = ongoingStubbing;^[METHOD] <init> [TYPE] OngoingStubbing) [PARAMETER] OngoingStubbing<T> ongoingStubbing [CLASS] BDDOngoingStubbingImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true 
[REPLACE]^return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenReturn ( answer )  ) ;^90^^^^^89^91^[REPLACE] return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenAnswer ( answer )  ) ;^[METHOD] willAnswer [TYPE] BDDMockito$BDDMyOngoingStubbing [PARAMETER] Answer<?> answer [CLASS] BDDOngoingStubbingImpl   [TYPE]  Answer answer  [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true 
[REPLACE]^return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenThrow ( value )  ) ;^97^^^^^96^98^[REPLACE] return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenReturn ( value )  ) ;^[METHOD] willReturn [TYPE] BDDMockito$BDDMyOngoingStubbing [PARAMETER] T value [CLASS] BDDOngoingStubbingImpl   [TYPE]  T value  [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true 
[REPLACE]^return  new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenAnswer ( answer )  )   ) ;^104^^^^^103^105^[REPLACE] return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenReturn ( value, values )  ) ;^[METHOD] willReturn [TYPE] BDDMockito$BDDMyOngoingStubbing [PARAMETER] T value  values [CLASS] BDDOngoingStubbingImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  T[] values 
[REPLACE]^return  new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenAnswer ( answer )  )   ) ;^111^^^^^110^112^[REPLACE] return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenThrow ( throwables )  ) ;^[METHOD] willThrow [TYPE] BDDMockito$BDDMyOngoingStubbing [PARAMETER]  throwables [CLASS] BDDOngoingStubbingImpl   [TYPE]  Throwable[] throwables  [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true 
[REPLACE]^return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing .thenReturn ( this )   ) ;^115^^^^^114^116^[REPLACE] return new BDDOngoingStubbingImpl<T> ( mockitoOngoingStubbing.thenCallRealMethod (  )  ) ;^[METHOD] willCallRealMethod [TYPE] BDDMockito$BDDMyOngoingStubbing [PARAMETER] [CLASS] BDDOngoingStubbingImpl   [TYPE]  OngoingStubbing mockitoOngoingStubbing  ongoingStubbing  [TYPE]  boolean false  true 
[REPLACE]^this.mockitoStubber =  null;^161^^^^^160^162^[REPLACE] this.mockitoStubber = mockitoStubber;^[METHOD] <init> [TYPE] Stubber) [PARAMETER] Stubber mockitoStubber [CLASS] BDDStubberImpl   [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 
[REPLACE]^return mockitoStubber .doReturn ( null )  ;^168^^^^^167^169^[REPLACE] return mockitoStubber.when ( mock ) ;^[METHOD] given [TYPE] <T> [PARAMETER] T mock [CLASS] BDDStubberImpl   [TYPE]  T mock  [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 
[REPLACE]^return new BDDStubberImpl ( mockitoStubber.doReturn ( answer )  ) ;^175^^^^^174^176^[REPLACE] return new BDDStubberImpl ( mockitoStubber.doAnswer ( answer )  ) ;^[METHOD] willAnswer [TYPE] BDDMockito$BDDStubber [PARAMETER] Answer answer [CLASS] BDDStubberImpl   [TYPE]  Answer answer  [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 
[REPLACE]^return  new BDDStubberImpl ( mockitoStubber.doThrow ( toBeThrown )  )   ) ;^182^^^^^181^183^[REPLACE] return new BDDStubberImpl ( mockitoStubber.doNothing (  )  ) ;^[METHOD] willNothing [TYPE] BDDMockito$BDDStubber [PARAMETER] [CLASS] BDDStubberImpl   [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 
[REPLACE]^return new BDDStubberImpl ( mockitoStubber.doThrow ( toBeReturned )  ) ;^189^^^^^188^190^[REPLACE] return new BDDStubberImpl ( mockitoStubber.doReturn ( toBeReturned )  ) ;^[METHOD] willReturn [TYPE] BDDMockito$BDDStubber [PARAMETER] Object toBeReturned [CLASS] BDDStubberImpl   [TYPE]  Object toBeReturned  [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 
[REPLACE]^return new BDDStubberImpl ( mockitoStubber.doReturn ( toBeReturned )  ) ;^196^^^^^195^197^[REPLACE] return new BDDStubberImpl ( mockitoStubber.doThrow ( toBeThrown )  ) ;^[METHOD] willThrow [TYPE] BDDMockito$BDDStubber [PARAMETER] Throwable toBeThrown [CLASS] BDDStubberImpl   [TYPE]  Throwable toBeThrown  [TYPE]  Stubber mockitoStubber  [TYPE]  boolean false  true 