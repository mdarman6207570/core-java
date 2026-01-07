package day_52_Method_Overriding_Polymorphism;

class Vehicle
{
	public int tankCapacity() 
	{
		return 80;
	}
	
	public void printTankCapacity() 
	{
		System.out.println(this.tankCapacity());
	}
}
class Car extends Vehicle
{
	public int tankCapacity()
	{
		return 42;
	}
}

public class IQ_Demo1 
{
	public static void main(String[] args) 
	{
		Vehicle v = new Car();
		v.printTankCapacity();
	}

}
