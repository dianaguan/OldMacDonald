class NamedCow extends Cow
{
	 private String myName;     
  
     public Cow(String name)     {         
         myName = name;           
     }     
     public Cow()     {         
         myName = "unknown";         
     }      
     public String getName(){return myName;}     

}