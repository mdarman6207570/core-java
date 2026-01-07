package blc;

public class FixedDepositAccount extends BankAccount
{
	protected double interestRate = 6.5;
	protected int depositTerm;
	
	public FixedDepositAccount(String accountHolderName, String accountNumber, double balance, int depositTerm) 
	{
		super(accountHolderName, accountNumber, balance);
		if(depositTerm <=0) {
			System.err.println("Deposit term must be positive.");
			System.exit(0);
		}
		this.depositTerm = depositTerm;
	}
	
	public void calculateInterest() 
	{
		System.out.println(" Fixed Deposit Interest for "+depositTerm +" years RS :"+(depositTerm*balance*(interestRate/100)));
	}
}
