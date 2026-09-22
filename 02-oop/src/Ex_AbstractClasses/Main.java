package Ex_AbstractClasses;

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
