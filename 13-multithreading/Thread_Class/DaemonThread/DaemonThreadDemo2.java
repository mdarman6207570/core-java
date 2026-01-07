package daemon;

public class DaemonThreadDemo2 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.isDaemon());   //false
		
		t.setDaemon(true);
		System.out.println(t.isDaemon());   //main is already running
	}

}
