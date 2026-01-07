package lamdamcq;

interface Add3
{
	int add(int b);
	int add(int a, int b);
}
public class FunctionalInterface3 
{
	public static void main(String[] args) {
		int a = 21;
		// Add3 add = b -> b+b;                          //not a functional interface
	  // System.out.println(add.add(a));
	}
}
