[REPLACE]^private final Iterable<Class<? extends Set annotationTypess;^40^^^^^^^[REPLACE] private final Iterable<Class<? extends Annotation>> annotationTypess;^ [CLASS] AnnotatedTypeScanner InterfaceAwareScanner  
[REPLACE]^private Object resourceLoader;^43^^^^^^^[REPLACE] private ResourceLoader resourceLoader;^ [CLASS] AnnotatedTypeScanner InterfaceAwareScanner  
[REPLACE]^if  ( resourceLoader == null )  {^93^^^^^89^120^[REPLACE] if  ( resourceLoader != null )  {^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[ADD]^provider.setResourceLoader ( resourceLoader ) ;^93^94^95^^^89^120^[ADD] if  ( resourceLoader != null )  { provider.setResourceLoader ( resourceLoader ) ; }^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[REPLACE]^provider.setEnvironment ( resourceLoader ) ;^94^^^^^89^120^[REPLACE] provider.setResourceLoader ( resourceLoader ) ;^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[REPLACE]^if  ( environment == null )  {^97^^^^^89^120^[REPLACE] if  ( environment != null )  {^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[REPLACE]^provider.setResourceLoader ( environment ) ;^98^^^^^89^120^[REPLACE] provider.setEnvironment ( environment ) ;^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[ADD]^^98^^^^^89^120^[ADD] provider.setEnvironment ( environment ) ;^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[REPLACE]^for  ( Class<? extends Annotation> null : annotationTypess )  {^101^^^^^89^120^[REPLACE] for  ( Class<? extends Annotation> annotationType : annotationTypess )  {^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[REPLACE]^provider.addIncludeFilter ( new AnnotationTypeFilter ( null, false, considerInterfaces )  ) ;^102^^^^^89^120^[REPLACE] provider.addIncludeFilter ( new AnnotationTypeFilter ( annotationType, true, considerInterfaces )  ) ;^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[ADD]^resourceLoader == null ? null : resourceLoader.getClassLoader (  )  )  ) ;^110^111^112^113^114^107^117^[ADD] try { types.add ( ClassUtils.forName ( definition.getBeanClassName (  ) , resourceLoader == null ? null : resourceLoader.getClassLoader (  )  )  ) ; } catch  ( ClassNotFoundException o_O )  { throw new IllegalStateException  (" ")  ;^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[REPLACE]^return ;^114^^^^^107^117^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[ADD]^^113^114^^^^107^117^[ADD] catch  ( ClassNotFoundException o_O )  { throw new IllegalStateException  (" ")  ;^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[ADD]^^107^108^109^110^111^107^117^[ADD] for  ( String basePackage : basePackages )  {  for  ( BeanDefinition definition : provider.findCandidateComponents ( basePackage )  )  { try { types.add ( ClassUtils.forName ( definition.getBeanClassName (  ) ,^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 
[REPLACE]^return null;^119^^^^^89^120^[REPLACE] return types;^[METHOD] findTypes [TYPE] Set [PARAMETER] String> basePackages [CLASS] AnnotatedTypeScanner InterfaceAwareScanner   [TYPE]  ResourceLoader resourceLoader  [TYPE]  boolean considerInterfaces  false  true  [TYPE]  Set types  [TYPE]  Iterable annotationTypess  basePackages  [TYPE]  ClassPathScanningCandidateComponentProvider provider  [TYPE]  Environment environment  [TYPE]  Class annotationType  [TYPE]  String basePackage  [TYPE]  BeanDefinition definition  [TYPE]  ClassNotFoundException o_O 