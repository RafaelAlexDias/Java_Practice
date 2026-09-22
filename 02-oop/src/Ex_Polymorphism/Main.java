package Ex_Polymorphism;

/**
 * Exercise: Polymorphism
 *
 * Make Dog and Cat override makeSound() from Animal, then call makeSound()
 * on every Animal through a single loop (dynamic dispatch):
 * the JVM decides which version runs based on the actual object at runtime.
 */
public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Camila", 5),
                new Cat("Nicolau", 18)
        };

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.sleep();
            System.out.println("---");
        }
    }
}