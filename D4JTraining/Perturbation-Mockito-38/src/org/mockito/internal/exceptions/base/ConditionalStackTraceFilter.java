[REPLACE]^private IMockitoConfiguration config ;^12^^^^^^^[REPLACE] private IMockitoConfiguration config = new GlobalConfiguration (  ) ;^ [CLASS] ConditionalStackTraceFilter  
[REPLACE]^private StackTraceFilter filter  = null ;^13^^^^^^^[REPLACE] private StackTraceFilter filter = new StackTraceFilter (  ) ;^ [CLASS] ConditionalStackTraceFilter  
[REPLACE]^if  ( config.cleansStackTrace (  )  )  {^16^^^^^15^21^[REPLACE] if  ( !config.cleansStackTrace (  )  )  {^[METHOD] filter [TYPE] void [PARAMETER] Throwable throwable [CLASS] ConditionalStackTraceFilter   [TYPE]  Throwable throwable  [TYPE]  boolean false  true  [TYPE]  StackTraceFilter filter  [TYPE]  IMockitoConfiguration config  [TYPE]  StackTraceElement[] filtered 
[REPLACE]^StackTraceElement[] filtered = filter.filter ( throwable.getStackTrace (  ) , false ) ;^19^^^^^15^21^[REPLACE] StackTraceElement[] filtered = filter.filter ( throwable.getStackTrace (  ) , true ) ;^[METHOD] filter [TYPE] void [PARAMETER] Throwable throwable [CLASS] ConditionalStackTraceFilter   [TYPE]  Throwable throwable  [TYPE]  boolean false  true  [TYPE]  StackTraceFilter filter  [TYPE]  IMockitoConfiguration config  [TYPE]  StackTraceElement[] filtered 
[REPLACE]^if  ( !config.cleansStackTrace (  )  )  { return;^20^^^^^15^21^[REPLACE] throwable.setStackTrace ( filtered ) ;^[METHOD] filter [TYPE] void [PARAMETER] Throwable throwable [CLASS] ConditionalStackTraceFilter   [TYPE]  Throwable throwable  [TYPE]  boolean false  true  [TYPE]  StackTraceFilter filter  [TYPE]  IMockitoConfiguration config  [TYPE]  StackTraceElement[] filtered 