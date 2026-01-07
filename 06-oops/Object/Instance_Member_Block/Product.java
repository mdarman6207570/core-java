package day12.blc;

public class Product {
int productId;
String productName;
double productPrice;

public void setProductData(int id, String name, double price) {
	 productId = id;
	 productName = name;
	 productPrice = price;
}

 public void getProductInfo() {
	System.out.println("Id of the Product is :"+productId);
	System.out.println("Name of the Product is :"+productName);
	System.out.println("Price of the Product is :"+ productPrice);
	 
  }

}
