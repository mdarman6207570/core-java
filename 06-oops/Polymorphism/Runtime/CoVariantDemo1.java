package _Method_Overriding__Co_Varient;

class Alpha
{
	public void m1() 
	{
		System.out.println("Alpha class m1 method");
	}
}

class Beta extends Alpha
{
	/*
	public double m1()    //error
	{
		System.out.println("Beta classs m1 method");
		return 0.0;
	}
	*/
}

public class CoVariantDemo1 
{
	public static void main(String[] args) 
	{
		Alpha a = new Beta();
		a.m1();
	}

}


//NOTE : return type double is not compaitable with void 