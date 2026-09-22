/**
 * Exercise: StringBuilder
 *
 * Build a small student profile using StringBuilder and print it.
 * StringBuilder avoids creating a new String for every append.
 */
public class Ex_StringBuilder {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: Rafael \n");
        builder.append("Age: 22 \n");
        builder.append("Course: Computer Engineering \n");

        System.out.println(builder);
    }
}