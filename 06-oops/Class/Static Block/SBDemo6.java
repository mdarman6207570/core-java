package day_43__Static_Block;

class sample
{
	public static final int A;  //static blank final field
    
	static
	{
		print();
		A = 900;
	}
	public static void print() 
	{
		System.out.println("Default Value :"+A);
	}
}

public class SBDemo6 
{
	public static void main(String[] args) 
	{
		 System.out.println("User Value :"+sample.A);
	}
}
