[P1_Replace_Type]^private static final char TEXT_KEY = "text";^12^^^^^7^17^private static final String TEXT_KEY = "text";^[CLASS] TextNode   [VARIABLES] 
[P3_Replace_Literal]^private static final String TEXT_KEY = "textt";^12^^^^^7^17^private static final String TEXT_KEY = "text";^[CLASS] TextNode   [VARIABLES] 
[P5_Replace_Variable]^super ( text ) ;^22^^^^^21^24^super ( baseUri ) ;^[CLASS] TextNode  [METHOD] <init> [RETURN_TYPE] String)   String text String baseUri [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P14_Delete_Statement]^^22^^^^^21^24^super ( baseUri ) ;^[CLASS] TextNode  [METHOD] <init> [RETURN_TYPE] String)   String text String baseUri [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P5_Replace_Variable]^attributes.put ( TEXT_KEY, baseUri ) ;^23^^^^^21^24^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] <init> [RETURN_TYPE] String)   String text String baseUri [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P5_Replace_Variable]^attributes.put ( baseUri, text ) ;^23^^^^^21^24^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] <init> [RETURN_TYPE] String)   String text String baseUri [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P5_Replace_Variable]^attributes.put ( TEXT_KEY ) ;^23^^^^^21^24^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] <init> [RETURN_TYPE] String)   String text String baseUri [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P5_Replace_Variable]^attributes.put (  text ) ;^23^^^^^21^24^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] <init> [RETURN_TYPE] String)   String text String baseUri [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P5_Replace_Variable]^attributes.put ( text, TEXT_KEY ) ;^23^^^^^21^24^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] <init> [RETURN_TYPE] String)   String text String baseUri [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P7_Replace_Invocation]^attributes.get ( TEXT_KEY, text ) ;^23^^^^^21^24^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] <init> [RETURN_TYPE] String)   String text String baseUri [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P14_Delete_Statement]^^23^^^^^21^24^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] <init> [RETURN_TYPE] String)   String text String baseUri [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P11_Insert_Donor_Statement]^return attributes.get ( TEXT_KEY ) ;attributes.put ( TEXT_KEY, text ) ;^23^^^^^21^24^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] <init> [RETURN_TYPE] String)   String text String baseUri [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P7_Replace_Invocation]^return getWholeText (  ) ;^36^^^^^35^37^return outerHtml (  ) ;^[CLASS] TextNode  [METHOD] text [RETURN_TYPE] String   [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P14_Delete_Statement]^^36^^^^^35^37^return outerHtml (  ) ;^[CLASS] TextNode  [METHOD] text [RETURN_TYPE] String   [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P5_Replace_Variable]^attributes.put ( TEXT_KEY, baseUri ) ;^45^^^^^44^47^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] text [RETURN_TYPE] TextNode   String text [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P5_Replace_Variable]^attributes.put ( TEXT_KEY ) ;^45^^^^^44^47^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] text [RETURN_TYPE] TextNode   String text [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P5_Replace_Variable]^attributes.put (  text ) ;^45^^^^^44^47^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] text [RETURN_TYPE] TextNode   String text [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P5_Replace_Variable]^attributes.put ( text, TEXT_KEY ) ;^45^^^^^44^47^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] text [RETURN_TYPE] TextNode   String text [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P7_Replace_Invocation]^attributes.get ( TEXT_KEY, text ) ;^45^^^^^44^47^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] text [RETURN_TYPE] TextNode   String text [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P8_Replace_Mix]^attributes.put ( baseUri, text ) ;^45^^^^^44^47^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] text [RETURN_TYPE] TextNode   String text [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P14_Delete_Statement]^^45^46^^^^44^47^attributes.put ( TEXT_KEY, text ) ; return this;^[CLASS] TextNode  [METHOD] text [RETURN_TYPE] TextNode   String text [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P11_Insert_Donor_Statement]^return attributes.get ( TEXT_KEY ) ;attributes.put ( TEXT_KEY, text ) ;^45^^^^^44^47^attributes.put ( TEXT_KEY, text ) ;^[CLASS] TextNode  [METHOD] text [RETURN_TYPE] TextNode   String text [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P8_Replace_Mix]^return null;^46^^^^^44^47^return this;^[CLASS] TextNode  [METHOD] text [RETURN_TYPE] TextNode   String text [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P5_Replace_Variable]^return attributes.get ( text ) ;^54^^^^^53^55^return attributes.get ( TEXT_KEY ) ;^[CLASS] TextNode  [METHOD] getWholeText [RETURN_TYPE] String   [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P5_Replace_Variable]^return TEXT_KEY.get ( attributes ) ;^54^^^^^53^55^return attributes.get ( TEXT_KEY ) ;^[CLASS] TextNode  [METHOD] getWholeText [RETURN_TYPE] String   [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P7_Replace_Invocation]^return attributes .put ( text , TEXT_KEY )  ;^54^^^^^53^55^return attributes.get ( TEXT_KEY ) ;^[CLASS] TextNode  [METHOD] getWholeText [RETURN_TYPE] String   [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P14_Delete_Statement]^^54^^^^^53^55^return attributes.get ( TEXT_KEY ) ;^[CLASS] TextNode  [METHOD] getWholeText [RETURN_TYPE] String   [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P7_Replace_Invocation]^return StringUtils .isBlank ( baseUri )   ) ;^62^^^^^61^63^return StringUtils.isBlank ( normaliseWhitespace ( getWholeText (  )  )  ) ;^[CLASS] TextNode  [METHOD] isBlank [RETURN_TYPE] boolean   [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P7_Replace_Invocation]^return StringUtils.isBlank ( getWholeText ( getWholeText (  )  )  ) ;^62^^^^^61^63^return StringUtils.isBlank ( normaliseWhitespace ( getWholeText (  )  )  ) ;^[CLASS] TextNode  [METHOD] isBlank [RETURN_TYPE] boolean   [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P7_Replace_Invocation]^return StringUtils.isBlank ( normaliseWhitespace ( isBlank (  )  )  ) ;^62^^^^^61^63^return StringUtils.isBlank ( normaliseWhitespace ( getWholeText (  )  )  ) ;^[CLASS] TextNode  [METHOD] isBlank [RETURN_TYPE] boolean   [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P14_Delete_Statement]^^62^^^^^61^63^return StringUtils.isBlank ( normaliseWhitespace ( getWholeText (  )  )  ) ;^[CLASS] TextNode  [METHOD] isBlank [RETURN_TYPE] boolean   [VARIABLES] String  TEXT_KEY  baseUri  text  boolean  
[P1_Replace_Type]^char html = StringEscapeUtils.escapeHtml ( getWholeText (  )  ) ;^66^^^^^65^74^String html = StringEscapeUtils.escapeHtml ( getWholeText (  )  ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P7_Replace_Invocation]^String html = StringEscapeUtils .unescapeHtml ( text )  ;^66^^^^^65^74^String html = StringEscapeUtils.escapeHtml ( getWholeText (  )  ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P7_Replace_Invocation]^String html = StringEscapeUtils.escapeHtml ( isBlank (  )  ) ;^66^^^^^65^74^String html = StringEscapeUtils.escapeHtml ( getWholeText (  )  ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P11_Insert_Donor_Statement]^String text = StringEscapeUtils.unescapeHtml ( encodedText ) ;String html = StringEscapeUtils.escapeHtml ( getWholeText (  )  ) ;^66^^^^^65^74^String html = StringEscapeUtils.escapeHtml ( getWholeText (  )  ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P14_Delete_Statement]^^66^^^^^65^74^String html = StringEscapeUtils.escapeHtml ( getWholeText (  )  ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P2_Replace_Operator]^if  ( parent (  )  instanceof Element || ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  {^67^^^^^65^74^if  ( parent (  )  instanceof Element && ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  {^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P2_Replace_Operator]^if  ( parent (  )   ||  Element && ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  {^67^^^^^65^74^if  ( parent (  )  instanceof Element && ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  {^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P6_Replace_Expression]^if  ( parent (  )  instanceof Element ) {^67^^^^^65^74^if  ( parent (  )  instanceof Element && ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  {^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P6_Replace_Expression]^if  (  ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  {^67^^^^^65^74^if  ( parent (  )  instanceof Element && ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  {^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P7_Replace_Invocation]^if  ( tag (  )  instanceof Element && ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  {^67^^^^^65^74^if  ( parent (  )  instanceof Element && ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  {^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P7_Replace_Invocation]^if  ( parent (  )  instanceof Element && ! (  ( Element )  parent (  )  ) .parent (  )  )  {^67^^^^^65^74^if  ( parent (  )  instanceof Element && ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  {^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P15_Unwrap_Block]^html = org.jsoup.nodes.TextNode.normaliseWhitespace(html);^67^68^69^^^65^74^if  ( parent (  )  instanceof Element && ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  { html = normaliseWhitespace ( html ) ; }^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P16_Remove_Block]^^67^68^69^^^65^74^if  ( parent (  )  instanceof Element && ! (  ( Element )  parent (  )  ) .preserveWhitespace (  )  )  { html = normaliseWhitespace ( html ) ; }^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P5_Replace_Variable]^html = normaliseWhitespace ( text ) ;^68^^^^^65^74^html = normaliseWhitespace ( html ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P7_Replace_Invocation]^html = stripLeadingWhitespace ( html ) ;^68^^^^^65^74^html = normaliseWhitespace ( html ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P14_Delete_Statement]^^68^^^^^65^74^html = normaliseWhitespace ( html ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P2_Replace_Operator]^if  ( !isBlank (  )  || parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P2_Replace_Operator]^if  ( !isBlank (  )  && parentNode  >>  Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P2_Replace_Operator]^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  < 0 ) indent ( accum ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P3_Replace_Literal]^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == -2 ) indent ( accum ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P5_Replace_Variable]^if  ( !isBlank (  )  && accum instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( parentNode ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P6_Replace_Expression]^if  ( (!(isBlank()) && (parentNode instanceof Element) && Element canContainBlock() ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P6_Replace_Expression]^if  ( !(isBlank() && parentNode instanceof Element) ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P6_Replace_Expression]^if  ( parentNode instanceof Element ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P6_Replace_Expression]^if  ( siblingIndex (  )  == 0 ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P7_Replace_Invocation]^if  ( !getWholeText (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P7_Replace_Invocation]^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .parent (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P7_Replace_Invocation]^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .parent (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P7_Replace_Invocation]^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && canContainBlock (  )  == 0 ) indent ( accum ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P8_Replace_Mix]^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 3 ) indent ( accum ) ;^71^72^^^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P15_Unwrap_Block]^indent(accum);^71^72^73^74^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ; accum.append ( html ) ; }^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P16_Remove_Block]^^71^72^73^74^^65^74^if  ( !isBlank (  )  && parentNode instanceof Element &&  (  ( Element )  parentNode ) .tag (  ) .canContainBlock (  )   && siblingIndex (  )  == 0 ) indent ( accum ) ; accum.append ( html ) ; }^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P14_Delete_Statement]^^72^73^^^^65^74^indent ( accum ) ; accum.append ( html ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P8_Replace_Mix]^accum.append ( text ) ;^73^^^^^65^74^accum.append ( html ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P14_Delete_Statement]^^73^^^^^65^74^accum.append ( html ) ;^[CLASS] TextNode  [METHOD] outerHtml [RETURN_TYPE] void   StringBuilder accum [VARIABLES] StringBuilder  accum  String  TEXT_KEY  baseUri  html  text  boolean  
[P7_Replace_Invocation]^return getWholeText (  ) ;^77^^^^^76^78^return outerHtml (  ) ;^[CLASS] TextNode  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  TEXT_KEY  baseUri  html  text  boolean  
[P14_Delete_Statement]^^77^^^^^76^78^return outerHtml (  ) ;^[CLASS] TextNode  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  TEXT_KEY  baseUri  html  text  boolean  
[P1_Replace_Type]^char text = StringEscapeUtils.unescapeHtml ( encodedText ) ;^86^^^^^85^88^String text = StringEscapeUtils.unescapeHtml ( encodedText ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P7_Replace_Invocation]^String text = StringEscapeUtils.escapeHtml ( encodedText ) ;^86^^^^^85^88^String text = StringEscapeUtils.unescapeHtml ( encodedText ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P8_Replace_Mix]^String text = StringEscapeUtils.unescapeHtml ( html ) ;^86^^^^^85^88^String text = StringEscapeUtils.unescapeHtml ( encodedText ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P11_Insert_Donor_Statement]^String html = StringEscapeUtils.escapeHtml ( getWholeText (  )  ) ;String text = StringEscapeUtils.unescapeHtml ( encodedText ) ;^86^^^^^85^88^String text = StringEscapeUtils.unescapeHtml ( encodedText ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P7_Replace_Invocation]^String text = StringEscapeUtils .escapeHtml ( html )  ;^86^^^^^85^88^String text = StringEscapeUtils.unescapeHtml ( encodedText ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P8_Replace_Mix]^String text = StringEscapeUtils.unescapeHtml ( text ) ;^86^^^^^85^88^String text = StringEscapeUtils.unescapeHtml ( encodedText ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P14_Delete_Statement]^^86^87^^^^85^88^String text = StringEscapeUtils.unescapeHtml ( encodedText ) ; return new TextNode ( text, baseUri ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P4_Replace_Constructor]^return new TextNode (  baseUri ) ;^87^^^^^85^88^return new TextNode ( text, baseUri ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P4_Replace_Constructor]^return new TextNode ( text ) ;^87^^^^^85^88^return new TextNode ( text, baseUri ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P5_Replace_Variable]^return new TextNode ( html, baseUri ) ;^87^^^^^85^88^return new TextNode ( text, baseUri ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P5_Replace_Variable]^return new TextNode ( text, html ) ;^87^^^^^85^88^return new TextNode ( text, baseUri ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P5_Replace_Variable]^return new TextNode ( baseUri, text ) ;^87^^^^^85^88^return new TextNode ( text, baseUri ) ;^[CLASS] TextNode  [METHOD] createFromEncoded [RETURN_TYPE] TextNode   String encodedText String baseUri [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P5_Replace_Variable]^text = html.replaceAll ( "\\s{2,}| ( \\r\\n|\\r|\\n ) ", " " ) ;^91^^^^^90^93^text = text.replaceAll ( "\\s{2,}| ( \\r\\n|\\r|\\n ) ", " " ) ;^[CLASS] TextNode  [METHOD] normaliseWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P7_Replace_Invocation]^text = text .replaceFirst ( baseUri , encodedText )  ;^91^^^^^90^93^text = text.replaceAll ( "\\s{2,}| ( \\r\\n|\\r|\\n ) ", " " ) ;^[CLASS] TextNode  [METHOD] normaliseWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P3_Replace_Literal]^text = text.replaceAll ( "\\s{2,}| ( \\r\\n|\\r|\\n ) ", "" ) ;^91^^^^^90^93^text = text.replaceAll ( "\\s{2,}| ( \\r\\n|\\r|\\n ) ", " " ) ;^[CLASS] TextNode  [METHOD] normaliseWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P5_Replace_Variable]^text = encodedText.replaceAll ( "\\s{2,}| ( \\r\\n|\\r|\\n ) ", " " ) ;^91^^^^^90^93^text = text.replaceAll ( "\\s{2,}| ( \\r\\n|\\r|\\n ) ", " " ) ;^[CLASS] TextNode  [METHOD] normaliseWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P8_Replace_Mix]^text = html .replaceFirst ( TEXT_KEY , html )  ;^91^^^^^90^93^text = text.replaceAll ( "\\s{2,}| ( \\r\\n|\\r|\\n ) ", " " ) ;^[CLASS] TextNode  [METHOD] normaliseWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P14_Delete_Statement]^^91^92^^^^90^93^text = text.replaceAll ( "\\s{2,}| ( \\r\\n|\\r|\\n ) ", " " ) ; return text;^[CLASS] TextNode  [METHOD] normaliseWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P5_Replace_Variable]^return html;^92^^^^^90^93^return text;^[CLASS] TextNode  [METHOD] normaliseWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P8_Replace_Mix]^return encodedText;^92^^^^^90^93^return text;^[CLASS] TextNode  [METHOD] normaliseWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P3_Replace_Literal]^return text.replaceFirst ( "s", "" ) ;^96^^^^^95^97^return text.replaceFirst ( "^\\s+", "" ) ;^[CLASS] TextNode  [METHOD] stripLeadingWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P5_Replace_Variable]^return html.replaceFirst ( "^\\s+", "" ) ;^96^^^^^95^97^return text.replaceFirst ( "^\\s+", "" ) ;^[CLASS] TextNode  [METHOD] stripLeadingWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P3_Replace_Literal]^return text.replaceFirst ( "\\s+", "" ) ;^96^^^^^95^97^return text.replaceFirst ( "^\\s+", "" ) ;^[CLASS] TextNode  [METHOD] stripLeadingWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P5_Replace_Variable]^return encodedText.replaceFirst ( "^\\s+", "" ) ;^96^^^^^95^97^return text.replaceFirst ( "^\\s+", "" ) ;^[CLASS] TextNode  [METHOD] stripLeadingWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P8_Replace_Mix]^return encodedText .replaceAll ( encodedText , baseUri )  ;^96^^^^^95^97^return text.replaceFirst ( "^\\s+", "" ) ;^[CLASS] TextNode  [METHOD] stripLeadingWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P14_Delete_Statement]^^96^^^^^95^97^return text.replaceFirst ( "^\\s+", "" ) ;^[CLASS] TextNode  [METHOD] stripLeadingWhitespace [RETURN_TYPE] String   String text [VARIABLES] String  TEXT_KEY  baseUri  encodedText  html  text  boolean  
[P2_Replace_Operator]^if  ( sb.length (  )  != 0 ) return false;^100^101^^^^99^105^if  ( sb.length (  )  == 0 ) return false;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^if  ( sb.length (  )  == 7 ) return false;^100^101^^^^99^105^if  ( sb.length (  )  == 0 ) return false;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^if  ( sb.length (  )  == 0 ) return true;^100^101^^^^99^105^if  ( sb.length (  )  == 0 ) return false;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^if  ( sb.length() - 1  == 0 ) return false;^100^101^^^^99^105^if  ( sb.length (  )  == 0 ) return false;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P8_Replace_Mix]^if  ( sb.length (  )  == 0  ) return false;^100^101^^^^99^105^if  ( sb.length (  )  == 0 ) return false;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P15_Unwrap_Block]^return false;^100^101^102^103^104^99^105^if  ( sb.length (  )  == 0 ) return false; String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ; Validate.isTrue ( lastChar.length (  )  == 1 ) ; return lastChar.equals ( " " ) ; }^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P16_Remove_Block]^^100^101^102^103^104^99^105^if  ( sb.length (  )  == 0 ) return false; String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ; Validate.isTrue ( lastChar.length (  )  == 1 ) ; return lastChar.equals ( " " ) ; }^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^return true;^101^^^^^99^105^return false;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^if  ( sb.length() - 6  == 0 ) return false;^100^101^^^^99^105^if  ( sb.length (  )  == 0 ) return false;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P1_Replace_Type]^char lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ;^102^^^^^99^105^String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^String lastChar = sb.substring ( sb.length (  ) -10, sb.length (  )  ) ;^102^^^^^99^105^String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^String lastChar = sb.substring ( sb.length() - 0 -1, sb.length() - 0  ) ;^102^^^^^99^105^String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P7_Replace_Invocation]^String lastChar = sb .length (  )   ) ;^102^^^^^99^105^String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^String lastChar = sb.substring ( sb.length (  ) -2, sb.length (  )  ) ;^102^^^^^99^105^String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^String lastChar = sb.substring ( sb.length() + 3 -1, sb.length() + 3  ) ;^102^^^^^99^105^String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P14_Delete_Statement]^^102^103^^^^99^105^String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ; Validate.isTrue ( lastChar.length (  )  == 1 ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^String lastChar = sb.substring ( sb.length() - 5 -1, sb.length() - 5  ) ;^102^^^^^99^105^String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P14_Delete_Statement]^^102^^^^^99^105^String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^String lastChar = sb.substring ( sb.length() - 7 -1, sb.length() - 7  ) ;^102^^^^^99^105^String lastChar = sb.substring ( sb.length (  ) -1, sb.length (  )  ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P2_Replace_Operator]^Validate.isTrue ( lastChar.length (  )  >= 1 ) ;^103^^^^^99^105^Validate.isTrue ( lastChar.length (  )  == 1 ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^Validate.isTrue ( lastChar.length (  )  == 5 ) ;^103^^^^^99^105^Validate.isTrue ( lastChar.length (  )  == 1 ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^Validate.isTrue ( lastChar.length() + 4  == 1 ) ;^103^^^^^99^105^Validate.isTrue ( lastChar.length (  )  == 1 ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P5_Replace_Variable]^Validate.isTrue ( text.length (  )  == 1 ) ;^103^^^^^99^105^Validate.isTrue ( lastChar.length (  )  == 1 ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P7_Replace_Invocation]^Validate.isTrue ( lastChar.equals (  )  == 1 ) ;^103^^^^^99^105^Validate.isTrue ( lastChar.length (  )  == 1 ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P8_Replace_Mix]^Validate.isTrue ( html.length (  )  == 1 ) ;^103^^^^^99^105^Validate.isTrue ( lastChar.length (  )  == 1 ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P14_Delete_Statement]^^103^^^^^99^105^Validate.isTrue ( lastChar.length (  )  == 1 ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P14_Delete_Statement]^^103^104^^^^99^105^Validate.isTrue ( lastChar.length (  )  == 1 ) ; return lastChar.equals ( " " ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P3_Replace_Literal]^return lastChar.equals ( "" ) ;^104^^^^^99^105^return lastChar.equals ( " " ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P5_Replace_Variable]^return text.equals ( " " ) ;^104^^^^^99^105^return lastChar.equals ( " " ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P7_Replace_Invocation]^return lastChar.replaceAll ( " " ) ;^104^^^^^99^105^return lastChar.equals ( " " ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P8_Replace_Mix]^return text .replaceAll ( html , text )  ;^104^^^^^99^105^return lastChar.equals ( " " ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
[P14_Delete_Statement]^^104^^^^^99^105^return lastChar.equals ( " " ) ;^[CLASS] TextNode  [METHOD] lastCharIsWhitespace [RETURN_TYPE] boolean   StringBuilder sb [VARIABLES] StringBuilder  sb  String  TEXT_KEY  baseUri  encodedText  html  lastChar  text  boolean  
