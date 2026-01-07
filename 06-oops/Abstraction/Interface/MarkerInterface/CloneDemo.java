package object_methods;

class Product implements Cloneable
{
	private int id;
	private String name;
	
	public Product(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}

public class CloneDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			Product p1 = new Product(111, "Laptop");
			Product p2 = (Product)p1.clone();
			
			System.out.println("Before Change :");
			System.out.println(p1+" : "+p2);
			
			System.out.println("After change in P2 object");
			p1.setId(999);
			p1.setName("Camera");
			System.out.println(p1+" : "+p2);
		}
		catch (CloneNotSupportedException e) 
		{
			System.err.println("Clone Operation not supported!!!\n"+e);
		}
	}

}
