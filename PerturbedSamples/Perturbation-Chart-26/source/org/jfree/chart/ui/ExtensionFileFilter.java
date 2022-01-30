[REPLACE]^private  double  description;^56^^^^^^^[REPLACE] private String description;^ [CLASS] ExtensionFileFilter  
[REPLACE]^private  char  extension;^59^^^^^^^[REPLACE] private String extension;^ [CLASS] ExtensionFileFilter  
[REPLACE]^this.description =  extension;^68^^^^^67^70^[REPLACE] this.description = description;^[METHOD] <init> [TYPE] String) [PARAMETER] String description String extension [CLASS] ExtensionFileFilter   [TYPE]  String description  extension  [TYPE]  boolean false  true 
[REPLACE]^this.extension =  description;^69^^^^^67^70^[REPLACE] this.extension = extension;^[METHOD] <init> [TYPE] String) [PARAMETER] String description String extension [CLASS] ExtensionFileFilter   [TYPE]  String description  extension  [TYPE]  boolean false  true 
[REPLACE]^if  ( file.getName (  )  )  {^81^^^^^79^93^[REPLACE] if  ( file.isDirectory (  )  )  {^[METHOD] accept [TYPE] boolean [PARAMETER] File file [CLASS] ExtensionFileFilter   [TYPE]  File file  [TYPE]  String description  extension  name  [TYPE]  boolean false  true 
[ADD]^return true;^81^82^83^^^79^93^[ADD] if  ( file.isDirectory (  )  )  { return true; }^[METHOD] accept [TYPE] boolean [PARAMETER] File file [CLASS] ExtensionFileFilter   [TYPE]  File file  [TYPE]  String description  extension  name  [TYPE]  boolean false  true 
[REPLACE]^return false;^82^^^^^79^93^[REPLACE] return true;^[METHOD] accept [TYPE] boolean [PARAMETER] File file [CLASS] ExtensionFileFilter   [TYPE]  File file  [TYPE]  String description  extension  name  [TYPE]  boolean false  true 
[REPLACE]^String name = file.isDirectory (  ) .toLowerCase (  ) ;^85^^^^^79^93^[REPLACE] String name = file.getName (  ) .toLowerCase (  ) ;^[METHOD] accept [TYPE] boolean [PARAMETER] File file [CLASS] ExtensionFileFilter   [TYPE]  File file  [TYPE]  String description  extension  name  [TYPE]  boolean false  true 
[REPLACE]^if  ( extension.endsWith ( this.extension )  )  {^86^^^^^79^93^[REPLACE] if  ( name.endsWith ( this.extension )  )  {^[METHOD] accept [TYPE] boolean [PARAMETER] File file [CLASS] ExtensionFileFilter   [TYPE]  File file  [TYPE]  String description  extension  name  [TYPE]  boolean false  true 
[ADD]^return true;^86^87^88^^^79^93^[ADD] if  ( name.endsWith ( this.extension )  )  { return true; }^[METHOD] accept [TYPE] boolean [PARAMETER] File file [CLASS] ExtensionFileFilter   [TYPE]  File file  [TYPE]  String description  extension  name  [TYPE]  boolean false  true 
[REPLACE]^return true;^90^^^^^79^93^[REPLACE] return false;^[METHOD] accept [TYPE] boolean [PARAMETER] File file [CLASS] ExtensionFileFilter   [TYPE]  File file  [TYPE]  String description  extension  name  [TYPE]  boolean false  true 
[REPLACE]^return false;^87^^^^^79^93^[REPLACE] return true;^[METHOD] accept [TYPE] boolean [PARAMETER] File file [CLASS] ExtensionFileFilter   [TYPE]  File file  [TYPE]  String description  extension  name  [TYPE]  boolean false  true 
[REPLACE]^return false;^101^^^^^100^102^[REPLACE] return this.description;^[METHOD] getDescription [TYPE] String [PARAMETER] [CLASS] ExtensionFileFilter   [TYPE]  String description  extension  name  [TYPE]  boolean false  true 