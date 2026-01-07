package method_reference;

interface Worker
{
	void work();
}

public class MethodReference1 
{
	public static void main(String[] args) 
	{
		//Lambda Approach
		Worker w1 = ()-> System.out.println("Worker is Working");
		w1.work();
		
		//Method Reference 
		Worker w2 = new Employee()::work;
		w2.work();
	}

}

class Employee
{
	public void work()
	
	{
		System.out.println("Employee is Working");
	}
}
