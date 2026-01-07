package array_using_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUsingSteamDemo3 
{
	public static void main(String[] args) 
	{
		Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		List<Integer> primeNumbers = Arrays.stream(numbers).filter(num -> ArrayUsingSteamDemo3.isPrime(num)).collect(Collectors.toList());
	     System.out.println("Prime Numbers : "+primeNumbers);
	}
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else
		{
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}
}
