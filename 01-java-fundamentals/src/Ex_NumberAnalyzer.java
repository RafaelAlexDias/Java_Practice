/**
 * Exercise: Number Analyzer
 *
 * Given an integer, implement three methods that:
 *  1. Return "Positive", "Negative" or "Zero" depending on its sign
 *  2. Return the square of the number
 *  3. Return true if the number is even, false otherwise
 */
public class Ex_NumberAnalyzer {

    public static void main(String[] args) {
        int number = 42;

        System.out.println(isPositive(number));
        System.out.println("Square: " + squareOfNumber(number));
        System.out.println(isEven(number));

        // Self-checks
        check("Positive".equals(isPositive(42)), "isPositive(42) should be \"Positive\"");
        check("Negative".equals(isPositive(-7)), "isPositive(-7) should be \"Negative\"");
        check("Zero".equals(isPositive(0)), "isPositive(0) should be \"Zero\"");
        check(squareOfNumber(42) == 1764, "squareOfNumber(42) should be 1764");
        check(squareOfNumber(-5) == 25, "squareOfNumber(-5) should be 25");
        check(isEven(42), "isEven(42) should be true");
        check(!isEven(7), "isEven(7) should be false");
        System.out.println("All checks passed!");
    }

    public static String isPositive(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static int squareOfNumber(int number) {
        return number * number;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void check(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
