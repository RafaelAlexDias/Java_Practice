### 08 — Java Streams

Examples in `src/`:

* Stream basics -> `StreamBasics.java`
* Exercise: Stream basics -> `Ex_StreamBasics.java`
* Exercise: Stream basics 2 -> `Ex_StreamBasics2.java`
* Exercise: Employees pipeline -> `Ex_EmployeesStreamsChallenge.java`, `Ex_Employee/`

### Questions

<details>
<summary>1. What is a Stream in Java? And what is the difference between a
`Collection` and a `Stream`?</summary>

A Stream is a lazy sequence of elements that supports functional-style operations
written as a pipeline (`filter` → `map` → `collect`). It does NOT store data.

Differences:

* **Collection** — stores the data (it owns the elements). You add/remove items
  and iterate it many times.
* **Stream** — processes the data. It is **not a data structure**: it is
  **one-use-only** and **lazy** (intermediate operations only run when a terminal
  operation asks for results).

```java
List<String> list = List.of("a", "b");        // Collection: stores
list.stream()                                  // Stream: processes
        .map(String::toUpperCase)
        .toList();
```

</details>

---

<details>
<summary>2. What do `filter()`, `map()`, `sorted()`, `distinct()`, `limit()` and
`skip()` do?</summary>

* `filter(predicate)` — keeps only the elements that satisfy the condition.
* `map(function)` — transforms each element into something else (e.g. object → name).
* `sorted()` — sorts the elements (natural order, or with a `Comparator`).
* `distinct()` — removes duplicates (uses `equals()`).
* `limit(n)` — takes only the first n elements.
* `skip(n)` — discards the first n elements.

```java
numbers.stream()
       .filter(n -> n > 0)
       .map(n -> n * 2)
       .sorted()
       .distinct()
       .limit(5)
       .skip(1)
       .toList();
```

</details>

---

<details>
<summary>3. What is the difference between intermediate and terminal operations?
Give examples.</summary>

* **Intermediate** — return a new Stream, are **lazy** (do nothing until a terminal
  operation runs), and can be chained.
  Examples: `filter()`, `map()`, `sorted()`, `distinct()`, `limit()`, `skip()`.

* **Terminal** — **trigger** the pipeline, consume it, and produce a final result
  (a value, a list, a boolean, ...). After a terminal operation the stream is
  consumed.
  Examples: `toList()`, `collect()`, `forEach()`, `count()`, `reduce()`,
  `anyMatch()`.

```java
list.stream()
    .filter(...)   // intermediate: lazy
    .map(...)      // intermediate: lazy
    .toList();     // terminal: executes the pipeline, result = List
```

</details>

---

<details>
<summary>4. Explain step by step what this pipeline does:

```java
List<String> result = employees.stream()
        .filter(e -> e.getSalary() > 2000)
        .map(Employee::getName)
        .sorted()
        .toList();
```
</summary>

1. `employees.stream()` — opens a Stream over the employees collection.
2. `filter(e -> e.getSalary() > 2000)` — keeps **only employees whose salary is
   greater than 2000** (drops the others).
3. `map(Employee::getName)` — transforms each remaining Employee into its `name`;
   the stream becomes a Stream of Strings.
4. `sorted()` — sorts those names alphabetically (natural order).
5. `toList()` — **terminal** step: triggers everything and collects the sorted
   names into a `List<String>`.

Result: an alphabetically sorted list of the names of all employees earning more
than 2000.

</details>

---

<details>
<summary>5. What is the difference between `anyMatch()`, `allMatch()` and
`findFirst()`?</summary>

* `anyMatch(predicate)` — returns `true` if **at least one** element matches.
* `allMatch(predicate)` — returns `true` if **every** element matches.
* `findFirst()` — returns the **first** element as an `Optional` (may be empty);
  no condition is applied.

```java
boolean hasAnyHighPaid = employees.stream().anyMatch(e -> e.getSalary() > 5000);
boolean allAdults = employees.stream().allMatch(e -> e.getAge() >= 18);
Optional<Employee> first = employees.stream().findFirst();
```

`anyMatch`/`allMatch` are short-circuiting: they stop as soon as the answer is
known.

</details>

---

<details>
<summary>6. What is `reduce()` for? And what is the conceptual difference between
`reduce()` and `collect()`?</summary>

`reduce()` **combines all elements into a single value** through an associative,
repeated operation — e.g. sum, max, concatenation.

```java
int total = salaries.stream().reduce(0, Integer::sum);
```

Conceptual difference:

* **`reduce()`** — folds the stream into one immutable value; each step combines
  the accumulated result with the next element. No mutable container involved.
* **`collect()`** — accumulates results into a **mutable container** (a `List`,
  `Set`, `Map`, `StringBuilder`...), which is why it enables "group by" and other
  complex aggregations.

```java
Integer total = numbers.stream().reduce(0, Integer::sum);   // one immutable value
List<String> names = employees.stream()
                              .map(Employee::getName)
                              .collect(Collectors.toList()); // mutable container
```

</details>