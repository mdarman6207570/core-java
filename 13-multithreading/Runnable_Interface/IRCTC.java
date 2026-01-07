package multithreading;

class Customer implements Runnable
{
	private int availableSeat = 1;
	private int wantedSeat;
	
	public Customer(int wantedSeat)
	{
		super();
		this.wantedSeat = wantedSeat;
	}
	
	@Override
	public void run() 
	{
		String name =null;
		
		if(availableSeat >= wantedSeat)
		{
			name = Thread .currentThread().getName();
			System.out.println(wantedSeat+" seat is allocated to "+name);
			availableSeat -= wantedSeat;
		}
		else
		{
			name = Thread .currentThread().getName();
			System.err.println("Sorry!!"+name+" seat is not available");
		}
	}
}


public class IRCTC 
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer(1);
		
		Thread t1 = new Thread(c1,"Scott");
		Thread t2 = new Thread(c1,"Alen");
		
	   t1.start();
	   
	   t2.start();
		
	}

}
