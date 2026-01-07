package day_43__Static_Block;

class Test8
{
	public static void accept() {
		x = 900;
		System.out.println(x);  //Here class Not Required
	}
	static int x;
}


public class StaticBlockDemo8 
{
	 public static void main(String args[])
	   {
		   Test8.accept();
	   }
}
