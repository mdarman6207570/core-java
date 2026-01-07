package static_nested_class;

interface HotDrink
{
	void prepare();
}

class HotDrinkFactory
{
	public static HotDrink getTea()
	{
		//Anonymous inner class object without reference
		return new HotDrink()     //AIC implements HotDrink
		{	
			@Override
			public void prepare() 
			{
				System.out.println("Preaparing Irani Tea!!!");
			}
		};
	}
	
	public static HotDrink getCoffee()
	{
		//Anonymous inner class object without reference
		return new HotDrink() {
			
			@Override
			public void prepare() 
			{
				System.out.println("Preaparing Filter Coffee!!!");
			}
		};
	}
}

public class AnnonymousDemo2 
{
	public static void main(String[] args) 
	{
		HotDrink tea = HotDrinkFactory.getTea();
		tea.prepare();
		
		HotDrink coffee = HotDrinkFactory.getCoffee();
		coffee.prepare();
		
	}

}
