package day_32.mcq;

class Example4 {
	static int a=10;
	static int b=20;
	int x=30;
	int y=40;
	
	
	@Override
	public String toString() {
		return "Example4 [x=" + x + ", y=" + y + "]";
	}


	public static void main(String[] args)
	{
	Example4 e1=new Example4();
	Example4 e2=new Example4();
	Example4 e3=null;
	e1.a=50;
	e1.b=60;
	e1.x=70;
	e1.y=80;
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	
	}
}
