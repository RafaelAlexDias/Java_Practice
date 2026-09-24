/*
* A Design Pattern is a reusable solution for a design problem which appears frequently.
 */

public class Singleton {

    /*
    * It ensures that a class has only one instance and provides a global access point to that instance.
     */

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}