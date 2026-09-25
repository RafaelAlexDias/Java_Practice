### 01 — Java Fundamentals

Examples in `src/`:

* Variables and data types -> `Variables.java` (reference notes)
* Operators -> `Operators.java` (reference + runnable `main`)
* Conditionals -> `Conditionals.java` (runnable)
* Loops -> `Loops.java` (runnable)
* Methods -> `Methods.java` (reference notes)
* Exercise: Number Analyzer -> `Ex_NumberAnalyzer.java`
* Exercise: Array Analyzer -> `Ex_ArrayAnalyzer.java`

### Questions

<details>
<summary>1. What's the difference between `int`, `double`, `boolean`, `char` and `String`?
And which of these are primitive types?</summary>

* `int`    -> integer numbers (32-bit), e.g. `22`
* `double` -> decimal numbers (64-bit), e.g. `19.99`
* `boolean`-> logical value, `true` or `false`
* `char`   -> a single character (16-bit Unicode), e.g. `'A'`
* `String` -> a sequence of characters (text), e.g. `"Rafael"`

Primitive types: `int`, `double`, `boolean`, `char`.
`String` is NOT primitive — it is a reference type (a class).

</details>

---

<details>
<summary>2. What happens here? What is the output and why?

```java
int x = 10;
int y = 3;
System.out.println(x / y);
```
</summary>

Output: `3`.

Both operands are `int`, so Java performs **integer division**, which discards the
decimal part (`10 / 3 = 3`, remainder `1`). To get `3.333...` you would need at
least one operand to be a `double`:

```java
System.out.println(10 / 3);    // 3
System.out.println(10 / 3.0);  // 3.3333333333333335
```

</details>

---

<details>
<summary>3. What is the difference between `return` and `void`?</summary>

* `return` exits the method and **sends a value back** to whoever called it. The
  value must match the declared return type:

```java
public int add(int a, int b) {
    return a + b;   // returns an int to the caller
}
```

* `void` means the method **returns nothing**. It can still use a bare `return;`
  to exit early:

```java
public void printName(String name) {
    if (name == null) {
        return;     // exit early, no value
    }
    System.out.println(name);
}
```

Every method must declare what it returns: either a type (`int`, `String`, ...)
or `void` when there is no value to return.

</details>

---

<details>
<summary>4. What does `static` mean? Example: `public static void main(String[] args)`.
Why is `main` static?</summary>

`static` means the member **belongs to the class itself**, not to any instance.
You call it with the class name, without creating an object:

```java
Math.max(2, 3);   // Math is a class, max is a static method
```

`main` is `static` because the JVM needs an entry point **before any object
exists** — there is no instance to call the method on. It is:

* `public` — so the JVM can access it from outside
* `static` — so it can be called without an instance
* `void`  — it returns nothing (the program ends when it finishes)

</details>

---

<details>
<summary>5. What is the difference between `int[] numbers = new int[5];` and
`ArrayList<Integer>`?</summary>

|                       | `int[]`                            | `ArrayList<Integer>`                |
|-----------------------|------------------------------------|-------------------------------------|
| Size                  | Fixed at creation (`new int[5]`)   | Dynamic (grows/shrinks)             |
| Add/remove elements   | No (only change existing values)   | Yes (`add`, `remove`)               |
| Store types           | Primitives directly (`int`)        | Reference types only (must use `Integer`) |
| From the Collections API | No (core language feature)      | Yes (java.util)                     |
| Memory/performance    | Lightweight, faster                | More overhead (boxing + object)     |

Use an array for a fixed, known size; use `ArrayList` when the number of elements
changes at runtime.

</details>

---

<details>
<summary>6. What does this print?

```java
int number = 7;

if (number > 10) {
    System.out.println("A");
} else if (number > 5) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

And why does only one of the blocks run?</summary>

Output: `B`.

The conditions are evaluated **top-down** and the first one that is `true` wins:

* `number > 10`  -> `7 > 10` is `false`, skip
* `number > 5`   -> `7 > 5` is `true`, run this block ("B")

In an `if` / `else if` / `else` chain, at most **one** branch executes: once a
condition is `true` and its block runs, the remaining `else if` / `else` blocks
are skipped.

</details>