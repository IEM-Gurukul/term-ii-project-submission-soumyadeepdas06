import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n1.Create 2.Deposit 3.Withdraw 4.Balance 5.Transfer 6.History 7.Exit");
            int ch = sc.nextInt();

            try {
                switch (ch) {
                    case 1:
                        System.out.print("Name: ");
                        String name = sc.next();
                        System.out.print("Type(savings/current): ");
                        String type = sc.next();
                        bank.createAccount(name, type);
                        break;

                    case 2:
                        System.out.print("AccNo: ");
                        bank.deposit(sc.nextInt(), sc.nextDouble());
			System.out.println("Ammount deposited");
                        break;

                    case 3:
                        System.out.print("AccNo: ");
                        bank.withdraw(sc.nextInt(), sc.nextDouble());
			System.out.println("Ammount debited");
                        break;

                    case 4:
			System.out.print("AccNo: ");
                        bank.checkBalance(sc.nextInt());
                        break;

                    case 5:
			System.out.println("Enter the account number from which money should be debited, then give the account number to which the money will me credited and finally give the ammount");
                        int from = sc.nextInt();
                        int to = sc.nextInt();
                        double amt = sc.nextDouble();
                        bank.transfer(from, to, amt);
                        break;

                    case 6:
			System.out.print("AccNo: ");
                        bank.showTransactions(sc.nextInt());
                        break;

                    case 7:
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}