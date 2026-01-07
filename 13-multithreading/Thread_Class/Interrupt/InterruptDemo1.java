package interrupt;

class Test implements Runnable
{

	@Override
	public void run() 
	{
		boolean interrupted = Thread.currentThread().isInterrupted();
		
		System.out.println("Is Thread Interrupted :"+interrupted);
		
		for(int i=1;i<=10;i++)
		{
			
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				System.out.println("Child Thread Interrupted "+e);
				Thread.currentThread().interrupt();   //isInterrupted = true
			}
		}
   }
}

public class InterruptDemo1 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Test());
		t1.start();
		
		
		
		//main thread is interrupting the child thread
		t1.interrupt();   //isInterrupted = true
	}

}
