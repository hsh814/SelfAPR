[REPLACE]^private @Nullable ClassLoader classLoader ;^59^^^^^^^[REPLACE] private @Nullable ClassLoader classLoader = ClassUtils.getDefaultClassLoader (  ) ;^ [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource  
[REPLACE]^private final ConcurrentMap<Method, CrudMethodMetadata> metadataCache  = null ;^105^^^^^^^[REPLACE] private final ConcurrentMap<Method, CrudMethodMetadata> metadataCache = new ConcurrentHashMap<Method, CrudMethodMetadata> (  ) ;^ [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource  
[REPLACE]^private final @Object LockModeType lockModeType;^150^^^^^^^[REPLACE] private final @Nullable LockModeType lockModeType;^ [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource  
[REPLACE]^private  Optional<EntityGraph> entityGraph;^152^^^^^^^[REPLACE] private final Optional<EntityGraph> entityGraph;^ [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource  
[ADD]^^113^^^^^111^139^[ADD] Method method = invocation.getMethod (  ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^if  ( metadata == true )  {^116^^^^^111^139^[REPLACE] if  ( metadata != null )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[ADD]^return invocation.proceed (  ) ;^116^117^118^^^111^139^[ADD] if  ( metadata != null )  { return invocation.proceed (  ) ; }^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^return invocation.getMethod (  ) ;^117^^^^^111^139^[REPLACE] return invocation.proceed (  ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^CrudMethodMetadata tmp = metadataCache.putIfAbsent ( method, methodMetadata )  ;^120^^^^^111^139^[REPLACE] CrudMethodMetadata methodMetadata = metadataCache.get ( method ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^if  ( methodMetadata != this  )  {^122^^^^^111^139^[REPLACE] if  ( methodMetadata == null )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[ADD]^^122^123^124^125^^111^139^[ADD] if  ( methodMetadata == null )  {  methodMetadata = new DefaultCrudMethodMetadata ( method ) ; CrudMethodMetadata tmp = metadataCache.putIfAbsent ( method, methodMetadata ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^if  (methodMetadata == null )  {^127^^^^^111^139^[REPLACE] if  ( tmp != null )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^methodMetadata =  metadata;^128^^^^^111^139^[REPLACE] methodMetadata = tmp;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[ADD]^^124^^^^^111^139^[ADD] methodMetadata = new DefaultCrudMethodMetadata ( method ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^CrudMethodMetadata tmp = metadataCache.putIfAbsent ( method, tmp ) ;^125^^^^^111^139^[REPLACE] CrudMethodMetadata tmp = metadataCache.putIfAbsent ( method, methodMetadata ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^if  ( tmp == this  )  {^127^^^^^111^139^[REPLACE] if  ( tmp != null )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^this.entityGraph = findEntityGraph ( method )  ;^124^^^^^111^139^[REPLACE] methodMetadata = new DefaultCrudMethodMetadata ( method ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[ADD]^^125^^^^^111^139^[ADD] CrudMethodMetadata tmp = metadataCache.putIfAbsent ( method, methodMetadata ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^unbindResource ( method )  ;^132^^^^^111^139^[REPLACE] TransactionSynchronizationManager.bindResource ( method, methodMetadata ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[ADD]^return invocation.proceed (  ) ;TransactionSynchronizationManager.unbindResource ( method ) ;^134^135^136^137^138^111^139^[ADD] try { return invocation.proceed (  ) ; } finally { TransactionSynchronizationManager.unbindResource ( method ) ; }^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^return invocation.getMethod (  ) ;^135^^^^^111^139^[REPLACE] return invocation.proceed (  ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  MethodInvocation invocation  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^Lock annotation = findMergedAnnotation ( method, class )  ;^184^^^^^181^200^[REPLACE] QueryHints queryHintsAnnotation = AnnotatedElementUtils.findMergedAnnotation ( method, QueryHints.class ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^if  ( queryHintsAnnotation == null )  {^186^^^^^181^200^[REPLACE] if  ( queryHintsAnnotation != null )  {^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^for  ( QueryHint queryHintAnnotation : queryHintsAnnotation.value (  )  )  {^188^^^^^186^191^[REPLACE] for  ( QueryHint hint : queryHintsAnnotation.value (  )  )  {^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[ADD]^^188^189^190^^^186^191^[ADD] for  ( QueryHint hint : queryHintsAnnotation.value (  )  )  { queryHints.put ( hint.name (  ) , hint.value (  )  ) ; }^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[ADD]^^193^^^^^181^200^[ADD] QueryHint queryHintAnnotation = AnnotationUtils.findAnnotation ( method, QueryHint.class ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^if  ( queryHintAnnotation == null )  {^195^^^^^181^200^[REPLACE] if  ( queryHintAnnotation != null )  {^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^queryHints.put ( hint.name (  ) , queryHintAnnotation.value (  )  ) ;^196^^^^^181^200^[REPLACE] queryHints.put ( queryHintAnnotation.name (  ) , queryHintAnnotation.value (  )  ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^queryHints.put ( queryHintAnnotation.name (  ) , queryHintAnnotation.name (  )  ) ;^196^^^^^181^200^[REPLACE] queryHints.put ( queryHintAnnotation.name (  ) , queryHintAnnotation.value (  )  ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[ADD]^^196^^^^^181^200^[ADD] queryHints.put ( queryHintAnnotation.name (  ) , queryHintAnnotation.value (  )  ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^return Collections.unmodifiableMap ( true ) ;^199^^^^^181^200^[REPLACE] return Collections.unmodifiableMap ( queryHints ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] CrudMethodMetadataPostProcessor CrudMethodMetadataPopulatingMethodInterceptor DefaultCrudMethodMetadata ThreadBoundTargetSource   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^private  ConcurrentMap<Method, Object metadataCache = new ConcurrentHashMap<Method, Object (  ) ;^105^^^^^^^[REPLACE] private final ConcurrentMap<Method, CrudMethodMetadata> metadataCache = new ConcurrentHashMap<Method, CrudMethodMetadata> (  ) ;^[METHOD] releaseTarget [TYPE] void [PARAMETER] Object target [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  ConcurrentMap metadataCache  [TYPE]  ClassLoader classLoader  [TYPE]  LockModeType lockModeType  [TYPE]  Object target  [TYPE]  Method method  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE  [TYPE]  Map queryHints 
[REPLACE]^Method method = invocation.proceed (  ) ;^113^^^^^111^139^[REPLACE] Method method = invocation.getMethod (  ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^CrudMethodMetadata metadata =  ( CrudMethodMetadata )  TransactionSynchronizationManager .bindResource ( method , methodMetadata )  ;^114^^^^^111^139^[REPLACE] CrudMethodMetadata metadata =  ( CrudMethodMetadata )  TransactionSynchronizationManager.getResource ( method ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^if  ( metadata == null )  {^116^^^^^111^139^[REPLACE] if  ( metadata != null )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^return invocation.getMethod (  ) ;^117^^^^^111^139^[REPLACE] return invocation.proceed (  ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^return invocation .getMethod (  )  ;^117^^^^^111^139^[REPLACE] return invocation.proceed (  ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^CrudMethodMetadata tmp = metadataCache.putIfAbsent ( method, methodMetadata )  ;^120^^^^^111^139^[REPLACE] CrudMethodMetadata methodMetadata = metadataCache.get ( method ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^if  (tmp != null )  {^122^^^^^111^139^[REPLACE] if  ( methodMetadata == null )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^if  ( tmp == this )  {^127^^^^^111^139^[REPLACE] if  ( tmp != null )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^methodMetadata =  metadata;^128^^^^^111^139^[REPLACE] methodMetadata = tmp;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^methodMetadata =  new DefaultCrudMethodMetadata ( null ) ;^124^^^^^111^139^[REPLACE] methodMetadata = new DefaultCrudMethodMetadata ( method ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^CrudMethodMetadata methodMetadata = metadataCache.get ( method )  ;^125^^^^^111^139^[REPLACE] CrudMethodMetadata tmp = metadataCache.putIfAbsent ( method, methodMetadata ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^if  ( methodMetadata == this )  {^127^^^^^111^139^[REPLACE] if  ( tmp != null )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[ADD]^^128^^^^^111^139^[ADD] methodMetadata = tmp;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^TransactionSynchronizationManager .unbindResource ( method )  ;^132^^^^^111^139^[REPLACE] TransactionSynchronizationManager.bindResource ( method, methodMetadata ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REMOVE]^unbindResource ( method )  ;^132^^^^^111^139^[REMOVE] ^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[ADD]^return invocation.proceed (  ) ;TransactionSynchronizationManager.unbindResource ( method ) ;^134^135^136^137^138^111^139^[ADD] try { return invocation.proceed (  ) ; } finally { TransactionSynchronizationManager.unbindResource ( method ) ; }^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^return invocation.getMethod (  ) ;^135^^^^^111^139^[REPLACE] return invocation.proceed (  ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] CrudMethodMetadataPopulatingMethodInterceptor   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^private final @Object LockModeType lockModeType;^150^^^^^^^[REPLACE] private final @Nullable LockModeType lockModeType;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] DefaultCrudMethodMetadata   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^private final Map<String, Map queryHints;^151^^^^^^^[REPLACE] private final Map<String, Object> queryHints;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] DefaultCrudMethodMetadata   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^private final Optional<LockModeType entityGraph;^152^^^^^^^[REPLACE] private final Optional<EntityGraph> entityGraph;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] DefaultCrudMethodMetadata   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[REPLACE]^private  Method method;^153^^^^^^^[REPLACE] private final Method method;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] DefaultCrudMethodMetadata   [TYPE]  ConcurrentMap metadataCache  [TYPE]  MethodInvocation invocation  [TYPE]  CrudMethodMetadata metadata  methodMetadata  tmp  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  CrudMethodMetadataPopulatingMethodInterceptor INSTANCE 
[ADD]^^183^184^^^^181^200^[ADD] Map<String, Object> queryHints = new HashMap<String, Object> (  ) ; QueryHints queryHintsAnnotation = AnnotatedElementUtils.findMergedAnnotation ( method, QueryHints.class ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[ADD]^^184^^^^^181^200^[ADD] QueryHints queryHintsAnnotation = AnnotatedElementUtils.findMergedAnnotation ( method, QueryHints.class ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[REPLACE]^if  ( queryHintsAnnotation == null )  {^186^^^^^181^200^[REPLACE] if  ( queryHintsAnnotation != null )  {^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[REPLACE]^for  ( QueryHint hint : trueAnnotation.value (  )  )  {^188^^^^^186^191^[REPLACE] for  ( QueryHint hint : queryHintsAnnotation.value (  )  )  {^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[ADD]^^188^189^190^^^186^191^[ADD] for  ( QueryHint hint : queryHintsAnnotation.value (  )  )  { queryHints.put ( hint.name (  ) , hint.value (  )  ) ; }^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[REPLACE]^for  ( QueryHint queryHintAnnotation : queryHintsAnnotation.value (  )  )  {^188^^^^^186^191^[REPLACE] for  ( QueryHint hint : queryHintsAnnotation.value (  )  )  {^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[ADD]^^193^^^^^181^200^[ADD] QueryHint queryHintAnnotation = AnnotationUtils.findAnnotation ( method, QueryHint.class ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[REPLACE]^if  (hint == null )  {^195^^^^^181^200^[REPLACE] if  ( queryHintAnnotation != null )  {^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[ADD]^^195^196^197^^^181^200^[ADD] if  ( queryHintAnnotation != null )  { queryHints.put ( queryHintAnnotation.name (  ) , queryHintAnnotation.value (  )  ) ; }^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[REPLACE]^queryHints.put ( hint.value (  ) , queryHintAnnotation.value (  )  ) ;^196^^^^^181^200^[REPLACE] queryHints.put ( queryHintAnnotation.name (  ) , queryHintAnnotation.value (  )  ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[REMOVE]^queryHints.put ( hint.name (  ) , hint.value (  )  )  ;^196^^^^^181^200^[REMOVE] ^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[REPLACE]^queryHintAnnotation.value (  )  ;^196^^^^^181^200^[REPLACE] queryHints.put ( queryHintAnnotation.name (  ) , queryHintAnnotation.value (  )  ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[REPLACE]^queryHintsAnnotation.value (  )  ;^196^^^^^181^200^[REPLACE] queryHints.put ( queryHintAnnotation.name (  ) , queryHintAnnotation.value (  )  ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 
[REPLACE]^return Collections.unmodifiableMap ( null ) ;^199^^^^^181^200^[REPLACE] return Collections.unmodifiableMap ( queryHints ) ;^[METHOD] findQueryHints [TYPE] Map [PARAMETER] Method method [CLASS] DefaultCrudMethodMetadata   [TYPE]  boolean false  true  [TYPE]  Optional entityGraph  [TYPE]  QueryHint hint  queryHintAnnotation  [TYPE]  QueryHints queryHintsAnnotation  [TYPE]  LockModeType lockModeType  [TYPE]  Method method  [TYPE]  Map queryHints 