package multithreading;

class Sample extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i +" by "+name+" thread");
		}
	}
}

public class ThreadLoop 
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		s1.start();
		
		String name = Thread.currentThread().getName();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i +" by "+name+" thread");
		}
		
		int x = 1;
		do
		{
			System.out.println("Hello Java "+x);
			x++;
		}
		while(x<=10);
		
	}

}
