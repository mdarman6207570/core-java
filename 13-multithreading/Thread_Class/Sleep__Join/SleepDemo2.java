package thread;

class MyTest extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		for(int i = 1; i<=10;i++)
		{
			System.out.println("i value is :"+i);
			
			try
			{
				Thread.sleep(1000);   //M1, M2
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

public class SleepDemo2 
{
	public static void main(String[] args) 
	{
		MyTest m1 = new MyTest();
		MyTest m2 = new MyTest();
		
		m1.setName("M1");
		m2.setName("M2");
		
		m1.start();
		m2.start();
	}
}
