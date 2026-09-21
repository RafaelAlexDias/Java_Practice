public class Ex_ArrayAnalyzer {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 25, 4, 18, 9, 30};

        printAll(numbers);
        System.out.println("---");
        System.out.println("Sum: " + sumAll(numbers));
        System.out.println("Average: " + averageAll(numbers));
        System.out.println("Max: " + maxNum(numbers));
        System.out.println("Even numbers: " + countEvenNumbers(numbers));
    }

    public static void printAll(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static int sumAll(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static double averageAll(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum/numbers.length;
    }

    public static int maxNum(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int countEvenNumbers(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count ++;
            }
        }
        return count;
    }
}
