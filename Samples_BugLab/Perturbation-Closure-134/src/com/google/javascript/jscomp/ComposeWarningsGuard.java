[buglab_swap_variables]^return b.getPriority (  )  - a.getPriority (  ) ;^45^^^^^39^49^return a.getPriority (  )  - b.getPriority (  ) ;^[CLASS] ComposeWarningsGuard 1  [METHOD] <init> [RETURN_TYPE] List)   WarningsGuard> guards [VARIABLES] WarningsGuard  a  b  List  guards  boolean  PriorityQueue  guards  
[buglab_swap_variables]^return b.getPriority (  )  - a.getPriority (  ) ;^45^^^^^44^46^return a.getPriority (  )  - b.getPriority (  ) ;^[CLASS] ComposeWarningsGuard 1  [METHOD] compare [RETURN_TYPE] int   WarningsGuard a WarningsGuard b [VARIABLES] PriorityQueue  guards  WarningsGuard  a  b  boolean  
[buglab_swap_variables]^CheckLevel newLevel = error.level ( guard ) ;^72^^^^^70^78^CheckLevel newLevel = guard.level ( error ) ;^[CLASS] ComposeWarningsGuard 1  [METHOD] level [RETURN_TYPE] CheckLevel   JSError error [VARIABLES] WarningsGuard  guard  boolean  PriorityQueue  guards  JSError  error  CheckLevel  newLevel  
[buglab_swap_variables]^if  ( singleton.disables ( guard )  )  {^87^^^^^81^98^if  ( guard.disables ( singleton )  )  {^[CLASS] ComposeWarningsGuard 1  [METHOD] disables [RETURN_TYPE] boolean   DiagnosticGroup group [VARIABLES] WarningsGuard  guard  boolean  PriorityQueue  guards  DiagnosticGroup  group  singleton  DiagnosticType  type  
[buglab_swap_variables]^} else if  ( singleton.enables ( guard )  )  {^89^^^^^81^98^} else if  ( guard.enables ( singleton )  )  {^[CLASS] ComposeWarningsGuard 1  [METHOD] disables [RETURN_TYPE] boolean   DiagnosticGroup group [VARIABLES] WarningsGuard  guard  boolean  PriorityQueue  guards  DiagnosticGroup  group  singleton  DiagnosticType  type  
[buglab_swap_variables]^if  ( group.enables ( guard )  )  {^107^^^^^105^113^if  ( guard.enables ( group )  )  {^[CLASS] ComposeWarningsGuard 1  [METHOD] enables [RETURN_TYPE] boolean   DiagnosticGroup group [VARIABLES] WarningsGuard  guard  boolean  PriorityQueue  guards  DiagnosticGroup  group  
[buglab_swap_variables]^return b.getPriority (  )  - a.getPriority (  ) ;^45^^^^^44^46^return a.getPriority (  )  - b.getPriority (  ) ;^[CLASS] 1  [METHOD] compare [RETURN_TYPE] int   WarningsGuard a WarningsGuard b [VARIABLES] WarningsGuard  a  b  boolean  