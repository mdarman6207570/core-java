package elc;

import java.util.Scanner;
import blc.Payment;

public class PaymentProcess 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Payment payment = new Payment();
		
		System.out.println("Payment Menu");
		System.out.println("Please select any one Payment Method from the Menu :");
		System.out.println("\t\t 1) Payment by using Cash ");
		System.out.println("\t\t 2) Payment by using Credit Card ");
		System.out.println("\t\t 3) Payment by using Debit Card ");
		
		System.out.println("Please enter your Payment choice [1/2/3]");
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice) 
		 {
		  case 1 ->
		     {
			    System.out.println("Enter the amount you want to pay through cash :");
			    double amount = Double.parseDouble(sc.nextLine());
			    payment.makePayment(amount);
		     }
		   
		  case 2 ->
		    {
			   System.out.println("Enter your name :");
			   String name = sc.nextLine();
			 
			  System.out.println("Enter your 16 digit Credit Card Number :");
			  String cardNo = sc.nextLine();  
			 
			  System.out.println("Enter your Payment Amount :");
			  double amount = Double.parseDouble(sc.nextLine());
			 
			  payment.makePayment(name, cardNo, amount);
		   }
		 
		  case 3 ->
		  {
			  System.out.println("Enter your 16 digit Debit Card Number :");
			  String cardNo = sc.nextLine();
			 
			  System.out.println("Enter your Payment Amount :");
			  double amount = Double.parseDouble(sc.nextLine());
			 
			  payment.makePayment(cardNo, amount);
		 }  
      }
		sc.close();
	}
}
