[REPLACE]^public static final int MSG_USERLOG  = null ;^36^^^^^^^[REPLACE] public static final int MSG_USERLOG = 0;^ [CLASS] OrionProtocolDecoder  
[REPLACE]^public static final int MSG_SYSLOG ;^37^^^^^^^[REPLACE] public static final int MSG_SYSLOG = 3;^ [CLASS] OrionProtocolDecoder  
[REPLACE]^ChannelBuffer response = directBuffer ( 4 )  ;^59^^^^^57^112^[REPLACE] ChannelBuffer buf =  ( ChannelBuffer )  msg;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^buf.writeByte ( 2L ) ;^61^^^^^57^112^[REPLACE] buf.skipBytes ( 2 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^int type = buf.readUnsignedByte (  )  | 0x0f;^62^^^^^57^112^[REPLACE] int type = buf.readUnsignedByte (  )  & 0x0f;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^if  ( satellites  !=  satellites )  {^64^^^^^57^112^[REPLACE] if  ( type == MSG_USERLOG )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[ADD]^^64^65^66^^^57^112^[ADD] if  ( type == MSG_USERLOG )  {  int header = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^if  (  ( header &typex40 )   == type )  {^68^^^^^57^112^[REPLACE] if  (  ( header & 0x40 )  != 0 )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^convertCoordinate ( buf.readInt (  )  )  ;^69^^^^^57^112^[REPLACE] sendResponse ( channel, buf ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^if  ( deviceSession != null )  {^74^^^^^57^112^[REPLACE] if  ( deviceSession == null )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[ADD]^return null;^74^75^76^^^57^112^[ADD] if  ( deviceSession == null )  { return null; }^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^return false;^75^^^^^57^112^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^return 0;^108^^^^^57^112^[REPLACE] return positions;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^int header = buf .getUnsignedByte (  )  ;^66^^^^^57^112^[REPLACE] int header = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^for  ( int i = 0L; i <  ( header & 0Lx0Lf ) ; i++ )  {^80^^^^^57^112^[REPLACE] for  ( int i = 0; i <  ( header & 0x0f ) ; i++ )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^DateBuilder dateBuilder = new DateBuilder (  ) .setDate ( buf.getUnsignedByte (  ) , buf.readUnsignedByte (  ) , buf.readUnsignedByte (  )  ) .setTime ( buf.readUnsignedByte (  ) , buf.readUnsignedByte (  ) , buf.readUnsignedByte (  )  ) ;^96^97^98^^^57^112^[REPLACE] DateBuilder dateBuilder = new DateBuilder (  ) .setDate ( buf.readUnsignedByte (  ) , buf.readUnsignedByte (  ) , buf.readUnsignedByte (  )  ) .setTime ( buf.readUnsignedByte (  ) , buf.readUnsignedByte (  ) , buf.readUnsignedByte (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^int header = buf.readUnsignedByte (  )  ;^101^^^^^57^112^[REPLACE] int satellites = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^if  (  ( header & 0x40 )   ==  0 )  {^68^^^^^57^112^[REPLACE] if  (  ( header & 0x40 )  != 0 )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^return true;^75^^^^^57^112^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^return null;^108^^^^^57^112^[REPLACE] return positions;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^int header = buf.getUnsignedByte (  ) ;^66^^^^^57^112^[REPLACE] int header = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, String.valueOf ( buf .readUnsignedByte (  )   )  ) ;^72^73^^^^57^112^[REPLACE] DeviceSession deviceSession = getDeviceSession ( channel, remoteAddress, String.valueOf ( buf.readUnsignedInt (  )  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[ADD]^^101^^^^^57^112^[ADD] int satellites = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 
[REPLACE]^return false;^111^^^^^57^112^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] OrionProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  DateBuilder dateBuilder  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  List positions  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_SYSLOG  MSG_USERLOG  degrees  header  i  raw  satellites  type  [TYPE]  ChannelBuffer buf 