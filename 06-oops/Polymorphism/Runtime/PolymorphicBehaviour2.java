package day_53_InstanceOfOperator___Override_Main_Method;

class Payment2
{
	public void makePayment() 
	{
		System.out.println("Generic Payment");
	}
}

class UPI2 extends Payment2
{
	public void makePayment() 
	{
		System.out.println("Making a Payment through UPI");
	}
}

class CreditCard2 extends Payment2
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

class DebitCard2 extends Payment2
{
	public void makePayment() 
	{
		System.out.println("Making a Payment through Debit Card");
	}
}

public class PolymorphicBehaviour2 
{
	public static void main(String[] args) 
	{
		processPayment(new CreditCard2());
		processPayment(new UPI2());        // ClassCastException
	}
	
	public static void processPayment(Payment2 payment)   //loose Coupling
	{
		CreditCard2 card = (CreditCard2)payment;   //Downcasting
		card.makePayment();
		card.offer();
	}

}
