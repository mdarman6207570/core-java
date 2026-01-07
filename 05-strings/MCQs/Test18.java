package string.mcqs;

public class Test18 
{
	public static void main(String[] args) 
    {
        String str = "ABCD";
        byte[] b = str.getBytes();
        for (byte x : b) 
	{
            System.out.print(x + " ");
        }
    }
}
