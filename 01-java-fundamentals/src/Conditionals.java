/**
 * Conditionals
 *
 * What: if/else runs code only when a condition is true; switch picks one branch
 *      based on a value.
 * Why: programs need to make decisions at runtime.
 * When: if/else for ranges (age >= 18), switch for exact matches (day == 1).
 */
public class Conditionals {

    public static void main(String[] args) {
        int age = 22;

        if (age >= 18) {
            System.out.println("Adult!");
        } else {
            System.out.println("Minor!");
        }

        int day = 1;

        // Classic switch: each branch needs break, otherwise execution "falls through"
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Unknown");
        }

        // Enhanced switch (Java 14+): arrow syntax, no break required.
        // It can also be used as an expression that returns a value.
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Unknown";
        };
        System.out.println("dayName = " + dayName);
    }
}