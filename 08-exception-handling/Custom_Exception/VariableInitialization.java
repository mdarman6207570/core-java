package custom_exception;

public class VariableInitialization 
{
	public static void main(String[] args) 
	{
		int x;
		
		try
		{
			x = 100;
			System.out.println(x);
		}
		catch (Exception e) 
		{
			x=200;                  //without this Error
		   System.out.println(x);
		}
	}

}
