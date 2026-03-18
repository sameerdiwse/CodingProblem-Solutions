import java.util.Optional;
import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Enum
enum VotingStatus {
    ELIGIBLE,
    NOT_ELIGIBLE
}

// Service
class VotingService {

    private static final int MIN_VOTING_AGE = 18;

    public static VotingStatus checkEligibility(int age) throws InvalidAgeException {
        validateAge(age);
        return age >= MIN_VOTING_AGE ? VotingStatus.ELIGIBLE : VotingStatus.NOT_ELIGIBLE;
    }

    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }
        if (age > 120) {
            throw new InvalidAgeException("Age seems unrealistic.");
        }
    }
}

// Utility for input
class InputUtil {

    public static Optional<Integer> readAge(Scanner sc) {
        System.out.print("Enter your age: ");
        return sc.hasNextInt() ? Optional.of(sc.nextInt()) : Optional.empty();
    }
}

// Main
public class Voting {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            Optional<Integer> ageOpt = InputUtil.readAge(sc);

            if (ageOpt.isEmpty()) {
                System.out.println("Invalid input. Please enter a valid number.");
                return;
            }

            VotingStatus status = VotingService.checkEligibility(ageOpt.get());

            printResult(status);

        } catch (InvalidAgeException e) {
            System.out.println("Business Exception: " + e.getMessage());
        } finally {
            System.out.println("Voting eligibility check completed.");
        }
    }

    private static void printResult(VotingStatus status) {
        String message = switch (status) {
            case ELIGIBLE -> "You are eligible to vote.";
            case NOT_ELIGIBLE -> "You are not eligible to vote yet.";
        };
        System.out.println(message);
    }
}
