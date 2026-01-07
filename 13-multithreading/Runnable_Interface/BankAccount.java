package multithreading;

class Customer2
{
	private double balance = 20000;
	private double amount;
	
	public Customer2(double amount)
	{
		super();
		this.amount = amount;
	}
	
	
	public void withdraw()
	{
		String name = null;
		
		if(amount <= this.balance)
		{
			name = Thread.currentThread().getName();
			System.out.println(amount+" amount withdraw by "+name);
			balance -= amount;
		}
		else
		{
			name = Thread.currentThread().getName();
			System.out.println("Sorry!! "+name+" Insufficient Balance");
		}
	}
}

public class BankAccount 
{
	public static void main(String[] args) 
	{
		Customer2 cust = new Customer2(100000);
		
		Runnable r1 = () -> cust.withdraw();
		
		/*
		     Runnable r1 = new Runnable() {
              public void run() {
               cust.withdraw();
               }
             };

		 */
				
		Thread t1 = new Thread(r1,"Scott");	
		Thread t2 = new Thread(r1,"Allen");
		
		t1.start();
		t2.start();
		
	}
}
