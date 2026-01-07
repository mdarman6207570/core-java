package queque;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo3 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
		maxheap.add(15);
		maxheap.add(5);
		maxheap.add(25);
		
		while(!maxheap.isEmpty())
		{
			System.out.println(maxheap.poll());
		}
		
	}

}
