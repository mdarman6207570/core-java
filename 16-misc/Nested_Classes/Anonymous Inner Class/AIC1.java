package inner_class;

class Bird
{
	public void fly()
	{
		System.out.println("Generic Bird is flying");
	}
}

public class AIC1 
{
	public static void main(String[] args) 
	{
		//Annonymous inner class
		Bird parrot = new Bird()
		{
	      	@Override
		    public void fly() 
	      	{
			    System.out.println("Parrot Bird is flying");
		    }
		};
		
		parrot.fly();
		
		//Annonymous inner class
		Bird sparrow = new Bird()
		{
		   @Override
		   	public void fly() 
		   {
		      System.out.println("Sparrow Bird is flying"); 		
		  	}	
		};
		sparrow.fly();
	}

}
