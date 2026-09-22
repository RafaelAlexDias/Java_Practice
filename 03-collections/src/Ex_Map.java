import java.util.HashMap;
import java.util.Map;

/**
 * Exercise: Map
 *
 * Play with a HashMap: put, get, containsKey, replace, remove and size.
 * A Map stores key-value pairs; put() with an existing key UPDATES the value.
 */
public class Ex_Map {

    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Rafael", 17);
        studentGrades.put("João", 14);
        studentGrades.put("Maria", 19);
        studentGrades.put("Diogo", 12);
        studentGrades.put("Ana", 16);

        System.out.println(studentGrades);

        System.out.println(studentGrades.get("Rafael"));            // 17
        System.out.println(studentGrades.containsKey("Maria"));     // true
        System.out.println(studentGrades.containsKey("Pedro"));     // false

        System.out.println(studentGrades.replace("João", 15));      // returns the old value (14)
        studentGrades.remove("Diogo");
        System.out.println(studentGrades.size());

        studentGrades.put("Rafael", 19); // updates Rafael's grade, does NOT add another entry
        System.out.println(studentGrades);
    }
}