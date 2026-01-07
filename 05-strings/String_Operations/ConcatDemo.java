package string_methods;

public class ConcatDemo 
{
	 public static void main(String[] args) 
	 {
	        String s1 = "Data";
	        String s2 = "base";

	        String s3 = s1.concat(s2);
	        System.out.println(s3); // Database

	        String s4 = "Java";
	        String s5 = s4.concat(" technology");
	        System.out.println(s5); // Java technology

	        String s6 = "Batch 47";
	        String s7 = s6 + " Batch 49";
	        System.out.println(s7); // Batch 47 Batch 49
	    }
}
