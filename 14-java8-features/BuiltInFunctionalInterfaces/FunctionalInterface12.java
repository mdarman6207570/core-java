package day_63_lambda_expression_MCQ;

import java.util.function.Supplier;

record Student(Integer id, String name, String gender, Integer age)
{ 
    
}
		
public class FunctionalInterface12
{
	public static void main(String[] args) 
	{
      Supplier<Student> stdSupplier = () -> new Student(1, "Virat", "Male", 24);
		
        Student std =  stdSupplier.get();
        System.out.println(std);       
	}
}

