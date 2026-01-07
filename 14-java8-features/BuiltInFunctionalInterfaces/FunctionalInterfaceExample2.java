package day_63_lambda_expression_MCQ;

interface Runnable
{
   void run();
}

public class FunctionalInterfaceExample2
{
	public static void main(String[] args) {
		Runnable nit = () -> System.out.println("Thread Started");
		nit.run();
	}
}