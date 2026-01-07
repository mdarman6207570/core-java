package count;

import java.util.List;

public class CountDemo2 
{
	public static void main(String[] args) 
	{
		List<String> listOfName = List.of("Raj","Ravi","Virat","Ram","Bumrah","Sachin");
		
		long names = listOfName.stream().filter(name -> name.length()>3).count();
		
		System.out.println("Names whose length is > 3 are :"+names);
	}
}
