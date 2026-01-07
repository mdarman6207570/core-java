package day_53_InstanceOfOperator___Override_Main_Method;

class Payment3
{
	public void makePayment() 
	{
		System.out.println("Generic Payment");
	}
}

class UPI3 extends Payment3
{
	public void makePayment() 
	{
		System.out.println("Making a Payment through UPI");
	}
	
	public void offer() 
	{
		System.out.println("Make a Payment through UPI and get RS 1000 Cash back");
	}
}

class CreditCard3 extends Payment3
{
	public void makePayment() 
	{
		System.out.println("Making a Payment through Credit card");
	}
	
	public void offer() 
	{
		System.out.println("Make a Payment through CreditCard and get 2 days holidays in GOA");
	}
}

class DebitCard3 extends Payment3
{
	public void makePayment() 
	{
		System.out.println("Making a Payment through Debit Card");
	}
}

public class PolymorphicBehaviour3 
{
	public static void main(String[] args) 
	{
		processPayment(new CreditCard3());
		processPayment(new UPI3());   
		processPayment(new DebitCard3());   
	}
	
	public static void processPayment(Payment3 payment)   //loose Coupling
	{
		if(payment instanceof CreditCard3)   //Old Style
		{
			CreditCard3 card = (CreditCard3)payment;   
			card.makePayment();
			card.offer();
		}
		
		if(payment instanceof UPI3 upi)   //New Style 
		{
			upi.makePayment();
			upi.offer();
		}
		
		if(payment instanceof DebitCard3 debitCard) 
		{
			   
			debitCard.makePayment();
		}
	}
}
