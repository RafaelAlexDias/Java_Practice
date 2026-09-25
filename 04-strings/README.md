### 04 — Strings

Examples in `src/`:

* String immutability (what / why / when) -> `StringsAreImmutable.java`
* StringBuilder vs StringBuffer -> `StringBuilderVsStringBuffer.java`
* Exercise: StringBuilder -> `Ex_StringBuilder.java`
* Exercise: String Analyzer -> `Ex_StringAnalyzer.java`

### Questions

<details>
<summary>1. Why is `String` immutable in Java?</summary>

Mainly for three reasons:

* **Security** — Strings are used for URLs, file paths, database credentials, etc.
  If a String could change, data validated in one place could be modified later
  without anyone noticing.
* **String pool** — Java reuses the same object for equal String literals, which
  saves memory. That only works safely if Strings never change.
* **Thread-safety** — because a String can't be modified, many threads can share
  the same instance without any synchronization.

Whenever you need to *build/modify* text repeatedly, use `StringBuilder` instead
of creating lots of intermediate Strings.

</details>

---

<details>
<summary>2. What is the difference between `String`, `StringBuilder` and
`StringBuffer`? Which one would you normally use to build a String through many
operations?</summary>

* **String** — **immutable**. Every "change" creates a new object. Concatenating
  with `+` in a loop creates a new String every iteration (slow, wasteful).

* **StringBuilder** — **mutable**, not synchronized. Fast for building text in a
  loop. **This is the one to use by default** for many operations.

* **StringBuffer** — **mutable and synchronized** (thread-safe), but slower
  because every method has a synchronization overhead.

```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 10; i++) {
    sb.append(i);
}
String result = sb.toString();
```

Use `StringBuilder`; use `StringBuffer` only if the builder is shared between
threads (rare).

</details>

---

<details>
<summary>3. What is the difference between `==` and `.equals()` when comparing
objects? Pay special attention to `String`.</summary>

* `==` compares **references** — it asks "are these the same object in memory?"
* `.equals()` compares **content** — it asks "do these two objects represent the
  same value?"

`String` overrides `equals()` to compare character by character, so:

```java
String a = new String("Java");
String b = new String("Java");

a == b;            // false  -> two different objects
a.equals(b);       // true   -> same content
```

Careful: `String` literals are **interned** (reused), so `"Java" == "Java"` is
often `true` by accident with literals. Never rely on it — always use `.equals()`
for content comparison, especially for user input.

</details>