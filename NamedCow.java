class NamedCow extends Cow
{
	 protected String myName;   
	 protected String myType;
	 protected String mySound;
  
     public NamedCow(String type, String name,  String sound)     {         
         myName = name;           
     
     }          
     public String getName(){return myName;}     

}
