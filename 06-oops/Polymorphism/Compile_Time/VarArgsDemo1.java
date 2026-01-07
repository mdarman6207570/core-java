package day_47_Overloading___Var_args;

class Test
{
	public void input(int ...x) 
	{
		System.out.println("Extecuted");
	}
}

public class VarArgsDemo1 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.input();
		t1.input(10);
		t1.input(10,20);
		t1.input(10,20,30);
	}

}
