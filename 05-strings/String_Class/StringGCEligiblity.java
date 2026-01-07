package string;

public class StringGCEligiblity 
{
	public static void main(String[] args) 
	{
		String s1 = "india";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1 = null;
		System.gc();
		
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		String s2 = "india";
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		
	}
}
