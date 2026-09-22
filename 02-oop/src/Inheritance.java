/**
 * Inheritance
 *
 * What: a class (subclass) reuses and extends the fields and methods of another
 *      class (superclass) with the `extends` keyword.
 * Why: share common behaviour and avoid duplication.
 * When: you have an "is-a" relationship (Dog IS an Animal) and several classes
 *      share code — prefer composition when the relationship is "has-a".
 */
public class Inheritance {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        dog.eat();
        dog.bark();
    }
}

class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating...");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name); // calls the superclass constructor
    }

    public void bark() {
        System.out.println("Woof!");
    }
}
