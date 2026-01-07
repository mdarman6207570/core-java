package day_81__Synchronzation__methods;

public class StaticSynchronization 
{
	public static void main(String[] args) 
	{
		
		Thread t1 = new Thread()
		{
			@Override
			public void run() 
			{
				Table2.prinTable(5);   
			}
		};
		
		Thread t2 = new Thread()
		{
			@Override
			public void run() 
			{
				Table2.prinTable(10);  
			}
		};
		
		Thread t3 = new Thread()
		{
			@Override
			public void run() 
			{
			    Table2.prinTable(15);   
			}
		};
		
		
		
		t1.start(); t2.start();  t3.start(); 
	}
}
