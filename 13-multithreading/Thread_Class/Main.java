package day_78__MultiThreading;

class Child extends Thread
{
	public void run()
	{
		for(int i =1;i<=100;i++) 
		{
			if(i%2==1)
		    System.out.println(i+" by Thread-0");
		}
	}
}

public class Main 
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.start();
		
		try 
		{
		c.sleep(1000);
		}
		
		catch (InterruptedException e) 
		{
		     System.out.println("Interrupted!!!");
		}
		
		
		for(int i =1;i<=100;i++) 
		{
			if(i%2==0)
		    System.out.println(i+" by main");
		}
		
	}

}
