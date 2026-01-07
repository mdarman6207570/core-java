package nsf_order_initialization;

class Test
{
	int x = 100;   //1
	
	{
		x =200;   //2
	}
	
	public Test()
	{
		x=300;   //3
	}
}


public class NSF_Initialization_Order {

	public static void main(String[] args) {
	  Test t1 = new Test();
	  System.out.println(t1.x);
	}

}
