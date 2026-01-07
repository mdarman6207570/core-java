package day_81__Synchronzation__methods;

public class Table 
{
	public synchronized void prinTable(int num)
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				System.err.println("Thread has Interrupted!!!");
			}
		}
		System.out.println("..................................");
	}
}
