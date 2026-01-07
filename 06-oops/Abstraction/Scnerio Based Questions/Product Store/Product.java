package blc;

public abstract class Product 
{
	private String name;
	private double price;
	private String category;
	
	public Product(String name, double price, String category) 
	{
		super();
		if(name == null) 
		{
		   System.err.println("Product name cannot be empty or null.");
		   System.exit(0);
		}
		else if(price <0)
		{
			System.err.println("Price cannot be negative.");
			System.exit(0);
		}
		else if(category == null)
		{
			System.err.println("Category cannot be empty or null.");
			System.exit(0);
		}
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public abstract void applyDiscount(double percentage);
	public abstract double calculateTax();

	
	
	public String getName() 
	{
		return name;
	}

	public double getPrice() 
	{
		return price;
	}

	public String getCategory() 
	{
		return category;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public void setCategory(String category) 
	{
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product name :" + name + "\nprice:" + price + "\ncategory :" + category;
	}

	
	
	
	
}
