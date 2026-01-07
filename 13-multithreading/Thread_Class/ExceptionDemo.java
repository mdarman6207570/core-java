package multithreading;

class Foo extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name +" thread is running.....");
	}
}

public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		String name = Thread.currentThread().getName();
		System.out.println(name +" thread is running!!!!");
		
		Foo f1 = new Foo();
		f1.start();
		
		Foo f2 = new Foo();
		f2.start();
		
		System.out.println(10/0);
		
		System.out.println(name +" thread completed");
	}

}
