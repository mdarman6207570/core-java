package day_59_equals__method_and_MCQs;

class NIT
{
	int name;
	
	NIT(int name)
		{	
			this.name = name;
		}
}

public class OopsTest 
{
	public static void main(String[] args) 
	{	NIT f1 = new NIT(10);
		NIT f2 = new NIT(10);
		NIT f3 = f2;
		System.out.println(f1==f2);             //false
		System.out.println(f2==f3);             //true
		System.out.println(f1.name==f2.name);   //true
		System.out.println(f2.name==f3.name);   //true
		System.out.println(f1!=f3);             //true
	}
}
