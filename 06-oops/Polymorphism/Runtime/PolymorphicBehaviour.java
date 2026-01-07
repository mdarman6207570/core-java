package day_52_Method_Overriding_Polymorphism;
class Payment
{
	public void makePayment() 
	{
		System.out.println("Generic payment");
	}
}
class UPI extends Payment
{
	public void makePayment() 
	{
		System.out.println("Making a payment through UPI");
	}
}
class CreditCard extends Payment
{
	public void makePayment() 
	{
		System.out.println("Making a payment through Credit Card");
	}
}
class DebitCard extends Payment
{
	public void makePayment() 
	{
		System.out.println("Making a payment through Debit Card");
	}
}
public class PolymorphicBehaviour 
{
	public static void main(String[] args) 
	{
		Payment p1 = new UPI();
		processPayment(p1);
		
		 p1 = new CreditCard();
		processPayment(p1);
		
		 p1 = new DebitCard();
		processPayment(p1);
	}

	public static void processPayment (Payment payment)
	{
		payment.makePayment();
	}
}
