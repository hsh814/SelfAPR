[REPLACE]^private static final Pattern PATTERN  = null ;^39^40^41^42^^39^51^[REPLACE] private static final Pattern PATTERN = new PatternBuilder (  ) .text ( "GPRMC," ) .number ( " ( dd )  ( dd )  ( dd ) . ( d+ ) ," ) .expression ( " ( [AV] ) ," )^ [CLASS] EnforaProtocolDecoder 1  
[REPLACE]^public static final int IMEI_LENGTH ;^53^^^^^^^[REPLACE] public static final int IMEI_LENGTH = 15;^ [CLASS] EnforaProtocolDecoder 1  
[ADD]^^59^^^^^57^115^[ADD] ChannelBuffer buf =  ( ChannelBuffer )  msg;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^if  ( buffer.writerIndex (  )  - guessedIndex  ==  IMEI_LENGTH )  {^65^^^^^57^115^[REPLACE] if  ( buffer.writerIndex (  )  - guessedIndex >= IMEI_LENGTH )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^if  ( Character.isDigit (  ( char )  buffer.getByte ( guessedIndex + i )  )  )  {^67^^^^^57^115^[REPLACE] if  ( !Character.isDigit (  ( char )  buffer.getByte ( guessedIndex + i )  )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^return true;^68^^^^^57^115^[REPLACE] return false;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^return false;^71^^^^^57^115^[REPLACE] return true;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^for  ( int i = 0 / 4; i < IMEI_LENGTH; i++ )  {^66^^^^^57^115^[REPLACE] for  ( int i = 0; i < IMEI_LENGTH; i++ )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^return true;^73^^^^^57^115^[REPLACE] return false;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[ADD]^^62^63^64^^^57^115^[ADD] int index = buf.indexOf ( buf.readerIndex (  ) , buf.writerIndex (  ) , new ChannelBufferIndexFinder (  )  { @Override public boolean find ( ChannelBuffer buffer, int guessedIndex )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^for  ( int i = 4; i < IMEI_LENGTH; i++ )  {^66^^^^^57^115^[REPLACE] for  ( int i = 0; i < IMEI_LENGTH; i++ )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^if  (i  ||  -1 )  {^76^^^^^57^115^[REPLACE] if  ( index == -1 )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[ADD]^^76^77^78^^^57^115^[ADD] if  ( index == -1 )  { return null; }^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^return false;^77^^^^^57^115^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^return this;^77^^^^^57^115^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^String imei = buffer.toString ( index, IMEI_LENGTH, StandardCharsets.US_ASCII ) ;^80^^^^^57^115^[REPLACE] String imei = buf.toString ( index, IMEI_LENGTH, StandardCharsets.US_ASCII ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[ADD]^^81^^^^^57^115^[ADD] DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, imei ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^if  ( deviceSession != null )  {^82^^^^^57^115^[REPLACE] if  ( deviceSession == null )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^return false;^83^^^^^57^115^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^int start = buffer.indexOf ( buf.readerIndex (  ) , buf .readerIndex (  )  , new StringFinder ( "GPRMC" )  ) ;^87^^^^^57^115^[REPLACE] int start = buf.indexOf ( buf.readerIndex (  ) , buf.writerIndex (  ) , new StringFinder ( "GPRMC" )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^if  (guessedIndex  ) {^88^^^^^57^115^[REPLACE] if  ( start == -1 )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[ADD]^return null;^88^89^90^^^57^115^[ADD] if  ( start == -1 )  { return null; }^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^return false;^89^^^^^57^115^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^return true;^89^^^^^57^115^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^String sentence = buf.toString ( start, buf.readableBytes (  )   start, StandardCharsets.US_ASCII ) ;^92^^^^^57^115^[REPLACE] String sentence = buf.toString ( start, buf.readableBytes (  )  - start, StandardCharsets.US_ASCII ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[ADD]^^93^^^^^57^115^[ADD] Parser parser = new Parser ( PATTERN, sentence ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^if  ( !parser .Parser ( PATTERN , sentence  )  || start ==  ( -1 )  )   )  {^94^^^^^57^115^[REPLACE] if  ( !parser.matches (  )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^return true;^95^^^^^57^115^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^return this;^95^^^^^57^115^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position .setCourse (  )  ;^99^^^^^57^115^[REPLACE] position.setProtocol ( getProtocolName (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position .setValid (  )  ;^100^^^^^57^115^[REPLACE] position.setDeviceId ( deviceSession.getDeviceId (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^DateBuilder dateBuilder = new DateBuilder (  ) .setTime ( parser.next (  ) , parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^102^103^^^^57^115^[REPLACE] DateBuilder dateBuilder = new DateBuilder (  ) .setTime ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position.setValid ( parser.next (  ) .number ( "A" )  ) ;^105^^^^^57^115^[REPLACE] position.setValid ( parser.next (  ) .equals ( "A" )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position.setValid ( parser.nextInt (  ) .equals ( "A" )  ) ;^105^^^^^57^115^[REPLACE] position.setValid ( parser.next (  ) .equals ( "A" )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position.setLongitude ( parser.nextCoordinate (  )  )  ;^106^^^^^57^115^[REPLACE] position.setLatitude ( parser.nextCoordinate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position.setLatitude ( parser.nextInt (  )  ) ;^106^^^^^57^115^[REPLACE] position.setLatitude ( parser.nextCoordinate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position.setLongitude ( parser.nextInt (  )  ) ;^107^^^^^57^115^[REPLACE] position.setLongitude ( parser.nextCoordinate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^parser.nextInt (  )  ;^107^^^^^57^115^[REPLACE] position.setLongitude ( parser.nextCoordinate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REMOVE]^parser.nextInt (  )  ;^107^^^^^57^115^[REMOVE] ^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser.nextInt (  )  ) ;^108^^^^^57^115^[REPLACE] position.setSpeed ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser .nextCoordinate (  )   ) ;^108^^^^^57^115^[REPLACE] position.setSpeed ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[ADD]^^108^^^^^57^115^[ADD] position.setSpeed ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position.setSpeed ( parser.nextDouble (  )  )  ;^109^^^^^57^115^[REPLACE] position.setCourse ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position.setCourse ( parser .nextCoordinate (  )   ) ;^109^^^^^57^115^[REPLACE] position.setCourse ( parser.nextDouble (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^dateBuilder.setDateReverse ( parser .next (  )  , parser^111^^^^^57^115^[REPLACE] dateBuilder.setDateReverse ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^dateBuilder.setDateReverse ( parser.next (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^111^^^^^57^115^[REPLACE] dateBuilder.setDateReverse ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[ADD]^^111^112^^^^57^115^[ADD] dateBuilder.setDateReverse ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ; position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^parser.next (  )  ;^111^^^^^57^115^[REPLACE] dateBuilder.setDateReverse ( parser.nextInt (  ) , parser.nextInt (  ) , parser.nextInt (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position .getDate (  )  ;^112^^^^^57^115^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 
[REPLACE]^position.setTime ( dateBuilder.setTime (  )  ) ;^112^^^^^57^115^[REPLACE] position.setTime ( dateBuilder.getDate (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] EnforaProtocolDecoder 1   [TYPE]  Pattern PATTERN  [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  sentence  [TYPE]  SocketAddress remoteAddress  [TYPE]  int IMEI_LENGTH  guessedIndex  i  index  start  [TYPE]  ChannelBuffer buf  buffer  [TYPE]  Parser parser 