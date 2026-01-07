package collection_mcqs;

import java.util.ArrayList;

public class CollectionExample17 
{
	public static void main(String argv[]) 
	{

		ArrayList list = new ArrayList();
		ArrayList listStr = list;
		ArrayList listBuf = list;
		listStr.add(0, "Hello");
		//StringBuffer buff = listBuf.get(0);
		//System.out.println(buff.toString());
	}
}