package interface_member;

interface Printable
{
	void print();
	String toString();
	int hashCode();
	boolean equals(Object obj);
	
}

class Print implements Printable
{

	@Override
	public void print() 
	{
		System.out.println("Printing");
	}
}	

public class InterfaceMemberDemo2 
{
	public static void main(String[] args) 
	{
		Printable p = new Print();
		p.print();
		System.out.println(p.hashCode());
		System.out.println(p.toString());
	}

}
