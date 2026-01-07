package thread;

class Demo extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Running Thread name is "+name);
	}
}

public class ThreadDemo2 
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread t = Thread.currentThread();
				
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		d1.setName("Child1");
		d2.setName("Child2");
		
		d1.start();
		d2.start();
		
		System.out.println("Current thread name is :"+t.getName());
	}

}
