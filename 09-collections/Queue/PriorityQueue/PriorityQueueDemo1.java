package queque;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Object> pq = new PriorityQueue<Object>();
		pq.add("Orange");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Guava");
		pq.add("Grapes");
		
		//pq.add(null); //Invalid
		//pq.add(23);   //Invalid
		
		System.out.println(pq);
	}

}
