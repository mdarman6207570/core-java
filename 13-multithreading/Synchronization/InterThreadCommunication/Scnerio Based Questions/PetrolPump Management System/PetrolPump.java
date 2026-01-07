package multithreading_scenario_program;

public class PetrolPump 
{
	public synchronized void refillCar(String carName)
	{
		System.out.println(carName+" started filling");
		System.out.println(carName+" completed filling");
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}
}
