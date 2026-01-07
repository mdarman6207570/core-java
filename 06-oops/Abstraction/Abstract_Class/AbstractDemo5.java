package day_56_Abstract_class__and__abstract_methods;

abstract class Animal
{
	public abstract void checkup();
}

class Lion extends Animal
{

	@Override
	public void checkup() 
	{
	   System.out.println("Lion Checkup");
	}
}

class Elephant extends Animal
{
	@Override
	public void checkup() {
		System.out.println("Elephant Checkup");
		
	}
}

public class AbstractDemo5 {

	public static void main(String[] args) 
	{
		Animal lions[] = { new Lion(),new Lion(),new Lion()};
		regularAnimalCheck(lions);
		
		Animal elephants[] = new Animal[2];
		elephants[0] = new Elephant();
		elephants[1] = new Elephant();
		
		regularAnimalCheck(elephants);
	}
	
	public static void regularAnimalCheck(Animal animals[]) 
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}
	}

}
