package method_reference;

@FunctionalInterface
interface Worker2
{
	void work();
}

public class MethodReference2
{
	public static void main(String[] args) 
	{
		//Lambda Approach
		Worker2 w1 = ()-> System.out.println("Worker is Working");
		w1.work();
		
		//Method Reference 
		Worker2 w2 =  Employee2::salary;
		w2.work();
	}

}

class Employee2
{
	public static void salary()
	
	{
		System.out.println("Employee is Working for Salary");
	}
}
