[buglab_swap_variables]^set ( shape, index ) ;^81^^^^^80^82^set ( index, shape ) ;^[CLASS] ShapeList  [METHOD] setShape [RETURN_TYPE] void   int index Shape shape [VARIABLES] Shape  shape  boolean  int  index  
[buglab_swap_variables]^set (  shape ) ;^81^^^^^80^82^set ( index, shape ) ;^[CLASS] ShapeList  [METHOD] setShape [RETURN_TYPE] void   int index Shape shape [VARIABLES] Shape  shape  boolean  int  index  
[buglab_swap_variables]^set ( index ) ;^81^^^^^80^82^set ( index, shape ) ;^[CLASS] ShapeList  [METHOD] setShape [RETURN_TYPE] void   int index Shape shape [VARIABLES] Shape  shape  boolean  int  index  
[buglab_swap_variables]^SerialUtilities.writeShape ( stream, shape ) ;^145^^^^^136^152^SerialUtilities.writeShape ( shape, stream ) ;^[CLASS] ShapeList  [METHOD] writeObject [RETURN_TYPE] void   ObjectOutputStream stream [VARIABLES] Shape  shape  boolean  ObjectOutputStream  stream  int  count  i  
[buglab_swap_variables]^SerialUtilities.writeShape (  stream ) ;^145^^^^^136^152^SerialUtilities.writeShape ( shape, stream ) ;^[CLASS] ShapeList  [METHOD] writeObject [RETURN_TYPE] void   ObjectOutputStream stream [VARIABLES] Shape  shape  boolean  ObjectOutputStream  stream  int  count  i  
[buglab_swap_variables]^SerialUtilities.writeShape ( shape ) ;^145^^^^^136^152^SerialUtilities.writeShape ( shape, stream ) ;^[CLASS] ShapeList  [METHOD] writeObject [RETURN_TYPE] void   ObjectOutputStream stream [VARIABLES] Shape  shape  boolean  ObjectOutputStream  stream  int  count  i  
[buglab_swap_variables]^for  ( countnt i = 0; i < i; i++ )  {^141^^^^^136^152^for  ( int i = 0; i < count; i++ )  {^[CLASS] ShapeList  [METHOD] writeObject [RETURN_TYPE] void   ObjectOutputStream stream [VARIABLES] Shape  shape  boolean  ObjectOutputStream  stream  int  count  i  
[buglab_swap_variables]^setShape ( stream, SerialUtilities.readShape ( index )  ) ;^170^^^^^162^174^setShape ( index, SerialUtilities.readShape ( stream )  ) ;^[CLASS] ShapeList  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream stream [VARIABLES] boolean  int  count  i  index  ObjectInputStream  stream  
[buglab_swap_variables]^setShape (  SerialUtilities.readShape ( stream )  ) ;^170^^^^^162^174^setShape ( index, SerialUtilities.readShape ( stream )  ) ;^[CLASS] ShapeList  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream stream [VARIABLES] boolean  int  count  i  index  ObjectInputStream  stream  
[buglab_swap_variables]^for  ( countnt i = 0; i < i; i++ )  {^167^^^^^162^174^for  ( int i = 0; i < count; i++ )  {^[CLASS] ShapeList  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream stream [VARIABLES] boolean  int  count  i  index  ObjectInputStream  stream  