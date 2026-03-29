public class CurrentAccount extends Account {

    private double overdraft = 1000;

    public CurrentAccount(int accNo, String name) {
        super(accNo, name);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraft) {
            throw new BankException("Overdraft limit exceeded!");
        }
        balance -= amount;
    }
}