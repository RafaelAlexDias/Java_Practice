package Ex_Interfaces;

// An interface is a contract: it declares WHAT a class must do, not HOW.
public interface Animal {

    // Implicitly public abstract
    void makeSound();

    // Default methods (Java 8+) CAN have a body
    default void eat() {
        System.out.println("nom nom");
    }
}