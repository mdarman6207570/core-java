package loose_coupling;

public class Coffee implements HotDrink
{

	@Override
	public void prepare() 
	{
		System.out.println("Prepare filter Coffee");
	}
}
