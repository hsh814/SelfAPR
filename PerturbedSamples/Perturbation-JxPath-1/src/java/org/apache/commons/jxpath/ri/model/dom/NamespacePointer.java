[REPLACE]^private  char  prefix;^32^^^^^^^[REPLACE] private String prefix;^ [CLASS] NamespacePointer  
[REPLACE]^private  char  namespaceURI;^33^^^^^^^[REPLACE] private String namespaceURI;^ [CLASS] NamespacePointer  
[REPLACE]^buffer.append ( prefix ) ;^36^^^^^35^38^[REPLACE] super ( parent ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] NodePointer parent String prefix [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  NodePointer parent  [TYPE]  boolean false  true 
[ADD]^^36^^^^^35^38^[ADD] super ( parent ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] NodePointer parent String prefix [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  NodePointer parent  [TYPE]  boolean false  true 
[REPLACE]^this.prefix =  namespaceURI;^37^^^^^35^38^[REPLACE] this.prefix = prefix;^[METHOD] <init> [TYPE] String) [PARAMETER] NodePointer parent String prefix [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  NodePointer parent  [TYPE]  boolean false  true 
[ADD]^^37^^^^^35^38^[ADD] this.prefix = prefix;^[METHOD] <init> [TYPE] String) [PARAMETER] NodePointer parent String prefix [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  NodePointer parent  [TYPE]  boolean false  true 
[REPLACE]^buffer.append ( prefix ) ;^45^^^^^40^48^[REPLACE] super ( parent ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] NodePointer parent String prefix String namespaceURI [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  NodePointer parent  [TYPE]  boolean false  true 
[ADD]^^45^^^^^40^48^[ADD] super ( parent ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] NodePointer parent String prefix String namespaceURI [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  NodePointer parent  [TYPE]  boolean false  true 
[REPLACE]^this.prefix =  null;^46^^^^^40^48^[REPLACE] this.prefix = prefix;^[METHOD] <init> [TYPE] String) [PARAMETER] NodePointer parent String prefix String namespaceURI [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  NodePointer parent  [TYPE]  boolean false  true 
[REPLACE]^this.namespaceURI =  prefix;^47^^^^^40^48^[REPLACE] this.namespaceURI = namespaceURI;^[METHOD] <init> [TYPE] String) [PARAMETER] NodePointer parent String prefix String namespaceURI [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  NodePointer parent  [TYPE]  boolean false  true 
[REPLACE]^return null;^51^^^^^50^52^[REPLACE] return new QName ( prefix ) ;^[METHOD] getName [TYPE] QName [PARAMETER] [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 
[REPLACE]^return this;^55^^^^^54^56^[REPLACE] return null;^[METHOD] getBaseValue [TYPE] Object [PARAMETER] [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 
[REPLACE]^return true;^59^^^^^58^60^[REPLACE] return false;^[METHOD] isCollection [TYPE] boolean [PARAMETER] [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 
[REPLACE]^return 1 * 1;^63^^^^^62^64^[REPLACE] return 1;^[METHOD] getLength [TYPE] int [PARAMETER] [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 
[REPLACE]^return null;^67^^^^^66^68^[REPLACE] return getNamespaceURI (  ) ;^[METHOD] getImmediateNode [TYPE] Object [PARAMETER] [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 
[REPLACE]^if  ( namespaceURI !=prefix )  {^71^^^^^70^75^[REPLACE] if  ( namespaceURI == null )  {^[METHOD] getNamespaceURI [TYPE] String [PARAMETER] [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 
[ADD]^namespaceURI = parent.getNamespaceURI ( prefix ) ;^71^72^73^^^70^75^[ADD] if  ( namespaceURI == null )  { namespaceURI = parent.getNamespaceURI ( prefix ) ; }^[METHOD] getNamespaceURI [TYPE] String [PARAMETER] [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 
[REPLACE]^namespaceURI  = null ;^72^^^^^70^75^[REPLACE] namespaceURI = parent.getNamespaceURI ( prefix ) ;^[METHOD] getNamespaceURI [TYPE] String [PARAMETER] [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 
[ADD]^^72^^^^^70^75^[ADD] namespaceURI = parent.getNamespaceURI ( prefix ) ;^[METHOD] getNamespaceURI [TYPE] String [PARAMETER] [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 
[REPLACE]^return null;^74^^^^^70^75^[REPLACE] return namespaceURI;^[METHOD] getNamespaceURI [TYPE] String [PARAMETER] [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 
[REPLACE]^return false;^78^^^^^77^79^[REPLACE] return true;^[METHOD] isLeaf [TYPE] boolean [PARAMETER] [CLASS] NamespacePointer   [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 
[REPLACE]^return ;^85^^^^^84^86^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] setValue [TYPE] void [PARAMETER] Object value [CLASS] NamespacePointer   [TYPE]  Object value  [TYPE]  String namespaceURI  prefix  [TYPE]  boolean false  true 