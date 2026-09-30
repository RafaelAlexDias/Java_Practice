package exceptions;

/**
 * Checked exception: thrown when an operation uses an invalid (non-positive) amount.
 */
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}