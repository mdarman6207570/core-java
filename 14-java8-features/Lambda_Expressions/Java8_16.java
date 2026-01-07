package lamdamcq;

interface NIT16
{
	public int myInterface(int a);
}

public class Java8_16
{
	public static void main(String[] args) {
		NIT16 nit = (a) -> a+1;
		int i = nit.myInterface(6);
		System.out.println(i);
	}
}
