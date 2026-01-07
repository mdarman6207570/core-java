package collection_mcqs;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test16 
{
	public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        List<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");

        System.out.println(list.equals(vector));
    }
}
