package multithreading;

public class RunnableCase3 
{
	public static void main(String[] args) 
	{
		Runnable r1 = () ->
		{
			String name = Thread.currentThread().getName();
			System.out.println("Name of the thread is "+name);	
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
