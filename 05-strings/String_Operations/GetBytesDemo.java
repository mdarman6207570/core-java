package string_methods;

public class GetBytesDemo 
{
	public static void main(String[] args) 
	{
		String str = "ABCDEFGH";

		byte[] values = str.getBytes();

		for (byte value : values) 
		{
			System.out.print(value+" ");
		}
	}

}
