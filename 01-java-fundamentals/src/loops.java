public class Loops {

    public static void main(String[] args) {
        // for: when you know how many iterations you need
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while: while a condition holds (may run zero times)
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        // do-while: always runs at least once
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 3);

        // for-each: clean way to iterate arrays/collections
        int[] numbers = {1, 2, 3};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
