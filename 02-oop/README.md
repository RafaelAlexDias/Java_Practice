### 02 — Object-Oriented Programming

Examples in `src/`:

* Classes and Objects -> `ClassesAndObjects.java`
* Constructors and `this` -> `Constructors.java`
* Encapsulation -> `Encapsulation.java` + exercise `Ex_Encapsulation/`
* Inheritance -> `Inheritance.java` + exercise `Ex_Inheritance/`
* Polymorphism -> exercise `Ex_Polymorphism/`
* Abstract classes -> exercise `Ex_AbstractClasses/`
* Interfaces -> exercise `Ex_Interfaces/`
* Composition -> exercise `Ex_Composition/`

### Questions

<details>
<summary>1. Can you explain the four pillars of object-oriented programming?</summary>

**Encapsulation** — I keep the data private and expose it through public methods.
Nobody can directly set a field to a bad value; they go through my methods, which
can validate. It hides how the object works on the inside.

**Inheritance** — a class can take everything from another class (its fields and
methods) and add or change stuff on top. It's an "is-a" relationship: a `Dog` is
an `Animal`. It helps reuse code, but it also couples classes together.

**Polymorphism** — the same type can behave differently depending on the actual
object behind it. If I hold an `Animal` reference, calling `makeSound()` runs the
Dog's version or the Cat's version based on what object I actually created. The
code does not need to know the concrete class.

**Abstraction** — I hide the implementation details and only expose what is
essential. An abstract class or interface defines WHAT to do (`makeSound()`), and
each concrete class decides HOW. The caller works with the abstract type and does
not care about the internals.

</details>

---

<details>
<summary>2. What is the difference between `extends` and `implements`?</summary>

* `extends` is for **classes** (Inheritance). A class can extend **one** superclass
  and it "inherits" that superclass's code.

```java
class Dog extends Animal { ... }
```

* `implements` is for **interfaces** (a contract). A class implements one or many
  interfaces and **must provide** the bodies of all its methods.

```java
class Dog implements Walkable, Runnable { ... }
```

Short version: `extends` = "I inherit from this class", `implements` =
"I promise to follow this contract".

</details>

---

<details>
<summary>3. What is the difference between an `abstract class Animal` and an
`interface Animal`? When would you choose one over the other?</summary>

**Abstract class**
* Can hold state (fields) and concrete methods with bodies
* One class can extend only ONE abstract class
* Use it when the classes share **both behaviour and state** (e.g. all `Animal`s
  have a `name` and an `eat()` implementation)

**Interface**
* Is a contract: normally only method signatures (plus `default` methods, Java 8+)
* A class can implement MANY interfaces
* Use it when different, unrelated classes just need to share a **capability**
  (e.g. a `Bird` and a `Drone` both `Flyable`)

Rule of thumb: "can fly / can save / can pay" (`implements Flyable`) versus
"is a type of X with shared state" (`extends Animal`).

</details>

---

<details>
<summary>4. What is `Animal animal = new Dog();` and why is it important for
polymorphism?</summary>

The *variable type* is `Animal` but the *actual object* is a `Dog`. That is an
"upcast" — a Dog IS an Animal, so the assignment is legal.

It matters because of **dynamic dispatch**: when I call `animal.makeSound()`, Java
does not look at the variable type — it looks at the real object at runtime and
runs the Dog's implementation.

```java
Animal animal = new Dog();
animal.makeSound();   // runs Dog's makeSound() at runtime
```

That lets me write one piece of code against the abstract type and have it work
for every subclass (e.g. one loop over an `Animal[]` calling `makeSound()`).

</details>

---

<details>
<summary>5. What is the difference between Inheritance and Composition? Use
`Dog → Animal` and `Car → Engine`.</summary>

**Inheritance** — "is-a" relationship. `Dog` **is** an `Animal`:

```java
class Dog extends Animal { ... }
```

The Dog reuses what Animal already has. Tight coupling: if `Animal` changes,
every subclass can be affected.

**Composition** — "has-a" relationship. A `Car` **has** an `Engine`:

```java
class Car {
    private Engine engine;
    public Car(Engine engine) { this.engine = engine; }
}
```

The Car delegates to / collaborates with the Engine. Loose coupling: I can swap
the engine (or give it a mock in tests) without touching the Car.

Rule of thumb: prefer **composition** ("has-a") unless there's a real "is-a"
relationship with shared behaviour — it keeps classes more flexible and easier
to test and change.

</details>