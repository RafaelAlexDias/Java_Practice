package Ex_Interfaces;

public class Dog implements Animal {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}