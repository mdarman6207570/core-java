package sunday_day_05_Inner_Classes;

class Foo
{
	
}

public class TypesOfNestedClasses 
{
	static class A      //static nested class
	{
			
	}
	
	public class B        //inner class
	{
		
	}

	public void methodLevel()
	{
	
		final class C     //Local OR Method local inner class
		{
				
		}
	}
		
	public static void main(String[] args) 
	{
		Foo f1 = new Foo()
		{
			
		};
	}

}
