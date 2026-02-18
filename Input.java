import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double number = 0;

        while (true) {
            System.out.print("Enter a non-negative number (or type -1 to exit): ");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                sc.next(); // clear invalid input
                continue;
            }

            number = sc.nextDouble();

            if (number == -1) {
                System.out.println("Exiting program. Goodbye.");
                break;
            }

            if (number < 0) {
                System.out.println("Square root is not defined for negative numbers.");
                continue;
            }

            double result = Math.sqrt(number);
            System.out.printf("Square root of %.2f is %.4f%n", number, result);
        }

        sc.close();
    }
}
