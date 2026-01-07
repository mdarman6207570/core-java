package multithreading;

class Test2 extends Thread
{
	public void run()
	{
		System.out.println("Child thread is running...");
		System.out.println("It is running with separate stack memory");
	}
}

public class IsAliveDemo 
{
	public static void main(String[] args) 
	{
		Test2 t1 = new Test2();
		System.out.println("Child thread not started yer so, :"+t1.isAlive());
		t1.start();
		System.out.println("Child thread started yer so, :"+t1.isAlive());
		t1.start();  //java.lang.IllegalThreadStateException
	}

}
