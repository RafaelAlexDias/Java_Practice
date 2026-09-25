package OrderFacade;

/**
 * Facade pattern.
 *
 * What: one simple method (placeOrder) that coordinates several subsystems
 * (Payment, Inventory, Shipping) behind a single entry point.
 * Why: hides the complexity and the order of the steps from the caller.
 * When: you want a simple API over a multi-step workflow.
 */
public class OrderFacade {

    private PaymentService paymentService;
    private InventoryService inventoryService;
    private ShippingService shippingService;

    public OrderFacade() {
        this.paymentService = new PaymentService();
        this.inventoryService = new InventoryService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder() {

        paymentService.processPayment();
        inventoryService.reserveProduct();
        shippingService.createShipment();
    }
}