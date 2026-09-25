### 05 — Exception Handling

Examples in `src/`:

* Overview (try/catch/finally, throw/throws, checked vs unchecked) -> `Exceptions.java`
* Exercise: Safe Division -> `Ex_SafeDivision.java`
* Exercise: File Reader (checked exception) -> `Ex_FileReader.java`
* Exercise: Custom exception -> `Ex_BankAccount/`

### Questions

<details>
<summary>1. Explain `try`, `catch`, `finally`, `throw` and `throws`.</summary>

* **try** — wraps the code that may throw an exception.
* **catch** — handles the exception if one is thrown; the block runs only on error.
* **finally** — code that ALWAYS runs after try/catch, whether an exception
  happened or not (typical for cleanup: closing files, connections).
* **throw** — actually throws an exception in your code:
  `throw new IllegalArgumentException("...")`.
* **throws** — declares, in the method signature, that this method may propagate
  a **checked** exception, so callers must handle or declare it too.

```java
public void read() throws IOException {          // declares
    try {
        // risky code
    } catch (IOException e) {
        throw new RuntimeException(e);            // throws
    } finally {
        // always runs
    }
}
```

</details>

---

<details>
<summary>2. What is the difference between a checked and an unchecked exception?
Give one example of each.</summary>

* **Checked** — the compiler FORCES you to either catch it (`try/catch`) or
  declare it (`throws`). You cannot ignore it.
  Example: `IOException` (e.g. reading a file that may not exist).

* **Unchecked** — extend `RuntimeException`; the compiler does NOT force you to
  catch or declare them. They usually mean a programming bug.
  Example: `NullPointerException`, `ArithmeticException` (divide by zero),
  `IllegalArgumentException`.

```java
// checked  -> must handle or declare
try {
    new FileReader("data.txt");
} catch (FileNotFoundException e) { ... }

// unchecked -> compiler does not force anything
String s = null;
s.length();   // NPE at runtime
```

</details>

---

<details>
<summary>3. What does `public void withdraw(double amount) throws
InsufficientBalanceException` mean? And how is that different from
`throw new InsufficientBalanceException(...)`?</summary>

That method signature **declares** (`throws`) that `withdraw` *may* propagate an
`InsufficientBalanceException` — a checked exception. It is a promise to callers:
"this can fail, so you must catch it or declare it too". Declaring it does NOT
throw anything by itself.

`throw` is the action: the line that **actually creates and throws** the exception
at that moment:

```java
public void withdraw(double amount) throws InsufficientBalanceException {
    if (amount > balance) {
        throw new InsufficientBalanceException("Insufficient balance"); // the throw
    }
    balance -= amount;
}
```

So: `throws` in the signature = "this method may throw it" (a contract),
`throw` in the body = "this exception is being thrown right now" (the event).

</details>

---

<details>
<summary>4. When would you create a custom exception?</summary>

When the built-in exceptions do not express your domain's failure well enough
and you want a **specific type** that callers can catch and react to differently.

Good signs you need one:

* The failure means something specific to your domain, e.g. `InsufficientBalanceException`
  vs a generic `RuntimeException`.
* Callers need to handle that failure distinctly, or carry extra info (like the
  current balance).
* You want it **checked** (recoverable, caller must deal with it) or **unchecked**
  (programming error, no need to force handling).

```java
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
```

Don't create one for rare cases — a custom exception is worth it when it actually
improves readability and error handling.

</details>