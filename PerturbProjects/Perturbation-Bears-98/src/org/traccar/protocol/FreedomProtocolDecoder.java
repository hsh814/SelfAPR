[REPLACE]^private static final Object PATTERN = new PatternBuilder (  ) .text ( "IMEI," ) .number ( " ( d+ ) ," ) .number ( " ( dddd ) / ( dd ) / ( dd ) , " )^35^36^37^38^^35^46^[REPLACE] private static final Pattern PATTERN = new PatternBuilder (  ) .text ( "IMEI," ) .number ( " ( d+ ) ," ) .number ( " ( dddd ) / ( dd ) / ( dd ) , " )^ [CLASS] FreedomProtocolDecoder  
[ADD]^^52^^^^^50^79^[ADD] Parser parser = new Parser ( PATTERN,  ( String )  msg ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^if  ( parser.matches (  )  )  {^53^^^^^50^79^[REPLACE] if  ( !parser.matches (  )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return false;^54^^^^^50^79^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return true;^54^^^^^50^79^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position .setTime (  )  ;^58^^^^^50^79^[REPLACE] position.setProtocol ( getProtocolName (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REMOVE]^position.setSpeed ( parser.nextDouble (  )  )  ;^58^^^^^50^79^[REMOVE] ^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^58^^^^^50^79^[ADD] position.setProtocol ( getProtocolName (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^60^^^^^50^79^[ADD] DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^if  ( deviceSession != null )  {^61^^^^^50^79^[REPLACE] if  ( deviceSession == null )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REMOVE]^if  ( ! ( parser.matches (  )  )  )  {     return null; }^61^^^^^50^79^[REMOVE] ^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return false;^62^^^^^50^79^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return true;^62^^^^^50^79^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setValid ( deviceSession.getDeviceId (  )  ) ;^64^^^^^50^79^[REPLACE] position.setDeviceId ( deviceSession.getDeviceId (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setValid ( false ) ;^66^^^^^50^79^[REPLACE] position.setValid ( true ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^68^69^70^^^50^79^[ADD] DateBuilder dateBuilder = new DateBuilder (  ) .setDate ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) .setTime ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setTime ( dateBuilder.setDate (  )  ) ;^71^^^^^50^79^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setTime ( dateBuilder .setDate (  )   ) ;^71^^^^^50^79^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^71^^^^^50^79^[ADD] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setLongitude ( parser.nextCoordinate ( HEM_DEG_MIN )  )  ;^73^^^^^50^79^[REPLACE] position.setLatitude ( parser.nextCoordinate ( Parser.CoordinateFormat.HEM_DEG_MIN )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REMOVE]^position.setLongitude ( parser.nextCoordinate ( HEM_DEG_MIN )  )  ;^73^^^^^50^79^[REMOVE] ^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setLatitude ( parser.nextCoordinate ( HEM_DEG_MIN )  )  ;^73^^^^^50^79^[REPLACE] position.setLatitude ( parser.nextCoordinate ( Parser.CoordinateFormat.HEM_DEG_MIN )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^73^74^^^^50^79^[ADD] position.setLatitude ( parser.nextCoordinate ( Parser.CoordinateFormat.HEM_DEG_MIN )  ) ; position.setLongitude ( parser.nextCoordinate ( Parser.CoordinateFormat.HEM_DEG_MIN )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setLatitude ( parser.nextCoordinate ( HEM_DEG_MIN )  )  ;^74^^^^^50^79^[REPLACE] position.setLongitude ( parser.nextCoordinate ( Parser.CoordinateFormat.HEM_DEG_MIN )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^74^^^^^50^79^[ADD] position.setLongitude ( parser.nextCoordinate ( Parser.CoordinateFormat.HEM_DEG_MIN )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setValid ( parser.nextDouble (  )  ) ;^76^^^^^50^79^[REPLACE] position.setSpeed ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser.next (  )  ) ;^76^^^^^50^79^[REPLACE] position.setSpeed ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] FreedomProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 