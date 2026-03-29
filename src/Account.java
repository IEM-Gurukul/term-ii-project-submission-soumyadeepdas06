public abstract class Account {
    protected int accNo;
    protected String name;
    protected double balance;

    public Account(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
        this.balance = 0;
    }

    public int getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);
}