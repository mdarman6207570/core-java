package day_59_equals__method_and_MCQs;

class Product
{
	private int productId;
	private String productName;
	
	public Product(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	@Override
	public int hashCode()
	{
		return this.productId;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Product p2 = (Product)obj;
		
		if(obj instanceof Product)
		{
			if(this.productId == p2.productId && this.productName.equals(p2.productName))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	else
	{
		System.out.println("Comparison is not possible");
		return false;
	}
  }
}

public class ProductEquality 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(111, "Arman");
		Product p2 = new Product(111, "Arman");
		
	System.out.println(p1.hashCode()+" : "+p2.hashCode());
	System.out.println(p1.equals(p2));
	}
}

