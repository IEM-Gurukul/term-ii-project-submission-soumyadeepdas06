import java.util.ArrayList;

public class Customer {
    private Account account;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Customer(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void addTransaction(String type, double amt) {
        transactions.add(new Transaction(type, amt));
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}