package exceptions;

/**
 * Checked exception: thrown when a requested account does not exist in the bank.
 */
public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}