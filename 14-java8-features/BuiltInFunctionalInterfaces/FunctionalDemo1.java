package typeparameter;

interface Predictable
{
	boolean test(Integer num);
}

public class FunctionalDemo1 
{
	public static void main(String[] args) 
	{
		Predictable p = n -> n%2==0;
	   
		System.out.println(p.test(10));
		System.out.println(p.test(19));
	}

}
