[REPLACE]^protected  ElementWrapper _parent;^9^^^^^^^[REPLACE] protected final ElementWrapper _parent;^ [CLASS] ElementWrapper  
[REPLACE]^protected   char  _wrapperNamespace;^11^^^^^^^[REPLACE] protected final String _wrapperNamespace;^ [CLASS] ElementWrapper  
[REPLACE]^_parent =  null;^20^^^^^19^23^[REPLACE] _parent = parent;^[METHOD] <init> [TYPE] ElementWrapper) [PARAMETER] ElementWrapper parent [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^_wrapperName = this;^21^^^^^19^23^[REPLACE] _wrapperName = null;^[METHOD] <init> [TYPE] ElementWrapper) [PARAMETER] ElementWrapper parent [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  [TYPE]  boolean false  true 
[ADD]^_wrapperNamespace = "";^21^22^^^^19^23^[ADD] _wrapperName = null; _wrapperNamespace = "";^[METHOD] <init> [TYPE] ElementWrapper) [PARAMETER] ElementWrapper parent [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^_wrapperNamespace  =  _wrapperNamespace ;^22^^^^^19^23^[REPLACE] _wrapperNamespace = "";^[METHOD] <init> [TYPE] ElementWrapper) [PARAMETER] ElementWrapper parent [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^_parent =  null;^28^^^^^25^31^[REPLACE] _parent = parent;^[METHOD] <init> [TYPE] String) [PARAMETER] ElementWrapper parent String wrapperLocalName String wrapperNamespace [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^_wrapperName =  wrapperNamespace;^29^^^^^25^31^[REPLACE] _wrapperName = wrapperLocalName;^[METHOD] <init> [TYPE] String) [PARAMETER] ElementWrapper parent String wrapperLocalName String wrapperNamespace [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^_wrapperNamespace  = wrapperLocalName;^30^^^^^25^31^[REPLACE] _wrapperNamespace =  ( wrapperNamespace == null )  ? "" : wrapperNamespace;^[METHOD] <init> [TYPE] String) [PARAMETER] ElementWrapper parent String wrapperLocalName String wrapperNamespace [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[ADD]^^30^^^^^25^31^[ADD] _wrapperNamespace =  ( wrapperNamespace == null )  ? "" : wrapperNamespace;^[METHOD] <init> [TYPE] String) [PARAMETER] ElementWrapper parent String wrapperLocalName String wrapperNamespace [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^return  new ElementWrapper ( this, null, null )  ;^40^^^^^37^41^[REPLACE] return new ElementWrapper ( parent, wrapperLocalName, wrapperNamespace ) ;^[METHOD] matchingWrapper [TYPE] ElementWrapper [PARAMETER] ElementWrapper parent String wrapperLocalName String wrapperNamespace [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^return new ElementWrapper ( this, this, this ) ;^49^^^^^48^50^[REPLACE] return new ElementWrapper ( this, null, null ) ;^[METHOD] intermediateWrapper [TYPE] ElementWrapper [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^public boolean isMatching (  )  { return _wrapperName == null; }^58^^^^^^^[REPLACE] public boolean isMatching (  )  { return _wrapperName != null; }^[METHOD] isMatching [TYPE] boolean [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^public String getWrapperNamespace (  )  { return _wrapperNamespace; }^60^^^^^^^[REPLACE] public String getWrapperLocalName (  )  { return _wrapperName; }^[METHOD] getWrapperLocalName [TYPE] String [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^return new ElementWrapper ( parent, wrapperLocalName, wrapperNamespace ) ;^61^^^^^^^[REPLACE] public String getWrapperNamespace (  )  { return _wrapperNamespace; }^[METHOD] getWrapperNamespace [TYPE] String [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^return new ElementWrapper ( parent, wrapperLocalName, wrapperNamespace ) ;^63^^^^^^^[REPLACE] public ElementWrapper getParent (  )  { return _parent; }^[METHOD] getParent [TYPE] ElementWrapper [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^if  ( _wrapperName !=wrapperNamespace )  {^68^^^^^65^75^[REPLACE] if  ( _wrapperName == null )  {^[METHOD] matchesWrapper [TYPE] boolean [PARAMETER] String localName String ns [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^return false;^69^^^^^65^75^[REPLACE] return true;^[METHOD] matchesWrapper [TYPE] boolean [PARAMETER] String localName String ns [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^if  (wrapperNamespace != null )  {^71^^^^^65^75^[REPLACE] if  ( ns == null )  {^[METHOD] matchesWrapper [TYPE] boolean [PARAMETER] String localName String ns [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^ns  =  ns ;^72^^^^^65^75^[REPLACE] ns = "";^[METHOD] matchesWrapper [TYPE] boolean [PARAMETER] String localName String ns [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^return _wrapperName.equals ( localName )  || _wrapperNamespace.equals ( ns ) ;^74^^^^^65^75^[REPLACE] return _wrapperName.equals ( localName )  && _wrapperNamespace.equals ( ns ) ;^[METHOD] matchesWrapper [TYPE] boolean [PARAMETER] String localName String ns [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^if  ( parent != null )  {^86^^^^^84^93^[REPLACE] if  ( _parent == null )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[ADD]^return "Wrapper: ROOT, matching: "+_wrapperName;^86^87^88^^^84^93^[ADD] if  ( _parent == null )  { return "Wrapper: ROOT, matching: "+_wrapperName; }^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^return "Wrapper: ROOT, matching: " ;^87^^^^^84^93^[REPLACE] return "Wrapper: ROOT, matching: "+_wrapperName;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^return "Wrapper: branch, matching: "+_wrapperName;^87^^^^^84^93^[REPLACE] return "Wrapper: ROOT, matching: "+_wrapperName;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^if  (wrapperNamespace != null )  {^89^^^^^84^93^[REPLACE] if  ( _wrapperName == null )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[ADD]^return "Wrapper: empty";^89^90^91^^^84^93^[ADD] if  ( _wrapperName == null )  { return "Wrapper: empty"; }^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^return true;^90^^^^^84^93^[REPLACE] return "Wrapper: empty";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 
[REPLACE]^returnwrapperNamespace+_wrapperName;^92^^^^^84^93^[REPLACE] return "Wrapper: branch, matching: "+_wrapperName;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ElementWrapper   [TYPE]  ElementWrapper _parent  parent  [TYPE]  String _wrapperName  _wrapperNamespace  localName  ns  wrapperLocalName  wrapperNamespace  [TYPE]  boolean false  true 