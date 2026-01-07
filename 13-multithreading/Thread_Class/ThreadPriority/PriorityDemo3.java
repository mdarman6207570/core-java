package multithreading;

class Priority implements Runnable
{

	@Override
	public void run() 
	{
		int count = 0;
		for(int i=1;i<1000000;i++)
		{
			count++;
		}
		
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		
		System.out.println("Completed Thread Name is :"+name+" and its priotity is "+priority);
	}
	
}

public class PriorityDemo3 
{
	public static void main(String[] args) 
	{
		Priority p = new Priority();
		
		Thread t1 = new Thread(p,"Last");
		Thread t2 = new Thread(p,"First");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();  t2.start();
	}

}
