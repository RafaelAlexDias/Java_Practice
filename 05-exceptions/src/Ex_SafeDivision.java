/**
 * Exercise: Safe Division
 *
 * Perform a division inside try/catch/finally. If you divide by zero,
 * catch the ArithmeticException; use finally to always print a closing message.
 */
public class Ex_SafeDivision {

    public static void main(String[] args) {
        int a = 10;
        int b = 2; // try changing it to 0 to see the catch block run

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Division attempt finished!");
        }
    }
}