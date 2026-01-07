package day_43__Static_Block;

class Sample
{
	public static final int MAX_VALUE;  //static blank final field
	
	static
	{
		MAX_VALUE = 900;
	}
}

public class SBDemo5 
{
	public static void main(String[] args) 
	{
		 System.out.println(Sample.MAX_VALUE);
	}
	
}
