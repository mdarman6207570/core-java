package multithreading;

class Test extends Thread
{
	@Override
	public void run() 
	{
		int priority = Thread.currentThread().getPriority();
		System.out.println("Child Thread priority is :"+priority);
	}
}

public class PriorityDemo2 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Priority of main thread :"+t.getPriority());
		
		Test t1 = new Test();
		t1.start();
	}

}
