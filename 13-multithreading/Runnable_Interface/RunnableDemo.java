package multithreading;

class MyThread implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("Child Thread is running");	
	}
	
}

public class RunnableDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Main thread started!!!");
		
		MyThread mt = new MyThread();
		
		Thread t1 = new Thread();
		t1.start();
		
	}
}
