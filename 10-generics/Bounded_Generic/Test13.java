package generics;

import java.util.ArrayList;
import java.util.List;


class Alpha
{
	
}
class Beta extends Alpha
{
	
}
class Gamma extends Beta
{
	
}

public class Test13 
{
	public static void main(String[] args) 
	{
		List<? extends Number> list = new ArrayList<Short>(); 
		List<? super String> list2 = new ArrayList<Object>(); 
		List<? super Gamma> list3 = new ArrayList<Alpha>(); 
		
		List list4 = new ArrayList();
		System.out.println("Yess!!");
	}

}

