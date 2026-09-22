// Inheritance: a class can reuse and extend the fields and methods of another class.

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
