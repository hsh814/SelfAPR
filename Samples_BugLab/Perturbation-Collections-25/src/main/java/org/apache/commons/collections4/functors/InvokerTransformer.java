[buglab_swap_variables]^if  (  (  ( args == null )  &&  ( paramTypes != null )  ) ||  (  ( paramTypes != null )  &&  ( args == null )  ) ||  (  ( paramTypes != null )  &&  ( args != null )  &&  ( paramTypes.length != args.length )  )  )  {^75^76^77^^^70^84^if  (  (  ( paramTypes == null )  &&  ( args != null )  ) ||  (  ( paramTypes != null )  &&  ( args == null )  ) ||  (  ( paramTypes != null )  &&  ( args != null )  &&  ( paramTypes.length != args.length )  )  )  {^[CLASS] InvokerTransformer  [METHOD] invokerTransformer [RETURN_TYPE] <I,O>   String methodName Class<?>[] paramTypes Object[] args [VARIABLES] Class[]  iParamTypes  paramTypes  String  iMethodName  methodName  boolean  long  serialVersionUID  Object[]  args  iArgs  
[buglab_swap_variables]^if  (  (  ( paramTypes == null )  &&  ( paramTypes.length != null )  ) ||  (  ( paramTypes != null )  &&  ( args == null )  ) ||  (  ( paramTypes != null )  &&  ( args != null )  &&  ( args != args.length )  )  )  {^75^76^77^^^70^84^if  (  (  ( paramTypes == null )  &&  ( args != null )  ) ||  (  ( paramTypes != null )  &&  ( args == null )  ) ||  (  ( paramTypes != null )  &&  ( args != null )  &&  ( paramTypes.length != args.length )  )  )  {^[CLASS] InvokerTransformer  [METHOD] invokerTransformer [RETURN_TYPE] <I,O>   String methodName Class<?>[] paramTypes Object[] args [VARIABLES] Class[]  iParamTypes  paramTypes  String  iMethodName  methodName  boolean  long  serialVersionUID  Object[]  args  iArgs  
[buglab_swap_variables]^if  (  (  ( paramTypes == null )  &&  ( args != null )  ) ||  (  ( paramTypes != null )  &&  ( args == null )  ) ||  (  ( paramTypes != null )  &&  ( args != null )  &&  ( args.length != paramTypes.length )  )  )  {^75^76^77^^^70^84^if  (  (  ( paramTypes == null )  &&  ( args != null )  ) ||  (  ( paramTypes != null )  &&  ( args == null )  ) ||  (  ( paramTypes != null )  &&  ( args != null )  &&  ( paramTypes.length != args.length )  )  )  {^[CLASS] InvokerTransformer  [METHOD] invokerTransformer [RETURN_TYPE] <I,O>   String methodName Class<?>[] paramTypes Object[] args [VARIABLES] Class[]  iParamTypes  paramTypes  String  iMethodName  methodName  boolean  long  serialVersionUID  Object[]  args  iArgs  
[buglab_swap_variables]^if  ( paramTypes.length == null || paramTypes == 0 )  {^80^^^^^70^84^if  ( paramTypes == null || paramTypes.length == 0 )  {^[CLASS] InvokerTransformer  [METHOD] invokerTransformer [RETURN_TYPE] <I,O>   String methodName Class<?>[] paramTypes Object[] args [VARIABLES] Class[]  iParamTypes  paramTypes  String  iMethodName  methodName  boolean  long  serialVersionUID  Object[]  args  iArgs  
[buglab_swap_variables]^return new InvokerTransformer<I, O> ( paramTypes, methodName, args ) ;^83^^^^^70^84^return new InvokerTransformer<I, O> ( methodName, paramTypes, args ) ;^[CLASS] InvokerTransformer  [METHOD] invokerTransformer [RETURN_TYPE] <I,O>   String methodName Class<?>[] paramTypes Object[] args [VARIABLES] Class[]  iParamTypes  paramTypes  String  iMethodName  methodName  boolean  long  serialVersionUID  Object[]  args  iArgs  
[buglab_swap_variables]^return new InvokerTransformer<I, O> (  paramTypes, args ) ;^83^^^^^70^84^return new InvokerTransformer<I, O> ( methodName, paramTypes, args ) ;^[CLASS] InvokerTransformer  [METHOD] invokerTransformer [RETURN_TYPE] <I,O>   String methodName Class<?>[] paramTypes Object[] args [VARIABLES] Class[]  iParamTypes  paramTypes  String  iMethodName  methodName  boolean  long  serialVersionUID  Object[]  args  iArgs  
[buglab_swap_variables]^return new InvokerTransformer<I, O> ( methodName, args, paramTypes ) ;^83^^^^^70^84^return new InvokerTransformer<I, O> ( methodName, paramTypes, args ) ;^[CLASS] InvokerTransformer  [METHOD] invokerTransformer [RETURN_TYPE] <I,O>   String methodName Class<?>[] paramTypes Object[] args [VARIABLES] Class[]  iParamTypes  paramTypes  String  iMethodName  methodName  boolean  long  serialVersionUID  Object[]  args  iArgs  
[buglab_swap_variables]^return new InvokerTransformer<I, O> ( methodName,  args ) ;^83^^^^^70^84^return new InvokerTransformer<I, O> ( methodName, paramTypes, args ) ;^[CLASS] InvokerTransformer  [METHOD] invokerTransformer [RETURN_TYPE] <I,O>   String methodName Class<?>[] paramTypes Object[] args [VARIABLES] Class[]  iParamTypes  paramTypes  String  iMethodName  methodName  boolean  long  serialVersionUID  Object[]  args  iArgs  
[buglab_swap_variables]^return new InvokerTransformer<I, O> ( args, paramTypes, methodName ) ;^83^^^^^70^84^return new InvokerTransformer<I, O> ( methodName, paramTypes, args ) ;^[CLASS] InvokerTransformer  [METHOD] invokerTransformer [RETURN_TYPE] <I,O>   String methodName Class<?>[] paramTypes Object[] args [VARIABLES] Class[]  iParamTypes  paramTypes  String  iMethodName  methodName  boolean  long  serialVersionUID  Object[]  args  iArgs  
[buglab_swap_variables]^return new InvokerTransformer<I, O> ( methodName, paramTypes ) ;^83^^^^^70^84^return new InvokerTransformer<I, O> ( methodName, paramTypes, args ) ;^[CLASS] InvokerTransformer  [METHOD] invokerTransformer [RETURN_TYPE] <I,O>   String methodName Class<?>[] paramTypes Object[] args [VARIABLES] Class[]  iParamTypes  paramTypes  String  iMethodName  methodName  boolean  long  serialVersionUID  Object[]  args  iArgs  
[buglab_swap_variables]^return  ( O )  iArgs.invoke ( input, method ) ;^129^^^^^122^140^return  ( O )  method.invoke ( input, iArgs ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^return  ( O )  input.invoke ( method, iArgs ) ;^129^^^^^122^140^return  ( O )  method.invoke ( input, iArgs ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^return  ( O )  method.invoke (  iArgs ) ;^129^^^^^122^140^return  ( O )  method.invoke ( input, iArgs ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^return  ( O )  method.invoke ( iArgs, input ) ;^129^^^^^122^140^return  ( O )  method.invoke ( input, iArgs ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^return  ( O )  method.invoke ( input ) ;^129^^^^^122^140^return  ( O )  method.invoke ( input, iArgs ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^final Method method = iParamTypes.getMethod ( iMethodName, cls ) ;^128^^^^^122^140^final Method method = cls.getMethod ( iMethodName, iParamTypes ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^final Method method = cls.getMethod ( iParamTypes, iMethodName ) ;^128^^^^^122^140^final Method method = cls.getMethod ( iMethodName, iParamTypes ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^final Method method = cls.getMethod (  iParamTypes ) ;^128^^^^^122^140^final Method method = cls.getMethod ( iMethodName, iParamTypes ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^final Method method = cls.getMethod ( iMethodName ) ;^128^^^^^122^140^final Method method = cls.getMethod ( iMethodName, iParamTypes ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^final Method method = iMethodName.getMethod ( cls, iParamTypes ) ;^128^^^^^122^140^final Method method = cls.getMethod ( iMethodName, iParamTypes ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^throw new FunctorException ( "InvokerTransformer: The method '" + input + "' on '" + iMethodName.getClass (  )  + "' does not exist" ) ;^131^132^^^^122^140^throw new FunctorException ( "InvokerTransformer: The method '" + iMethodName + "' on '" + input.getClass (  )  + "' does not exist" ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^throw new FunctorException ( "InvokerTransformer: The method '" + input + "' on '" + iMethodName.getClass (  )  + "' cannot be accessed" ) ;^134^135^^^^122^140^throw new FunctorException ( "InvokerTransformer: The method '" + iMethodName + "' on '" + input.getClass (  )  + "' cannot be accessed" ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^throw new FunctorException ( "InvokerTransformer: The method '" + input + "' on '" + iMethodName.getClass (  )  + "' threw an exception", ex ) ;^137^138^^^^122^140^throw new FunctorException ( "InvokerTransformer: The method '" + iMethodName + "' on '" + input.getClass (  )  + "' threw an exception", ex ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^throw new FunctorException ( "InvokerTransformer: The method '" + ex + "' on '" + input.getClass (  )  + "' threw an iMethodNameception", ex ) ;^137^138^^^^122^140^throw new FunctorException ( "InvokerTransformer: The method '" + iMethodName + "' on '" + input.getClass (  )  + "' threw an exception", ex ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^throw new FunctorException ( "InvokerTransformer: The method '" + iMethodName + "' on '" + input.getClass (  )  + "' threw an exception" ) ;^137^138^^^^122^140^throw new FunctorException ( "InvokerTransformer: The method '" + iMethodName + "' on '" + input.getClass (  )  + "' threw an exception", ex ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  
[buglab_swap_variables]^throw new FunctorException ( "InvokerTransformer: The method '" + iMethodName + "' on '" + ex.getClass (  )  + "' threw an inputception", ex ) ;^137^138^^^^122^140^throw new FunctorException ( "InvokerTransformer: The method '" + iMethodName + "' on '" + input.getClass (  )  + "' threw an exception", ex ) ;^[CLASS] InvokerTransformer  [METHOD] transform [RETURN_TYPE] O   Object input [VARIABLES] Class[]  iParamTypes  paramTypes  boolean  Object  input  Class  cls  String  iMethodName  methodName  Method  method  long  serialVersionUID  Object[]  args  iArgs  InvocationTargetException  ex  NoSuchMethodException  ex  IllegalAccessException  ex  