package mcq;

public class StringHandling17 
{
	public static void main(String[] args) {
		String str = "Naresh I Technologies Java";
		str = str.replace(" ", "");
		for(int i=0;i<str.length();i++)
		{		
			System.out.print(str.charAt(i)+"");
		}
	}
}
