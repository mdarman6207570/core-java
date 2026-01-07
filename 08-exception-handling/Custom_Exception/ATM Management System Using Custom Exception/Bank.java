package blc;

public interface Bank 
{
	public void deposit(double amount);
	
	public void withdraw(double amount) throws InsufficientFundsException;
	
	public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException;
    
	public void applyForLoan(double amount);
	
	public double getBalance();
	
}
