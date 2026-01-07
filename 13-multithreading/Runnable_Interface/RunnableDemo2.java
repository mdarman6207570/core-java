package multithreading;

class MyThread2 implements Runnable
{
	@Override
	public void run() 
	{
	    System.out.println("Child Thread is running");	
	}
}

public class RunnableDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main thread started!!!");
		
		Thread t1 = new Thread(new MyThread2());
		t1.start();
		
		System.out.println("Main thread ended!!!");
	}

}
