import java.util.ArrayList;
import java.util.List;

/**
 * Exercise: List
 *
 * Play with an ArrayList: add, insert at an index, remove, search and count.
 * A List keeps insertion order and allows duplicates (e.g. "Rafael" appears twice).
 */
public class Ex_List {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Rafael");
        students.add("Diogo");
        students.add("Tiago");
        students.add("João");
        students.add("Dinis");
        System.out.println(students);

        // Insert at a specific index (duplicates are allowed)
        students.add(0, "Rafael");
        System.out.println(students);

        // remove("Rafael") removes only the FIRST occurrence
        students.remove("Rafael");
        System.out.println(students);

        System.out.println(students.contains("Raquel")); // false
        System.out.println(students.contains("Dinis"));  // true
        System.out.println(students.size());
    }
}