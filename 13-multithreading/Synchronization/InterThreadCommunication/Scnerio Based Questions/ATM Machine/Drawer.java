package blc;

public class Drawer extends Thread {
    private Account account;

    public Drawer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        int[] withdrawals = {100, 2000, 5000};
        for (int amount : withdrawals) {
            account.withdraw(amount);
            try {
                Thread.sleep(1000); // 1 second delay between withdrawals
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
