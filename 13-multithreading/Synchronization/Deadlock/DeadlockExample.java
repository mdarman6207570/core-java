package deadlock;

public class DeadlockExample 
{
	public static void main(String[] args) 
	{
		String resource1 = new String("Ameerpet");  //(R1)
		String resource2 = new String("S R Nagar");  //(R2)
		
		//t1 tries to lock resouce1(R1) then resouce2(R2)
		Thread t1 = new Thread()
		{
			@Override
			public void run() 
			{
				synchronized (resource1) 
				{
					System.out.println("Thread 1: locked resource 1");
					
					try 
					{
						Thread.sleep(1000);
					}
					catch (Exception e) 
					{}
					
					//t1 thread is waiting here for Lock2
					synchronized (resource2)   //Nested synchronized block
					{
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
			
		};
		
		
//t2 tries to lock resource2 then resource1
		Thread t2 = new Thread()
		{
			@Override
			public void run() 
			{
				synchronized (resource2) 
				{
					System.out.println("Thread 2: locked resource 2");
					
					try 
					{
						Thread.sleep(1000);
					}
					catch (Exception e) 
					{}
					
					//t2 thread is waiting here for Lock1 (Resource1)
					synchronized (resource1)    //Nested synchronized block
					{
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
			
		};
		
		
		t1.start();
		t2.start();
	}
}
	
