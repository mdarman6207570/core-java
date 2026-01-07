package day_84__IPC__Program;

class TicketSystem
{
	private int availableTicket = 5;
	
	public synchronized void bookTicket(int numOfTicket)
	{
		while(numOfTicket > availableTicket)
		{
			System.err.println("Not enough ticket, Waiting fir cancelation");
			
			try 
			{
				wait();
			}
			catch (InterruptedException e) 
			{
				
			}
		}
		
		this.availableTicket -= numOfTicket;
		System.out.println("Booked "+numOfTicket+" ticket(s), Available ticket:"+this.availableTicket);
		notify();
	}
	
	public synchronized void cancelTicket(int numOfTickets)
	{
		this.availableTicket += numOfTickets;
		
		System.out.println("Cancelled "+numOfTickets+" ticket(s), Available ticket:"+this.availableTicket);
		notify();
	}
}

public class ITCDemo5
{
	public static void main(String[] args) 
	{
		TicketSystem ticketSystem = new TicketSystem();
		
		Thread bookingThread = new Thread()
		{
			@Override
			public void run() 
			{
				int []tickets = {2,4,4};
				
				for(int ticket:tickets)
				{
					ticketSystem.bookTicket(ticket);
					
					try 
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e) 
					{
						// TODO: handle exception
					}
				}
			}
		};
			
		bookingThread.start();
		
		Thread cancellationThread = new Thread()
		{
			@Override
			public void run() 
			{
				int []tickets = {1,3,2};
				
				for(int ticket:tickets)
				{
					ticketSystem.cancelTicket(ticket);
					
					try 
					{
						Thread.sleep(1500);
					}
					catch (InterruptedException e) 
					{
						
					}
				}
			}
		};
		
		cancellationThread.start();
	}

}
