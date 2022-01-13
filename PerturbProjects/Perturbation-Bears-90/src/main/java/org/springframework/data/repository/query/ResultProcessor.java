[REPLACE]^private final Object method;^51^^^^^^^[REPLACE] private final QueryMethod method;^ [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1  
[REPLACE]^private  ProjectingConverter converter;^52^^^^^^^[REPLACE] private final ProjectingConverter converter;^ [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1  
[REPLACE]^private  ProjectionFactory factory;^53^^^^^^^[REPLACE] private final ProjectionFactory factory;^ [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1  
[REPLACE]^private  @NonNull Converter<Object, Object> delegate;^191^^^^^^^[REPLACE] private final @NonNull Converter<Object, Object> delegate;^ [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1  
[REPLACE]^private  @NonNull ReturnedType type;^248^^^^^^^[REPLACE] private final @NonNull ReturnedType type;^ [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1  
[REPLACE]^private  @NonNull ConversionService conversionService;^250^^^^^^^[REPLACE] private final @NonNull ConversionService conversionService;^ [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1  
[REPLACE]^private  @NonNull Converter<Object, Object> converter;^328^^^^^^^[REPLACE] private final @NonNull Converter<Object, Object> converter;^ [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1  
[REPLACE]^if  (  type.isInstance ( source )  || !type.isProjecting (  )  )  {^133^^^^^131^163^[REPLACE] if  ( source == null || type.isInstance ( source )  || !type.isProjecting (  )  )  {^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^return  (  ( T )   ( target )  )  ;^134^^^^^131^163^[REPLACE] return  ( T )  source;^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^notNull ( method, "QueryMethod must not be null!" )  ;^137^^^^^131^163^[REPLACE] Assert.notNull ( preparingConverter, "Preparing converter must not be null!" ) ;^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[ADD]^^137^^^^^131^163^[ADD] Assert.notNull ( preparingConverter, "Preparing converter must not be null!" ) ;^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^final ChainingConverter converter = ChainingConverter.of ( type.getReturnedType (  ) , this ) .and ( this.converter ) ;^139^140^^^^131^163^[REPLACE] final ChainingConverter converter = ChainingConverter.of ( type.getReturnedType (  ) , preparingConverter ) .and ( this.converter ) ;^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^if  ( ! source instanceof Slice && method.isPageQuery (  )  ) {^142^^^^^131^163^[REPLACE] if  ( source instanceof Slice && method.isPageQuery (  )  || method.isSliceQuery (  )  )  {^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^return  ( T )   (  ( Slice<?> )  source )  .map ( converter )  ;^143^^^^^131^163^[REPLACE] return  ( T )   (  ( Slice<?> )  source ) .map ( converter ) ;^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^if  ( ! source instanceof true && method.isCollectionQuery (  )  )  {^146^^^^^131^163^[REPLACE] if  ( source instanceof Collection && method.isCollectionQuery (  )  )  {^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[ADD]^^146^147^148^149^^131^163^[ADD] if  ( source instanceof Collection && method.isCollectionQuery (  )  )  {  Collection<?> collection =  ( Collection<?> )  source; Collection<Object> target = createCollectionFor ( collection ) ;^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^for  ( Object source : collection )  {^151^^^^^146^156^[REPLACE] for  ( Object columns : collection )  {^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^return  (  ( T )   ( source )  )  ;^155^^^^^146^156^[REPLACE] return  ( T )  target;^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^Collection<Object> target = createCollectionFor ( null ) ;^149^^^^^146^156^[REPLACE] Collection<Object> target = createCollectionFor ( collection ) ;^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[ADD]^^151^152^153^^^146^156^[ADD] for  ( Object columns : collection )  { target.add ( type.isInstance ( columns )  ? columns : converter.convert ( columns )  ) ; }^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^for  ( Object columns : null )  {^151^^^^^146^156^[REPLACE] for  ( Object columns : collection )  {^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^Object element  ;^151^^^^^146^156^[REPLACE] for  ( Object columns : collection )  {^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^if  ( ReflectionUtils.isJava8StreamType ( source.getClass (  )  )  ) {^158^^^^^131^163^[REPLACE] if  ( ReflectionUtils.isJava8StreamType ( source.getClass (  )  )  && method.isStreamQuery (  )  )  {^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^return  ( T )   new ProjectingConverter ( this.type, factory )  .handle ( source ) ;^159^^^^^131^163^[REPLACE] return  ( T )  new StreamQueryResultHandler ( type, converter ) .handle ( source ) ;^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^return  ( T ) .ChainingConverterer.convert ( source ) ;^162^^^^^131^163^[REPLACE] return  ( T )  converter.convert ( source ) ;^[METHOD] processResult [TYPE] <T> [PARAMETER] Object source Object> preparingConverter [CLASS] ResultProcessor ChainingConverter 1 NoOpConverter ProjectingConverter StreamQueryResultHandler 1   [TYPE]  ProjectionFactory factory  [TYPE]  boolean false  true  [TYPE]  QueryMethod method  [TYPE]  ConversionService conversionService  [TYPE]  ProjectingConverter converter  [TYPE]  Converter converter  delegate  preparingConverter  [TYPE]  ChainingConverter converter  [TYPE]  Collection collection  target  [TYPE]  Class projectionType  targetType  type  [TYPE]  Object columns  source  [TYPE]  ReturnedType returnType  type  [TYPE]  NoOpConverter INSTANCE 
[REPLACE]^private  @NonNull ConversionService conversionService;^250^^^^^^^[REPLACE] private final @NonNull ConversionService conversionService;^[METHOD] convert [TYPE] Object [PARAMETER] Object source [CLASS] ProjectingConverter   [TYPE]  Object source  [TYPE]  NoOpConverter INSTANCE  [TYPE]  boolean false  true 