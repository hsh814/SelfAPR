[REPLACE]^public static final int MSG_TYPE_CONNECT  = null ;^37^^^^^^^[REPLACE] public static final int MSG_TYPE_CONNECT = 0x01;^ [CLASS] ObdDongleProtocolDecoder  
[REPLACE]^public static final int MSG_TYPE_CONNACK  = null ;^38^^^^^^^[REPLACE] public static final int MSG_TYPE_CONNACK = 0x02;^ [CLASS] ObdDongleProtocolDecoder  
[REPLACE]^public static final int MSG_TYPE_PUBLISH ;^39^^^^^^^[REPLACE] public static final int MSG_TYPE_PUBLISH = 0x03;^ [CLASS] ObdDongleProtocolDecoder  
[REPLACE]^public static final int MSG_TYPE_PUBACK ;^40^^^^^^^[REPLACE] public static final int MSG_TYPE_PUBACK = 0x04;^ [CLASS] ObdDongleProtocolDecoder  
[REPLACE]^public static final int MSG_TYPE_PINGREQ ;^41^^^^^^^[REPLACE] public static final int MSG_TYPE_PINGREQ = 0x0C;^ [CLASS] ObdDongleProtocolDecoder  
[REPLACE]^public static final int MSG_TYPE_PINGRESP ;^42^^^^^^^[REPLACE] public static final int MSG_TYPE_PINGRESP = 0x0D;^ [CLASS] ObdDongleProtocolDecoder  
[REPLACE]^public static final int MSG_TYPE_DISCONNECT  = null ;^43^^^^^^^[REPLACE] public static final int MSG_TYPE_DISCONNECT = 0x0E;^ [CLASS] ObdDongleProtocolDecoder  
[REPLACE]^ChannelBuffer response = dynamicBuffer (  )  ;^64^^^^^62^126^[REPLACE] ChannelBuffer buf =  ( ChannelBuffer )  msg;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^buf.skipBytes ( 5 ) ;^66^^^^^62^126^[REPLACE] buf.skipBytes ( 2 ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^^67^^^^^62^126^[ADD] int index = buf.readUnsignedShort (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^^69^^^^^62^126^[ADD] String imei = buf.readBytes ( 15 ) .toString ( StandardCharsets.US_ASCII ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^if  ( deviceSession != null )  {^71^^^^^62^126^[REPLACE] if  ( deviceSession == null )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^return this;^72^^^^^62^126^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^return false;^72^^^^^62^126^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^int typeMajor = buf.readUnsignedByte (  )  ;^75^^^^^62^126^[REPLACE] int type = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^buf .readUnsignedInt (  )  ;^77^^^^^62^126^[REPLACE] buf.readUnsignedShort (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^if  (   type )  {^79^^^^^62^126^[REPLACE] if  ( type == MSG_TYPE_CONNECT )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^}  if  ( type  ) {^87^^^^^62^126^[REPLACE] } else if  ( type == MSG_TYPE_PUBLISH )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^}   int typeMajor = buf.readUnsignedByte (  ) ;int typeMinor = buf.readUnsignedByte (  ) ;^87^88^89^90^^62^126^[ADD] else if  ( type == MSG_TYPE_PUBLISH )  {  int typeMajor = buf.readUnsignedByte (  ) ; int typeMinor = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^^89^^^^^62^126^[ADD] int typeMajor = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^^90^^^^^62^126^[ADD] int typeMinor = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^^94^^^^^62^126^[ADD] Position position = new Position (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^int flags = buf .readUnsignedInt (  )  ;^100^^^^^62^126^[REPLACE] int flags = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^double longitude =  (  ( BitUtil.to ( buf.readUnsignedShort (  ) , 1 )  << 24 )  + buf.readUnsignedMedium (  )  )   0.00001;^106^^^^^62^126^[REPLACE] double longitude =  (  ( BitUtil.to ( buf.readUnsignedShort (  ) , 1 )  << 24 )  + buf.readUnsignedMedium (  )  )  * 0.00001;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^double latitude = buf.readUnsignedMedium (  )   0.00001;^109^^^^^62^126^[REPLACE] double latitude = buf.readUnsignedMedium (  )  * 0.00001;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^int speedCourse = buf.readUnsignedInt (  ) ;^112^^^^^62^126^[REPLACE] int speedCourse = buf.readUnsignedMedium (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^ChannelBuffer buf =  (  ( ChannelBuffer )   ( msg )  )  ;^116^^^^^62^126^[REPLACE] ChannelBuffer response = ChannelBuffers.dynamicBuffer (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^int typeMajor = buf.readUnsignedInt (  ) ;^89^^^^^62^126^[REPLACE] int typeMajor = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^int typeMajor = buf.readUnsignedByte (  )  ;^90^^^^^62^126^[REPLACE] int typeMinor = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^int flags = buf.readUnsignedInt (  ) ;^100^^^^^62^126^[REPLACE] int flags = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^^106^107^^^^62^126^[ADD] double longitude =  (  ( BitUtil.to ( buf.readUnsignedShort (  ) , 1 )  << 24 )  + buf.readUnsignedMedium (  )  )  * 0.00001; position.setLongitude ( BitUtil.check ( flags, 5 )  ? longitude : -longitude ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^^109^110^^^^62^126^[ADD] double latitude = buf.readUnsignedMedium (  )  * 0.00001; position.setLatitude ( BitUtil.check ( flags, 4 )  ? latitude : -latitude ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^^116^^^^^62^126^[ADD] ChannelBuffer response = ChannelBuffers.dynamicBuffer (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^ChannelBuffer buf =  (  ( ChannelBuffer )   ( msg )  )  ;^81^^^^^62^126^[REPLACE] ChannelBuffer response = ChannelBuffers.dynamicBuffer (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^}  if  ( type  ||  MSG_TYPE_PUBLISH )  {^87^^^^^62^126^[REPLACE] } else if  ( type == MSG_TYPE_PUBLISH )  {^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^int typeMinor = buf.readUnsignedByte (  )  ;^89^^^^^62^126^[REPLACE] int typeMajor = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^int typeMinor = buf.readUnsignedInt (  ) ;^90^^^^^62^126^[REPLACE] int typeMinor = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^^94^95^^^^62^126^[ADD] Position position = new Position (  ) ; position.setProtocol ( getProtocolName (  )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^^109^^^^^62^126^[ADD] double latitude = buf.readUnsignedMedium (  )  * 0.00001;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^int type = buf.readUnsignedByte (  )  ;^100^^^^^62^126^[REPLACE] int flags = buf.readUnsignedByte (  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^double longitude =  (  ( BitUtil.to ( buf.readUnsignedShort (  ) , 3 )  << 24 )  + buf.readUnsignedMedium (  )  )   0.00003;^106^^^^^62^126^[REPLACE] double longitude =  (  ( BitUtil.to ( buf.readUnsignedShort (  ) , 1 )  << 24 )  + buf.readUnsignedMedium (  )  )  * 0.00001;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^double latitude = buf.readBytes (  )   0.00001;^109^^^^^62^126^[REPLACE] double latitude = buf.readUnsignedMedium (  )  * 0.00001;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[ADD]^^112^113^^^^62^126^[ADD] int speedCourse = buf.readUnsignedMedium (  ) ; position.setSpeed ( UnitsConverter.knotsFromMph ( BitUtil.from ( speedCourse, 10 )  * 0.1 )  ) ;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 
[REPLACE]^return false;^125^^^^^62^126^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] Channel channel SocketAddress remoteAddress Object msg [CLASS] ObdDongleProtocolDecoder   [TYPE]  boolean false  true  [TYPE]  DeviceSession deviceSession  [TYPE]  Position position  [TYPE]  double latitude  longitude  [TYPE]  Channel channel  [TYPE]  Object msg  [TYPE]  String imei  [TYPE]  SocketAddress remoteAddress  [TYPE]  int MSG_TYPE_CONNACK  MSG_TYPE_CONNECT  MSG_TYPE_DISCONNECT  MSG_TYPE_PINGREQ  MSG_TYPE_PINGRESP  MSG_TYPE_PUBACK  MSG_TYPE_PUBLISH  flags  index  speedCourse  type  typeMajor  typeMinor  [TYPE]  ChannelBuffer buf  response 