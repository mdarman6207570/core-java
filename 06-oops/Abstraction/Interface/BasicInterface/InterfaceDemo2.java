package day_58__Interface;

public class InterfaceDemo2 
{
	public static void main(String[] args) 
	{
		Bank ravi = new Customer(10000);
		System.out.println(ravi.getBalance());
		ravi.deposit(15000);
		ravi.withdraw(5000);
		
		System.out.println("...........................");
		
		Bank scott = new Customer(29000);
		System.out.println(scott.getBalance());
		scott.deposit(6000);
		scott.withdraw(5000);
	}

}
