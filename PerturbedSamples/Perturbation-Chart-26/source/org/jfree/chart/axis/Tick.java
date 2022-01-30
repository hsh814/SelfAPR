[REPLACE]^private static final long serialVersionUID ;^62^^^^^^^[REPLACE] private static final long serialVersionUID = 6668230383875149773L;^ [CLASS] Tick  
[REPLACE]^private  byte  text;^65^^^^^^^[REPLACE] private String text;^ [CLASS] Tick  
[REPLACE]^private float angle;^74^^^^^^^[REPLACE] private double angle;^ [CLASS] Tick  
[REPLACE]^if  ( rotationAnchor != this )  {^87^^^^^85^99^[REPLACE] if  ( textAnchor == null )  {^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] String text TextAnchor textAnchor TextAnchor rotationAnchor double angle [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^return ;^88^^^^^85^99^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] String text TextAnchor textAnchor TextAnchor rotationAnchor double angle [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( rotationAnchor != null )  {^90^^^^^85^99^[REPLACE] if  ( rotationAnchor == null )  {^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] String text TextAnchor textAnchor TextAnchor rotationAnchor double angle [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^return ;^91^92^93^^^85^99^[REPLACE] throw new IllegalArgumentException ( "Null 'rotationAnchor' argument." ) ;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] String text TextAnchor textAnchor TextAnchor rotationAnchor double angle [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^this.text =  null;^95^^^^^85^99^[REPLACE] this.text = text;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] String text TextAnchor textAnchor TextAnchor rotationAnchor double angle [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^this.textAnchor =  rotationAnchor;^96^^^^^85^99^[REPLACE] this.textAnchor = textAnchor;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] String text TextAnchor textAnchor TextAnchor rotationAnchor double angle [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[ADD]^^96^^^^^85^99^[ADD] this.textAnchor = textAnchor;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] String text TextAnchor textAnchor TextAnchor rotationAnchor double angle [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^this.rotationAnchor =  textAnchor;^97^^^^^85^99^[REPLACE] this.rotationAnchor = rotationAnchor;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] String text TextAnchor textAnchor TextAnchor rotationAnchor double angle [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^this.angle =  null;^98^^^^^85^99^[REPLACE] this.angle = angle;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] String text TextAnchor textAnchor TextAnchor rotationAnchor double angle [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^return this.textAnchor;^107^^^^^106^108^[REPLACE] return this.text;^[METHOD] getText [TYPE] String [PARAMETER] [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^return this.text;^116^^^^^115^117^[REPLACE] return this.textAnchor;^[METHOD] getTextAnchor [TYPE] TextAnchor [PARAMETER] [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^return this.textAnchor;^126^^^^^125^127^[REPLACE] return this.rotationAnchor;^[METHOD] getRotationAnchor [TYPE] TextAnchor [PARAMETER] [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^return this.textAnchor;^135^^^^^134^136^[REPLACE] return this.angle;^[METHOD] getAngle [TYPE] double [PARAMETER] [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( t  &&  obj )  {^146^^^^^145^166^[REPLACE] if  ( this == obj )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REMOVE]^if  ( ! (  ( this.angle )  ==  ( t.angle )  )  )  {     return false; }^146^^^^^145^166^[REMOVE] ^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^147^^^^^145^166^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ! obj instanceof Tick )  {^149^^^^^145^166^[REPLACE] if  ( obj instanceof Tick )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( !  this.text, t.text    )  {^151^^^^^145^166^[REPLACE] if  ( !ObjectUtilities.equal ( this.text, t.text )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[ADD]^return false;^151^152^153^^^145^166^[ADD] if  ( !ObjectUtilities.equal ( this.text, t.text )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^152^^^^^145^166^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( !  this.textAnchor, t.textAnchor    )  {^154^^^^^145^166^[REPLACE] if  ( !ObjectUtilities.equal ( this.textAnchor, t.textAnchor )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^155^^^^^145^166^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( !  this.rotationAnchor, t.rotationAnchor    )  {^157^^^^^145^166^[REPLACE] if  ( !ObjectUtilities.equal ( this.rotationAnchor, t.rotationAnchor )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^158^^^^^145^166^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^if  (  ( this.angle ==angle )  )  {^160^^^^^145^166^[REPLACE] if  ( ! ( this.angle == t.angle )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^161^^^^^145^166^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^163^^^^^145^166^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^Tick clone =  ( Tick )  super.clone (  ) ;^150^^^^^145^166^[REPLACE] Tick t =  ( Tick )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[ADD]^^150^^^^^145^166^[ADD] Tick t =  ( Tick )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[ADD]^^151^152^153^^^145^166^[ADD] if  ( !ObjectUtilities.equal ( this.text, t.text )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[ADD]^return false;^157^158^159^^^145^166^[ADD] if  ( !ObjectUtilities.equal ( this.rotationAnchor, t.rotationAnchor )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^if  (  ( this.angle == t.angle )  )  {^160^^^^^145^166^[REPLACE] if  ( ! ( this.angle == t.angle )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[ADD]^^160^161^162^^^145^166^[ADD] if  ( ! ( this.angle == t.angle )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^165^^^^^145^166^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  Object obj  [TYPE]  Tick t  [TYPE]  String text  [TYPE]  long serialVersionUID 
[REPLACE]^Tick t =  ( Tick )  obj;^176^^^^^175^178^[REPLACE] Tick clone =  ( Tick )  super.clone (  ) ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  Tick clone  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^return this.textAnchor;^177^^^^^175^178^[REPLACE] return clone;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  Tick clone  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 
[REPLACE]^return this.textAnchor;^186^^^^^185^187^[REPLACE] return this.text;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Tick   [TYPE]  TextAnchor rotationAnchor  textAnchor  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  double angle  [TYPE]  long serialVersionUID 