[REPLACE]^if  ( ! annotation instanceof Mock || annotation instanceof org.mockito.MockitoAnnotations.Mock )  {^27^^^^^26^32^[REPLACE] if  ( annotation instanceof Mock || annotation instanceof org.mockito.MockitoAnnotations.Mock )  {^[METHOD] createMockFor [TYPE] Object [PARAMETER] Annotation annotation Field field [CLASS] DefaultAnnotationEngine   [TYPE]  Field field  [TYPE]  boolean false  true  [TYPE]  Annotation annotation 
[REPLACE]^return true;^30^^^^^26^32^[REPLACE] return null;^[METHOD] createMockFor [TYPE] Object [PARAMETER] Annotation annotation Field field [CLASS] DefaultAnnotationEngine   [TYPE]  Field field  [TYPE]  boolean false  true  [TYPE]  Annotation annotation 
[REPLACE]^return Mockito.mock ( field.getType (  ) , field .getType (  )   ) ;^28^^^^^26^32^[REPLACE] return Mockito.mock ( field.getType (  ) , field.getName (  )  ) ;^[METHOD] createMockFor [TYPE] Object [PARAMETER] Annotation annotation Field field [CLASS] DefaultAnnotationEngine   [TYPE]  Field field  [TYPE]  boolean false  true  [TYPE]  Annotation annotation 
[REPLACE]^return   field.getType (  )   ) ;^28^^^^^26^32^[REPLACE] return Mockito.mock ( field.getType (  ) , field.getName (  )  ) ;^[METHOD] createMockFor [TYPE] Object [PARAMETER] Annotation annotation Field field [CLASS] DefaultAnnotationEngine   [TYPE]  Field field  [TYPE]  boolean false  true  [TYPE]  Annotation annotation 
[REPLACE]^return false;^30^^^^^26^32^[REPLACE] return null;^[METHOD] createMockFor [TYPE] Object [PARAMETER] Annotation annotation Field field [CLASS] DefaultAnnotationEngine   [TYPE]  Field field  [TYPE]  boolean false  true  [TYPE]  Annotation annotation 