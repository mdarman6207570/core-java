package day_47_Overloading___Var_args;

class Sample
{
	
	/*
	 * All commented lines are Invalid
	 * 
	 public void displayParameter(int ...x, int ...y)
     {
    	
	 }
	 
	  public void displayParameter(int ...x, int y)
     {
    	
	 }
	 
	  public void displayParameter(int ...x, float ...y)
     {
    	
	 }
	 
	 */
	
	
	
	public void displayParameter(int x, int ...y)
	{	
		System.out.println("x value is :"+x);
		
		for(int z : y)
		{
			System.out.println(z);
		}
	}
}


public class VarArgsDemo5 
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		int arr[] = {200,300,400,500};
		s.displayParameter(100, arr);
	}
}
