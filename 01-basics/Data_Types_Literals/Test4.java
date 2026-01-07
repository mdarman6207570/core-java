package floatingpoint;

public class Test4 
{

	public static void main(String[] args) 
	{
       double x = 0x29;
      // double y = 0X91.5;  //error
       System.out.println(x);
       
       double d1 = 15e-3;
       System.out.println(d1);
       
       double d2 = 15e3;
       System.out.println(d2);
       
       //double a = 0791; //error  [9 out of range]

       double b = 0791.0;
       
       double c = 0777;
       
       double d = 0Xdead;
       
      // double e = 0Xdead.0;   //error [floating point liyteral to hexadecimal]
              
	}

}
