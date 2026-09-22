/**
 * String immutability
 *
 * What: a String cannot be changed after it is created — every "modification"
 *      produces a NEW String object.
 * Why: security (URLs, paths, credentials), the String pool can reuse equal
 *      literals, and Strings can be safely shared between threads.
 * When: any time you need to build/change text repeatedly, prefer
 *      StringBuilder/StringBuffer over concatenation with +.
 */
public class StringsAreImmutable {

    public static void main(String[] args) {
        // This looks like an update...
        String name = "Rafael";
        name = name + " Dias";
        // ...but it is not. The original "Rafael" object is untouched; a new
        // "Rafael Dias" object was created and the reference `name` was pointed to it.

        String text = "Hello";
        text.toUpperCase();
        // toUpperCase() returns a NEW String. Since we ignore the return value,
        // `text` stays "Hello" — nothing was modified.

        /*
         * Why are Strings immutable?
         *
         * Security: Strings are used for URLs, paths and credentials; a mutable
         * String could be changed unexpectedly after validation.
         *
         * String pool: Java can reuse references to equal String literals,
         * which saves memory.
         *
         * Thread-safety: since a String cannot change after creation, multiple
         * threads can share it without worrying about another thread modifying it.
         */

        // Building a String gradually with + creates many intermediate objects
        // (imagine this loop with 1000 iterations).
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += i;
        }

        // StringBuilder/StringBuffer are mutable -> no intermediates.
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(" ");
        builder.append("Rafael");

        System.out.println(builder.toString());

        /*
         * StringBuilder vs StringBuffer
         *
         * StringBuilder -> Not synchronized (faster; use it by default)
         * StringBuffer  -> Synchronized (thread-safe but slower)
         *
         * Use StringBuilder unless you really need thread safety.
         */
    }
}