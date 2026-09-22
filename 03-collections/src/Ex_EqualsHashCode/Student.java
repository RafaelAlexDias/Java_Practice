package Ex_EqualsHashCode;

import java.util.Objects;

/**
 * Student implements equals() and hashCode() so hash-based collections
 * (HashSet/HashMap) compare by content instead of by reference.
 *
 * Contract: if two objects are equal, they MUST have the same hashCode,
 * otherwise HashMap/HashSet behave incorrectly.
 */
public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {

        // Same reference -> equal (fast path)
        if (this == obj) {
            return true;
        }

        // Different type (or null) -> not equal
        if (!(obj instanceof Student)) {
            return false;
        }

        // Compare field by field
        Student other = (Student) obj;

        return age == other.age &&
                Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        // Must be consistent with equals: same fields -> same hash
        return Objects.hash(name, age);
    }
}