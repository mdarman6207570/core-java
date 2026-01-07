package day_46_Polymorphism;

class Enginee
{
	private String model;
	private int engineCapacity;
	
	public Enginee(String model, int engineCapacity) 
	{
		if(engineCapacity <=0) 
		{
			System.out.println("Error Invalid Input" );
			System.exit(0);
		}
		else 
		{
			this.model = model;
			this.engineCapacity = engineCapacity;
		}
	}

	public String getModel() 
	{
		return model;
	}

	public int getEngineCapacity() 
	{
		return engineCapacity;
	}

	@Override
	public String toString() 
	{
		return "Engine [model=" + model + ", engineCapacity=" + engineCapacity + "]";
	}
}

class Car
{
	private String make;
	private String model;
	private int year; 
	private Enginee engine;
	
	public Car(String make, String model, int year,Enginee engine) 
	{
		if(year <=0) 
		{
			System.out.println("Error Invalid Input" );
			System.exit(0);
		}
		else 
		{
			this.make = make;
			this.model = model;
			this.year = year;
			this.engine = engine;
		}
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", " + engine + "]";
	}
	
   	

}


public class Main 
{
	public static void main(String args[]) 
	{
		Enginee engine = new Enginee("V6 Hybrid", 3000);
		Car car = new Car("Toyota", "Camry", 2023, engine);
		System.out.println(car);
	}
	
}
