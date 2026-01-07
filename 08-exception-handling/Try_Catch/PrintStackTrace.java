package day_69_Exception_handling;

public class PrintStackTrace 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method started");
		
		try
		{
			throw new NullPointerException("ref is null");
		}
		catch(Exception e)
		{
			System.out.println("Ref variable is pointing to null");
			System.err.println("..............................");
			System.out.println(e.getMessage());
			System.out.println("..............................");
			System.out.println(e.toString());
			System.out.println("................................");
			e.printStackTrace();
		}
		System.out.println("Main Method ended");
	}

}
