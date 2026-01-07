package multithreading;

public class RunnableCase1 
{
	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() 
			{	
				String name = Thread.currentThread().getName();
				System.out.println("Name of the thread is "+name);	
			}
		};
		
		Thread t1 = new Thread(r1,"Child1");
		t1.start();
	}

}
