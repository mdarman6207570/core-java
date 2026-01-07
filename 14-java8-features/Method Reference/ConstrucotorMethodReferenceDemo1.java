package constructor_method_reference;

import java.util.function.Supplier;

class Sample
{
	public Sample()
	{
		System.out.println("No Argument constructor of Sample class");
	}
	
	public void greet()
	{
		System.out.println("Hello Everyone");
	}
}

public class ConstrucotorMethodReferenceDemo1 
{
	public static void main(String[] args) 
	{
		Supplier<Sample> sample = Sample::new;
		Sample obj = sample.get();
		obj.greet();
	}
}
