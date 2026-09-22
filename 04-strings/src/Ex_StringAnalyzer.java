/**
 * Exercise: String Analyzer
 *
 * Play with common String methods — length(), toUpperCase(), contains() and
 * replace() — then join the same words with StringBuilder.
 * Note: methods like toUpperCase()/replace() return a NEW String (String is immutable).
 */
public class Ex_StringAnalyzer {

    public static void main(String[] args) {
        String text = "Java is awesome";

        System.out.println(text.length());
        System.out.println(text.toUpperCase());

        System.out.println(text.contains("Java"));

        System.out.println(text.replace("awesome", "powerful"));

        System.out.println();

        StringBuilder builder = new StringBuilder();

        builder.append("Java");
        builder.append("\n");
        builder.append("is");
        builder.append("\n");
        builder.append("awesome");

        System.out.println(builder.toString());
    }
}