[REPLACE]^this.data  =  this.data ;^70^^^^^69^71^[REPLACE] this.data = new java.util.ArrayList (  ) ;^[METHOD] <init> [TYPE] XIntervalSeriesCollection() [PARAMETER] [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true 
[REPLACE]^if  ( series != null )  {^80^^^^^79^86^[REPLACE] if  ( series == null )  {^[METHOD] addSeries [TYPE] void [PARAMETER] XIntervalSeries series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  XIntervalSeries series  [TYPE]  boolean false  true 
[ADD]^^80^81^82^^^79^86^[ADD] if  ( series == null )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] addSeries [TYPE] void [PARAMETER] XIntervalSeries series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  XIntervalSeries series  [TYPE]  boolean false  true 
[REPLACE]^return ;^81^^^^^79^86^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] addSeries [TYPE] void [PARAMETER] XIntervalSeries series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  XIntervalSeries series  [TYPE]  boolean false  true 
[REPLACE]^this.data.get ( series ) ;^83^^^^^79^86^[REPLACE] this.data.add ( series ) ;^[METHOD] addSeries [TYPE] void [PARAMETER] XIntervalSeries series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  XIntervalSeries series  [TYPE]  boolean false  true 
[REPLACE]^series .getKey (  )  ;^84^^^^^79^86^[REPLACE] series.addChangeListener ( this ) ;^[METHOD] addSeries [TYPE] void [PARAMETER] XIntervalSeries series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  XIntervalSeries series  [TYPE]  boolean false  true 
[ADD]^^84^85^^^^79^86^[ADD] series.addChangeListener ( this ) ; fireDatasetChanged (  ) ;^[METHOD] addSeries [TYPE] void [PARAMETER] XIntervalSeries series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  XIntervalSeries series  [TYPE]  boolean false  true 
[REPLACE]^this.data.add ( series ) ;^85^^^^^79^86^[REPLACE] fireDatasetChanged (  ) ;^[METHOD] addSeries [TYPE] void [PARAMETER] XIntervalSeries series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  XIntervalSeries series  [TYPE]  boolean false  true 
[REPLACE]^return di.getX (  ) ;^94^^^^^93^95^[REPLACE] return this.data.size (  ) ;^[METHOD] getSeriesCount [TYPE] int [PARAMETER] [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true 
[REPLACE]^if  (  ( series < 0 )  &&  ( series >= getSeriesCount (  )  )  )  {^108^^^^^107^112^[REPLACE] if  (  ( series < 0 )  ||  ( series >= getSeriesCount (  )  )  )  {^[METHOD] getSeries [TYPE] XIntervalSeries [PARAMETER] int series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  int series  [TYPE]  boolean false  true 
[ADD]^^108^109^110^^^107^112^[ADD] if  (  ( series < 0 )  ||  ( series >= getSeriesCount (  )  )  )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] getSeries [TYPE] XIntervalSeries [PARAMETER] int series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  int series  [TYPE]  boolean false  true 
[REPLACE]^return ;^109^^^^^107^112^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] getSeries [TYPE] XIntervalSeries [PARAMETER] int series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  int series  [TYPE]  boolean false  true 
[ADD]^^109^^^^^107^112^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] getSeries [TYPE] XIntervalSeries [PARAMETER] int series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  int series  [TYPE]  boolean false  true 
[REPLACE]^return di.getX (  ) ;^111^^^^^107^112^[REPLACE] return  ( XIntervalSeries )  this.data.get ( series ) ;^[METHOD] getSeries [TYPE] XIntervalSeries [PARAMETER] int series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  int series  [TYPE]  boolean false  true 
[REPLACE]^return getSeries ( series ) .getItemCount (  ) ;^127^^^^^125^128^[REPLACE] return getSeries ( series ) .getKey (  ) ;^[METHOD] getSeriesKey [TYPE] Comparable [PARAMETER] int series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  int series  [TYPE]  boolean false  true 
[REPLACE]^return getSeries ( series ) .getKey (  ) ;^142^^^^^140^143^[REPLACE] return getSeries ( series ) .getItemCount (  ) ;^[METHOD] getItemCount [TYPE] int [PARAMETER] int series [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  int series  [TYPE]  boolean false  true 
[REPLACE]^XIntervalSeries s =  ( XIntervalSeries )  this.data.get ( item ) ;^154^^^^^153^157^[REPLACE] XIntervalSeries s =  ( XIntervalSeries )  this.data.get ( series ) ;^[METHOD] getX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^XIntervalDataItem di =  ( XIntervalDataItem )  s .getKey (  )  ;^155^^^^^153^157^[REPLACE] XIntervalDataItem di =  ( XIntervalDataItem )  s.getDataItem ( item ) ;^[METHOD] getX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^return di.getYValue (  ) ;^156^^^^^153^157^[REPLACE] return di.getX (  ) ;^[METHOD] getX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^XIntervalSeries s =  ( XIntervalSeries )  this.data.get ( item ) ;^168^^^^^167^171^[REPLACE] XIntervalSeries s =  ( XIntervalSeries )  this.data.get ( series ) ;^[METHOD] getY [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[ADD]^XIntervalDataItem di =  ( XIntervalDataItem )  s.getDataItem ( item ) ;^168^169^^^^167^171^[ADD] XIntervalSeries s =  ( XIntervalSeries )  this.data.get ( series ) ; XIntervalDataItem di =  ( XIntervalDataItem )  s.getDataItem ( item ) ;^[METHOD] getY [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^XIntervalDataItem di =  ( XIntervalDataItem )  s.getItemCount ( item ) ;^169^^^^^167^171^[REPLACE] XIntervalDataItem di =  ( XIntervalDataItem )  s.getDataItem ( item ) ;^[METHOD] getY [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[ADD]^return new Double ( di.getYValue (  )  ) ;^169^170^^^^167^171^[ADD] XIntervalDataItem di =  ( XIntervalDataItem )  s.getDataItem ( item ) ; return new Double ( di.getYValue (  )  ) ;^[METHOD] getY [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^return new Double ( di .getXLowValue (  )   ) ;^170^^^^^167^171^[REPLACE] return new Double ( di.getYValue (  )  ) ;^[METHOD] getY [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^XIntervalSeries s =  ( XIntervalSeries )  this.data.get ( item ) ;^182^^^^^181^185^[REPLACE] XIntervalSeries s =  ( XIntervalSeries )  this.data.get ( series ) ;^[METHOD] getStartX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[ADD]^^182^^^^^181^185^[ADD] XIntervalSeries s =  ( XIntervalSeries )  this.data.get ( series ) ;^[METHOD] getStartX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^XIntervalDataItem di =  ( XIntervalDataItem )  s.getItemCount ( item ) ;^183^^^^^181^185^[REPLACE] XIntervalDataItem di =  ( XIntervalDataItem )  s.getDataItem ( item ) ;^[METHOD] getStartX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[ADD]^^183^184^^^^181^185^[ADD] XIntervalDataItem di =  ( XIntervalDataItem )  s.getDataItem ( item ) ; return new Double ( di.getXLowValue (  )  ) ;^[METHOD] getStartX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^return new Double ( di.getYValue (  )  ) ;^184^^^^^181^185^[REPLACE] return new Double ( di.getXLowValue (  )  ) ;^[METHOD] getStartX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^XIntervalSeries s =  ( XIntervalSeries )  this.data.size ( item ) ;^196^^^^^195^199^[REPLACE] XIntervalSeries s =  ( XIntervalSeries )  this.data.get ( series ) ;^[METHOD] getEndX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[ADD]^^196^^^^^195^199^[ADD] XIntervalSeries s =  ( XIntervalSeries )  this.data.get ( series ) ;^[METHOD] getEndX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^XIntervalDataItem di =  ( XIntervalDataItem )  s.getDataItem ( series ) ;^197^^^^^195^199^[REPLACE] XIntervalDataItem di =  ( XIntervalDataItem )  s.getDataItem ( item ) ;^[METHOD] getEndX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^return new Double ( di .getXLowValue (  )   ) ;^198^^^^^195^199^[REPLACE] return new Double ( di.getXHighValue (  )  ) ;^[METHOD] getEndX [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  boolean false  true  [TYPE]  XIntervalDataItem di  [TYPE]  int item  series  [TYPE]  XIntervalSeries s 
[REPLACE]^return di.getX (  ) ;^211^^^^^210^212^[REPLACE] return getY ( series, item ) ;^[METHOD] getStartY [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  int item  series  [TYPE]  boolean false  true 
[REPLACE]^return di.getX (  ) ;^224^^^^^223^225^[REPLACE] return getY ( series, item ) ;^[METHOD] getEndY [TYPE] Number [PARAMETER] int series int item [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  int item  series  [TYPE]  boolean false  true 
[REPLACE]^if  ( obj  &&  this )  {^235^^^^^234^243^[REPLACE] if  ( obj == this )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  XIntervalSeriesCollection that 
[REPLACE]^return false;^236^^^^^234^243^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  XIntervalSeriesCollection that 
[REPLACE]^if  ( ! ! ( obj instanceof XIntervalSeriesCollection )  )  {^238^^^^^234^243^[REPLACE] if  ( ! ( obj instanceof XIntervalSeriesCollection )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  XIntervalSeriesCollection that 
[REPLACE]^return true;^239^^^^^234^243^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  XIntervalSeriesCollection that 
[REPLACE]^XIntervalSeries s =  ( XIntervalSeries )  this.data.get ( series ) ;^241^^^^^234^243^[REPLACE] XIntervalSeriesCollection that =  ( XIntervalSeriesCollection )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  XIntervalSeriesCollection that 
[REPLACE]^return ObjectUtilities .deepClone ( data )  ;^242^^^^^234^243^[REPLACE] return ObjectUtilities.equal ( this.data, that.data ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] XIntervalSeriesCollection   [TYPE]  List data  [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  XIntervalSeriesCollection that 
[REPLACE]^XIntervalSeriesCollection clone =  ( XIntervalSeriesCollection )  super .clone (  )  ;^253^254^^^^252^257^[REPLACE] XIntervalSeriesCollection clone =  ( XIntervalSeriesCollection )  super.clone (  ) ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] XIntervalSeriesCollection   [TYPE]  XIntervalSeriesCollection clone  [TYPE]  List data  [TYPE]  boolean false  true 
[REPLACE]^clone.data =   ( List )  ObjectUtilities.deepClone ( this.data ) ;^255^^^^^252^257^[REPLACE] clone.data =  ( List )  ObjectUtilities.deepClone ( this.data ) ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] XIntervalSeriesCollection   [TYPE]  XIntervalSeriesCollection clone  [TYPE]  List data  [TYPE]  boolean false  true 
[REPLACE]^return di.getX (  ) ;^256^^^^^252^257^[REPLACE] return clone;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] XIntervalSeriesCollection   [TYPE]  XIntervalSeriesCollection clone  [TYPE]  List data  [TYPE]  boolean false  true 