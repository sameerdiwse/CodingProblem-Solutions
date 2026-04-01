import java.util.Optional;
import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Enum
enum VotingStatus {
    ELIGIBLE,
    NOT_ELIGIBLE;

    public String message() {
        return switch (this) {
            case ELIGIBLE -> "You are eligible to vote.";
            case NOT_ELIGIBLE -> "You are not eligible to vote yet.";
        };
    }
}

// Service
class VotingService {

    private static final int MIN_VOTING_AGE = 18;

    public static VotingStatus checkEligibility(int age) {
        validateAge(age);
        return age >= MIN_VOTING_AGE ? VotingStatus.ELIGIBLE : VotingStatus.NOT_ELIGIBLE;
    }

    private static void validateAge(int age) {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }
        if (age > 120) {
            throw new InvalidAgeException("Age seems unrealistic.");
        }
    }
}

// Utility
class InputUtil {

    public static Optional<Integer> readAge(Scanner sc) {
        System.out.print("Enter your age: ");
        if (sc.hasNextInt()) {
            return Optional.of(sc.nextInt());
        }
        sc.next(); // consume invalid input
        return Optional.empty();
    }
}

// Main
public class Voting {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            Optional<Integer> ageOpt;

            // Retry until valid input
            do {
                ageOpt = InputUtil.readAge(sc);
                if (ageOpt.isEmpty()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            } while (ageOpt.isEmpty());

            VotingStatus status = VotingService.checkEligibility(ageOpt.orElseThrow());

            System.out.println(status.message());

        } catch (InvalidAgeException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            System.out.println("Voting eligibility check completed.");
        }
    }
}
