package day_63_lambda_expression_MCQ;

@FunctionalInterface
interface NIT20
{
	String nit(String name);
}
public class FunctionalInterfaceExample20
{
	public static void main(String[] args) 
	{
		NIT20 nit = (String name) -> 
		{
			return name;
		};
		
		NIT20 nit1 = (String name) -> name;
		
		System.out.println(nit.nit("Welcome to ")+nit1.nit("NARESHIT"));
	}
}

