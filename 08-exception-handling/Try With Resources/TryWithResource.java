package day_71_;

public class TryWithResource 
{
	public static void main(String[] args) throws Exception
	{
		FileResourse fr = new FileResourse();
		DatabaseResourse dr = new DatabaseResourse();
		
		try(fr;dr)
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Divide By zero problem");
		}
		
		System.out.println("Main method ended!!!");
	}

}
