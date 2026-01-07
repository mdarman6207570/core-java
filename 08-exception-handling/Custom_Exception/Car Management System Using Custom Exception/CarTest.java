package blc;

public class CarTest 
{
	public static void stop(String msg) throws CarStoppedException
	{
		if(msg == "stop")
		{
			throw new CarStoppedException("Car stopped for some reason.");
		}
		else
		{
			System.out.println("Car not stalled.");
		}
	}
	
	public static void puncture(String msg) throws CarPunctureException
	{
		if(msg == "puncture")
		{
			throw new CarPunctureException("Car is punctured.");
		}
		else
		{
			System.out.println("Car not punctured.");
		}
	}
	
	
	public static void carHeat(int heat) throws CarHeatException
	{
		if(heat >50 )
		{
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		}
		else
		{
			System.out.println("Car temperature normal.");
		}
	}
}
