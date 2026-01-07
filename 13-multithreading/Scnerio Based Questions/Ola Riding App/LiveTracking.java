package blc;

public class LiveTracking extends Thread
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
	  
	  System.out.print(
			  """
	Updating ride location... 20% completed
	Updating ride location... 40% completed
	Updating ride location... 60% completed
	Updating ride location... 80% completed
	Updating ride location... 100% completed
	  		"""
			  );
	  
	  System.out.println("Ride Completed...");
   }
}
