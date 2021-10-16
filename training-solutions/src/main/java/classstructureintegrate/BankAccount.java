package classstructureintegrate;

public class BankAccount {
    private String account;
    private String owner;
    private int balance;

    public BankAccount(String account, String owner, int balance) {
        this.account = account;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }

    public String getInfo() {
        return owner + " (" + account + "): " + balance + " Ft";
    }
}
