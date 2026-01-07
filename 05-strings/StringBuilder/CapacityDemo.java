package string;

public class CapacityDemo
{
	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer();
		System.out.println("Initial Capacity is :"+buffer.capacity()); //16
	
		StringBuffer sb2 = new StringBuffer("India");
		System.out.println(sb2.capacity()); //21
		
		sb2.append(" is a great country. It is in asia"); //21*2 = 44
		System.out.println(sb2.capacity());
	}

}
