import java.util.HashSet;
import java.util.Set;

/**
 * Exercise: Set
 *
 * Play with a HashSet: add, contains, remove and size.
 * A Set stores each element exactly once, and HashSet makes no order guarantees.
 */
public class Ex_Set {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Rafael");
        names.add("João");
        names.add("Maria");
        names.add("Rafael"); // ignored: already present
        names.add("Pedro");
        names.add("João"); // ignored: already present
        names.add("Ana");
        System.out.println(names);

        System.out.println(names.contains("Maria"));  // true
        System.out.println(names.contains("Carlos")); // false

        names.remove("Pedro");
        System.out.println(names.size());

        names.add("Ana"); // ignored: already present
        System.out.println(names);
    }
}