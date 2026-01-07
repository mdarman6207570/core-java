package array;

public class Test 
{
	public static void main(String[] args) 
	{
		long arr[] = { 111, 442, 5643, 3938, 88373, 8373663 };
		for (int i = 0; i < arr.length; i++) 
		{
			long n = arr[i];
			System.out.println(arr[i] + "=" + (int) (Math.log10(n) + 1));
		}
	}
}