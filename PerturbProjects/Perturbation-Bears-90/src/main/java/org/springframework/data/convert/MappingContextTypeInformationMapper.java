[REPLACE]^private final MappingContext<? extends Object mappingContext;^39^^^^^^^[REPLACE] private final MappingContext<? extends PersistentEntity<?, ?>, ?> mappingContext;^ [CLASS] MappingContextTypeInformationMapper  
[REPLACE]^CacheValue<Object> key = trueMap.get ( type ) ;^65^^^^^63^81^[REPLACE] CacheValue<Object> key = typeMap.get ( type ) ;^[METHOD] createAliasFor [TYPE] Object [PARAMETER] TypeInformation<?> type [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue key  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  TypeInformation type 
[REPLACE]^if  ( key == null )  {^67^^^^^63^81^[REPLACE] if  ( key != null )  {^[METHOD] createAliasFor [TYPE] Object [PARAMETER] TypeInformation<?> type [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue key  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  TypeInformation type 
[ADD]^return key.getValue (  ) ;^67^68^69^^^63^81^[ADD] if  ( key != null )  { return key.getValue (  ) ; }^[METHOD] createAliasFor [TYPE] Object [PARAMETER] TypeInformation<?> type [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue key  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  TypeInformation type 
[REPLACE]^return null.getValue (  ) ;^68^^^^^63^81^[REPLACE] return key.getValue (  ) ;^[METHOD] createAliasFor [TYPE] Object [PARAMETER] TypeInformation<?> type [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue key  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  TypeInformation type 
[REPLACE]^PersistentEntity<?, ?> entity = mappingContext.getPersistentEntity ( this ) ;^71^^^^^63^81^[REPLACE] PersistentEntity<?, ?> entity = mappingContext.getPersistentEntity ( type ) ;^[METHOD] createAliasFor [TYPE] Object [PARAMETER] TypeInformation<?> type [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue key  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  TypeInformation type 
[REPLACE]^if  ( this != null )  {^73^^^^^63^81^[REPLACE] if  ( entity == null )  {^[METHOD] createAliasFor [TYPE] Object [PARAMETER] TypeInformation<?> type [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue key  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  TypeInformation type 
[ADD]^return null;^73^74^75^^^63^81^[ADD] if  ( entity == null )  { return null; }^[METHOD] createAliasFor [TYPE] Object [PARAMETER] TypeInformation<?> type [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue key  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  TypeInformation type 
[REPLACE]^return true;^74^^^^^63^81^[REPLACE] return null;^[METHOD] createAliasFor [TYPE] Object [PARAMETER] TypeInformation<?> type [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue key  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  TypeInformation type 
[REPLACE]^return this;^74^^^^^63^81^[REPLACE] return null;^[METHOD] createAliasFor [TYPE] Object [PARAMETER] TypeInformation<?> type [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue key  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  TypeInformation type 
[REPLACE]^Object alias = null.getTypeAlias (  ) ;^77^^^^^63^81^[REPLACE] Object alias = entity.getTypeAlias (  ) ;^[METHOD] createAliasFor [TYPE] Object [PARAMETER] TypeInformation<?> type [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue key  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  TypeInformation type 
[REPLACE]^safelyAddToCache ( null.getRawTypeInformation (  ) , alias ) ;^78^^^^^63^81^[REPLACE] safelyAddToCache ( type.getRawTypeInformation (  ) , alias ) ;^[METHOD] createAliasFor [TYPE] Object [PARAMETER] TypeInformation<?> type [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue key  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  TypeInformation type 
[REPLACE]^CacheValue<Object> aliasToBeCached = CacheValue .getValue (  )  ;^91^^^^^89^129^[REPLACE] CacheValue<Object> aliasToBeCached = CacheValue.ofNullable ( alias ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^if  ( alias != null && !typeMap.containsKey ( key )  )  {^93^^^^^89^129^[REPLACE] if  ( alias == null && !typeMap.containsKey ( key )  )  {^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^^93^94^95^96^^89^129^[ADD] if  ( alias == null && !typeMap.containsKey ( key )  )  { typeMap.put ( key, aliasToBeCached ) ; return; }^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^^98^^^^^89^129^[ADD] CacheValue<Object> alreadyCachedAlias = typeMap.get ( key ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^if  ( alreadyCachedAlias == null ) {^102^^^^^89^129^[REPLACE] if  ( alreadyCachedAlias != null && alreadyCachedAlias.isPresent (  )  && !alreadyCachedAlias.hasValue ( alias )  )  {^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^^103^104^105^106^^89^129^[ADD] throw new IllegalArgumentException ( String.format ( "Trying to register alias '%s', but found already registered alias '%s' for type %s!", alias, alreadyCachedAlias, key )  ) ; }^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^throw new IllegalArgumentException ( String.format ( "Trying to register alias '%s', but found already registered alias '%s' for type %s!", alias, alreadyCachedAlias, null )  ) ;^103^104^105^^^89^129^[REPLACE] throw new IllegalArgumentException ( String.format ( "Trying to register alias '%s', but found already registered alias '%s' for type %s!", alias, alreadyCachedAlias, key )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^if  ( typeMap.containsValue ( aliasToBeCached  )  ||  ( value.hasValue ( alias )  )  &&  ( ! ( entry.getKey (  ) .equals ( key )  )  )  )  )  {^110^^^^^89^129^[REPLACE] if  ( typeMap.containsValue ( aliasToBeCached )  )  {^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^if  ( !value.hasValue (  )  )  {^116^^^^^89^129^[REPLACE] if  ( !value.isPresent (  )  )  {^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^continue;^116^117^118^^^89^129^[ADD] if  ( !value.isPresent (  )  )  { continue; }^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^if  ( value.hasValue ( alias )  && entry.getKey (  ) .equals ( key )  )  {^120^^^^^89^129^[REPLACE] if  ( value.hasValue ( alias )  && !entry.getKey (  ) .equals ( key )  )  {^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^return ;^121^122^123^^^89^129^[REPLACE] throw new IllegalArgumentException ( String.format ( "Detected existing type mapping of %s to alias '%s' but attempted to bind the same alias to %s!", key, alias, entry.getKey (  )  )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^throw new IllegalArgumentException ( String.format ( "Detected existing type mapping of %s to alias '%s' but attempted to bind the same alias to %s!", key, alias, this.getKey (  )  )  ) ;^121^122^123^^^89^129^[REPLACE] throw new IllegalArgumentException ( String.format ( "Detected existing type mapping of %s to alias '%s' but attempted to bind the same alias to %s!", key, alias, entry.getKey (  )  )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^alias, null.getKey (  )  )  ) ;^123^^^^^89^129^[REPLACE] alias, entry.getKey (  )  )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^if  ( !value.hasValue (  )  )  {^116^^^^^110^126^[REPLACE] if  ( !value.isPresent (  )  )  {^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^continue;^116^117^118^^^110^126^[ADD] if  ( !value.isPresent (  )  )  { continue; }^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^if  ( value.hasValue ( alias )  && entry.getKey (  ) .equals ( key )  )  {^120^^^^^110^126^[REPLACE] if  ( value.hasValue ( alias )  && !entry.getKey (  ) .equals ( key )  )  {^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^return ;^121^122^123^^^110^126^[REPLACE] throw new IllegalArgumentException ( String.format ( "Detected existing type mapping of %s to alias '%s' but attempted to bind the same alias to %s!", key, alias, entry.getKey (  )  )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^throw new IllegalArgumentException ( String.format ( "Detected existing type mapping of %s to alias '%s' but attempted to bind the same alias to %s!", key, alias, entry.getValue (  )  )  ) ;^121^122^123^^^110^126^[REPLACE] throw new IllegalArgumentException ( String.format ( "Detected existing type mapping of %s to alias '%s' but attempted to bind the same alias to %s!", key, alias, entry.getKey (  )  )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^entry.getValue (  )  ;^123^^^^^110^126^[REPLACE] alias, entry.getKey (  )  )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^Object> key = typeMap.get ( type )  ;^114^^^^^110^126^[REPLACE] CacheValue<Object> value = entry.getValue (  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^throw new IllegalArgumentException ( format ( "Trying to register alias '%s', but found already registered alias '%s' for type %s!", alias, alreadyCachedAlias, key )  )  ;^121^122^123^^^110^126^[REPLACE] throw new IllegalArgumentException ( String.format ( "Detected existing type mapping of %s to alias '%s' but attempted to bind the same alias to %s!", key, alias, entry.getKey (  )  )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^CacheValue<Object> value = null.getKey (  ) ;^114^^^^^110^126^[REPLACE] CacheValue<Object> value = entry.getValue (  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^^121^122^123^124^^110^126^[ADD] throw new IllegalArgumentException ( String.format ( "Detected existing type mapping of %s to alias '%s' but attempted to bind the same alias to %s!", key, alias, entry.getKey (  )  )  ) ; }^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^^121^122^123^124^^89^129^[ADD] throw new IllegalArgumentException ( String.format ( "Detected existing type mapping of %s to alias '%s' but attempted to bind the same alias to %s!", key, alias, entry.getKey (  )  )  ) ; }^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^entry.getValue (  )  ;^123^^^^^89^129^[REPLACE] alias, entry.getKey (  )  )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^^123^^^^^89^129^[ADD] alias, entry.getKey (  )  )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^if  ( !value .hasValue ( alias  )  && typeMap.containsValue ( aliasToBeCached )  )   )  {^116^^^^^110^126^[REPLACE] if  ( !value.isPresent (  )  )  {^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^alias, entry.getValue (  )  )  ) ;^123^^^^^110^126^[REPLACE] alias, entry.getKey (  )  )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^^123^^^^^110^126^[ADD] alias, entry.getKey (  )  )  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^^114^^^^^110^126^[ADD] CacheValue<Object> value = entry.getValue (  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^^112^113^114^^^110^126^[ADD] for  ( Entry<ClassTypeInformation<?>, CacheValue<Object>> entry : typeMap.entrySet (  )  )  {  CacheValue<Object> value = entry.getValue (  ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^typeMap.put ( key, this ) ;^128^^^^^89^129^[REPLACE] typeMap.put ( key, aliasToBeCached ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[ADD]^^128^^^^^89^129^[ADD] typeMap.put ( key, aliasToBeCached ) ;^[METHOD] safelyAddToCache [TYPE] void [PARAMETER] ClassTypeInformation<?> key Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  CacheValue aliasToBeCached  alreadyCachedAlias  value  [TYPE]  Object alias  [TYPE]  Map typeMap  [TYPE]  ClassTypeInformation key 
[REPLACE]^if  ( alias != false )  {^137^^^^^135^157^[REPLACE] if  ( alias == null )  {^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^return false;^138^^^^^135^157^[REPLACE] return null;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^return this;^138^^^^^135^157^[REPLACE] return null;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^if  ( cachedAlias.hasValue ( alias  )  || alias.equals ( entity.getTypeAlias (  )  )  )  )  {^145^^^^^135^157^[REPLACE] if  ( cachedAlias.hasValue ( alias )  )  {^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^return entry.getValue (  ) ;^146^^^^^135^157^[REPLACE] return entry.getKey (  ) ;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[ADD]^^141^142^143^^^135^157^[ADD] for  ( Entry<ClassTypeInformation<?>, CacheValue<Object>> entry : typeMap.entrySet (  )  )  {  CacheValue<Object> cachedAlias = entry.getValue (  ) ;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^if  ( cachedAlias .getValue (  )   )  {^145^^^^^135^157^[REPLACE] if  ( cachedAlias.hasValue ( alias )  )  {^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[ADD]^^145^146^147^^^135^157^[ADD] if  ( cachedAlias.hasValue ( alias )  )  { return entry.getKey (  ) ; }^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^return null.getKey (  ) ;^146^^^^^135^157^[REPLACE] return entry.getKey (  ) ;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[ADD]^^143^^^^^135^157^[ADD] CacheValue<Object> cachedAlias = entry.getValue (  ) ;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^return 0.getValue (  ) ;^146^^^^^135^157^[REPLACE] return entry.getKey (  ) ;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^if  ( alias .getRawTypeInformation (  )   )  {^151^^^^^135^157^[REPLACE] if  ( alias.equals ( entity.getTypeAlias (  )  )  )  {^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^return true.getTypeInformation (  ) .getRawTypeInformation (  ) ;^152^^^^^135^157^[REPLACE] return entity.getTypeInformation (  ) .getRawTypeInformation (  ) ;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^for  ( PersistentEntity<?, ?> null : mappingContext.getPersistentEntities (  )  )  {^150^^^^^135^157^[REPLACE] for  ( PersistentEntity<?, ?> entity : mappingContext.getPersistentEntities (  )  )  {^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^if  ( cachedAlias.hasValue ( alias )  || ( alias.equals ( false.getTypeAlias (  )  )  )  {^151^^^^^135^157^[REPLACE] if  ( alias.equals ( entity.getTypeAlias (  )  )  )  {^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^return false.getTypeInformation (  ) .getRawTypeInformation (  ) ;^152^^^^^135^157^[REPLACE] return entity.getTypeInformation (  ) .getRawTypeInformation (  ) ;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^return entity.getTypeInformation (  ) .equals (  ) ;^152^^^^^135^157^[REPLACE] return entity.getTypeInformation (  ) .getRawTypeInformation (  ) ;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^return this.getTypeInformation (  ) .getRawTypeInformation (  ) ;^152^^^^^135^157^[REPLACE] return entity.getTypeInformation (  ) .getRawTypeInformation (  ) ;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 
[REPLACE]^return true;^156^^^^^135^157^[REPLACE] return null;^[METHOD] resolveTypeFrom [TYPE] ClassTypeInformation [PARAMETER] Object alias [CLASS] MappingContextTypeInformationMapper   [TYPE]  MappingContext mappingContext  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  PersistentEntity entity  [TYPE]  CacheValue cachedAlias  [TYPE]  Object alias  [TYPE]  Map typeMap 