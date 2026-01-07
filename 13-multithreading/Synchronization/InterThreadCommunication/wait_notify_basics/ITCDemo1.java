package day_83_ITC;

public class ITCDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Thread started!!!");
		Object obj = new Object();
		obj.wait();
		System.out.println("Main Thread ended!!!");
	}

}
