### 07 — Design Patterns

Examples in `src/`:

* Singleton -> `Singleton.java`
* Factory -> `Factory/` (`Notification`, `EmailNotification`, `SmsNotification`, `NotificationFactory`)
* Facade -> `OrderFacade/` (OrderFacade coordinates Payment/Inventory/Shipping)

### Questions

<details>
<summary>1. What is the Singleton pattern for? And what is a disadvantage of using
it?
</summary>

**Purpose:** guarantees that only ONE instance of a class exists in the whole
program and gives a global point of access to it. Useful for shared resources like
a database connection, a configuration manager or a logger.

```java
public class Config {
    private static final Config INSTANCE = new Config();
    private Config() {}
    public static Config getInstance() { return INSTANCE; }
}
```

**Disadvantages:**
* It is **global state** — any code can read/write it, which makes the flow harder
  to reason about.
* **Hard to test** — you can't easily replace/add a mock instance (the constructor
  is private).
* **Hidden dependencies** — classes using the singleton are not explicit about what
  they need.
* In multi-threaded code, lazy initialization needs careful synchronization.

</details>

---

<details>
<summary>2. What is the Factory pattern for? Why is this better than directly doing
`new EmailNotification()`?

```java
Notification notification = NotificationFactory.create("email");
```
</summary>

**Purpose:** Factory centralizes the logic of "which concrete object should I
create?" in one place.

Why it is better than `new EmailNotification()` directly:
* **Decoupled** — the caller depends on the `Notification` interface, not on the
  concrete class. It doesn't even need to know `SmsNotification` exists.
* **Single place to change** — the creation logic (or the list of supported types)
  changes in one method, not everywhere in the code.
* **Easy to extend** — adding a new notification type (e.g. `PushNotification`)
  only touches the factory.
* It hides the creation details (parameters, setup) from the caller.

```java
Notification n = NotificationFactory.create("email"); // caller: stays abstract
```

</details>

---

<details>
<summary>3. What is a Façade for? Explain using the example:
`OrderFacade` → PaymentService, InventoryService, ShippingService.
</summary>

**Purpose:** a Façade gives a single, simple method that internally coordinates
several subsystems — hiding all their complexity from the caller.

Without it, placing an order means the caller must know three services and the
right order of calls:

```java
new PaymentService().pay(...);
new InventoryService().reserve(...);
new ShippingService().ship(...);
```

With the Façade, the caller only does one thing:

```java
new OrderFacade().placeOrder(order);   // internally calls the three services
```

Benefits: the caller is decoupled from the subsystems, the workflow lives in one
place, and the subsystems can change without breaking callers.

</details>