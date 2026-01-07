package day_58__Interface;

sealed interface Movebale permits Car
{
	int SPEED = 120;          //public + static + final
	
	void move();   //public + abstract
}

non-sealed class Car implements Movebale
{

	@Override
	public void move() 
	{
		//SPEED = 150          [Re-Assignment is not possible]
		System.out.println("Car is moving wuth :"+SPEED+" speed");
	}
}

public class InterfaceDemo1 
{
	public static void main(String[] args) 
	{
		Movebale m = new Car();
		m.move();
		System.out.println("Speed of the Car is :"+Movebale.SPEED);
	}
}
