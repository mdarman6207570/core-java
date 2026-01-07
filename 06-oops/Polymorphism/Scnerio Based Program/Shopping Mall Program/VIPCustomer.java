package blc;

public class VIPCustomer extends Customer  
{
	protected double discountRate = 15.0;

	public VIPCustomer(String name) 
	{
		super(name);
	} 
	
	public void calculateBill(double ...price) 
	{
		double total =0;
		
		for(double p : price) 
		{
			if (p < 0) {
                System.out.println("Welcome to Hyderabad Mall :");
                System.out.println("Item price cannot be negative.");
                System.exit(0);
            }
			
		   total += p;	
		}
		
		double discount = total * discountRate / 100;
        double finalAmount = total - discount;
		
		System.out.println("Welcome to Hyderabad Mall :");
		System.out.println("Customer:"+name);
		System.out.println("Total cost RS :"+total);
		System.out.println("Total cost RS :"+discount);
		System.out.println("Final amount RS :"+finalAmount);
		
	}
}
