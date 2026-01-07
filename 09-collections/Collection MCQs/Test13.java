package collection_mcqs;

import java.util.ArrayList;

public class Test13 
{
	public static void main(String[] args)
	{
	 ArrayList<String> list = new ArrayList<>();
	 /*
	 list.add(12);        //Error can't assign Integer in String type
	 list.add(16);
	 list.add(34);
	 list.add(78);
	 */
	 list.remove(12);
	 System.out.println(list);
	 }
}
