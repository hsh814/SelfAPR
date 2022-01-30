[REPLACE]^if  ( !ObjectUtilities.equal ( this.labelAnchor, that.labelAnchor )  )  { return false;^81^^^^^75^86^[REPLACE] super ( "", TextAnchor.CENTER, rotationAnchor, angle ) ;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] Comparable category TextBlock label TextBlockAnchor labelAnchor TextAnchor rotationAnchor double angle [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextAnchor rotationAnchor  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  double angle 
[ADD]^^81^^^^^75^86^[ADD] super ( "", TextAnchor.CENTER, rotationAnchor, angle ) ;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] Comparable category TextBlock label TextBlockAnchor labelAnchor TextAnchor rotationAnchor double angle [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextAnchor rotationAnchor  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  double angle 
[REPLACE]^this.category =  null;^82^^^^^75^86^[REPLACE] this.category = category;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] Comparable category TextBlock label TextBlockAnchor labelAnchor TextAnchor rotationAnchor double angle [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextAnchor rotationAnchor  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  double angle 
[ADD]^^82^83^^^^75^86^[ADD] this.category = category; this.label = label;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] Comparable category TextBlock label TextBlockAnchor labelAnchor TextAnchor rotationAnchor double angle [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextAnchor rotationAnchor  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  double angle 
[REPLACE]^this.label =  null;^83^^^^^75^86^[REPLACE] this.label = label;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] Comparable category TextBlock label TextBlockAnchor labelAnchor TextAnchor rotationAnchor double angle [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextAnchor rotationAnchor  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  double angle 
[ADD]^this.labelAnchor = labelAnchor;^83^84^^^^75^86^[ADD] this.label = label; this.labelAnchor = labelAnchor;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] Comparable category TextBlock label TextBlockAnchor labelAnchor TextAnchor rotationAnchor double angle [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextAnchor rotationAnchor  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  double angle 
[REPLACE]^this.labelAnchor =  null;^84^^^^^75^86^[REPLACE] this.labelAnchor = labelAnchor;^[METHOD] <init> [TYPE] TextAnchor,double) [PARAMETER] Comparable category TextBlock label TextBlockAnchor labelAnchor TextAnchor rotationAnchor double angle [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextAnchor rotationAnchor  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  double angle 
[REPLACE]^return this.labelAnchor;^94^^^^^93^95^[REPLACE] return this.category;^[METHOD] getCategory [TYPE] Comparable [PARAMETER] [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^return this.labelAnchor;^103^^^^^102^104^[REPLACE] return this.label;^[METHOD] getLabel [TYPE] TextBlock [PARAMETER] [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^return false;^112^^^^^111^113^[REPLACE] return this.labelAnchor;^[METHOD] getLabelAnchor [TYPE] TextBlockAnchor [PARAMETER] [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^if  ( this  ||  obj )  {^123^^^^^122^140^[REPLACE] if  ( this == obj )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[ADD]^return true;^123^124^125^^^122^140^[ADD] if  ( this == obj )  { return true; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^return false;^124^^^^^122^140^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^if  ( ! obj instanceof CategoryTick && super.equals ( obj )  )  {^126^^^^^122^140^[REPLACE] if  ( obj instanceof CategoryTick && super.equals ( obj )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^if  ( !  this.category, that.category    )  {^128^^^^^122^140^[REPLACE] if  ( !ObjectUtilities.equal ( this.category, that.category )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^return true;^129^^^^^122^140^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^if  ( !  this.label, that.label    )  {^131^^^^^122^140^[REPLACE] if  ( !ObjectUtilities.equal ( this.label, that.label )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^return true;^132^^^^^122^140^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^if  ( !  this.labelAnchor, that.labelAnchor    )  {^134^^^^^122^140^[REPLACE] if  ( !ObjectUtilities.equal ( this.labelAnchor, that.labelAnchor )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^return true;^135^^^^^122^140^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^return false;^137^^^^^122^140^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^int result = 41;^127^^^^^122^140^[REPLACE] CategoryTick that =  ( CategoryTick )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[ADD]^^127^^^^^122^140^[ADD] CategoryTick that =  ( CategoryTick )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^if  ( !ObjectUtilities .equal ( category , category )   )  {^128^^^^^122^140^[REPLACE] if  ( !ObjectUtilities.equal ( this.category, that.category )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[ADD]^return false;^134^135^136^^^122^140^[ADD] if  ( !ObjectUtilities.equal ( this.labelAnchor, that.labelAnchor )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^return true;^139^^^^^122^140^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CategoryTick   [TYPE]  CategoryTick that  [TYPE]  Comparable category  [TYPE]  Object obj  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label 
[REPLACE]^int result = 18;^148^^^^^147^153^[REPLACE] int result = 41;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  int result 
[REPLACE]^result = 37 * result + this.labelAnchor.hashCode (  ) ; ;^149^^^^^147^153^[REPLACE] result = 37 * result + this.category.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  int result 
[REPLACE]^result = 37 * result + this.labelAnchor.hashCode (  ) ; ;^150^^^^^147^153^[REPLACE] result = 37 * result + this.label.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  int result 
[REPLACE]^result = 37L * result  >  this.labelAnchor.hashCode (  ) ;^151^^^^^147^153^[REPLACE] result = 37 * result + this.labelAnchor.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  int result 
[ADD]^^151^152^^^^147^153^[ADD] result = 37 * result + this.labelAnchor.hashCode (  ) ; return result;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  int result 
[REPLACE]^return this.labelAnchor;^152^^^^^147^153^[REPLACE] return result;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] CategoryTick   [TYPE]  Comparable category  [TYPE]  TextBlockAnchor labelAnchor  [TYPE]  boolean false  true  [TYPE]  TextBlock label  [TYPE]  int result 