package day_73;

import java.util.Arrays;

public class NestedTryBlock 
{
	public static void main(String[] args) 
	{
		try
		{
			Object []arr = new String[3];
			arr[0] = "Scott";
			arr[1] = "Smith";
			arr[1] = "Raj";
			System.out.println(Arrays.toString(arr));
			
			try
			{
				int []x = new int[-9];
			}
			catch (NegativeArraySizeException e) 
			{
				System.out.println("Array size must be a positive integer");
			}
		}
		catch (ArrayStoreException e) 
		{
			System.out.println("Illegal data inside array");
		}
		
		System.out.println("Main method completed");
	}

}
