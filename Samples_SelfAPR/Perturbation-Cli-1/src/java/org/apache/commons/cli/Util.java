[P3_Replace_Literal]^if  ( str.startsWith ( "-" )  ) {^35^36^^^^33^45^if  ( str.startsWith ( "--" )  ) {^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^if  ( str.substring ( "--" )  ) {^35^36^^^^33^45^if  ( str.startsWith ( "--" )  ) {^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^if  ( str .endsWith ( str )   ) {^35^36^^^^33^45^if  ( str.startsWith ( "--" )  ) {^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P9_Replace_Statement]^if  ( str.endsWith ( "\"" )  )  {^35^36^^^^33^45^if  ( str.startsWith ( "--" )  ) {^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P15_Unwrap_Block]^return str.substring(2, str.length());^35^36^37^38^^33^45^if  ( str.startsWith ( "--" )  ) { return str.substring ( 2, str.length (  )  ) ; }^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P16_Remove_Block]^^35^36^37^38^^33^45^if  ( str.startsWith ( "--" )  ) { return str.substring ( 2, str.length (  )  ) ; }^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^else if  ( str.startsWith ( "" )  ) {^39^40^^^^33^45^else if  ( str.startsWith ( "-" )  ) {^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^else if  ( str.substring ( "-" )  ) {^39^40^^^^33^45^else if  ( str.startsWith ( "-" )  ) {^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P8_Replace_Mix]^else if  ( str .endsWith ( str )   ) {^39^40^^^^33^45^else if  ( str.startsWith ( "-" )  ) {^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P15_Unwrap_Block]^return str.substring(1, str.length());^39^40^41^42^^33^45^else if  ( str.startsWith ( "-" )  ) { return str.substring ( 1, str.length (  )  ) ; }^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P16_Remove_Block]^^39^40^41^42^^33^45^else if  ( str.startsWith ( "-" )  ) { return str.substring ( 1, str.length (  )  ) ; }^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P13_Insert_Block]^if  ( str.endsWith ( "\"" )  )  {     str = str.substring ( 0,  (  ( str.length (  )  )  - 1 )  ) ; }^39^^^^^33^45^[Delete]^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P13_Insert_Block]^if  ( str.startsWith ( "\"" )  )  {     str = str.substring ( 1, str.length (  )  ) ; }^39^^^^^33^45^[Delete]^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( -7, str.length (  )  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 1, str.length() - 1  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^return str.substring ( 1, str.endsWith (  )  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^return str.substring ( 1, str .endsWith ( str )   ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P8_Replace_Mix]^return str .startsWith ( str )  ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 10, str.length (  )  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 1, str.length() - 0  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P14_Delete_Statement]^^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 1, str.length() - 6  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 8, str.length (  )  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 1, str.length() + 4  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( -2, str.length (  )  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 1, str.length() + 2  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 1, str.length() - 5  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 8, str.length (  )  ) ;^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 2, str.length() + 5  ) ;^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^return str.substring ( 2, str.endsWith (  )  ) ;^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 1, str.length (  )  ) ;^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 2, str.length() + 6  ) ;^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^return str .startsWith ( str )  ;^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^return str.substring ( 2, str .endsWith ( str )   ) ;^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P14_Delete_Statement]^^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 2, str.length() - 5  ) ;^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P8_Replace_Mix]^if  ( str .endsWith ( str )   ) {^39^40^^^^33^45^else if  ( str.startsWith ( "-" )  ) {^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 1, str.length() - 2  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P8_Replace_Mix]^return str.substring ( 1 % 4, str .endsWith ( str )   ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 6, str.length (  )  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 1, str.length() + 1  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 2, str.length() + 8  ) ;^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 1, str.length() - 7  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 0, str.length (  )  ) ;^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 2, str.length() - 8  ) ;^37^^^^^33^45^return str.substring ( 2, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^return str.substring ( 1, str.length() + 0  ) ;^41^^^^^33^45^return str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingHyphens [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^if  ( str.startsWith ( "\" )  )  {^58^^^^^56^65^if  ( str.startsWith ( "\"" )  )  {^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^if  ( str.substring ( "\"" )  )  {^58^^^^^56^65^if  ( str.startsWith ( "\"" )  )  {^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P9_Replace_Statement]^if  ( str.endsWith ( "\"" )  )  {^58^^^^^56^65^if  ( str.startsWith ( "\"" )  )  {^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P15_Unwrap_Block]^str = str.substring(1, str.length());^58^59^60^^^56^65^if  ( str.startsWith ( "\"" )  )  { str = str.substring ( 1, str.length (  )  ) ; }^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P16_Remove_Block]^^58^59^60^^^56^65^if  ( str.startsWith ( "\"" )  )  { str = str.substring ( 1, str.length (  )  ) ; }^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P13_Insert_Block]^if  ( str.endsWith ( "\"" )  )  {     str = str.substring ( 0,  (  ( str.length (  )  )  - 1 )  ) ; }^58^^^^^56^65^[Delete]^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P13_Insert_Block]^if  ( str.startsWith ( "-" )  )  {     return str.substring ( 1, str.length (  )  ) ; }^58^^^^^56^65^[Delete]^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( , str.length (  )  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 1, str.length() - 8  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^str = str.substring ( 1, str.endsWith (  )  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^str = str.substring ( 1, str .endsWith ( str )   ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P8_Replace_Mix]^str = str.substring ( 0 , str.length (  )  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P11_Insert_Donor_Statement]^str = str.substring ( 0, str.length (  ) -1 ) ;str = str.substring ( 1, str.length (  )  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P13_Insert_Block]^if  ( str.startsWith ( "\"" )  )  {     str = str.substring ( 1, str.length (  )  ) ; }^59^^^^^56^65^[Delete]^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( -6, str.length (  )  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 1, str.length() - 6  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^str = str .startsWith ( str )  ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P14_Delete_Statement]^^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 1, str.length() + 9  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 2, str.length (  )  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 1, str.length() - 9  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^if  ( str.startsWith ( "" )  )  {^58^^^^^56^65^if  ( str.startsWith ( "\"" )  )  {^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 1, str.length() + 1  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 1, str.length() + 0  ) ;^59^^^^^56^65^str = str.substring ( 1, str.length (  )  ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^if  ( str.endsWith ( "" )  )  {^61^^^^^56^65^if  ( str.endsWith ( "\"" )  )  {^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^if  ( str.substring ( "\"" )  )  {^61^^^^^56^65^if  ( str.endsWith ( "\"" )  )  {^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^if  ( str .startsWith ( str )   )  {^61^^^^^56^65^if  ( str.endsWith ( "\"" )  )  {^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P15_Unwrap_Block]^str = str.substring(0, ((str.length()) - 1));^61^62^63^^^56^65^if  ( str.endsWith ( "\"" )  )  { str = str.substring ( 0, str.length (  ) -1 ) ; }^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P16_Remove_Block]^^61^62^63^^^56^65^if  ( str.endsWith ( "\"" )  )  { str = str.substring ( 0, str.length (  ) -1 ) ; }^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P13_Insert_Block]^if  ( str.startsWith ( "\"" )  )  {     str = str.substring ( 1, str.length (  )  ) ; }^61^^^^^56^65^[Delete]^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P13_Insert_Block]^if  ( str.startsWith ( "-" )  )  {     return str.substring ( 1, str.length (  )  ) ; }^61^^^^^56^65^[Delete]^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( -8, str.length (  ) -1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 0, str.length (  ) --1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 0, str.length() + 2 -1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^str = str .startsWith ( str )  ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^str = str.substring ( 0, str.endsWith (  ) -1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P7_Replace_Invocation]^str = str.substring ( 0, str .endsWith ( str )  -1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P8_Replace_Mix]^str = str.substring ( 0 , str.length (  ) -1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P11_Insert_Donor_Statement]^str = str.substring ( 1, str.length (  )  ) ;str = str.substring ( 0, str.length (  ) -1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P13_Insert_Block]^if  ( str.endsWith ( "\"" )  )  {     str = str.substring ( 0,  (  ( str.length (  )  )  - 1 )  ) ; }^62^^^^^56^65^[Delete]^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 0, str.length (  ) --6 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 0, str.length() + 4 -1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P14_Delete_Statement]^^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 0, str.length() + 9 -1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 3, str.length (  ) -1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 0, str.length (  ) -6 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 0, str.length() - 3 -1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^if  ( str.endsWith ( "\"\" )  )  {^61^^^^^56^65^if  ( str.endsWith ( "\"" )  )  {^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
[P3_Replace_Literal]^str = str.substring ( 0, str.length() - 5 -1 ) ;^62^^^^^56^65^str = str.substring ( 0, str.length (  ) -1 ) ;^[CLASS] Util  [METHOD] stripLeadingAndTrailingQuotes [RETURN_TYPE] String   String str [VARIABLES] boolean  String  str  
