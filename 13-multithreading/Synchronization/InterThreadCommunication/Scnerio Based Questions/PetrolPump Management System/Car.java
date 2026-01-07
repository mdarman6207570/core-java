package multithreading_scenario_program;

public class Car implements Runnable
{
	
	String name;
	PetrolPump petrolPump;
	
	Car(String name, PetrolPump p)
	{
		this.name = name;
		this.petrolPump = p;
	}

	@Override
	public void run() 
	{
	    
	    	petrolPump.refillCar(name);
	}
	
}
