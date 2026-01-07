package day_78__Thread__Methods___Join;

public class AnnonymousInnerClassWithReference 
{
	public static void main(String[] args) 
	{
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				String name = Thread.currentThread().getName();
				System.out.println("Running thread name is :"+name);
			}
		};
		
		t1.start();
		
		String name = Thread.currentThread().getName();
		System.out.println("Running thread name is :"+name);
	}

}
