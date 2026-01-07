package loose_coupling;

public class Boost implements HotDrink 
{

	@Override
	public void prepare() 
	{
		System.out.println("Preparing Boost hot drink");
	}
}
