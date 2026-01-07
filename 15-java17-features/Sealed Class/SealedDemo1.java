package sealed_class;

sealed class Bird permits Parrot, Sparrow
{
	
	public void fly() 
	{
		System.out.println("Generic Bird is flying");
	}
}

non-sealed class Parrot extends Bird
{
	@Override
	public void fly() 
	{
		System.out.println("Parrot Bird is flying");
	}
}

final class Sparrow extends Bird
{
	@Override
	public void fly() 
	{
		System.out.println("sparrow Bird is flying");
	}
}

public class SealedDemo1 
{
	public static void main(String[] args) 
	{
		Bird b = null;
		
		b = new Parrot();
		b.fly();
		
		b = new Sparrow();
		b.fly();
	}

}
