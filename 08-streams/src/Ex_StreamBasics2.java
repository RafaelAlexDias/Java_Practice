import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Exercise: Stream basics 2
 *
 * Use terminal and short-circuit operations: count, anyMatch, allMatch, findFirst,
 * and groupBy names by their first letter.
 */
public class Ex_StreamBasics2 {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10, 5, 8, 20, 3, 8, 15, 2);


        // 1. Count even numbers

        long evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();

        System.out.println("Even numbers: " + evenNumbers);


        // 2. Check if any number is greater than 18

        boolean hasNumberGreaterThan18 = numbers.stream()
                .anyMatch(number -> number > 18);

        System.out.println(
                "Number greater than 18: " + hasNumberGreaterThan18
        );


        // 3. Check if all numbers are positive

        boolean allPositive = numbers.stream()
                .allMatch(number -> number > 0);

        System.out.println(
                "All numbers are positive: " + allPositive
        );


        // 4. Find the first number

        Optional<Integer> firstNumber = numbers.stream()
                .findFirst();

        firstNumber.ifPresent(number ->
                System.out.println("First number: " + number)
        );


        // 5. Find the first even number greater than 10

        Optional<Integer> firstEvenGreaterThan10 = numbers.stream()
                .filter(number -> number % 2 == 0)
                .filter(number -> number > 10)
                .findFirst();

        firstEvenGreaterThan10.ifPresent(number ->
                System.out.println(
                        "First even number greater than 10: " + number
                )
        );


        // 6. Group names by first letter

        List<String> names = List.of(
                "Rafael",
                "João",
                "Maria",
                "Rui",
                "Ana",
                "Miguel",
                "André"
        );

        Map<Character, List<String>> groupedNames =
                names.stream()
                        .collect(
                                Collectors.groupingBy(
                                        name -> name.charAt(0)
                                )
                        );

        System.out.println("Grouped names: " + groupedNames);
    }
}