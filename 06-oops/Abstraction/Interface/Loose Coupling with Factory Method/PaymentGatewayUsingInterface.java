package day_62_Interface_With_Factory_Design_Pattern;

import java.util.Scanner;

interface Payment
{
	public abstract void processPayment();
	public abstract void applyDiscount();
}

class CreditCardPayment implements Payment
{

	@Override
	public void processPayment() 
	{
		System.out.println("Initiating Credit Card payment.");
		
	}

	@Override
	public void applyDiscount() 
	{
		System.out.println("Applying 10% discount for credit card users.");
		System.out.println("Processing credit card payment...");
		
	}
	
}

class UPIPayment implements Payment
{

	@Override
	public void processPayment() 
	{
		System.out.println("Initiating UPI payment.");
		
	}

	@Override
	public void applyDiscount() 
	{

		System.out.println("Applying ₹100 cashback for UPI users.");
		System.out.println("Processing UPI payment...");
		
	}
	
}

class PaymentGateway
{
	public Payment initiatePayment(Payment payment)
	{
	    payment.processPayment();
	    payment.applyDiscount();
	    return payment;
	}
}


public class PaymentGatewayUsingInterface 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select your payment Option :");
		System.out.println("\t1) Credit Card ");
		
		System.out.println("\t 2) UPI ");
		
		PaymentGateway payGate = new PaymentGateway();
		System.out.println("Please Enter your Choice :");
		int opt = Integer.parseInt(sc.nextLine());
		Payment pay = null;
		
		
		switch(opt)
		{
		case 1 ->
		{
			pay = new CreditCardPayment();
			payGate.initiatePayment(pay);
		}
		
		case 2 ->
		{
			pay = new UPIPayment();
			payGate.initiatePayment(pay);
		}
		default ->
		{
			System.out.println("Choose opt 1 or 2");
			System.exit(0);
		}
		    
		}
		sc.close();
	}
}
