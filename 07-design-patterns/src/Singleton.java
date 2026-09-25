/**
 * Singleton (Design Pattern)
 *
 * What: a class that guarantees only ONE instance exists, with a global access point.
 * Why: share a single expensive/resource-bound object (DB connection, config, logger).
 * When: the program genuinely needs one shared instance.
 *
 * Note: this lazy initialization is NOT thread-safe (two threads can both create an
 * instance). For thread safety, use an eager static final field or synchronized.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}