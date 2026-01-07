package generics;

import java.util.ArrayList;
import java.util.List;

class Parent2
{
	
}
class Child2 extends Parent2
{
	
}

public class Test12 
{
	public static void main(String[] args) 
	{ 
		List<?> lp = new ArrayList<Parent2>();
		
		System.out.println("WildCard...");
	}

}
