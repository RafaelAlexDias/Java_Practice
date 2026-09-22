import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Collections overview: List, Set, Map
 *
 * What: the Java Collections Framework provides ready-made implementations for
 *      grouping and storing objects.
 * Why: each implementation optimizes for a different guarantee (ordering,
 *      uniqueness, lookup speed) — pick the one that fits your need.
 * When:
 *  - List (ArrayList):   ordered, allows duplicates      -> keep insertion order
 *  - Set  (HashSet):     no duplicates, fast contains()  -> remove duplicates
 *  - Map  (HashMap):     key -> value lookup             -> get a value by unique key
 */
public class Collections {

    public static void main(String[] args) {

        // List: maintains insertion order and allows duplicates
        List<String> names = new ArrayList<>();
        names.add("Rafael");
        names.add("João");
        names.add("Rafael");
        System.out.println(names);

        // Set: ignores duplicates — the second "Rafael" is not stored
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Rafael");
        uniqueNames.add("João");
        uniqueNames.add("Rafael");
        System.out.println(uniqueNames);

        // Map: each entry has a unique key mapped to a value
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Rafael");
        students.put(2, "João");
        System.out.println(students);
    }
}