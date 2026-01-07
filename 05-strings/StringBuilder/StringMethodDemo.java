package string;

public class StringMethodDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.reverse();
		System.out.println(sb);
	}

}
