package multithreading;

class UserThread2 extends Thread
{
	public void run()
	{
		System.out.println("Child thread is running!!!");
	}
}

public class CustomThread 
{
	public static void main(String[] args) 
	{
		System.out.println("Maint thread started!!!");
		
		UserThread2 ut = new UserThread2();
		ut.start();
		System.out.println("Maint thread ended!!!");
	}

}
