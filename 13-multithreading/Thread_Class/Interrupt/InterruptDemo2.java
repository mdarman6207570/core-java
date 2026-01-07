package interrupt;

class Interrupt extends Thread
{
	@Override
	public void run() 
	{
		Thread.currentThread().interrupt(); //self interruption
		
		
		for(int i=1;i<=10;i++)
		{
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				System.err.println("Thread has Interrupted");
				Thread.currentThread().interrupt();  //interrupt flag value will become true
	        }	
		}
		
	}
}

public class InterruptDemo2 
{
	public static void main(String[] args) 
	{
		Interrupt it = new Interrupt();
		System.out.println("Thread State is: "+it.getState());  //NEW
		it.start();
	}
}
