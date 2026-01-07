package blc;

public class Depositor extends Thread {
    private Account account;

    public Depositor(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        int[] deposits = {1000, 20000, 50000};
        for (int amount : deposits) {
            account.deposit(amount);
            try {
                Thread.sleep(1000); // 1 second delay between deposits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
