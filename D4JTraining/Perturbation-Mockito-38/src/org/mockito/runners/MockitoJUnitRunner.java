[REPLACE]^private  RunnerImpl runner;^49^^^^^^^[REPLACE] private final RunnerImpl runner;^ [CLASS] MockitoJUnitRunner  
[REPLACE]^runner =  new RunnerFactory (  ) .create ( null ) ;^52^^^^^51^53^[REPLACE] runner = new RunnerFactory (  ) .create ( klass ) ;^[METHOD] <init> [TYPE] Class) [PARAMETER] Class<?> klass [CLASS] MockitoJUnitRunner   [TYPE]  RunnerImpl runner  [TYPE]  Class klass  [TYPE]  boolean false  true 
[REPLACE]^runner.filter ( notifier ) ;^57^^^^^56^58^[REPLACE] runner.run ( notifier ) ;^[METHOD] run [TYPE] void [PARAMETER] RunNotifier notifier [CLASS] MockitoJUnitRunner   [TYPE]  RunnerImpl runner  [TYPE]  RunNotifier notifier  [TYPE]  boolean false  true 
[REPLACE]^runner.run ( filter ) ;^66^^^^^64^67^[REPLACE] runner.filter ( filter ) ;^[METHOD] filter [TYPE] void [PARAMETER] Filter filter [CLASS] MockitoJUnitRunner   [TYPE]  Filter filter  [TYPE]  RunnerImpl runner  [TYPE]  boolean false  true 