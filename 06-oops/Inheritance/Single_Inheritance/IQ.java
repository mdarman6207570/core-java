package singlel_level_inheritance;

class Alpha
{

	public Alpha() {
		super();
		System.out.println("Alpha class Constructor");
	}
	
	{
		System.out.println("Non static block of Alpha class!!!");
	}
	
	Beta b = new Beta();
}

class Beta{

	public Beta() 
	{
		System.out.println("No argument constructor of Beta class");
	}	
}

public class IQ 
{
    public static void main(String []args) 
    {
	  	new Alpha();
	}
}
