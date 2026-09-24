package Ex_BankAccount;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // `throws` declares that this method can propagate a checked exception
    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            // `throw` actually throws it
            throw new InsufficientBalanceException(
                    "Insufficient balance. Current balance: " + balance
            );
        }

        balance -= amount;

        System.out.println(
                "Withdrawal successful. New balance: " + balance
        );
    }
}