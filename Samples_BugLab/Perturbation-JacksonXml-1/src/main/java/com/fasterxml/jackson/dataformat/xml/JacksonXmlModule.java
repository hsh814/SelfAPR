[BugLab_Wrong_Operator]^if  ( _cfgNameForTextElement == FromXmlParser.DEFAULT_UNNAMED_TEXT_PROPERTY )  {^64^^^^^54^73^if  ( _cfgNameForTextElement != FromXmlParser.DEFAULT_UNNAMED_TEXT_PROPERTY )  {^[CLASS] JacksonXmlModule  [METHOD] setupModule [RETURN_TYPE] void   SetupContext context [VARIABLES] boolean  _cfgDefaultUseWrapper  String  _cfgNameForTextElement  long  serialVersionUID  SetupContext  context  XmlMapper  m  
[BugLab_Variable_Misuse]^_cfgDefaultUseWrapper = _cfgDefaultUseWrapper;^96^^^^^95^97^_cfgDefaultUseWrapper = state;^[CLASS] JacksonXmlModule  [METHOD] setDefaultUseWrapper [RETURN_TYPE] void   boolean state [VARIABLES] boolean  _cfgDefaultUseWrapper  state  String  _cfgNameForTextElement  long  serialVersionUID  
[BugLab_Variable_Misuse]^_cfgNameForTextElement = _cfgNameForTextElement;^113^^^^^112^114^_cfgNameForTextElement = name;^[CLASS] JacksonXmlModule  [METHOD] setXMLTextElementName [RETURN_TYPE] void   String name [VARIABLES] boolean  _cfgDefaultUseWrapper  state  String  _cfgNameForTextElement  name  long  serialVersionUID  
[BugLab_Variable_Misuse]^return new JacksonXmlAnnotationIntrospector ( state ) ;^123^^^^^122^124^return new JacksonXmlAnnotationIntrospector ( _cfgDefaultUseWrapper ) ;^[CLASS] JacksonXmlModule  [METHOD] _constructIntrospector [RETURN_TYPE] AnnotationIntrospector   [VARIABLES] boolean  _cfgDefaultUseWrapper  state  String  _cfgNameForTextElement  name  long  serialVersionUID  