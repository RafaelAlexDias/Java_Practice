/**
 * Encapsulation
 *
 * What: keep fields private and expose them through public methods.
 * Why: protects internal state — nobody can put invalid data directly in a field.
 * When: whenever you want to control how data is read and changed (getters/setters).
 */
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