### 03 — Collections

Examples in `src/`:

* Collections overview (List / Set / Map) -> `Collections.java`
* Exercise: List -> `Ex_List.java`
* Exercise: Set -> `Ex_Set.java`
* Exercise: Map -> `Ex_Map.java`
* Exercise: equals() & hashCode() -> `Ex_EqualsHashCode/`

### Questions

<details>
<summary>1. Explain the difference between `List`, `Set` and `Map`, and give an
example of when you would use each one.</summary>

* **List** — an ordered collection that **allows duplicates**. Insertion order is
  kept and you access elements by index.
  Example: a list of students in the order they enrolled.

* **Set** — a collection with **no duplicates**. Best when you only care about
  "does this exist?" and want each element only once.
  Example: the set of unique emails subscribed to a newsletter.

* **Map** — stores **key → value** pairs. Each key is unique and is used to look
  up its value quickly.
  Example: student ID → student object, or country → capital.

```java
List<String> students = new ArrayList<>();   // ordered, duplicates allowed
Set<String>  emails    = new HashSet<>();     // no duplicates
Map<Integer, String> map = new HashMap<>();   // key -> value
```

</details>

---

<details>
<summary>2. What is the difference between `ArrayList` and `LinkedList`?</summary>

* **ArrayList** — backed by an array. Fast **random access** (`get(index)` is O(1))
  and very fast when adding at the **end**. Inserting/removing in the **middle** is
  slow because elements have to shift.

* **LinkedList** — elements are connected by references (nodes). Fast at
  **inserting/removing at the beginning or middle** (just rewire the links), but
  slower for random access (`get(index)` walks the list).

Rule of thumb: use `ArrayList` almost always — the small extra cost of middle
insertions rarely matters, and access by index is fast.

</details>

---

<details>
<summary>3. What is the difference between `HashSet` and `TreeSet`?</summary>

* **HashSet** — uses hashing (`hashCode()`/`equals()`). Very fast `add`/`contains`
  (roughly O(1)), but **no ordering guarantee** — iteration order is unpredictable.

* **TreeSet** — keeps elements **sorted** (uses `Comparable` or a `Comparator`).
  Operations are O(log n), slower than HashSet, but iteration comes back in sorted
  order.

```java
Set<String> hash = new HashSet<>();  // fast, unordered
Set<String> tree = new TreeSet<>();  // sorted, slower
```

Use `TreeSet` only when you actually need the elements in sorted order.

</details>

---

<details>
<summary>4. What is the difference between `HashMap` and `TreeMap`?</summary>

The same idea as HashSet vs TreeSet, but for key-value pairs:

* **HashMap** — hashed keys, O(1) `put`/`get` in the common case, keys are **not
  ordered**.
* **TreeMap** — keys are kept **sorted**, O(log n) operations, supports range
  operations (`firstKey()`, `subMap()`, ...).

```java
Map<String, Integer> hash = new HashMap<>();  // fast, unordered
Map<String, Integer> tree = new TreeMap<>();  // keys sorted
```

Use `HashMap` by default; use `TreeMap` when you need to iterate keys in order or
query ranges.

</details>

---

<details>
<summary>5. Explain the relationship between `equals()` and `hashCode()`, and why it
matters when an object is used in a `HashSet` or as a key in a `HashMap`.</summary>

Hash-based collections work in two steps:

1. Call `hashCode()` on the object → that decides **which bucket** to look in.
2. If the bucket already has elements, call `equals()` to compare the object with
   what is already there.

The **contract**: if two objects are `equals()`, they **must** have the same
`hashCode()`. If that is broken, two equal objects land in different buckets and
the collection can't see they are the same — so a `HashSet` would store them as
duplicates and a `HashMap` would create two entries for what should be one key.

```java
class Student {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        // same class + same name + same age
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);  // consistent with equals()
    }
}
```

That is why `equals()` and `hashCode()` must be implemented together, based on the
same fields.

</details>