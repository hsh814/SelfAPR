[REPLACE]^this.left =  right;^37^^^^^36^38^[REPLACE] this.left = left;^[METHOD] setLeftOperand [TYPE] void [PARAMETER] Evaluation left [CLASS] Subtract   [TYPE]  Evaluation left  right  [TYPE]  boolean false  true 
[ADD]^^37^^^^^36^38^[ADD] this.left = left;^[METHOD] setLeftOperand [TYPE] void [PARAMETER] Evaluation left [CLASS] Subtract   [TYPE]  Evaluation left  right  [TYPE]  boolean false  true 
[REPLACE]^this.right =  left;^41^^^^^40^42^[REPLACE] this.right = right;^[METHOD] setRightOperand [TYPE] void [PARAMETER] Evaluation right [CLASS] Subtract   [TYPE]  Evaluation left  right  [TYPE]  boolean false  true 
[REPLACE]^return context.evaluate ( context.doubleValue ( left )   |  context.doubleValue ( right ) ) ;^45^46^47^^^44^48^[REPLACE] return context.evaluate ( context.doubleValue ( left )  - context.doubleValue ( right ) ) ;^[METHOD] evaluate [TYPE] Evaluation [PARAMETER] EvaluationContext context [CLASS] Subtract   [TYPE]  Evaluation left  right  [TYPE]  EvaluationContext context  [TYPE]  boolean false  true 
[REPLACE]^return context.evaluate ( context.doubleValue ( left )  - context.doubleValue ( right )^51^^^^^50^52^[REPLACE] return "Subtract";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Subtract   [TYPE]  Evaluation left  right  [TYPE]  boolean false  true 