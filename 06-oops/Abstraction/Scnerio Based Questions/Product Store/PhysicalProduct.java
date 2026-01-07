package blc;

public class PhysicalProduct extends Product
{
	private double shippingWeight;
	
	public PhysicalProduct(String name, double price, String category,double shippingWeight) 
	{
		super(name, price, category);
		
		if(shippingWeight <= 0)
		{
			System.out.println("Shipping Weight can't be Negative");
			System.exit(0);
		}
		
	   this.shippingWeight = shippingWeight;
	}

	double discount;
	@Override
	public void applyDiscount(double percentage) 
	{
		discount = (getPrice()*percentage)/100;
	}

	@Override
	public double calculateTax() 
	{
		
		return (getPrice()-discount)*0.08;
	}
	
	public double calculateShippingCost()
    {
		return shippingWeight*5;
	}

	
	@Override
	public String toString() {
		return "Digital Product :\n"+"Product Name: "+getName()+"\nCategory: "+getCategory()+"\n"+"Price RS:"+getPrice()+"\nShipping Weight: "+shippingWeight+" kg";
	}
	
}


