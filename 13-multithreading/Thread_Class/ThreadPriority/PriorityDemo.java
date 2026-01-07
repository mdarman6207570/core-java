package multithreading;

public class PriorityDemo 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Main thread Priotity is :"+t.getPriority());
		
		Thread t1 = new Thread();
		System.out.println("Priority of this thread is :"+t1.getPriority());
	}
}
