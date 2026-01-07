package mcq;

class Test3 extends Thread
{
	int a;
	public void run() {
		a++;
	}
}
public class MultiThread3
{
	public static void main(String[] args) {
		Test3 test = new Test3();
		test.run();
		System.out.println(test.a);
		test.start();
		System.out.println(test.a);
		System.out.println(test.isAlive());
		System.out.println(test.getName());		
	}
}