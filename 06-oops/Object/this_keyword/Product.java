package com.arman.this_keyword;

public class Product {
	 private int ProductId;
	 private String ProductName;
	 private double ProductPrice;
	   
	   public void setProductData(int ProductId,  String ProductName, double ProductPrice ) {
		
		   this.ProductId = ProductId;
		   this.ProductName = ProductName;
		   this.ProductPrice = ProductPrice;
	   
	   }
	  public void getProductData() {
	   
		  System.out.println("Product Id is :"+ProductId);
		   System.out.println("Product Name is :"+ProductName);
		   System.out.println("Product Price is :"+ProductPrice);

	}
}	   
	   
