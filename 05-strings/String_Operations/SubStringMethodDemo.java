package string_methods;

public class SubStringMethodDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "hello hyderabad";
		
		System.out.println(s1.substring(4));  //o hyderabad
		System.out.println(s1.substring(2,9));  //llo hyd
		
		System.out.println(s1.substring(2,2));  //nothing will print
		
		System.out.println(s1.substring(7,2));  //StringIndexOutOfBoundException
		System.out.println(s1.substring(2,-6));  //StringIndexOutOfBoundException
	}

}
