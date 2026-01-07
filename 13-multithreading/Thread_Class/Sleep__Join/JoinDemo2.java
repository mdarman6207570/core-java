package day_78__Thread__Methods___Join;


class Alpha extends Thread
{
	@Override
	public void run() 
	{
		Thread t = Thread.currentThread();
		String name = t.getName();   //Alpha_Thread is current thread
		
		Beta b1 = new Beta();
		b1.setName("Beta_Thread");
		b1.start();
		
		try 
		{
			b1.join();  //Alpha thread is waiting for beta thread to complete
		}
		catch (Exception e) 
		{
		    e.printStackTrace();
		}
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" by "+name);
		}
	}
}

public class JoinDemo2 
{
	public static void main(String[] args) 
	{
		Alpha a1 = new Alpha();
		a1.setName("Alpha_Thread");
		a1.start();
		
	}
}

class Beta extends Thread
{
	@Override
	public void run() 
	{
		Thread t = Thread.currentThread();
		String name = t.getName();   //Beta_Thread
		
		for(int i=1; i<=20;i++)
		{
			System.out.println(i+" byy "+name);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				
			}
		}
		System.out.println("Beta Thread Ended");
	}
}
