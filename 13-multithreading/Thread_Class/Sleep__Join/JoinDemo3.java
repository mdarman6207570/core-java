package day_78__Thread__Methods___Join;

public class JoinDemo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Thread started");
		
		Thread t = Thread.currentThread();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" value is :"+i+" by "+t.getName());
		}
		
		t.join();  //main thread is waiting for main thread to complete [Deadlock] 
		
		System.out.println("Main Thread ended");
	}

}