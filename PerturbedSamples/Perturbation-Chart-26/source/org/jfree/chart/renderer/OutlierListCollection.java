[REPLACE]^private boolean highFarOut  = null ;^72^^^^^^^[REPLACE] private boolean highFarOut = false;^ [CLASS] OutlierListCollection  
[REPLACE]^private boolean lowFarOut ;^78^^^^^^^[REPLACE] private boolean lowFarOut = false;^ [CLASS] OutlierListCollection  
[REPLACE]^this.outlierLists ;^84^^^^^83^85^[REPLACE] this.outlierLists = new ArrayList (  ) ;^[METHOD] <init> [TYPE] OutlierListCollection() [PARAMETER] [CLASS] OutlierListCollection   [TYPE]  List outlierLists  [TYPE]  boolean false  highFarOut  lowFarOut  true 
[REPLACE]^return this.lowFarOut;^94^^^^^93^95^[REPLACE] return this.highFarOut;^[METHOD] isHighFarOut [TYPE] boolean [PARAMETER] [CLASS] OutlierListCollection   [TYPE]  List outlierLists  [TYPE]  boolean false  highFarOut  lowFarOut  true 
[REPLACE]^this.lowFarOut = farOut; ;^104^^^^^103^105^[REPLACE] this.highFarOut = farOut;^[METHOD] setHighFarOut [TYPE] void [PARAMETER] boolean farOut [CLASS] OutlierListCollection   [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true 
[REPLACE]^return this.highFarOut;^114^^^^^113^115^[REPLACE] return this.lowFarOut;^[METHOD] isLowFarOut [TYPE] boolean [PARAMETER] [CLASS] OutlierListCollection   [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true 
[REPLACE]^this.highFarOut = farOut; ;^124^^^^^123^125^[REPLACE] this.lowFarOut = farOut;^[METHOD] setLowFarOut [TYPE] void [PARAMETER] boolean farOut [CLASS] OutlierListCollection   [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true 
[REPLACE]^if  ( list.isOverlapped ( outlier )  )  {^139^^^^^137^158^[REPLACE] if  ( this.outlierLists.isEmpty (  )  )  {^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[ADD]^return this.outlierLists.add ( new OutlierList ( outlier )  ) ;^139^140^141^^^137^158^[ADD] if  ( this.outlierLists.isEmpty (  )  )  { return this.outlierLists.add ( new OutlierList ( outlier )  ) ; }^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^if  ( list.add ( outlier )  )  {^147^^^^^137^158^[REPLACE] if  ( list.isOverlapped ( outlier )  )  {^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^updated =  updateOutlierList ( null, outlier ) ;^148^^^^^137^158^[REPLACE] updated = updateOutlierList ( list, outlier ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[ADD]^^148^^^^^137^158^[ADD] updated = updateOutlierList ( list, outlier ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^if  ( updated )  {^151^^^^^137^158^[REPLACE] if  ( !updated )  {^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[ADD]^^151^152^153^154^^137^158^[ADD] if  ( !updated )  {  updated = this.outlierLists.add ( new OutlierList ( outlier )  ) ; }^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^updated =  this.nullLists.add ( new OutlierList ( null )  ) ;^153^^^^^137^158^[REPLACE] updated = this.outlierLists.add ( new OutlierList ( outlier )  ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^for  ( Iterator iterator = this.outlierLists .isEmpty (  )  ;^144^^^^^137^158^[REPLACE] for  ( Iterator iterator = this.outlierLists.iterator (  ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^OutlierList list =  ( OutlierList )  iterator.hasNext (  ) ;^146^^^^^137^158^[REPLACE] OutlierList list =  ( OutlierList )  iterator.next (  ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^return true;^155^^^^^137^158^[REPLACE] return updated;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^boolean updated = true;^143^^^^^137^158^[REPLACE] boolean updated = false;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^return this.highFarOut;^140^^^^^137^158^[REPLACE] return this.outlierLists.add ( new OutlierList ( outlier )  ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^if  ( this.outlierLists.isEmpty (  )  )  {^147^^^^^137^158^[REPLACE] if  ( list.isOverlapped ( outlier )  )  {^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[ADD]^^153^^^^^137^158^[ADD] updated = this.outlierLists.add ( new OutlierList ( outlier )  ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^for  ( Iterator.isEmpty = this.outlierLists.iterator (  ) ;^144^^^^^137^158^[REPLACE] for  ( Iterator iterator = this.outlierLists.iterator (  ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^OutlierList list =  ( OutlierList )  iterator .hasNext (  )  ;^146^^^^^137^158^[REPLACE] OutlierList list =  ( OutlierList )  iterator.next (  ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[ADD]^^143^^^^^137^158^[ADD] boolean updated = false;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[ADD]^^146^^^^^137^158^[ADD] OutlierList list =  ( OutlierList )  iterator.next (  ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^return this.outlierLists .isEmpty (  )  ;^166^^^^^165^167^[REPLACE] return this.outlierLists.iterator (  ) ;^[METHOD] iterator [TYPE] Iterator [PARAMETER] [CLASS] OutlierListCollection   [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^boolean result = true;^181^^^^^180^186^[REPLACE] boolean result = false;^[METHOD] updateOutlierList [TYPE] boolean [PARAMETER] OutlierList list Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  result  true  updated 
[REPLACE]^result =  null.add ( outlier ) ;^182^^^^^180^186^[REPLACE] result = list.add ( outlier ) ;^[METHOD] updateOutlierList [TYPE] boolean [PARAMETER] OutlierList list Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  result  true  updated 
[REPLACE]^updated = updateOutlierList ( list, outlier ) ;^183^^^^^180^186^[REPLACE] list.updateAveragedOutlier (  ) ;^[METHOD] updateOutlierList [TYPE] boolean [PARAMETER] OutlierList list Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  result  true  updated 
[ADD]^^183^184^^^^180^186^[ADD] list.updateAveragedOutlier (  ) ; list.setMultiple ( true ) ;^[METHOD] updateOutlierList [TYPE] boolean [PARAMETER] OutlierList list Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  result  true  updated 
[REPLACE]^list.setMultiple ( false ) ;^184^^^^^180^186^[REPLACE] list.setMultiple ( true ) ;^[METHOD] updateOutlierList [TYPE] boolean [PARAMETER] OutlierList list Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  result  true  updated 
[REPLACE]^return true;^185^^^^^180^186^[REPLACE] return result;^[METHOD] updateOutlierList [TYPE] boolean [PARAMETER] OutlierList list Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  result  true  updated 
[REPLACE]^private boolean highFarOut ;^72^^^^^^^[REPLACE] private boolean highFarOut = false;^ [CLASS] OutlierListCollection  
[REPLACE]^private boolean lowFarOut  = null ;^78^^^^^^^[REPLACE] private boolean lowFarOut = false;^ [CLASS] OutlierListCollection  
[ADD]^^124^^^^^123^125^[ADD] this.lowFarOut = farOut;^[METHOD] setLowFarOut [TYPE] void [PARAMETER] boolean farOut [CLASS] OutlierListCollection   [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true 
[REPLACE]^if  ( list .setMultiple ( lowFarOut )   )  {^147^^^^^137^158^[REPLACE] if  ( list.isOverlapped ( outlier )  )  {^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^if  ( !true )  {^151^^^^^137^158^[REPLACE] if  ( !updated )  {^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^for  ( Iterator iterator = this.outlierLists.iterator (  ) ; iterator.hasNext (  ) ; )  {^144^^^^^137^158^[REPLACE] for  ( Iterator iterator = this.outlierLists.iterator (  ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[ADD]^^144^145^146^147^148^137^158^[ADD] for  ( Iterator iterator = this.outlierLists.iterator (  ) ; iterator.hasNext (  ) ; )  { OutlierList list =  ( OutlierList )  iterator.next (  ) ; if  ( list.isOverlapped ( outlier )  )  { updated = updateOutlierList ( list, outlier ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[REPLACE]^return this.outlierLists .iterator (  )  ;^140^^^^^137^158^[REPLACE] return this.outlierLists.add ( new OutlierList ( outlier )  ) ;^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[ADD]^updated = updateOutlierList ( list, outlier ) ;^147^148^149^^^137^158^[ADD] if  ( list.isOverlapped ( outlier )  )  { updated = updateOutlierList ( list, outlier ) ; }^[METHOD] add [TYPE] boolean [PARAMETER] Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  Iterator iterator  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  true  updated 
[ADD]^^184^^^^^180^186^[ADD] list.setMultiple ( true ) ;^[METHOD] updateOutlierList [TYPE] boolean [PARAMETER] OutlierList list Outlier outlier [CLASS] OutlierListCollection   [TYPE]  Outlier outlier  [TYPE]  OutlierList list  [TYPE]  List outlierLists  [TYPE]  boolean false  farOut  highFarOut  lowFarOut  result  true  updated 