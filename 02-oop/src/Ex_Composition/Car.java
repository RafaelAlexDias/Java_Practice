package Ex_Composition;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Starting car...");
        this.engine.start();
    }
}
