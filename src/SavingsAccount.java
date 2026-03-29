public class SavingsAccount extends Account {

    public SavingsAccount(int accNo, String name) {
        super(accNo, name);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new BankException("Insufficient Balance!");
        }
        balance -= amount;
    }
}