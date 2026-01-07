package elc;

import blc.Animal;
import blc.Dog;
import blc.Lion;

public class Main 
{
   public static void main(String args[]) 
   {
	  Lion lion = new Lion();
	  lion.roam();
	  
	  Dog dog = new Dog();
	  dog.roam();
	  
	  getAnimal(dog);
	  getAnimal(lion);
   }
   
   public static void getAnimal(Animal a) 
	{
	  
	   
		if(a instanceof Lion l)
		{
			l.roam();
			l.roar();
		}
		 if(a instanceof Dog d)
		{
			d.roam();
			d.bark();
		}
	}
}
