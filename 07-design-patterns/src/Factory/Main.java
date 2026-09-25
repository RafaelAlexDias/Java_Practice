package Factory;

/**
 * Factory pattern (usage example)
 *
 * It encapsulates object creation and allows the client to create objects
 * without knowing the exact concrete class being instantiated.
 */
public class Main {

    public static void main(String[] args) {

        Notification notification =
                NotificationFactory.create("email");

        notification.send("Hello!");
    }
}