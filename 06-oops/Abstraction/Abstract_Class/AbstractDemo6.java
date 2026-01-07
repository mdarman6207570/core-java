package day_56_Abstract_class__and__abstract_methods;

abstract class Alpha
{
	public abstract void show();
	public abstract void demo();
}

abstract class Beta extends Alpha
{
	@Override
	public void show() 
	{
		System.out.println("show method is overridden in Beta class");
	}
}

class Gamma extends Beta
{

	@Override
	public void demo() 
	{
		System.out.println("Demo method is overridden in Gamma class");
	}
	
}


public class AbstractDemo6 
{
	public static void main(String[] args) 
	{
		Gamma g = new Gamma();
		g.demo();
		g.show();
	}

}
