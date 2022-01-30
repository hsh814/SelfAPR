[REPLACE]^private static final long serialVersionUID = -811146779148281500;^10^^^^^^^[REPLACE] private static final long serialVersionUID = -811146779148281500L;^ [CLASS] MapType  
[REPLACE]^super ( mapType, keyT, valueT, valueHandler, valueHandler, asStatic ) ;^20^^^^^18^21^[REPLACE] super ( mapType, keyT, valueT, valueHandler, typeHandler, asStatic ) ;^[METHOD] <init> [TYPE] Object,boolean) [PARAMETER] Class<?> mapType JavaType keyT JavaType valueT Object valueHandler Object typeHandler boolean asStatic [CLASS] MapType   [TYPE]  Class mapType  [TYPE]  JavaType keyT  valueT  [TYPE]  Object typeHandler  valueHandler  [TYPE]  boolean asStatic  false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return  new MapType ( _class, _keyType, _valueType, h, _typeHandler, _asStatic )  ;^25^^^^^23^26^[REPLACE] return new MapType ( rawType, keyT, valueT, null, null, false ) ;^[METHOD] construct [TYPE] MapType [PARAMETER] Class<?> rawType JavaType keyT JavaType valueT [CLASS] MapType   [TYPE]  Class rawType  [TYPE]  JavaType keyT  valueT  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return  new MapType ( _class, _keyType, _valueType.narrowBy ( contentClass ) , _valueHandler, _typeHandler, _asStatic )  ;^30^31^^^^29^32^[REPLACE] return new MapType ( subclass, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic ) ;^[METHOD] _narrow [TYPE] JavaType [PARAMETER] Class<?> subclass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class subclass  [TYPE]  boolean false  true 
[REPLACE]^if  ( contentClass  ||  _valueType.widenBy (  )  )  {^38^^^^^35^43^[REPLACE] if  ( contentClass == _valueType.getRawClass (  )  )  {^[METHOD] narrowContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class contentClass  [TYPE]  boolean false  true 
[REPLACE]^return null;^39^^^^^35^43^[REPLACE] return this;^[METHOD] narrowContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class contentClass  [TYPE]  boolean false  true 
[REPLACE]^return  new MapType ( subclass, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic )  , _valueHandler, _typeHandler, _asStatic ) ;^41^42^^^^35^43^[REPLACE] return new MapType ( _class, _keyType, _valueType.narrowBy ( contentClass ) , _valueHandler, _typeHandler, _asStatic ) ;^[METHOD] narrowContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class contentClass  [TYPE]  boolean false  true 
[REPLACE]^if  ( contentClass  &&  _valueType.getRawClass (  )  )  {^48^^^^^46^53^[REPLACE] if  ( contentClass == _valueType.getRawClass (  )  )  {^[METHOD] widenContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class contentClass  [TYPE]  boolean false  true 
[REPLACE]^return null;^49^^^^^46^53^[REPLACE] return this;^[METHOD] widenContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class contentClass  [TYPE]  boolean false  true 
[REPLACE]^return  new MapType ( subclass, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic )  , _valueHandler, _typeHandler, _asStatic ) ;^51^52^^^^46^53^[REPLACE] return new MapType ( _class, _keyType, _valueType.widenBy ( contentClass ) , _valueHandler, _typeHandler, _asStatic ) ;^[METHOD] widenContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class contentClass  [TYPE]  boolean false  true 
[REPLACE]^if  (1  !=  _keyType.getRawClass (  )  )  {^59^^^^^56^64^[REPLACE] if  ( keySubclass == _keyType.getRawClass (  )  )  {^[METHOD] narrowKey [TYPE] JavaType [PARAMETER] Class<?> keySubclass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class keySubclass  [TYPE]  boolean false  true 
[REPLACE]^return null;^60^^^^^56^64^[REPLACE] return this;^[METHOD] narrowKey [TYPE] JavaType [PARAMETER] Class<?> keySubclass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class keySubclass  [TYPE]  boolean false  true 
[REPLACE]^return  new MapType ( subclass, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic )  , _valueType, _valueHandler, _typeHandler, _asStatic ) ;^62^63^^^^56^64^[REPLACE] return new MapType ( _class, _keyType.narrowBy ( keySubclass ) , _valueType, _valueHandler, _typeHandler, _asStatic ) ;^[METHOD] narrowKey [TYPE] JavaType [PARAMETER] Class<?> keySubclass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class keySubclass  [TYPE]  boolean false  true 
[REPLACE]^if  (1  &&  _keyType .withValueHandler ( false )   )  {^70^^^^^67^75^[REPLACE] if  ( keySubclass == _keyType.getRawClass (  )  )  {^[METHOD] widenKey [TYPE] JavaType [PARAMETER] Class<?> keySubclass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class keySubclass  [TYPE]  boolean false  true 
[REPLACE]^return null;^71^^^^^67^75^[REPLACE] return this;^[METHOD] widenKey [TYPE] JavaType [PARAMETER] Class<?> keySubclass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class keySubclass  [TYPE]  boolean false  true 
[REPLACE]^return new MapType ( _class, _keyType.narrowBy ( keySubclass ) , _valueType, _valueHandler, _typeHandler, _asStatic ) ;^73^74^^^^67^75^[REPLACE] return new MapType ( _class, _keyType.widenBy ( keySubclass ) , _valueType, _valueHandler, _typeHandler, _asStatic ) ;^[METHOD] widenKey [TYPE] JavaType [PARAMETER] Class<?> keySubclass [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Class keySubclass  [TYPE]  boolean false  true 
[REPLACE]^return new MapType ( _class, _keyType, _valueType, h, _typeHandler, _asStatic ) ;^79^^^^^78^80^[REPLACE] return new MapType ( _class, _keyType, _valueType, _valueHandler, h, _asStatic ) ;^[METHOD] withTypeHandler [TYPE] MapType [PARAMETER] Object h [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Object h  [TYPE]  boolean false  true 
[REPLACE]^return new MapType ( _class, _keyType, _valueType.withValueHandler ( h ) , _valueHandler, _typeHandler, _asStatic ) ;^85^86^^^^83^87^[REPLACE] return new MapType ( _class, _keyType, _valueType.withTypeHandler ( h ) , _valueHandler, _typeHandler, _asStatic ) ;^[METHOD] withContentTypeHandler [TYPE] MapType [PARAMETER] Object h [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Object h  [TYPE]  boolean false  true 
[REPLACE]^return  new MapType ( subclass, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic )  ;^91^^^^^90^92^[REPLACE] return new MapType ( _class, _keyType, _valueType, h, _typeHandler, _asStatic ) ;^[METHOD] withValueHandler [TYPE] MapType [PARAMETER] Object h [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Object h  [TYPE]  boolean false  true 
[REPLACE]^return  new MapType ( subclass, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic )  , _valueHandler, _typeHandler, _asStatic ) ;^96^97^^^^95^98^[REPLACE] return new MapType ( _class, _keyType, _valueType.withValueHandler ( h ) , _valueHandler, _typeHandler, _asStatic ) ;^[METHOD] withContentValueHandler [TYPE] MapType [PARAMETER] Object h [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Object h  [TYPE]  boolean false  true 
[REPLACE]^if  ( keySubclass == _keyType.getRawClass (  )  )  {^102^^^^^101^107^[REPLACE] if  ( _asStatic )  {^[METHOD] withStaticTyping [TYPE] MapType [PARAMETER] [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return null;^103^^^^^101^107^[REPLACE] return this;^[METHOD] withStaticTyping [TYPE] MapType [PARAMETER] [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return  new MapType ( subclass, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic )  , _valueType.withStaticTyping (  ) , _valueHandler, _typeHandler, true ) ;^105^106^^^^101^107^[REPLACE] return new MapType ( _class, _keyType.withStaticTyping (  ) , _valueType.withStaticTyping (  ) , _valueHandler, _typeHandler, true ) ;^[METHOD] withStaticTyping [TYPE] MapType [PARAMETER] [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return  new MapType ( subclass, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic )   , _valueType, _valueHandler, _typeHandler, _asStatic ) ;^118^119^^^^116^120^[REPLACE] return new MapType ( _class, _keyType.withTypeHandler ( h ) , _valueType, _valueHandler, _typeHandler, _asStatic ) ;^[METHOD] withKeyTypeHandler [TYPE] MapType [PARAMETER] Object h [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Object h  [TYPE]  boolean false  true 
[REPLACE]^return new MapType ( _class, _keyType .withKeyValueHandler ( h )  , _valueType, _valueHandler, _typeHandler, _asStatic ) ;^124^125^^^^123^126^[REPLACE] return new MapType ( _class, _keyType.withValueHandler ( h ) , _valueType, _valueHandler, _typeHandler, _asStatic ) ;^[METHOD] withKeyValueHandler [TYPE] MapType [PARAMETER] Object h [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  Object h  [TYPE]  boolean false  true 
[REPLACE]^return "[map type; class "+     +", "+_keyType+" -> "+_valueType+"]";^137^^^^^135^138^[REPLACE] return "[map type; class "+_class.getName (  ) +", "+_keyType+" -> "+_valueType+"]";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] MapType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 