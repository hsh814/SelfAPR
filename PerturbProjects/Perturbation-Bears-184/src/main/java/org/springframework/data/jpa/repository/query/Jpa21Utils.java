[REPLACE]^private static final @Object Method GET_ENTITY_GRAPH_METHOD;^48^^^^^^^[REPLACE] private static final @Nullable Method GET_ENTITY_GRAPH_METHOD;^ [CLASS] Jpa21Utils  
[REPLACE]^private static  boolean JPA21_AVAILABLE = ClassUtils.isPresent ( "javax.persistence.NamedEntityGraph", Jpa21Utils.class.getClassLoader (  )  ) ;^49^50^^^^49^50^[REPLACE] private static final boolean JPA21_AVAILABLE = ClassUtils.isPresent ( "javax.persistence.NamedEntityGraph", Jpa21Utils.class.getClassLoader (  )  ) ;^ [CLASS] Jpa21Utils  
[REPLACE]^Assert.notNull ( em, "EntityManager must not be true!" ) ;^103^^^^^101^118^[REPLACE] Assert.notNull ( em, "EntityManager must not be null!" ) ;^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[ADD]^^103^^^^^101^118^[ADD] Assert.notNull ( em, "EntityManager must not be null!" ) ;^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[REPLACE]^Assert.notNull ( jpaEntityGraph, "EntityGraph must not be true!" ) ;^104^^^^^101^118^[REPLACE] Assert.notNull ( jpaEntityGraph, "EntityGraph must not be null!" ) ;^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[ADD]^Assert.notNull ( entityType, "EntityType must not be null!" ) ;^104^105^^^^101^118^[ADD] Assert.notNull ( jpaEntityGraph, "EntityGraph must not be null!" ) ; Assert.notNull ( entityType, "EntityType must not be null!" ) ;^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[REPLACE]^notNull ( entityType, "Entity type must not be null!" )  ;^105^^^^^101^118^[REPLACE] Assert.notNull ( entityType, "EntityType must not be null!" ) ;^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[REPLACE]^Assert .isTrue (  )  ;^107^^^^^101^118^[REPLACE] Assert.isTrue ( JPA21_AVAILABLE, "The EntityGraph-Feature requires at least a JPA 2.1 persistence provider!" ) ;^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[ADD]^^107^^^^^101^118^[ADD] Assert.isTrue ( JPA21_AVAILABLE, "The EntityGraph-Feature requires at least a JPA 2.1 persistence provider!" ) ;^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[REPLACE]^Assert.isTrue ( GET_ENTITY_GRAPH_METHOD == null, "It seems that you have the JPA 2.1 API but a JPA 2.0 implementation on the classpath!" ) ;^108^109^^^^101^118^[REPLACE] Assert.isTrue ( GET_ENTITY_GRAPH_METHOD != null, "It seems that you have the JPA 2.1 API but a JPA 2.0 implementation on the classpath!" ) ;^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[ADD]^^108^109^^^^101^118^[ADD] Assert.isTrue ( GET_ENTITY_GRAPH_METHOD != null, "It seems that you have the JPA 2.1 API but a JPA 2.0 implementation on the classpath!" ) ;^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[ADD]^return em.getEntityGraph ( jpaEntityGraph.getName (  )  ) ;^111^112^113^114^115^101^118^[ADD] try {  return em.getEntityGraph ( jpaEntityGraph.getName (  )  ) ; } catch  ( Exception ex )  {^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[REPLACE]^return em.getEntityGraph ( jpaEntityGraph.getType (  )  ) ;^113^^^^^101^118^[REPLACE] return em.getEntityGraph ( jpaEntityGraph.getName (  )  ) ;^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[REPLACE]^return createDynamicEntityGraph ( em, jpaEntityGraph, null ) ;^116^^^^^101^118^[REPLACE] return createDynamicEntityGraph ( em, jpaEntityGraph, entityType ) ;^[METHOD] tryGetFetchGraph [TYPE] EntityGraph [PARAMETER] EntityManager em JpaEntityGraph jpaEntityGraph Class<?> entityType [CLASS] Jpa21Utils   [TYPE]  EntityManager em  [TYPE]  JpaEntityGraph jpaEntityGraph  [TYPE]  Class entityType  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  Exception ex 
[REPLACE]^if  ( pathComponents.length - 3 - 1 == offset )  {^169^^^^^164^200^[REPLACE] if  ( pathComponents.length - 1 == offset )  {^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^if  ( parent != null && !exists ( attributeName, root.getAttributeNodes (  )  )  )  {^171^^^^^164^200^[REPLACE] if  ( parent == null && !exists ( attributeName, root.getAttributeNodes (  )  )  )  {^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[ADD]^root.addAttributeNodes ( attributeName ) ;parent.addAttributeNodes ( attributeName ) ;^171^172^173^174^175^164^200^[ADD] if  ( parent == null && !exists ( attributeName, root.getAttributeNodes (  )  )  )  { root.addAttributeNodes ( attributeName ) ; } else if  ( parent != null && !exists ( attributeName, parent.getAttributeNodes (  )  )  )  { parent.addAttributeNodes ( attributeName ) ; }^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^}  if  ( parent == null ) {^173^^^^^164^200^[REPLACE] } else if  ( parent != null && !exists ( attributeName, parent.getAttributeNodes (  )  )  )  {^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^parent.addSubgraph ( attributeName ) ;^174^^^^^164^200^[REPLACE] parent.addAttributeNodes ( attributeName ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^root.addSubgraph ( attributeName ) ;^172^^^^^164^200^[REPLACE] root.addAttributeNodes ( attributeName ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[ADD]^^172^^^^^164^200^[ADD] root.addAttributeNodes ( attributeName ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^}  else {^173^^^^^164^200^[REPLACE] } else if  ( parent != null && !exists ( attributeName, parent.getAttributeNodes (  )  )  )  {^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[ADD]^}^173^174^175^^^164^200^[ADD] else if  ( parent != null && !exists ( attributeName, parent.getAttributeNodes (  )  )  )  { parent.addAttributeNodes ( attributeName ) ; }^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^if  ( parent != null && !exists ( attributeName, null.getAttributeNodes (  )  )  )  {^171^^^^^164^200^[REPLACE] if  ( parent == null && !exists ( attributeName, root.getAttributeNodes (  )  )  )  {^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[ADD]^}   parent.addAttributeNodes ( attributeName ) ;^173^174^175^^^164^200^[ADD] else if  ( parent != null && !exists ( attributeName, parent.getAttributeNodes (  )  )  )  { parent.addAttributeNodes ( attributeName ) ; }^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^root.addAttributeNodes ( attributeName )  ;^174^^^^^164^200^[REPLACE] parent.addAttributeNodes ( attributeName ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^parent.addAttributeNodes ( attributeName )  ;^172^^^^^164^200^[REPLACE] root.addAttributeNodes ( attributeName ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[ADD]^^174^^^^^164^200^[ADD] parent.addAttributeNodes ( attributeName ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[ADD]^^180^^^^^164^200^[ADD] AttributeNode<?> node = findAttributeNode ( attributeName, root, parent ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^if  ( node == true )  {^182^^^^^164^200^[REPLACE] if  ( node != null )  {^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^if  ( subgraph != null )  {^186^^^^^164^200^[REPLACE] if  ( subgraph == null )  {^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^subgraph  =  root.addSubgraph ( attributeName ) ;^187^^^^^164^200^[REPLACE] subgraph = parent != null ? parent.addSubgraph ( attributeName )  : root.addSubgraph ( attributeName ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^subgraph = parent == null ? parent.addSubgraph ( attributeName )  : root.addSubgraph ( attributeName ) ;^187^^^^^164^200^[REPLACE] subgraph = parent != null ? parent.addSubgraph ( attributeName )  : root.addSubgraph ( attributeName ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[ADD]^^184^^^^^164^200^[ADD] Subgraph<?> subgraph = getSubgraph ( node ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[ADD]^^187^^^^^164^200^[ADD] subgraph = parent != null ? parent.addSubgraph ( attributeName )  : root.addSubgraph ( attributeName ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^if  ( 1 != false )  {^195^^^^^164^200^[REPLACE] if  ( parent == null )  {^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[ADD]^createGraph ( pathComponents, offset + 1, root, root.addSubgraph ( attributeName )  ) ;createGraph ( pathComponents, offset + 1, root, parent.addSubgraph ( attributeName )  ) ;^195^196^197^198^199^164^200^[ADD] if  ( parent == null )  { createGraph ( pathComponents, offset + 1, root, root.addSubgraph ( attributeName )  ) ; } else { createGraph ( pathComponents, offset + 1, root, parent.addSubgraph ( attributeName )  ) ; }^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^createGraph ( pathComponents,  ( offset + 1 ) , root, root.addSubgraph ( attributeName )  )  ;^198^^^^^195^199^[REPLACE] createGraph ( pathComponents, offset + 1, root, parent.addSubgraph ( attributeName )  ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[ADD]^^198^^^^^195^199^[ADD] createGraph ( pathComponents, offset + 1, root, parent.addSubgraph ( attributeName )  ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^root.addSubgraph ( attributeName )  ;^198^^^^^195^199^[REPLACE] createGraph ( pathComponents, offset + 1, root, parent.addSubgraph ( attributeName )  ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^createGraph ( pathComponents, offset  1, root, root.addSubgraph ( attributeName )  ) ;^196^^^^^164^200^[REPLACE] createGraph ( pathComponents, offset + 1, root, root.addSubgraph ( attributeName )  ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[REPLACE]^createGraph ( pathComponents, offset + 1, root, root.addAttributeNodes ( attributeName )  ) ;^196^^^^^164^200^[REPLACE] createGraph ( pathComponents, offset + 1, root, root.addSubgraph ( attributeName )  ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 
[ADD]^^196^^^^^164^200^[ADD] createGraph ( pathComponents, offset + 1, root, root.addSubgraph ( attributeName )  ) ;^[METHOD] createGraph [TYPE] void [PARAMETER] String[] pathComponents int offset EntityGraph<?> root Subgraph<?> parent [CLASS] Jpa21Utils   [TYPE]  EntityGraph root  [TYPE]  boolean JPA21_AVAILABLE  false  true  [TYPE]  AttributeNode node  [TYPE]  Subgraph parent  subgraph  [TYPE]  Method GET_ENTITY_GRAPH_METHOD  [TYPE]  String[] pathComponents  [TYPE]  String attributeName  [TYPE]  int offset 