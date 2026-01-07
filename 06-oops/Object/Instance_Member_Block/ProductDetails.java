package day12.elc;

import java.util.Scanner;

import day12.blc.Product;

public class ProductDetails {
	public static void main(String []args) {
		Product product =new Product();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product Id");
		int productId =Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter product name");
		String productName =sc.nextLine();
		
		System.out.println("Enter product price");
		double productPrice = Double.parseDouble(sc.nextLine());
			
		
		product.setProductData(productId,productName, productPrice);
		product.getProductInfo();
		sc.close();
	}

}
