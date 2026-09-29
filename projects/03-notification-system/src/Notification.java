package notifications;

/**
 * Contract for any notification channel: a message can be sent.
 * The concrete implementation decides how (email, sms, push).
 */
public interface Notification {

    void send(String message);
}