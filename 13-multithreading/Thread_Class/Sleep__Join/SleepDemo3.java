package thread;

class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("Child Thread is running");
		long id = Thread.currentThread().threadId();
		System.out.println("Id of child thread is :"+id);
	}
}

public class SleepDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Main thread is Started");
		
		Thread t = Thread.currentThread();
		System.out.println("Id of main thread is :"+t.getId());
		
		MyThread1 mt = new MyThread1();
		mt.start();
		
		try
		{
			mt.sleep(4000);           //Main thread will sleep here
			Thread.currentThread().sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Main thread is Ended");
		
	}
}
