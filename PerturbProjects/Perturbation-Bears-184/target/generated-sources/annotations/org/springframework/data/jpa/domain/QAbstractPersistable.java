[REPLACE]^private static  long serialVersionUID = -544746190L;^18^^^^^^^[REPLACE] private static final long serialVersionUID = -544746190L;^ [CLASS] QAbstractPersistable  
[REPLACE]^public static final QAbstractPersistable abstractPersistable  = null ;^20^^^^^^^[REPLACE] public static final QAbstractPersistable abstractPersistable = new QAbstractPersistable ( "abstractPersistable" ) ;^ [CLASS] QAbstractPersistable  
[REPLACE]^public  SimplePath<java.io.Serializable> id = createSimple ( "id", java.io.Serializable.class ) ;^22^^^^^^^[REPLACE] public final SimplePath<java.io.Serializable> id = createSimple ( "id", java.io.Serializable.class ) ;^ [CLASS] QAbstractPersistable  