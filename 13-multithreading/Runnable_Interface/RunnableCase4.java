package multithreading;

public class RunnableCase4 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(() ->
		System.out.println(Thread.currentThread().getName()));
		
		t1.start();
	}

}
