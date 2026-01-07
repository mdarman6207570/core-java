package constructor_chaining;

class Base
{
	public Base()
	{
		this("Java");
		System.out.println("No Argument Constructor of Base class");
	}
	
	public Base(String lang)
	{
		System.out.println("Most Secure language is :"+lang);
	}
	
}	
	
class Derived extends Base
{
	public Derived()
	{
		super();
		System.out.println("No Argument Constructor of Derived class");
	}
}

public class ConstructorChainingDemo4 
{

	public static void main(String[] args) 
	{
		new Derived();

	}

}
