package notifications;

/**
 * Notification System demo.
 *
 * Uses the factory to obtain each channel and sends the same message through
 * every one of them, regardless of the concrete implementation.
 */
public class Main {

    public static void main(String[] args) {

        Notification email =
                NotificationFactory.create("email");

        Notification sms =
                NotificationFactory.create("sms");

        Notification push =
                NotificationFactory.create("push");

        email.send("Hello!");
        sms.send("Hello!");
        push.send("Hello!");
    }
}