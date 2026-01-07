package day_53_InstanceOfOperator___Override_Main_Method;
class Test
{
	
}

public class InstanceOfDemo1 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		
		if(t1 instanceof Test)
		{
			System.out.println("t1 is Pointing to Test Object");
		}
	}

}
