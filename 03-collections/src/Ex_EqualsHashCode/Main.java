package Ex_EqualsHashCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Exercise: equals() and hashCode()
 *
 * == compares REFERENCES, equals() compares CONTENT.
 * Hash-based collections (HashSet/HashMap) use hashCode() first, then equals():
 * if both are implemented based on the same fields, two Students with the same
 * name and age are treated as the SAME element.
 */
public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Rafael", 22);
        Student student2 = new Student("Rafael", 22);
        Student student3 = new Student("João", 21);

        System.out.println(student1 == student2);       // false: different references
        System.out.println(student1.equals(student2));  // true: same name and age
        System.out.println(student1.equals(student3));  // false: different name

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2); // same content as student1 -> not added
        students.add(student3);

        System.out.println(students.size()); // 2
    }
}