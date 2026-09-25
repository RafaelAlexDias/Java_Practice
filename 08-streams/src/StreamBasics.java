import java.util.List;

/**
 * Stream basics
 *
 * What: a Stream is a lazy sequence of elements that supports functional-style
 * operations (filter, map, sorted, collect).
 * Why: readable, concise pipelines over collections instead of manual loops.
 * When: transforming or querying data in one go.
 */
public class StreamBasics {

    public static void main(String[] args) {

        /*
        * Stream is not a collection. It is a sequence of elements that supports functional-style operations.
         */

        List<String> names = List.of(
                "Rafael",
                "João",
                "Maria"
        );

        /*
        * A pipeline is a sequence of operations that are applied to a stream of elements. Each operation in the
        * pipeline is a function that takes a stream as input and produces a new stream as output. The operations in a
        * pipeline are executed in order, and the final result is the output of the last operation.
        *
        * filter() -> Keeps only elements that satisfy a given condition.
        *
        * map() -> Used to transform each element in the stream.
        *
        * sorted() -> Sorts the elements in the stream. We can give it a Comparator to specify the sorting order.
        *
        * distinct() -> Removes duplicate elements from the stream.
        *
        * limit() -> Limits the number of elements in the stream.
        *
        * skip() -> Skips the first n elements in the stream.
        *
        * forEach() -> Performs an action for each element in the stream.
        *
        * count() -> Returns the number of elements in the stream.
        *
        * anyMatch() -> Returns true if any element in the stream satisfies a given condition.
        *
        * allMatch() -> Returns true if all elements in the stream satisfy a given condition.
        *
        * findFirst() -> Returns the first element in the stream that satisfies a given condition.
        *
        * findAny() -> Returns any element in the stream that satisfies a given condition.
        *
        * collect() -> Collects the elements in the stream into a collection.
        *
        * groupingBy() -> Groups the elements in the stream based on a given function.
        *
        * reduce() -> Combines various elements into one result.
        *
        *
        */

        List<String> result = names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);
    }
}
