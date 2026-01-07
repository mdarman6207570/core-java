package day_52_Method_Overriding_Polymorphism;

class Bird
{
	public void roam() 
	{
		System.out.println("Generic Bird is roaming");
	}
	public void fly() 
	{
		System.out.println("Generic Bird is flying");
	}
}
class Parrot extends Bird
{

	@Override
	public void roam() 
	{
		System.out.println("Parrot Bird is roaming");
	}

	
	
	public int fly(int height) {  // Overloading
        System.out.println("Parrot Bird is Flying with " + height + " feet height");
        return 0;
    }
	
}
public class IQ_Demo3 
{
	public static void main(String[] args) 
	{
		Parrot p = new Parrot();
		p.roam();
		p.fly(15);
	}
}
