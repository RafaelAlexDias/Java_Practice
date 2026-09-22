// A class é um blueprint. Um object é uma instância dessa class.

public static class Car {

    String brand;
    String model;
    int year;

}

public static void main() {
    Car car = new Car();
    car.brand = "Toyota";
    car.model = "Corolla";
    car.year = 2022;

    Car2 car2 = new Car2("Toyota", "Corolla", 2022);
}


// Podemos também ter construtores

public static class Car2 {

    String brand;
    String model;
    int year;

    public Car2(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

