package elc;

import java.util.Scanner;

import blc.Customer;
import blc.GeneralCustomer;
import blc.PrimeCustomer;
import blc.VIPCustomer;

public class ShoppingMall 
{
	public static void generateBill(Customer cust, double... prices)
	{
		cust.calculateBill(prices);	
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select the Customer Type to get additional Discount :");
		System.out.println("\t1) General Customer ");
		System.out.println("\t2) Prime Customer ");
		System.out.println("\t3) VIP Customer ");
		
		System.out.println("Please enter Customer type :");
		int option = Integer.parseInt(sc.nextLine());
		
		System.out.println("Please Enter your Name :");
        String name = sc.nextLine();
        
		Customer cust = null;
		
        switch (option) {
            case 1:
                cust = new GeneralCustomer(name);
                break;
            case 2:
                cust = new PrimeCustomer(name);
                break;
            case 3:
                cust = new VIPCustomer(name);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }
        
        System.out.println("Enter number of Items :");
        int n =Integer.parseInt(sc.nextLine());
        double[] prices = new double[n];
        sc.nextLine(); 

        
        System.out.println("Please Enter the Item Name and Price :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ")Item Name :");
            String itemName = sc.nextLine();
            System.out.print("  Item Price :");
            prices[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        
        generateBill(cust, prices);
        sc.close();
   }
}
