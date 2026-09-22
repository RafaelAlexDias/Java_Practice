// A class is a blueprint. An object is an instance of that class.

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