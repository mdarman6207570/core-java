package mcq;

public class Test9 {
	public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        });

        t.start();
        t.run();
    }
}
