package Factory;

/** EmailNotification: a concrete Notification created by NotificationFactory. */
public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}