package string_methods;

public class SplitMethodDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Hyderabad is a nice city";
		String []words = s1.split(" ");  //Space is regex
		
		for(String word:words)
		{
			System.out.println(word);
		}
		System.out.println("....................");
		
		String s2 = "Hyderabad is a nice city";
		words = s2.split("a");
		
		for(String word:words)
		{
			System.out.println(word);
		}
	
	}

}
