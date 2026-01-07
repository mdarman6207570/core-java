package day_56_Abstract_class__and__abstract_methods;

abstract class Car
{
	protected int speed = 120;
	
	public Car() 
	{
		System.out.println("Car class Constructor");
	}
	
	public void getjCarDerails() 
	{
		System.out.println("it has four wheels and one engine!!!");
	}
	
	public abstract void run();
}

class Honda extends Car
{

	@Override
	public void run() 
	{
		System.out.println("Honda JCar is Running!!!");
	}
	
}

public class AbstractDemo3 
{
	public static void main(String[] args) 
	{
		Car car = new Honda();
		System.out.println("Speed of the car is :"+car.speed);
		car.getjCarDerails();
		car.run();
	}

}
