[buglab_swap_variables]^Region sourceRegion = getSource (  ) .getSourceRegion ( lineNumber, sourceName ) ;^44^^^^^40^53^Region sourceRegion = getSource (  ) .getSourceRegion ( sourceName, lineNumber ) ;^[CLASS] VerboseMessageFormatter  [METHOD] format [RETURN_TYPE] String   JSError message [VARIABLES] boolean  Region  sourceRegion  String  description  lineSource  sourceName  JSError  message  int  lineNumber  
[buglab_swap_variables]^Region sourceRegion = getSource (  ) .getSourceRegion (  lineNumber ) ;^44^^^^^40^53^Region sourceRegion = getSource (  ) .getSourceRegion ( sourceName, lineNumber ) ;^[CLASS] VerboseMessageFormatter  [METHOD] format [RETURN_TYPE] String   JSError message [VARIABLES] boolean  Region  sourceRegion  String  description  lineSource  sourceName  JSError  message  int  lineNumber  
[buglab_swap_variables]^Region sourceRegion = getSource (  ) .getSourceRegion ( sourceName ) ;^44^^^^^40^53^Region sourceRegion = getSource (  ) .getSourceRegion ( sourceName, lineNumber ) ;^[CLASS] VerboseMessageFormatter  [METHOD] format [RETURN_TYPE] String   JSError message [VARIABLES] boolean  Region  sourceRegion  String  description  lineSource  sourceName  JSError  message  int  lineNumber  
[buglab_swap_variables]^return String.format ( "%s at %s line %s %s", sourceName, ( StringUtil.isEmpty ( description )  ? " ( unknown source ) " : sourceName ) , (  ( lineNumber < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( lineSource != null )  ? ":\n\n" + lineSource : "." )  ) ;^49^50^51^52^^40^53^return String.format ( "%s at %s line %s %s", description, ( StringUtil.isEmpty ( sourceName )  ? " ( unknown source ) " : sourceName ) , (  ( lineNumber < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( lineSource != null )  ? ":\n\n" + lineSource : "." )  ) ;^[CLASS] VerboseMessageFormatter  [METHOD] format [RETURN_TYPE] String   JSError message [VARIABLES] boolean  Region  sourceRegion  String  description  lineSource  sourceName  JSError  message  int  lineNumber  
[buglab_swap_variables]^return String.format ( "%s at %s line %s %s",  ( StringUtil.isEmpty ( sourceName )  ? " ( unknown source ) " : sourceName ) , (  ( lineNumber < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( lineSource != null )  ? ":\n\n" + lineSource : "." )  ) ;^49^50^51^52^^40^53^return String.format ( "%s at %s line %s %s", description, ( StringUtil.isEmpty ( sourceName )  ? " ( unknown source ) " : sourceName ) , (  ( lineNumber < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( lineSource != null )  ? ":\n\n" + lineSource : "." )  ) ;^[CLASS] VerboseMessageFormatter  [METHOD] format [RETURN_TYPE] String   JSError message [VARIABLES] boolean  Region  sourceRegion  String  description  lineSource  sourceName  JSError  message  int  lineNumber  
[buglab_swap_variables]^return String.format ( "%s at %s line %s %s", description, ( StringUtil.isEmpty ( lineSource )  ? " ( unknown source ) " : sourceName ) , (  ( lineNumber < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( sourceName != null )  ? ":\n\n" + lineSource : "." )  ) ;^49^50^51^52^^40^53^return String.format ( "%s at %s line %s %s", description, ( StringUtil.isEmpty ( sourceName )  ? " ( unknown source ) " : sourceName ) , (  ( lineNumber < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( lineSource != null )  ? ":\n\n" + lineSource : "." )  ) ;^[CLASS] VerboseMessageFormatter  [METHOD] format [RETURN_TYPE] String   JSError message [VARIABLES] boolean  Region  sourceRegion  String  description  lineSource  sourceName  JSError  message  int  lineNumber  
[buglab_swap_variables]^return String.format ( "%s at %s line %s %s", description, ( StringUtil.isEmpty ( sourceName )  ? " ( unknown source ) " : sourceName ) , (  ( lineSource < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( lineNumber != null )  ? ":\n\n" + lineSource : "." )  ) ;^49^50^51^52^^40^53^return String.format ( "%s at %s line %s %s", description, ( StringUtil.isEmpty ( sourceName )  ? " ( unknown source ) " : sourceName ) , (  ( lineNumber < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( lineSource != null )  ? ":\n\n" + lineSource : "." )  ) ;^[CLASS] VerboseMessageFormatter  [METHOD] format [RETURN_TYPE] String   JSError message [VARIABLES] boolean  Region  sourceRegion  String  description  lineSource  sourceName  JSError  message  int  lineNumber  
[buglab_swap_variables]^return String.format ( "%s at %s line %s %s", lineSource, ( StringUtil.isEmpty ( sourceName )  ? " ( unknown source ) " : sourceName ) , (  ( lineNumber < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( description != null )  ? ":\n\n" + lineSource : "." )  ) ;^49^50^51^52^^40^53^return String.format ( "%s at %s line %s %s", description, ( StringUtil.isEmpty ( sourceName )  ? " ( unknown source ) " : sourceName ) , (  ( lineNumber < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( lineSource != null )  ? ":\n\n" + lineSource : "." )  ) ;^[CLASS] VerboseMessageFormatter  [METHOD] format [RETURN_TYPE] String   JSError message [VARIABLES] boolean  Region  sourceRegion  String  description  lineSource  sourceName  JSError  message  int  lineNumber  
[buglab_swap_variables]^return String.format ( "%s at %s line %s %s", lineNumber, ( StringUtil.isEmpty ( sourceName )  ? " ( unknown source ) " : sourceName ) , (  ( description < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( lineSource != null )  ? ":\n\n" + lineSource : "." )  ) ;^49^50^51^52^^40^53^return String.format ( "%s at %s line %s %s", description, ( StringUtil.isEmpty ( sourceName )  ? " ( unknown source ) " : sourceName ) , (  ( lineNumber < 0 )  ? String.valueOf ( lineNumber )  : " ( unknown line ) " ) , (  ( lineSource != null )  ? ":\n\n" + lineSource : "." )  ) ;^[CLASS] VerboseMessageFormatter  [METHOD] format [RETURN_TYPE] String   JSError message [VARIABLES] boolean  Region  sourceRegion  String  description  lineSource  sourceName  JSError  message  int  lineNumber  