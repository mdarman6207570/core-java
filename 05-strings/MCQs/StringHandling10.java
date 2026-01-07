package mcq;

public class StringHandling10 
{
	public static void main(String[] args) 
	{
		String str = "apple,banana,orange";
                String[] fruits = str.split(",");
                System.out.println(fruits[1]);
	}
}
