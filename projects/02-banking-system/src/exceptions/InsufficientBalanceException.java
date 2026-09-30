package exceptions;

/**
 * Checked exception: thrown when the balance is not enough to withdraw.
 */
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}