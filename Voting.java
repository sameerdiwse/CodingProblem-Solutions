import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Enum for eligibility
enum VotingStatus {
    ELIGIBLE,
    NOT_ELIGIBLE
}

// Service class
class VotingService {

    private static final int MIN_VOTING_AGE = 18;

    public static VotingStatus checkEligibility(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }
        return age >= MIN_VOTING_AGE 
                ? VotingStatus.ELIGIBLE 
                : VotingStatus.NOT_ELIGIBLE;
    }
}

public class Voting {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter your age: ");

            if (!sc.hasNextInt()) {
                throw new IllegalArgumentException("Invalid input. Please enter a number.");
            }

            int age = sc.nextInt();

            VotingStatus status = VotingService.checkEligibility(age);

            System.out.println(
                status == VotingStatus.ELIGIBLE
                        ? "You are eligible to vote."
                        : "You are not eligible to vote yet."
            );

        } catch (InvalidAgeException e) {
            System.out.println("Business Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Voting eligibility check completed.");
        }
    }
}
