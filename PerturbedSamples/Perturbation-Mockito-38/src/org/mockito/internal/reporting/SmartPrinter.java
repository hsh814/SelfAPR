[ADD]^^20^21^^^^19^26^[ADD] PrintSettings printSettings = new PrintSettings (  ) ; printSettings.setMultiline ( wanted.toString (  ) .contains ( "\n" )  || actual.toString (  ) .contains ( "\n" )  ) ;^[METHOD] <init> [TYPE] Integer[]) [PARAMETER] PrintingFriendlyInvocation wanted PrintingFriendlyInvocation actual  indexesOfMatchersToBeDescribedWithExtraTypeInfo [CLASS] SmartPrinter   [TYPE]  PrintSettings printSettings  [TYPE]  String actual  wanted  [TYPE]  PrintingFriendlyInvocation actual  wanted  [TYPE]  boolean false  true  [TYPE]  Integer[] indexesOfMatchersToBeDescribedWithExtraTypeInfo 
[REPLACE]^printSettings.setMultiline ( wanted.toString (  ) .contains ( "\n" )  ;^21^^^^^19^26^[REPLACE] printSettings.setMultiline ( wanted.toString (  ) .contains ( "\n" )  || actual.toString (  ) .contains ( "\n" )  ) ;^[METHOD] <init> [TYPE] Integer[]) [PARAMETER] PrintingFriendlyInvocation wanted PrintingFriendlyInvocation actual  indexesOfMatchersToBeDescribedWithExtraTypeInfo [CLASS] SmartPrinter   [TYPE]  PrintSettings printSettings  [TYPE]  String actual  wanted  [TYPE]  PrintingFriendlyInvocation actual  wanted  [TYPE]  boolean false  true  [TYPE]  Integer[] indexesOfMatchersToBeDescribedWithExtraTypeInfo 
[REPLACE]^printSettings.setMultiline ( actual.toString (  ) .contains ( "\n" )  || actual.toString (  ) .contains ( "\n" )  ) ;^21^^^^^19^26^[REPLACE] printSettings.setMultiline ( wanted.toString (  ) .contains ( "\n" )  || actual.toString (  ) .contains ( "\n" )  ) ;^[METHOD] <init> [TYPE] Integer[]) [PARAMETER] PrintingFriendlyInvocation wanted PrintingFriendlyInvocation actual  indexesOfMatchersToBeDescribedWithExtraTypeInfo [CLASS] SmartPrinter   [TYPE]  PrintSettings printSettings  [TYPE]  String actual  wanted  [TYPE]  PrintingFriendlyInvocation actual  wanted  [TYPE]  boolean false  true  [TYPE]  Integer[] indexesOfMatchersToBeDescribedWithExtraTypeInfo 
[ADD]^printSettings.setMatchersToBeDescribedWithExtraTypeInfo ( indexesOfMatchersToBeDescribedWithExtraTypeInfo ) ;^21^22^^^^19^26^[ADD] printSettings.setMultiline ( wanted.toString (  ) .contains ( "\n" )  || actual.toString (  ) .contains ( "\n" )  ) ; printSettings.setMatchersToBeDescribedWithExtraTypeInfo ( indexesOfMatchersToBeDescribedWithExtraTypeInfo ) ;^[METHOD] <init> [TYPE] Integer[]) [PARAMETER] PrintingFriendlyInvocation wanted PrintingFriendlyInvocation actual  indexesOfMatchersToBeDescribedWithExtraTypeInfo [CLASS] SmartPrinter   [TYPE]  PrintSettings printSettings  [TYPE]  String actual  wanted  [TYPE]  PrintingFriendlyInvocation actual  wanted  [TYPE]  boolean false  true  [TYPE]  Integer[] indexesOfMatchersToBeDescribedWithExtraTypeInfo 
[REPLACE]^printSettings.setMultiline ( wanted.toString (  ) .contains ( "\n" )  || wanted.toString (  ) .contains ( "\n" )  ) ;^21^^^^^19^26^[REPLACE] printSettings.setMultiline ( wanted.toString (  ) .contains ( "\n" )  || actual.toString (  ) .contains ( "\n" )  ) ;^[METHOD] <init> [TYPE] Integer[]) [PARAMETER] PrintingFriendlyInvocation wanted PrintingFriendlyInvocation actual  indexesOfMatchersToBeDescribedWithExtraTypeInfo [CLASS] SmartPrinter   [TYPE]  PrintSettings printSettings  [TYPE]  String actual  wanted  [TYPE]  PrintingFriendlyInvocation actual  wanted  [TYPE]  boolean false  true  [TYPE]  Integer[] indexesOfMatchersToBeDescribedWithExtraTypeInfo 
[ADD]^^21^22^^^^19^26^[ADD] printSettings.setMultiline ( wanted.toString (  ) .contains ( "\n" )  || actual.toString (  ) .contains ( "\n" )  ) ; printSettings.setMatchersToBeDescribedWithExtraTypeInfo ( indexesOfMatchersToBeDescribedWithExtraTypeInfo ) ;^[METHOD] <init> [TYPE] Integer[]) [PARAMETER] PrintingFriendlyInvocation wanted PrintingFriendlyInvocation actual  indexesOfMatchersToBeDescribedWithExtraTypeInfo [CLASS] SmartPrinter   [TYPE]  PrintSettings printSettings  [TYPE]  String actual  wanted  [TYPE]  PrintingFriendlyInvocation actual  wanted  [TYPE]  boolean false  true  [TYPE]  Integer[] indexesOfMatchersToBeDescribedWithExtraTypeInfo 
[REPLACE]^printSettings .PrintSettings (  )  ;^22^^^^^19^26^[REPLACE] printSettings.setMatchersToBeDescribedWithExtraTypeInfo ( indexesOfMatchersToBeDescribedWithExtraTypeInfo ) ;^[METHOD] <init> [TYPE] Integer[]) [PARAMETER] PrintingFriendlyInvocation wanted PrintingFriendlyInvocation actual  indexesOfMatchersToBeDescribedWithExtraTypeInfo [CLASS] SmartPrinter   [TYPE]  PrintSettings printSettings  [TYPE]  String actual  wanted  [TYPE]  PrintingFriendlyInvocation actual  wanted  [TYPE]  boolean false  true  [TYPE]  Integer[] indexesOfMatchersToBeDescribedWithExtraTypeInfo 
[REPLACE]^this.actual = actual.toString ( printSettings ) ; ;^24^^^^^19^26^[REPLACE] this.wanted = wanted.toString ( printSettings ) ;^[METHOD] <init> [TYPE] Integer[]) [PARAMETER] PrintingFriendlyInvocation wanted PrintingFriendlyInvocation actual  indexesOfMatchersToBeDescribedWithExtraTypeInfo [CLASS] SmartPrinter   [TYPE]  PrintSettings printSettings  [TYPE]  String actual  wanted  [TYPE]  PrintingFriendlyInvocation actual  wanted  [TYPE]  boolean false  true  [TYPE]  Integer[] indexesOfMatchersToBeDescribedWithExtraTypeInfo 
[REPLACE]^this.wanted = wanted.toString ( printSettings ) ; ;^25^^^^^19^26^[REPLACE] this.actual = actual.toString ( printSettings ) ;^[METHOD] <init> [TYPE] Integer[]) [PARAMETER] PrintingFriendlyInvocation wanted PrintingFriendlyInvocation actual  indexesOfMatchersToBeDescribedWithExtraTypeInfo [CLASS] SmartPrinter   [TYPE]  PrintSettings printSettings  [TYPE]  String actual  wanted  [TYPE]  PrintingFriendlyInvocation actual  wanted  [TYPE]  boolean false  true  [TYPE]  Integer[] indexesOfMatchersToBeDescribedWithExtraTypeInfo 
[REPLACE]^return actual;^29^^^^^28^30^[REPLACE] return wanted;^[METHOD] getWanted [TYPE] String [PARAMETER] [CLASS] SmartPrinter   [TYPE]  String actual  wanted  [TYPE]  boolean false  true 
[REPLACE]^return wanted;^33^^^^^32^34^[REPLACE] return actual;^[METHOD] getActual [TYPE] String [PARAMETER] [CLASS] SmartPrinter   [TYPE]  String actual  wanted  [TYPE]  boolean false  true 