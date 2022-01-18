[REPLACE]^private  JXPathContextFactory factory;^69^^^^^^^[REPLACE] private static JXPathContextFactory factory;^ [CLASS] JXPathServletContexts  
[REPLACE]^JXPathContext context = ( JXPathContext )  pageContext.getRequest ( Constants.JXPATH_CONTEXT ) ;^95^96^^^^94^110^[REPLACE] JXPathContext context = ( JXPathContext )  pageContext.getAttribute ( Constants.JXPATH_CONTEXT ) ;^[METHOD] getPageContext [TYPE] JXPathContext [PARAMETER] PageContext pageContext [CLASS] JXPathServletContexts   [TYPE]  JXPathContextFactory factory  [TYPE]  PageContext pageContext  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext 
[ADD]^^95^96^^^^94^110^[ADD] JXPathContext context = ( JXPathContext )  pageContext.getAttribute ( Constants.JXPATH_CONTEXT ) ;^[METHOD] getPageContext [TYPE] JXPathContext [PARAMETER] PageContext pageContext [CLASS] JXPathServletContexts   [TYPE]  JXPathContextFactory factory  [TYPE]  PageContext pageContext  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext 
[REPLACE]^if  ( context != null )  {^97^^^^^94^110^[REPLACE] if  ( context == null )  {^[METHOD] getPageContext [TYPE] JXPathContext [PARAMETER] PageContext pageContext [CLASS] JXPathServletContexts   [TYPE]  JXPathContextFactory factory  [TYPE]  PageContext pageContext  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext 
[REPLACE]^context = factory.newContext ( null, servletContext ) ; ;^102^^^^^94^110^[REPLACE] context = factory.newContext ( parentContext, pageContext ) ;^[METHOD] getPageContext [TYPE] JXPathContext [PARAMETER] PageContext pageContext [CLASS] JXPathServletContexts   [TYPE]  JXPathContextFactory factory  [TYPE]  PageContext pageContext  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext 
[REPLACE]^JXPathContext parentContext = getRequestContext ( pageContext .getServletContext (  )  , pageContext.getServletContext (  )  ) ;^98^99^100^101^^94^110^[REPLACE] JXPathContext parentContext = getRequestContext ( pageContext.getRequest (  ) , pageContext.getServletContext (  )  ) ;^[METHOD] getPageContext [TYPE] JXPathContext [PARAMETER] PageContext pageContext [CLASS] JXPathServletContexts   [TYPE]  JXPathContextFactory factory  [TYPE]  PageContext pageContext  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext 
[REPLACE]^JXPathContext parentContext = getRequestContext ( pageContext.getRequest (  ) , pageContext.getRequest (  )  ) ;^98^99^100^101^^94^110^[REPLACE] JXPathContext parentContext = getRequestContext ( pageContext.getRequest (  ) , pageContext.getServletContext (  )  ) ;^[METHOD] getPageContext [TYPE] JXPathContext [PARAMETER] PageContext pageContext [CLASS] JXPathServletContexts   [TYPE]  JXPathContextFactory factory  [TYPE]  PageContext pageContext  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext 
[REPLACE]^return parentContext;^109^^^^^94^110^[REPLACE] return context;^[METHOD] getPageContext [TYPE] JXPathContext [PARAMETER] PageContext pageContext [CLASS] JXPathServletContexts   [TYPE]  JXPathContextFactory factory  [TYPE]  PageContext pageContext  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext 
[REPLACE]^JXPathContext context = ( JXPathContext )  request .setAttribute ( parentContext )  ;^120^121^^^^119^151^[REPLACE] JXPathContext context = ( JXPathContext )  request.getAttribute ( Constants.JXPATH_CONTEXT ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^if  ( context == this  )  {^125^^^^^119^151^[REPLACE] if  ( context != null )  {^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[ADD]^^125^126^127^128^129^119^151^[ADD] if  ( context != null )  { ServletRequestAndContext handle = ( ServletRequestAndContext )  context.getContextBean (  ) ; if  ( handle.getServletRequest (  )  == request )  { return context;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^if  ( handle.getServletRequest (  )   !=  request )  {^128^^^^^119^151^[REPLACE] if  ( handle.getServletRequest (  )  == request )  {^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^return parentContext;^129^^^^^119^151^[REPLACE] return context;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^ServletRequestAndContext handle = ( ServletRequestAndContext )  parentContext.getContextBean (  ) ;^126^127^^^^119^151^[REPLACE] ServletRequestAndContext handle = ( ServletRequestAndContext )  context.getContextBean (  ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^JXPathContext parentContext = false;^133^^^^^119^151^[REPLACE] JXPathContext parentContext = null;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^if  ( ! request instanceof HttpServletRequest )  {^134^^^^^119^151^[REPLACE] if  ( request instanceof HttpServletRequest )  {^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^if  ( session == null )  {^137^^^^^119^151^[REPLACE] if  ( session != null )  {^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[ADD]^^137^138^139^^^119^151^[ADD] if  ( session != null )  { parentContext = getSessionContext ( session, servletContext ) ; }^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^parentContext = getSessionContext ( session, servletContext ) ; ;^141^^^^^137^142^[REPLACE] parentContext = getApplicationContext ( servletContext ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[ADD]^^141^^^^^137^142^[ADD] parentContext = getApplicationContext ( servletContext ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^parentContext = getApplicationContext ( servletContext ) ; ;^138^^^^^119^151^[REPLACE] parentContext = getSessionContext ( session, servletContext ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[ADD]^^138^^^^^119^151^[ADD] parentContext = getSessionContext ( session, servletContext ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^parentContext = getSessionContext ( session, servletContext ) ; ;^141^^^^^119^151^[REPLACE] parentContext = getApplicationContext ( servletContext ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^HttpSession session = (  ( HttpServletRequest )  request ) .getSession ( true ) ;^135^136^^^^119^151^[REPLACE] HttpSession session = (  ( HttpServletRequest )  request ) .getSession ( false ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^context = factory.newContext ( parentContext, pageContext ) ; ;^146^^^^^119^151^[REPLACE] context = factory.newContext ( parentContext, handle ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^context .getContextBean (  )  ;^147^148^^^^119^151^[REPLACE] context.setVariables ( new KeywordVariables ( Constants.REQUEST_SCOPE, handle )  ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[ADD]^^147^148^^^^119^151^[ADD] context.setVariables ( new KeywordVariables ( Constants.REQUEST_SCOPE, handle )  ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^servletContext.setAttribute ( Constants.JXPATH_CONTEXT, context ) ;^149^^^^^119^151^[REPLACE] request.setAttribute ( Constants.JXPATH_CONTEXT, context ) ;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^return parentContext;^150^^^^^119^151^[REPLACE] return context;^[METHOD] getRequestContext [TYPE] JXPathContext [PARAMETER] ServletRequest request ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletRequest request  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  ServletRequestAndContext handle 
[REPLACE]^JXPathContext context = ( JXPathContext )  session .setAttribute ( parentContext )  ;^161^162^^^^157^173^[REPLACE] JXPathContext context = ( JXPathContext )  session.getAttribute ( Constants.JXPATH_CONTEXT ) ;^[METHOD] getSessionContext [TYPE] JXPathContext [PARAMETER] HttpSession session ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  HttpSessionAndServletContext handle 
[REPLACE]^if  ( context != null )  {^163^^^^^157^173^[REPLACE] if  ( context == null )  {^[METHOD] getSessionContext [TYPE] JXPathContext [PARAMETER] HttpSession session ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  HttpSessionAndServletContext handle 
[REPLACE]^context = factory.newContext ( parentContext, pageContext ) ; ;^167^^^^^157^173^[REPLACE] context = factory.newContext ( parentContext, handle ) ;^[METHOD] getSessionContext [TYPE] JXPathContext [PARAMETER] HttpSession session ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  HttpSessionAndServletContext handle 
[REPLACE]^JXPathContext parentContext = getRequestContext (^164^^^^^157^173^[REPLACE] JXPathContext parentContext = getApplicationContext ( servletContext ) ;^[METHOD] getSessionContext [TYPE] JXPathContext [PARAMETER] HttpSession session ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  HttpSessionAndServletContext handle 
[REPLACE]^return parentContext;^172^^^^^157^173^[REPLACE] return context;^[METHOD] getSessionContext [TYPE] JXPathContext [PARAMETER] HttpSession session ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  boolean false  true  [TYPE]  JXPathContext context  parentContext  [TYPE]  HttpSession session  [TYPE]  HttpSessionAndServletContext handle 
[REPLACE]^JXPathContext context = ( JXPathContext )  servletContext .setAttribute ( context )  ;^182^183^184^^^179^194^[REPLACE] JXPathContext context = ( JXPathContext )  servletContext.getAttribute ( Constants.JXPATH_CONTEXT ) ;^[METHOD] getApplicationContext [TYPE] JXPathContext [PARAMETER] ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  boolean false  true  [TYPE]  JXPathContext context 
[REPLACE]^if  ( context != null )  {^185^^^^^179^194^[REPLACE] if  ( context == null )  {^[METHOD] getApplicationContext [TYPE] JXPathContext [PARAMETER] ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  boolean false  true  [TYPE]  JXPathContext context 
[ADD]^context = factory.newContext ( null, servletContext ) ;^185^186^187^188^189^179^194^[ADD] if  ( context == null )  { context = factory.newContext ( null, servletContext ) ; context.setVariables ( new KeywordVariables ( Constants.APPLICATION_SCOPE,^[METHOD] getApplicationContext [TYPE] JXPathContext [PARAMETER] ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  boolean false  true  [TYPE]  JXPathContext context 
[REPLACE]^context = factory.newContext ( false, servletContext ) ;^186^^^^^179^194^[REPLACE] context = factory.newContext ( null, servletContext ) ;^[METHOD] getApplicationContext [TYPE] JXPathContext [PARAMETER] ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  boolean false  true  [TYPE]  JXPathContext context 
[REPLACE]^context = factory.newContext ( true, servletContext ) ;^186^^^^^179^194^[REPLACE] context = factory.newContext ( null, servletContext ) ;^[METHOD] getApplicationContext [TYPE] JXPathContext [PARAMETER] ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  boolean false  true  [TYPE]  JXPathContext context 
[ADD]^^186^^^^^179^194^[ADD] context = factory.newContext ( null, servletContext ) ;^[METHOD] getApplicationContext [TYPE] JXPathContext [PARAMETER] ServletContext servletContext [CLASS] JXPathServletContexts   [TYPE]  ServletContext servletContext  [TYPE]  JXPathContextFactory factory  [TYPE]  boolean false  true  [TYPE]  JXPathContext context 