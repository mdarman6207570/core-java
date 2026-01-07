package day_69_Scenario__Lambda;

import java.util.Scanner;
import java.util.function.Function;

public class CalculateProductDiscount {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id :");
		int pId = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Product Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter Product Price :");
		Double price = Double.parseDouble(sc.nextLine());
		
		
		Product p = new Product(pId, name, price);
		Function<Product, Double> fun =  prod ->
		{
			double discount = 0;
			 if(prod.price() >=5000)
				 discount = prod.price()*10.0/100;
			 else 
				 discount = prod.price()*5.0/100;
			
			 return discount;
		};
         
		System.out.println("Final price of the product is :"+(price-fun.apply(p)));
		sc.close();
	}
}


record Product(Integer id, String name,Double price)
{

}


