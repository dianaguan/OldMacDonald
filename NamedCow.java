class NamedCow extends Cow
{
	 protected String myName;   
	 protected String myType;
	 protected String mySound;
  
     public NamedCow(String name, String type, String sound)     {         
         myName = name;           
         myType = type;
         mySound = sound;
     }          
     public String getName(){return myName;}     

}
