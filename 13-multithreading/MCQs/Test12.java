package mcq;

public class Test12 extends Thread {
	static String name = "ravi";

	public static void main(String args[]) {
		Test12 t = new Test12();
		t.Test12(name);
		System.out.print(" " + name);
	}

	public void Test12(String name) {
		start();
		System.out.print(" method");
	}

	public void run() {
		System.out.print(" run");
	}
}