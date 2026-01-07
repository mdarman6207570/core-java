package day_48__Wrapper_Class;

public class AutoBoxing1 
{
	public static void main(String[] args) 
	{
		int a = 12;
		Integer x= Integer.valueOf(a);  //upto 1.4 version
		System.out.println(x);
				
		int y = 15;
		Integer i = y;          //From 1.5V onwards compilers take care    
		System.out.println(i);
			
	
	}

}
