public class Operators {

    // Arithmetic
    int a = 10;
    int b = 3;
    int sum = a + b;           // 13
    int difference = a - b;    // 7
    int product = a * b;       // 30
    int quotient = a / b;      // 3 (integer division truncates the decimal part)
    int remainder = a % b;     // 1

    // Comparison (all evaluate to boolean)
    boolean isEqual = a == b;          // false
    boolean isNotEqual = a != b;       // true
    boolean isGreater = a > b;         // true
    boolean isLess = a < b;            // false
    boolean isGreaterOrEqual = a >= b; // true
    boolean isLessOrEqual = a <= b;    // false

    // Logical
    boolean and = a > 5 && b > 1;   // true  (both sides must be true)
    boolean or = a > 5 || b > 10;   // true  (at least one side must be true)
    boolean not = !(a == b);        // true

    // Assignment (compound), ternary -> need a block to run statements, so move to main
    public static void main(String[] args) {
        int counter = 10;
        counter += 5;   // same as counter = counter + 5 (15)
        counter -= 3;   // counter = counter - 3 (12)
        counter++;      // counter = counter + 1 (13)
        counter--;      // counter = counter - 1 (12)

        // Ternary (shortcut for simple if/else)
        int a = 10;
        int b = 3;
        String message = (a > b) ? "a is bigger" : "b is bigger";
        System.out.println(message);
    }
}
