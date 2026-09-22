/**
 * Methods
 *
 * What: a method is a reusable block of code:
 *      (modifiers) returnType name(parameters) { body }
 * Why: avoid repeating code, split logic into named units, easier to test.
 * When: any logic you call more than once or want to give a clear name to.
 *
 * Note: reference file — no main(), so it is not runnable on its own.
 */
public class Methods {

    public int add(int a, int b) {
        return a + b;
    }

    // void means the method returns nothing
    public void printName(String name) {
        System.out.println(name);
    }

    // Overload: same name, different parameter list
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Static methods belong to the class, not to an instance
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}