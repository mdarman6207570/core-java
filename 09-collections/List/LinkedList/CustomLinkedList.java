package ll;

public class CustomLinkedList 
{
	private static class Node
	{
		int item;
		Node next;
		
		public Node(int item)
		{
			this.item=item;
			this.next=null;
		}
	}
	
	public static void main(String[] args) 
	{
		Node n1 = new Node(100);
		Node n2 = new Node(200);
		Node n3 = new Node(300);
		
		//Establish the link
		n1.next=n2;
		n2.next=n3;
		
		System.out.println(n1);
		System.out.println(n1.next.item);
		System.out.println(n1.next.next.item);
	}

}
