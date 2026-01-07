package blc;

public class DriverAssignment extends Thread
{
	@Override
	public void run() 
	{
		try
		{
		  Thread.sleep(3000);	
		} catch (Exception e) {
			System.out.println("Interrupted...");
		}
		System.out.println("Driver found and assigned!");
	}
}
