import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Exercise: File Reader (checked exception)
 *
 * Read the first line of "data.txt". If the file does not exist, a checked
 * FileNotFoundException is thrown — so the code MUST catch it (or declare throws).
 * Running it without data.txt prints "File not found!".
 *
 * Note: a Scanner reading a file should be closed in a finally block or, better,
 * use try-with-resources — otherwise the file handle can leak when an exception occurs.
 */
public class Ex_FileReader {

    public static void main(String[] args) {

        try {
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);

            System.out.println(scanner.nextLine());

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}