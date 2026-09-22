public class Methods {

    // A method is a reusable block of code: (modifiers) returnType name(params) { ... }
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
