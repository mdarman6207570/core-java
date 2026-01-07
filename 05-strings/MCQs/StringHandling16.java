package mcq;

public class StringHandling16 
{
	public static void main(String[] args) {
		String str = "Naresh I Technologies Java";
		for(int i=0;i<=str.length();i++)   //StringOutOfBoundException
		{			
			System.out.print(str.charAt(i)+" ");
		}
	}
}
