package sunday_day_03_equals;

class Product
{
	private int id;
	private String name;
	
	public Product(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() 
	{
		return this.id;
	}
	
	//Overriding for content comparison
	@Override
	public boolean equals(Object obj)
	{
		Product p2 = (Product)obj;
		
		if(this.id == p2.id && this.name == p2.name)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class EqualsDemo3 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(111, "Camera");
		Product p2 = new Product(111, "Camera");
		
		System.out.println(p1.equals(p2));  //true
		System.out.println(p1.hashCode()+" : "+p2.hashCode());
	}

}
