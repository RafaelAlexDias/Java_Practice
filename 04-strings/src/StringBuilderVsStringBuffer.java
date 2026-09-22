/**
 * StringBuilder vs StringBuffer
 *
 * What: both are mutable character sequences used to build strings efficiently.
 * Why: they avoid creating a new String for every operation, which is what
 *      concatenation with + does.
 * When:
 *  - StringBuilder: single-threaded code (default choice, faster)
 *  - StringBuffer:  multi-threaded code that shares the builder (synchronized)
 *
 * Both produce identical strings — the difference is thread safety, not the API.
 */
public class StringBuilderVsStringBuffer {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(" ");
        builder.append("World");
        System.out.println("StringBuilder: " + builder);

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("World");
        System.out.println("StringBuffer:  " + buffer);
    }
}