package mcq;

class Vehicle2
{
	public int fuelCapacity()
	{
		return 40;
	}	
	
	public void printTankCapacity()
	{
		System.out.println(this.fuelCapacity());
	}
}
class Car2 extends Vehicle2
{
	@Override
	public int fuelCapacity()
	{
		return 18;
	}	
}


public class Test2 
{
	public static void main(String[] args)
	{
		Vehicle2 v1 = new Car2();
		v1.printTankCapacity();

	}
}
