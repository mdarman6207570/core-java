package elc;

import java.util.Scanner;
import blc.Product;
import blc.DigitalProduct;
import blc.PhysicalProduct;

public class ProductStore 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Digital Product");
		System.out.println("2. Physical Product");
		
		int option = Integer.parseInt(sc.nextLine());
		
		switch(option)
		{
		   case 1 ->
		   {
			   System.out.println("Enter Digital Product Name :");
			   String pName = sc.nextLine();
			   
			   System.out.println("Enter Product Price :");
			   double price = Double.parseDouble(sc.nextLine());
			   
			   System.out.println("Enter Product Category :");
			   String pCategory = sc.nextLine();
			   
			   System.out.println("Enter Product License Key :");
			   String licenseKey = sc.nextLine();
			   
			   System.out.println("Enter the discount % on final bill");
			   int dispercentage = Integer.parseInt(sc.nextLine());
			   
			   Product p = new DigitalProduct(pName, price, pCategory,licenseKey);
			   System.out.println(p);
			   p.applyDiscount(dispercentage);
			   System.out.println("Tax RS :"+p.calculateTax());  
		   }
		   
		   case 2 ->
		   {
			   System.out.println("Enter Physical Product Name :");
			   String pName = sc.nextLine();
			   
			   System.out.println("Enter Product Price :");
			   double price = Double.parseDouble(sc.nextLine());
			   
			   System.out.println("Enter Product Category :");
			   String pCategory = sc.nextLine();
			   
			   System.out.println("Enter Product weight :");
			   int weight = Integer.parseInt(sc.nextLine());
			   
			   System.out.println("Enter the discount % on final bill");
			   int dispercentage = Integer.parseInt(sc.nextLine());
			   
			   PhysicalProduct p = new PhysicalProduct(pName, price, pCategory,weight);
			   System.out.println(p);
			   p.applyDiscount(dispercentage);
			   System.out.println("Tax RS :"+p.calculateTax()); 
			   System.out.println("Shipping Cost RS :"+p.calculateShippingCost());
		   }
		   
		   default ->
		   {
			   System.out.println("Choose Option 1 OR 2 ONLY");
			   System.exit(0);
		   }
		}
		sc.close();
	}

}
