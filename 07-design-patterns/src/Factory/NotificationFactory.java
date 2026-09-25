package Factory;

/**
 * Factory pattern.
 *
 * What: centralizes object creation — the caller asks for a "type" and gets a
 * Notification without knowing the concrete class.
 * Why: decouples the client from the implementations and keeps all creation
 * logic (and the supported types) in one place.
 */
public class NotificationFactory {

    public static Notification create(String type) {

        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }

        if (type.equalsIgnoreCase("sms")) {
            return new SmsNotification();
        }

        throw new IllegalArgumentException(
                "Unknown notification type"
        );
    }
}