[REPLACE]^private static final Pattern PATTERN  = null ;^36^37^38^39^^36^49^[REPLACE] private static final Pattern PATTERN = new PatternBuilder (  ) .number ( " ( d+ ) ," ) .number ( " ( dddd )  ( dd )  ( dd ) " ) .number ( " ( dd )  ( dd )  ( dd ) ," )^ [CLASS] Ardi01ProtocolDecoder  
[REPLACE]^if  ( parser.matches (  )  )  {^56^^^^^53^89^[REPLACE] if  ( !parser.matches (  )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^return this;^57^^^^^53^89^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[ADD]^^60^^^^^53^89^[ADD] Position position = new Position (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.set ( getProtocolName (  )  ) ;^61^^^^^53^89^[REPLACE] position.setProtocol ( getProtocolName (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, parser.nextInt (  )  ) ;^63^^^^^53^89^[REPLACE] DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^if  ( deviceSession != null )  {^64^^^^^53^89^[REPLACE] if  ( deviceSession == null )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[ADD]^return null;^64^65^66^^^53^89^[ADD] if  ( deviceSession == null )  { return null; }^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^return this;^65^^^^^53^89^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^return true;^65^^^^^53^89^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^DateBuilder dateBuilder = new DateBuilder (  ) .setDate ( parser .next (  )  , parser^69^70^71^^^53^89^[REPLACE] DateBuilder dateBuilder = new DateBuilder (  ) .setDate ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) .setTime ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.set ( dateBuilder.getDate (  )  ) ;^72^^^^^53^89^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[ADD]^^72^^^^^53^89^[ADD] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.setTime ( dateBuilder.setDate (  )  ) ;^72^^^^^53^89^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.setLongitude ( parser .next (  )   ) ;^74^^^^^53^89^[REPLACE] position.setLongitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[ADD]^^74^^^^^53^89^[ADD] position.setLongitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^parser.next (  )  ;^74^^^^^53^89^[REPLACE] position.setLongitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.setAltitude ( parser.nextDouble (  )  )  ;^75^^^^^53^89^[REPLACE] position.setLatitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[ADD]^position.setSpeed ( UnitsConverter.knotsFromKph ( parser.nextDouble (  )  )  ) ;^75^76^^^^53^89^[ADD] position.setLatitude ( parser.nextDouble (  )  ) ; position.setSpeed ( UnitsConverter.knotsFromKph ( parser.nextDouble (  )  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.setLatitude ( parser.next (  )  ) ;^75^^^^^53^89^[REPLACE] position.setLatitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^knotsFromKph ( parser.nextDouble (  )  )  ;^76^^^^^53^89^[REPLACE] position.setSpeed ( UnitsConverter.knotsFromKph ( parser.nextDouble (  )  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( UnitsConverter.knotsFromKph ( parser .next (  )   )  ) ;^76^^^^^53^89^[REPLACE] position.setSpeed ( UnitsConverter.knotsFromKph ( parser.nextDouble (  )  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( UnitsConverter.knotsFromKph ( parser.next (  )  )  ) ;^76^^^^^53^89^[REPLACE] position.setSpeed ( UnitsConverter.knotsFromKph ( parser.nextDouble (  )  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.setCourse ( parser.next (  )  ) ;^77^^^^^53^89^[REPLACE] position.setCourse ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.set ( parser.nextDouble (  )  ) ;^78^^^^^53^89^[REPLACE] position.setAltitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.setAltitude ( parser.next (  )  ) ;^78^^^^^53^89^[REPLACE] position.setAltitude ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[ADD]^position.setValid ( satellites >= 3 ) ;^80^81^^^^53^89^[ADD] int satellites = parser.nextInt (  ) ; position.setValid ( satellites >= 3 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.setValid ( satellites  <  2 ) ;^81^^^^^53^89^[REPLACE] position.setValid ( satellites >= 3 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_BATTERY, parser.next (  )  )  ;^82^^^^^53^89^[REPLACE] position.set ( Position.KEY_SATELLITES, satellites ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position .set ( satellites )  ;^84^^^^^53^89^[REPLACE] position.set ( Position.KEY_EVENT, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^parser.nextInt (  )  ;^84^^^^^53^89^[REPLACE] position.set ( Position.KEY_EVENT, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_BATTERY, parser.nextInt (  )  ) ;^85^^^^^53^89^[REPLACE] position.set ( Position.KEY_BATTERY, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_BATTERY, parser .nextInt (  )   ) ;^85^^^^^53^89^[REPLACE] position.set ( Position.KEY_BATTERY, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.setTime ( Position.PREFIX_TEMP  1, parser.next (  )  ) ;^86^^^^^53^89^[REPLACE] position.set ( Position.PREFIX_TEMP + 1, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.PREFIX_TEMP + 1, parser.nextInt (  )  ) ;^86^^^^^53^89^[REPLACE] position.set ( Position.PREFIX_TEMP + 1, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Ardi01ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  int satellites  [TYPE]  Parser parser 