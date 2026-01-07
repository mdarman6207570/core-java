package day_52_Method_Overriding_Polymorphism;

class Vehicle2
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
class Car2 extends Vehicle2
{
	public int tankCapacity()
	{
		return 42;
	}
	public void printTankCapacity() 
	{
		System.out.println(super.tankCapacity());
	}
}

public class IQ_Demo2
{
	public static void main(String[] args) 
	{
		Vehicle2 v = new Car2();
		v.printTankCapacity();
	}

}
