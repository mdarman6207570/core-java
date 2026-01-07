package blc;

public class RideRequest extends Thread
{
	   @Override
	   public void run()
	   {
		  System.out.println("User requested a ride...");
		  
		  try 
		  {
			Thread.sleep(2000);
			
		  }
		  catch (Exception e) 
		  {
			 System.out.println("");
		  }
		 System.out.println("Searching for nearby drivers..."); 
	   }	  
}