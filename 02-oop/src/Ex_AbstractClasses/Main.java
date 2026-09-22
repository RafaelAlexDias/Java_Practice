package Ex_AbstractClasses;

/**
 * Exercise: Abstract Classes
 *
 * Make Animal abstract with an abstract makeSound() method.
 * Dog, Cat and Bird must provide their own implementation.
 * The variable type is Animal (abstract), the object is the concrete subclass.
 */
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Camila", 5);
        Animal cat = new Cat("Nicolau", 18);
        Animal bird = new Bird("TLC", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
