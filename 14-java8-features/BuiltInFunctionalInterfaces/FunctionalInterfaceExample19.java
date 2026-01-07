package day_63_lambda_expression_MCQ;

@FunctionalInterface
interface NIT19
{
	String nit(String name);
}
public class FunctionalInterfaceExample19 implements NIT19
{
	public static void main(String[] args) {
		FunctionalInterfaceExample19 nit = new FunctionalInterfaceExample19();
		System.out.println(nit.nit("Welcome to "));
	}	
	@Override
	public String nit(String name) {
		return name+"NARESHIT";
	}
}
