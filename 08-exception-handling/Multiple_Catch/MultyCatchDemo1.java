package day_70_Exception_handling_finally_block;



import java.util.Arrays;

public class MultyCatchDemo1 
{
	public static void main(String[] args) 
	{
		try
		{
			String s1 = "NIT";
			int no = Integer.parseInt(s1);
			System.out.println("Number is :"+no);
			
			Object obj[] = new String[3];
			obj[0] = "Hyderabad";
			obj[1] = "Ameerpet";
			obj[2] = 90;
			
			System.out.println(Arrays.toString(obj));
		}
		
		catch(ArrayStoreException e)
		{
			System.err.println("Inserting illegal data in the array");
		}
		catch(NumberFormatException e)
		{
			System.err.println("Number is not in a proper format");
		}
		catch(Exception e)
		{
			System.err.println("General Problem");
		}
		
		System.out.println("Program executed Successful");
	}

}
