package day_59__Java_8_Features;

public class Car implements Vehicle 
{

	@Override
	public void run() 
	{
		System.out.println("Car is Running");
	}

	@Override
	public void horn() 
	{
		System.out.println("Car is having Horn : POP POP");	
	}
	
	public void digitalMeter() 
	{
		System.out.println("Car is having Digital Meter");	
	}
	
}
