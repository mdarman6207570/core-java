package multithreading;

class Test2 implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		
		for(int i=1;i<10;i++)
		{
			System.out.println(i+" by "+name+" thread");
			
			if(name.equals("Child1"))
			{
				Thread.yield();
			}
		}
	}
}

public class YieldDemo 
{
	public static void main(String[] args) 
	{
		Test2 t1 = new Test2();
		
		Thread thread1 = new Thread(t1,"Child1");
		Thread thread2 = new Thread(t1,"Child2");
		
		thread1.start();   thread2.start();
	}

}
