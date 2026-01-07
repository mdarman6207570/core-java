package day_61_Functional_Programming_Lambda_Expression;

@FunctionalInterface
interface Length
{
	int getLength(String str);
}

public class LambdaDemo3
{
	public static void main(String[] args) 
	{
		Length length = str -> str.length();
		
		System.out.println("Length is :"+length.getLength("India"));
		System.out.println("Length is :"+length.getLength("Hyderabad"));
		
	}
}
