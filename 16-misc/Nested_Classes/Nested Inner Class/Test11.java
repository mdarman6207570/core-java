package static_nested_class;

class BigOuter
{
	static class Nest
	{
		public void go()
		{
			System.out.println("Hello Welcome to static nested class");
		}
	}
}


public class Test11 {

	public static void main(String[] args) 
	{
	    BigOuter.Nest in = new BigOuter.Nest();
	    in.go();
	}

}
