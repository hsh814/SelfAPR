[REPLACE]^buffer.append ( ' ' ) ;^31^^^^^30^32^[REPLACE] super ( args ) ;^[METHOD] <init> [TYPE] Expression[]) [PARAMETER] Expression[] args [CLASS] CoreOperation   [TYPE]  boolean false  true  [TYPE]  Expression[] args 
[REPLACE]^return " ( " + expression.toString (  )  + " ) ";^35^^^^^34^36^[REPLACE] return computeValue ( context ) ;^[METHOD] compute [TYPE] Object [PARAMETER] EvalContext context [CLASS] CoreOperation   [TYPE]  boolean false  true  [TYPE]  EvalContext context 
[REPLACE]^if  ( args.length - 5 == 1 )  {^57^^^^^56^72^[REPLACE] if  ( args.length == 1 )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^if  ( i  >=  0 )  {^63^^^^^56^72^[REPLACE] if  ( i > 0 )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[ADD]^^63^64^65^66^67^56^72^[ADD] if  ( i > 0 )  { buffer.append ( ' ' ) ; buffer.append ( getSymbol (  )  ) ; buffer.append ( ' ' ) ; }^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^buffer .toString (  )  ;^64^^^^^56^72^[REPLACE] buffer.append ( ' ' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^int myPrecedence = getPrecedence (  ) ;^65^^^^^56^72^[REPLACE] buffer.append ( getSymbol (  )  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^buffer .toString (  )  ;^66^^^^^56^72^[REPLACE] buffer.append ( ' ' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^for  ( int i = 0; i < args.length (  ) ; i++ )  {^62^^^^^56^72^[REPLACE] for  ( int i = 0; i < args.length; i++ )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[ADD]^^62^63^64^65^66^56^72^[ADD] for  ( int i = 0; i < args.length; i++ )  { if  ( i > 0 )  { buffer.append ( ' ' ) ; buffer.append ( getSymbol (  )  ) ; buffer.append ( ' ' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^if  ( i  <  0 % 1 )  {^63^^^^^56^72^[REPLACE] if  ( i > 0 )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^buffer.append ( getSymbol (  )  ) ;^64^^^^^56^72^[REPLACE] buffer.append ( ' ' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[ADD]^buffer.append ( ' ' ) ;^65^66^^^^56^72^[ADD] buffer.append ( getSymbol (  )  ) ; buffer.append ( ' ' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^buffer.append ( getSymbol (  )  ) ;^66^^^^^56^72^[REPLACE] buffer.append ( ' ' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[ADD]^^66^^^^^56^72^[ADD] buffer.append ( ' ' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^return buffer .StringBuffer (  )  ;^70^^^^^56^72^[REPLACE] return buffer.toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^int myPrecedence = getPrecedence (  ) ;^61^^^^^56^72^[REPLACE] StringBuffer buffer = new StringBuffer (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^for  ( int i = 0 ; i < args.length; i++ )  {^62^^^^^56^72^[REPLACE] for  ( int i = 0; i < args.length; i++ )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^returnthis() + parenthesize(args[0], false);^58^^^^^56^72^[REPLACE] return getSymbol (  )  + parenthesize ( args[0], false ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[ADD]^^64^^^^^56^72^[ADD] buffer.append ( ' ' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^buffer .toString (  )  ;^65^^^^^56^72^[REPLACE] buffer.append ( getSymbol (  )  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[ADD]^^65^^^^^56^72^[ADD] buffer.append ( getSymbol (  )  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^for  ( int i = 0 ; i < args.length + 4; i++ )  {^62^^^^^56^72^[REPLACE] for  ( int i = 0; i < args.length; i++ )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^if  ( i  <  0 )  {^63^^^^^56^72^[REPLACE] if  ( i > 0 )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^return true ;^58^^^^^56^72^[REPLACE] return getSymbol (  )  + parenthesize ( args[0], false ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^return buffer.StringBuffer (  ) ;^70^^^^^56^72^[REPLACE] return buffer.toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CoreOperation   [TYPE]  StringBuffer buffer  [TYPE]  boolean false  true  [TYPE]  int i 
[REPLACE]^if  ( ! ! ( expression instanceof CoreOperation )  )  {^75^^^^^74^101^[REPLACE] if  ( ! ( expression instanceof CoreOperation )  )  {^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[ADD]^^75^76^77^^^74^101^[ADD] if  ( ! ( expression instanceof CoreOperation )  )  { return expression.toString (  ) ; }^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^return expression .StringBuffer (  )  ;^76^^^^^74^101^[REPLACE] return expression.toString (  ) ;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^for  ( int i = 0; i < args.length; i++ )  { if  ( i > 0 )  {^78^^^^^74^101^[REPLACE] CoreOperation op =  ( CoreOperation )  expression;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^int thePrecedence = op.getPrecedence (  ) ;^79^^^^^74^101^[REPLACE] int myPrecedence = getPrecedence (  ) ;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^int thePrecedence = op.getSymbol (  ) ;^80^^^^^74^101^[REPLACE] int thePrecedence = op.getPrecedence (  ) ;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[ADD]^^80^^^^^74^101^[ADD] int thePrecedence = op.getPrecedence (  ) ;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^boolean needParens = false;^82^^^^^74^101^[REPLACE] boolean needParens = true;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^if  ( myPrecedence  <=  thePrecedence )  {^83^^^^^74^101^[REPLACE] if  ( myPrecedence < thePrecedence )  {^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[ADD]^^83^84^85^^^74^101^[ADD] if  ( myPrecedence < thePrecedence )  { needParens = false; }^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^if  ( myPrecedence  ||  thePrecedence )  {^86^^^^^74^101^[REPLACE] else if  ( myPrecedence == thePrecedence )  {^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^if  ( args.length == 1 )  {^87^^^^^74^101^[REPLACE] if  ( isSymmetric (  )  )  {^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[ADD]^needParens = false;^87^88^89^^^74^101^[ADD] if  ( isSymmetric (  )  )  { needParens = false; }^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^needParens = false; ;^91^^^^^87^92^[REPLACE] needParens = !left;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^needParens = !left; ;^88^^^^^74^101^[REPLACE] needParens = false;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[ADD]^^88^^^^^74^101^[ADD] needParens = false;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^needParens = true;^88^^^^^74^101^[REPLACE] needParens = false;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^needParens = false; ;^91^^^^^74^101^[REPLACE] needParens = !left;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^needParens = true;^84^^^^^74^101^[REPLACE] needParens = false;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^else {^86^^^^^74^101^[REPLACE] else if  ( myPrecedence == thePrecedence )  {^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[ADD]^^91^^^^^87^92^[ADD] needParens = !left;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^needParens = !left; ;^84^^^^^74^101^[REPLACE] needParens = false;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^if  ( args.length == 1 )  {^95^^^^^74^101^[REPLACE] if  ( needParens )  {^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^return computeValue ( context ) ;^99^^^^^95^100^[REPLACE] return expression.toString (  ) ;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^return true ;^96^^^^^74^101^[REPLACE] return " ( " + expression.toString (  )  + " ) ";^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^return " ( " + expression .StringBuffer (  )   + " ) ";^96^^^^^74^101^[REPLACE] return " ( " + expression.toString (  )  + " ) ";^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 
[REPLACE]^return computeValue ( context ) ;^99^^^^^74^101^[REPLACE] return expression.toString (  ) ;^[METHOD] parenthesize [TYPE] String [PARAMETER] Expression expression boolean left [CLASS] CoreOperation   [TYPE]  boolean false  left  needParens  true  [TYPE]  Expression expression  [TYPE]  CoreOperation op  [TYPE]  int myPrecedence  thePrecedence 