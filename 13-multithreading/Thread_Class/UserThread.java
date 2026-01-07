package multithreading;

class Test extends Thread
{
	public void run()
	{
		System.out.println("run method");
	}
}

public class UserThread 
{
	public static void main(String[] args) 
	{
		System.out.println("Main thread started!!!");
		Test t1 = new Test();
		t1.start();
		System.out.println("Main thread ended!!!");
		t1.start();
	}

}
