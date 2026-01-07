package day_52_Method_Overriding_Polymorphism;

class Bird2
{
	public void roam() 
	{
		System.out.println("Generic Bird is roaming");
	}
}
class Parrot2 extends Bird2
{
	/*
	protected void roam()  //error [cannot reduce the visibility] 
	{
		System.out.println("Parrot Bird is roaming");
	}
	*/
}

public class AccessModifierRule 
{
	public static void main(String[] args) 
	{
		Bird2 a = new Parrot2();
		a.roam();
	}

}
