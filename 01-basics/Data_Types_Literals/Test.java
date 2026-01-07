package floatingpoint;

public class Test 
{

	public static void main(String[] args) 
	{
		// float f = 0.0;    //error
		
		float b = 15.29F;
		float c = 15.25f;
		float d = (float)15.30;
		
		System.out.println(b+" : "+c+" : "+c);
		System.out.println("..........................\n");
		
		
		double e = 15.15;
		double f = 15.10d;
		double g = 15.28D;
		
		System.out.println(e+" : "+f+" : "+g);
		System.out.println("..........................\n");
		
	}

}
