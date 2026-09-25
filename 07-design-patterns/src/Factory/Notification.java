package Factory;

/**
 * The contract every notification must implement.
 *
 * Why: the factory returns this type, so the caller stays decoupled from the
 * concrete classes (EmailNotification, SmsNotification, ...).
 */
public interface Notification {

    void send(String message);
}