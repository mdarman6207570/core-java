package blc;

public class Car implements Runnable
{
	private ParkingGarage garage;
	private String carName;

	public Car(ParkingGarage garage, String carName) 
	{
		super();
		this.garage = garage;
		this.carName = carName;
	}

	@Override
	public void run() 
	{
		garage.parkCar(carName);
		
	   try 
	   {
		Thread.sleep((int) Math.random()*20000);
	   }
	   catch (InterruptedException e) 
	   {
		e.printStackTrace();
		Thread.currentThread().interrupt();
	   }
	   
	   garage.freeSpot(carName);
	}
	
}
