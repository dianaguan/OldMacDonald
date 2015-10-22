Farm farmy;

public void setup() 
{     
	farmy = new Farm();
	farmy.animalSounds();
    Cow c = new Cow("cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound());  

    Chick h = new Chick("chick", "peep");   
    System.out.println(h.getType() + " goes " + h.getSound());  

    Pig p = new Pig("pig", "oink");   
    System.out.println(p.getType() + " goes " + p.getSound());  
}