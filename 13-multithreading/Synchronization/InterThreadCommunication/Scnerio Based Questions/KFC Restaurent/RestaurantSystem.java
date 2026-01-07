package elc;

import blc.Chef;
import blc.Restaurant;
import blc.Waiter;

public class RestaurantSystem 
{public static void main(String[] args) 
{
	   Restaurant kfc = new Restaurant("KFC");
       System.out.println("Welcome to "+kfc.getRestaurantName());
	   
	  
	   Waiter waiter = new Waiter(kfc);
	   Chef chef = new Chef(kfc);

	   waiter.acceptOrder("fried chicken");

	   waiter.start();
	   chef.start();
	}

}
