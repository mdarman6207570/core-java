package thread;

class Sleep extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		for(int i = 1; i<=10;i++)
		{
			System.out.println("i value is :"+i+" by "+name+ " thread");
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				System.out.println("Thread is Interrupted");
			}
		}
	}
}


public class SleepDemo1 
{
	public static void main(String[] args) 
	{
		Sleep s1 = new Sleep();
		s1.setName("Child1");
		s1.start();
	}

}
