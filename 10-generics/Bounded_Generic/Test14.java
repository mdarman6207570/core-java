package generics;

class MyClass<T>
{
	T obj;
	public MyClass(T obj)
	{
		this.obj = obj;
	}
	
	T getObject()
	{
		return this.obj;
	}
}

record Student(int id, String name)
{
	
}

public class Test14 
{
	public static void main(String[] args) 
	{
		Integer i = 12;
		MyClass<Integer> mi = new MyClass<>(i);
		System.out.println("Integer object stored :"+mi.getObject());
		
		Float f = 12.34f;
		MyClass<Float> mf = new MyClass<>(f);
		System.out.println("Float object stored :"+mf.getObject());
		
		
		MyClass<String> ms = new MyClass<>("Arman");
		System.out.println("String object stored :"+ms.getObject());
		
		Double d = 99.34;
		MyClass<Double> md = new MyClass<>(d);
		System.out.println("Float object stored :"+mf.getObject());
		
		MyClass<Student> std = new MyClass<>(new Student(101, "Arman"));
		System.out.println("String object stored :"+ms.getObject());
	}

}
