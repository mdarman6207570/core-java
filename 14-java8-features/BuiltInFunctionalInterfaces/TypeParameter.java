package typeparameter;

class Box<T>
{
	private T data;
	
	public Box(T data)
	{
		this.data = data;
	}
	
	public T getData()
	{
		return data;
	}
}

public class TypeParameter 
{
	public static void main(String[] args) 
	{	
		Box<Integer> intType = new Box<>(10);
		System.out.println("Integer value is :"+intType.getData());
		
		Box<Double> doubleType = new Box<>(10D);
		System.out.println("Double value is :"+doubleType.getData());
		
		Box<Character> charType = new Box<>('A');
		System.out.println("Character value is :"+charType.getData());
		
		Box<Employee>empType = new Box<>(new Employee(1,"Scott",15768D));
		System.out.println("Employee type is :"+empType.getData());
	}
}

record Employee(Integer id,String name,Double salary)
{
	
}
