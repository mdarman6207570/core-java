package _Method_Overriding__Co_Varient;

class A
{
	
}

class B extends A
{
	
}

class Vehicle
{
	public A run()
	{
		System.out.println("Vehicle is running");
		return new A();
	}
}

class Car extends Vehicle
{
	public B run()
	{
		System.out.println("Car is running");
		return new B();
	}
}

public class CoVariantDemo2 
{
	public static void main(String[] args) 
	{
		Vehicle v = new Car();
		v.run();
	}
}
