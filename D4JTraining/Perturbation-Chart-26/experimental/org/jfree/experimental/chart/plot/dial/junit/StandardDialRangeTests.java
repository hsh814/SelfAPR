[REPLACE]^assertTrue ( r1 != r2 ) ;^80^^^^^79^81^[REPLACE] super ( name ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String name [CLASS] StandardDialRangeTests   [TYPE]  boolean false  true  [TYPE]  String name 
[REPLACE]^StandardDialRange r2 = new StandardDialRange (  ) ;^87^^^^^86^117^[REPLACE] StandardDialRange r1 = new StandardDialRange (  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[ADD]^^87^^^^^86^117^[ADD] StandardDialRange r1 = new StandardDialRange (  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^StandardDialRange r1 = new StandardDialRange (  ) ;^88^^^^^86^117^[REPLACE] StandardDialRange r2 = new StandardDialRange (  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertTrue ( r1 .getClass (  )   ) ;^89^^^^^86^117^[REPLACE] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertTrue ( r1.setPaint ( r2 )  ) ;^89^^^^^86^117^[REPLACE] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^r1 .setUpperBound ( this )  ;^92^^^^^86^117^[REPLACE] r1.setLowerBound ( 1.1 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[ADD]^^92^^^^^86^117^[ADD] r1.setLowerBound ( 1.1 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertTrue ( r1.equals ( r2 )  ) ;^93^^^^^86^117^[REPLACE] assertFalse ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[ADD]^^93^^^^^86^117^[ADD] assertFalse ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertFalse ( r1.setPaint ( r2 )  ) ;^93^^^^^86^117^[REPLACE] assertFalse ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[ADD]^r2.setLowerBound ( 1.1 ) ;^93^94^^^^86^117^[ADD] assertFalse ( r1.equals ( r2 )  ) ; r2.setLowerBound ( 1.1 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^r2.setLowerBound ( 2.0d ) ;^94^^^^^86^117^[REPLACE] r2.setLowerBound ( 1.1 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[ADD]^^94^^^^^86^117^[ADD] r2.setLowerBound ( 1.1 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertTrue ( r1.setPaint ( r2 )  ) ;^95^^^^^86^117^[REPLACE] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[ADD]^^95^^^^^86^117^[ADD] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^r1.setLowerBound ( 11.1D ) ;^98^^^^^86^117^[REPLACE] r1.setUpperBound ( 11.1 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertFalse ( r1.setPaint ( r2 )  ) ;^99^^^^^86^117^[REPLACE] assertFalse ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^r2.setLowerBound ( 0.0d ) ;^100^^^^^86^117^[REPLACE] r2.setUpperBound ( 11.1 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertTrue ( r1.setPaint ( r2 )  ) ;^101^^^^^86^117^[REPLACE] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^r1.setLowerBound ( 2.0d ) ;^104^^^^^86^117^[REPLACE] r1.setIncrement ( 1.5 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[ADD]^^104^105^^^^86^117^[ADD] r1.setIncrement ( 1.5 ) ; assertFalse ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertTrue ( r1.equals ( r2 )  ) ;^105^^^^^86^117^[REPLACE] assertFalse ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[ADD]^^105^^^^^86^117^[ADD] assertFalse ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertFalse ( r1 .getClass (  )   ) ;^105^^^^^86^117^[REPLACE] assertFalse ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^r2.setIncrement ( 0.0d ) ;^106^^^^^86^117^[REPLACE] r2.setIncrement ( 1.5 ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertFalse ( r1.equals ( r2 )  ) ;^107^^^^^86^117^[REPLACE] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertTrue ( r1.setPaint ( r2 )  ) ;^107^^^^^86^117^[REPLACE] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REMOVE]^assertTrue ( r1 != r2 ) ;^107^^^^^86^117^[REMOVE] ^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^r1.setIncrement ( new GradientPaint ( 1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue )  ) ;^110^111^^^^86^117^[REPLACE] r1.setPaint ( new GradientPaint ( 1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertFalse ( r1.setPaint ( r2 )  ) ;^112^^^^^86^117^[REPLACE] assertFalse ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^r2.setIncrement ( new GradientPaint ( 1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue )  ) ;^113^114^^^^86^117^[REPLACE] r2.setPaint ( new GradientPaint ( 1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[ADD]^^113^114^^^^86^117^[ADD] r2.setPaint ( new GradientPaint ( 1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^assertTrue ( r1 .getClass (  )   ) ;^115^^^^^86^117^[REPLACE] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REMOVE]^assertTrue ( r1 != r2 ) ;^115^^^^^86^117^[REMOVE] ^[METHOD] testEquals [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true 
[REPLACE]^StandardDialRange r2 = new StandardDialRange (  ) ;^123^^^^^122^129^[REPLACE] StandardDialRange r1 = new StandardDialRange (  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  int h1  h2 
[REPLACE]^StandardDialRange r1 = new StandardDialRange (  ) ;^124^^^^^122^129^[REPLACE] StandardDialRange r2 = new StandardDialRange (  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  int h1  h2 
[REPLACE]^assertTrue ( r1 .getClass (  )   ) ;^125^^^^^122^129^[REPLACE] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  int h1  h2 
[REPLACE]^assertTrue ( r1.setPaint ( r2 )  ) ;^125^^^^^122^129^[REPLACE] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  int h1  h2 
[ADD]^int h1 = r1.hashCode (  ) ;^125^126^^^^122^129^[ADD] assertTrue ( r1.equals ( r2 )  ) ; int h1 = r1.hashCode (  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  int h1  h2 
[REPLACE]^int h1 = r2.clone (  ) ;^126^^^^^122^129^[REPLACE] int h1 = r1.hashCode (  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  int h1  h2 
[REPLACE]^int h2 = r1.hashCode (  ) ;^127^^^^^122^129^[REPLACE] int h2 = r2.hashCode (  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  int h1  h2 
[ADD]^^127^^^^^122^129^[ADD] int h2 = r2.hashCode (  ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  int h1  h2 
[REPLACE]^assertEquals ( r1, r2 ) ;^128^^^^^122^129^[REPLACE] assertEquals ( h1, h2 ) ;^[METHOD] testHashCode [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  int h1  h2 
[REPLACE]^StandardDialRange r2 = new StandardDialRange (  ) ;^135^^^^^134^146^[REPLACE] StandardDialRange r1 = new StandardDialRange (  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  CloneNotSupportedException e 
[REPLACE]^StandardDialRange r2 = true;^136^^^^^134^146^[REPLACE] StandardDialRange r2 = null;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  CloneNotSupportedException e 
[ADD]^r2 =  ( StandardDialRange )  r1.clone (  ) ;^137^138^139^^^134^146^[ADD] try { r2 =  ( StandardDialRange )  r1.clone (  ) ; }^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  CloneNotSupportedException e 
[REPLACE]^r2 =  ( StandardDialRange )  in.readObject (  ) ; ;^138^^^^^134^146^[REPLACE] r2 =  ( StandardDialRange )  r1.clone (  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  CloneNotSupportedException e 
[ADD]^^138^^^^^134^146^[ADD] r2 =  ( StandardDialRange )  r1.clone (  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  CloneNotSupportedException e 
[REPLACE]^assertTrue ( r1  ==  r2 ) ;^143^^^^^134^146^[REPLACE] assertTrue ( r1 != r2 ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  CloneNotSupportedException e 
[REPLACE]^assertTrue ( r1.getClass (  )   ||  r2.getClass (  )  ) ;^144^^^^^134^146^[REPLACE] assertTrue ( r1.getClass (  )  == r2.getClass (  )  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  CloneNotSupportedException e 
[REPLACE]^assertTrue ( r2.getClass (  )  == r2.getClass (  )  ) ;^144^^^^^134^146^[REPLACE] assertTrue ( r1.getClass (  )  == r2.getClass (  )  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  CloneNotSupportedException e 
[REPLACE]^assertTrue ( r1.setIncrement (  )  == r1.getClass (  )  ) ;^144^^^^^134^146^[REPLACE] assertTrue ( r1.getClass (  )  == r2.getClass (  )  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  CloneNotSupportedException e 
[REPLACE]^assertTrue ( r1.setPaint ( r2 )  ) ;^145^^^^^134^146^[REPLACE] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  CloneNotSupportedException e 
[ADD]^^145^^^^^134^146^[ADD] assertTrue ( r1.equals ( r2 )  ) ;^[METHOD] testCloning [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  CloneNotSupportedException e 
[REPLACE]^StandardDialRange r2 = new StandardDialRange (  ) ;^153^^^^^152^171^[REPLACE] StandardDialRange r1 = new StandardDialRange (  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^StandardDialRange r2 = true;^154^^^^^152^171^[REPLACE] StandardDialRange r2 = null;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[ADD]^ByteArrayOutputStream buffer = new ByteArrayOutputStream (  ) ;ObjectOutput out = new ObjectOutputStream ( buffer ) ;out.writeObject ( r1 ) ;out.close (  ) ;^156^157^158^159^160^152^171^[ADD] try { ByteArrayOutputStream buffer = new ByteArrayOutputStream (  ) ; ObjectOutput out = new ObjectOutputStream ( buffer ) ; out.writeObject ( r1 ) ; out.close (  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^r2 =  ( StandardDialRange )  r1.clone (  ) ; ;^164^^^^^152^171^[REPLACE] r2 =  ( StandardDialRange )  in.readObject (  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^ObjectOutput out = new ObjectOutputStream ( buffer ) ;^157^^^^^152^171^[REPLACE] ByteArrayOutputStream buffer = new ByteArrayOutputStream (  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^ByteArrayOutputStream buffer = new ByteArrayOutputStream (  ) ;^158^^^^^152^171^[REPLACE] ObjectOutput out = new ObjectOutputStream ( buffer ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[ADD]^^158^159^^^^152^171^[ADD] ObjectOutput out = new ObjectOutputStream ( buffer ) ; out.writeObject ( r1 ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^ObjectInput in = new ObjectInputStream ( new ByteArrayInputStream ( buffer.ByteArrayOutputStream (  )  )  ) ;^162^163^^^^152^171^[REPLACE] ObjectInput in = new ObjectInputStream ( new ByteArrayInputStream ( buffer.toByteArray (  )  )  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[ADD]^^162^163^^^^152^171^[ADD] ObjectInput in = new ObjectInputStream ( new ByteArrayInputStream ( buffer.toByteArray (  )  )  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[ADD]^^167^168^^^^152^171^[ADD] catch  ( Exception e )  { e.printStackTrace (  ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REPLACE]^assertEquals ( h1, h2 ) ;^170^^^^^152^171^[REPLACE] assertEquals ( r1, r2 ) ;^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 
[REMOVE]^assertTrue ( r1 != r2 ) ;^170^^^^^152^171^[REMOVE] ^[METHOD] testSerialization [TYPE] void [PARAMETER] [CLASS] StandardDialRangeTests   [TYPE]  StandardDialRange r1  r2  [TYPE]  boolean false  true  [TYPE]  ObjectOutput out  [TYPE]  ByteArrayOutputStream buffer  [TYPE]  ObjectInput in  [TYPE]  Exception e 