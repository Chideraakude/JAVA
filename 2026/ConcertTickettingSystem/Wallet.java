public class Wallet {
    private double balance;

    public Wallet() {
        balance = 0.0;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public boolean deductMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
