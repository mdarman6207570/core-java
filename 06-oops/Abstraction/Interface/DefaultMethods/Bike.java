package day_59__Java_8_Features;

public class Bike implements Vehicle
{

	@Override
	public void run() 
	{
		System.out.println("Bike is Running");
	}

	@Override
	public void horn() 
	{
		System.out.println("Bike is having Horn : PEEP PEEP");	
	}
}
