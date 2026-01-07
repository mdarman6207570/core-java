package generics;

import java.util.ArrayList;

class Parent
{
	
}
class Child extends Parent
{
	
}

public class Test11 
{
	public static void main(String[] args) 
	{
		//ArrayList<Parent> list = new ArrayList<Child>(); // compile error
		ArrayList<?> lp1 = new ArrayList<Child>(); 
		ArrayList<Parent> lp2 = new ArrayList<Parent>(); 
		ArrayList<Child> lp3 = new ArrayList();
		
		System.out.println("Success!!!");
	}

}
