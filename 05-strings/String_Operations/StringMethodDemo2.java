package string_methods;

import java.util.StringTokenizer;

public class StringMethodDemo2 
{
	public static void main(String[] args) 
	{
		String str = "Hyderabad is an IT city";
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		System.out.println("Total number of tokens are :"+st.countTokens());
		
		while(st.hasMoreElements())
		{
			String nextToken = st.nextToken();
			System.out.println(nextToken);
		}
	}

}
