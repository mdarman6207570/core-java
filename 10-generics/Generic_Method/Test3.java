package generics;

import java.util.ArrayList;

public class Test3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Ravi");
		al.add("Ajay");
		al.add("Vijay");
		
		for(int i=0;i<al.size();i++)
		{
			String s = al.get(i);     //No TC required
			System.out.println(s.toUpperCase());
		}
	}

}
