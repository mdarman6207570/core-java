package day_81__Synchronzation__methods;

public class LimitationOfObjectLevel 
{
	public static void main(String[] args) 
	{
		Table obj1 = new Table();
		Table obj2 = new Table();
		
		Thread t1 = new Thread()
		{
			@Override
			public void run() 
			{
				obj1.prinTable(5);   //lock1
			}
		};
		
		Thread t2 = new Thread()
		{
			@Override
			public void run() 
			{
				obj1.prinTable(7);   //lock1
			}
		};
		
		Thread t3 = new Thread()
		{
			@Override
			public void run() 
			{
				obj2.prinTable(12);   //lock2
			}
		};
		
		Thread t4 = new Thread()
		{
			@Override
			public void run() 
			{
				obj2.prinTable(15);   //lock2
			}
		};
		
		t1.start(); t2.start();  t3.start(); t4.start();
	}

}
