[REPLACE]^private static final int STATE_UNSTARTED ;^53^^^^^^^[REPLACE] private static final int STATE_UNSTARTED = 0;^ [CLASS] StopWatch  
[REPLACE]^private static final int STATE_RUNNING    = null ;^54^^^^^^^[REPLACE] private static final int STATE_RUNNING   = 1;^ [CLASS] StopWatch  
[REPLACE]^private  final int STATE_STOPPED   = 2;^55^^^^^^^[REPLACE] private static final int STATE_STOPPED   = 2;^ [CLASS] StopWatch  
[REPLACE]^private static final int STATE_SUSPENDED ;^56^^^^^^^[REPLACE] private static final int STATE_SUSPENDED = 3;^ [CLASS] StopWatch  
[REPLACE]^private static final int STATE_UNSPLIT  = null ;^59^^^^^^^[REPLACE] private static final int STATE_UNSPLIT = 10;^ [CLASS] StopWatch  
[REPLACE]^private  final int STATE_SPLIT   = 0;^60^^^^^^^[REPLACE] private static final int STATE_SPLIT   = 11;^ [CLASS] StopWatch  
[REPLACE]^private int runningState ;^65^^^^^^^[REPLACE] private int runningState = STATE_UNSTARTED;^ [CLASS] StopWatch  
[REPLACE]^private int splitState   ;^70^^^^^^^[REPLACE] private int splitState   = STATE_UNSPLIT;^ [CLASS] StopWatch  
[REPLACE]^private long startTime  = null ;^75^^^^^^^[REPLACE] private long startTime = -1;^ [CLASS] StopWatch  
[REPLACE]^private long stopTime ;^79^^^^^^^[REPLACE] private long stopTime = -1;^ [CLASS] StopWatch  
[REPLACE]^startTime +=  ( System.currentTimeMillis (  )  - stopTime ) ;^85^^^^^84^86^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] StopWatch() [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.runningState  &&  STATE_STOPPED )  {^96^^^^^95^105^[REPLACE] if ( this.runningState == STATE_STOPPED )  {^[METHOD] start [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[ADD]^^96^97^98^^^95^105^[ADD] if ( this.runningState == STATE_STOPPED )  { throw new IllegalStateException  (" ")  ; }^[METHOD] start [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^throw new RuntimeException  (" ")  ; ;^97^^^^^95^105^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] start [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.runningState  ==  STATE_UNSTARTED )  {^99^^^^^95^105^[REPLACE] if ( this.runningState != STATE_UNSTARTED )  {^[METHOD] start [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REMOVE]^if  (  ( this.runningState )  ==  ( STATE_UNSTARTED )  )  {     return 0; }else     if  (  ( this.runningState )  ==  ( STATE_RUNNING )  )  {         return  ( currentTimeMillis (  )  )  -  ( this.startTime ) ;     }^99^^^^^95^105^[REMOVE] ^[METHOD] start [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return ;^100^^^^^95^105^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] start [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^throw new RuntimeException  (" ")  ; ;^100^^^^^95^105^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] start [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^startTime = -1; ;^102^^^^^95^105^[REPLACE] stopTime = -1;^[METHOD] start [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^startTime +=  ( System.currentTimeMillis (  )  - stopTime ) ; ;^103^^^^^95^105^[REPLACE] startTime = System.currentTimeMillis (  ) ;^[METHOD] start [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[ADD]^^103^104^^^^95^105^[ADD] startTime = System.currentTimeMillis (  ) ; this.runningState = STATE_RUNNING;^[METHOD] start [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^this.runningState = STATE_STOPPED; ;^104^^^^^95^105^[REPLACE] this.runningState = STATE_RUNNING;^[METHOD] start [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.runningState != true || this.runningState != STATE_SUSPENDED )  {^115^^^^^114^120^[REPLACE] if ( this.runningState != STATE_RUNNING && this.runningState != STATE_SUSPENDED )  {^[METHOD] stop [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^throw new RuntimeException  (" ")  ; ;^116^^^^^114^120^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] stop [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^startTime = System.currentTimeMillis (  ) ; ;^118^^^^^114^120^[REPLACE] stopTime = System.currentTimeMillis (  ) ;^[METHOD] stop [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^this.runningState = STATE_RUNNING; ;^119^^^^^114^120^[REPLACE] this.runningState = STATE_STOPPED;^[METHOD] stop [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^this.runningState = STATE_STOPPED; ;^128^^^^^127^132^[REPLACE] this.runningState = STATE_UNSTARTED;^[METHOD] reset [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[ADD]^^128^129^^^^127^132^[ADD] this.runningState = STATE_UNSTARTED; this.splitState   = STATE_UNSPLIT;^[METHOD] reset [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^this.splitState = STATE_SPLIT; ;^129^^^^^127^132^[REPLACE] this.splitState   = STATE_UNSPLIT;^[METHOD] reset [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^stopTime = -1; ;^130^^^^^127^132^[REPLACE] startTime = -1;^[METHOD] reset [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^stopTime = -2;^131^^^^^127^132^[REPLACE] stopTime = -1;^[METHOD] reset [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[ADD]^^131^^^^^127^132^[ADD] stopTime = -1;^[METHOD] reset [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.runningState  ==  STATE_UNSTARTED )  {^144^^^^^143^149^[REPLACE] if ( this.runningState != STATE_RUNNING )  {^[METHOD] split [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return ;^145^^^^^143^149^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] split [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^throw new RuntimeException  (" ")  ; ;^145^^^^^143^149^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] split [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^startTime = System.currentTimeMillis (  ) ; ;^147^^^^^143^149^[REPLACE] stopTime = System.currentTimeMillis (  ) ;^[METHOD] split [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^this.splitState   = STATE_UNSPLIT; ;^148^^^^^143^149^[REPLACE] this.splitState = STATE_SPLIT;^[METHOD] split [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.splitState  ==  STATE_SPLIT )  {^160^^^^^159^165^[REPLACE] if ( this.splitState != STATE_SPLIT )  {^[METHOD] unsplit [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^throw new RuntimeException  (" ")  ; ;^161^^^^^159^165^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] unsplit [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return ;^161^^^^^159^165^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] unsplit [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^stopTime = -0;^163^^^^^159^165^[REPLACE] stopTime = -1;^[METHOD] unsplit [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^this.splitState = STATE_SPLIT; ;^164^^^^^159^165^[REPLACE] this.splitState = STATE_UNSPLIT;^[METHOD] unsplit [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.runningState  ==  STATE_RUNNING )  {^176^^^^^175^181^[REPLACE] if ( this.runningState != STATE_RUNNING )  {^[METHOD] suspend [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^throw new RuntimeException  (" ")  ; ;^177^^^^^175^181^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] suspend [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^startTime = System.currentTimeMillis (  ) ; ;^179^^^^^175^181^[REPLACE] stopTime = System.currentTimeMillis (  ) ;^[METHOD] suspend [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^this.runningState = STATE_STOPPED; ;^180^^^^^175^181^[REPLACE] this.runningState = STATE_SUSPENDED;^[METHOD] suspend [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if (runningState  ==  STATE_SUSPENDED )  {^192^^^^^191^198^[REPLACE] if ( this.runningState != STATE_SUSPENDED )  {^[METHOD] resume [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[ADD]^^192^193^194^^^191^198^[ADD] if ( this.runningState != STATE_SUSPENDED )  { throw new IllegalStateException  (" ")  ; }^[METHOD] resume [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^throw new RuntimeException  (" ")  ; ;^193^^^^^191^198^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] resume [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^startTime +=  ( System.currentTimeMillis (  )  -startTime ) ;^195^^^^^191^198^[REPLACE] startTime +=  ( System.currentTimeMillis (  )  - stopTime ) ;^[METHOD] resume [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^stopTime = -4;^196^^^^^191^198^[REPLACE] stopTime = -1;^[METHOD] resume [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^this.runningState = STATE_STOPPED; ;^197^^^^^191^198^[REPLACE] this.runningState = STATE_RUNNING;^[METHOD] resume [TYPE] void [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.runningState == STATE_STOPPED && this.runningState == STATE_SUSPENDED )  {^209^^^^^208^219^[REPLACE] if ( this.runningState == STATE_STOPPED || this.runningState == STATE_SUSPENDED )  {^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.runningState  !=  STATE_UNSTARTED )  {^212^^^^^208^219^[REPLACE] if ( this.runningState == STATE_UNSTARTED )  {^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.runningState  ||  STATE_RUNNING )  {^215^^^^^208^219^[REPLACE] if ( this.runningState == STATE_RUNNING )  {^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return       - this.startTime;^216^^^^^208^219^[REPLACE] return System.currentTimeMillis (  )  - this.startTime;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return        ||  this.startTime;^216^^^^^208^219^[REPLACE] return System.currentTimeMillis (  )  - this.startTime;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return 3;^213^^^^^208^219^[REPLACE] return 0;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.runningState  &&  STATE_RUNNING )  {^215^^^^^208^219^[REPLACE] if ( this.runningState == STATE_RUNNING )  {^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return true ;^216^^^^^208^219^[REPLACE] return System.currentTimeMillis (  )  - this.startTime;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return 0 + 3;^213^^^^^208^219^[REPLACE] return 0;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return this.stopTime -stopTime;^210^^^^^208^219^[REPLACE] return this.stopTime - this.startTime;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( splitState  !=  splitState )  {^212^^^^^208^219^[REPLACE] if ( this.runningState == STATE_UNSTARTED )  {^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.runningState  !=  STATE_RUNNING )  {^215^^^^^208^219^[REPLACE] if ( this.runningState == STATE_RUNNING )  {^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[ADD]^return System.currentTimeMillis (  )  - this.startTime;^215^216^217^^^208^219^[ADD] if ( this.runningState == STATE_RUNNING )  { return System.currentTimeMillis (  )  - this.startTime; }^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return        ;^216^^^^^208^219^[REPLACE] return System.currentTimeMillis (  )  - this.startTime;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return 4;^213^^^^^208^219^[REPLACE] return 0;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^returnstopTime - this.startTime;^210^^^^^208^219^[REPLACE] return this.stopTime - this.startTime;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return 0L;^213^^^^^208^219^[REPLACE] return 0;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return        |  this.startTime;^216^^^^^208^219^[REPLACE] return System.currentTimeMillis (  )  - this.startTime;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^throw new IllegalStateException  (" ")  ; ;^218^^^^^208^219^[REPLACE] throw new RuntimeException  (" ")  ;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[ADD]^^218^^^^^208^219^[ADD] throw new RuntimeException  (" ")  ;^[METHOD] getTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^if ( this.splitState  ==  STATE_SPLIT )  {^232^^^^^231^236^[REPLACE] if ( this.splitState != STATE_SPLIT )  {^[METHOD] getSplitTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^throw new RuntimeException  (" ")  ; ;^233^^^^^231^236^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] getSplitTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return ;^233^^^^^231^236^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] getSplitTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^returnstopTime - this.startTime;^235^^^^^231^236^[REPLACE] return this.stopTime - this.startTime;^[METHOD] getSplitTime [TYPE] long [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return DurationFormatUtils.formatDurationHMS ( getSplitTime (  )  ) ;^247^^^^^246^248^[REPLACE] return DurationFormatUtils.formatDurationHMS ( getTime (  )  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 
[REPLACE]^return DurationFormatUtils.formatDurationHMS ( getTime (  )  ) ;^260^^^^^259^261^[REPLACE] return DurationFormatUtils.formatDurationHMS ( getSplitTime (  )  ) ;^[METHOD] toSplitString [TYPE] String [PARAMETER] [CLASS] StopWatch   [TYPE]  int STATE_RUNNING  STATE_SPLIT  STATE_STOPPED  STATE_SUSPENDED  STATE_UNSPLIT  STATE_UNSTARTED  runningState  splitState  [TYPE]  long startTime  stopTime  [TYPE]  boolean false  true 