package day_57__Annoymous_Inner_Class;

class Super
{
	public void display() 
	{
		System.out.println("Super class display method");
	}
}

public class AnonymousInnerClassDemo3 
{
	public static void main(String[] args) 
	{
		Super sub = new Super()
		{
			public void display() 
			{
				System.out.println("Sub class display method");
			}
		};
		sub.display();
	
	}
}
