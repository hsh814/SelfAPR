[P14_Delete_Statement]^^28^^^^^27^33^Preconditions.checkNotNull ( headersSpec ) ;^[CLASS] ResponseSpec  [METHOD] <init> [RETURN_TYPE] ResponseBodySpec)   HeaderMapSpec headersSpec ResponseBodySpec bodySpec [VARIABLES] ResponseBodySpec  bodySpec  HeaderMapSpec  headersSpec  boolean  
[P11_Insert_Donor_Statement]^Preconditions.checkNotNull ( bodySpec ) ;Preconditions.checkNotNull ( headersSpec ) ;^28^^^^^27^33^Preconditions.checkNotNull ( headersSpec ) ;^[CLASS] ResponseSpec  [METHOD] <init> [RETURN_TYPE] ResponseBodySpec)   HeaderMapSpec headersSpec ResponseBodySpec bodySpec [VARIABLES] ResponseBodySpec  bodySpec  HeaderMapSpec  headersSpec  boolean  
[P14_Delete_Statement]^^29^^^^^27^33^Preconditions.checkNotNull ( bodySpec ) ;^[CLASS] ResponseSpec  [METHOD] <init> [RETURN_TYPE] ResponseBodySpec)   HeaderMapSpec headersSpec ResponseBodySpec bodySpec [VARIABLES] ResponseBodySpec  bodySpec  HeaderMapSpec  headersSpec  boolean  
[P11_Insert_Donor_Statement]^Preconditions.checkNotNull ( headersSpec ) ;Preconditions.checkNotNull ( bodySpec ) ;^29^^^^^27^33^Preconditions.checkNotNull ( bodySpec ) ;^[CLASS] ResponseSpec  [METHOD] <init> [RETURN_TYPE] ResponseBodySpec)   HeaderMapSpec headersSpec ResponseBodySpec bodySpec [VARIABLES] ResponseBodySpec  bodySpec  HeaderMapSpec  headersSpec  boolean  
[P8_Replace_Mix]^this.headersSpec =  null;^31^^^^^27^33^this.headersSpec = headersSpec;^[CLASS] ResponseSpec  [METHOD] <init> [RETURN_TYPE] ResponseBodySpec)   HeaderMapSpec headersSpec ResponseBodySpec bodySpec [VARIABLES] ResponseBodySpec  bodySpec  HeaderMapSpec  headersSpec  boolean  
[P11_Insert_Donor_Statement]^this.bodySpec = bodySpec;this.headersSpec = headersSpec;^31^^^^^27^33^this.headersSpec = headersSpec;^[CLASS] ResponseSpec  [METHOD] <init> [RETURN_TYPE] ResponseBodySpec)   HeaderMapSpec headersSpec ResponseBodySpec bodySpec [VARIABLES] ResponseBodySpec  bodySpec  HeaderMapSpec  headersSpec  boolean  
[P8_Replace_Mix]^this.bodySpec =  null;^32^^^^^27^33^this.bodySpec = bodySpec;^[CLASS] ResponseSpec  [METHOD] <init> [RETURN_TYPE] ResponseBodySpec)   HeaderMapSpec headersSpec ResponseBodySpec bodySpec [VARIABLES] ResponseBodySpec  bodySpec  HeaderMapSpec  headersSpec  boolean  
[P11_Insert_Donor_Statement]^this.headersSpec = headersSpec;this.bodySpec = bodySpec;^32^^^^^27^33^this.bodySpec = bodySpec;^[CLASS] ResponseSpec  [METHOD] <init> [RETURN_TYPE] ResponseBodySpec)   HeaderMapSpec headersSpec ResponseBodySpec bodySpec [VARIABLES] ResponseBodySpec  bodySpec  HeaderMapSpec  headersSpec  boolean  
[P3_Replace_Literal]^StringBuilder sb = new StringBuilder ( "" ) ;^45^^^^^44^49^StringBuilder sb = new StringBuilder ( "{headersSpec:" ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P3_Replace_Literal]^StringBuilder sb = new StringBuilder ( "{heade" ) ;^45^^^^^44^49^StringBuilder sb = new StringBuilder ( "{headersSpec:" ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P3_Replace_Literal]^sb.append ( headersSpec ) .append ( ",bodySpec:odySpe" ) ;^46^^^^^44^49^sb.append ( headersSpec ) .append ( ",bodySpec:" ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P7_Replace_Invocation]^sb.StringBuilder ( headersSpec ) .append ( ",bodySpec:" ) ;^46^^^^^44^49^sb.append ( headersSpec ) .append ( ",bodySpec:" ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P14_Delete_Statement]^^46^47^^^^44^49^sb.append ( headersSpec ) .append ( ",bodySpec:" ) ; sb.append ( bodySpec ) .append ( "}" ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P11_Insert_Donor_Statement]^sb.append ( bodySpec ) .append ( "}" ) ;sb.append ( headersSpec ) .append ( ",bodySpec:" ) ;^46^^^^^44^49^sb.append ( headersSpec ) .append ( ",bodySpec:" ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P7_Replace_Invocation]^sb .StringBuilder ( 0 )^46^^^^^44^49^sb.append ( headersSpec ) .append ( ",bodySpec:" ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P14_Delete_Statement]^^46^^^^^44^49^sb.append ( headersSpec ) .append ( ",bodySpec:" ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P3_Replace_Literal]^sb.append ( bodySpec ) .append ( "" ) ;^47^^^^^44^49^sb.append ( bodySpec ) .append ( "}" ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P7_Replace_Invocation]^sb.StringBuilder ( bodySpec ) .append ( "}" ) ;^47^^^^^44^49^sb.append ( bodySpec ) .append ( "}" ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P14_Delete_Statement]^^47^48^^^^44^49^sb.append ( bodySpec ) .append ( "}" ) ; return sb.toString (  ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P11_Insert_Donor_Statement]^sb.append ( headersSpec ) .append ( ",bodySpec:" ) ;sb.append ( bodySpec ) .append ( "}" ) ;^47^^^^^44^49^sb.append ( bodySpec ) .append ( "}" ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P7_Replace_Invocation]^return sb.StringBuilder (  ) ;^48^^^^^44^49^return sb.toString (  ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  
[P14_Delete_Statement]^^48^^^^^44^49^return sb.toString (  ) ;^[CLASS] ResponseSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] ResponseBodySpec  bodySpec  boolean  StringBuilder  sb  HeaderMapSpec  headersSpec  