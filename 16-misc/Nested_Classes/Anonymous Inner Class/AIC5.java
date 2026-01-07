package inner_class;

interface HotDrink
{
	void prepare();
}

class HotDrinkFactory
{
	public static HotDrink getTea()
	{
		return new HotDrink() 
		{	
			@Override
			public void prepare() 
			{
				System.out.println("Irani Tea!!!");
			}
		};
	}
	
	public static HotDrink getCoffee()
	{
		return new HotDrink() 
		{	
			@Override
			public void prepare() 
			{
				System.out.println("Filter Coffee!!!");
			}
		};
	}
}

public class AIC5 
{
	public static void main(String[] args) 
	{
		HotDrink tea = HotDrinkFactory.getTea();
		tea.prepare();
		
		HotDrink coffee = HotDrinkFactory.getCoffee();
		coffee.prepare();
	}
}
