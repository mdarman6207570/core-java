package collection_mcqs;

import java.util.ArrayList;

public class Test14 
{
	public static void main(String[] args)
	{
	 ArrayList<String> list = new ArrayList<>();
	 /*
	 list.add('a');   //Error can't assign Char in String type
	 list.add('b');
	 list.add('c');
	 list.add('d');
	 */
	 list.remove('c');
	 System.out.println(list);
	 }
}
