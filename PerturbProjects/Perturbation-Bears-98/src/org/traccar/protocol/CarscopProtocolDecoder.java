[REPLACE]^private static final Pattern PATTERN  = null ;^35^36^37^38^^35^49^[REPLACE] private static final Pattern PATTERN = new PatternBuilder (  ) .text ( "*" ) .any (  ) .number ( " ( dd )  ( dd )  ( dd ) " )^ [CLASS] CarscopProtocolDecoder  
[ADD]^^58^^^^^53^95^[ADD] int index = sentence.indexOf ( "UB05" ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^if  ( index  ==  -0 )  {^59^^^^^53^95^[REPLACE] if  ( index != -1 )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^deviceSession = getDeviceSession ( channel, remoteAddress, imei )  ;^63^^^^^59^64^[REPLACE] deviceSession = getDeviceSession ( channel, remoteAddress ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^deviceSession = getDeviceSession ( channel, remoteAddress )  ;^61^^^^^53^95^[REPLACE] deviceSession = getDeviceSession ( channel, remoteAddress, imei ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^String imei = sentence.substring ( index  4, index  4  15 ) ;^60^^^^^53^95^[REPLACE] String imei = sentence.substring ( index + 4, index + 4 + 15 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^deviceSession = getDeviceSession ( channel, remoteAddress, imei )  ;^63^^^^^53^95^[REPLACE] deviceSession = getDeviceSession ( channel, remoteAddress ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^if  ( deviceSession != this )  {^65^^^^^53^95^[REPLACE] if  ( deviceSession == null )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^return true;^66^^^^^53^95^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^return false;^66^^^^^53^95^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^Parser parser = new Parser ( PATTERN, imei ) ;^69^^^^^53^95^[REPLACE] Parser parser = new Parser ( PATTERN, sentence ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^if  ( parser.matches (  )  )  {^70^^^^^53^95^[REPLACE] if  ( !parser.matches (  )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^return false;^71^^^^^53^95^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^return true;^71^^^^^53^95^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[ADD]^^74^^^^^53^95^[ADD] Position position = new Position (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position .setValid (  )  ;^75^^^^^53^95^[REPLACE] position.setDeviceId ( deviceSession.getDeviceId (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position .setTime (  )  ;^76^^^^^53^95^[REPLACE] position.setProtocol ( getProtocolName (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^DateBuilder dateBuilder = new DateBuilder (  ) .setTime ( parser.next (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^78^79^^^^53^95^[REPLACE] DateBuilder dateBuilder = new DateBuilder (  ) .setTime ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser.nextDouble (  )  )  ;^81^^^^^53^95^[REPLACE] position.setValid ( parser.next (  ) .equals ( "A" )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[ADD]^^81^82^^^^53^95^[ADD] position.setValid ( parser.next (  ) .equals ( "A" )  ) ; position.setLatitude ( parser.nextCoordinate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.setValid ( parser.next (  ) .number ( "A" )  ) ;^81^^^^^53^95^[REPLACE] position.setValid ( parser.next (  ) .equals ( "A" )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.setValid ( parser.nextInt (  ) .equals ( "A" )  ) ;^81^^^^^53^95^[REPLACE] position.setValid ( parser.next (  ) .equals ( "A" )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.setLongitude ( parser.nextCoordinate (  )  )  ;^82^^^^^53^95^[REPLACE] position.setLatitude ( parser.nextCoordinate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^parser.nextInt (  )  ;^82^^^^^53^95^[REPLACE] position.setLatitude ( parser.nextCoordinate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.setLatitude ( parser.nextCoordinate (  )  )  ;^83^^^^^53^95^[REPLACE] position.setLongitude ( parser.nextCoordinate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[ADD]^^83^^^^^53^95^[ADD] position.setLongitude ( parser.nextCoordinate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.setLongitude ( parser.nextInt (  )  ) ;^83^^^^^53^95^[REPLACE] position.setLongitude ( parser.nextCoordinate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REMOVE]^parser.nextInt (  )  ;^83^^^^^53^95^[REMOVE] ^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser.nextInt (  )  ) ;^84^^^^^53^95^[REPLACE] position.setSpeed ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^dateBuilder.setDate ( parser.next (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^86^^^^^53^95^[REPLACE] dateBuilder.setDate ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[ADD]^position.setTime ( dateBuilder.getDate (  )  ) ;^86^87^^^^53^95^[ADD] dateBuilder.setDate ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ; position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^dateBuilder.setDate ( parser .next (  )  , parser^86^^^^^53^95^[REPLACE] dateBuilder.setDate ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[ADD]^^86^^^^^53^95^[ADD] dateBuilder.setDate ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position .setDate (  )  ;^87^^^^^53^95^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.setTime ( dateBuilder .setDate (  )   ) ;^87^^^^^53^95^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser.nextDouble (  )  )  ;^89^^^^^53^95^[REPLACE] position.setCourse ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.setCourse ( parser.nextInt (  )  ) ;^89^^^^^53^95^[REPLACE] position.setCourse ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[ADD]^^89^^^^^53^95^[ADD] position.setCourse ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_ODOMETER, parser.nextInt (  )  )  ;^91^^^^^53^95^[REPLACE] position.set ( Position.KEY_STATUS, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_STATUS, parser.nextInt (  )  ) ;^91^^^^^53^95^[REPLACE] position.set ( Position.KEY_STATUS, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[ADD]^^91^^^^^53^95^[ADD] position.set ( Position.KEY_STATUS, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_STATUS, parser.next (  )  )  ;^92^^^^^53^95^[REPLACE] position.set ( Position.KEY_ODOMETER, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_ODOMETER, parser.next (  )  ) ;^92^^^^^53^95^[REPLACE] position.set ( Position.KEY_ODOMETER, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] CarscopProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int index  [TYPE]  Parser parser 