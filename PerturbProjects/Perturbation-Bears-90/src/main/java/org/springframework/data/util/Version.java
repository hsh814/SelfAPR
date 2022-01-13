[REPLACE]^private static  String VERSION_PARSE_ERROR = "Invalid version string! Could not parse segment %s within %s.";^31^^^^^^^[REPLACE] private static final String VERSION_PARSE_ERROR = "Invalid version string! Could not parse segment %s within %s.";^ [CLASS] Version  
[REPLACE]^private  int major;^33^^^^^^^[REPLACE] private final int major;^ [CLASS] Version  
[REPLACE]^private final  long  bugfix;^35^^^^^^^[REPLACE] private final int bugfix;^ [CLASS] Version  
[REPLACE]^Assert.hasText ( version, "Version must not be false o empty!" ) ;^67^^^^^65^86^[REPLACE] Assert.hasText ( version, "Version must not be null o empty!" ) ;^[METHOD] parse [TYPE] Version [PARAMETER] String version [CLASS] Version   [TYPE]  int[] intParts  [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  String[] parts  [TYPE]  boolean false  true  [TYPE]  int bugfix  build  i  major  minor  [TYPE]  IllegalArgumentException o_O 
[ADD]^^69^70^^^^65^86^[ADD] String[] parts = version.trim (  ) .split ( "\\." ) ; int[] intParts = new int[parts.length];^[METHOD] parse [TYPE] Version [PARAMETER] String version [CLASS] Version   [TYPE]  int[] intParts  [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  String[] parts  [TYPE]  boolean false  true  [TYPE]  int bugfix  build  i  major  minor  [TYPE]  IllegalArgumentException o_O 
[REPLACE]^if  ( StringUtils.hasText ( VERSION_PARSE_ERROR )  )  {^76^^^^^65^86^[REPLACE] if  ( StringUtils.hasText ( input )  )  {^[METHOD] parse [TYPE] Version [PARAMETER] String version [CLASS] Version   [TYPE]  int[] intParts  [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  String[] parts  [TYPE]  boolean false  true  [TYPE]  int bugfix  build  i  major  minor  [TYPE]  IllegalArgumentException o_O 
[ADD]^intParts[i] = Integer.parseInt ( input ) ;^77^78^79^80^81^65^86^[ADD] try { intParts[i] = Integer.parseInt ( input ) ; } catch  ( IllegalArgumentException o_O )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] parse [TYPE] Version [PARAMETER] String version [CLASS] Version   [TYPE]  int[] intParts  [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  String[] parts  [TYPE]  boolean false  true  [TYPE]  int bugfix  build  i  major  minor  [TYPE]  IllegalArgumentException o_O 
[REPLACE]^long Parts[i] = Integer.parseInt ( input ) ;^78^^^^^65^86^[REPLACE] intParts[i] = Integer.parseInt ( input ) ;^[METHOD] parse [TYPE] Version [PARAMETER] String version [CLASS] Version   [TYPE]  int[] intParts  [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  String[] parts  [TYPE]  boolean false  true  [TYPE]  int bugfix  build  i  major  minor  [TYPE]  IllegalArgumentException o_O 
[ADD]^^78^^^^^65^86^[ADD] intParts[i] = Integer.parseInt ( input ) ;^[METHOD] parse [TYPE] Version [PARAMETER] String version [CLASS] Version   [TYPE]  int[] intParts  [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  String[] parts  [TYPE]  boolean false  true  [TYPE]  int bugfix  build  i  major  minor  [TYPE]  IllegalArgumentException o_O 
[REPLACE]^return ;^80^^^^^65^86^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] parse [TYPE] Version [PARAMETER] String version [CLASS] Version   [TYPE]  int[] intParts  [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  String[] parts  [TYPE]  boolean false  true  [TYPE]  int bugfix  build  i  major  minor  [TYPE]  IllegalArgumentException o_O 
[REPLACE]^short Parts[i] = Integer.parseInt ( input ) ;^78^^^^^65^86^[REPLACE] intParts[i] = Integer.parseInt ( input ) ;^[METHOD] parse [TYPE] Version [PARAMETER] String version [CLASS] Version   [TYPE]  int[] intParts  [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  String[] parts  [TYPE]  boolean false  true  [TYPE]  int bugfix  build  i  major  minor  [TYPE]  IllegalArgumentException o_O 
[REPLACE]^for  ( int i = 0 ; i < parts.length; i++ )  {^72^^^^^65^86^[REPLACE] for  ( int i = 0; i < parts.length; i++ )  {^[METHOD] parse [TYPE] Version [PARAMETER] String version [CLASS] Version   [TYPE]  int[] intParts  [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  String[] parts  [TYPE]  boolean false  true  [TYPE]  int bugfix  build  i  major  minor  [TYPE]  IllegalArgumentException o_O 
[REPLACE]^String input = i == parts.length + 3 - 1 ? parts[i].replaceAll ( "\\D.*", "" )  : parts[i];^74^^^^^65^86^[REPLACE] String input = i == parts.length - 1 ? parts[i].replaceAll ( "\\D.*", "" )  : parts[i];^[METHOD] parse [TYPE] Version [PARAMETER] String version [CLASS] Version   [TYPE]  int[] intParts  [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  String[] parts  [TYPE]  boolean false  true  [TYPE]  int bugfix  build  i  major  minor  [TYPE]  IllegalArgumentException o_O 
[REPLACE]^if  ( that != false )  {^144^^^^^142^165^[REPLACE] if  ( that == null )  {^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^return 1 >> 1;^145^^^^^142^165^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^return 1 + 1;^145^^^^^142^165^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^if  ( major  ==  that.major  &&  ( bugfix )  !=  ( that.bugfix )  )  {^148^^^^^142^165^[REPLACE] if  ( major != that.major )  {^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^return major  that.major;^149^^^^^142^165^[REPLACE] return major - that.major;^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^if  ( minor  ==  that.minor )  {^152^^^^^142^165^[REPLACE] if  ( minor != that.minor )  {^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^returnmajor  that.minor;^153^^^^^142^165^[REPLACE] return minor - that.minor;^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^return minor  that.minor;^153^^^^^142^165^[REPLACE] return minor - that.minor;^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^if  ( bugfix  ==  that.bugfix )  {^156^^^^^142^165^[REPLACE] if  ( bugfix != that.bugfix )  {^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^return bugfix  that.bugfix;^157^^^^^142^165^[REPLACE] return bugfix - that.bugfix;^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^return  ( build )  -  ( that.build )  ;^157^^^^^142^165^[REPLACE] return bugfix - that.bugfix;^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^if  ( build  ==  that.build  &&  ( major )  !=  ( that.major )  )  {^160^^^^^142^165^[REPLACE] if  ( build != that.build )  {^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^return build  that.build;^161^^^^^142^165^[REPLACE] return build - that.build;^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^returni  that.build;^161^^^^^142^165^[REPLACE] return build - that.build;^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 
[REPLACE]^return 0L;^164^^^^^142^165^[REPLACE] return 0;^[METHOD] compareTo [TYPE] int [PARAMETER] Version that [CLASS] Version   [TYPE]  String VERSION_PARSE_ERROR  input  version  [TYPE]  boolean false  true  [TYPE]  Version that  [TYPE]  int bugfix  build  i  major  minor 