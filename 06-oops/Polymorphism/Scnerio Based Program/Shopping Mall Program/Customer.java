package blc;

public class Customer 
{
	protected String name;
	
	public Customer(String name) 
	{	
		if (name == null || name.trim().isEmpty()) 
		{
          System.out.println("Customer name cannot be empty.");
          System.exit(0);
       }
		this.name = name;
	}



	public void calculateBill(double... prices) {
        double total = 0;
        for (double p : prices) {
            if (p < 0) {
                System.out.println("Welcome to Hyderabad Mall :");
                System.out.println("Item price cannot be negative.");
                System.exit(0);
            }
            total += p;
        }
        System.out.println("Welcome to Hyderabad Mall :");
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS : " + total);
    }
}
