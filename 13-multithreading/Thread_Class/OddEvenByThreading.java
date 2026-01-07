package day_78__MultiThreading;

class Child1 extends Thread
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

class Child2 extends Thread
{
	public void run()
	{
		for(int i =1;i<=100;i++) 
		{
			if(i%2==0)
		    System.out.println(i+" by Thread-1");
		}
	}
}

public class OddEvenByThreading 
{
	public static void main(String[] args) 
	{
	    Child1 c = new Child1();
	    c.start();
	    
	    
	    try
	    {
	    	c.sleep(1000);
	    }
	    catch (InterruptedException e) 
	    {
		   System.out.println("Interupted!!!");
		}
	    
	    
	    Child2 c2 = new Child2();
	    c2.start();
	}

}
