package generics;

import java.util.ArrayList;

public class Test1 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("Ravi");
		al.add("Aswin");
		al.add("Rahul");
		al.add("Raj");
		
		for(int i=0;i<al.size();i++)
		{
			String s = (String) al.get(i);     //TC required
			System.out.println(s);
		}
	}

}
