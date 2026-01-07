package mcq;

public class Test78 {
	public static void main(String[] args) {
		new Test78().go();
	}

	public void go() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("foo");
			}
		};
		Thread t = new Thread(r);
		t.start();
		t.run();
	}
}