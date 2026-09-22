/**
 * Constructors and `this`
 *
 * What: a constructor is a special method with the same name as the class,
 *      called when you create an object with `new`.
 * Why: it lets you set the initial state of an object in one go, instead of
 *      assigning every field manually afterwards.
 * When: you want objects to always start with valid/complete data.
 *
 * Note: package-private helper classes (Car...) live in this file for brevity.
 */
public class Constructors {

    public static void main(String[] args) {
        CarWithConstructor car = new CarWithConstructor("Toyota", "Corolla", 2022);

        System.out.println(car.brand + " " + car.model + " (" + car.year + ")");
    }
}

class CarWithConstructor {

    String brand;
    String model;
    int year;

    public CarWithConstructor(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

/*
    this.brand -> field
    brand      -> parameter
 */