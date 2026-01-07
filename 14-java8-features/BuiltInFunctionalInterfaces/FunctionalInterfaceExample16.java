package day_63_lambda_expression_MCQ;

@FunctionalInterface
interface NIT16
{
	String nit(String name);
}

public class FunctionalInterfaceExample16 
{
	public static void main(String[] args) {
		NIT16 nit = (String name) -> "Welcome to ";
		System.out.println(nit.nit("NARESHIT"));		
	}
}
