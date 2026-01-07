package sunday_day_02__Objects_and_its_Methods;

public class GetClassDemo3 
{
	public static void main(String[] args) 
	{
		Double d = 90.67;
		Class cls = d.getClass();
		System.out.println(cls);      //class keyword + Fully Qualified Name

		System.out.println("..............................");
		
		Boolean b = false;
		Class cls1 = b.getClass();
		String name = cls1.getName();
		System.out.println(name);        //FQN
		
	}

}
