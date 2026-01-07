package string_methods;

public class ReplaceMethodDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "ababababab";
		String s2 = s1.replace('a', 'A');
		System.out.println("Original String :"+s1);
		System.out.println("Original String :"+s2);
		
		String str = "Manager";
		System.out.println(str.replace("Man", "Dam"));
	}

}
