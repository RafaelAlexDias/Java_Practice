package exceptions;

/**
 * Checked exception: thrown when trying to return a book that is already available.
 */
public class BookAlreadyAvailableException extends Exception {

    public BookAlreadyAvailableException(String message) {
        super(message);
    }
}