package blc;

public class DigitalProduct extends Product
{
	
	private String licenseKey;
	
	public DigitalProduct(String name, double price, String category,String licenseKey) 
	{
		super(name, price, category);
		
		if(licenseKey == null)
		{
			System.out.println("LicenseKey can't be Null");
			System.exit(0);
		}
		this.licenseKey=licenseKey;
	}

	double discount;
	@Override
	public void applyDiscount(double percentage) 
	{
		discount = (getPrice()*percentage)/100;
		System.out.println("Discount applied :"+discount);
		System.out.println("New Price :"+(getPrice()-discount));
	}

	@Override
	public double calculateTax() 
	{
		return (getPrice()-discount)*0.05;
	}

	@Override
	public String toString() 
	{
		return "Digital Product :\n"+"Product Name: "+getName()+"\nCategory: "+getCategory()+"\n"+"Price RS:"+getPrice()+"\nLicense Key: "+licenseKey;
	}

	
	
	
}
