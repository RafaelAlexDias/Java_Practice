public class conditionals {

    static void main () {
        int age = 22;

        if (age >= 18) {
            System.out.println("Adult!");
        } else {
            System.out.println("Minor!");
        }

        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Unknown");
        }
    }
}
