package Ex_Polymorphism;

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

        dog.makeSound();
        dog.eat();
        dog.sleep();

        System.out.println("---");

        cat.makeSound();
        cat.eat();
        cat.sleep();
    }
}