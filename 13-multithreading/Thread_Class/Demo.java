package day_78__Thread__Methods___Join;


class Join2 extends Thread
{
    public void run() 
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Thread started");

        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("👉 " + name + " is RUNNING, printing " + i);
            
            try {
                System.out.println("😴 " + name + " is going to sleep for 1 second...");
                Thread.sleep(1000); // this thread pauses here
            } 
            catch (InterruptedException e) {
                System.out.println(name + " was interrupted!");
            }

            System.out.println("🔔 " + name + " woke up after sleep!");
        }

        System.out.println("✅ " + name + " thread completed!!!");
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        Join2 j1 = new Join2();
        Join2 j2 = new Join2();
        Join2 j3 = new Join2();

        j1.setName("J1");
        j2.setName("J2");
        j3.setName("J3");

        // Start all 3 threads together
        j1.start();
        j2.start();
        j3.start();

        System.out.println("🏁 Main thread finished starting all threads!");
    }
}
