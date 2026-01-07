package static_nested_class;

class MyOuter
{
	private String z = "Outer class Data";
	
	public void dostuff()
	{
		String x = "local variable";
		
		class MyInner
		{
			String z = "CLASS instance variable";
			
			public void seeOuter()
			{
				System.out.println("Outer x is "+MyOuter.this.z);
				System.out.println("Class variable z is : "+this.z);
				System.out.println("Local variavle is : "+x);
			}
		}
		
		MyInner mi = new MyInner();
		mi.seeOuter();
	}
	
	/*
	      MyInner mi = new MyInner();   //Invalid because outside of the method
		  mi.seeOuter();
	 */
}

public class Test16 
{
	public static void main(String[] args) 
	{
		MyOuter m = new MyOuter();
		m.dostuff();
	}

}
