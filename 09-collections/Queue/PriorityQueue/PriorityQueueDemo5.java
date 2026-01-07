package queque;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int choice;
		
		do
		{
			System.out.println("\n=== PriorityQueue Menu ===");
			System.out.println("1. Insert element");
			System.out.println("2. Remove head element (poll)");
			System.out.println("3. View head element (peek)");
			System.out.println("4. Display PriorityQueue");
			System.out.println("5. Exit");
			System.out.println("Enter your choice :");
			choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter element to insert: ");
				int val = Integer.parseInt(sc.nextLine());
				pq.add(val);
				System.out.println(val+" inserted.");
				break;
				
			case 2:
				if(pq.isEmpty())
				{
					System.out.println("PriorityQueue is empty!");
				}
				else
				{
					System.out.println("Removed :"+pq.poll());
				}
				break;
				
			case 3:
				if(pq.isEmpty())
				{
					System.out.println("PriorityQueue is empty!");
				}
				else
				{
					System.out.println("Removed :"+pq.peek());
				}
				break;
				
			case 4:
				System.out.println("PriorityQueue :"+pq);
				break;
				
			case 5:
				System.out.println("Exiting...");
				break;
				
			default:
				System.err.println("Invalid choice!");
				
			}
		
		}while(choice != 5);
		sc.close();
	}
}
