package interface_member;

interface Sayable
{
   void say();
   String toString();     //User has written explicitly otherwise will automatically add 
}

class Say implements Sayable
{

	@Override
	public void say() 
	{
		System.out.println("Say method implemented!!!");
	}
	
	@Override
	public String toString()
	{
          return "say []";
	}	
}

public class InterfaceMemberDemo1
{
	public static void main(String[] args) 
	{
		Sayable s = new Say();
		String data = s.toString();
		System.out.println(data);
		s.hashCode();
		s.equals(null);
	}

}
