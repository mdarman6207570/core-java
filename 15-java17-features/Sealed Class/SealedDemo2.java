package sealed_class;

sealed class Payment permits UPI,CreditCard,DebitCard
{
	public double makePayment(double amount) 
	{
		return 0.0;
	}
}

final class UPI extends Payment
{
	@Override
	public double makePayment(double amount) 
	{
		return amount;
	}
}

non-sealed class CreditCard extends Payment
{
	@Override
	public double makePayment(double amount) 
	{
		return amount;
	}
}

non-sealed class DebitCard extends Payment
{
	@Override
	public double makePayment(double amount) 
	{
		return amount;
	}
}

public class SealedDemo2 
{
	public static void main(String[] args) 
	{
		Payment p = null;
		
		p = new UPI();
		double payment = p.makePayment(12000);
		System.out.println("Making a payment of : "+ payment +" via UPI");
		
		p = new CreditCard();
		payment = p.makePayment(29000);
		System.out.println("Making a payment of : "+ payment +" via CreditCard");
		
		p = new DebitCard();
		 payment = p.makePayment(20000);
		System.out.println("Making a payment of : "+ payment +" via DebitCard");
	}

}
