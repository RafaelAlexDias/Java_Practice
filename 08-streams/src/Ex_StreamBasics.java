import java.util.List;

/**
 * Exercise: Stream basics
 *
 * Apply the basic intermediate operations to a list of numbers:
 * filter (even, greater than 10), map (times 2), sorted, distinct, limit and skip,
 * and finish with forEach.
 */
public class Ex_StreamBasics {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10, 5, 8, 20, 3, 8, 15, 2);

        // 1. Even numbers
        System.out.println(
                numbers.stream()
                        .filter(number -> number % 2 == 0)
                        .toList()
        );

        // 2. Numbers greater than 10
        System.out.println(
                numbers.stream()
                        .filter(number -> number > 10)
                        .toList()
        );

        // 3. Numbers multiplied by 2
        System.out.println(
                numbers.stream()
                        .map(number -> number * 2)
                        .toList()
        );

        // 4. Sorted numbers
        System.out.println(
                numbers.stream()
                        .sorted()
                        .toList()
        );

        // 5. Remove duplicates
        System.out.println(
                numbers.stream()
                        .distinct()
                        .toList()
        );

        // 6. First 3 numbers
        System.out.println(
                numbers.stream()
                        .limit(3)
                        .toList()
        );

        // 7. Print all numbers
        numbers.stream()
                .forEach(System.out::println);
    }
}