package Ex_Encapsulation;

/**
 * Exercise: Encapsulation
 *
 * Create a BankAccount class with private fields (accountNumber, ownerName, balance)
 * and public methods to deposit, withdraw and read the balance.
 * Invalid deposits/withdrawals must not change the balance.
 */
public class Main {
    public static void main(String[] args) {
        BankAccount account =
                new BankAccount("PT123", "Rafael", 1000);

        account.deposit(250);
        account.withdraw(100);

        System.out.println(account.getBalance());
    }
}
