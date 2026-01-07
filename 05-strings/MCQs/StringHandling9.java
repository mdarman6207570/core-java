package mcq;

public class StringHandling9 
{
	public static void main(String[] args) {
		String str = "NareshIT";
		String str1 = new String("NareshIT").intern();
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
	}
}
