[REPLACE]^f2.setRadius ( 0.2 ) ;^81^^^^^80^82^[REPLACE] super ( name ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String name [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  String name 
[REPLACE]^SimpleDialFrame f2 = new SimpleDialFrame (  ) ;^88^^^^^87^119^[REPLACE] SimpleDialFrame f1 = new SimpleDialFrame (  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^SimpleDialFrame f1 = new SimpleDialFrame (  ) ;^89^^^^^87^119^[REPLACE] SimpleDialFrame f2 = new SimpleDialFrame (  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertTrue ( f1 .getClass (  )   ) ;^90^^^^^87^119^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertTrue ( f1.setBackgroundPaint ( f2 )  ) ;^90^^^^^87^119^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^f1.setRadius ( 0.2D ) ;^93^^^^^87^119^[REPLACE] f1.setRadius ( 0.2 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertFalse ( f1.setBackgroundPaint ( f2 )  ) ;^94^^^^^87^119^[REPLACE] assertFalse ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[ADD]^^94^95^^^^87^119^[ADD] assertFalse ( f1.equals ( f2 )  ) ; f2.setRadius ( 0.2 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^f2 .equals ( f1 )  ;^95^^^^^87^119^[REPLACE] f2.setRadius ( 0.2 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[ADD]^^95^^^^^87^119^[ADD] f2.setRadius ( 0.2 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertFalse ( f1.equals ( f2 )  ) ;^96^^^^^87^119^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REMOVE]^f2.setRadius ( 0.2 ) ;^96^^^^^87^119^[REMOVE] ^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertTrue ( f1 .getClass (  )   ) ;^96^^^^^87^119^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^f1 .setForegroundPaint ( true )  ;^99^100^^^^87^119^[REPLACE] f1.setBackgroundPaint ( new GradientPaint ( 1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertTrue ( f1.equals ( f2 )  ) ;^101^^^^^87^119^[REPLACE] assertFalse ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertFalse ( f1.setBackgroundPaint ( f2 )  ) ;^101^^^^^87^119^[REPLACE] assertFalse ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REMOVE]^f2.setRadius ( 0.2 ) ;^101^^^^^87^119^[REMOVE] ^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^f2.setForegroundPaint ( new GradientPaint ( 1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow )  ) ;^102^103^^^^87^119^[REPLACE] f2.setBackgroundPaint ( new GradientPaint ( 1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertFalse ( f1.equals ( f2 )  ) ;^104^^^^^87^119^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REMOVE]^f2.setRadius ( 0.2 ) ;^104^^^^^87^119^[REMOVE] ^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertTrue ( f1 .getClass (  )   ) ;^104^^^^^87^119^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^f1.setBackgroundPaint ( new GradientPaint ( 1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.green )  ) ;^107^108^^^^87^119^[REPLACE] f1.setForegroundPaint ( new GradientPaint ( 1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.green )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertFalse ( f1.setBackgroundPaint ( f2 )  ) ;^109^^^^^87^119^[REPLACE] assertFalse ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[ADD]^^109^^^^^87^119^[ADD] assertFalse ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^f2.setBackgroundPaint ( new GradientPaint ( 1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.green )  ) ;^110^111^^^^87^119^[REPLACE] f2.setForegroundPaint ( new GradientPaint ( 1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.green )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertTrue ( f1.setBackgroundPaint ( f2 )  ) ;^112^^^^^87^119^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^f1 .setRadius ( null )  ;^115^^^^^87^119^[REPLACE] f1.setStroke ( new BasicStroke ( 2.4f )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[ADD]^assertFalse ( f1.equals ( f2 )  ) ;^115^116^^^^87^119^[ADD] f1.setStroke ( new BasicStroke ( 2.4f )  ) ; assertFalse ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertTrue ( f1.equals ( f2 )  ) ;^116^^^^^87^119^[REPLACE] assertFalse ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertFalse ( f1 .getClass (  )   ) ;^116^^^^^87^119^[REPLACE] assertFalse ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REMOVE]^f2.setRadius ( 0.2 ) ;^116^^^^^87^119^[REMOVE] ^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^f2.setBackgroundPaint ( new BasicStroke ( 2.4f )  ) ;^117^^^^^87^119^[REPLACE] f2.setStroke ( new BasicStroke ( 2.4f )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertTrue ( f1.setBackgroundPaint ( f2 )  ) ;^118^^^^^87^119^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^assertTrue ( f1 .getClass (  )   ) ;^118^^^^^87^119^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2 
[REPLACE]^SimpleDialFrame f2 = new SimpleDialFrame (  ) ;^125^^^^^124^131^[REPLACE] SimpleDialFrame f1 = new SimpleDialFrame (  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[REPLACE]^SimpleDialFrame f1 = new SimpleDialFrame (  ) ;^126^^^^^124^131^[REPLACE] SimpleDialFrame f2 = new SimpleDialFrame (  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[ADD]^assertTrue ( f1.equals ( f2 )  ) ;^126^127^^^^124^131^[ADD] SimpleDialFrame f2 = new SimpleDialFrame (  ) ; assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[REPLACE]^assertFalse ( f1.equals ( f2 )  ) ;^127^^^^^124^131^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[REMOVE]^f2.setRadius ( 0.2 ) ;^127^^^^^124^131^[REMOVE] ^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[REPLACE]^assertTrue ( f1 .getClass (  )   ) ;^127^^^^^124^131^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[REPLACE]^int h1 = f2.hashCode (  ) ;^128^^^^^124^131^[REPLACE] int h1 = f1.hashCode (  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[ADD]^int h2 = f2.hashCode (  ) ;^128^129^^^^124^131^[ADD] int h1 = f1.hashCode (  ) ; int h2 = f2.hashCode (  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[REPLACE]^int h2 = f1.hashCode (  ) ;^129^^^^^124^131^[REPLACE] int h2 = f2.hashCode (  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[ADD]^assertEquals ( h1, h2 ) ;^129^130^^^^124^131^[ADD] int h2 = f2.hashCode (  ) ; assertEquals ( h1, h2 ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[REPLACE]^assertEquals ( f1, f2 ) ;^130^^^^^124^131^[REPLACE] assertEquals ( h1, h2 ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[ADD]^^130^^^^^124^131^[ADD] assertEquals ( h1, h2 ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  int h1  h2 
[REPLACE]^SimpleDialFrame f2 = new SimpleDialFrame (  ) ;^137^^^^^136^148^[REPLACE] SimpleDialFrame f1 = new SimpleDialFrame (  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[REPLACE]^SimpleDialFrame f2 = false;^138^^^^^136^148^[REPLACE] SimpleDialFrame f2 = null;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[ADD]^^138^^^^^136^148^[ADD] SimpleDialFrame f2 = null;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[ADD]^f2 =  ( SimpleDialFrame )  f1.clone (  ) ;^139^140^141^^^136^148^[ADD] try { f2 =  ( SimpleDialFrame )  f1.clone (  ) ; }^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[REPLACE]^f2 =  ( SimpleDialFrame )  in.readObject (  ) ; ;^140^^^^^136^148^[REPLACE] f2 =  ( SimpleDialFrame )  f1.clone (  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[ADD]^^140^^^^^136^148^[ADD] f2 =  ( SimpleDialFrame )  f1.clone (  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[REPLACE]^assertTrue ( f1  ==  f2 ) ;^145^^^^^136^148^[REPLACE] assertTrue ( f1 != f2 ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[REPLACE]^assertTrue ( f1.getClass (  )   !=  f2.getClass (  )  ) ;^146^^^^^136^148^[REPLACE] assertTrue ( f1.getClass (  )  == f2.getClass (  )  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[REPLACE]^assertTrue ( f2.getClass (  )  == f2.getClass (  )  ) ;^146^^^^^136^148^[REPLACE] assertTrue ( f1.getClass (  )  == f2.getClass (  )  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[REPLACE]^assertTrue ( f1.getClass (  )  == f1.getClass (  )  ) ;^146^^^^^136^148^[REPLACE] assertTrue ( f1.getClass (  )  == f2.getClass (  )  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[REPLACE]^assertTrue ( f1.setBackgroundPaint ( f2 )  ) ;^147^^^^^136^148^[REPLACE] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[ADD]^^147^^^^^136^148^[ADD] assertTrue ( f1.equals ( f2 )  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  CloneNotSupportedException e 
[REPLACE]^SimpleDialFrame f2 = new SimpleDialFrame (  ) ;^155^^^^^154^173^[REPLACE] SimpleDialFrame f1 = new SimpleDialFrame (  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^SimpleDialFrame f2 = true;^156^^^^^154^173^[REPLACE] SimpleDialFrame f2 = null;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[ADD]^ByteArrayOutputStream buffer = new ByteArrayOutputStream (  ) ;ObjectOutput out = new ObjectOutputStream ( buffer ) ;out.writeObject ( f1 ) ;out.close (  ) ;^158^159^160^161^162^154^173^[ADD] try { ByteArrayOutputStream buffer = new ByteArrayOutputStream (  ) ; ObjectOutput out = new ObjectOutputStream ( buffer ) ; out.writeObject ( f1 ) ; out.close (  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^f2 =  ( SimpleDialFrame )  f1.clone (  ) ; ;^166^^^^^154^173^[REPLACE] f2 =  ( SimpleDialFrame )  in.readObject (  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^ObjectOutput out = new ObjectOutputStream ( buffer ) ;^159^^^^^154^173^[REPLACE] ByteArrayOutputStream buffer = new ByteArrayOutputStream (  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^ByteArrayOutputStream buffer = new ByteArrayOutputStream (  ) ;^160^^^^^154^173^[REPLACE] ObjectOutput out = new ObjectOutputStream ( buffer ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^ObjectInput in = new ObjectInputStream ( new ByteArrayInputStream ( buffer.ByteArrayOutputStream (  )  )  ) ;^164^165^^^^154^173^[REPLACE] ObjectInput in = new ObjectInputStream ( new ByteArrayInputStream ( buffer.toByteArray (  )  )  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[ADD]^^169^170^^^^154^173^[ADD] catch  ( Exception e )  { e.printStackTrace (  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^assertEquals ( h1, h2 ) ;^172^^^^^154^173^[REPLACE] assertEquals ( f1, f2 ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] SimpleDialFrameTests   [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  SimpleDialFrame f1  f2  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 