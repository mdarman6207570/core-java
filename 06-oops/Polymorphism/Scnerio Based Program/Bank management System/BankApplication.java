package elc;

import java.util.Scanner;

import blc.BankAccount;
import blc.CurrentAccount;
import blc.FixedDepositAccount;
import blc.SavingsAccount;

public class BankApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Account Type :");
		System.out.println("\t1) Saving Account");
		System.out.println("\t2) Current Account");
		System.out.println("\t3) Fixed Deposit Account");
		System.out.println("Please enter the type of account you want to open : [1/2/3]");
		
		BankAccount account = null;
		int opt = Integer.parseInt(sc.nextLine());
		
		switch(opt)
		{
		case 1 ->
		   {
			   System.out.println("Enter account Holder Name :");
			   String name = sc.nextLine();
			   System.out.println("Enter account Number :");
			   String acNo = sc.nextLine();
			   System.out.println("Enter the Amount :");
			   double amount = Double.parseDouble(sc.nextLine());
			   
			   account  = new SavingsAccount(name, acNo, amount);
			   account .displayAccountDetails();
			   account .calculateInterest();
		   }
		case 2 ->
		   {
			   System.out.println("Enter account Holder Name :");
			   String name = sc.nextLine();
			   System.out.println("Enter account Number :");
			   String acNo = sc.nextLine();
			   System.out.println("Enter the Amount :");
			   double amount = Double.parseDouble(sc.nextLine());
			   
			   account  = new CurrentAccount(name, acNo, amount);
			   account .displayAccountDetails();
			   account .calculateInterest();
			  
			   CurrentAccount ca = new CurrentAccount(name, acNo, amount);
			   ca .checkOverdraftLimit();
	   	   }
		case 3 ->
		   {
			   System.out.println("Enter account Holder Name :");
			   String name = sc.nextLine();
			   System.out.println("Enter account Number :");
			   String acNo = sc.nextLine();
			   System.out.println("Enter the Amount :");
			   double amount = Double.parseDouble(sc.nextLine());
			   System.out.println("Enter the deposit term [For How many years you want to deposit] :");
			   int depositTerm = Integer.parseInt(sc.nextLine());
			  
			   account  = new FixedDepositAccount(name,acNo,amount,depositTerm);
			   account .displayAccountDetails();
			   account .calculateInterest(); 
	       }
		 default ->{
			 System.out.println("Choose option between 1 AND 3");
			 System.exit(0);			 
		 }
		}
		sc.close();
	}

}
