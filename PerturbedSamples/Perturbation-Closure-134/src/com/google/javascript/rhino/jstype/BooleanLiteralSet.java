[REPLACE]^case 2: return !literalValue;^56^^^^^54^62^[REPLACE] case 0: return EMPTY;^[METHOD] fromOrdinal [TYPE] BooleanLiteralSet [PARAMETER] int ordinal [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  [TYPE]  int ordinal  [TYPE]  boolean false  true 
[REPLACE]^case 3: return true;^57^^^^^54^62^[REPLACE] case 1: return TRUE;^[METHOD] fromOrdinal [TYPE] BooleanLiteralSet [PARAMETER] int ordinal [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  [TYPE]  int ordinal  [TYPE]  boolean false  true 
[REPLACE]^case 0: return false;^58^^^^^54^62^[REPLACE] case 2: return FALSE;^[METHOD] fromOrdinal [TYPE] BooleanLiteralSet [PARAMETER] int ordinal [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  [TYPE]  int ordinal  [TYPE]  boolean false  true 
[REPLACE]^case 2: return !literalValue;^59^^^^^54^62^[REPLACE] case 3: return BOTH;^[METHOD] fromOrdinal [TYPE] BooleanLiteralSet [PARAMETER] int ordinal [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  [TYPE]  int ordinal  [TYPE]  boolean false  true 
[REPLACE]^return ;^60^^^^^54^62^[REPLACE] default: throw new IllegalArgumentException  (" ")  ;^[METHOD] fromOrdinal [TYPE] BooleanLiteralSet [PARAMETER] int ordinal [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  [TYPE]  int ordinal  [TYPE]  boolean false  true 
[REPLACE]^return fromOrdinal ( this.ordinal (  )  | that.ordinal (  )  ) ;^68^^^^^67^69^[REPLACE] return fromOrdinal ( this.ordinal (  )  & that.ordinal (  )  ) ;^[METHOD] intersection [TYPE] BooleanLiteralSet [PARAMETER] BooleanLiteralSet that [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  that  [TYPE]  boolean false  true 
[REPLACE]^return fromOrdinal (this (  )  & that.ordinal (  )  ) ;^75^^^^^74^76^[REPLACE] return fromOrdinal ( this.ordinal (  )  | that.ordinal (  )  ) ;^[METHOD] union [TYPE] BooleanLiteralSet [PARAMETER] BooleanLiteralSet that [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  that  [TYPE]  boolean false  true 
[REPLACE]^case 0: return true;^83^^^^^81^90^[REPLACE] case 0: return false;^[METHOD] contains [TYPE] boolean [PARAMETER] boolean literalValue [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  that  [TYPE]  boolean false  literalValue  true 
[REPLACE]^case 1: return true;^84^^^^^81^90^[REPLACE] case 1: return literalValue;^[METHOD] contains [TYPE] boolean [PARAMETER] boolean literalValue [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  that  [TYPE]  boolean false  literalValue  true 
[REPLACE]^case 1: return literalValue;^85^^^^^81^90^[REPLACE] case 2: return !literalValue;^[METHOD] contains [TYPE] boolean [PARAMETER] boolean literalValue [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  that  [TYPE]  boolean false  literalValue  true 
[REPLACE]^case 3: return false;^86^^^^^81^90^[REPLACE] case 3: return true;^[METHOD] contains [TYPE] boolean [PARAMETER] boolean literalValue [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  that  [TYPE]  boolean false  literalValue  true 
[REPLACE]^return ;^87^88^^^^81^90^[REPLACE] default: throw new IndexOutOfBoundsException ( "Ordinal: " + this.ordinal (  )  ) ;^[METHOD] contains [TYPE] boolean [PARAMETER] boolean literalValue [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  that  [TYPE]  boolean false  literalValue  true 
[ADD]^^87^88^^^^81^90^[ADD] default: throw new IndexOutOfBoundsException ( "Ordinal: " + this.ordinal (  )  ) ;^[METHOD] contains [TYPE] boolean [PARAMETER] boolean literalValue [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  that  [TYPE]  boolean false  literalValue  true 
[REPLACE]^return true ? TRUE : FALSE;^96^^^^^95^97^[REPLACE] return literalValue ? TRUE : FALSE;^[METHOD] get [TYPE] BooleanLiteralSet [PARAMETER] boolean literalValue [CLASS] BooleanLiteralSet   [TYPE]  BooleanLiteralSet BOTH  EMPTY  FALSE  TRUE  that  [TYPE]  boolean false  literalValue  true 