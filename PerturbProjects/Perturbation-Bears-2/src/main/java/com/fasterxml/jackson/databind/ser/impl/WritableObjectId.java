[REPLACE]^public  ObjectIdGenerator<?> generator;^18^^^^^^^[REPLACE] public final ObjectIdGenerator<?> generator;^ [CLASS] WritableObjectId  
[REPLACE]^private boolean idWritten = false;^26^^^^^^^[REPLACE] protected boolean idWritten = false;^ [CLASS] WritableObjectId  
[ADD]^^62^^^^^61^76^[ADD] idWritten = true;^[METHOD] writeAsField [TYPE] void [PARAMETER] JsonGenerator gen SerializerProvider provider ObjectIdWriter w [CLASS] WritableObjectId   [TYPE]  ObjectIdGenerator generator  [TYPE]  boolean false  idWritten  true  [TYPE]  ObjectIdWriter w  [TYPE]  SerializableString name  [TYPE]  JsonGenerator gen  [TYPE]  Object forPojo  id  [TYPE]  SerializerProvider provider 
[REPLACE]^return id  ;^68^^^^^61^76^[REPLACE] return;^[METHOD] writeAsField [TYPE] void [PARAMETER] JsonGenerator gen SerializerProvider provider ObjectIdWriter w [CLASS] WritableObjectId   [TYPE]  ObjectIdGenerator generator  [TYPE]  boolean false  idWritten  true  [TYPE]  ObjectIdWriter w  [TYPE]  SerializableString name  [TYPE]  JsonGenerator gen  [TYPE]  Object forPojo  id  [TYPE]  SerializerProvider provider 
[REPLACE]^if  ( name == false )  {^72^^^^^61^76^[REPLACE] if  ( name != null )  {^[METHOD] writeAsField [TYPE] void [PARAMETER] JsonGenerator gen SerializerProvider provider ObjectIdWriter w [CLASS] WritableObjectId   [TYPE]  ObjectIdGenerator generator  [TYPE]  boolean false  idWritten  true  [TYPE]  ObjectIdWriter w  [TYPE]  SerializableString name  [TYPE]  JsonGenerator gen  [TYPE]  Object forPojo  id  [TYPE]  SerializerProvider provider 