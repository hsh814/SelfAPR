[REPLACE]^Object defaultStringMatcher;^58^^^^^^^[REPLACE] StringMatcher defaultStringMatcher;^ [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode  
[REPLACE]^Set<Object ignoredPaths;^60^^^^^^^[REPLACE] Set<String> ignoredPaths;^ [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode  
[REPLACE]^@Object ( AccessLevel.PRIVATE )  MatchMode mode;^62^^^^^^^[REPLACE] @Wither ( AccessLevel.PRIVATE )  MatchMode mode;^ [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode  
[REPLACE]^StringMatcher stringMatcher = this;^395^^^^^^^[REPLACE] StringMatcher stringMatcher = null;^ [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode  
[REPLACE]^Boolean ignoreCase  = null ;^396^^^^^^^[REPLACE] Boolean ignoreCase = null;^ [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode  
[REPLACE]^ExampleMatcher$NullHandler valueTransformer = NoOpPropertyValueTransformer.INSTANCE;^397^^^^^^^[REPLACE] PropertyValueTransformer valueTransformer = NoOpPropertyValueTransformer.INSTANCE;^ [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode  
[REPLACE]^byte  path;^698^^^^^^^[REPLACE] String path;^ [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode  
[REPLACE]^private final Map<String, PropertySpecifier> propertySpecifiers ;^810^^^^^^^[REPLACE] private final Map<String, PropertySpecifier> propertySpecifiers = new LinkedHashMap<String, PropertySpecifier> (  ) ;^ [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode  
[REPLACE]^Assert.notEmpty ( path, "PropertyPath must not be empty!" ) ;^188^^^^^186^210^[REPLACE] Assert.hasText ( propertyPath, "PropertyPath must not be empty!" ) ;^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[REPLACE]^notEmpty ( ignoredPaths, "IgnoredPaths must not be empty!" )  ;^189^^^^^186^210^[REPLACE] Assert.notNull ( genericPropertyMatcher, "GenericPropertyMatcher must not be empty!" ) ;^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[REPLACE]^GenericPropertyMatcher genericPropertyMatcher = new GenericPropertyMatcher (  )  ;^191^^^^^186^210^[REPLACE] PropertySpecifiers propertySpecifiers = new PropertySpecifiers ( this.propertySpecifiers ) ;^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[ADD]^^192^193^194^195^196^186^210^[ADD] PropertySpecifier propertySpecifier = new PropertySpecifier ( propertyPath ) ;  if  ( genericPropertyMatcher.ignoreCase != null )  { propertySpecifier = propertySpecifier.withIgnoreCase ( genericPropertyMatcher.ignoreCase ) ; }^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[REPLACE]^if  ( genericPropertyMatcher.ignoreCase == null )  {^194^^^^^186^210^[REPLACE] if  ( genericPropertyMatcher.ignoreCase != null )  {^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[REPLACE]^propertySpecifier = propertySpecifier.withStringMatcher ( genericPropertyMatcher.stringMatcher )  ;^195^^^^^186^210^[REPLACE] propertySpecifier = propertySpecifier.withIgnoreCase ( genericPropertyMatcher.ignoreCase ) ;^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[REPLACE]^if  ( genericPropertyMatcher.stringMatcher == true )  {^198^^^^^186^210^[REPLACE] if  ( genericPropertyMatcher.stringMatcher != null )  {^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[REPLACE]^propertySpecifier = propertySpecifier.withIgnoreCase ( genericPropertyMatcher.ignoreCase )  ;^199^^^^^186^210^[REPLACE] propertySpecifier = propertySpecifier.withStringMatcher ( genericPropertyMatcher.stringMatcher ) ;^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[REPLACE]^if  (valueTransformer == null )  {^202^^^^^186^210^[REPLACE] if  ( genericPropertyMatcher.valueTransformer != null )  {^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[ADD]^^202^203^204^^^186^210^[ADD] if  ( genericPropertyMatcher.valueTransformer != null )  { propertySpecifier = propertySpecifier.withValueTransformer ( genericPropertyMatcher.valueTransformer ) ; }^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[ADD]^^203^204^^^^186^210^[ADD] propertySpecifier = propertySpecifier.withValueTransformer ( genericPropertyMatcher.valueTransformer ) ; }^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[REPLACE]^propertySpecifier = propertySpecifier.withIgnoreCase ( genericPropertyMatcher.ignoreCase )  ;^203^^^^^186^210^[REPLACE] propertySpecifier = propertySpecifier.withValueTransformer ( genericPropertyMatcher.valueTransformer ) ;^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[REPLACE]^propertySpecifiers.PropertySpecifiers ( propertySpecifier ) ;^206^^^^^186^210^[REPLACE] propertySpecifiers.add ( propertySpecifier ) ;^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[ADD]^^206^207^208^209^210^186^210^[ADD] propertySpecifiers.add ( propertySpecifier ) ;  return new ExampleMatcher ( nullHandler, defaultStringMatcher, propertySpecifiers, ignoredPaths, defaultIgnoreCase, mode ) ; }^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[REPLACE]^return  new ExampleMatcher ( nullHandler, defaultStringMatcher, propertySpecifiers, newIgnoredPaths, defaultIgnoreCase, mode )  ;^208^209^^^^186^210^[REPLACE] return new ExampleMatcher ( nullHandler, defaultStringMatcher, propertySpecifiers, ignoredPaths, defaultIgnoreCase, mode ) ;^[METHOD] withMatcher [TYPE] ExampleMatcher [PARAMETER] String propertyPath GenericPropertyMatcher genericPropertyMatcher [CLASS] ExampleMatcher NullHandler GenericPropertyMatcher GenericPropertyMatchers StringMatcher NoOpPropertyValueTransformer PropertySpecifier PropertySpecifiers MatchMode   [TYPE]  MatchMode ALL  ANY  mode  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  NullHandler IGNORE  INCLUDE  nullHandler  [TYPE]  Set ignoredPaths  newIgnoredPaths  [TYPE]  PropertySpecifier propertySpecifier  [TYPE]  StringMatcher CONTAINING  DEFAULT  ENDING  EXACT  REGEX  STARTING  defaultStringMatcher  stringMatcher  [TYPE]  String path  propertyPath  [TYPE]  PropertySpecifiers propertySpecifiers  [TYPE]  boolean defaultIgnoreCase  false  true  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  GenericPropertyMatcher genericPropertyMatcher  [TYPE]  Boolean ignoreCase  [TYPE]  Map propertySpecifiers 
[REPLACE]^StringMatcher stringMatcher ;^395^^^^^^^[REPLACE] StringMatcher stringMatcher = null;^[METHOD] <init> [TYPE] ExampleMatcher$NullHandler() [PARAMETER] [CLASS] GenericPropertyMatcher   [TYPE]  NullHandler IGNORE  INCLUDE  [TYPE]  boolean false  true 
[REPLACE]^Boolean ignoreCase = this;^396^^^^^^^[REPLACE] Boolean ignoreCase = null;^[METHOD] <init> [TYPE] ExampleMatcher$NullHandler() [PARAMETER] [CLASS] GenericPropertyMatcher   [TYPE]  NullHandler IGNORE  INCLUDE  [TYPE]  boolean false  true 
[REPLACE]^Object valueTransformer = NoOpPropertyValueTransformer.INSTANCE;^397^^^^^^^[REPLACE] PropertyValueTransformer valueTransformer = NoOpPropertyValueTransformer.INSTANCE;^[METHOD] <init> [TYPE] ExampleMatcher$NullHandler() [PARAMETER] [CLASS] GenericPropertyMatcher   [TYPE]  NullHandler IGNORE  INCLUDE  [TYPE]  boolean false  true 
[REPLACE]^Object stringMatcher;^699^^^^^^^[REPLACE] StringMatcher stringMatcher;^[METHOD] convert [TYPE] Object [PARAMETER] Object source [CLASS] PropertySpecifier   [TYPE]  Object source  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  boolean false  true 
[REPLACE]^Object valueTransformer;^701^^^^^^^[REPLACE] PropertyValueTransformer valueTransformer;^[METHOD] convert [TYPE] Object [PARAMETER] Object source [CLASS] PropertySpecifier   [TYPE]  Object source  [TYPE]  NoOpPropertyValueTransformer INSTANCE  [TYPE]  boolean false  true 
[REPLACE]^private  Map<String, PropertySpecifier> propertySpecifiers = new LinkedHashMap<String, PropertySpecifier> (  ) ;^810^^^^^^^[REPLACE] private final Map<String, PropertySpecifier> propertySpecifiers = new LinkedHashMap<String, PropertySpecifier> (  ) ;^[METHOD] transformValue [TYPE] Object [PARAMETER] Object source [CLASS] PropertySpecifiers   [TYPE]  StringMatcher stringMatcher  [TYPE]  PropertyValueTransformer valueTransformer  [TYPE]  Object source  [TYPE]  String path  [TYPE]  boolean false  true  [TYPE]  Boolean ignoreCase 