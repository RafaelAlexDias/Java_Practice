# 03 — Notification System

Practical project applying the **Factory** design pattern to notification channels.

## Features

- Single interface `Notification` implemented by `EmailNotification`, `SmsNotification` and `PushNotification`
- Factory `NotificationFactory.create(type)` decides which channel to instantiate
- Client code depends only on the interface (program to an interface, not an implementation)

## File map

| File | Role |
|---|---|
| `src/Notification.java` | Interface (contract) |
| `src/EmailNotification.java` | Concrete email channel |
| `src/SmsNotification.java` | Concrete SMS channel |
| `src/PushNotification.java` | Concrete push channel |
| `src/NotificationFactory.java` | Factory creating the right implementation |
| `src/Main.java` | Demo using the factory |
