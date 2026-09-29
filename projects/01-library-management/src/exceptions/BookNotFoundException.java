package exceptions;

/**
 * Checked exception: thrown when a requested book does not exist in the library.
 */
public class BookNotFoundException extends Exception {

    public BookNotFoundException(String message) {
        super(message);
    }
}