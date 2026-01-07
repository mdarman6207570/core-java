package blc;

public class RatingSystem extends Thread
{
     @Override
    public void run() 
     {
    	System.out.println("Requesting user rating...");
    	
    	try 
    	{
			
		}
    	catch (Exception e) 
    	{
		   System.out.println("Interrupted");
		}
    	
    	System.out.println("User rated the ride: 5 star");
    }
}
