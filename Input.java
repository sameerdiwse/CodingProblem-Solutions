import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (sc.hasNextDouble()) {
            double number = sc.nextDouble();

            if (number < 0) {
                System.out.println("Square root is not defined for negative numbers.");
            } else {
                double result = Math.sqrt(number);
                System.out.printf("Square root of %.2f is %.4f%n", number, result);
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric value.");
        }

        sc.close();
    }
}
