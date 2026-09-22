package Ex_Interfaces;

/**
 * Exercise: Interfaces
 *
 * Define an Animal interface with makeSound() and have Dog, Cat and Bird
 * implement it. Then iterate the array using the interface type and call
 * makeSound() on each element.
 *
 * Difference vs abstract class: an interface only declares WHAT a class
 * must do (a contract), a class can implement several interfaces, and
 * default methods can provide a concrete body.
 */
public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Camila", 5),
                new Cat("Nicolau", 18),
                new Bird("TLC", 1)
        };

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            System.out.println("---");
        }
    }
}