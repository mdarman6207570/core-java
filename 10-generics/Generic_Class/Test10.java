package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Test10 
{
	public static void main(String[] args) 
	{
		//ArrayList<String> al = new ArrayList<String>();  [Compile time]		 
		ArrayList al = new ArrayList();    //[Runtime, Type Eraser]
		al.add("Ravi");
		
		
		Object []obj = new String[3];
		obj[0] ="Ravi";
		obj[1] = "hyd";
		obj[2] = 90;     // java.lang.ArrayStoreException
		System.out.println(Arrays.toString(obj));
	}
}
