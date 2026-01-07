package object_methods;

record Products(Integer id,String name)
{
	@Override
	protected void finalize()
	{
		System.out.println("Product object is eligible for GC");
		System.out.println("We should close all the resources inside finalize method");
	}
}

public class FinalizeDemo 
{
	public static void main(String[] args) 
	{
		Products p1 = new Products(111, "Camera");
		System.out.println(p1);
		p1 = null;
		
		System.gc();
		
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(p1);
	}

}
