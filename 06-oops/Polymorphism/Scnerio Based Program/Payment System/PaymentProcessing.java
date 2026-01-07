package elc;

import blc.CreditCardPayment;
import blc.DebitCardPayment;
import blc.Payment;
import blc.UPIPayment;

public class PaymentProcessing 
{
	public static void main(String[] args) 
	{
		CreditCardPayment crediCard = new CreditCardPayment();
		DebitCardPayment debitCard = new DebitCardPayment();
		UPIPayment upi = new UPIPayment();
		
		paymentGateway(crediCard,debitCard,upi);
	}

	public static void paymentGateway(Payment... payment) 
	{
		for(Payment p: payment)
		{
			if(p instanceof Payment)
			{
				p.processPayment();
			}
		}
	}
	
}
