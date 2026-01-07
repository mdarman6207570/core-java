package generics;

import java.util.ArrayList;
import java.util.List;


record Car()
{
	
}

public class Test5
{
	public static void main(String[] args) 
	{
		ArrayList<Car> a = new ArrayList<>();
		a.add(new Car());
		a.add(new Car());
		a.add(new Car());
		
		ArrayList b = a; //Assigning generic to raw type
		
		System.out.println(b);
	}
}
