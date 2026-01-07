package generics;

import java.util.ArrayList;

public class Test2 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList(); //raw type
		al.add("alpha");
		al.add("beta");
		
		for(int i=0;i<al.size();i++)
		{
			String s = (String) al.get(i);     
			System.out.println(s);
		}
		
		
		al.add(1234);
		al.add(1256);
		
		for(int i=0;i<al.size();i++)
		{
			String s = (String) al.get(i);    //we can't perform TC  
			System.out.println(s);
		}
	}

}
