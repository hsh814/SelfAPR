[P5_Replace_Variable]^super (  toolTipText, urlText ) ;^69^^^^^67^71^super ( area, toolTipText, urlText ) ;^[CLASS] CategoryLabelEntity  [METHOD] <init> [RETURN_TYPE] String)   Comparable key Shape area String toolTipText String urlText [VARIABLES] Comparable  key  Shape  area  String  toolTipText  urlText  boolean  
[P5_Replace_Variable]^super ( area,  urlText ) ;^69^^^^^67^71^super ( area, toolTipText, urlText ) ;^[CLASS] CategoryLabelEntity  [METHOD] <init> [RETURN_TYPE] String)   Comparable key Shape area String toolTipText String urlText [VARIABLES] Comparable  key  Shape  area  String  toolTipText  urlText  boolean  
[P5_Replace_Variable]^super ( area, toolTipText ) ;^69^^^^^67^71^super ( area, toolTipText, urlText ) ;^[CLASS] CategoryLabelEntity  [METHOD] <init> [RETURN_TYPE] String)   Comparable key Shape area String toolTipText String urlText [VARIABLES] Comparable  key  Shape  area  String  toolTipText  urlText  boolean  
[P5_Replace_Variable]^super ( toolTipText, area, urlText ) ;^69^^^^^67^71^super ( area, toolTipText, urlText ) ;^[CLASS] CategoryLabelEntity  [METHOD] <init> [RETURN_TYPE] String)   Comparable key Shape area String toolTipText String urlText [VARIABLES] Comparable  key  Shape  area  String  toolTipText  urlText  boolean  
[P5_Replace_Variable]^super ( area, urlText, toolTipText ) ;^69^^^^^67^71^super ( area, toolTipText, urlText ) ;^[CLASS] CategoryLabelEntity  [METHOD] <init> [RETURN_TYPE] String)   Comparable key Shape area String toolTipText String urlText [VARIABLES] Comparable  key  Shape  area  String  toolTipText  urlText  boolean  
[P14_Delete_Statement]^^69^70^^^^67^71^super ( area, toolTipText, urlText ) ; this.key = key;^[CLASS] CategoryLabelEntity  [METHOD] <init> [RETURN_TYPE] String)   Comparable key Shape area String toolTipText String urlText [VARIABLES] Comparable  key  Shape  area  String  toolTipText  urlText  boolean  
[P8_Replace_Mix]^this.key =  null;^70^^^^^67^71^this.key = key;^[CLASS] CategoryLabelEntity  [METHOD] <init> [RETURN_TYPE] String)   Comparable key Shape area String toolTipText String urlText [VARIABLES] Comparable  key  Shape  area  String  toolTipText  urlText  boolean  
[P5_Replace_Variable]^return key;^79^^^^^78^80^return this.key;^[CLASS] CategoryLabelEntity  [METHOD] getKey [RETURN_TYPE] Comparable   [VARIABLES] Comparable  key  boolean  
[P3_Replace_Literal]^StringBuffer buf = new StringBuffer ( "CategoryLabelEntity: yLab" ) ;^89^^^^^88^95^StringBuffer buf = new StringBuffer ( "CategoryLabelEntity: " ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P3_Replace_Literal]^buf.append ( "ateategory=" ) ;^90^^^^^88^95^buf.append ( "category=" ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P14_Delete_Statement]^^90^91^^^^88^95^buf.append ( "category=" ) ; buf.append ( this.key ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P11_Insert_Donor_Statement]^buf.append ( this.key ) ;buf.append ( "category=" ) ;^90^^^^^88^95^buf.append ( "category=" ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P5_Replace_Variable]^buf.append ( key ) ;^91^^^^^88^95^buf.append ( this.key ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P7_Replace_Invocation]^buf .toString (  )  ;^91^^^^^88^95^buf.append ( this.key ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P14_Delete_Statement]^^91^92^^^^88^95^buf.append ( this.key ) ; buf.append ( ", tooltip=" + getToolTipText (  )  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P11_Insert_Donor_Statement]^buf.append ( "category=" ) ;buf.append ( this.key ) ;^91^^^^^88^95^buf.append ( this.key ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P2_Replace_Operator]^buf.append ( ", tooltip="  &  getToolTipText (  )  ) ;^92^^^^^88^95^buf.append ( ", tooltip=" + getToolTipText (  )  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P3_Replace_Literal]^buf.append ( "  tooltip=" + getToolTipText (  )  ) ;^92^^^^^88^95^buf.append ( ", tooltip=" + getToolTipText (  )  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P7_Replace_Invocation]^buf.append ( ", tooltip=" + getURLText (  )  ) ;^92^^^^^88^95^buf.append ( ", tooltip=" + getToolTipText (  )  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P14_Delete_Statement]^^92^^^^^88^95^buf.append ( ", tooltip=" + getToolTipText (  )  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P11_Insert_Donor_Statement]^buf.append ( ", url=" + getURLText (  )  ) ;buf.append ( ", tooltip=" + getToolTipText (  )  ) ;^92^^^^^88^95^buf.append ( ", tooltip=" + getToolTipText (  )  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P2_Replace_Operator]^buf.append ( ", url="  >=  getURLText (  )  ) ;^93^^^^^88^95^buf.append ( ", url=" + getURLText (  )  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P3_Replace_Literal]^buf.append ( ",  url=" + getURLText (  )  ) ;^93^^^^^88^95^buf.append ( ", url=" + getURLText (  )  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P14_Delete_Statement]^^93^^^^^88^95^buf.append ( ", url=" + getURLText (  )  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P11_Insert_Donor_Statement]^buf.append ( ", tooltip=" + getToolTipText (  )  ) ;buf.append ( ", url=" + getURLText (  )  ) ;^93^^^^^88^95^buf.append ( ", url=" + getURLText (  )  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P14_Delete_Statement]^^93^94^^^^88^95^buf.append ( ", url=" + getURLText (  )  ) ; return buf.toString (  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P7_Replace_Invocation]^return buf.append (  ) ;^94^^^^^88^95^return buf.toString (  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  
[P14_Delete_Statement]^^94^^^^^88^95^return buf.toString (  ) ;^[CLASS] CategoryLabelEntity  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  StringBuffer  buf  boolean  