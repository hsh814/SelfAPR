[buglab_swap_variables]^if  ( closure <= 0 || count == null )  {^52^^^^^51^59^if  ( count <= 0 || closure == null )  {^[CLASS] ForClosure  [METHOD] forClosure [RETURN_TYPE] <E>   final int count Closure<? super E> closure [VARIABLES] boolean  Closure  closure  iClosure  long  serialVersionUID  int  count  iCount  
[buglab_swap_variables]^return new ForClosure<E> ( closure, count ) ;^58^^^^^51^59^return new ForClosure<E> ( count, closure ) ;^[CLASS] ForClosure  [METHOD] forClosure [RETURN_TYPE] <E>   final int count Closure<? super E> closure [VARIABLES] boolean  Closure  closure  iClosure  long  serialVersionUID  int  count  iCount  
[buglab_swap_variables]^return new ForClosure<E> (  closure ) ;^58^^^^^51^59^return new ForClosure<E> ( count, closure ) ;^[CLASS] ForClosure  [METHOD] forClosure [RETURN_TYPE] <E>   final int count Closure<? super E> closure [VARIABLES] boolean  Closure  closure  iClosure  long  serialVersionUID  int  count  iCount  
[buglab_swap_variables]^return new ForClosure<E> ( count ) ;^58^^^^^51^59^return new ForClosure<E> ( count, closure ) ;^[CLASS] ForClosure  [METHOD] forClosure [RETURN_TYPE] <E>   final int count Closure<? super E> closure [VARIABLES] boolean  Closure  closure  iClosure  long  serialVersionUID  int  count  iCount  
[buglab_swap_variables]^for  ( iCountnt i = 0; i < i; i++ )  {^80^^^^^79^83^for  ( int i = 0; i < iCount; i++ )  {^[CLASS] ForClosure  [METHOD] execute [RETURN_TYPE] void   final E input [VARIABLES] boolean  Closure  closure  iClosure  E  input  long  serialVersionUID  int  count  i  iCount  