[REPLACE]^private static final Pattern PATTERN_HEADER ;^37^38^39^40^^37^43^[REPLACE] private static final Pattern PATTERN_HEADER = new PatternBuilder (  ) .number ( "# ( d+ ) #" ) .expression ( "[^#]*#" ) .number ( "d+#" )^ [CLASS] Tlt2hProtocolDecoder  
[REPLACE]^private static final Pattern PATTERN_POSITION  = null ;^45^46^47^48^^45^58^[REPLACE] private static final Pattern PATTERN_POSITION = new PatternBuilder (  ) .number ( "# ( x+ ) ?" ) .text ( "$GPRMC," ) .number ( " ( dd )  ( dd )  ( dd ) . ( d+ ) ," )^ [CLASS] Tlt2hProtocolDecoder  
[REPLACE]^sentence =  status.trim (  ) ;^65^^^^^62^113^[REPLACE] sentence = sentence.trim (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^String[] messages = sentence.substring (  (  ( sentence.indexOf ( '\n' )  )  + 1 )  ) .split ( "\r\n" )  ;^67^^^^^62^113^[REPLACE] String header = sentence.substring ( 0, sentence.indexOf ( '\r' )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^Parser parser = new Parser ( PATTERN_HEADER, status ) ;^68^^^^^62^113^[REPLACE] Parser parser = new Parser ( PATTERN_HEADER, header ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^if  ( parser.matches (  )  )  {^69^^^^^62^113^[REPLACE] if  ( !parser.matches (  )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return true;^70^^^^^62^113^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return this;^70^^^^^62^113^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, parser.nextInt (  )  ) ;^73^^^^^62^113^[REPLACE] DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^if  ( deviceSession != this )  {^74^^^^^62^113^[REPLACE] if  ( deviceSession == null )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return true;^75^^^^^62^113^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return false;^75^^^^^62^113^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^String status = parser.nextInt (  ) ;^78^^^^^62^113^[REPLACE] String status = parser.next (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^80^81^^^^62^113^[ADD] String[] messages = sentence.substring ( sentence.indexOf ( '\n' )  + 1 ) .split ( "\r\n" ) ; List<Position> positions = new LinkedList<> (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^if  ( ! ( parser.matches (  )  )  || ( parser.matches (  )  )  {^85^^^^^62^113^[REPLACE] if  ( parser.matches (  )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^85^86^87^88^89^62^113^[ADD] if  ( parser.matches (  )  )  {  Position position = new Position (  ) ; position.setProtocol ( getProtocolName (  )  ) ; position.setDeviceId ( deviceSession.getDeviceId (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^87^88^^^^62^113^[ADD] Position position = new Position (  ) ; position.setProtocol ( getProtocolName (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^DateBuilder dateBuilder = new DateBuilder (  ) .setTime ( parser .next (  )  , parser^93^94^^^^62^113^[REPLACE] DateBuilder dateBuilder = new DateBuilder (  ) .setTime ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^83^84^85^^87^62^113^[ADD] for  ( String message : messages )  { parser = new Parser ( PATTERN_POSITION, message ) ; if  ( parser.matches (  )  )  { Position position = new Position (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^DateBuilder dateBuilder = new DateBuilder (  ) .setTime ( parser.next (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^93^94^^^^62^113^[REPLACE] DateBuilder dateBuilder = new DateBuilder (  ) .setTime ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^84^^^^^62^113^[ADD] parser = new Parser ( PATTERN_POSITION, message ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^93^94^^^^62^113^[ADD] DateBuilder dateBuilder = new DateBuilder (  ) .setTime ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return 0;^112^^^^^62^113^[REPLACE] return positions;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Tlt2hProtocolDecoder   [TYPE]  Pattern PATTERN_HEADER  PATTERN_POSITION  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  String header  message  sentence  status  [TYPE]  String[] messages  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 