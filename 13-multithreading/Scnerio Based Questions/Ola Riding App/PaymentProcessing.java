package blc;

public class PaymentProcessing extends Thread
{
    @Override
    public void run()
    {
    	System.out.println("Processing payment..." );
    	
    	try 
    	{
			Thread.sleep(2000);
		}
    	catch (Exception e) 
    	{
    		System.out.println("Interrupt PaymentProcessing");
		}
    	System.out.println("Processing payment...");
    }
    
  
}
