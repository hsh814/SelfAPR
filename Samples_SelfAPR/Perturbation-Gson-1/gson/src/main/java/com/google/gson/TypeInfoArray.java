[P8_Replace_Mix]^private  Class<?> componentRawType;^29^^^^^24^34^private final Class<?> componentRawType;^[CLASS] TypeInfoArray   [VARIABLES] 
[P8_Replace_Mix]^private  Type secondLevel;^30^^^^^25^35^private final Type secondLevel;^[CLASS] TypeInfoArray   [VARIABLES] 
[P5_Replace_Variable]^super ( secondLevel ) ;^33^^^^^32^40^super ( type ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P14_Delete_Statement]^^33^^^^^32^40^super ( type ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P7_Replace_Invocation]^while  ( rootComponentType .getComponentType (  )   )  {^35^^^^^32^40^while  ( rootComponentType.isArray (  )  )  {^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P7_Replace_Invocation]^rootComponentType = rootComponentType .isArray (  )  ;^36^^^^^32^40^rootComponentType = rootComponentType.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P8_Replace_Mix]^rootComponentType =  null.getComponentType (  ) ;^36^^^^^32^40^rootComponentType = rootComponentType.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P14_Delete_Statement]^^36^^^^^32^40^rootComponentType = rootComponentType.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P11_Insert_Donor_Statement]^while  ( rootComponentType.isArray (  )  )  { rootComponentType = rootComponentType.getComponentType (  ) ;rootComponentType = rootComponentType.getComponentType (  ) ;^36^^^^^32^40^rootComponentType = rootComponentType.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P14_Delete_Statement]^^35^36^^^^32^40^while  ( rootComponentType.isArray (  )  )  { rootComponentType = rootComponentType.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P5_Replace_Variable]^rootComponentType = 1.getComponentType (  ) ;^36^^^^^32^40^rootComponentType = rootComponentType.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P8_Replace_Mix]^this.componentRawType =  null;^38^^^^^32^40^this.componentRawType = rootComponentType;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P5_Replace_Variable]^this.secondLevel = extractSecondLevelType ( actualType, 1 ) ;^39^^^^^32^40^this.secondLevel = extractSecondLevelType ( actualType, rawClass ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P5_Replace_Variable]^this.secondLevel = extractSecondLevelType (  rawClass ) ;^39^^^^^32^40^this.secondLevel = extractSecondLevelType ( actualType, rawClass ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P5_Replace_Variable]^this.secondLevel = extractSecondLevelType ( actualType ) ;^39^^^^^32^40^this.secondLevel = extractSecondLevelType ( actualType, rawClass ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P5_Replace_Variable]^this.secondLevel = extractSecondLevelType ( rawClass, actualType ) ;^39^^^^^32^40^this.secondLevel = extractSecondLevelType ( actualType, rawClass ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P8_Replace_Mix]^this.secondLevel  =  this.secondLevel ;^39^^^^^32^40^this.secondLevel = extractSecondLevelType ( actualType, rawClass ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P14_Delete_Statement]^^39^^^^^32^40^this.secondLevel = extractSecondLevelType ( actualType, rawClass ) ;^[CLASS] TypeInfoArray  [METHOD] <init> [RETURN_TYPE] Type)   Type type [VARIABLES] Type  secondLevel  type  Class  componentRawType  rootComponentType  boolean  
[P2_Replace_Operator]^return actualType  >=  GenericArrayType ? (  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : rawClass.getComponentType (  ) ;^43^44^^^^42^45^return actualType instanceof GenericArrayType ? (  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : rawClass.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] extractSecondLevelType [RETURN_TYPE] Type   Type actualType Class<?> rawClass [VARIABLES] Type  actualType  secondLevel  type  Class  componentRawType  rawClass  rootComponentType  boolean  
[P5_Replace_Variable]^return type instanceof GenericArrayType ? (  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : rawClass.getComponentType (  ) ;^43^44^^^^42^45^return actualType instanceof GenericArrayType ? (  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : rawClass.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] extractSecondLevelType [RETURN_TYPE] Type   Type actualType Class<?> rawClass [VARIABLES] Type  actualType  secondLevel  type  Class  componentRawType  rawClass  rootComponentType  boolean  
[P5_Replace_Variable]^return actualType instanceof GenericArrayType ? (  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : null.getComponentType (  ) ;^43^44^^^^42^45^return actualType instanceof GenericArrayType ? (  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : rawClass.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] extractSecondLevelType [RETURN_TYPE] Type   Type actualType Class<?> rawClass [VARIABLES] Type  actualType  secondLevel  type  Class  componentRawType  rawClass  rootComponentType  boolean  
[P5_Replace_Variable]^return rawClass instanceof GenericArrayType ? (  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : actualType.getComponentType (  ) ;^43^44^^^^42^45^return actualType instanceof GenericArrayType ? (  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : rawClass.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] extractSecondLevelType [RETURN_TYPE] Type   Type actualType Class<?> rawClass [VARIABLES] Type  actualType  secondLevel  type  Class  componentRawType  rawClass  rootComponentType  boolean  
[P7_Replace_Invocation]^return actualType instanceof GenericArrayType ? (  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : rawClass .isArray (  )  ;^43^44^^^^42^45^return actualType instanceof GenericArrayType ? (  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : rawClass.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] extractSecondLevelType [RETURN_TYPE] Type   Type actualType Class<?> rawClass [VARIABLES] Type  actualType  secondLevel  type  Class  componentRawType  rawClass  rootComponentType  boolean  
[P8_Replace_Mix]^return actualType instanceof GenericArrayType ? ( !  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : rawClass.getComponentType (  ) ;^43^44^^^^42^45^return actualType instanceof GenericArrayType ? (  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : rawClass.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] extractSecondLevelType [RETURN_TYPE] Type   Type actualType Class<?> rawClass [VARIABLES] Type  actualType  secondLevel  type  Class  componentRawType  rawClass  rootComponentType  boolean  
[P14_Delete_Statement]^^44^^^^^42^45^(  ( GenericArrayType )  actualType ) .getGenericComponentType (  )  : rawClass.getComponentType (  ) ;^[CLASS] TypeInfoArray  [METHOD] extractSecondLevelType [RETURN_TYPE] Type   Type actualType Class<?> rawClass [VARIABLES] Type  actualType  secondLevel  type  Class  componentRawType  rawClass  rootComponentType  boolean  
[P5_Replace_Variable]^return type;^56^^^^^55^57^return secondLevel;^[CLASS] TypeInfoArray  [METHOD] getSecondLevelType [RETURN_TYPE] Type   [VARIABLES] Type  actualType  secondLevel  type  Class  componentRawType  rawClass  rootComponentType  boolean  
