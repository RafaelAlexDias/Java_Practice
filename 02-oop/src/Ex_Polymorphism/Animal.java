package Ex_Polymorphism;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("nom nom");
    }

    public void sleep() {
        System.out.println("zzz");
    }

    public void makeSound() {
        System.out.println("Make sound");
    }
}
