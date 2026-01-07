package blc;


public class Chef extends Thread
{
	private Restaurant restaurant;
	
	public Chef(Restaurant restaurant)
	{
		this.restaurant=restaurant;
	}

	@Override
	public void run() 
	{
		restaurant.prepareOrder();
	}
}


