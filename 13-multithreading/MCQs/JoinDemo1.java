package mcq;

public class JoinDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main thread started");
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		
		for(int i=1; i<=5; i++)
		{			
			System.out.println(i + " by "+name+ " thread ");
			Thread.sleep(1000);              //here main thread sleep
			thread.join();                    
		}		
		System.out.println("Main thread ended");
	}

}
