[REPLACE]^thread =  new Thnullead ( null ) ;^26^^^^^25^28^[REPLACE] thread = new Thread ( r ) ;^[METHOD] execute [TYPE] void [PARAMETER] Runnable r [CLASS] ThreadPerTaskExecutor   [TYPE]  Thread thread  [TYPE]  Runnable r  [TYPE]  boolean false  true 
[ADD]^^26^27^^^^25^28^[ADD] thread = new Thread ( r ) ; thread.start (  ) ;^[METHOD] execute [TYPE] void [PARAMETER] Runnable r [CLASS] ThreadPerTaskExecutor   [TYPE]  Thread thread  [TYPE]  Runnable r  [TYPE]  boolean false  true 
[REPLACE]^thread.interrupt (  ) ;^27^^^^^25^28^[REPLACE] thread.start (  ) ;^[METHOD] execute [TYPE] void [PARAMETER] Runnable r [CLASS] ThreadPerTaskExecutor   [TYPE]  Thread thread  [TYPE]  Runnable r  [TYPE]  boolean false  true 
[REPLACE]^if  ( thread == null )  {^32^^^^^31^35^[REPLACE] if  ( thread != null )  {^[METHOD] shutdownNow [TYPE] void [PARAMETER] [CLASS] ThreadPerTaskExecutor   [TYPE]  Thread thread  [TYPE]  boolean false  true 
[REPLACE]^thread .start (  )  ;^33^^^^^31^35^[REPLACE] thread.interrupt (  ) ;^[METHOD] shutdownNow [TYPE] void [PARAMETER] [CLASS] ThreadPerTaskExecutor   [TYPE]  Thread thread  [TYPE]  boolean false  true 