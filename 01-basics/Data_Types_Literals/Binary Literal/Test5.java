package day_11_Binary_Literal;

public class Test5 
{

	public static void main(String[] args) 
	{
        byte b = 125;
        short s = b;   //Widening  OR Automatic type casting
        System.out.println(s);
        
        short x = 345;
        int y = x;     //Widening  OR Automatic type casting
        System.out.println(y);
	}

}
