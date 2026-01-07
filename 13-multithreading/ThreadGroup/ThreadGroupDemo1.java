package threadgroup;

class Test implements Runnable
{

	@Override
	public void run() 
	{
		try 
		{
			Thread.sleep(100);
		}
		catch (InterruptedException e) 
		{
			String name = Thread.currentThread().getName();
			System.out.println(name+" is a Placement batch student!!!");
		}	
	}
}

public class ThreadGroupDemo1 
{
	public static void main(String[] args) 
	{
		ThreadGroup tg = new ThreadGroup("Java_Placement");
		
		Thread t1 = new Thread(tg,new Test(),"Scott");
		Thread t2 = new Thread(tg,new Test(),"Smith");
		Thread t3 = new Thread(tg,new Test(),"Allen");
		Thread t4 = new Thread(tg,new Test(),"John");
		
		t1.start(); t2.start(); t3.start(); t4.start();
		
		System.out.println("Group name is :"+tg.getName());
	    
		System.out.println("Total number of active threads are :"+tg.activeCount());
	}

}
