package day_14__Char_Literal__String_Literal__Local_Variable;

public class CharLiteral 
{
	public static void main(String args[])
	{
		char ch1 = 'a';
		System.out.println(ch1);
		
		char ch2 = '5';
		System.out.println(ch2);
		
		char ch3 = '@';
		System.out.println(ch3);
		
		int ch = 'A';
		System.out.println(ch);
		
		char c = 'A';
		System.out.println(c);
		
		
		char ch4 = 63;
		System.out.println(ch4);
		
		char ch5 = 65;
		System.out.println(ch5);
		
		char ch6 = 01;  
		System.out.println(ch6);
		
		int x = 'A';
		int y = 'B';
		
		System.out.println(x+y);  //131
		System.out.println('a'+'a'); //194
		System.out.println("a"+"a"); //aa
		
		
		char chh = 65535;
		System.out.println(chh);
		
		//char chhh = 65536; //Out of range
	}
}
