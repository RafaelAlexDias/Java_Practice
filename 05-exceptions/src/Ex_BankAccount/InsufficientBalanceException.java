package Ex_BankAccount;

/**
 * Custom checked exception.
 *
 * Extending Exception (instead of RuntimeException) makes this a CHECKED
 * exception: the compiler forces callers to catch it or declare it with throws.
 */
public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}