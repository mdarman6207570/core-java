package blc;

public class Restaurant 
{
	private String name;
	private String order;
	private boolean isOrderReady = false;

	
	public Restaurant(String name) 
	{
	   this.name = name;
	}

	public synchronized void placeOrder(String order) 
	{
	   this.order = order;
	   System.out.println("Waiter: Placed order for " + order);
	 
	   try
	   {
	       while (!isOrderReady) 
	       { 
	    	   System.out.println("AA");
	           wait();
	           System.out.println("DD");
	       }
	   }
	   catch (InterruptedException e) {
	       e.printStackTrace();
	   }
	   System.out.println("Waiter: Serving the " + order);
	}

	
	public synchronized void prepareOrder() {
	   try 
	   {
	       System.out.println("Chef: Preparing " + order);
	       
	       Thread.sleep(2000); 
	        isOrderReady = true;
	       System.out.println("Chef: " + order + " is ready!");
	       notify();  
	   } catch (InterruptedException e) {
	       e.printStackTrace();
	   }
	}

	
	public String getRestaurantName() {
	   return name;
	}
}
