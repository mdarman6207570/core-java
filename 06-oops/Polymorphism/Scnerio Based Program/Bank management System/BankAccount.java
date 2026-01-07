package blc;

public class BankAccount 
{
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	public static final String IFSC_CODE = "SBIHYD151285";
	
	public BankAccount(String accountHolderName, String accountNumber, double balance) 
	{
		if(accountHolderName == null || accountHolderName.isBlank())
		{
			System.err.println("Account holder name cannot be empty.");
			System.exit(0);
		}
		else if(accountNumber == null || accountNumber.isBlank())
		{
			System.err.println("Account number cannot be empty.");
			System.exit(0);
		}
		else if(balance <=0)
		{
			System.err.println("Balance cannot be negative.");
			System.exit(0);
		}
		else
		{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		}
	}
	
	public void calculateInterest() 
	{
		System.out.println("Generic Bank interest Calculation.");
	}
	
	public void displayAccountDetails() 
	{
		System.out.println("Account Holder: "+accountHolderName);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance RS :"+balance);
		System.out.println("IFSC CODE :"+IFSC_CODE);
	}
}
