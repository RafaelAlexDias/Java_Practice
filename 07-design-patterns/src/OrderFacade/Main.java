package OrderFacade;

/**
 * Facade pattern (usage example)
 *
 * It provides a simple interface to a more complex subsystem,
 * hiding its internal complexity from the client.
 */
public class Main {

    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder();
    }
}