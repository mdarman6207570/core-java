package interface_member;

interface Member
{
	int DATA = 100;    //public + static + final
	
	void m1();  //public abstract [JDK 1.0 Onwards]
	
	default void m2()   //public [JDK 1.8 onwards]
	{
		m5();   //private NSM
		m6();   //private SM 
	}
	
	static void m4()    //public
	{
		m6();
	}
	
	private void m5()     //Private non static method [Java 9v]
	{
		System.out.println("Private non static method of interface!!!");
	}
	
	private static void m6()       //Private static method  [Java 9v]
	{
		System.out.println("Private static method of interface");   
	}
}

class Implementer implements Member
{

	@Override
	public void m1() 
	{
		System.out.println("Abstract method is overridden!!!");
	}
	
}

public class InterfaceMember 
{
	public static void main(String[] args) 
	{
		Member m = new Implementer();
		m.m1();
		System.out.println("..................");
		m.m2();
		System.out.println("...................");
		Member.m4();
	}

}
