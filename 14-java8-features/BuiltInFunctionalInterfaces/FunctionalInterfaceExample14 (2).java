package day_63_lambda_expression_MCQ;

@FunctionalInterface
interface NIT14
{
	int cal(int value);
}

public class FunctionalInterfaceExample14 
{
	public static void main(String[] args) {
		NIT14 nit = (int value) -> value+25;		
		System.out.println("Result: "+nit.cal(20));
	}
}
