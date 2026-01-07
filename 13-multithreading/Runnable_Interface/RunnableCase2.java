package multithreading;

public class RunnableCase2 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				String name = Thread.currentThread().getName();
				System.out.println("Name of the thread is "+name);	
			}
		});
		
		t1.start();
	}

}
