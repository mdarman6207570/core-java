package day_48__Wrapper_Class;

public class AutoBoxing4 
{
	public static void main(String[] args) 
	{
		Integer i = 127;
		Integer j = 127;
		System.out.println(i==j);  //true because Integer objects are immutable
		
		Integer x = 128;
		Integer y = 128;
		System.out.println(x==y);  //false because Integer class cache memory value is upto 127
		
		Integer p = 128;
		Integer q = 128;
		
		System.out.println(p.equals(q));  //true because Integer objects are immutable
		
	}

}
