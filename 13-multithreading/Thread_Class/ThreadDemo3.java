package thread;

import java.util.InputMismatchException;
import java.util.Scanner;


class BatchAssignment extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName().toLowerCase();
		
		if(name != null && name.equals("placement"))
		{
			this.placementBatch();;
		}
		
		else if(name != null && name.equals("regular"))
		{
			this.regularBatch();
		}
    }
	
	public void placementBatch()
	{
		System.out.println("I am a placement batch student.");
	}
	
	public void regularBatch()
	{
		System.out.println("I am a regular batch student.");
	}
}





public class ThreadDemo3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
	    try(sc)
	    {
	    	System.out.println("Enter your Batch Title [Placement/Regulat] :");
	    	String title = sc.next();
	    	
	    	BatchAssignment b = new BatchAssignment();
	    	b.setName(title);
	    	
	    	b.start();
	    }
	    catch(InputMismatchException e)
	    {
	    	System.out.println("Invalid Input");
	    }
	}
}
