package day_48__Wrapper_Class;

public class AutoBoxing2 
{
	public static void main(String[] args) 
	{
		byte b = 12;
		Byte b1 = Byte.valueOf(b); 
		System.out.println("Byte Object :"+b1);
		
		Short s = 17;
		Short s1 = Short.valueOf(s); 
		System.out.println("Short Object :"+s1);
		
		int i = 90;
		Integer i1 = Integer.valueOf(i); 
		System.out.println("Integer Object :"+i1);
		
		long l =  12;
		Long l1 = Long.valueOf(l); 
		System.out.println("Long Object :"+l1);
		
		float f = 2.4f;
		Float f1 = Float.valueOf(f); 
		System.out.println("Float Object :"+f1);
		
		double d = 90.90;
		Double d1 = Double.valueOf(d); 
		System.out.println("Double Object :"+d1);
		
		char ch = 'k';
	    Character ch1 = Character.valueOf(ch); 
		System.out.println("Character Object :"+ch1);
		
		boolean bo = true;
		Boolean bo1 = Boolean.valueOf(bo); 
		System.out.println("Boolean Object :"+bo1);
		
	}

}
