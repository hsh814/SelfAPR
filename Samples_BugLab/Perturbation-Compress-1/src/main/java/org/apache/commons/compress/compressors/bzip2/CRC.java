[buglab_swap_variables]^int temp =  ( inCh >> 24 )  ^ globalCrc;^114^^^^^113^119^int temp =  ( globalCrc >> 24 )  ^ inCh;^[CLASS] CRC  [METHOD] updateCRC [RETURN_TYPE] void   int inCh [VARIABLES] int[]  crc32Table  int  globalCrc  inCh  newCrc  temp  boolean  
[buglab_swap_variables]^globalCrcShadow =  ( crc32Table << 8 )  ^ globalCrcShadow[ ( temp >= 0 ) ? temp :  ( temp + 256 ) ];^125^126^127^^^121^130^globalCrcShadow =  ( globalCrcShadow << 8 )  ^ crc32Table[ ( temp >= 0 ) ? temp :  ( temp + 256 ) ];^[CLASS] CRC  [METHOD] updateCRC [RETURN_TYPE] void   int inCh int repeat [VARIABLES] int[]  crc32Table  int  globalCrc  globalCrcShadow  inCh  newCrc  repeat  temp  boolean  
[buglab_swap_variables]^globalCrcShadow =  ( temp << 8 )  ^ crc32Table[ ( globalCrcShadow >= 0 ) ? temp :  ( temp + 256 ) ];^125^126^127^^^121^130^globalCrcShadow =  ( globalCrcShadow << 8 )  ^ crc32Table[ ( temp >= 0 ) ? temp :  ( temp + 256 ) ];^[CLASS] CRC  [METHOD] updateCRC [RETURN_TYPE] void   int inCh int repeat [VARIABLES] int[]  crc32Table  int  globalCrc  globalCrcShadow  inCh  newCrc  repeat  temp  boolean  
[buglab_swap_variables]^globalCrcShadow =  ( globalCrcShadow << 8 )  ^ temp[ ( crc32Table >= 0 ) ? temp :  ( temp + 256 ) ];^125^126^127^^^121^130^globalCrcShadow =  ( globalCrcShadow << 8 )  ^ crc32Table[ ( temp >= 0 ) ? temp :  ( temp + 256 ) ];^[CLASS] CRC  [METHOD] updateCRC [RETURN_TYPE] void   int inCh int repeat [VARIABLES] int[]  crc32Table  int  globalCrc  globalCrcShadow  inCh  newCrc  repeat  temp  boolean  
[buglab_swap_variables]^int temp =  ( inCh >> 24 )  ^ globalCrcShadow;^124^^^^^121^130^int temp =  ( globalCrcShadow >> 24 )  ^ inCh;^[CLASS] CRC  [METHOD] updateCRC [RETURN_TYPE] void   int inCh int repeat [VARIABLES] int[]  crc32Table  int  globalCrc  globalCrcShadow  inCh  newCrc  repeat  temp  boolean  