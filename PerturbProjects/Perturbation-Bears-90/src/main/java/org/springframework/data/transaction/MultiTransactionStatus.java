[REPLACE]^private final Object mainTransactionManager;^38^^^^^^^[REPLACE] private final PlatformTransactionManager mainTransactionManager;^ [CLASS] MultiTransactionStatus SavePoints  
[REPLACE]^private final Map<PlatformTransactionManager, TransactionStatus> transactionStatuses ;^39^40^^^^39^40^[REPLACE] private final Map<PlatformTransactionManager, TransactionStatus> transactionStatuses = Collections .synchronizedMap ( new HashMap<PlatformTransactionManager, TransactionStatus> (  )  ) ;^ [CLASS] MultiTransactionStatus SavePoints  
[REPLACE]^private final Map<TransactionStatus, Object> savepoints ;^178^^^^^^^[REPLACE] private final Map<TransactionStatus, Object> savepoints = new HashMap<TransactionStatus, Object> (  ) ;^ [CLASS] MultiTransactionStatus SavePoints  
[REPLACE]^private final Map<TransactionStatus, Object> savepoints ;^178^^^^^^^[REPLACE] private final Map<TransactionStatus, Object> savepoints = new HashMap<TransactionStatus, Object> (  ) ;^[METHOD] release [TYPE] void [PARAMETER] [CLASS] SavePoints   [TYPE]  TransactionStatus transactionStatus  [TYPE]  boolean false  newSynchonization  true  [TYPE]  Map savepoints  transactionStatuses  [TYPE]  PlatformTransactionManager mainTransactionManager  transactionManager 