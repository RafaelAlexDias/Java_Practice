### 06 — Access Modifiers

* `public`
* `protected`
* Package-private
* `private`
* Visibility between classes and packages

### Questions

<details>
<summary>1. Explain the difference between `public`, `protected`, package-private
and `private`. Think especially about visibility between classes and packages.</summary>

| Modifier       | Same class | Same package | Subclasses (any package) | Anywhere |
|----------------|:----------:|:------------:|:------------------------:|:--------:|
| `public`       |     ✅      |      ✅       |            ✅             |    ✅     |
| `protected`    |     ✅      |      ✅       |            ✅             |    ❌     |
| (none)         |     ✅      |      ✅       |            ❌             |    ❌     |
| `private`      |     ✅      |      ❌       |            ❌             |    ❌     |

* **`public`** — visible everywhere.
* **`protected`** — visible in the same package AND in subclasses, even if they
  are in another package.
* **package-private** (no modifier) — visible only inside the same package.
* **`private`** — visible only inside the class itself.

Rule of thumb: start `private` and relax visibility only when you have a reason —
a class's internals should stay hidden.

</details>

---

<details>
<summary>2. Why is `private double balance;` usually better than
`public double balance;`? Tie your answer to encapsulation.</summary>

A `public` field can be read and changed by anyone, anywhere — with no control:
another class could set `balance` to a negative value or `NaN` and nothing stops
it.

Making it `private` and exposing **methods** (`deposit`, `withdraw`, `getBalance`) is
**encapsulation**: all changes go through my code, which can validate:

```java
private double balance;

public void withdraw(double amount) throws InsufficientBalanceException {
    if (amount > balance) {
        throw new InsufficientBalanceException("Insufficient balance");
    }
    balance -= amount;
}
```

Benefits: the state can never become invalid, the internal representation can
change later without breaking callers, and the object stays in control of its own
data.

</details>