package day_53_InstanceOfOperator___Override_Main_Method;

class Vehicle
{
	public void run() 
	{
		System.out.println("Vehicle is running");
	}
}

class BMW extends Vehicle
{
	
}

class Audi extends Vehicle
{
	
}

public class InstanceOfDemo4
{
	public static void main(String[] args) 
	{
		acceptCarType(new Audi());
	}

	public static void acceptCarType(Vehicle v)   //Loose Coupling
	{
		if(v instanceof BMW)
		{
			System.out.println("BMW CAR");
		}
		else
		{
			System.out.println("AUDI CAR");
		}
	}
}
