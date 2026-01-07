package day_63_lambda_expression_MCQ;

import java.util.function.Function;

public class FunctionalInterfaceExample5 {
	
	
	public static void main(String[] args)
	  {
	    Function<String, Boolean> fun = str -> str.startsWith("A");	
			
			System.out.println(fun.apply("Ankit"));
		}

}
