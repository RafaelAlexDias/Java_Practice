package Ex_Inheritance;

/**
 * Exercise: Inheritance
 *
 * Create a base Animal class with name and age, plus eat() and sleep() methods.
 * Then create Dog (bark) and Cat (meow) classes that inherit from Animal.
 */
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Camila", 5);
        Cat cat = new Cat("Nicolau", 18);

        dog.bark();
        dog.eat();
        dog.sleep();

        cat.meow();
        cat.eat();
        cat.sleep();
    }
}