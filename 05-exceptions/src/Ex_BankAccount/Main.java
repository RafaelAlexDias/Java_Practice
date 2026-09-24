package Ex_BankAccount;

/**
 * Exercise: Custom (checked) exception
 *
 * When the withdrawal exceeds the balance, BankAccount throws a custom
 * InsufficientBalanceException. Because it extends Exception (checked),
 * the caller MUST catch it or declare it.
 */
public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);

        try {
            account.withdraw(50);  // OK
            account.withdraw(100); // too much -> throws InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}