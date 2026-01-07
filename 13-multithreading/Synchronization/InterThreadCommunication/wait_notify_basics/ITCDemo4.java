package day_84__IPC__Program;

class Customer
{
	private double balance;
	
	public Customer(double balance)
	{
		super();
		this.balance=balance;
	}
	
	public synchronized void withdraw(double amount)
	{
		if(amount  > this.balance)
		{
			System.err.println("Insufficient Balance, Waiting for deposit");
			
			try
			{
				wait();
				System.out.println("Child got the notification!!!");
			}
			catch (InterruptedException e) 
			{
			   System.err.println("Thread is interrupted!!!");
			}
		}
		
		this.balance -= amount;
		System.out.println("Balance after withdraw is :"+this.balance);
	}	
		public synchronized void deposit(double amount)
		{
			this.balance = this.balance+amount;
			System.out.println("Balance after deposit is :"+this.balance);
			System.out.println("Dad is sending notification");
			notify();
		}
}

public class ITCDemo4 
{
	public static void main(String[] args) 
	{
		Customer cust = new Customer(1000);
		
		Thread son = new Thread()
		{
			   @Override
		        public void run() {
		        	cust.withdraw(10000);
		        }	
		};
		
		son.start();
		
		Thread dad = new Thread()
		{
			 @Override
		       public void run() 
			 {
		      	cust.deposit(10000);
		      }	
		};
		
		dad.start();
		
	}

}
