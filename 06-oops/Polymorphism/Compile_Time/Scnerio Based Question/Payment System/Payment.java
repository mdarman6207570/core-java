package blc;

public class Payment 
{
	public void makePayment(double amount) 
	{
		if(validateAmount(amount))
		{
			System.out.println("Processing payment via Cash...");
			System.out.println("Amount Paid RS :"+amount);
			System.out.println("Payment Successful!");
		}
	}
	
	public void makePayment(String cardHolderName, String creditCardNumber,double amount) 
	{
		if(validateCardNumber(creditCardNumber) && validateAmount(amount)) 
		{
		System.out.println("Processing payment via Credit Card...");
		System.out.println("Card Holder: "+cardHolderName);
		System.out.println("Card Number: "+maskCardNumber(creditCardNumber));
		System.out.println("Amount Paid RS :"+amount);
		System.out.println("Payment Successful!");
		}
	}
	
	public void makePayment(String debitCardNumber, double amount) 
	{
		if(validateCardNumber(debitCardNumber) && validateAmount(amount)) 
		{
		System.out.println("Processing payment via Debit Card...");
		System.out.println("Card Number: "+maskCardNumber(debitCardNumber));
		System.out.println("Amount Paid RS :"+amount);
		System.out.println("Payment Successful!");
		}
	}
	
	
	
	private boolean validateAmount(double amount) 
	{
		if(amount <= 0) 
		{
			System.err.println("Amount must be greater than zero.");
			System.exit(0);
		}
		return true;
	}
	
	private boolean validateCardNumber(String cardNumber) 
	{
		if(cardNumber.length() == 16) 
		{
			return true;
		}
		else
		{
			System.err.println("Invalid card number. It must be 16 digits.");
			System.exit(0);
		}
		return false;
	}
	
	private String maskCardNumber(String cardNumber) 
	{
		String str = "*".repeat(4)+"-"+"*".repeat(4)+"-"+"*".repeat(4)+"-";
		String res = cardNumber.substring(cardNumber.length()-4);	
		return str.concat(res);
	}
}
