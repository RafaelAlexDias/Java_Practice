package Factory;

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
