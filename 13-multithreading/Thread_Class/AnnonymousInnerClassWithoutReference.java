package day_78__Thread__Methods___Join;

public class AnnonymousInnerClassWithoutReference 
{
	public static void main(String[] args) 
	{
		
	    new Thread()
		{
			public void run()
			{
				String name = Thread.currentThread().getName();
				System.out.println("Running thread name is :"+name);
			}
		}.start();
		
		String name = Thread.currentThread().getName();
		System.out.println("Running thread name is :"+name);
	}
}
