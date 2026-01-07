package day_24_Class_Variable_OR_Static_Field;

class Customer 
{
	private double balance = 10000;   //Data Hiding
	
	public void deposit(double amount)
	{
		//validation of outer world data
		if(amount <= 0)
		{
			System.out.println("Amount can,t be deposited");
		}
		else
		{
			balance += amount; 
			System.out.println("Balance after deposit is :"+balance);
		}
	}
	
	public void withdraw(double amount)
	{
		//validation of outer world data
		if(amount > balance)
		{
			System.out.println("Insufficient Balance!!!");
		}
		else
		{
			balance -= amount; 
			System.out.println("Balance after withdraw is :"+balance);
		}
	}
}

public class BankAppllication
{
	public static void main(String args[])
	{
		Customer scott = new Customer();
		scott.deposit(20000);
		scott.withdraw(10000);
	}
}
