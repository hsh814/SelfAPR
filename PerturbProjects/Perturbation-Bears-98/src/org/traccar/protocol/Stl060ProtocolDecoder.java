[REPLACE]^private static final Object PATTERN = new PatternBuilder (  ) .any (  ) .text ( "$1," ) .number ( " ( d+ ) ," )^35^36^37^38^^35^68^[REPLACE] private static final Pattern PATTERN = new PatternBuilder (  ) .any (  ) .text ( "$1," ) .number ( " ( d+ ) ," )^ [CLASS] Stl060ProtocolDecoder  
[ADD]^^74^^^^^72^122^[ADD] Parser parser = new Parser ( PATTERN,  ( String )  msg ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^if  ( !parser.hasNext (  )  )  {^75^^^^^72^122^[REPLACE] if  ( !parser.matches (  )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return false;^76^^^^^72^122^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return true;^76^^^^^72^122^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( getProtocolName (  )  ) ;^80^^^^^72^122^[REPLACE] position.setProtocol ( getProtocolName (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^80^^^^^72^122^[ADD] position.setProtocol ( getProtocolName (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, parser .nextInt (  )   ) ;^82^^^^^72^122^[REPLACE] DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^if  ( deviceSession != null )  {^83^^^^^72^122^[REPLACE] if  ( deviceSession == null )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^return false;^84^^^^^72^122^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position .setValid (  )  ;^86^^^^^72^122^[REPLACE] position.setDeviceId ( deviceSession.getDeviceId (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^88^89^90^^^72^122^[ADD] DateBuilder dateBuilder = new DateBuilder (  ) .setDateReverse ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) .setTime ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( dateBuilder.getDate (  )  ) ;^91^^^^^72^122^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^91^^^^^72^122^[ADD] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setTime ( dateBuilder .setDateReverse (  )   ) ;^91^^^^^72^122^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( parser.nextCoordinate ( Parser.CoordinateFormat.DEG_MIN_MIN_HEM )  ) ;^93^^^^^72^122^[REPLACE] position.setLatitude ( parser.nextCoordinate ( Parser.CoordinateFormat.DEG_MIN_MIN_HEM )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^93^^^^^72^122^[ADD] position.setLatitude ( parser.nextCoordinate ( Parser.CoordinateFormat.DEG_MIN_MIN_HEM )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setLatitude ( parser.hasNext ( Parser.CoordinateFormat.DEG_MIN_MIN_HEM )  ) ;^93^^^^^72^122^[REPLACE] position.setLatitude ( parser.nextCoordinate ( Parser.CoordinateFormat.DEG_MIN_MIN_HEM )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^position.setLongitude ( parser.nextCoordinate ( Parser.CoordinateFormat.DEG_MIN_MIN_HEM )  ) ;^93^94^^^^72^122^[ADD] position.setLatitude ( parser.nextCoordinate ( Parser.CoordinateFormat.DEG_MIN_MIN_HEM )  ) ; position.setLongitude ( parser.nextCoordinate ( Parser.CoordinateFormat.DEG_MIN_MIN_HEM )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setLatitude ( parser.nextCoordinate ( DEG_MIN_MIN_HEM )  )  ;^94^^^^^72^122^[REPLACE] position.setLongitude ( parser.nextCoordinate ( Parser.CoordinateFormat.DEG_MIN_MIN_HEM )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setLongitude ( parser .nextInt (  )   ) ;^94^^^^^72^122^[REPLACE] position.setLongitude ( parser.nextCoordinate ( Parser.CoordinateFormat.DEG_MIN_MIN_HEM )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^94^^^^^72^122^[ADD] position.setLongitude ( parser.nextCoordinate ( Parser.CoordinateFormat.DEG_MIN_MIN_HEM )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setCourse ( parser.nextDouble (  )  )  ;^95^^^^^72^122^[REPLACE] position.setSpeed ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser .nextCoordinate (  )   ) ;^95^^^^^72^122^[REPLACE] position.setSpeed ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser.nextDouble (  )  )  ;^96^^^^^72^122^[REPLACE] position.setCourse ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setCourse ( parser .nextCoordinate (  )   ) ;^96^^^^^72^122^[REPLACE] position.setCourse ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^if  ( ! ( parser.matches (  )  )  || ( parser.hasNext ( 5 / 0 )  )  {^99^^^^^72^122^[REPLACE] if  ( parser.hasNext ( 5 )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^position.set ( Position.KEY_ODOMETER, parser.nextInt (  )  ) ;position.set ( Position.KEY_IGNITION, parser.nextInt (  )  == 1 ) ;position.set ( Position.KEY_INPUT, parser.nextInt (  )  + parser.nextInt (  )  << 1 ) ;position.set ( Position.KEY_FUEL, parser.nextInt (  )  ) ;^99^100^101^102^103^72^122^[ADD] if  ( parser.hasNext ( 5 )  )  { position.set ( Position.KEY_ODOMETER, parser.nextInt (  )  ) ; position.set ( Position.KEY_IGNITION, parser.nextInt (  )  == 1 ) ; position.set ( Position.KEY_INPUT, parser.nextInt (  )  + parser.nextInt (  )  << 1 ) ; position.set ( Position.KEY_FUEL, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_FUEL, parser.nextInt (  )  )  ;^100^^^^^72^122^[REPLACE] position.set ( Position.KEY_ODOMETER, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_ODOMETER, parser .next (  )   ) ;^100^^^^^72^122^[REPLACE] position.set ( Position.KEY_ODOMETER, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_IGNITION, parser.nextInt (  )   !=  0 ) ;^101^^^^^72^122^[REPLACE] position.set ( Position.KEY_IGNITION, parser.nextInt (  )  == 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^parser.nextInt (  )  ;^101^^^^^72^122^[REPLACE] position.set ( Position.KEY_IGNITION, parser.nextInt (  )  == 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_OUTPUT,  (  (  ( parser.nextInt (  )  )  +  ( parser.nextInt (  )  )  )  << 1 )  )  ;^102^^^^^72^122^[REPLACE] position.set ( Position.KEY_INPUT, parser.nextInt (  )  + parser.nextInt (  )  << 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_INPUT, parser.hasNext (  )  + parser.nextInt (  )  << 1 ) ;^102^^^^^72^122^[REPLACE] position.set ( Position.KEY_INPUT, parser.nextInt (  )  + parser.nextInt (  )  << 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_FUEL, parser .next (  )   ) ;^103^^^^^72^122^[REPLACE] position.set ( Position.KEY_FUEL, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_FUEL, parser.next (  )  ) ;^103^^^^^72^122^[REPLACE] position.set ( Position.KEY_FUEL, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^103^^^^^72^122^[ADD] position.set ( Position.KEY_FUEL, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^if  ( parser.hasNext ( 10 - 0 )  )  {^107^^^^^72^122^[REPLACE] if  ( parser.hasNext ( 10 )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_IGNITION,  (  ( parser.nextInt (  )  )  == 1 )  )  ;^108^^^^^72^122^[REPLACE] position.set ( Position.KEY_CHARGE, parser.nextInt (  )  == 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_CHARGE, parser.hasNext (  )  == 1 ) ;^108^^^^^72^122^[REPLACE] position.set ( Position.KEY_CHARGE, parser.nextInt (  )  == 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_IGNITION, parser.nextInt (  )   ||  1 ) ;^109^^^^^72^122^[REPLACE] position.set ( Position.KEY_IGNITION, parser.nextInt (  )  == 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_IGNITION, parser .next (  )   == 1 ) ;^109^^^^^72^122^[REPLACE] position.set ( Position.KEY_IGNITION, parser.nextInt (  )  == 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_INPUT, parser.next (  )  ) ;^110^^^^^72^122^[REPLACE] position.set ( Position.KEY_INPUT, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_INPUT, parser .next (  )   ) ;^110^^^^^72^122^[REPLACE] position.set ( Position.KEY_INPUT, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_FUEL, parser.nextInt (  )  )  ;^111^^^^^72^122^[REPLACE] position.set ( Position.KEY_RFID, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REMOVE]^position.set ( Position.KEY_FUEL, parser.nextInt (  )  )  ;^111^^^^^72^122^[REMOVE] ^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_RFID, parser .nextInt (  )   ) ;^111^^^^^72^122^[REPLACE] position.set ( Position.KEY_RFID, parser.next (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_FUEL, parser.nextInt (  )  )  ;^112^^^^^72^122^[REPLACE] position.set ( Position.KEY_ODOMETER, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^112^^^^^72^122^[ADD] position.set ( Position.KEY_ODOMETER, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_ODOMETER, parser.next (  )  ) ;^112^^^^^72^122^[REPLACE] position.set ( Position.KEY_ODOMETER, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.PREFIX_TEMP null, parser.next (  )  ) ;^113^^^^^72^122^[REPLACE] position.set ( Position.PREFIX_TEMP + 1, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.PREFIX_TEMP + 1, parser.next (  )  ) ;^113^^^^^72^122^[REPLACE] position.set ( Position.PREFIX_TEMP + 1, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_INPUT, parser.nextInt (  )  )  ;^114^^^^^72^122^[REPLACE] position.set ( Position.KEY_FUEL, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^( parser.nextInt (  )  )  ;^114^^^^^72^122^[REPLACE] position.set ( Position.KEY_FUEL, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^114^^^^^72^122^[ADD] position.set ( Position.KEY_FUEL, parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( "accel", parser.nextInt (  )   ||  1 ) ;^115^^^^^72^122^[REPLACE] position.set ( "accel", parser.nextInt (  )  == 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( "accel", parser.hasNext (  )  == 1 ) ;^115^^^^^72^122^[REPLACE] position.set ( "accel", parser.nextInt (  )  == 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_INPUT,  (  (  ( parser.nextInt (  )  )  +  ( parser.nextInt (  )  )  )  << 1 )  )  ;^116^^^^^72^122^[REPLACE] position.set ( Position.KEY_OUTPUT, parser.nextInt (  )  + parser.nextInt (  )  << 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_OUTPUT, parser.hasNext (  )  + parser.nextInt (  )  << 1 ) ;^116^^^^^72^122^[REPLACE] position.set ( Position.KEY_OUTPUT, parser.nextInt (  )  + parser.nextInt (  )  << 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( Position.KEY_OUTPUT, parser .next (  )   + parser^116^^^^^72^122^[REPLACE] position.set ( Position.KEY_OUTPUT, parser.nextInt (  )  + parser.nextInt (  )  << 1 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.set ( parser.next (  ) .equals ( "A" )  ) ;^119^^^^^72^122^[REPLACE] position.setValid ( parser.next (  ) .equals ( "A" )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setValid ( parser.next (  )  .expression ( this )   ) ;^119^^^^^72^122^[REPLACE] position.setValid ( parser.next (  ) .equals ( "A" )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[ADD]^^119^^^^^72^122^[ADD] position.setValid ( parser.next (  ) .equals ( "A" )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 
[REPLACE]^position.setValid ( parser.nextInt (  ) .equals ( "A" )  ) ;^119^^^^^72^122^[REPLACE] position.setValid ( parser.next (  ) .equals ( "A" )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] Stl060ProtocolDecoder   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  SocketAddress remoteAddress  [TYPE]  Parser parser 