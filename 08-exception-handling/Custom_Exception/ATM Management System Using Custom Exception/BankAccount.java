package blc;

public class BankAccount implements Bank
{
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) 
	{
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) 
	{
		if(amount <=0)
		{
			throw new InvalidAmountException("deposit amount can't be 0 or Negative");
		}
		else
		{
			balance += amount;
			System.out.println("Deposit successful. New balance: "+this.balance);
		}
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount > balance)
		{
			throw new InsufficientFundsException ("InsufficientBalance");
		}
		else
		{
			balance -= amount;
		}
		
	}

	@Override
	public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException {
		if(amount > balance)
		{
			throw new InsufficientFundsException("InsufficientBalance.");
		}
		else if(toAccount == null)
		{
			throw new AccountNotFoundException("please Enter a Valid AccountNumber.");
		}
		else if(amount <=0)
		{
			throw new InvalidAmountException("Amount can't be 0 or negative.");
		}
		else
		{
		toAccount.balance += amount;
		this.balance -= amount; 
		
		System.out.println("Deposit successful. New balance: "+toAccount.getBalance());
		System.out.println("Transfer successful.");
		}
	}

	@Override
	public void applyForLoan(double amount) {
		if(amount > balance)
		{
			throw new LoanNotAllowedException("Loan not allowed. Either amount exceeds limit or balance is too low.");
		}
		else if(amount <=0)
		{
			throw new InvalidAmountException("Loan not allowed. Either amount exceeds limit or balance is too low.");
		}
			
			
		
	}

	@Override
	public double getBalance() {
		return this.balance;
	}
	  

	
}
