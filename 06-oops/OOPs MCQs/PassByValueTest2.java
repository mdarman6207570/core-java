package day_32.mcq;


class Customerr
{
	private double bill = 1200;

	public void setBill(double bill) 
	{
		this.bill = bill;
	}
	
	public double getBill()
	{
		return this.bill;
	}
	
}


public class PassByValueTest2 {
	public static void main(String[] args) 
	{
	  Customerr c1 = new Customerr();	
	  
	  updateCustomerBill(c1);
	  System.out.println(c1.getBill());
	}
	
	public static void updateCustomerBill(Customerr cust)
	{
		cust = new Customerr(); //Another Object
		cust.setBill(1800);
	}
}
