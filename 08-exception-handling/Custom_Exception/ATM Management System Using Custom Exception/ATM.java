package elc;

import java.util.Scanner;

import blc.Bank;
import blc.BankAccount;
import blc.Customer;

public class ATM {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BankAccount acc1 = new BankAccount(1111, 60000);
		BankAccount acc2 = new BankAccount(2222, 3000);
		Customer customer1 = new Customer("Alice", acc1);
		Customer customer2 = new Customer("Bob", acc2);
		
		System.out.println("Select an option :\r\n"
				+ "           1. Deposit\r\n"
				+ "           2. Withdraw\r\n"
				+ "           3. Transfer\r\n"
				+ "           4. Loan Application\r\n"
				+ "           5. Check Balance\r\n"
				+ "           6. Exit");
		System.out.println("Enter your option : ");
		int option = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Customer name : ");
		String name = sc.nextLine();
		
		
	try {
	   	switch(option)
	   	{
	    	case  1  -> 
		    {
		    	
					  System.out.println("Enter amount to deposit: ");
					   double amount = Double.parseDouble(sc.nextLine());
					   customer1.getAccount().deposit(amount);

		            
		    }
		    
	    	case  2  -> 
		    {
		    	
					  System.out.println("Enter amount to withdraw: ");
					   double amount = Double.parseDouble(sc.nextLine());
					   customer1.getAccount().withdraw(amount);
				    
		    }
		    
	    	case  3  -> 
		    {
			  
				  System.out.println("Enter amount to transfer : ");
				   double amount = Double.parseDouble(sc.nextLine());
				   customer1.getAccount().transfer(acc2, amount);
			   
			    	
		    }
		    
	    	case  4  -> 
		    {
			   System.out.println("Enter loan amount to apply: ");
			   double amount = Double.parseDouble(sc.nextLine());
			   customer1.getAccount().applyForLoan(amount);
		   
		    	
		    }	
	    	case  5  -> 
		    {
		    	System.out.print("Total Balance is :");
			  System.out.println(customer1.getAccount().getBalance());
		    }
		    
	    	case  6  -> 
		    {
			  System.out.println("Thank you for using the ATM. Goodbye!");
			  System.exit(0);
		    }
		    
	    	default  -> 
		    {
			   System.err.println("Choose correct option");
			   System.exit(0);
		    }
    	}
	}  	
	    catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
		
		
		
	}

}
