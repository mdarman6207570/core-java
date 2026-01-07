package string.mcqs;

public class Test4 
{
	public static void main(String[] args)
    {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.hashCode()+" "+sb2.hashCode());
    }
}
