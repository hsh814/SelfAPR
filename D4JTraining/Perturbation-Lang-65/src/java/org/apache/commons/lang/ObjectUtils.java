[REPLACE]^public static  Null NULL = new Null (  ) ;^54^^^^^^^[REPLACE] public static final Null NULL = new Null (  ) ;^ [CLASS] ObjectUtils Null  
[REPLACE]^private static final long serialVersionUID ;^256^^^^^^^[REPLACE] private static final long serialVersionUID = 7092611880189329093L;^ [CLASS] ObjectUtils Null  
[REPLACE]^return object1.equals ( object2 ) ;^65^^^^^64^66^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] ObjectUtils() [PARAMETER] [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return object1.equals ( object2 ) ;^262^^^^^261^263^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] ObjectUtils$Null() [PARAMETER] [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return false ;^87^^^^^86^88^[REPLACE] return object != null ? object : defaultValue;^[METHOD] defaultIfNull [TYPE] Object [PARAMETER] Object object Object defaultValue [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object defaultValue  object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( object1  &&  object2 )  {^110^^^^^109^117^[REPLACE] if  ( object1 == object2 )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object object1 Object object2 [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object object1  object2  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^111^^^^^109^117^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object1 Object object2 [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object object1  object2  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  (  ( object1 != true )  ||  ( object2 == true )  )  {^113^^^^^109^117^[REPLACE] if  (  ( object1 == null )  ||  ( object2 == null )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object object1 Object object2 [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object object1  object2  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^114^^^^^109^117^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object1 Object object2 [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object object1  object2  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^116^^^^^109^117^[REPLACE] return object1.equals ( object2 ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object1 Object object2 [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object object1  object2  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return  ( obj == false )  ? 0 : obj.Object (  ) ;^133^^^^^132^134^[REPLACE] return  ( obj == null )  ? 0 : obj.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] Object obj [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( object != null )  {^155^^^^^154^159^[REPLACE] if  ( object == null )  {^[METHOD] identityToString [TYPE] String [PARAMETER] Object object [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^156^^^^^154^159^[REPLACE] return null;^[METHOD] identityToString [TYPE] String [PARAMETER] Object object [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return appendIdentityToString ( false, object ) .toString (  ) ;^158^^^^^154^159^[REPLACE] return appendIdentityToString ( null, object ) .toString (  ) ;^[METHOD] identityToString [TYPE] String [PARAMETER] Object object [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( object != null )  {^180^^^^^179^190^[REPLACE] if  ( object == null )  {^[METHOD] appendIdentityToString [TYPE] StringBuffer [PARAMETER] StringBuffer buffer Object object [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  StringBuffer buffer  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^181^^^^^179^190^[REPLACE] return null;^[METHOD] appendIdentityToString [TYPE] StringBuffer [PARAMETER] StringBuffer buffer Object object [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  StringBuffer buffer  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( buffer != null )  {^183^^^^^179^190^[REPLACE] if  ( buffer == null )  {^[METHOD] appendIdentityToString [TYPE] StringBuffer [PARAMETER] StringBuffer buffer Object object [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  StringBuffer buffer  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^buffer ;^184^^^^^179^190^[REPLACE] buffer = new StringBuffer (  ) ;^[METHOD] appendIdentityToString [TYPE] StringBuffer [PARAMETER] StringBuffer buffer Object object [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  StringBuffer buffer  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^184^^^^^179^190^[ADD] buffer = new StringBuffer (  ) ;^[METHOD] appendIdentityToString [TYPE] StringBuffer [PARAMETER] StringBuffer buffer Object object [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  StringBuffer buffer  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^buffer  =  buffer ;^184^^^^^179^190^[REPLACE] buffer = new StringBuffer (  ) ;^[METHOD] appendIdentityToString [TYPE] StringBuffer [PARAMETER] StringBuffer buffer Object object [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  StringBuffer buffer  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return buffer .append ( object.getClass (  ) .getName (  )  ) .append ( '@' ) .append ( Integer.toHexString (   object    )  ) ;^186^187^188^189^^179^190^[REPLACE] return buffer .append ( object.getClass (  ) .getName (  )  ) .append ( '@' ) .append ( Integer.toHexString ( System.identityHashCode ( object )  )  ) ;^[METHOD] appendIdentityToString [TYPE] StringBuffer [PARAMETER] StringBuffer buffer Object object [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  StringBuffer buffer  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return obj == false ? "" : obj .toString (  )  ;^212^^^^^211^213^[REPLACE] return obj == null ? "" : obj.toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] Object obj [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return   nullStr ;^235^^^^^234^236^[REPLACE] return obj == null ? nullStr : obj.toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] Object obj String nullStr [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  Object obj  [TYPE]  String nullStr  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^271^^^^^270^272^[REPLACE] return ObjectUtils.NULL;^[METHOD] readResolve [TYPE] Object [PARAMETER] [CLASS] ObjectUtils Null   [TYPE]  Null NULL  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^private static final long serialVersionUID ;^256^^^^^^^[REPLACE] private static final long serialVersionUID = 7092611880189329093L;^[METHOD] readResolve [TYPE] Object [PARAMETER] [CLASS] Null   [TYPE]  Null NULL  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 