package day_43__Static_Block;

class Test7
{
	static
	{
		x = 100;
		System.out.println(Test7.x); //Here class Required
	}
	static int x;
}



public interface SBDemo7 
{
   public static void main(String args[])
   {
	   new Test7();
   }
}
