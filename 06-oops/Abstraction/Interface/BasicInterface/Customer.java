package day_58__Interface;

public class Customer implements Bank 
{  
	private double balance;
	
	public Customer(double balance) 
	{
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() 
	{
		return this.balance;
	}

	
	@Override
	public void deposit(double amount) 
	{
		if(amount<=0)
		{
			System.err.println("Amount cannot be deposited");
			System.exit(0);
		}
		this.balance += amount;
		System.out.println("After deposit :"+amount+", updated balance is :"+this.balance);
	}

	
	@Override
	public void withdraw(double amount) 
	{
		if(amount > this.balance)
		{
			System.err.println("Insufficient Balance!!!");
			System.exit(0);
		}
		this.balance -= amount;
		System.out.println("After withdraw :"+amount+", updated balance is :"+this.balance);
	}
}
