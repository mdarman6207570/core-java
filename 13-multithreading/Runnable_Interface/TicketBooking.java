package multithreading;

class Tatkal implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" has booked the ticket under tatkal scheme");
	}
}

class PreimiumTatkal implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" has booked the ticket under Premium tatkal scheme");
	}
}

public class TicketBooking 
{
	public static void main(String[] args) 
	{
	   Thread scott = new Thread(new Tatkal(), "Mr Scott");
	   scott.start();
			   
	   
	   Thread alen = new Thread(new PreimiumTatkal(), "Mr Alen");
	   alen.start();
	}

}
