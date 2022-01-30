[REPLACE]^private  final  short  serialVersionUID = 9199892576531984162L;^70^^^^^^^[REPLACE] private static final long serialVersionUID = 9199892576531984162L;^ [CLASS] PieSectionEntity  
[REPLACE]^private  short  pieIndex;^76^^^^^^^[REPLACE] private int pieIndex;^ [CLASS] PieSectionEntity  
[REPLACE]^private  long  sectionIndex;^79^^^^^^^[REPLACE] private int sectionIndex;^ [CLASS] PieSectionEntity  
[REPLACE]^+ this.sectionKey.toString (  )  + " ) ";^101^^^^^95^107^[REPLACE] super ( area, toolTipText, urlText ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] Shape area PieDataset dataset int pieIndex int sectionIndex Comparable sectionKey String toolTipText String urlText [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  Shape area  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  String toolTipText  urlText  [TYPE]  long serialVersionUID  [TYPE]  int pieIndex  sectionIndex 
[ADD]^^101^102^^^^95^107^[ADD] super ( area, toolTipText, urlText ) ; this.dataset = dataset;^[METHOD] <init> [TYPE] String) [PARAMETER] Shape area PieDataset dataset int pieIndex int sectionIndex Comparable sectionKey String toolTipText String urlText [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  Shape area  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  String toolTipText  urlText  [TYPE]  long serialVersionUID  [TYPE]  int pieIndex  sectionIndex 
[REPLACE]^this.dataset =  null;^102^^^^^95^107^[REPLACE] this.dataset = dataset;^[METHOD] <init> [TYPE] String) [PARAMETER] Shape area PieDataset dataset int pieIndex int sectionIndex Comparable sectionKey String toolTipText String urlText [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  Shape area  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  String toolTipText  urlText  [TYPE]  long serialVersionUID  [TYPE]  int pieIndex  sectionIndex 
[REPLACE]^this.pieIndex = index; ;^103^^^^^95^107^[REPLACE] this.pieIndex = pieIndex;^[METHOD] <init> [TYPE] String) [PARAMETER] Shape area PieDataset dataset int pieIndex int sectionIndex Comparable sectionKey String toolTipText String urlText [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  Shape area  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  String toolTipText  urlText  [TYPE]  long serialVersionUID  [TYPE]  int pieIndex  sectionIndex 
[REPLACE]^this.sectionIndex = index; ;^104^^^^^95^107^[REPLACE] this.sectionIndex = sectionIndex;^[METHOD] <init> [TYPE] String) [PARAMETER] Shape area PieDataset dataset int pieIndex int sectionIndex Comparable sectionKey String toolTipText String urlText [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  Shape area  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  String toolTipText  urlText  [TYPE]  long serialVersionUID  [TYPE]  int pieIndex  sectionIndex 
[REPLACE]^this.sectionIndex = sectionIndex; ;^105^^^^^95^107^[REPLACE] this.sectionKey = sectionKey;^[METHOD] <init> [TYPE] String) [PARAMETER] Shape area PieDataset dataset int pieIndex int sectionIndex Comparable sectionKey String toolTipText String urlText [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  Shape area  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  String toolTipText  urlText  [TYPE]  long serialVersionUID  [TYPE]  int pieIndex  sectionIndex 
[REPLACE]^return this.sectionKey;^115^^^^^114^116^[REPLACE] return this.dataset;^[METHOD] getDataset [TYPE] PieDataset [PARAMETER] [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  long serialVersionUID  [TYPE]  int pieIndex  sectionIndex 
[REPLACE]^this.dataset =  null;^124^^^^^123^125^[REPLACE] this.dataset = dataset;^[METHOD] setDataset [TYPE] void [PARAMETER] PieDataset dataset [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  long serialVersionUID  [TYPE]  int pieIndex  sectionIndex 
[ADD]^^124^^^^^123^125^[ADD] this.dataset = dataset;^[METHOD] setDataset [TYPE] void [PARAMETER] PieDataset dataset [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  long serialVersionUID  [TYPE]  int pieIndex  sectionIndex 
[REPLACE]^return this.sectionKey;^135^^^^^134^136^[REPLACE] return this.pieIndex;^[METHOD] getPieIndex [TYPE] int [PARAMETER] [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  long serialVersionUID  [TYPE]  int pieIndex  sectionIndex 
[REPLACE]^this.pieIndex = pieIndex; ;^144^^^^^143^145^[REPLACE] this.pieIndex = index;^[METHOD] setPieIndex [TYPE] void [PARAMETER] int index [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  long serialVersionUID  [TYPE]  int index  pieIndex  sectionIndex 
[REPLACE]^return this.sectionKey;^153^^^^^152^154^[REPLACE] return this.sectionIndex;^[METHOD] getSectionIndex [TYPE] int [PARAMETER] [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  long serialVersionUID  [TYPE]  int index  pieIndex  sectionIndex 
[REPLACE]^this.sectionIndex = sectionIndex; ;^162^^^^^161^163^[REPLACE] this.sectionIndex = index;^[METHOD] setSectionIndex [TYPE] void [PARAMETER] int index [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  long serialVersionUID  [TYPE]  int index  pieIndex  sectionIndex 
[REPLACE]^return this.sectionIndex;^171^^^^^170^172^[REPLACE] return this.sectionKey;^[METHOD] getSectionKey [TYPE] Comparable [PARAMETER] [CLASS] PieSectionEntity   [TYPE]  Comparable sectionKey  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  long serialVersionUID  [TYPE]  int index  pieIndex  sectionIndex 
[REPLACE]^this.sectionKey = sectionKey; ;^180^^^^^179^181^[REPLACE] this.sectionKey = key;^[METHOD] setSectionKey [TYPE] void [PARAMETER] Comparable key [CLASS] PieSectionEntity   [TYPE]  Comparable key  sectionKey  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  long serialVersionUID  [TYPE]  int index  pieIndex  sectionIndex 
[ADD]^^180^^^^^179^181^[ADD] this.sectionKey = key;^[METHOD] setSectionKey [TYPE] void [PARAMETER] Comparable key [CLASS] PieSectionEntity   [TYPE]  Comparable key  sectionKey  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  long serialVersionUID  [TYPE]  int index  pieIndex  sectionIndex 
[REPLACE]^return "PieSection: "  ||  this.pieIndex  ||  ", "  ||  this.sectionIndex  ||  " ( "  ||  this.sectionKey.toString (  )   ||  " ) ";^189^190^^^^188^191^[REPLACE] return "PieSection: " + this.pieIndex + ", " + this.sectionIndex + " ( " + this.sectionKey.toString (  )  + " ) ";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] PieSectionEntity   [TYPE]  Comparable key  sectionKey  [TYPE]  boolean false  true  [TYPE]  PieDataset dataset  [TYPE]  long serialVersionUID  [TYPE]  int index  pieIndex  sectionIndex 