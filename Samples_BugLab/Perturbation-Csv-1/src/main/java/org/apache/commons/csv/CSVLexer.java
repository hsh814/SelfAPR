[buglab_swap_variables]^super ( in, format ) ;^28^^^^^27^29^super ( format, in ) ;^[CLASS] CSVLexer  [METHOD] <init> [RETURN_TYPE] ExtendedBufferedReader)   CSVFormat format ExtendedBufferedReader in [VARIABLES] boolean  ExtendedBufferedReader  in  CSVFormat  format  
[buglab_swap_variables]^super (  in ) ;^28^^^^^27^29^super ( format, in ) ;^[CLASS] CSVLexer  [METHOD] <init> [RETURN_TYPE] ExtendedBufferedReader)   CSVFormat format ExtendedBufferedReader in [VARIABLES] boolean  ExtendedBufferedReader  in  CSVFormat  format  
[buglab_swap_variables]^super ( format ) ;^28^^^^^27^29^super ( format, in ) ;^[CLASS] CSVLexer  [METHOD] <init> [RETURN_TYPE] ExtendedBufferedReader)   CSVFormat format ExtendedBufferedReader in [VARIABLES] boolean  ExtendedBufferedReader  in  CSVFormat  format  
[buglab_swap_variables]^while  ( lastChar &&  ( eol == '\n' || lastChar == '\r' || lastChar == ExtendedBufferedReader.UNDEFINED ) && !isEndOfFile ( lastChar )  )  {^57^58^59^^^42^72^while  ( eol &&  ( lastChar == '\n' || lastChar == '\r' || lastChar == ExtendedBufferedReader.UNDEFINED ) && !isEndOfFile ( lastChar )  )  {^[CLASS] CSVLexer  [METHOD] nextToken [RETURN_TYPE] Token   Token tkn [VARIABLES] boolean  eol  Token  tkn  int  c  lastChar  
[buglab_swap_variables]^if  ( isEndOfFile ( c )  ||  ( !isDelimiter ( lastChar )  && isEndOfFile ( lastChar )  )  )  {^75^^^^^60^90^if  ( isEndOfFile ( lastChar )  ||  ( !isDelimiter ( lastChar )  && isEndOfFile ( c )  )  )  {^[CLASS] CSVLexer  [METHOD] nextToken [RETURN_TYPE] Token   Token tkn [VARIABLES] boolean  eol  Token  tkn  int  c  lastChar  
[buglab_swap_variables]^simpleTokenLexer ( c, tkn ) ;^114^^^^^106^115^simpleTokenLexer ( tkn, c ) ;^[CLASS] CSVLexer  [METHOD] nextToken [RETURN_TYPE] Token   Token tkn [VARIABLES] boolean  eol  Token  tkn  int  c  lastChar  
[buglab_swap_variables]^simpleTokenLexer (  c ) ;^114^^^^^106^115^simpleTokenLexer ( tkn, c ) ;^[CLASS] CSVLexer  [METHOD] nextToken [RETURN_TYPE] Token   Token tkn [VARIABLES] boolean  eol  Token  tkn  int  c  lastChar  
[buglab_swap_variables]^simpleTokenLexer ( tkn ) ;^114^^^^^106^115^simpleTokenLexer ( tkn, c ) ;^[CLASS] CSVLexer  [METHOD] nextToken [RETURN_TYPE] Token   Token tkn [VARIABLES] boolean  eol  Token  tkn  int  c  lastChar  
[buglab_swap_variables]^simpleTokenLexer ( c, tkn ) ;^114^^^^^99^129^simpleTokenLexer ( tkn, c ) ;^[CLASS] CSVLexer  [METHOD] nextToken [RETURN_TYPE] Token   Token tkn [VARIABLES] boolean  eol  Token  tkn  int  c  lastChar  
[buglab_swap_variables]^simpleTokenLexer (  c ) ;^114^^^^^99^129^simpleTokenLexer ( tkn, c ) ;^[CLASS] CSVLexer  [METHOD] nextToken [RETURN_TYPE] Token   Token tkn [VARIABLES] boolean  eol  Token  tkn  int  c  lastChar  
[buglab_swap_variables]^simpleTokenLexer ( tkn ) ;^114^^^^^99^129^simpleTokenLexer ( tkn, c ) ;^[CLASS] CSVLexer  [METHOD] nextToken [RETURN_TYPE] Token   Token tkn [VARIABLES] boolean  eol  Token  tkn  int  c  lastChar  
[buglab_swap_variables]^encapsulatedTokenLexer ( c, tkn ) ;^105^^^^^90^120^encapsulatedTokenLexer ( tkn, c ) ;^[CLASS] CSVLexer  [METHOD] nextToken [RETURN_TYPE] Token   Token tkn [VARIABLES] boolean  eol  Token  tkn  int  c  lastChar  
[buglab_swap_variables]^encapsulatedTokenLexer (  c ) ;^105^^^^^90^120^encapsulatedTokenLexer ( tkn, c ) ;^[CLASS] CSVLexer  [METHOD] nextToken [RETURN_TYPE] Token   Token tkn [VARIABLES] boolean  eol  Token  tkn  int  c  lastChar  
[buglab_swap_variables]^encapsulatedTokenLexer ( tkn ) ;^105^^^^^90^120^encapsulatedTokenLexer ( tkn, c ) ;^[CLASS] CSVLexer  [METHOD] nextToken [RETURN_TYPE] Token   Token tkn [VARIABLES] boolean  eol  Token  tkn  int  c  lastChar  