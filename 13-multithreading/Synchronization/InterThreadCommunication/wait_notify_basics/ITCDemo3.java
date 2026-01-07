package day_83_ITC;

class Demo extends Thread
{
	private int val=0;
	
	public void run()
	{
		synchronized (this) 
		{
			System.out.println("Child thread got the click");
			
			for(int i=1;i<=100;i++)
			{
				val = val+i;
			}
			
			System.out.println("Sending notification");
			notify();
		}
	}
	
	public int getVal()
	{
		return this.val;
	}
}

public class ITCDemo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Demo d1 = new Demo();
		d1.start();
		
		synchronized (d1) 
		{
		System.out.println("Putting the main thread into wait!!!");
		d1.wait();    //main thread will wait and release the lock 
		System.out.println("Main thread got notification!!!");
		System.out.println("Value is :"+d1.getVal());
		}
	}

}
