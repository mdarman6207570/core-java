package constructor_chaining;

class Super
{

	public Super()
	{
		super();
		System.out.println("No Argument Constructor of Super class!!!");
	}
	
   public Super(int val)
   {
	   this();
	   System.out.println("Parameterized Constructor of Super class!!!"+val);
   }
}

class Sub extends Super
{
	public Sub(int data)
	{
		super(data);
		System.out.println("No Argument Constructor of Sub class!!!");
	}
}

public class ConstructorChainingDemo3 
{

	public static void main(String[] args) 
	{
		new Sub(15);

	}

}
