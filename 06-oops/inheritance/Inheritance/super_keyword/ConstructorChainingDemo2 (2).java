package constructor_chaining;

class Alpha
{
	public Alpha(String name)
	{
		super();
		System.out.println("Institute name is :"+name);
	}
}
class Beta extends Alpha
{
	public Beta()
	{
		super("NIT");
		System.out.println("No Argument Constructor of Beta class");
	}
}

public class ConstructorChainingDemo2 
{

	public static void main(String[] args) 
	{
	    new Beta();	
	}

}
