package notifications;

/**
 * Factory: creates the right Notification implementation based on a type name,
 * so the client code never instantiates the concrete classes directly.
 */
public class NotificationFactory {

    public static Notification create(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SmsNotification();
        } else if (type.equalsIgnoreCase("push")) {
            return new PushNotification();
        } else {
            throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}