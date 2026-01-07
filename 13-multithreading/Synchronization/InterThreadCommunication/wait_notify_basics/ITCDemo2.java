package day_83_ITC;

class Test implements Runnable
{
	private int data = 0;

	@Override
	public void run() 
	{
		try
		{
			Thread.sleep(10);
		}
		catch (InterruptedException e) {}
		
		
			for(int i=1;i<=10;i++)
			{
				data = data+i;   //data = 0 1 3 6 10 15
			}
		}
		
		public int getData()
		{
			return this.data;
		}
	
}

public class ITCDemo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Thread strted!!!");
		
		Test t1 = new Test();
		
		Thread thread = new Thread(t1);
		thread.start();
		
		Thread.sleep(10);
		
		System.out.println("Value is :"+t1.getData());
	}

}
