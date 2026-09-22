// Encapsulation: keep fields private and expose them through methods.

public class Encapsulation {

    public static void main(String[] args) {
        EncapsulatedCar car = new EncapsulatedCar("Toyota", 2022);

        System.out.println(car.getBrand() + " (" + car.getYear() + ")");
    }
}

class EncapsulatedCar {

    private String brand;
    private int year;

    public EncapsulatedCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}