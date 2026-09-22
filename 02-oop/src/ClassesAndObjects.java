/**
 * Classes and Objects
 *
 * What: a class is a blueprint; an object is an instance created from that blueprint
 *      (with the `new` keyword).
 * Why: classes group state (fields) and behaviour (methods) into one structure.
 * When: any time you model something that has data and behaviour together.
 */
public class ClassesAndObjects {

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Corolla";
        car.year = 2022;

        System.out.println(car.brand + " " + car.model + " (" + car.year + ")");
    }
}

class Car {

    String brand;
    String model;
    int year;
}