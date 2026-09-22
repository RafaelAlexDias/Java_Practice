package Ex_Composition;

/**
 * Exercise: Composition
 *
 * Create an Engine class (with a type and a start() method).
 * A Car should HOLD an Engine (has-a relationship): the Car is built
 * with an Engine and delegates startCar() to its engine.
 */
public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car(engine);

        car.startCar();
    }
}
