package min_max;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

record Employee2(Integer id,String name,Double salary)
{
	
}

public class MaxDemo2
{
	public static void main(String[] args) 
	{
		
		Employee2 e1 = new Employee2(111, "Aman", 23000D);
		Employee2 e2 = new Employee2(222, "Ramesh", 24000D);
		Employee2 e3 = new Employee2(333, "Suraj", 25000D);
		Employee2 e4 = new Employee2(444, "Raj", 26000D);
		Employee2 e5 = new Employee2(555, "Scott", 46000D);
		
		
		
		Stream<Employee2> streaam =Stream.of(e1,e2,e3,e4,e5);
		
		Optional<Employee2> max = streaam.max(Comparator.comparingDouble(Employee2::salary));
		
		if(max.isPresent())
		{
			System.out.println("Employee Having maxx salary is :"+max.get());
		}
		else
		{
			System.out.println("No Records Aavailable");
		}
	}
}
