[REPLACE]^private static final Pattern PATTERN =  new DateBuilder (  )  .text ( "+RESP:" ) .expression ( "GT...," ) .number ( " ( d{15} ) ," )^35^36^37^38^^35^56^[REPLACE] private static final Pattern PATTERN = new PatternBuilder (  ) .text ( "+RESP:" ) .expression ( "GT...," ) .number ( " ( d{15} ) ," )^ [CLASS] Gl100ProtocolDecoder  
[REPLACE]^if  ( sentence.contains ( "AT+GTHBD=" )  && channel == true )  {^64^^^^^60^98^[REPLACE] if  ( sentence.contains ( "AT+GTHBD=" )  && channel != null )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^String response = "+RESP:GTHBD,GPRS ACTIVE,";response += sentence.substring ( 9, sentence.lastIndexOf ( ',' )  ) ;response += '\0';channel.write ( response ) ;^64^65^66^67^68^60^98^[ADD] if  ( sentence.contains ( "AT+GTHBD=" )  && channel != null )  { String response = "+RESP:GTHBD,GPRS ACTIVE,"; response += sentence.substring ( 9, sentence.lastIndexOf ( ',' )  ) ; response += '\0'; channel.write ( response ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^response += sentence.substring ( 3, sentence.lastIndexOf ( ',' )  ) ;^66^^^^^60^98^[REPLACE] response += sentence.substring ( 9, sentence.lastIndexOf ( ',' )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^67^^^^^60^98^[ADD] response += '\0';^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^response += sentence.substring ( 6, sentence.lastIndexOf ( ',' )  ) ;^66^^^^^60^98^[REPLACE] response += sentence.substring ( 9, sentence.lastIndexOf ( ',' )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^response + = null ;^67^^^^^60^98^[REPLACE] response += '\0';^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^Parser parser = new Parser ( PATTERN, response ) ;^71^^^^^60^98^[REPLACE] Parser parser = new Parser ( PATTERN, sentence ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^if  ( parser.matches (  )  )  {^72^^^^^60^98^[REPLACE] if  ( !parser.matches (  )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return this;^73^^^^^60^98^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^position.setProtocol ( getProtocolName (  )  ) ;^76^77^^^^60^98^[ADD] Position position = new Position (  ) ; position.setProtocol ( getProtocolName (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position .setCourse (  )  ;^77^^^^^60^98^[REPLACE] position.setProtocol ( getProtocolName (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, parser .nextInt (  )   ) ;^79^^^^^60^98^[REPLACE] DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^if  ( deviceSession != null )  {^80^^^^^60^98^[REPLACE] if  ( deviceSession == null )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return true;^81^^^^^60^98^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position .setValid (  )  ;^83^^^^^60^98^[REPLACE] position.setDeviceId ( deviceSession.getDeviceId (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^83^^^^^60^98^[ADD] position.setDeviceId ( deviceSession.getDeviceId (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser.nextDouble (  )  )  ;^85^^^^^60^98^[REPLACE] position.setValid ( parser.nextInt (  )  == 0 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^parser.nextInt (  )  ;^85^^^^^60^98^[REPLACE] position.setValid ( parser.nextInt (  )  == 0 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position .setValid (  )  ;^86^^^^^60^98^[REPLACE] position.setSpeed ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser .next (  )   ) ;^86^^^^^60^98^[REPLACE] position.setSpeed ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser.nextDouble (  )  )  ;^87^^^^^60^98^[REPLACE] position.setCourse ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setCourse ( parser .next (  )   ) ;^87^^^^^60^98^[REPLACE] position.setCourse ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setLatitude ( parser.nextDouble (  )  )  ;^88^^^^^60^98^[REPLACE] position.setAltitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setAltitude ( parser.next (  )  ) ;^88^^^^^60^98^[REPLACE] position.setAltitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setLatitude ( parser.nextDouble (  )  )  ;^89^^^^^60^98^[REPLACE] position.setLongitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^parser.next (  )  ;^89^^^^^60^98^[REPLACE] position.setLongitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^89^^^^^60^98^[ADD] position.setLongitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setAltitude ( parser.nextDouble (  )  )  ;^90^^^^^60^98^[REPLACE] position.setLatitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setLatitude ( parser .next (  )   ) ;^90^^^^^60^98^[REPLACE] position.setLatitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^DateBuilder dateBuilder = new DateBuilder (  ) .setDate ( parser .next (  )  , parser^92^93^94^^^60^98^[REPLACE] DateBuilder dateBuilder = new DateBuilder (  ) .setDate ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) .setTime ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position .getProtocolName (  )  ;^95^^^^^60^98^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setTime ( dateBuilder.setDate (  )  ) ;^95^^^^^60^98^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Gl100ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String response  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 