package static_nested_class;

interface Sayable
{
	void say();
}

public class AnnonymousDemo1 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class for instant implementation
		
		Sayable greet = new Sayable()
		{

			@Override
			public void say() 
			{
			    System.out.println("Hello from annonymous inner class!");
			}
		};
		
		greet.say();
	}

}
