[REPLACE]^this.runner = new JUnit4ClassRunner ( klass )  { @Override ;^21^^^^^20^29^[REPLACE] this.runner = new JUnit4ClassRunner ( klass )  {^[METHOD] <init> [TYPE] Class) [PARAMETER] Class<?> klass [CLASS] JUnit44RunnerImpl 1   [TYPE]  Class klass  [TYPE]  Object test  [TYPE]  boolean false  true  [TYPE]  JUnit4ClassRunner runner 
[REPLACE]^return runner.getDescription (  ) ;^26^^^^^20^29^[REPLACE] return test;^[METHOD] <init> [TYPE] Class) [PARAMETER] Class<?> klass [CLASS] JUnit44RunnerImpl 1   [TYPE]  Class klass  [TYPE]  Object test  [TYPE]  boolean false  true  [TYPE]  JUnit4ClassRunner runner 
[REPLACE]^Object test = super .createTest (  )  ;^24^^^^^20^29^[REPLACE] Object test = super.createTest (  ) ;^[METHOD] <init> [TYPE] Class) [PARAMETER] Class<?> klass [CLASS] JUnit44RunnerImpl 1   [TYPE]  Class klass  [TYPE]  Object test  [TYPE]  boolean false  true  [TYPE]  JUnit4ClassRunner runner 
[REPLACE]^Object test = super .createTest (  )  ;^24^^^^^23^27^[REPLACE] Object test = super.createTest (  ) ;^[METHOD] createTest [TYPE] Object [PARAMETER] [CLASS] JUnit44RunnerImpl 1   [TYPE]  JUnit4ClassRunner runner  [TYPE]  Object test  [TYPE]  boolean false  true 
[ADD]^^24^25^^^^23^27^[ADD] Object test = super.createTest (  ) ; MockitoAnnotations.initMocks ( test ) ;^[METHOD] createTest [TYPE] Object [PARAMETER] [CLASS] JUnit44RunnerImpl 1   [TYPE]  JUnit4ClassRunner runner  [TYPE]  Object test  [TYPE]  boolean false  true 
[REPLACE]^test   ;^25^^^^^23^27^[REPLACE] MockitoAnnotations.initMocks ( test ) ;^[METHOD] createTest [TYPE] Object [PARAMETER] [CLASS] JUnit44RunnerImpl 1   [TYPE]  JUnit4ClassRunner runner  [TYPE]  Object test  [TYPE]  boolean false  true 
[REPLACE]^return runner.getDescription (  ) ;^26^^^^^23^27^[REPLACE] return test;^[METHOD] createTest [TYPE] Object [PARAMETER] [CLASS] JUnit44RunnerImpl 1   [TYPE]  JUnit4ClassRunner runner  [TYPE]  Object test  [TYPE]  boolean false  true 
[REPLACE]^runner.filter ( notifier ) ;^35^^^^^31^36^[REPLACE] runner.run ( notifier ) ;^[METHOD] run [TYPE] void [PARAMETER] RunNotifier notifier [CLASS] JUnit44RunnerImpl 1   [TYPE]  JUnit4ClassRunner runner  [TYPE]  RunNotifier notifier  [TYPE]  boolean false  true 
[REPLACE]^return runner .run ( null )  ;^39^^^^^38^40^[REPLACE] return runner.getDescription (  ) ;^[METHOD] getDescription [TYPE] Description [PARAMETER] [CLASS] JUnit44RunnerImpl 1   [TYPE]  JUnit4ClassRunner runner  [TYPE]  boolean false  true 
[REPLACE]^runner.run ( filter ) ;^43^^^^^41^44^[REPLACE] runner.filter ( filter ) ;^[METHOD] filter [TYPE] void [PARAMETER] Filter filter [CLASS] JUnit44RunnerImpl 1   [TYPE]  JUnit4ClassRunner runner  [TYPE]  Filter filter  [TYPE]  boolean false  true 
[REPLACE]^Object test = super .createTest (  )  ;^24^^^^^23^27^[REPLACE] Object test = super.createTest (  ) ;^[METHOD] createTest [TYPE] Object [PARAMETER] [CLASS] 1   [TYPE]  boolean false  true  [TYPE]  Object test 
[REPLACE]^test   ;^25^^^^^23^27^[REPLACE] MockitoAnnotations.initMocks ( test ) ;^[METHOD] createTest [TYPE] Object [PARAMETER] [CLASS] 1   [TYPE]  boolean false  true  [TYPE]  Object test 
[ADD]^^25^26^^^^23^27^[ADD] MockitoAnnotations.initMocks ( test ) ; return test;^[METHOD] createTest [TYPE] Object [PARAMETER] [CLASS] 1   [TYPE]  boolean false  true  [TYPE]  Object test 