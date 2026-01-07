package day_33.credit_card_program;

public class Customer {
   private String customerName;
   int creditPoints;
   
   
   public Customer(String customerName, int creditPoints) {
	super();
	this.customerName = customerName;
	this.creditPoints = creditPoints;
   }


   public int getCreditPoints() {
	return creditPoints;
   }


   @Override
   public String toString() {
	return this.customerName ;
   }   
}


