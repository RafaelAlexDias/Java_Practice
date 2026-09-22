// Constructors let you set initial values when creating an object.

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