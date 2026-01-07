package day_56_Overriding__MCQ;

class A20 
{
    Object getValue() 
    {
    return "Hello"; 
    }
}
class B20 extends A20 
{
    @Override
    String getValue() 
    { 
      return "World"; 
    }
}

public class GetClassDemo 
{
	public static void main(String[] args) 
    {
        A20 obj = new B20();
        System.out.println(obj.getValue());
    }
}
