[P8_Replace_Mix]^private  BlockingQueue<QueueEntry> queue;^35^^^^^30^40^private final BlockingQueue<QueueEntry> queue;^[CLASS] WebServiceClientAsync   [VARIABLES] 
[P8_Replace_Mix]^private  boolean threadPerTask;^36^^^^^31^41^private final boolean threadPerTask;^[CLASS] WebServiceClientAsync   [VARIABLES] 
[P14_Delete_Statement]^^40^^^^^39^41^this ( serverConfig, null ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] WebServiceConfig)   WebServiceConfig serverConfig [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceConfig  serverConfig  
[P4_Replace_Constructor]^this ( new WebServiceClient (  logLevel )  ) ;^43^^^^^42^44^this ( new WebServiceClient ( serverConfig, logLevel )  ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] Level)   WebServiceConfig serverConfig Level logLevel [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  Level  logLevel  boolean  threadPerTask  WebServiceConfig  serverConfig  
[P4_Replace_Constructor]^this ( new WebServiceClient ( serverConfig )  ) ;^43^^^^^42^44^this ( new WebServiceClient ( serverConfig, logLevel )  ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] Level)   WebServiceConfig serverConfig Level logLevel [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  Level  logLevel  boolean  threadPerTask  WebServiceConfig  serverConfig  
[P5_Replace_Variable]^this ( new WebServiceClient ( logLevel, serverConfig )  ) ;^43^^^^^42^44^this ( new WebServiceClient ( serverConfig, logLevel )  ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] Level)   WebServiceConfig serverConfig Level logLevel [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  Level  logLevel  boolean  threadPerTask  WebServiceConfig  serverConfig  
[P14_Delete_Statement]^^43^^^^^42^44^this ( new WebServiceClient ( serverConfig, logLevel )  ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] Level)   WebServiceConfig serverConfig Level logLevel [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  Level  logLevel  boolean  threadPerTask  WebServiceConfig  serverConfig  
[P8_Replace_Mix]^queue  =  queue ;^47^^^^^46^52^queue = new LinkedBlockingQueue<QueueEntry> (  ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] WebServiceClient)   WebServiceClient client [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceClient  client  QueueConsumer  consumer  
[P3_Replace_Literal]^this.threadPerTask = false;^48^^^^^46^52^this.threadPerTask = true;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] WebServiceClient)   WebServiceClient client [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceClient  client  QueueConsumer  consumer  
[P5_Replace_Variable]^QueueConsumer consumer = new QueueConsumer ( queue ) ;^49^^^^^46^52^QueueConsumer consumer = new QueueConsumer ( queue, client ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] WebServiceClient)   WebServiceClient client [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceClient  client  QueueConsumer  consumer  
[P5_Replace_Variable]^QueueConsumer consumer = new QueueConsumer (  client ) ;^49^^^^^46^52^QueueConsumer consumer = new QueueConsumer ( queue, client ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] WebServiceClient)   WebServiceClient client [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceClient  client  QueueConsumer  consumer  
[P5_Replace_Variable]^QueueConsumer consumer = new QueueConsumer ( client, queue ) ;^49^^^^^46^52^QueueConsumer consumer = new QueueConsumer ( queue, client ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] WebServiceClient)   WebServiceClient client [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceClient  client  QueueConsumer  consumer  
[P8_Replace_Mix]^executor  =  executor ;^50^^^^^46^52^executor = getExecutor (  ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] WebServiceClient)   WebServiceClient client [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceClient  client  QueueConsumer  consumer  
[P14_Delete_Statement]^^50^51^^^^46^52^executor = getExecutor (  ) ; executor.execute ( consumer ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] WebServiceClient)   WebServiceClient client [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceClient  client  QueueConsumer  consumer  
[P11_Insert_Donor_Statement]^executor.shutdownNow (  ) ;executor = getExecutor (  ) ;^50^^^^^46^52^executor = getExecutor (  ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] WebServiceClient)   WebServiceClient client [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceClient  client  QueueConsumer  consumer  
[P14_Delete_Statement]^^51^^^^^46^52^executor.execute ( consumer ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] WebServiceClient)   WebServiceClient client [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceClient  client  QueueConsumer  consumer  
[P11_Insert_Donor_Statement]^executor.shutdownNow (  ) ;executor.execute ( consumer ) ;^51^^^^^46^52^executor.execute ( consumer ) ;^[CLASS] WebServiceClientAsync  [METHOD] <init> [RETURN_TYPE] WebServiceClient)   WebServiceClient client [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceClient  client  QueueConsumer  consumer  
[P4_Replace_Constructor]^return threadPerTask ? return threadPerTask ?  new SingleThreadExecutor (  )   : new SingleThreadExecutor (  ) ;^55^^^^^54^56^return threadPerTask ? new ThreadPerTaskExecutor (  )  : new SingleThreadExecutor (  ) ;^[CLASS] WebServiceClientAsync  [METHOD] getExecutor [RETURN_TYPE] TaskExecutor   [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  
[P8_Replace_Mix]^return threadPerTask ?  new SingleThreadExecutor (  )   : new SingleThreadExecutor (  ) ;^55^^^^^54^56^return threadPerTask ? new ThreadPerTaskExecutor (  )  : new SingleThreadExecutor (  ) ;^[CLASS] WebServiceClientAsync  [METHOD] getExecutor [RETURN_TYPE] TaskExecutor   [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  
[P4_Replace_Constructor]^return threadPerTask ? return threadPerTask ?  ThreadPerTaskExecutor (  )  :  new ThreadPerTaskExecutor (  )  ;^55^^^^^54^56^return threadPerTask ? new ThreadPerTaskExecutor (  )  : new SingleThreadExecutor (  ) ;^[CLASS] WebServiceClientAsync  [METHOD] getExecutor [RETURN_TYPE] TaskExecutor   [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  
[P4_Replace_Constructor]^queue.put ( new QueueEntry (  request, responseCallback )  ) ;^61^^^^^58^65^queue.put ( new QueueEntry ( callSpec, request, responseCallback )  ) ;^[CLASS] WebServiceClientAsync  [METHOD] callAsync [RETURN_TYPE] void   WebServiceCallSpec callSpec WebServiceRequest request ResponseCallback responseCallback [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceRequest  request  WebServiceCallSpec  callSpec  ResponseCallback  responseCallback  InterruptedException  e  
[P4_Replace_Constructor]^queue.put ( new QueueEntry ( callSpec,  responseCallback )  ) ;^61^^^^^58^65^queue.put ( new QueueEntry ( callSpec, request, responseCallback )  ) ;^[CLASS] WebServiceClientAsync  [METHOD] callAsync [RETURN_TYPE] void   WebServiceCallSpec callSpec WebServiceRequest request ResponseCallback responseCallback [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceRequest  request  WebServiceCallSpec  callSpec  ResponseCallback  responseCallback  InterruptedException  e  
[P4_Replace_Constructor]^queue.put ( new QueueEntry ( callSpec, request )  ) ;^61^^^^^58^65^queue.put ( new QueueEntry ( callSpec, request, responseCallback )  ) ;^[CLASS] WebServiceClientAsync  [METHOD] callAsync [RETURN_TYPE] void   WebServiceCallSpec callSpec WebServiceRequest request ResponseCallback responseCallback [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceRequest  request  WebServiceCallSpec  callSpec  ResponseCallback  responseCallback  InterruptedException  e  
[P5_Replace_Variable]^queue.put ( new QueueEntry ( responseCallback, request, callSpec )  ) ;^61^^^^^58^65^queue.put ( new QueueEntry ( callSpec, request, responseCallback )  ) ;^[CLASS] WebServiceClientAsync  [METHOD] callAsync [RETURN_TYPE] void   WebServiceCallSpec callSpec WebServiceRequest request ResponseCallback responseCallback [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceRequest  request  WebServiceCallSpec  callSpec  ResponseCallback  responseCallback  InterruptedException  e  
[P5_Replace_Variable]^queue.put ( new QueueEntry ( request, callSpec, responseCallback )  ) ;^61^^^^^58^65^queue.put ( new QueueEntry ( callSpec, request, responseCallback )  ) ;^[CLASS] WebServiceClientAsync  [METHOD] callAsync [RETURN_TYPE] void   WebServiceCallSpec callSpec WebServiceRequest request ResponseCallback responseCallback [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceRequest  request  WebServiceCallSpec  callSpec  ResponseCallback  responseCallback  InterruptedException  e  
[P14_Delete_Statement]^^61^^^^^58^65^queue.put ( new QueueEntry ( callSpec, request, responseCallback )  ) ;^[CLASS] WebServiceClientAsync  [METHOD] callAsync [RETURN_TYPE] void   WebServiceCallSpec callSpec WebServiceRequest request ResponseCallback responseCallback [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceRequest  request  WebServiceCallSpec  callSpec  ResponseCallback  responseCallback  InterruptedException  e  
[P5_Replace_Variable]^queue.put ( new QueueEntry ( callSpec, responseCallback, request )  ) ;^61^^^^^58^65^queue.put ( new QueueEntry ( callSpec, request, responseCallback )  ) ;^[CLASS] WebServiceClientAsync  [METHOD] callAsync [RETURN_TYPE] void   WebServiceCallSpec callSpec WebServiceRequest request ResponseCallback responseCallback [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceRequest  request  WebServiceCallSpec  callSpec  ResponseCallback  responseCallback  InterruptedException  e  
[P8_Replace_Mix]^return ;^63^^^^^58^65^throw new WebServiceSystemException  (" ")  ;^[CLASS] WebServiceClientAsync  [METHOD] callAsync [RETURN_TYPE] void   WebServiceCallSpec callSpec WebServiceRequest request ResponseCallback responseCallback [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  WebServiceRequest  request  WebServiceCallSpec  callSpec  ResponseCallback  responseCallback  InterruptedException  e  
[P7_Replace_Invocation]^executor .shutdownNow (  )  ;^68^^^^^67^69^executor.shutdownNow (  ) ;^[CLASS] WebServiceClientAsync  [METHOD] shutdownNow [RETURN_TYPE] void   [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  
[P14_Delete_Statement]^^68^^^^^67^69^executor.shutdownNow (  ) ;^[CLASS] WebServiceClientAsync  [METHOD] shutdownNow [RETURN_TYPE] void   [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  
[P11_Insert_Donor_Statement]^executor.execute ( consumer ) ;executor.shutdownNow (  ) ;^68^^^^^67^69^executor.shutdownNow (  ) ;^[CLASS] WebServiceClientAsync  [METHOD] shutdownNow [RETURN_TYPE] void   [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  
[P11_Insert_Donor_Statement]^executor = getExecutor (  ) ;executor.shutdownNow (  ) ;^68^^^^^67^69^executor.shutdownNow (  ) ;^[CLASS] WebServiceClientAsync  [METHOD] shutdownNow [RETURN_TYPE] void   [VARIABLES] BlockingQueue  queue  TaskExecutor  executor  boolean  threadPerTask  
