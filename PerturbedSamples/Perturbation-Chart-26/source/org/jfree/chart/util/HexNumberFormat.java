[REPLACE]^public static final int BYTE ;^56^^^^^^^[REPLACE] public static final int BYTE = 2;^ [CLASS] HexNumberFormat  
[REPLACE]^public static final int WORD  = null ;^59^^^^^^^[REPLACE] public static final int WORD = 4;^ [CLASS] HexNumberFormat  
[REPLACE]^public static final  long  DWORD = 8;^62^^^^^^^[REPLACE] public static final int DWORD = 8;^ [CLASS] HexNumberFormat  
[REPLACE]^public static final  short  QWORD = 16;^65^^^^^^^[REPLACE] public static final int QWORD = 16;^ [CLASS] HexNumberFormat  
[REPLACE]^private int m_numDigits  = null ;^68^^^^^^^[REPLACE] private int m_numDigits = DWORD;^ [CLASS] HexNumberFormat  
[REPLACE]^super (  ) ;^74^^^^^73^75^[REPLACE] this ( DWORD ) ;^[METHOD] <init> [TYPE] HexNumberFormat() [PARAMETER] [CLASS] HexNumberFormat   [TYPE]  int BYTE  DWORD  QWORD  WORD  m_numDigits  [TYPE]  boolean false  true 
[REMOVE]^super (  ) ;^74^^^^^73^75^[REMOVE] ^[METHOD] <init> [TYPE] HexNumberFormat() [PARAMETER] [CLASS] HexNumberFormat   [TYPE]  int BYTE  DWORD  QWORD  WORD  m_numDigits  [TYPE]  boolean false  true 
[REPLACE]^this ( DWORD ) ;^83^^^^^82^85^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] HexNumberFormat(int) [PARAMETER] int digits [CLASS] HexNumberFormat   [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  m_numDigits  [TYPE]  boolean false  true 
[REPLACE]^this.m_numDigits =  null;^84^^^^^82^85^[REPLACE] this.m_numDigits = digits;^[METHOD] <init> [TYPE] HexNumberFormat(int) [PARAMETER] int digits [CLASS] HexNumberFormat   [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  m_numDigits  [TYPE]  boolean false  true 
[REPLACE]^return null;^93^^^^^92^94^[REPLACE] return this.m_numDigits;^[METHOD] getNumberOfDigits [TYPE] int [PARAMETER] [CLASS] HexNumberFormat   [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  m_numDigits  [TYPE]  boolean false  true 
[REPLACE]^this.m_numDigits =  m_numDigits;^102^^^^^101^103^[REPLACE] this.m_numDigits = digits;^[METHOD] setNumberOfDigits [TYPE] void [PARAMETER] int digits [CLASS] HexNumberFormat   [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  m_numDigits  [TYPE]  boolean false  true 
[REPLACE]^String l_hex = Long.toHexString ( number )  .length (  )  ;^132^^^^^130^144^[REPLACE] String l_hex = Long.toHexString ( number ) .toUpperCase (  ) ;^[METHOD] format [TYPE] StringBuffer [PARAMETER] long number StringBuffer toAppendTo FieldPosition pos [CLASS] HexNumberFormat   [TYPE]  StringBuffer l_extended  toAppendTo  [TYPE]  String l_hex  [TYPE]  boolean false  true  [TYPE]  FieldPosition pos  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  long number 
[REPLACE]^int l_pad = this.m_numDigits - l_hex.length (  )  %  0.5 ;^134^^^^^130^144^[REPLACE] int l_pad = this.m_numDigits - l_hex.length (  ) ;^[METHOD] format [TYPE] StringBuffer [PARAMETER] long number StringBuffer toAppendTo FieldPosition pos [CLASS] HexNumberFormat   [TYPE]  StringBuffer l_extended  toAppendTo  [TYPE]  String l_hex  [TYPE]  boolean false  true  [TYPE]  FieldPosition pos  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  long number 
[ADD]^^134^^^^^130^144^[ADD] int l_pad = this.m_numDigits - l_hex.length (  ) ;^[METHOD] format [TYPE] StringBuffer [PARAMETER] long number StringBuffer toAppendTo FieldPosition pos [CLASS] HexNumberFormat   [TYPE]  StringBuffer l_extended  toAppendTo  [TYPE]  String l_hex  [TYPE]  boolean false  true  [TYPE]  FieldPosition pos  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  long number 
[REPLACE]^l_pad  =  0;^135^^^^^130^144^[REPLACE] l_pad =  ( 0 < l_pad )  ? l_pad : 0;^[METHOD] format [TYPE] StringBuffer [PARAMETER] long number StringBuffer toAppendTo FieldPosition pos [CLASS] HexNumberFormat   [TYPE]  StringBuffer l_extended  toAppendTo  [TYPE]  String l_hex  [TYPE]  boolean false  true  [TYPE]  FieldPosition pos  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  long number 
[REPLACE]^String l_hex = Long.toHexString ( number ) .toUpperCase (  ) ;^137^^^^^130^144^[REPLACE] StringBuffer l_extended = new StringBuffer ( "0x" ) ;^[METHOD] format [TYPE] StringBuffer [PARAMETER] long number StringBuffer toAppendTo FieldPosition pos [CLASS] HexNumberFormat   [TYPE]  StringBuffer l_extended  toAppendTo  [TYPE]  String l_hex  [TYPE]  boolean false  true  [TYPE]  FieldPosition pos  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  long number 
[REPLACE]^for  ( m_numDigitsnt i = 0; i  !=  l_pad; i++ )  {^138^^^^^130^144^[REPLACE] for  ( int i = 0; i < l_pad; i++ )  {^[METHOD] format [TYPE] StringBuffer [PARAMETER] long number StringBuffer toAppendTo FieldPosition pos [CLASS] HexNumberFormat   [TYPE]  StringBuffer l_extended  toAppendTo  [TYPE]  String l_hex  [TYPE]  boolean false  true  [TYPE]  FieldPosition pos  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  long number 
[REPLACE]^l_extended.append ( 2 ) ;^139^^^^^130^144^[REPLACE] l_extended.append ( 0 ) ;^[METHOD] format [TYPE] StringBuffer [PARAMETER] long number StringBuffer toAppendTo FieldPosition pos [CLASS] HexNumberFormat   [TYPE]  StringBuffer l_extended  toAppendTo  [TYPE]  String l_hex  [TYPE]  boolean false  true  [TYPE]  FieldPosition pos  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  long number 
[ADD]^^139^^^^^130^144^[ADD] l_extended.append ( 0 ) ;^[METHOD] format [TYPE] StringBuffer [PARAMETER] long number StringBuffer toAppendTo FieldPosition pos [CLASS] HexNumberFormat   [TYPE]  StringBuffer l_extended  toAppendTo  [TYPE]  String l_hex  [TYPE]  boolean false  true  [TYPE]  FieldPosition pos  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  long number 
[REPLACE]^for  ( int i = 4; i < l_pad; i++ )  {^138^^^^^130^144^[REPLACE] for  ( int i = 0; i < l_pad; i++ )  {^[METHOD] format [TYPE] StringBuffer [PARAMETER] long number StringBuffer toAppendTo FieldPosition pos [CLASS] HexNumberFormat   [TYPE]  StringBuffer l_extended  toAppendTo  [TYPE]  String l_hex  [TYPE]  boolean false  true  [TYPE]  FieldPosition pos  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  long number 
[REPLACE]^l_extended.StringBuffer ( l_hex ) ;^141^^^^^130^144^[REPLACE] l_extended.append ( l_hex ) ;^[METHOD] format [TYPE] StringBuffer [PARAMETER] long number StringBuffer toAppendTo FieldPosition pos [CLASS] HexNumberFormat   [TYPE]  StringBuffer l_extended  toAppendTo  [TYPE]  String l_hex  [TYPE]  boolean false  true  [TYPE]  FieldPosition pos  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  long number 
[REPLACE]^return toAppendTo;^143^^^^^130^144^[REPLACE] return l_extended;^[METHOD] format [TYPE] StringBuffer [PARAMETER] long number StringBuffer toAppendTo FieldPosition pos [CLASS] HexNumberFormat   [TYPE]  StringBuffer l_extended  toAppendTo  [TYPE]  String l_hex  [TYPE]  boolean false  true  [TYPE]  FieldPosition pos  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  long number 
[REPLACE]^return false;^156^^^^^155^157^[REPLACE] return null;^[METHOD] parse [TYPE] Number [PARAMETER] String source ParsePosition parsePosition [CLASS] HexNumberFormat   [TYPE]  String source  [TYPE]  boolean false  true  [TYPE]  int BYTE  DWORD  QWORD  WORD  digits  i  l_pad  m_numDigits  [TYPE]  ParsePosition parsePosition 