package interrupt;

class SharedData
{
	private volatile boolean flag = false;
	
	public void startThread() 
	{
		Thread writer = new Thread(() ->
		{
			try 
			{
				System.out.println("Writer thread started");
				Thread.sleep(5000);
				flag = true;
				System.out.println("Writer thread make the flag value as true");
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		});
		
		
		Thread reader = new Thread(() ->
		{
			while(!flag)    //Cache memory still the value of flag is false
			{
				
			}
			System.out.println("Reader thread got the updated value");
		});
		
		
		writer.start();
		reader.start();
	}
}

public class VolatileDemo 
{
	public static void main(String[] args) 
	{
		new SharedData().startThread();
	}

}
