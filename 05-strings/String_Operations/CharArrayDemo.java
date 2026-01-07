package string_methods;

public class CharArrayDemo 
{
	public static void main(String[] args) 
	{
		String str = "Hydrabad is an IT city";
		
		char[] Characters = str.toCharArray();
		
		for(char ch : Characters)
		{
			System.out.print(ch+" ");
		}
	}

}
