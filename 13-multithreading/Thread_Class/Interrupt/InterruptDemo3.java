package interrupt;

public class InterruptDemo3 
{
	public static void main(String[] args) 
	{
		Thread thread = new Thread(new MyRunnable());
		thread.start();
		
		try 
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		thread.interrupt();
	}

}

class MyRunnable implements Runnable
{

	@Override
	public void run() 
	{
		try 
		{
			while(!Thread.currentThread().isInterrupted())
			{
				System.out.println("Thread is running by locking the resource");
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) 
		{
			System.out.println("Thread interrupted gracefully");
		}	
		finally
		{
			System.out.println("Thread resource can be release here.");
		}
	}
	
}