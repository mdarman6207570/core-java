package day_69_Exception_handling;

public class SpecificException 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method started");
		
		try
		{
			String str = null;
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException e)
		{
			System.out.println("Ref variable is pointing to null");
			System.out.println("..................");
			System.out.println(e.getMessage());
			System.out.println("...................");
			System.out.println(e.toString());
			System.out.println("...................");
			e.printStackTrace();
		}
		System.out.println("Main Method ended");
	}

}
