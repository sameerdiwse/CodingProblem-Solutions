import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Voting {

    private static final int MIN_VOTING_AGE = 18;

    // Business logic method
    public static void validateVotingEligibility(int age) throws InvalidAgeException {

        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }

        if (age < MIN_VOTING_AGE) {
            throw new InvalidAgeException(
                "You are not eligible to vote. Minimum voting age is " + MIN_VOTING_AGE
            );
        }

        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            validateVotingEligibility(age);

        } 
        catch (InvalidAgeException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } 
        finally {
            sc.close();
            System.out.println("Voting eligibility check completed.");
        }

        System.out.println("Program finished successfully.");
    }
}
