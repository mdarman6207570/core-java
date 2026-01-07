package multithreading;

public class RunnableCase5 
{
	public static void main(String[] args) 
	{
		new Thread(() -> 
		System.out.println(Thread.currentThread().getName()),"Child1")
		.start();
	}

}
