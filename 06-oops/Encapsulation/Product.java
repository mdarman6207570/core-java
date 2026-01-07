package day_28.blc;

public class Product {

	   private int productId;
	   private String Productname;
	   private double productPrice;
	   
	   public Product(int productId, String Productname, double productPrice) {
	     
		   if(productId <0) {
			   System.err.println("Product Id cannot be negative");
			   System.exit(0);
		   }
		   
		   if(Productname == null || Productname.trim().isEmpty() || Productname.equals(null)) {
			   System.err.println("Productd name cannot be null or empty");
			   System.exit(0);
		   }
		   
		   if(productPrice <0) {
			   System.err.println("Productd Price cannot be negative");
			   System.exit(0);
		   }
		   
		   this.productId = productId;
		   this.Productname = Productname;
		   this.productPrice = productPrice;
	}

	   @Override
	   public String toString() {
		return "Product [productId=" + productId + ", Productname=" + Productname + ", productPrice=" + productPrice
				+ "]";
	   }
	
}
