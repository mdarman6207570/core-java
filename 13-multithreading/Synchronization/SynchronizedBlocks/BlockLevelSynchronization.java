package synchronizatiion;

class PrintThread
{
	public void printThreadName()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Thread Name is :"+name);
		
		synchronized (this) 
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+" by "+name+" thread");
				try 
				{
					Thread.sleep(100);
				}
				catch (InterruptedException e) 
				{
					System.out.println("Thread is Interrupted");
				}
			}
			System.out.println("Synchronized block ended!!");
		}
	}
}

public class BlockLevelSynchronization {

	public static void main(String[] args) 
	{
		PrintThread pt = new PrintThread();  //lock is created
		
		Runnable r1 = () -> pt.printThreadName();
		
		Thread t1 = new Thread(r1,"Child1");
		Thread t2 = new Thread(r1,"Child2");
	
		t1.start();
		t2.start();
	}

}
