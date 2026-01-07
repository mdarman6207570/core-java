package day_56_Abstract_class__and__abstract_methods;

abstract class ATM
{
	public abstract void withdraw(double amoount);
	public abstract void deposit(double amoount);
	public abstract void pinChange();
}

class SBIATM extends ATM
{

	@Override
	public void withdraw(double amount) 
	{
		System.out.println("Making a withdraw of "+amount+"through SBI ATM");
	}

	@Override
	public void deposit(double amount) 
	{
		System.out.println("Making a deposit of "+amount+"through SBI ATM");	
	}

	@Override
	public void pinChange() 
	{
		System.out.println("PIN Changed Successfully");
		
	}
	
}

public class AbstractDemo2 
{
	public static void main(String[] args) 
	{
		ATM atm = new SBIATM();
		atm.deposit(20000);
		atm.withdraw(12000);
		atm.pinChange();
	}

}
