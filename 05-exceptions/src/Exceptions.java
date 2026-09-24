/**
 * Exception handling overview: try/catch/finally, throw/throws, checked vs unchecked
 *
 * What: exceptions are events that interrupt the normal flow of a program.
 * Why: they let you separate error handling from the normal code path.
 * When: catch the exceptions you can recover from; rethrow or declare the ones you can't.
 *
 * Note: try/catch and finally have runnable examples below; throw/throws and
 * checked/unchecked are explained in the comments.
 */
public class Exceptions {

    public static void main(String[] args) {

        /*
         * try / catch
         *
         * The program tries to execute the block; if an exception is thrown,
         * the matching catch block handles it.
         */
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        /*
         * finally
         *
         * Code that ALWAYS runs after try/catch, even when no exception was
         * thrown — typically used for cleanup (closing resources, etc.).
         */
        try {
            System.out.println("Trying something risky...");
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Cleanup always runs");
        }

        /*
         * throw vs throws
         *
         * throw  -> actually throws an exception:
         *           throw new IllegalArgumentException("Age cannot be negative");
         *
         * throws -> declares that the method MAY propagate a checked exception,
         *           so callers must handle it or declare it too:
         *
         *           public void readFile() throws IOException {
         *               ...
         *           }
         */

        /*
         * Checked vs Unchecked exceptions
         *
         * Checked exceptions are verified by the compiler (e.g. IOException).
         * A method that can throw one must either catch it (try/catch) or
         * declare it (throws).
         *
         * Unchecked exceptions (RuntimeException and its subclasses, e.g.
         * NullPointerException) are NOT required to be caught or declared.
         */
    }
}