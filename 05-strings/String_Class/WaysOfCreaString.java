package string;

public class WaysOfCreaString 
{
	public static void main(String[] args) 
	{
		//case1
		
		String str = "India";
		str.toUpperCase();
		System.out.println(str);  //India
		
		//case-2
		
		//deleted reference
		String s1 = "Java";
		s1 = s1.concat("Technology");
		System.out.println(s1);  //Java Technology
		
		
		//case-3
		String s = "Java";
		String ss = s.toUpperCase();
		System.out.println(s);
		System.out.println(ss);
	}
}
