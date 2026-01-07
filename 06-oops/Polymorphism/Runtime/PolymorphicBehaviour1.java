package day_53_InstanceOfOperator___Override_Main_Method;

class Payment
{
	public void makePayment() 
	{
		System.out.println("Generic Payment");
	}
}

class UPI extends Payment
{
	public void makePayment() 
	{
		System.out.println("Making a Payment through UPI");
	}
}

class CreditCard extends Payment
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

class DebitCard extends Payment
{
	public void makePayment() 
	{
		System.out.println("Making a Payment through Debit Card");
	}
}

public class PolymorphicBehaviour1 
{
	public static void main(String[] args) 
	{
		processPayment(new CreditCard());
	}
	
	public static void processPayment(Payment payment)   //loose Coupling
	{
		CreditCard card = (CreditCard)payment;   //Downcasting
		card.makePayment();
		card.offer();
	}

}
