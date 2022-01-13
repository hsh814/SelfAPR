[REPLACE]^protected HashMap<Class<?>,Object _annotations;^16^^^^^^^[REPLACE] protected HashMap<Class<?>,Annotation> _annotations;^ [CLASS] AnnotationMap  
[REPLACE]^if  ( primary != false || primary._annotations == false || primary._annotations.isEmpty (  )  )  {^71^^^^^70^87^[REPLACE] if  ( primary == null || primary._annotations == null || primary._annotations.isEmpty (  )  )  {^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[ADD]^return secondary;^71^72^73^^^70^87^[ADD] if  ( primary == null || primary._annotations == null || primary._annotations.isEmpty (  )  )  { return secondary; }^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[REPLACE]^return primary;^72^^^^^70^87^[REPLACE] return secondary;^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[REPLACE]^if  ( secondary != null || secondary._annotations == null || secondary._annotations.isEmpty (  )  )  {^74^^^^^70^87^[REPLACE] if  ( secondary == null || secondary._annotations == null || secondary._annotations.isEmpty (  )  )  {^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[REPLACE]^return secondary;^75^^^^^70^87^[REPLACE] return primary;^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[ADD]^^79^80^81^^^70^87^[ADD] for  ( Annotation ann : secondary._annotations.values (  )  )  { annotations.put ( ann.annotationType (  ) , ann ) ; }^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[REPLACE]^( _annotations.containsKey ( ann.annotationType (  )  )  )  ;^80^^^^^70^87^[REPLACE] annotations.put ( ann.annotationType (  ) , ann ) ;^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[REMOVE]^(  ( A )   ( _annotations.get ( cls )  )  )  ;^80^^^^^70^87^[REMOVE] ^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[REPLACE]^annotations.put ( ann .equals ( null )  , ann ) ;^80^^^^^70^87^[REPLACE] annotations.put ( ann.annotationType (  ) , ann ) ;^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[ADD]^^80^^^^^70^87^[ADD] annotations.put ( ann.annotationType (  ) , ann ) ;^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[ADD]^^83^84^85^^^70^87^[ADD] for  ( Annotation ann : primary._annotations.values (  )  )  { annotations.put ( ann.annotationType (  ) , ann ) ; }^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[REPLACE]^annotations.get ( ann.annotationType (  ) , ann ) ;^84^^^^^70^87^[REPLACE] annotations.put ( ann.annotationType (  ) , ann ) ;^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[REPLACE]^annotations.put ( ann .equals ( true )  , ann ) ;^84^^^^^70^87^[REPLACE] annotations.put ( ann.annotationType (  ) , ann ) ;^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 
[REPLACE]^return new AnnotationMap ( false ) ;^86^^^^^70^87^[REPLACE] return new AnnotationMap ( annotations ) ;^[METHOD] merge [TYPE] AnnotationMap [PARAMETER] AnnotationMap primary AnnotationMap secondary [CLASS] AnnotationMap   [TYPE]  boolean false  true  [TYPE]  AnnotationMap primary  secondary  [TYPE]  HashMap _annotations  a  annotations  [TYPE]  Annotation ann 