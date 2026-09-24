package OrderFacade;

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
