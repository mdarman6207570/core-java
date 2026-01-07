package day_63_lambda_expression_MCQ;

interface NIT18
{
	String nit(String name);
}

public class FunctionalInterface18 
{
	public static void main(String[] args) {
		NIT18 nit = (String name) -> "Welcome to " + name;
		System.out.println(nit.nit("NARESHIT"));		
	}
}
