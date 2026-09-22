package Ex_Interfaces;

public class Cat implements Animal {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}