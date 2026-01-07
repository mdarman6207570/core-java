package blank_final_field;

class Test
{
	final int A;
	{
		printValue();
		A=100;
	}
	
	public void printValue() 
	{
		System.out.println("Default value :"+this.A);
	}
}

public class BlankFinalFieldDemo4 {

	public static void main(String[] args) 
	{
      Test t1 = new Test();
      System.out.println("User Value :"+t1.A);

	}

}
