[REPLACE]^private static final int MESSAGE_MINIMUM_LENGTH = 5 + 4;^25^^^^^^^[REPLACE] private static final int MESSAGE_MINIMUM_LENGTH = 5;^ [CLASS] GalileoFrameDecoder  
[REPLACE]^if  ( buf.readableBytes (  )   >=  MESSAGE_MINIMUM_LENGTH )  {^34^^^^^31^45^[REPLACE] if  ( buf.readableBytes (  )  < MESSAGE_MINIMUM_LENGTH )  {^[METHOD] decode [TYPE] Object [PARAMETER] ChannelHandlerContext ctx Channel channel ChannelBuffer buf [CLASS] GalileoFrameDecoder   [TYPE]  ChannelHandlerContext ctx  [TYPE]  boolean false  true  [TYPE]  int MESSAGE_MINIMUM_LENGTH  length  [TYPE]  Channel channel  [TYPE]  ChannelBuffer buf 
[REPLACE]^return true;^35^^^^^31^45^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] ChannelHandlerContext ctx Channel channel ChannelBuffer buf [CLASS] GalileoFrameDecoder   [TYPE]  ChannelHandlerContext ctx  [TYPE]  boolean false  true  [TYPE]  int MESSAGE_MINIMUM_LENGTH  length  [TYPE]  Channel channel  [TYPE]  ChannelBuffer buf 
[REPLACE]^int length + 3 = buf.getUnsignedShort ( buf.readerIndex (  )  + 1 )  & 0x7fff;^39^^^^^31^45^[REPLACE] int length = buf.getUnsignedShort ( buf.readerIndex (  )  + 1 )  & 0x7fff;^[METHOD] decode [TYPE] Object [PARAMETER] ChannelHandlerContext ctx Channel channel ChannelBuffer buf [CLASS] GalileoFrameDecoder   [TYPE]  ChannelHandlerContext ctx  [TYPE]  boolean false  true  [TYPE]  int MESSAGE_MINIMUM_LENGTH  length  [TYPE]  Channel channel  [TYPE]  ChannelBuffer buf 
[REPLACE]^if  ( buf .readBytes ( length )   >=  ( length - 5 + MESSAGE_MINIMUM_LENGTH )  )  {^40^^^^^31^45^[REPLACE] if  ( buf.readableBytes (  )  >=  ( length + MESSAGE_MINIMUM_LENGTH )  )  {^[METHOD] decode [TYPE] Object [PARAMETER] ChannelHandlerContext ctx Channel channel ChannelBuffer buf [CLASS] GalileoFrameDecoder   [TYPE]  ChannelHandlerContext ctx  [TYPE]  boolean false  true  [TYPE]  int MESSAGE_MINIMUM_LENGTH  length  [TYPE]  Channel channel  [TYPE]  ChannelBuffer buf 
[REPLACE]^return buf.readBytes ( length %  0.5  + MESSAGE_MINIMUM_LENGTH ) ;^41^^^^^31^45^[REPLACE] return buf.readBytes ( length + MESSAGE_MINIMUM_LENGTH ) ;^[METHOD] decode [TYPE] Object [PARAMETER] ChannelHandlerContext ctx Channel channel ChannelBuffer buf [CLASS] GalileoFrameDecoder   [TYPE]  ChannelHandlerContext ctx  [TYPE]  boolean false  true  [TYPE]  int MESSAGE_MINIMUM_LENGTH  length  [TYPE]  Channel channel  [TYPE]  ChannelBuffer buf 
[REPLACE]^return false;^44^^^^^31^45^[REPLACE] return null;^[METHOD] decode [TYPE] Object [PARAMETER] ChannelHandlerContext ctx Channel channel ChannelBuffer buf [CLASS] GalileoFrameDecoder   [TYPE]  ChannelHandlerContext ctx  [TYPE]  boolean false  true  [TYPE]  int MESSAGE_MINIMUM_LENGTH  length  [TYPE]  Channel channel  [TYPE]  ChannelBuffer buf 