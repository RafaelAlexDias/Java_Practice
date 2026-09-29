package exceptions;

public class BookAlreadyAvailableException extends Exception {

    public BookAlreadyAvailableException(String message) {
        super(message);
    }
}
