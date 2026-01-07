package ay_13__Floating_Point__Boolean__Char___Literal;

public class CharLiteral 
{

	public static void main(String[] args) 
	{
		char c1 = 'A';
		char c2 = '2';
		char c3 = '@';
		
		char c = 65535;
		//char d = 65536; //Invalid [Out of UNICODE Range]
		
		int x = 'A';
		
		char ch = '\uffff';
		System.out.println(ch);
	}

}
