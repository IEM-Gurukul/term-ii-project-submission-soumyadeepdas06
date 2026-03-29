import java.util.HashMap;

public class Bank {
    private HashMap<Integer, Customer> customers = new HashMap<>();
    private int nextAccNo = 1001;

    public void createAccount(String name, String type) {
        Account acc;

        if (type.equalsIgnoreCase("savings")) {
            acc = new SavingsAccount(nextAccNo, name);
        } else {
            acc = new CurrentAccount(nextAccNo, name);
        }

        customers.put(nextAccNo, new Customer(acc));
        System.out.println("Account Created: " + nextAccNo);
        nextAccNo++;
    }

    private Customer getCustomer(int accNo) {
        if (!customers.containsKey(accNo)) {
            throw new BankException("Account not found!");
        }
        return customers.get(accNo);
    }

    public void deposit(int accNo, double amt) {
        Customer c = getCustomer(accNo);
        c.getAccount().deposit(amt);
        c.addTransaction("Deposit", amt);
    }

    public void withdraw(int accNo, double amt) {
        Customer c = getCustomer(accNo);
        c.getAccount().withdraw(amt);
        c.addTransaction("Withdraw", amt);
    }

    public void transfer(int from, int to, double amt) {
        withdraw(from, amt);
        deposit(to, amt);
    }

    public void checkBalance(int accNo) {
        System.out.println("Balance: " + getCustomer(accNo).getAccount().getBalance());
    }

    public void showTransactions(int accNo) {
        getCustomer(accNo).showTransactions();
    }
}