package Factory;

/** SmsNotification: a concrete Notification created by NotificationFactory. */
public class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}