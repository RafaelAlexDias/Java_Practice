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
}