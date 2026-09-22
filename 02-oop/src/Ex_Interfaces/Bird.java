package Ex_Interfaces;

public class Bird implements Animal {

    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet");
    }
}