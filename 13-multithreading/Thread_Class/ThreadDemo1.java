package thread;

class DoStuff extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Running Thread name is "+name);
	}
}

public class ThreadDemo1 
{
	public static void main(String[] args) 
	{
		DoStuff df1 = new DoStuff();
		df1.start();
		
		DoStuff df2 = new DoStuff();
		df2.start();
		
		System.out.println("Current thread name is :"+Thread.currentThread().getName());
	
	}
}
